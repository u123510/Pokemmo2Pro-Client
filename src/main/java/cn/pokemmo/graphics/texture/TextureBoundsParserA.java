package cn.pokemmo.graphics.texture;

import f.K40;
import f.wk0_1;

public class TextureBoundsParserA implements wk0_1 {
    public final String[] rF;

    public TextureBoundsParserA(String[] strArr) {
        this.rF = strArr;
    }

    @Override
    public void s2(Object obj) {
        K40 k40 = (K40) obj;
        k40.gr = Integer.parseInt(this.rF[1]);
        k40.n = Integer.parseInt(this.rF[2]);
        k40.dN = Integer.parseInt(this.rF[3]);
        k40.F = Integer.parseInt(this.rF[4]);
    }
}
