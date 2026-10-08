/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.pattern.CompositeConverter;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.DynamicConverter;
import ch.qos.logback.core.spi.ContextAware;

public class ConverterUtil {
    public static void startConverters(Converter converter) {
        while (converter != null) {
            if (converter instanceof CompositeConverter) {
                CompositeConverter compositeConverter = (CompositeConverter)converter;
                ConverterUtil.startConverters(compositeConverter.childConverter);
                compositeConverter.start();
            } else if (converter instanceof DynamicConverter) {
                ((DynamicConverter)converter).start();
            }
            converter = converter.getNext();
        }
    }

    public static Converter findTail(Converter converter) {
        Converter converter2;
        while (converter != null && (converter2 = converter.getNext()) != null) {
            converter = converter2;
        }
        return converter;
    }

    public static void setContextForConverters(Context context, Converter converter) {
        while (converter != null) {
            if (converter instanceof ContextAware) {
                ((ContextAware)((Object)converter)).setContext(context);
            }
            if (converter instanceof CompositeConverter) {
                ConverterUtil.setContextForConverters(context, ((CompositeConverter)converter).childConverter);
            }
            converter = converter.getNext();
        }
    }
}

