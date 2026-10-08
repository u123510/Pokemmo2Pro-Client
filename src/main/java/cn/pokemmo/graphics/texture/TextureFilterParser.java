package cn.pokemmo.graphics.texture;

import f.eb0_1;
import f.uj_2;
import f.wk0_1;

public class TextureFilterParser implements wk0_1 {
    public final String[] qL0;

    public TextureFilterParser(String[] stringArray) {
        this.qL0 = stringArray;
    }

    @Override
    public void s2(Object object) {
        uj_2 value = (uj_2) object;
        value.mF = eb0_1.valueOf(this.qL0[1]);
        value.Zy = eb0_1.valueOf(this.qL0[2]);
        int n = value.mF.vv0;
        value.i8 = n != 9728 && n != 9729;
    }
}
