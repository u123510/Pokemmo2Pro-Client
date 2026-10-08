package cn.pokemmo.ui.widget.component;

import f.*;
import java.nio.ByteBuffer;

public class NumericCounterProgressBar extends bH0 {
    public NumericCounterProgressBar(byte ignored, short width, short mode, ByteBuffer data) {
        super(data);
        this.xX = data.getShort();
        data.getShort();
        this.iA = Wy0(data.get());
        this.Lm = data.get();
        if (width == 136 && mode == 0) {
            this.Lm = 2;
        }
        this.Zv = data.getShort() == 1;
        if (this.Zv) {
            this.YI0 = data.getShort();
            this.JI0 = data.getShort();
            this.G90 = data.getShort();
        } else {
            this.r1 = data.getShort();
            this.vd = data.getShort();
            this.l80 = data.getShort();
        }
        this.uB0 = data.getShort();
        this.SO = data.getShort();
        data.getShort();
    }

    @Override
    public final short r30() {
        return (short) (this.r1 >> 4);
    }

    @Override
    public final void g70(short value) {
        this.r1 = (short) (value * 16 + 8);
    }

    @Override
    public final short Ij() {
        return (short) (this.l80 >> 4);
    }

    @Override
    public final void Zo0(short value) {
        this.l80 = (short) (value * 16 + 8);
    }

    @Override
    public final float uc() {
        return this.vd / 16.0f;
    }

    @Override
    public final void x80(float value) {
        this.vd = (short) (value * 16.0f);
    }
}
