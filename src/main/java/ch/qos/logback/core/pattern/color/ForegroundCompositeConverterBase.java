package ch.qos.logback.core.pattern.color;

import ch.qos.logback.core.pattern.CompositeConverter;

public abstract class ForegroundCompositeConverterBase<E>
extends CompositeConverter<E> {
    private static final String SET_DEFAULT_COLOR = "\u001b[0;39m";

    @Override
    public String transform(E event, String in) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\u001b[");
        stringBuilder.append(this.getForegroundColorCode(event));
        stringBuilder.append("m");
        stringBuilder.append(in);
        stringBuilder.append(SET_DEFAULT_COLOR);
        return stringBuilder.toString();
    }

    public abstract String getForegroundColorCode(E event);
}
