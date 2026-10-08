package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.hn_0
 */
public class Modern_Util_Hn0
implements LB0 {

    public final /* synthetic */ int hm;
    public final /* synthetic */ float Qm;
    public final /* synthetic */ float Fl0;
    public final /* synthetic */ MU vw;

    public Modern_Util_Hn0(MU mU, int n, float f, float f2) {
        this.vw = mU;
        this.hm = n;
        this.Qm = f;
        this.Fl0 = f2;
    }

    @Override
    public final void LPT3(int n, D2 d2) {
        ao_1 ao_12 = ao_1.pc(new qo_2((hn_0)this));
        float f = (this.Qm + this.Fl0) / 1000.0f;
        ao_12.Sq0 += f;
        ao_12.Ms(this.vw.Vs.wP);
    }
}


