package ch.qos.logback.core.sift;

public abstract interface Discriminator<E> extends ch.qos.logback.core.spi.LifeCycle {
    public java.lang.String getDiscriminatingValue(E arg0);

    public java.lang.String getKey();

}
