package cn.pokemmo.graphics.texture;

import f.K40;
import f.wk0_1;

public class TextureBoundsParserB implements wk0_1 {
    public final String[] ug0;

    public TextureBoundsParserB(String[] strArr) {
        this.ug0 = strArr;
    }

    @Override
    public void s2(Object obj) {
        K40 k40 = (K40) obj;
        k40.p5 = Integer.parseInt(this.ug0[1]);
        k40.N1 = Integer.parseInt(this.ug0[2]);
        k40.vQ = Integer.parseInt(this.ug0[3]);
        k40.wz = Integer.parseInt(this.ug0[4]);
    }
}
