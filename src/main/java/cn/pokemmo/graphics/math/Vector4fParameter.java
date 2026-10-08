package cn.pokemmo.graphics.math;

import f.*;

public class Vector4fParameter implements ge0_1 {
    public static final Bp0 nW = new Bp0();
    public static final Bp0 lpT5 = new Bp0();

    public final C90 kJ0;
    public ni_1 Yb0;
    public te0_0 yA;

    public Vector4fParameter() {
        this(20.0f, 0.400000006f, 1.1000000238f, 2147483648.0f);
    }

    public Vector4fParameter(float first, float second, float third, float fourth) {
        this.kJ0 = new C90(first, second, third, fourth, new jj_1((FH0) this));
    }

    @Override
    public boolean my(mx0 value) {
        if (!(value instanceof ni_1)) {
            return false;
        }

        ni_1 event = (ni_1) value;
        te0_0 transform;
        switch (jt_1.Y9[event.wv.ordinal()]) {
            case 1:
                this.yA = event.vB0;
                this.kJ0.Qh(event.bF, event.mF, event.hC0, event.Ki);

                transform = this.yA;
                nW.x = event.hC0;
                nW.y = event.Ki;
                transform.Do0(nW);

                int firstIndex = event.bF;
                int secondIndex = event.mF;
                if (event.ew) {
                    ir_0 owner = event.BX;
                    te0_0 source = event.vB0;
                    te0_0 target = event.bA;
                    target.getClass();

                    SI signal = (SI) UE0.TL0(SI.class).obtain();
                    signal.Mb0 = source;
                    signal.k0 = target;
                    signal.CF = this;
                    signal.Up = firstIndex;
                    signal.JQ = secondIndex;
                    owner.ql.Ue0(signal);
                }
                return true;

            case 2:
                float x = event.hC0;
                if (x == -2147483648.0f) {
                    this.kJ0.WC = 0L;
                    this.kJ0.km = false;
                    this.kJ0.t40 = false;
                    this.kJ0.Hs0.dg = 0L;
                    return false;
                }

                float y = event.Ki;
                if (y == -2147483648.0f) {
                    this.kJ0.WC = 0L;
                    this.kJ0.km = false;
                    this.kJ0.t40 = false;
                    this.kJ0.Hs0.dg = 0L;
                    return false;
                }

                this.Yb0 = event;
                this.yA = event.vB0;
                this.kJ0.jo0(event.bF, event.mF, x, y);

                transform = this.yA;
                nW.x = event.hC0;
                nW.y = event.Ki;
                transform.Do0(nW);
                return true;

            case 3:
                this.Yb0 = event;
                this.yA = event.vB0;
                this.kJ0.A(event.bF, event.hC0, event.Ki);
                return true;

            default:
                return false;
        }
    }

    public void Rv0(float first, float second) {
    }

    public void jj(float first, float second) {
    }
}
