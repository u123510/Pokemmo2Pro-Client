package cn.pokemmo.util.math;

import f.*;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public class FastTrigLookupTable {
    public static FastTrigLookupTable zU;
    public final q3_0 COn;
    public final q3_0 TK;
    public final vt_1 QQ;
    public final q3_0 ik;

    public FastTrigLookupTable() {
        i4_0 pixmap = new i4_0(1, 1, ix0_0.n2);
        int black = Color.BLACK.toIntBits();
        pixmap.oZ(0, 0, black);
        Texture texture = new Texture(pixmap);
        this.COn = new q3_0(new B5(texture));
        this.ik = new q3_0(new B5(texture));
        pixmap.dispose();

        pixmap = new i4_0(1, 1, ix0_0.n2);
        int white = Color.WHITE.toIntBits();
        pixmap.oZ(0, 0, white);
        this.TK = new q3_0(new B5(new Texture(pixmap)));
        pixmap.dispose();

        pixmap = new i4_0(1, 1, ix0_0.n2);
        int red = Color.RED.toIntBits();
        pixmap.oZ(0, 0, red);
        this.QQ = new vt_1(new B5(new Texture(pixmap)));
        pixmap.dispose();
    }

    public static FastTrigLookupTable zo0() {
        return nf_0.zo0();
    }

    public final void w30(int value, boolean active) {
        int target = 255;
        if (active) {
            target = Math.max(this.COn.kl0, this.TK.kl0);
        }
        this.COn.m(target, 0, value);
        this.TK.kl0 = 0;
        this.TK.xP = 0;
    }

    public final int t8() {
        int result = Math.max(0, this.TK.kl0);
        result = Math.max(result, this.COn.kl0);
        result = Math.max(result, this.QQ.kl0);
        return Math.max(result, this.ik.kl0);
    }
}
