package ch.qos.logback.classic;

import ch.qos.logback.core.status.StatusManager;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewStatusMessagesServlet extends ch.qos.logback.core.status.ViewStatusMessagesServletBase {
    private static final long serialVersionUID = 443878494348593337L;

    @Override
    public StatusManager getStatusManager(HttpServletRequest request, HttpServletResponse response) {
        return ((LoggerContext) f.Cq0.vr().getLoggerFactory()).getStatusManager();
    }

    @Override
    public String getPageTitle(HttpServletRequest request, HttpServletResponse response) {
        return "<h2>Status messages for LoggerContext named ["
                + ((LoggerContext) f.Cq0.VL0()).getName() + "]</h2>\r\n";
    }
}
