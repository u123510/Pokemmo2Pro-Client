package f;

import cn.pokemmo.util.binary.DynamicByteBufferHolder;

public final class XW extends DynamicByteBufferHolder {
    public XW() {
        super();
    }

    public XW(int capacity) {
        super(capacity);
    }

    public XW(boolean immutable, int capacity) {
        super(immutable, capacity);
    }

    public XW(XW source) {
        super(source);
    }

    public XW(byte[] source) {
        super(source);
    }

    public XW(boolean immutable, byte[] source, int offset, int length) {
        super(immutable, source, offset, length);
    }
}
