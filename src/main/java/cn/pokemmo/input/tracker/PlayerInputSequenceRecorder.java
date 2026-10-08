package cn.pokemmo.input.tracker;

import f.*;

import java.util.ArrayList;

public class PlayerInputSequenceRecorder implements nk0_0 {
    public ArrayList Lq0;
    public final in_2 Hh0;
    public final long G;
    public final long Wm;
    public boolean Uq0;

    public PlayerInputSequenceRecorder(long j) {
        this.Lq0 = new ArrayList();
        this.Hh0 = new in_2(2000).ng0();
        long l = System.nanoTime() / 1000000L;
        this.G = l;
        this.Wm = l + j;
        Cj0();
        _finally.HG().dH0(new Wd((gz_1) this), (float) j / 1000.0f);
    }

    public final void Cj0() {
        lj0_2 lj0_22 = new lj0_2((byte) 9);
        lj0_22.Zi0 = System.nanoTime() / 1000000L - this.G;
        lj0_22.lpT3 = (short) lg_0.S4.Kr0();
        lj0_22.Dl = (short) lg_0.S4.sD0();
        this.Lq0.add(lj0_22);
        if (this.Lq0.size() > 200 || this.Hh0.ty0()) {
            kw();
        }
    }

    @Override
    public final boolean GH0(int i) {
        if (i == 160) {
            i = 66;
        }
        eq0((byte) 0, i, Yo0.tl(i, true) + 1, 0, 0, 0);
        return false;
    }

    @Override
    public final boolean pH0(int i) {
        if (i == 160) {
            i = 66;
        }
        eq0((byte) 1, i, Yo0.tl(i, true) + 1, 0, 0, 0);
        return false;
    }

    @Override
    public final boolean R8(int i, int i2, int i3, int i4) {
        eq0((byte) 2, i4, 0, i3, i, i2);
        return false;
    }

    @Override
    public final boolean kh(int i, int i2, int i3, int i4) {
        eq0((byte) 3, i4, 0, i3, i, i2);
        return false;
    }

    @Override
    public final boolean EA0(int i, int i2) {
        eq0((byte) 4, 0, 0, 0, i, i2);
        return false;
    }

    @Override
    public final boolean Xl(int i, boolean bl) {
        if (i == 160) {
            i = 66;
        }
        int n = bl ? 5 : 6;
        eq0((byte) n, i, Yo0.tl(i, true) + 1, 0, 0, 0);
        return false;
    }

    @Override
    public final boolean qT(int i, boolean bl) {
        if (i == 160) {
            i = 66;
        }
        int n = bl ? 7 : 8;
        eq0((byte) n, i, Yo0.tl(i, true) + 1, 0, 0, 0);
        return false;
    }

    @Override
    public final boolean i00(char c) {
        return false;
    }

    @Override
    public final boolean Ao0(int i, int i2, int i3) {
        eq0((byte) 14, 0, 0, i3, i, i2);
        return false;
    }

    @Override
    public final boolean gl0(float f, float f2) {
        return false;
    }

    public final void eq0(byte b, int i, int i2, int i3, int i4, int i5) {
        long l;
        if (this.Uq0) {
            return;
        }
        lj0_2 lj0_22 = new lj0_2(b);
        if (b == 14 || (b >= 0 && b <= 4)) {
            l = lg_0.lW.ki.yo0;
        } else {
            l = System.nanoTime();
        }
        lj0_22.Zi0 = l / 1000000L - this.G;
        lj0_22.Ya0 = (byte) i5;
        lj0_22.ka0 = (byte) i4;
        lj0_22.uu0 = (byte) i3;
        lj0_22.lpT3 = (short) i2;
        lj0_22.Dl = (short) i;
        this.Lq0.add(lj0_22);
        if (this.Lq0.size() > 200 || this.Hh0.ty0()) {
            kw();
        }
        if (System.nanoTime() / 1000000L >= this.Wm && !this.Uq0) {
            this.Uq0 = true;
            kw();
            tw0_0.Xl0.HV.sj0(this, true);
        }
    }

    public final void kw() {
        ArrayList arrayList = this.Lq0;
        this.Lq0 = new ArrayList();
        BR bR = tw0_0.rl;
        if (bR != null && bR.fk0 != null && bR.fk0.Co0 == 5) {
            bR.fk0.uQ(new GW(this.Uq0, arrayList));
        }
    }
}
