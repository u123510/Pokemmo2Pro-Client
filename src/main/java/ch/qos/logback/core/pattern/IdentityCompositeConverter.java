/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.pattern;

import ch.qos.logback.core.pattern.CompositeConverter;

public class IdentityCompositeConverter
extends CompositeConverter {
    @Override
    public String transform(Object object, String string) {
        return string;
    }
}

