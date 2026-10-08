package cn.pokemmo.net.session;

import f.*;
import java.nio.ByteBuffer;

public class ClientNetworkSessionContext {
    public final ByteBuffer bw0;

    public ClientNetworkSessionContext(ByteBuffer buffer) {
        this.bw0 = buffer;
    }

    public final String TM() {
        byte[] bytes = new byte[this.bw0.get()];
        this.bw0.get(bytes);
        return new String(bytes);
    }

    public final void q30(String value) {
        if (value == null) {
            this.bw0.put((byte)0);
            return;
        }
        this.bw0.put((byte)value.length());
        this.bw0.put(value.getBytes());
    }

    public final float[] v() {
        int size = this.bw0.getInt();
        if (size >= 0 && size <= 50000) {
            float[] values = new float[size];
            for (int i = 0; i < size; ++i) {
                values[i] = this.bw0.getFloat();
            }
            return values;
        }
        throw new nf_1("size < 0 getFloatArray " + this.bw0.position());
    }

    public final C8 bH() {
        if (this.bw0.get() != 3) {
            return null;
        }
        return new C8(this.bw0.getFloat(), this.bw0.getFloat(), this.bw0.getFloat());
    }

    public final void MI(C8 value) {
        if (this.bw0.get() == 3) {
            value.x = this.bw0.getFloat();
            value.y = this.bw0.getFloat();
            value.z = this.bw0.getFloat();
        }
    }

    public final void COM3(C8 value) {
        if (value == null) {
            this.bw0.put((byte)0);
            return;
        }
        this.bw0.put((byte)3);
        this.bw0.putFloat(value.x);
        this.bw0.putFloat(value.y);
        this.bw0.putFloat(value.z);
    }
}
