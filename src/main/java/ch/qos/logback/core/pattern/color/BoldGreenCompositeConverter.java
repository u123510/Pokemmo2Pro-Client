/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.pattern.color;

import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

public class BoldGreenCompositeConverter
extends ForegroundCompositeConverterBase {
    @Override
    public String getForegroundColorCode(Object object) {
        return "1;32";
    }
}

