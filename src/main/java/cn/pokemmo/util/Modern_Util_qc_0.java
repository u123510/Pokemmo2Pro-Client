package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.qc_0
 */
public class Modern_Util_qc_0
extends ei_0 {

    public final int EH0;
    public final /* synthetic */ V7 bQ;

    public Modern_Util_qc_0(int n, V7 v7) {
        this.bQ = v7;
        this.EH0 = n;
    }

    @Override
    public final float vB() {
        return this.bQ.PW.o6(this.EH0);
    }

    @Override
    public final float Uu() {
        this.bQ.PW.getClass();
        return 0.0f;
    }

    @Override
    public final float ff() {
        return this.bQ.Ou[this.EH0];
    }

    @Override
    public final void MK0(float f) {
        Modern_Util_qc_0 qc_02 = this;
        qc_02.bQ.Ou[this.EH0] = f;
        a7_0.bH(qc_02.RD0);
        qc_02.bQ.LC(true);
    }
}


