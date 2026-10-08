package ch.qos.logback.core.status;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.Transform;
import ch.qos.logback.core.util.CachingDateFormatter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

public abstract class ViewStatusMessagesServletBase extends HttpServlet {
    private static final long serialVersionUID = -3551928133801157219L;
    private static CachingDateFormatter SDF = new CachingDateFormatter("yyyy-MM-dd HH:mm:ss");
    static String SUBMIT = "submit";
    static String CLEAR = "Clear";
    int count;

    private void printStatus(StringBuilder buf, Status status) {
        String rowClass = count % 2 == 0 ? "even" : "odd";
        buf.append("  <tr class=\"").append(rowClass).append("\">\r\n");
        String date = SDF.format(status.getTimestamp());
        buf.append("    <td class=\"date\">").append(date).append("</td>\r\n");
        buf.append("    <td class=\"level\">").append(statusLevelAsString(status)).append("</td>\r\n");
        buf.append("    <td>").append(abbreviatedOrigin(status)).append("</td>\r\n");
        buf.append("    <td>").append(status.getMessage()).append("</td>\r\n");
        buf.append("  </tr>\r\n");
        if (status.getThrowable() != null) {
            printThrowable(buf, status.getThrowable());
        }
    }

    private void printThrowable(StringBuilder buf, Throwable throwable) {
        buf.append("  <tr>\r\n");
        buf.append("    <td colspan=\"4\" class=\"exception\"><pre>");
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        buf.append(Transform.escapeTags(stringWriter.getBuffer()));
        buf.append("    </pre></td>\r\n");
        buf.append("  </tr>\r\n");
    }

    public abstract StatusManager getStatusManager(HttpServletRequest request, HttpServletResponse response);

    public abstract String getPageTitle(HttpServletRequest request, HttpServletResponse response);

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException {
        count = 0;
        StatusManager statusManager = getStatusManager(request, response);
        response.setContentType("text/html");
        PrintWriter output = response.getWriter();
        output.append("<html>\r\n");
        output.append("<head>\r\n");
        printCSS(request.getContextPath(), output);
        output.append("</head>\r\n");
        output.append("<body>\r\n");
        output.append(getPageTitle(request, response));
        output.append("<form method=\"POST\">\r\n");
        output.append("<input type=\"submit\" name=\"").append(SUBMIT)
                .append("\" value=\"").append(CLEAR).append("\">");
        output.append("</form>\r\n");
        if (CLEAR.equalsIgnoreCase(request.getParameter(SUBMIT))) {
            statusManager.clear();
            statusManager.add(new InfoStatus("Cleared all status messages", this));
        }
        output.append("<table>");
        StringBuilder buf = new StringBuilder();
        if (statusManager != null) {
            printList(buf, statusManager);
        } else {
            output.append("Could not find status manager");
        }
        output.append(buf);
        output.append("</table>");
        output.append("</body>\r\n");
        output.append("</html>\r\n");
        output.flush();
        output.close();
    }

    public void printCSS(String contextPath, PrintWriter output) {
        output.append("  <STYLE TYPE=\"text/css\">\r\n");
        output.append("    .warn  { font-weight: bold; color: #FF6600;} \r\n");
        output.append("    .error { font-weight: bold; color: #CC0000;} \r\n");
        output.append("    table { margin-left: 2em; margin-right: 2em; border-left: 2px solid #AAA; }\r\n");
        output.append("    tr.even { background: #FFFFFF; }\r\n");
        output.append("    tr.odd  { background: #EAEAEA; }\r\n");
        output.append("    td { padding-right: 1ex; padding-left: 1ex; border-right: 2px solid #AAA; }\r\n");
        output.append("    td.date { text-align: right; font-family: courier, monospace; font-size: smaller; }");
        output.append(CoreConstants.LINE_SEPARATOR);
        output.append("  td.level { text-align: right; }");
        output.append(CoreConstants.LINE_SEPARATOR);
        output.append("    tr.header { background: #596ED5; color: #FFF; font-weight: bold; font-size: larger; }");
        output.append(CoreConstants.LINE_SEPARATOR);
        output.append("  td.exception { background: #A2AEE8; white-space: pre; font-family: courier, monospace;}");
        output.append(CoreConstants.LINE_SEPARATOR);
        output.append("  </STYLE>\r\n");
    }

    public void printList(StringBuilder buf, StatusManager statusManager) {
        buf.append("<table>\r\n");
        printHeader(buf);
        Iterator<Status> iterator = statusManager.getCopyOfStatusList().iterator();
        while (iterator.hasNext()) {
            Status status = iterator.next();
            count++;
            printStatus(buf, status);
        }
        buf.append("</table>\r\n");
    }

    public void printHeader(StringBuilder buf) {
        buf.append("  <tr class=\"header\">\r\n");
        buf.append("    <th>Date </th>\r\n");
        buf.append("    <th>Level</th>\r\n");
        buf.append("    <th>Origin</th>\r\n");
        buf.append("    <th>Message</th>\r\n");
        buf.append("  </tr>\r\n");
    }

    public String statusLevelAsString(Status status) {
        switch (status.getEffectiveLevel()) {
            case 2:
                return "<span class=\"error\">ERROR</span>";
            case 1:
                return "<span class=\"warn\">WARN</span>";
            case 0:
                return "INFO";
            default:
                return null;
        }
    }

    public String abbreviatedOrigin(Status status) {
        Object origin = status.getOrigin();
        if (origin == null) {
            return null;
        }
        String className = origin.getClass().getName();
        int lastDot = className.lastIndexOf('.');
        return lastDot == -1 ? className : className.substring(lastDot + 1, className.length());
    }
}
