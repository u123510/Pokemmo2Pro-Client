/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.sift;

import ch.qos.logback.core.sift.AbstractDiscriminator;

public class DefaultDiscriminator
extends AbstractDiscriminator {
    public static final String DEFAULT = "default";

    @Override
    public String getDiscriminatingValue(Object object) {
        return DEFAULT;
    }

    @Override
    public String getKey() {
        return DEFAULT;
    }
}

