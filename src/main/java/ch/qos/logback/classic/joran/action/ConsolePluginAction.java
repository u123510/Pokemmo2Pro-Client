package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.SocketAppender;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import org.xml.sax.Attributes;

public class ConsolePluginAction extends Action {
    private static final String PORT_ATTR = "port";
    private static final Integer DEFAULT_PORT = 4321;

    @Override
    public void begin(SaxEventInterpretationContext context, String name, Attributes attributes) {
        String portString = attributes.getValue("port");
        Integer port;
        try {
            port = portString == null ? DEFAULT_PORT : Integer.valueOf(portString);
        } catch (NumberFormatException ex) {
            addError("Port " + portString + " in ConsolePlugin config is not a correct number");
            addError("Abandoning configuration of ConsolePlugin.");
            return;
        }
        LoggerContext loggerContext = (LoggerContext) getContext();
        SocketAppender appender = new SocketAppender();
        appender.setContext(loggerContext);
        appender.setIncludeCallerData(true);
        appender.setRemoteHost("localhost");
        appender.setPort(port.intValue());
        appender.start();
        loggerContext.getLogger("ROOT").addAppender(appender);
        addInfo("Sending LoggingEvents to the plugin using port " + port);
    }

    @Override
    public void end(SaxEventInterpretationContext context, String name) {
    }
}
