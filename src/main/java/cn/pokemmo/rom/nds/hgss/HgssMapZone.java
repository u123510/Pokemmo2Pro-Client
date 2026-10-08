package cn.pokemmo.rom.nds.hgss;

import f.*;
public class HgssMapZone extends XF0 {
    public final UY bE0;

    public HgssMapZone(UY v1, short s2, byte b3, short s4, TE v5) {
        super(v1, s2, b3, s4, v5);
        this.bE0 = v1;
        if (this.Ro0.Va0 != 0) {
            this.lm0 = gh_0.tA;
        } else {
            this.lm0 = gh_0.wZ;
        }
        this.gA();
    }

    @Override
    public final boolean Wp() {
        if (this.jE != null) {
            return true;
        }
        return tw0_0.rl.yh0.Ny(this.dw, (short) 1360);
    }

    @Override
    public final void gA() {
        super.gA();
        for (short i1 = 0; i1 < this.i80.It0; i1++) {
            for (short i2 = 0; i2 < this.i80.WH; i2++) {
                if (this.o6) {
                    int tileId = this.i80.l1[i1][i2];
                    if (tileId >= 0) {
                        this.uJ[i1][i2] = this.xk0.Sc0(tileId);
                    }
                }
                int footerId = this.i80.M70[i1][i2];
                if (footerId >= 0) {
                    short sFooter = (short) footerId;
                    if (this.sp0.bL0(sFooter)) {
                        sFooter = this.sp0.f5(sFooter);
                    }
                    qj0_1 footer = (qj0_1) this.bE0.FA(sFooter);
                    if (this.yd == 0 && this.ie == 0) {
                        this.yd = footer.qB0;
                        this.ie = footer.N70;
                    }
                    if (this.yd != footer.qB0 || this.ie != footer.N70) {
                        throw new RuntimeException("Matrix has mismatching footer sizes");
                    }
                    if (footer.Jk.length > this.Sm0) {
                        this.Sm0 = footer.Jk.length;
                    }
                }
            }
        }
    }

    @Override
    public final void hl(short i1, short i2) {
        int footerId = this.i80.M70[i1][i2];
        if (footerId >= 0) {
            short sFooter = (short) footerId;
            if (this.sp0.bL0(sFooter)) {
                sFooter = this.sp0.f5(sFooter);
            }
            qj0_1 footer = (qj0_1) this.bE0.FA(sFooter);
            this.Qm[i1][i2] = new ZQ(i1, i2, this, footer, this.i80);
        }
    }

    public final Ao0 ww(int i1, int i2) {
        return (Ao0) super.W4(i1, i2);
    }

    @Override
    public final Z50 W4(int i1, int i2) {
        return (Ao0) super.W4(i1, i2);
    }
}
