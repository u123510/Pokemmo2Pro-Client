package cn.pokemmo.io.xml;

import org.xmlpull.mxp1.MXParser;

public abstract class XmlPrintableCharFormatter {
    public static String NE0(MXParser mXParser, char c, StringBuffer stringBuffer) {
        return stringBuffer.append(printable(c)).toString();
    }

    public static String printable(char ch) {
        if (ch == '\n') return "\\n";
        if (ch == '\r') return "\\r";
        if (ch == '\t') return "\\t";
        if (ch == '\'') return "\\'";
        if (ch > 127 || ch < 32) {
            return "\\u" + Integer.toHexString(ch);
        }
        return "" + ch;
    }
}
