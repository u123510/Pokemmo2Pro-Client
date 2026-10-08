package ch.qos.logback.core.helpers;

import ch.qos.logback.core.AppenderBase;

public final class NOPAppender<E> extends AppenderBase<E> {
    public NOPAppender() {
    }

    @Override
    public void append(E event) {
    }
}
