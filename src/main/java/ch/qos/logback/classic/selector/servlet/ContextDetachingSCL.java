package ch.qos.logback.classic.selector.servlet;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.selector.ContextSelector;
import ch.qos.logback.classic.util.ContextSelectorStaticBinder;
import ch.qos.logback.core.util.JNDIUtil;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import javax.naming.Context;
import javax.naming.NamingException;

public class ContextDetachingSCL implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        String contextName = null;
        try {
            Context initialContext = JNDIUtil.getInitialContext();
            contextName = JNDIUtil.lookupString(initialContext, "java:comp/env/logback/context-name");
        } catch (NamingException ignored) {
        }

        if (contextName == null) {
            return;
        }

        System.out.println("About to detach context named " + contextName);
        ContextSelector selector = ContextSelectorStaticBinder.getSingleton().getContextSelector();
        if (selector == null) {
            System.out.println("Selector is null, cannot detach context. Skipping.");
            return;
        }

        LoggerContext context = selector.getLoggerContext(contextName);
        if (context == null) {
            System.out.println("No context named " + contextName + " was found.");
            return;
        }

        context.getLogger("ROOT").warn("Stopping logger context " + contextName);
        selector.detachLoggerContext(contextName);
        context.stop();
    }
}
