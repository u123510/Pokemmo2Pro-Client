package cn.pokemmo.graphics.effect;

import com.badlogic.gdx.graphics.Color;
import f.BM;
import f.C8;
import f.I2;
import f.U7;
import f.mb0_2;
import f.sh_0;
import f.ut_0;

public class OrangeTintEffect extends U7 {
    public OrangeTintEffect(ut_0 owner) {
        super(lpT6(owner), Color.ORANGE, true, 0.7f, new int[]{3, 4, 5});
    }

    public static ut_0 lpT6(ut_0 owner) {
        I2 iterator = owner.Cs.ZD();
        while (iterator.hasNext()) {
            BM value = (BM) iterator.next();
            value.LPT8(new sh_0(1.0f));
            value.LPT8(new mb0_2(mb0_2.k6, 0.01f));
        }
        return owner;
    }

    @Override
    public void eo0(C8 value) {
        C8 tint = U7.zc0;
        tint.x = value.x;
        tint.y = value.y;
        tint.z = value.z;
        tint.Vy(0.0f, 0.05f, 0.0f);
        super.eo0(value);
    }
}
