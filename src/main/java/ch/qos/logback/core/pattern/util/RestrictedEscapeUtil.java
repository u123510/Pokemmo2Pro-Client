/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.pattern.util;

import ch.qos.logback.core.pattern.util.IEscapeUtil;

public class RestrictedEscapeUtil
implements IEscapeUtil {
    @Override
    public void escape(String string, StringBuffer stringBuffer, char c, int n) {
        if (string.indexOf(c) >= 0) {
            stringBuffer.append(c);
        } else {
            StringBuffer stringBuffer2 = stringBuffer;
            stringBuffer2.append("\\");
            stringBuffer2.append(c);
        }
    }
}

