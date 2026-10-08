package cn.pokemmo.ui.layout.container;

import f.*;

/** Layout parameters attached to one child of a {@link bk_2} container. */
public class ContainerLayoutParams {
    public IT sn0;
    public IT jQ;
    public IT Mu;
    public IT CoM5;
    public IT Nk0;
    public IT xK;
    public IT IJ0;
    public IT wv;
    public IT FI0;
    public IT rN;
    public IT Yg;
    public IT Ek0;
    public IT ck0;
    public IT J90;
    public Float rs0;
    public Float LPt7;
    public Integer mA;
    public Integer Hb0;
    public Integer i8;
    public Boolean zw;
    public Integer d80;
    public Boolean or0;
    public Boolean OI;
    public Object kh0;
    public float Ne;
    public float Yg0;
    public float Zd;
    public float h50;
    public bk_2 Rr0;
    public boolean Hs;
    public int Fu0;
    public int pr;
    public int gZ = -1;
    public float hB0;
    public float KW;
    public float Hd;
    public float Yw;

    public void K70(ContainerLayoutParams other) {
        if (other == null) return;
        IT value = other.sn0;
        if (value != null) this.sn0 = value;
        value = other.jQ;
        if (value != null) this.jQ = value;
        value = other.Mu;
        if (value != null) this.Mu = value;
        value = other.CoM5;
        if (value != null) this.CoM5 = value;
        value = other.Nk0;
        if (value != null) this.Nk0 = value;
        value = other.xK;
        if (value != null) this.xK = value;
        value = other.IJ0;
        if (value != null) this.IJ0 = value;
        value = other.wv;
        if (value != null) this.wv = value;
        value = other.FI0;
        if (value != null) this.FI0 = value;
        value = other.rN;
        if (value != null) this.rN = value;
        value = other.Yg;
        if (value != null) this.Yg = value;
        value = other.Ek0;
        if (value != null) this.Ek0 = value;
        value = other.ck0;
        if (value != null) this.ck0 = value;
        value = other.J90;
        if (value != null) this.J90 = value;
        Float floatValue = other.rs0;
        if (floatValue != null) this.rs0 = floatValue;
        floatValue = other.LPt7;
        if (floatValue != null) this.LPt7 = floatValue;
        Integer intValue = other.mA;
        if (intValue != null) this.mA = intValue;
        intValue = other.Hb0;
        if (intValue != null) this.Hb0 = intValue;
        intValue = other.i8;
        if (intValue != null) this.i8 = intValue;
        Boolean boolValue = other.zw;
        if (boolValue != null) this.zw = boolValue;
        intValue = other.d80;
        if (intValue != null) this.d80 = intValue;
        boolValue = other.or0;
        if (boolValue != null) this.or0 = boolValue;
        boolValue = other.OI;
        if (boolValue != null) this.OI = boolValue;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T LPt4(float value) {
        IT size = new vl0_0(value);
        this.sn0 = size;
        this.Mu = size;
        this.Nk0 = size;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T Jq(float value) {
        IT size = new vl0_0(value);
        this.jQ = size;
        this.CoM5 = size;
        this.xK = size;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T Pt(float value) {
        this.sn0 = new vl0_0(value);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T VN(float value) {
        this.jQ = new vl0_0(value);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T ys0(float value) {
        IT size = new vl0_0(value);
        this.Yg = size;
        this.Ek0 = size;
        this.ck0 = size;
        this.J90 = size;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T o(float value) {
        this.Yg = new vl0_0(value);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T pK0(float value) {
        this.Ek0 = new vl0_0(value);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T Wa(float value) {
        this.ck0 = new vl0_0(value);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T Xs(float value) {
        this.J90 = new vl0_0(value);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T K6() {
        this.rs0 = 1.0F;
        this.LPt7 = 1.0F;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T Yt() {
        this.rs0 = 1.0F;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T tr0() {
        this.LPt7 = 1.0F;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T ru() {
        this.mA = 1;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T NA() {
        Integer value;
        if ((value = this.mA) == null) {
            this.mA = 2;
        } else {
            this.mA = value = Integer.valueOf(value.intValue() | 2);
            this.mA = Integer.valueOf(value.intValue() & 0xFFFFFFFB);
        }
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T Wa0() {
        Integer value;
        if ((value = this.mA) == null) {
            this.mA = 8;
        } else {
            this.mA = value = Integer.valueOf(value.intValue() | 8);
            this.mA = Integer.valueOf(value.intValue() & 0xFFFFFFEF);
        }
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T jN() {
        Integer value;
        if ((value = this.mA) == null) {
            this.mA = 4;
        } else {
            this.mA = value = Integer.valueOf(value.intValue() | 4);
            this.mA = Integer.valueOf(value.intValue() & 0xFFFFFFFD);
        }
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T GD() {
        Integer value;
        if ((value = this.mA) == null) {
            this.mA = 16;
        } else {
            this.mA = value = Integer.valueOf(value.intValue() | 16);
            this.mA = Integer.valueOf(value.intValue() & 0xFFFFFFF7);
        }
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T dw0() {
        this.Hb0 = 1;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T pJ0() {
        this.K6();
        this.Hb0 = 1;
        this.i8 = 1;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T goto$() {
        this.rs0 = 1.0F;
        this.Hb0 = 1;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T p20() {
        this.LPt7 = 1.0F;
        this.i8 = 1;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T ae0(Integer value) {
        this.d80 = value;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T yi0(le0_2 child) {
        return (T) this.Rr0.vx0(child);
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T im0() {
        return (T) this.Rr0.Rg();
    }

    public final void jW() {
        this.sn0 = null;
        this.jQ = null;
        this.Mu = null;
        this.CoM5 = null;
        this.Nk0 = null;
        this.xK = null;
        this.IJ0 = null;
        this.wv = null;
        this.FI0 = null;
        this.rN = null;
        this.Yg = null;
        this.Ek0 = null;
        this.ck0 = null;
        this.J90 = null;
        this.rs0 = null;
        this.LPt7 = null;
        this.mA = null;
        this.Hb0 = null;
        this.i8 = null;
        this.zw = null;
        this.d80 = null;
        this.or0 = null;
        this.OI = null;
    }

    public final void i50() {
        this.sn0 = IT.Fj0;
        this.jQ = IT.o9;
        this.Mu = IT.PM;
        this.CoM5 = IT.un;
        this.Nk0 = IT.GJ0;
        this.xK = IT.HY;
        NB defaults = IT.Wr0;
        this.IJ0 = defaults;
        this.wv = defaults;
        this.FI0 = defaults;
        this.rN = defaults;
        this.Yg = defaults;
        this.Ek0 = defaults;
        this.ck0 = defaults;
        this.J90 = defaults;
        this.rs0 = 0.0F;
        this.LPt7 = 0.0F;
        this.mA = 1;
        this.Hb0 = 0;
        this.i8 = 0;
        this.zw = Boolean.FALSE;
        this.d80 = 1;
        this.or0 = null;
        this.OI = null;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T tv0(le0_2 child) {
        bk_2 container = this.Rr0;
        container.eE0.getClass();
        Object old = this.kh0;
        if (old != child) {
            ((le0_2)container.Op).u3((le0_2)old);
            this.kh0 = child;
            if (child != null) {
                le0_2 parent = (le0_2)container.Op;
                parent.F9(parent.fU(), child);
            }
        }
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T Ha() {
        IT size = new vl0_0(36.0F);
        this.sn0 = size;
        this.jQ = size;
        this.Mu = size;
        this.CoM5 = size;
        this.Nk0 = size;
        this.xK = size;
        return (T) this;
    }

    public final void Yx() {
        this.sn0 = new vl0_0(300.0F);
        this.jQ = new vl0_0(240.0F);
    }

    @SuppressWarnings("unchecked")
    public <T extends ContainerLayoutParams> T bd() {
        this.xK = new vl0_0(525.0F);
        return (T) this;
    }

    public final void Oj() {
        this.i8 = 1;
    }
}
