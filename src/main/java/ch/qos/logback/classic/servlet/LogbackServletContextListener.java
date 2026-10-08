package ch.qos.logback.classic.servlet;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.StatusViaSLF4JLoggerFactory;
import ch.qos.logback.core.spi.ContextAwareBase;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import f.Cq0;

public class LogbackServletContextListener implements ServletContextListener {
    ContextAwareBase contextAwareBase;

    public LogbackServletContextListener() {
        this.contextAwareBase = new ContextAwareBase();
    }

    @Override
    public void contextInitialized(ServletContextEvent event) {
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        Object context = Cq0.VL0();
        if (context instanceof LoggerContext) {
            LoggerContext loggerContext = (LoggerContext) context;
            this.contextAwareBase.setContext(loggerContext);
            StatusViaSLF4JLoggerFactory.addInfo(
                    "About to stop " + loggerContext.getClass().getCanonicalName()
                            + " [" + loggerContext.getName() + "]", this);
            loggerContext.stop();
        }
    }
}
