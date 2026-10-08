package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.util.LevelToSyslogSeverity;
import ch.qos.logback.core.net.SyslogAppenderBase;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SyslogStartConverter extends ClassicConverter {
    private long lastTimestamp = -1L;
    private String timesmapStr;
    private SimpleDateFormat simpleMonthFormat;
    private SimpleDateFormat simpleTimeFormat;
    private final Calendar calendar = Calendar.getInstance(Locale.US);
    private String localHostName;
    private int facility;

    @Override
    public void start() {
        String option = getFirstOption();
        if (option == null) {
            addError("was expecting a facility string as an option");
            return;
        }
        facility = SyslogAppenderBase.facilityStringToint(option);
        localHostName = getLocalHostname();
        try {
            simpleMonthFormat = new SimpleDateFormat("MMM", Locale.US);
            simpleTimeFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
            super.start();
        } catch (IllegalArgumentException ex) {
            addError("Could not instantiate SimpleDateFormat", ex);
        }
    }

    @Override
    public String convert(ILoggingEvent event) {
        StringBuilder result = new StringBuilder("<");
        result.append(facility + LevelToSyslogSeverity.convert(event));
        result.append('>');
        result.append(computeTimeStampString(event.getTimeStamp()));
        result.append(' ');
        result.append(localHostName);
        result.append(' ');
        return result.toString();
    }

    public String getLocalHostname() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException ex) {
            addError("Could not determine local host name", ex);
            return "UNKNOWN_LOCALHOST";
        }
    }

    public synchronized String computeTimeStampString(long timestamp) {
        if (timestamp / 1000L != lastTimestamp) {
            lastTimestamp = timestamp / 1000L;
            Date date = new Date(timestamp);
            calendar.setTime(date);
            timesmapStr = String.format("%s %2d %s",
                    simpleMonthFormat.format(date),
                    calendar.get(Calendar.DAY_OF_MONTH),
                    simpleTimeFormat.format(date));
        }
        return timesmapStr;
    }
}
