package cn.pokemmo.world.entity.movement;

import f.*;

public class CharacterMovementStepInterpolator implements mu_0 {
    public static final Float rc;
    public static final Integer Pm0;
    public static final Integer jN;
    public static final Integer lh0;
    public static os0_0 EF;
    public static CharacterMovementStepInterpolator Vr0;
    public nq_0 c6;
    public nq_0 Kc0;
    public nq_0 S9;
    public nq_0 HB0;
    public nq_0 xq0;
    public nq_0 VE0;
    public nq_0 COM6;
    public nq_0 lp;
    public nq_0 We0;
    public nq_0 ze;
    public nq_0 try$;
    public nq_0 Yh;
    public nq_0 kC0;
    public nq_0 t1;
    public Float Ia;
    public Float FG;
    public Integer gV;
    public Integer TQ;
    public Integer zu;
    public Integer kX;
    public Boolean BU;
    public Boolean xT;
    public te0_0 iC;
    public float S40;
    public float Ng;
    public float ix;
    public float In0;
    public boolean FN;
    public int ww0;
    public int iQ;
    public int qT;
    public float EI;
    public float X6;
    public float o8;
    public float EJ;

    public final void bL() {
        this.iC = null;
        this.FN = false;
        this.qT = -1;
        CharacterMovementStepInterpolator jd = Jd();
        this.mu0(jd);
    }

    public void mu0(CharacterMovementStepInterpolator v1) {
        this.c6 = v1.c6;
        this.Kc0 = v1.Kc0;
        this.S9 = v1.S9;
        this.HB0 = v1.HB0;
        this.xq0 = v1.xq0;
        this.VE0 = v1.VE0;
        this.COM6 = v1.COM6;
        this.lp = v1.lp;
        this.We0 = v1.We0;
        this.ze = v1.ze;
        this.try$ = v1.try$;
        this.Yh = v1.Yh;
        this.kC0 = v1.kC0;
        this.t1 = v1.t1;
        this.Ia = v1.Ia;
        this.FG = v1.FG;
        this.gV = v1.gV;
        this.TQ = v1.TQ;
        this.zu = v1.zu;
        this.kX = v1.kX;
        this.BU = v1.BU;
        this.xT = v1.xT;
    }

    public void f70(CharacterMovementStepInterpolator v1) {
        if (v1 == null) {
            return;
        }
        if (v1.c6 != null) {
            this.c6 = v1.c6;
        }
        if (v1.Kc0 != null) {
            this.Kc0 = v1.Kc0;
        }
        if (v1.S9 != null) {
            this.S9 = v1.S9;
        }
        if (v1.HB0 != null) {
            this.HB0 = v1.HB0;
        }
        if (v1.xq0 != null) {
            this.xq0 = v1.xq0;
        }
        if (v1.VE0 != null) {
            this.VE0 = v1.VE0;
        }
        if (v1.COM6 != null) {
            this.COM6 = v1.COM6;
        }
        if (v1.lp != null) {
            this.lp = v1.lp;
        }
        if (v1.We0 != null) {
            this.We0 = v1.We0;
        }
        if (v1.ze != null) {
            this.ze = v1.ze;
        }
        if (v1.try$ != null) {
            this.try$ = v1.try$;
        }
        if (v1.Yh != null) {
            this.Yh = v1.Yh;
        }
        if (v1.kC0 != null) {
            this.kC0 = v1.kC0;
        }
        if (v1.t1 != null) {
            this.t1 = v1.t1;
        }
        if (v1.Ia != null) {
            this.Ia = v1.Ia;
        }
        if (v1.FG != null) {
            this.FG = v1.FG;
        }
        if (v1.gV != null) {
            this.gV = v1.gV;
        }
        if (v1.TQ != null) {
            this.TQ = v1.TQ;
        }
        if (v1.zu != null) {
            this.zu = v1.zu;
        }
        if (v1.kX != null) {
            this.kX = v1.kX;
        }
        if (v1.BU != null) {
            this.BU = v1.BU;
        }
        if (v1.xT != null) {
            this.xT = v1.xT;
        }
    }

    @Override
    public final String toString() {
        te0_0 v1 = this.iC;
        if (v1 != null) {
            return v1.toString();
        }
        return super.toString();
    }

    public CharacterMovementStepInterpolator() {
        this.qT = -1;
        CharacterMovementStepInterpolator v1 = Jd();
        if (v1 != null) {
            this.mu0(v1);
        }
    }

    public static CharacterMovementStepInterpolator Jd() {
        os0_0 v0 = EF;
        if (v0 == null || v0 != lg_0.I70) {
            EF = lg_0.I70;
            CharacterMovementStepInterpolator v0_2 = new CharacterMovementStepInterpolator();
            Vr0 = v0_2;
            v0_2.c6 = nq_0.AT;
            Vr0.Kc0 = nq_0.B9;
            Vr0.S9 = nq_0.vb0;
            Vr0.HB0 = nq_0.A90;
            Vr0.xq0 = nq_0.w3;
            Vr0.VE0 = nq_0.kt;
            nq_0 v0_3 = nq_0.cj0;
            Vr0.COM6 = v0_3;
            Vr0.lp = v0_3;
            Vr0.We0 = v0_3;
            Vr0.ze = v0_3;
            Vr0.try$ = v0_3;
            Vr0.Yh = v0_3;
            Vr0.kC0 = v0_3;
            Vr0.t1 = v0_3;
            Float v0_4 = rc;
            Vr0.Ia = v0_4;
            Vr0.FG = v0_4;
            Vr0.gV = lh0;
            Integer v0_5 = Pm0;
            Vr0.TQ = v0_5;
            Vr0.zu = v0_5;
            Vr0.kX = jN;
            Vr0.BU = null;
            Vr0.xT = null;
        }
        return Vr0;
    }

    static {
        rc = Float.valueOf(0.0f);
        Pm0 = Integer.valueOf(0);
        Integer v0 = Integer.valueOf(1);
        jN = v0;
        lh0 = v0;
    }
}
