package ch.qos.logback.core.pattern;

public abstract class Converter<E> {
    Converter<E> next;

    public abstract String convert(E event);

    public void write(StringBuilder stringBuilder, E event) {
        stringBuilder.append(this.convert(event));
    }

    public final void setNext(Converter<E> next) {
        if (this.next == null) {
            this.next = next;
            return;
        }
        throw new IllegalStateException("Next converter has been already set");
    }

    public final Converter<E> getNext() {
        return this.next;
    }
}
