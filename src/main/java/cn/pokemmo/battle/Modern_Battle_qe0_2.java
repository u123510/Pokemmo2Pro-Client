package cn.pokemmo.battle;

import f.*;
import java.util.Arrays;

/**
 * 现代化重构类 - 原始混淆类: f.qe0_2
 */
public class Modern_Battle_qe0_2 {

    public static final short[] kX = new short[]{-1, -1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0};
    public byte Fw = 0;
    public final short[] pr = (short[])kX.clone();
    public final byte[] iu0 = new byte[q10_0.Pn0.length];

    public Modern_Battle_qe0_2() {
    }

    public Modern_Battle_qe0_2(qe0_2 qe0_22) {
        this.CoM4(qe0_22);
    }

    public final byte Ih0() {
        return this.Fw;
    }

    public final void KA0(byte by, q10_0 q10_02, short s) {
        Modern_Battle_qe0_2 qe0_22 = this;
        byte by2 = q10_02.iL;
        qe0_22.pr[by2] = s;
        qe0_22.iu0[by2] = by;
    }

    public final void CoM4(qe0_2 qe0_22) {
        this.Fw = qe0_22.Fw;
        int n = 0;
        while (true) {
            short[] sArray = this.pr;
            if (n >= this.pr.length) break;
            sArray[n] = qe0_22.pr[n];
            this.iu0[n] = qe0_22.iu0[n];
            ++n;
        }
    }

    public final qe0_2 je0() {
        return new qe0_2((qe0_2)this);
    }

    public final boolean equals(Object object) {
        block4: {
            if (!(object instanceof qe0_2)) {
                return false;
            }
            object = (qe0_2)object;
            if (this.Fw != ((qe0_2)object).Fw) {
                return false;
            }
            if (!Arrays.equals(this.pr, ((qe0_2)object).pr)) {
                return false;
            }
            int n = 0;
            while (true) {
                byte[] byArray = this.iu0;
                if (n >= this.iu0.length) break block4;
                byte by = byArray[n];
                byte by2 = ((qe0_2)object).iu0[n];
                if (by != by2 && (by > 0 || by2 > 0)) break;
                ++n;
            }
            return false;
        }
        return true;
    }
}


