package cn.pokemmo.util.collection;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.p0_0
 */
public class Modern_Col_p0_0
implements wk0_1 {

    public final /* synthetic */ String[] gE0;
    public final /* synthetic */ boolean[] IF0;

    public Modern_Col_p0_0(String[] stringArray, boolean[] blArray) {
        this.gE0 = stringArray;
        this.IF0 = blArray;
    }

    @Override
    public final void s2(Object object) {
        object = (K40)object;
        ((K40)object).Nl = Integer.parseInt(this.gE0[1]);
        if (((K40)object).Nl != -1) {
            this.IF0[0] = true;
        }
    }
}


