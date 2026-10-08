package ch.qos.logback.core.net;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;

public abstract class SyslogAppenderBase extends AppenderBase {
   static final String SYSLOG_LAYOUT_URL = "http://logback.qos.ch/codes.html#syslog_layout";
   static final int MAX_MESSAGE_SIZE_LIMIT = 65000;
   Layout layout;
   String facilityStr;
   String syslogHost;
   protected String suffixPattern;
   SyslogOutputStream sos;
   int port = 514;
   int maxMessageSize;
   Charset charset;

   public static int facilityStringToint(String var0) {
      if ("KERN".equalsIgnoreCase(var0)) {
         return 0;
      } else if ("USER".equalsIgnoreCase(var0)) {
         return 8;
      } else if ("MAIL".equalsIgnoreCase(var0)) {
         return 16;
      } else if ("DAEMON".equalsIgnoreCase(var0)) {
         return 24;
      } else if ("AUTH".equalsIgnoreCase(var0)) {
         return 32;
      } else if ("SYSLOG".equalsIgnoreCase(var0)) {
         return 40;
      } else if ("LPR".equalsIgnoreCase(var0)) {
         return 48;
      } else if ("NEWS".equalsIgnoreCase(var0)) {
         return 56;
      } else if ("UUCP".equalsIgnoreCase(var0)) {
         return 64;
      } else if ("CRON".equalsIgnoreCase(var0)) {
         return 72;
      } else if ("AUTHPRIV".equalsIgnoreCase(var0)) {
         return 80;
      } else if ("FTP".equalsIgnoreCase(var0)) {
         return 88;
      } else if ("NTP".equalsIgnoreCase(var0)) {
         return 96;
      } else if ("AUDIT".equalsIgnoreCase(var0)) {
         return 104;
      } else if ("ALERT".equalsIgnoreCase(var0)) {
         return 112;
      } else if ("CLOCK".equalsIgnoreCase(var0)) {
         return 120;
      } else if ("LOCAL0".equalsIgnoreCase(var0)) {
         return 128;
      } else if ("LOCAL1".equalsIgnoreCase(var0)) {
         return 136;
      } else if ("LOCAL2".equalsIgnoreCase(var0)) {
         return 144;
      } else if ("LOCAL3".equalsIgnoreCase(var0)) {
         return 152;
      } else if ("LOCAL4".equalsIgnoreCase(var0)) {
         return 160;
      } else if ("LOCAL5".equalsIgnoreCase(var0)) {
         return 168;
      } else if ("LOCAL6".equalsIgnoreCase(var0)) {
         return 176;
      } else if ("LOCAL7".equalsIgnoreCase(var0)) {
         return 184;
      } else {
         throw new IllegalArgumentException(var0 + " is not a valid syslog facility string");
      }
   }
   public void start() {
      int errorCount = 0;
      if (this.facilityStr == null) {
         this.addError("The Facility option is mandatory");
         errorCount = 1;
      }

      if (this.charset == null) {
         this.charset = Charset.defaultCharset();
      }

      try {
         this.sos = this.createOutputStream();
         int sendBufferSize = this.sos.getSendBufferSize();
         int maxMessageSize = this.maxMessageSize;
         if (maxMessageSize == 0) {
            sendBufferSize = Math.min(sendBufferSize, MAX_MESSAGE_SIZE_LIMIT);
            this.maxMessageSize = sendBufferSize;
            this.addInfo("Defaulting maxMessageSize to [" + sendBufferSize + "]");
         } else if (maxMessageSize > sendBufferSize) {
            this.addWarn("maxMessageSize of [" + maxMessageSize + "] is larger than the system defined datagram size of [" + sendBufferSize + "].");
            this.addWarn("This may result in dropped logs.");
         }
      } catch (SocketException e) {
         this.addWarn("Failed to bind to a random datagram socket. Will try to reconnect later.", e);
      } catch (UnknownHostException e) {
         this.addError("Could not create SyslogWriter", e);
         errorCount++;
      }

      if (this.layout == null) {
         this.layout = this.buildLayout();
      }

      if (errorCount == 0) {
         super.start();
      }

   }

   public abstract SyslogOutputStream createOutputStream() throws UnknownHostException, SocketException;

   public abstract Layout buildLayout();

   public abstract int getSeverityForEvent(Object var1);

   public void append(Object event) {
      if (!this.isStarted()) {
         return;
      }
      try {
         String msg = this.layout.doLayout(event);
         if (msg == null) {
            return;
         }
         int len = msg.length();
         int max = this.maxMessageSize;
         if (len > max) {
            msg = msg.substring(0, max);
         }
         this.sos.write(msg.getBytes(this.charset));
         this.sos.flush();
         this.postProcess(event, this.sos);
      } catch (IOException e) {
         this.addError("Failed to send diagram to " + this.syslogHost, e);
      }
   }

   public void postProcess(Object var1, OutputStream var2) {
   }

   public String getSyslogHost() {
      return this.syslogHost;
   }

   public void setSyslogHost(String var1) {
      this.syslogHost = var1;
   }

   public String getFacility() {
      return this.facilityStr;
   }

   public void setFacility(String var1) {
      if (var1 != null) {
         var1 = var1.trim();
      }

      this.facilityStr = var1;
   }

   public int getPort() {
      return this.port;
   }

   public void setPort(int var1) {
      this.port = var1;
   }

   public int getMaxMessageSize() {
      return this.maxMessageSize;
   }

   public void setMaxMessageSize(int var1) {
      this.maxMessageSize = var1;
   }

   public Layout getLayout() {
      return this.layout;
   }

   public void setLayout(Layout var1) {
      ((ContextAwareBase)this).addWarn("The layout of a SyslogAppender cannot be set directly. See also http://logback.qos.ch/codes.html#syslog_layout");
   }

   public void stop() {
      SyslogOutputStream var1;
      if ((var1 = this.sos) != null) {
         var1.close();
      }

      super.stop();
   }

   public String getSuffixPattern() {
      return this.suffixPattern;
   }

   public void setSuffixPattern(String var1) {
      this.suffixPattern = var1;
   }

   public Charset getCharset() {
      return this.charset;
   }

   public void setCharset(Charset var1) {
      this.charset = var1;
   }
}
