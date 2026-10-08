package f;

import cn.pokemmo.io.handle.ByteArrayFileHandle;

public final class af_0 extends ByteArrayFileHandle {
    public final byte[] jA0;
    public final int Ud;
    public final int BE;

    public af_0(String name, byte[] data, int length) {
        super(name, data, length);
        this.jA0 = this.data;
        this.Ud = this.offset;
        this.BE = this.length;
    }
}
