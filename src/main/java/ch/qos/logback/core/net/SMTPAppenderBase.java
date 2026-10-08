package ch.qos.logback.core.net;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.helpers.CyclicBuffer;
import ch.qos.logback.core.pattern.PatternLayoutBase;
import ch.qos.logback.core.sift.DefaultDiscriminator;
import ch.qos.logback.core.sift.Discriminator;
import ch.qos.logback.core.spi.CyclicBufferTracker;
import ch.qos.logback.core.util.ContentTypeUtil;
import ch.qos.logback.core.util.JNDIUtil;
import ch.qos.logback.core.util.OptionHelper;
import jakarta.mail.Address;
import jakarta.mail.Authenticator;
import jakarta.mail.BodyPart;
import jakarta.mail.Message;
import jakarta.mail.Multipart;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Future;

public abstract class SMTPAppenderBase extends AppenderBase {
    static InternetAddress[] EMPTY_IA_ARRAY = new InternetAddress[0];
    static final long MAX_DELAY_BETWEEN_STATUS_MESSAGES = 1228800000L;

    long lastTrackerStatusPrint = 0L;
    long delayBetweenStatusMessages = 300000L;
    protected Layout subjectLayout;
    protected Layout layout;
    private List toPatternLayoutList = new ArrayList();
    private String from;
    private String subjectStr;
    private String smtpHost;
    private int smtpPort = 25;
    private boolean starttls = false;
    private boolean ssl = false;
    private boolean sessionViaJNDI = false;
    private String jndiLocation = "java:comp/env/mail/Session";
    String username;
    String password;
    String localhost;
    boolean asynchronousSending = true;
    protected Future asynchronousSendingFuture;
    private String charsetEncoding = "UTF-8";
    protected Session session;
    protected EventEvaluator eventEvaluator;
    protected Discriminator discriminator = new DefaultDiscriminator();
    protected CyclicBufferTracker cbTracker;
    private int errorCount = 0;

    private Session lookupSessionInJNDI() {
        addInfo("Looking up javax.mail.Session at JNDI location [" + this.jndiLocation + "]");
        try {
            return (Session)JNDIUtil.lookupObject(JNDIUtil.getInitialContext(), this.jndiLocation);
        } catch (Exception e) {
            addError("Failed to obtain javax.mail.Session from JNDI location [" + this.jndiLocation + "]", e);
            return null;
        }
    }

    private Session buildSessionFromProperties() {
        Properties props = new Properties(OptionHelper.getSystemProperties());
        if (this.smtpHost != null) props.put("mail.smtp.host", this.smtpHost);
        props.put("mail.smtp.port", Integer.toString(this.smtpPort));
        if (this.localhost != null) props.put("mail.smtp.localhost", this.localhost);

        Authenticator authenticator = null;
        if (!OptionHelper.isNullOrEmptyOrAllSpaces(this.username)) {
            authenticator = new LoginAuthenticator(this.username, this.password);
            props.put("mail.smtp.auth", "true");
        }
        if (isSTARTTLS() && isSSL()) {
            addError("Both SSL and StartTLS cannot be enabled simultaneously");
        } else {
            if (isSTARTTLS()) {
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.transport.protocol", "true");
            }
            if (isSSL()) props.put("mail.smtp.ssl.enable", "true");
        }
        return Session.getInstance(props, authenticator);
    }

    private List parseAddress(Object event) {
        List<InternetAddress> destinationAddressList = new ArrayList<InternetAddress>();
        int len = this.toPatternLayoutList.size();
        for (int i = 0; i < len; i++) {
            try {
                String email = ((PatternLayoutBase)this.toPatternLayoutList.get(i)).doLayout(event);
                if (email == null || email.length() == 0) continue;
                destinationAddressList.addAll(Arrays.asList(InternetAddress.parse(email, true)));
            } catch (AddressException e) {
                addError("Could not parse email address for [" + this.toPatternLayoutList.get(i) + "] for event [" + event + "]", e);
                return destinationAddressList;
            }
        }
        return destinationAddressList;
    }

    public abstract Layout makeSubjectLayout(String subjectStr);

    @Override
    public void start() {
        if (this.cbTracker == null) this.cbTracker = new CyclicBufferTracker();
        this.session = this.sessionViaJNDI ? lookupSessionInJNDI() : buildSessionFromProperties();
        if (this.session == null) {
            addError("Failed to obtain javax.mail.Session. Cannot start.");
            return;
        }
        this.subjectLayout = makeSubjectLayout(this.subjectStr);
        this.started = true;
    }

