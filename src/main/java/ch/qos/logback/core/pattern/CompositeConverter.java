package ch.qos.logback.core.pattern;

public abstract class CompositeConverter<E>
extends DynamicConverter<E> {
    Converter<E> childConverter;

    @Override
    public String convert(E event) {
        StringBuilder stringBuilder = new StringBuilder();
        Converter<E> converter = this.childConverter;
        while (converter != null) {
            converter.write(stringBuilder, event);
            converter = converter.getNext();
        }
        return this.transform(event, stringBuilder.toString());
    }

    public abstract String transform(E event, String in);

    public Converter<E> getChildConverter() {
        return this.childConverter;
    }

    public void setChildConverter(Converter<E> childConverter) {
        this.childConverter = childConverter;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CompositeConverter<");
        FormatInfo formatInfo = this.formattingInfo;
        if (formatInfo != null) {
            stringBuilder.append(formatInfo);
        }
        if (this.childConverter != null) {
            stringBuilder.append(", children: ").append(this.childConverter);
        }
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}
