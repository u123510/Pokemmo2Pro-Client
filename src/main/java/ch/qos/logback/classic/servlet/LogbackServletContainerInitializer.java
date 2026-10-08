package ch.qos.logback.classic.servlet;

import ch.qos.logback.classic.util.StatusViaSLF4JLoggerFactory;
import ch.qos.logback.core.util.OptionHelper;
import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import java.util.Set;

public class LogbackServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> classes, ServletContext servletContext) {
        if (isDisabledByConfiguration(servletContext)) {
            StatusViaSLF4JLoggerFactory.addInfo(
                    "Due to deployment instructions will NOT register an instance of "
                            + LogbackServletContextListener.class + " to the current web-app", this);
            return;
        }
        StatusViaSLF4JLoggerFactory.addInfo(
                "Adding an instance of  " + LogbackServletContextListener.class + " to the current web-app", this);
        servletContext.addListener(new LogbackServletContextListener());
    }

    public boolean isDisabledByConfiguration(ServletContext servletContext) {
        String value = servletContext.getInitParameter("logbackDisableServletContainerInitializer");
        if (OptionHelper.isNullOrEmptyOrAllSpaces(value)) {
            value = OptionHelper.getSystemProperty("logbackDisableServletContainerInitializer");
        }
        if (OptionHelper.isNullOrEmptyOrAllSpaces(value)) {
            value = OptionHelper.getEnv("logbackDisableServletContainerInitializer");
        }
        return Boolean.parseBoolean(value);
    }
}
