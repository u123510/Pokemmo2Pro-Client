/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.system;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
public @interface NativeType {
    public String value();
}

