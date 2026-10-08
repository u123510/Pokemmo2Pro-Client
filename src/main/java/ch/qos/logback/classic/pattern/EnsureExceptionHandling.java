package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.pattern.CompositeConverter;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.PostCompileProcessor;

public class EnsureExceptionHandling implements PostCompileProcessor {
    @Override public void process(Context context, Converter converter) {
        if (converter == null) throw new IllegalArgumentException("cannot process empty chain");
        if (chainHandlesThrowable(converter)) return;
        Converter tail = ConverterUtil.findTail(converter);
        ThrowableHandlingConverter throwable = ((LoggerContext) context).isPackagingDataEnabled()
                ? new ExtendedThrowableProxyConverter() : new ThrowableProxyConverter();
        tail.setNext(throwable);
    }
    public boolean chainHandlesThrowable(Converter converter) {
        while (converter != null) {
            if (converter instanceof ThrowableHandlingConverter) return true;
            if (converter instanceof CompositeConverter && compositeHandlesThrowable((CompositeConverter) converter)) return true;
            converter = converter.getNext();
        }
        return false;
    }
    public boolean compositeHandlesThrowable(CompositeConverter converter) {
        Converter child = converter.getChildConverter();
        while (child != null) {
            if (child instanceof ThrowableHandlingConverter) return true;
            if (child instanceof CompositeConverter && compositeHandlesThrowable((CompositeConverter) child)) return true;
            child = child.getNext();
        }
        return false;
    }
}
