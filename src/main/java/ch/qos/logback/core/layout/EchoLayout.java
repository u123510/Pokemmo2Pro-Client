/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.layout;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;

public class EchoLayout
extends LayoutBase {
    @Override
    public String doLayout(Object object) {
        return String.valueOf(object) + CoreConstants.LINE_SEPARATOR;
    }
}

