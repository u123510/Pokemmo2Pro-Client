/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.rolling.helper;

public class TokenConverter {
    static final int IDENTITY = 0;
    static final int INTEGER = 1;
    static final int DATE = 1;
    int type;
    TokenConverter next;

    public TokenConverter(int n) {
        this.type = n;
    }

    public TokenConverter getNext() {
        return this.next;
    }

    public void setNext(TokenConverter tokenConverter) {
        this.next = tokenConverter;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int n) {
        this.type = n;
    }
}