    @Override
    public void append(Object eventObject) {
        if (!checkEntryConditions()) return;
        String discriminatingValue = this.discriminator.getDiscriminatingValue(eventObject);
        long timestamp = System.currentTimeMillis();
        CyclicBuffer cb = (CyclicBuffer)this.cbTracker.getOrCreate(discriminatingValue, timestamp);
        subAppend(cb, eventObject);
        try {
            if (this.eventEvaluator.evaluate(eventObject)) {
                CyclicBuffer cbClone = new CyclicBuffer(cb);
                cb.clear();
                if (this.asynchronousSending) {
                    SenderRunnable senderRunnable = new SenderRunnable(cbClone, eventObject);
                    this.asynchronousSendingFuture = this.context.getExecutorService().submit(senderRunnable);
                } else {
                    sendBuffer(cbClone, eventObject);
                }
            }
        } catch (EvaluationException e) {
            if (++this.errorCount < 4) addError("SMTPAppender's EventEvaluator threw an Exception-", e);
        }
        if (eventMarksEndOfLife(eventObject)) this.cbTracker.endOfLife(discriminatingValue);
        this.cbTracker.removeStaleComponents(timestamp);
        if (this.lastTrackerStatusPrint + this.delayBetweenStatusMessages < timestamp) {
            addInfo("SMTPAppender [" + this.name + "] is tracking [" + this.cbTracker.getComponentCount() + "] buffers");
            this.lastTrackerStatusPrint = timestamp;
            if (this.delayBetweenStatusMessages < MAX_DELAY_BETWEEN_STATUS_MESSAGES) this.delayBetweenStatusMessages *= 4L;
        }
    }

    public abstract boolean eventMarksEndOfLife(Object eventObject);

    public abstract void subAppend(CyclicBuffer cb, Object eventObject);

    public boolean checkEntryConditions() {
        if (!this.started) {
            addError("Attempting to append to a non-started appender: " + getName());
            return false;
        }
        if (this.eventEvaluator == null) {
            addError("No EventEvaluator is set for appender [" + this.name + "].");
            return false;
        }
        if (this.layout == null) {
            addError("No layout set for appender named [" + this.name + "]. For more information, please visit http://logback.qos.ch/codes.html#smtp_no_layout");
            return false;
        }
        return true;
    }

    @Override
    public synchronized void stop() {
        this.started = false;
    }

    public InternetAddress getAddress(String addressStr) {
        try {
            return new InternetAddress(addressStr);
        } catch (AddressException e) {
            addError("Could not parse address [" + addressStr + "].", e);
            return null;
        }
    }

    public List getToList() {
        return this.toPatternLayoutList;
    }

    public void updateMimeMsg(MimeMessage mimeMessage, CyclicBuffer cyclicBuffer, Object eventObject) {
    }

    public void sendBuffer(CyclicBuffer cb, Object lastEventObject) {
        try {
            MimeBodyPart part = new MimeBodyPart();
            StringBuffer sbuf = new StringBuffer();
            String header = this.layout.getFileHeader();
            if (header != null) sbuf.append(header);
            header = this.layout.getPresentationHeader();
            if (header != null) sbuf.append(header);
            fillBuffer(cb, sbuf);
            String footer = this.layout.getPresentationFooter();
            if (footer != null) sbuf.append(footer);
            footer = this.layout.getFileFooter();
            if (footer != null) sbuf.append(footer);

            String subject = "Undefined subject";
            if (this.subjectLayout != null) {
                String tmp = this.subjectLayout.doLayout(lastEventObject);
                if (tmp != null) {
                    int newLinePos = tmp.indexOf('\n');
                    subject = newLinePos > -1 ? tmp.substring(0, newLinePos) : tmp;
                }
            }

            MimeMessage mimeMsg = new MimeMessage(this.session);
            if (this.from != null) mimeMsg.setFrom((Address)getAddress(this.from));
            else mimeMsg.setFrom();
            mimeMsg.setSubject(subject, this.charsetEncoding);

            List destinationAddresses = parseAddress(lastEventObject);
            if (destinationAddresses.isEmpty()) {
                addInfo("Empty destination address. Aborting email transmission");
                return;
            }
            Address[] destinationAddressArray = (Address[])destinationAddresses.toArray(EMPTY_IA_ARRAY);
            mimeMsg.setRecipients(Message.RecipientType.TO, destinationAddressArray);

            String contentType = this.layout.getContentType();
            if (ContentTypeUtil.isTextual(contentType)) {
                part.setText(sbuf.toString(), this.charsetEncoding, ContentTypeUtil.getSubType(contentType));
            } else {
                part.setContent(sbuf.toString(), contentType);
            }
            Multipart mp = new MimeMultipart();
            mp.addBodyPart((BodyPart)part);
            mimeMsg.setContent(mp);
            updateMimeMsg(mimeMsg, cb, lastEventObject);
            mimeMsg.setSentDate(new Date());
            addInfo("About to send out SMTP message \"" + subject + "\" to " + Arrays.toString(destinationAddressArray));
            Transport.send((Message)mimeMsg);
        } catch (Exception e) {
            addError("Error occurred while sending e-mail notification.", e);
        }
    }

