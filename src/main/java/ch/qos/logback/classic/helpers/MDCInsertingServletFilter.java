package ch.qos.logback.classic.helpers;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import f.Fg0;

public class MDCInsertingServletFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        insertIntoMDC(request);
        try {
            chain.doFilter(request, response);
        } finally {
            clearMDC();
        }
    }

    public void insertIntoMDC(ServletRequest request) {
        Fg0.Yi("req.remoteHost", request.getRemoteHost());
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            Fg0.Yi("req.requestURI", httpRequest.getRequestURI());
            StringBuffer requestURL = httpRequest.getRequestURL();
            if (requestURL != null) {
                Fg0.Yi("req.requestURL", requestURL.toString());
            }
            Fg0.Yi("req.method", httpRequest.getMethod());
            Fg0.Yi("req.queryString", httpRequest.getQueryString());
            Fg0.Yi("req.userAgent", httpRequest.getHeader("User-Agent"));
            Fg0.Yi("req.xForwardedFor", httpRequest.getHeader("X-Forwarded-For"));
        }
    }

    public void clearMDC() {
        Fg0.l1("req.remoteHost");
        Fg0.l1("req.requestURI");
        Fg0.l1("req.queryString");
        Fg0.l1("req.requestURL");
        Fg0.l1("req.method");
        Fg0.l1("req.userAgent");
        Fg0.l1("req.xForwardedFor");
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }
}
