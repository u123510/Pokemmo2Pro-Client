package cn.pokemmo.input.controller;

import f.*;

public class TouchTapInputPredicate implements ge0_1 {
    public static final Bp0 JX;

    public TouchTapInputPredicate() {
    }

    @Override
    public final boolean my(mx0 value) {
        if (!(value instanceof ni_1)) {
            return false;
        }
        ni_1 event = (ni_1) value;
        int kind = vc0_0.rX[event.wv.ordinal()];
        if (kind == 1 || kind == 2 || kind == 3) {
            return false;
        }

        Bp0 point = JX;
        point.x = event.hC0;
        point.y = event.Ki;
        event.vB0.Do0(point);

        switch (kind) {
            case 4: {
                boolean handled = this.DP(event, point.x, point.y, event.bF, event.mF);
                if (handled && event.ew) {
                    ir_0 owner = event.BX;
                    te0_0 source = event.vB0;
                    te0_0 target = event.bA;
                    target.getClass();
                    SI signal = (SI) UE0.TL0(SI.class).obtain();
                    signal.Mb0 = source;
                    signal.k0 = target;
                    signal.CF = this;
                    signal.Up = event.bF;
                    signal.JQ = event.mF;
                    owner.ql.Ue0(signal);
                }
                return handled;
            }
            case 5:
                this.static$(event, point.x, point.y, event.bF, event.mF);
                return true;
            case 6:
                this.Ri0(event, point.x, point.y, event.bF);
                return true;
            case 7:
                this.BW();
                return false;
            case 8:
                return this.tI(event.ks0, event.coM1);
            case 9:
                this.GI(event.bF);
                return false;
            case 10:
                this.IF0(event.bF);
                return false;
            default:
                return false;
        }
    }

    public boolean DP(ni_1 event, float x, float y, int pointer, int button) {
        return false;
    }

    public void static$(ni_1 event, float x, float y, int pointer, int button) {
    }

    public void Ri0(ni_1 event, float x, float y, int pointer) {
    }

    public void BW() {
    }

    public void GI(int pointer) {
    }

    public void IF0(int pointer) {
    }

    public boolean tI(float x, float y) {
        return false;
    }

    static {
        JX = new Bp0();
    }
}
