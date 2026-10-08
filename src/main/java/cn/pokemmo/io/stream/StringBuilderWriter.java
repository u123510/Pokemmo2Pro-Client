package cn.pokemmo.io.stream;

import java.io.Serializable;
import java.io.Writer;

public class StringBuilderWriter extends Writer implements Serializable {
    private static final long serialVersionUID = -146927496096066153L;
    public final StringBuilder builder;

    public StringBuilderWriter() {
        this(4);
    }

    public StringBuilderWriter(int capacity) {
        super();
        this.builder = new StringBuilder(capacity);
    }

    public StringBuilderWriter(StringBuilder builder) {
        super();
        this.builder = builder != null ? builder : new StringBuilder();
    }

    @Override
    public Writer append(char value) {
        this.builder.append(value);
        return this;
    }

    @Override
    public Writer append(CharSequence value) {
        this.builder.append(value);
        return this;
    }

    @Override
    public Writer append(CharSequence value, int start, int end) {
        this.builder.append(value, start, end);
        return this;
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void write(String value) {
        if (value != null) {
            this.builder.append(value);
        }
    }

    @Override
    public void write(char[] value, int offset, int length) {
        if (value != null) {
            this.builder.append(value, offset, length);
        }
    }

    public StringBuilder getBuilder() {
        return this.builder;
    }

    @Override
    public String toString() {
        return this.builder.toString();
    }
}
