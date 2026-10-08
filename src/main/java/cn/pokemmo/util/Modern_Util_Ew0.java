package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Ew0
 */
public class Modern_Util_Ew0 extends pc0_2 {

    public Modern_Util_Ew0() {
        super();
    }

    public final C8 Tv = new C8();
    public final C8 LPt5 = new C8();
    public float gp;
    public float Bd;
    public float Ja0;

    public void h30(Ew0 other) {
        if (other.l0 != null) {
            this.l0.set(other.l0);
        }
        if (other.Tv != null) {
            this.Tv.x = other.Tv.x;
            this.Tv.y = other.Tv.y;
            this.Tv.z = other.Tv.z;
        }
        if (other.LPt5 != null) {
            this.LPt5.x = other.LPt5.x;
            this.LPt5.y = other.LPt5.y;
            this.LPt5.z = other.LPt5.z;
            this.LPt5.KM();
        }
        this.gp = other.gp;
        this.Bd = other.Bd;
        this.Ja0 = other.Ja0;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Ew0 && this.vI((Ew0)object);
    }

    public boolean vI(Ew0 other) {
        return other != null && (other == this
                || this.l0.equals(other.l0)
                && this.Tv.equals(other.Tv)
                && this.LPt5.equals(other.LPt5)
                && LW.LH0(this.gp, other.gp)
                && LW.LH0(this.Bd, other.Bd)
                && LW.LH0(this.Ja0, other.Ja0));
    }
}

