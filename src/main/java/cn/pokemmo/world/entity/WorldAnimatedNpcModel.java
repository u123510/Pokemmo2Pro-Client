package cn.pokemmo.world.entity;

import f.*;

public class WorldAnimatedNpcModel extends sr0_0 {
    public final short k90;
    public final LT[] C80;
    public final C8 Fk;
    public float J70;


    public WorldAnimatedNpcModel(XF0 v1, short i2, short i3, byte i4, short i5, short i6) {
        super(v1, (ZQ) null, i2, i3, i4);
        this.C80 = new LT[4];
        this.Fk = new C8();
        this.k90 = i5;
        this.dH = i6;
    }


    public final boolean gr0() {
        return true;
    }


    public final float S80() {
        return this.Fk.y;
    }


    public final float XC0() {
        return this.J70;
    }


    public final byte re() {
        return (byte) this.k90;
    }


    public final short Kv() {
        return this.k90;
    }


    public final short switch$() {
        return this.dH;
    }


    public final LT JG0(byte i1) {
        if (i1 >= 0 && i1 <= 3) {
            return this.C80[i1];
        }
        return null;
    }


    public final void Nn0(byte i1, Ll0 v2) {
        this.C80[i1] = (LT) v2;
    }


    public final C8 Ki() {
        return this.Fk;
    }
}
