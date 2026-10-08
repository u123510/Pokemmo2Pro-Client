package cn.pokemmo.graphics.effect;

import com.badlogic.gdx.graphics.Color;
import f.BM;
import f.I2;
import f.JO;
import f.Ou0;
import f.PRN_;
import f.vt_0;

public abstract class FlowerEffectModifier {
    public static void xo(vt_0 v0) {
        I2 v0_iter = v0.mT.ZD();
        while (v0_iter.hasNext()) {
            JO v1 = (JO) v0_iter.next();
            if (v1.QW.hashCode() == -115523339) {
                v1.zr = true;
            }
        }
    }

    public static void o8(Ou0 v0) {
        BM bm = v0.ff0("grow_flower_lm1");
        if (bm != null) {
            Color color = new Color(-134416641);
            bm.LPT8(new PRN_(PRN_.Ly, color));
        }
    }
}