    public abstract void fillBuffer(CyclicBuffer cb, StringBuffer sbuf);

    public String getFrom() { return this.from; }
    public String getSubject() { return this.subjectStr; }
    public void setFrom(String from) { this.from = from; }
    public void setSubject(String subject) { this.subjectStr = subject; }
    public void setSMTPHost(String smtpHost) { setSmtpHost(smtpHost); }
    public void setSmtpHost(String smtpHost) { this.smtpHost = smtpHost; }
    public String getSMTPHost() { return getSmtpHost(); }
    public String getSmtpHost() { return this.smtpHost; }
    public void setSMTPPort(int port) { setSmtpPort(port); }
    public void setSmtpPort(int port) { this.smtpPort = port; }
    public int getSMTPPort() { return getSmtpPort(); }
    public int getSmtpPort() { return this.smtpPort; }
    public String getLocalhost() { return this.localhost; }
    public void setLocalhost(String localhost) { this.localhost = localhost; }
    public CyclicBufferTracker getCyclicBufferTracker() { return this.cbTracker; }
    public void setCyclicBufferTracker(CyclicBufferTracker cbTracker) { this.cbTracker = cbTracker; }
    public Discriminator getDiscriminator() { return this.discriminator; }
    public void setDiscriminator(Discriminator discriminator) { this.discriminator = discriminator; }
    public boolean isAsynchronousSending() { return this.asynchronousSending; }
    public void setAsynchronousSending(boolean asynchronousSending) { this.asynchronousSending = asynchronousSending; }

    public void addTo(String to) {
        if (to == null || to.length() == 0) throw new IllegalArgumentException("Null or empty <to> property");
        PatternLayoutBase patternLayout = makeNewToPatternLayout(to.trim());
        ((LayoutBase)patternLayout).setContext(this.context);
        patternLayout.start();
        this.toPatternLayoutList.add(patternLayout);
    }

    public abstract PatternLayoutBase makeNewToPatternLayout(String toPattern);

    public List getToAsListOfString() {
        List<String> result = new ArrayList<String>();
        for (Object o : this.toPatternLayoutList) result.add(((PatternLayoutBase)o).getPattern());
        return result;
    }

    public boolean isSTARTTLS() { return this.starttls; }
    public void setSTARTTLS(boolean starttls) { this.starttls = starttls; }
    public boolean isSSL() { return this.ssl; }
    public void setSSL(boolean ssl) { this.ssl = ssl; }
    public void setEvaluator(EventEvaluator eventEvaluator) { this.eventEvaluator = eventEvaluator; }
    public String getUsername() { return this.username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return this.password; }
    public void setPassword(String password) { this.password = password; }
    public String getCharsetEncoding() { return this.charsetEncoding; }
    public String getJndiLocation() { return this.jndiLocation; }
    public void setJndiLocation(String jndiLocation) { this.jndiLocation = jndiLocation; }
    public boolean isSessionViaJNDI() { return this.sessionViaJNDI; }
    public void setSessionViaJNDI(boolean sessionViaJNDI) { this.sessionViaJNDI = sessionViaJNDI; }
    public void setCharsetEncoding(String charsetEncoding) { this.charsetEncoding = charsetEncoding; }
    public Layout getLayout() { return this.layout; }
    public void setLayout(Layout layout) { this.layout = layout; }

    public class SenderRunnable implements Runnable {
        final CyclicBuffer cyclicBuffer;
        final Object e;

        public SenderRunnable(CyclicBuffer cyclicBuffer, Object eventObject) {
            this.cyclicBuffer = cyclicBuffer;
            this.e = eventObject;
        }

        @Override
        public void run() {
            SMTPAppenderBase.this.sendBuffer(this.cyclicBuffer, this.e);
        }
    }
}
