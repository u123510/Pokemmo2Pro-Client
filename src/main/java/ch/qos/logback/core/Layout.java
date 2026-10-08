package ch.qos.logback.core;

import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;

public interface Layout<E> extends ContextAware, LifeCycle {
    String doLayout(E event);
    String getFileHeader();
    String getPresentationHeader();
    String getPresentationFooter();
    String getFileFooter();
    String getContentType();
}
