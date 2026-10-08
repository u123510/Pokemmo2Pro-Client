package cn.pokemmo.io.handle;

import f.Dn0;
import f.tx_1;
import f.zv_1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteArrayFileHandle extends Dn0 {
    public final byte[] data;
    public final int offset;
    public final int length;

    public ByteArrayFileHandle(String name, byte[] data, int length) {
        super(name, zv_1.uq0);
        this.data = data;
        this.offset = 0;
        this.length = length;
    }

    @Override
    public InputStream uf0() {
        return new ByteArrayInputStream(this.data, this.offset, this.length);
    }

    @Override
    public byte[] kI0() {
        try {
            return tx_1.Nm0(this.uf0());
        } catch (Exception error) {
            if (error instanceof RuntimeException runtime) {
                throw runtime;
            }
            throw new RuntimeException(error);
        }
    }

    @Override
    public void yM(byte[] bytes, int len) {
        try {
            this.uf0().read(bytes, 0, len);
        } catch (IOException error) {
            throw new RuntimeException(error);
        }
    }

    @Override
    public OutputStream OC0() {
        throw new RuntimeException("Unsupported");
    }
}
