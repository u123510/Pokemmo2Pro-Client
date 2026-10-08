/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.util;

import ch.qos.logback.core.util.OptionHelper;

public class SystemInfo {
    public static String getJavaVendor() {
        return OptionHelper.getSystemProperty("java.vendor", null);
    }
}

