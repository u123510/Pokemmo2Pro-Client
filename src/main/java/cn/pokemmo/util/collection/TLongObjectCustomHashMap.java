package cn.pokemmo.util.collection;

import f.*;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;

public abstract class TLongObjectCustomHashMap implements Externalizable {
    static final long serialVersionUID = -1792948471915530295L;
    public transient int Rv;
    public transient int YB0;
    public float na0;
    public int zi0;
    public int Gj;
    public float yk0;
    public transient boolean o00;

    public TLongObjectCustomHashMap() {
        this(10, 0);
    }

    public TLongObjectCustomHashMap(int capacity) {
        this(capacity, 0);
    }

    public TLongObjectCustomHashMap(int capacity, int ignored) {
        this.o00 = false;
        this.na0 = 0.5F;
        this.yk0 = 0.5F;
        this.La(JS.Hf((float) capacity / 0.5F));
    }

    public final boolean isEmpty() {
        return this.Rv == 0;
    }

    public final int size() {
        return this.Rv;
    }

    public abstract int uT();

    public abstract int La(int capacity);

    public abstract void Pl(int capacity);

    public final void Sf0(int value) {
        this.zi0 = Math.min(value - 1, (int) (value * this.na0));
        this.YB0 = value - this.Rv;
    }

    public final void ov0(int value) {
        float ratio = this.yk0;
        if (ratio != 0.0F) {
            this.Gj = (int) (value * ratio + 0.5F);
        }
    }

    public final void OC0(boolean adjustFree) {
        if (adjustFree) {
            this.YB0--;
        }
        int count = this.Rv + 1;
        this.Rv = count;
        int threshold = this.zi0;
        if (count > threshold || this.YB0 == 0) {
            int capacity;
            if (count > threshold) {
                capacity = g00_0.Ql(this.uT() << 1);
            } else {
                capacity = this.uT();
            }
            this.Pl(capacity);
            this.Sf0(this.uT());
        }
    }

    @Override
    public void readExternal(ObjectInput input) throws IOException, ClassNotFoundException {
        input.readByte();
        this.na0 = input.readFloat();
        this.yk0 = input.readFloat();
        if (this.na0 != 0.0F) {
            this.La((int) Math.ceil(10.0 / this.na0));
        }
    }
}
