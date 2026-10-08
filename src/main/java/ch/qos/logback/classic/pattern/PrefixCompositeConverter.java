package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.CompositeConverter;
import ch.qos.logback.core.pattern.Converter;

public class PrefixCompositeConverter extends CompositeConverter<ILoggingEvent> {
    @Override
    public String convert(ILoggingEvent event) {
        StringBuilder result = new StringBuilder();
        Converter child = getChildConverter();
        while (child != null) {
            String key = null;
            if (child instanceof MDCConverter) {
                key = ((MDCConverter) child).getKey();
            } else if (child instanceof PropertyConverter) {
                key = ((PropertyConverter) child).getKey();
            } else {
                key = (String) PatternLayout.CONVERTER_CLASS_TO_KEY_MAP.get(child.getClass().getName());
            }
            if (key != null) {
                result.append(key).append('=');
            }
            result.append(child.convert(event));
            child = child.getNext();
        }
        return result.toString();
    }

    @Override
    public String transform(ILoggingEvent event, String in) {
        throw new UnsupportedOperationException();
    }
}
