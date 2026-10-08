package ch.qos.logback.core.spi;

public abstract interface PreSerializationTransformer<E> {
    public abstract java.io.Serializable transform(E arg0);
}
