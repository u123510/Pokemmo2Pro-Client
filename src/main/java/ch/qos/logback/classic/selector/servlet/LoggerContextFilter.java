package ch.qos.logback.classic.selector.servlet;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.selector.ContextJNDISelector;
import ch.qos.logback.classic.util.ContextSelectorStaticBinder;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import f.Cq0;

public class LoggerContextFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        LoggerContext context = (LoggerContext) Cq0.VL0();
        Object selector = ContextSelectorStaticBinder.getSingleton().getContextSelector();
        ContextJNDISelector jndiSelector = selector instanceof ContextJNDISelector
                ? (ContextJNDISelector) selector : null;
        if (jndiSelector != null) {
            jndiSelector.setLocalContext(context);
        }
        try {
            chain.doFilter(request, response);
        } finally {
            if (jndiSelector != null) {
                jndiSelector.removeLocalContext();
            }
        }
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }
}
