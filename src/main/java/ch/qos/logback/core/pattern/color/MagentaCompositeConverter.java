/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.pattern.color;

import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

public class MagentaCompositeConverter
extends ForegroundCompositeConverterBase {
    @Override
    public String getForegroundColorCode(Object object) {
        return "35";
    }
}

