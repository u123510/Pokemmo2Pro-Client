package cn.pokemmo.ui.chat;

import f.*;

import java.util.Arrays;

public class ChatFilterRuleRecord {
    public static final GV Uu0;
    public static final GV SE0;
    public static final GV Hg0;
    public static final GV rk0;
    public static final GV Uc0;
    public static final GV[] gj0;
    public static final GV[] Ht0;
    public static final bm0_1 ap0;
    public static final GV[] TH0;
    public static final GV[] TV;
    public final byte gk;
    public final int pN;
    public final int Om;
    public final boolean cOm3;
    public final boolean jC0;
    public final int Po;

    public ChatFilterRuleRecord(int id, int code, boolean filtered, boolean enabled) {
        this.Po = id;
        this.gk = (byte) code;
        this.jC0 = enabled;
        this.cOm3 = filtered;
        this.pN = code + 5700;
        this.Om = code + 5720;
    }

    public static GV Zd(byte value) {
        return (GV) t_0.BI0(ap0.BM(value), GV.class, value);
    }

    public static GV[] oV(int size) {
        return new GV[size];
    }

    public static boolean l0(GV value) {
        return value.cOm3;
    }

    static {
        GV v0 = new GV(0, 0, true, false);
        Uu0 = v0;
        GV v1 = new GV(1, 1, true, false);
        GV v2 = new GV(2, 2, true, false);
        GV v3 = new GV(3, 3, true, false);
        SE0 = v3;
        GV v4 = new GV(4, 4, false, false);
        Hg0 = v4;
        GV v5 = new GV(5, 5, false, false);
        GV v6 = new GV(6, 6, true, false);
        GV v7 = new GV(7, 7, false, true);
        rk0 = v7;
        GV v8 = new GV(8, 8, false, false);
        GV v9 = new GV(9, 9, false, true);
        Uc0 = v9;
        GV v10 = new GV(10, 10, false, true);
        GV v11 = new GV(11, 11, false, true);
        TV = new GV[]{v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11};
        Ht0 = new GV[]{v0, v1, v2, v3, v4, v5, v6};
        ap0 = new bm0_1();
        TH0 = TV.clone();
        for (GV value : TH0) {
            ap0.gE0(value.gk, value);
        }
        gj0 = Arrays.stream(TH0).filter(GV::l0).toArray(GV[]::new);
    }

    public final boolean P80() {
        return this.jC0;
    }

    @Override
    public final String toString() {
        if (sm0_0.cU.l90(this.pN)) {
            return sm0_0.c0(this.pN);
        }
        return super.toString();
    }

    public final int q70() {
        return this.pN;
    }

    public final int LA() {
        return this.Om;
    }
}
