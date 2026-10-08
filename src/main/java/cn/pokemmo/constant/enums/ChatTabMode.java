package cn.pokemmo.constant.enums;

import f.*;

import java.util.Arrays;

public enum ChatTabMode {
    finally$(0, -1, true),
    Bj0(1, 3, true),
    VI(2, 0, false),
    uz(3, 1, false),
    rg0(4, 2, true),
    Ci(5, -1, true),
    bb(6, -1, false),
    Xl(7, -1, true),
    pv(8, -1, false),
    l3(9, -1, false),
    Cw0(10, -1, false),
    Qh0(11, -1, false);

    public static final bm0_1 hL;
    public static final ChatTabMode[] Pn0;
    public static final ChatTabMode[] QR;
    public static X90[] pB;

    public final byte iL;
    public final byte NUl;
    public final boolean xB0;
    public final w7_0 Fk;

    ChatTabMode(int iL, int NUl, boolean xB0) {
        this.Fk = new w7_0();
        this.iL = (byte) iL;
        this.NUl = (byte) NUl;
        this.xB0 = xB0;
    }

    public static ChatTabMode Pt0(byte b) {
        return (ChatTabMode) t_0.BI0(hL.BM(b), ChatTabMode.class, b);
    }

    static {
        Pn0 = values();
        QR = Arrays.stream(values())
                .filter(v0 -> v0 != Cw0 && v0 != Qh0)
                .toArray(ChatTabMode[]::new);
        hL = new bm0_1();
        for (ChatTabMode v3 : Pn0) {
            hL.gE0(v3.iL, v3);
        }
    }

    public final byte Th0() {
        return this.iL;
    }

    public final X90 R00(short s) {
        return (X90) this.Fk.f5(s);
    }

    public final boolean Yy(short s) {
        X90 x90 = (X90) this.Fk.f5(s);
        if (x90 == null) {
            return false;
        }
        return x90.yt();
    }

    public final w7_0 Lu() {
        return this.Fk;
    }

    public final int DE() {
        return this.iL + 2871;
    }

    public final boolean Wo(short s) {
        X90 x90 = (X90) this.Fk.f5(s);
        return x90 != null && (x90.Sf & 256) != 0;
    }

    public final boolean QI(short s) {
        X90 x90 = (X90) this.Fk.f5(s);
        return x90 == null || (x90.Sf & 2048) == 0;
    }

    public final boolean cOm4(short s) {
        X90 x90 = (X90) this.Fk.f5(s);
        return x90 == null || (x90.Sf & 4096) == 0;
    }

    public final boolean Pd0(short s) {
        X90 x90 = (X90) this.Fk.f5(s);
        return x90 == null || !x90.wk(65536);
    }

    public final boolean sB() {
        int ord = ordinal();
        return ord != 0 && ord != 2 && ord != 3 && ord != 4;
    }

    public f.q10_0 toLegacy() {
        return f.q10_0.valueOf(name());
    }
}