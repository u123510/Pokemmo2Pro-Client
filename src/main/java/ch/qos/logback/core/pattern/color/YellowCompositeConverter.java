/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.pattern.color;

import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

public class YellowCompositeConverter
extends ForegroundCompositeConverterBase {
    @Override
    public String getForegroundColorCode(Object object) {
        return "33";
    }
}

