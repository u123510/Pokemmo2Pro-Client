package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.tb0_1
 */
public class Modern_Util_tb0_1 {

    public final O8 Ua0;
    public final byte Ni;
    public final byte X90;
    public se_0 B3;
    public byte uG0;
    public boolean lQ;

    public Modern_Util_tb0_1(O8 o8, byte b, byte b2) {
        this.B3 = new se_0();
        this.uG0 = 0;
        this.Ua0 = o8;
        this.Ni = b;
        this.X90 = b2;
    }

    public final void eo0(CH0 ch0, short s, byte b, String str, byte b2, byte b3, short s2, short s3, short s4, short s5, QL ql, byte b4, byte b5) {
        se_0 se0 = this.B3;
        se0.Bn.YD0 = ch0;
        se0.Bn.Yb0 = s;
        se0.ZE0 = (cq_0) mp_1.vf0().k2.get(Short.valueOf(se0.Bn.Yb0));
        CE ce = se0.Bn;
        ce.wj = b;
        ce.kX = str;
        ce.n7(s2);
        se0.D4 = b2;
        se0.nF0 = b3;
        se0.T0 = s3;
        if (b5 < 0 || b5 > 24) {
            b5 = 3;
        }
        se0.Bn.QQ = b5;
        se0.Vg0 = ql;
        se0.Bn.hB(s4);
        se0.Sj = s5;
        se0.Bn.H1 = (byte) (se0.Bn.H1 | b4);
        this.uG0 = 1;
        this.Wb();
    }

    public final CH0 tz0() {
        if (this.gQ()) {
            return this.B3.Bn.YD0;
        }
        return CH0.j1;
    }

    public final se_0 zG() {
        return this.B3;
    }

    public final boolean gQ() {
        return this.uG0 == 1;
    }

    public final void Wb() {
        if (!this.lQ) {
            this.lQ = true;
            lg_0.k.lPT5(this::Jt0);
        }
    }

    public final void Jt0() {
        if (this.Ua0.lpT2 == null) {
            this.lQ = false;
            return;
        }
        Oz0 oz0 = tw0_0.LD0.he0;
        if (oz0 != null) {
            oz0.N10.jg0((tb0_1)this);
        }
        this.lQ = false;
    }
}

