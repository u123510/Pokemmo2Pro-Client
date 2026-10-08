package ch.qos.logback.core.html;

public interface IThrowableRenderer<E> {
    void render(StringBuilder builder, E event);
}
