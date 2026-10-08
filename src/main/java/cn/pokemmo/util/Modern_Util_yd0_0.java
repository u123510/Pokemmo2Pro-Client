package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.yd0_0
 */
public class Modern_Util_yd0_0
implements LB0 {

    public final /* synthetic */ int LN;
    public final /* synthetic */ byte bV;
    public final /* synthetic */ short h5;
    public final /* synthetic */ float Ms0;
    public final /* synthetic */ float Lr0;
    public final /* synthetic */ float FE0;
    public final /* synthetic */ MU SO;

    public Modern_Util_yd0_0(MU mU, int n, byte by, short s, float f, float f2, float f3) {
        this.SO = mU;
        this.LN = n;
        this.bV = by;
        this.h5 = s;
        this.Ms0 = f;
        this.Lr0 = f2;
        this.FE0 = f3;
    }

    @Override
    public final void LPT3(int n, D2 d2) {
        ao_1 ao_12 = ao_1.pc(new AY((yd0_0)this));
        float f = this.FE0 / 1000.0f;
        ao_12.Sq0 += f;
        ao_12.Ms(this.SO.Vs.wP);
    }
}


