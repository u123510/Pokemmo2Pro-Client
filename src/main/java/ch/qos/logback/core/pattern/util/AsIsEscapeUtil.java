/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.pattern.util;

import ch.qos.logback.core.pattern.util.IEscapeUtil;

public class AsIsEscapeUtil
implements IEscapeUtil {
    @Override
    public void escape(String string, StringBuffer stringBuffer, char c, int n) {
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append("\\");
        stringBuffer2.append(c);
    }
}

