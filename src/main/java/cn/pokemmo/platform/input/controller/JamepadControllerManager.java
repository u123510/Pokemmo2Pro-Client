package cn.pokemmo.platform.input.controller;

import f.*;


import com.studiohartman.jamepad.ControllerIndex;
import java.util.UUID;

public class JamepadControllerManager implements LH0 {
    public static final nl_1 C90;
    public static final nl_1 m80;
    public static final Ls0 Pj;
    public final be0_0 Jk;
    public final nl_1 Pu;
    public final nl_1 vN;
    public final String I80;
    public final String vC0;
    public ControllerIndex ch;
    public boolean fJ;
    public int oF0;
    public int A50;

    private static void dummyThrow() throws lk0_0 {}

    public JamepadControllerManager(ControllerIndex v1) {
        this.Jk = new be0_0();
        this.Pu = new nl_1();
        this.vN = new nl_1();
        this.fJ = true;
        this.oF0 = -1;
        this.A50 = -1;
        this.ch = v1;
        this.I80 = UUID.randomUUID().toString();
        this.vC0 = kg();
        ly();
    }

    static {
        C90 = new nl_1(jz0_0.values().length);
        m80 = new nl_1(SW.values().length);
        Pj = new Ls0(JamepadControllerManager.class.getSimpleName());
        for (jz0_0 val : jz0_0.values()) {
            C90.qx0(val.ordinal(), val);
        }
        for (SW val : SW.values()) {
            m80.qx0(val.ordinal(), val);
        }
    }

    public final boolean gE0(int i1) {
        try {
            dummyThrow();
            jz0_0 btn = (jz0_0) C90.get(i1);
            if (btn != null && this.ch.O00(btn)) {
                return true;
            }
            return false;
        } catch (NullPointerException | lk0_0 unused) {
            RM();
            return false;
        }
    }

    public final float lV(int i1) {
        try {
            dummyThrow();
            SW axis = (SW) m80.get(i1);
            if (axis == null) {
                return 0.0f;
            }
            return this.ch.aI(axis);
        } catch (NullPointerException | lk0_0 unused) {
            RM();
            return 0.0f;
        }
    }

    public final void RM() {
        if (this.fJ) {
            this.fJ = false;
            if (this.ch != null) {
                Pj.Lj("Failed querying controller at index: " + this.ch.Ki);
            }
            this.Jk.Pr0(this);
        }
    }

    public final int SB() {
        int i1 = this.A50;
        if (i1 >= 0) {
            return i1;
        }
        this.A50 = C90.SZ - 1;
        while (true) {
            try {
                dummyThrow();
                int cur = this.A50;
                if (cur <= 0 || this.ch.Nt0((jz0_0) C90.get(cur))) {
                    break;
                }
                this.A50--;
            } catch (NullPointerException | lk0_0 unused) {
                RM();
                break;
            }
        }
        return this.A50;
    }

    public final int wE() {
        int i1 = this.oF0;
        if (i1 >= 0) {
            return i1;
        }
        this.oF0 = m80.SZ;
        while (true) {
            try {
                dummyThrow();
                int cur = this.oF0;
                if (cur <= 0 || this.ch.lM((SW) m80.get(cur - 1))) {
                    break;
                }
                this.oF0--;
            } catch (NullPointerException | lk0_0 unused) {
                RM();
                break;
            }
        }
        return this.oF0;
    }

    public final b9_0 YX() {
        if (b9_0.rN == null) {
            b9_0.rN = new b9_0();
        }
        return b9_0.rN;
    }

    public final oz_1 Kq() {
        try {
            switch (J90.Qj(this.ch.CB0())) {
                case 1:
                    return oz_1.XI0;
                case 2:
                    return oz_1.HF;
                case 3:
                    return oz_1.e3;
                case 4:
                    return oz_1.UJ0;
                case 5:
                    return oz_1.gw0;
                case 6:
                    return oz_1.UJ0;
                default:
                    return oz_1.Nx0;
            }
        } catch (Throwable unused) {
            return oz_1.Nx0;
        }
    }

    public final String kg() {
        try {
            dummyThrow();
            return this.ch.hq();
        } catch (NullPointerException | lk0_0 unused) {
            return "Unknown";
        }
    }

    public final void ly() {
        for (SW sw : SW.values()) {
            this.vN.qx0(sw.ordinal(), Float.valueOf(0.0f));
        }
        for (jz0_0 jz : jz0_0.values()) {
            this.Pu.qx0(jz.ordinal(), Boolean.FALSE);
        }
    }
}
