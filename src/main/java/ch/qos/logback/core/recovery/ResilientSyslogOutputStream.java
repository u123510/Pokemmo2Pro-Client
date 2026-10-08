package ch.qos.logback.core.recovery;

import ch.qos.logback.core.net.SyslogOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ResilientSyslogOutputStream extends ResilientOutputStreamBase {
    String syslogHost;
    int port;

    public ResilientSyslogOutputStream(String syslogHost, int port) throws IOException {
        this.syslogHost = syslogHost;
        this.port = port;
        os = new SyslogOutputStream(syslogHost, port);
        presumedClean = true;
    }

    public String getDescription() { return "syslog [" + syslogHost + ":" + port + "]"; }

    @Override
    public OutputStream openNewOutputStream() throws IOException {
        return new SyslogOutputStream(syslogHost, port);
    }

    @Override
    public String toString() { return "c.q.l.c.recovery.ResilientSyslogOutputStream@" + System.identityHashCode(this); }
}
