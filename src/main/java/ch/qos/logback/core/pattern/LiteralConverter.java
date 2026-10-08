/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.pattern;

import ch.qos.logback.core.pattern.Converter;

public final class LiteralConverter
extends Converter {
    String literal;

    public LiteralConverter(String string) {
        this.literal = string;
    }

    @Override
    public String convert(Object object) {
        return this.literal;
    }
}

