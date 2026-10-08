package cn.pokemmo.util;

import f.*;
import java.io.IOException;
import java.net.URL;
import org.xmlpull.v1.XmlPullParserException;

/**
 * 现代化重构类 - 原始混淆类: f.LE0
 */
public class Modern_Util_Le0 extends IOException {

    public final H00 MJ;

    public Modern_Util_Le0(String message, URL url, int line, int column, XmlPullParserException cause) {
        super(message);
        this.MJ = new H00(url, line, column);
        this.initCause(cause);
    }

    @Override
    public final String getMessage() {
        StringBuilder message = new StringBuilder(super.getMessage());
        String prefix = "\n           in ";
        H00 location = this.MJ;
        while (location != null) {
            message.append(prefix).append(location.kS).append(" @").append(location.Fe).append(':').append(location.K10);
            prefix = "\n  included by ";
            location = location.Wr0;
        }
        return message.toString();
    }
}

