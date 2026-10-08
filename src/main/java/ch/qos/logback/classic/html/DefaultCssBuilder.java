package ch.qos.logback.classic.html;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.html.CssBuilder;

public class DefaultCssBuilder implements CssBuilder {
    @Override
    public void addCss(StringBuilder output) {
        String lineSeparator = CoreConstants.LINE_SEPARATOR;
        output.append("<style  type=\"text/css\">").append(lineSeparator);
        output.append("table { margin-left: 2em; margin-right: 2em; border-left: 2px solid #AAA; }").append(lineSeparator);
        output.append("TR.even { background: #FFFFFF; }").append(lineSeparator);
        output.append("TR.odd { background: #EAEAEA; }").append(lineSeparator);
        output.append("TR.warn TD.Level, TR.error TD.Level, TR.fatal TD.Level {font-weight: bold; color: #FF4040 }").append(lineSeparator);
        output.append("TD { padding-right: 1ex; padding-left: 1ex; border-right: 2px solid #AAA; }").append(lineSeparator);
        output.append("TD.Time, TD.Date { text-align: right; font-family: courier, monospace; font-size: smaller; }").append(lineSeparator);
        output.append("TD.Thread { text-align: left; }").append(lineSeparator);
        output.append("TD.Level { text-align: right; }").append(lineSeparator);
        output.append("TD.Logger { text-align: left; }").append(lineSeparator);
        output.append("TR.header { background: #596ED5; color: #FFF; font-weight: bold; font-size: larger; }").append(lineSeparator);
        output.append("TD.Exception { background: #A2AEE8; font-family: courier, monospace;}").append(lineSeparator);
        output.append("</style>").append(lineSeparator);
    }
}
