package cn.pokemmo.shop;

import f.*;

import java.util.ArrayList;
import java.util.List;

public class ShopTradeListingEntry {
    public final mc0_1 XH0;
    public final yj_2 h5;
    public final cq_0 lq0;
    public final cr_0 sp;
    public int zB0;
    public final short fJ;
    public int PrN;
    public final short jC;
    public final ArrayList Na0;
    public final ArrayList qs;

    public ShopTradeListingEntry(mc0_1 mc0_12, cr_0 cr_02, int i, short s, int i2, short s2) {
        this.Na0 = new ArrayList();
        this.qs = new ArrayList();
        this.XH0 = mc0_12;
        this.lq0 = null;
        this.h5 = null;
        this.sp = cr_02;
        this.zB0 = i;
        this.fJ = s;
        this.PrN = i2;
        this.jC = s2;
    }

    public ShopTradeListingEntry(cq_0 cq_02, cr_0 cr_02, int i, int i2) {
        this.Na0 = new ArrayList();
        this.qs = new ArrayList();
        this.XH0 = null;
        this.lq0 = cq_02;
        this.h5 = null;
        this.sp = cr_02;
        this.zB0 = i;
        this.fJ = 1;
        this.PrN = i2;
        this.jC = (short) 32767;
    }

    public ShopTradeListingEntry(yj_2 yj_22, cr_0 cr_02, short s, int i, short s2) {
        this.Na0 = new ArrayList();
        this.qs = new ArrayList();
        this.XH0 = null;
        this.lq0 = null;
        this.h5 = yj_22;
        this.sp = cr_02;
        this.zB0 = 0;
        this.fJ = s;
        this.PrN = i;
        this.jC = s2;
    }

    public final mc0_1 gk() {
        return this.XH0;
    }

    public final cq_0 fT() {
        return this.lq0;
    }

    public final yj_2 k6() {
        return this.h5;
    }

    public int oF0() {
        if (this.XH0 != null && this.zB0 < 1) {
            return this.XH0.TD;
        }
        return this.zB0;
    }

    public final short n7() {
        return this.fJ;
    }

    public short Sv0() {
        if (this.XH0 != null) {
            short s = this.jC;
            short s2 = this.XH0.sh0;
            if (s2 < s) {
                return s;
            }
            if (this.fJ > 0) {
                return (short) (s2 / this.fJ);
            }
            return s2;
        }
        return 1;
    }

    public CH0 uq() {
        throw new RuntimeException("Not supported");
    }

    public final int d9() {
        return this.PrN;
    }

    public final void hG(int i) {
        this.PrN = i;
    }

    public final short FE() {
        if (this.XH0 != null) {
            return this.XH0.Z8;
        }
        if (this.lq0 != null) {
            return this.lq0.dR;
        }
        if (this.h5 != null) {
            return this.h5.su;
        }
        return 0;
    }

    public final List wv0() {
        return this.Na0;
    }

    public final String JJ0() {
        if (this.XH0 != null) {
            if (!this.XH0.TL() && tw0_0.kz0()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(sm0_0.c0(this.XH0.Nl));
                if (!this.XH0.TL()) {
                    stringBuilder.append(" (").append(sm0_0.c0(1425)).append(")");
                } else if (this.XH0.M80) {
                    stringBuilder.append(" (").append(sm0_0.c0(1447)).append(")");
                }
                return stringBuilder.toString();
            }
            return sm0_0.c0(this.XH0.Nl);
        }
        if (this.h5 != null) {
            return this.h5.FL0();
        }
        return "";
    }

    public final String i60() {
        if (this.XH0 != null) {
            if (!this.XH0.TL() && !tw0_0.kz0()) {
                StringBuilder stringBuilder = new StringBuilder();
                if (!this.XH0.TL()) {
                    stringBuilder.append(sm0_0.c0(1425)).append("\n");
                } else if (this.XH0.M80) {
                    stringBuilder.append(sm0_0.c0(1448)).append("\n");
                }
                if (stringBuilder.length() > 0) {
                    stringBuilder.append("\n");
                }
                stringBuilder.append(this.XH0.Com4((byte) -1, 38));
                return stringBuilder.toString();
            }
            return this.XH0.Com4((byte) -1, 38);
        }
        if (this.h5 != null) {
            if (!this.h5.oF0) {
                return sm0_0.c0(1451);
            }
            return sm0_0.c0(this.h5.su + 295000);
        }
        return "";
    }
}
