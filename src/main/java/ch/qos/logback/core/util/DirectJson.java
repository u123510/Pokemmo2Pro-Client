/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.util;

import java.math.BigDecimal;
import java.nio.ByteBuffer;

public final class DirectJson {
    private static final int INITIAL_BUFFER_SIZE = 1024;
    private static final byte QUOTE = 34;
    private static final byte ENTRY_SEP = 58;
    private static final byte KV_SEP = 44;
    private static final byte DOT = 46;
    private static final byte OPEN_OBJ = 123;
    private static final byte CLOSE_OBJ = 125;
    private static final byte OPEN_ARR = 91;
    private static final byte CLOSE_ARR = 93;
    private static final byte[] NEWLINE = new byte[]{92, 110};
    private static final byte[] ESCAPE = new byte[]{92, 92};
    private static final byte[] LINEBREAK = new byte[]{92, 114};
    private static final byte[] TAB = new byte[]{92, 116};
    private static final byte[] TRUE = new byte[]{116, 114, 117, 101};
    private static final byte[] FALSE = new byte[]{102, 97, 108, 115, 101};
    private static final byte[] NULL = new byte[]{110, 117, 108, 108};
    private ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

    public void openObject() {
        this.buffer.put((byte)123);
    }

    public void openArray() {
        this.buffer.put((byte)91);
    }

    public void openObject(String string) {
        DirectJson directJson = this;
        directJson.writeString(string);
        directJson.writeEntrySep();
        directJson.buffer.put((byte)123);
    }

    public void openArray(String string) {
        DirectJson directJson = this;
        directJson.writeString(string);
        directJson.writeEntrySep();
        directJson.buffer.put((byte)91);
    }

    public void closeObject() {
        DirectJson directJson = this;
        int n = directJson.buffer.position() - 1;
        if (44 == directJson.buffer.get(n)) {
            this.buffer.put(n, (byte)125);
        } else {
            this.buffer.put((byte)125);
        }
    }

    public void closeArray() {
        DirectJson directJson = this;
        int n = directJson.buffer.position() - 1;
        if (44 == directJson.buffer.get(n)) {
            this.buffer.put(n, (byte)93);
        } else {
            this.buffer.put((byte)93);
        }
    }

    public void writeRaw(String string) {
        for (int j = 0; j < string.length(); ++j) {
            int n = string.codePointAt(j);
            if (n != 9) {
                if (n != 10) {
                    if (n != 13) {
                        if (n != 92) {
                            if (n >= 128 && n <= 0x10FFFF) {
                                this.buffer.put(String.valueOf(string.charAt(j)).getBytes());
                                continue;
                            }
                            if (n <= 31) continue;
                            this.buffer.put((byte)n);
                            continue;
                        }
                        this.buffer.put(ESCAPE);
                        continue;
                    }
                    this.buffer.put(LINEBREAK);
                    continue;
                }
                this.buffer.put(NEWLINE);
                continue;
            }
            this.buffer.put(TAB);
        }
    }

    public void writeRaw(char c) {
        this.buffer.put((byte)c);
    }

    public void writeRaw(byte[] byArray) {
        this.buffer.put(byArray);
    }

    public void writeQuote() {
        this.buffer.put((byte)34);
    }

    public void writeString(String string) {
        DirectJson directJson = this;
        DirectJson directJson2 = this;
        directJson2.checkSpace(string.length() + 3);
        directJson2.buffer.put((byte)34);
        directJson.writeRaw(string);
        directJson.buffer.put((byte)34);
        directJson.buffer.put((byte)44);
    }

    public void writeSep() {
        this.buffer.put((byte)44);
    }

    public void writeNumberRaw(long l) {
        int n2 = this.buffer.position();
        int n = (int)Math.log10(l);
        int n3 = n + 1;
        for (; n >= 0; --n) {
            byte by = (byte)(l % 10L);
            l /= 10L;
            byte by2 = (byte)(by + 48);
            this.buffer.put(n2 + n, by2);
        }
        this.buffer.position(n2 + n3);
    }

    public void writeNumber(long l) {
        int n = this.buffer.position();
        int n2 = l == 0L ? 1 : (int)Math.log10(l) + 1;
        for (int j = n2 - 1; j >= 0; --j) {
            byte by = (byte)(l % 10L);
            l /= 10L;
            byte by2 = (byte)(by + 48);
            this.buffer.put(n + j, by2);
        }
        DirectJson directJson = this;
        directJson.buffer.position(n + n2);
        directJson.buffer.put((byte)44);
    }

    public void writeNumber(double d) {
        int n2 = this.buffer.position();
        long l = (long)d;
        int n = (int)Math.log10(l);
        int n3 = n + 1;
        for (; n >= 0; --n) {
            byte by = (byte)(l % 10L);
            l /= 10L;
            byte by2 = (byte)(by + 48);
            this.buffer.put(n2 + n, by2);
        }
        DirectJson directJson = this;
        directJson.buffer.position(n2 + n3);
        directJson.buffer.put((byte)46);
        int n4 = directJson.buffer.position();
        BigDecimal bigDecimal = BigDecimal.valueOf(d).remainder(BigDecimal.ONE);
        n2 = 0;
        while (!bigDecimal.equals(BigDecimal.ZERO)) {
            BigDecimal bigDecimal2 = bigDecimal.movePointRight(1);
            byte by = (byte)(bigDecimal2.intValue() + 48);
            BigDecimal bigDecimal3 = bigDecimal2.remainder(BigDecimal.ONE);
            ++n2;
            this.buffer.put(by);
            bigDecimal = bigDecimal3;
        }
        DirectJson directJson2 = this;
        directJson2.buffer.position(n4 + n2);
        directJson2.buffer.put((byte)44);
    }

    public void writeEntrySep() {
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.put(byteBuffer.position() - 1, (byte)58);
    }

    public void writeStringValue(String string, String string2) {
        DirectJson directJson = this;
        directJson.writeString(string);
        directJson.writeEntrySep();
        directJson.writeString(string2);
    }

    public void writeNumberValue(String string, long l) {
        DirectJson directJson = this;
        directJson.writeString(string);
        directJson.writeEntrySep();
        directJson.writeNumber(l);
    }

    public void writeNumberValue(String string, double d) {
        DirectJson directJson = this;
        directJson.writeString(string);
        directJson.writeEntrySep();
        directJson.writeNumber(d);
    }

    public void writeBoolean(boolean bl) {
        ByteBuffer byteBuffer = this.buffer;
        byte[] byArray = bl ? TRUE : FALSE;
        byteBuffer.put(byArray);
        this.buffer.put((byte)44);
    }

    public void writeNull() {
        DirectJson directJson = this;
        directJson.buffer.put(NULL);
        directJson.buffer.put((byte)44);
    }

    public void checkSpace(int n) {
        if (this.buffer.position() + n >= this.buffer.capacity()) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect((this.buffer.capacity() + n) * 2);
            DirectJson directJson = this;
            directJson.buffer.flip();
            byteBuffer.put(directJson.buffer);
            this.buffer = byteBuffer;
        }
    }

    public byte[] flush() {
        byte[] byArray = new byte[this.buffer.position()];
        DirectJson directJson = this;
        directJson.buffer.flip();
        directJson.buffer.get(byArray);
        directJson.buffer.clear();
        return byArray;
    }
}

