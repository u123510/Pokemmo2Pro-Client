package cn.pokemmo.graphics.texture;

import f.K40;
import f.wk0_1;

public class TextureRotationParser implements wk0_1 {
    public final String[] vu;

    public TextureRotationParser(String[] v1) {
        this.vu = v1;
    }

    @Override
    public void s2(Object v1) {
        K40 k = (K40) v1;
        String s = this.vu[1];
        if ("true".equals(s)) {
            k.Vj0 = 90;
        } else if (!"false".equals(s)) {
            k.Vj0 = Integer.parseInt(s);
        }
        k.H = (k.Vj0 == 90);
    }
}
