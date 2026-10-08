package cn.pokemmo.graphics.model;

import f.*;
import com.badlogic.gdx.graphics.Color;

public class ModelBoneMatrixCalculator {
    public String gD0;
    public Color OC;
    public Color py0;
    public Color Ry0;
    public float Yi;
    public float d7;
    public String P00;
    public String Hg0;
    public String ZN;
    public String ts0;
    public String xF0;

    public ModelBoneMatrixCalculator() {
        this.gD0 = "default";
        this.tt0();
    }

    public static void s00(ef0_1 target, String value, int index) {
        if (value == null) {
            return;
        }
        jx0_0 entry = new jx0_0();
        entry.for$ = index;
        entry.Dn0 = value;
        if (target.wX == null) {
            target.wX = new es_1(1);
        }
        target.wX.Ue0(entry);
    }

    public final ef0_1 A5() {
        ef0_1 result = new ef0_1();
        result.dq0 = this.gD0;
        result.dm0 = this.OC == null ? null : new Color(this.OC);
        result.lF0 = new Color(this.py0);
        result.xv = new Color(this.Ry0);
        result.xu0 = this.Yi;
        result.ai = this.d7;
        s00(result, this.P00, 9);
        s00(result, this.Hg0, 4);
        s00(result, this.ZN, 2);
        s00(result, this.xF0, 5);
        s00(result, this.ts0, 6);
        return result;
    }

    public final void tt0() {
        this.OC = null;
        this.py0 = Color.WHITE;
        this.Ry0 = Color.WHITE;
        this.Yi = 1F;
        this.d7 = 0F;
        this.P00 = null;
        this.Hg0 = null;
        this.ZN = null;
        this.ts0 = null;
        this.xF0 = null;
    }
}
