package cn.pokemmo.net.packet;

import f.*;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * 现代化重构类 - 原始混淆类: f.fq_2
 */
public class Modern_Net_Fq2 {

    public static final fq_2 ue0;
    public static final fq_2 KJ0;
    public static final fq_2 pz;
    public static final fq_2 Bx0;
    public static final fq_2 LC0;
    public static final fq_2 uv;
    public static final fq_2 NG;
    public static final fq_2 Sq;
    public static final fq_2 gu;
    public static final fq_2[] an0;
    public static final bm0_1 Zg;
    public static final fq_2[] d00;

    public final byte Iq0;
    public final boolean Gq;
    public final boolean ce0;
    public final int ZZ;

    public Modern_Net_Fq2(int i, byte b, byte b2, boolean z, boolean z2) {
        this.ZZ = i;
        this.Iq0 = b;
        this.Gq = z;
        this.ce0 = z2;
    }

    public static fq_2 NG(byte b) {
        return (fq_2) Objects.requireNonNull((fq_2) Zg.BM(b));
    }

    static {
        ue0 = new fq_2(0, (byte) 0, (byte) 3, false, false);
        KJ0 = new fq_2(1, (byte) 1, (byte) 2, false, false);
        pz = new fq_2(2, (byte) 2, (byte) 1, false, false);
        Bx0 = new fq_2(3, (byte) 3, (byte) 3, true, true);
        LC0 = new fq_2(4, (byte) 4, (byte) 2, true, true);
        uv = new fq_2(5, (byte) 5, (byte) 2, true, true);
        NG = new fq_2(6, (byte) 6, (byte) 2, true, true);
        Sq = new fq_2(7, (byte) 7, (byte) 3, true, true);
        gu = new fq_2(8, (byte) 8, (byte) 1, false, false);
        fq_2[] fq_2Arr = new fq_2[] { ue0, KJ0, pz, Bx0, LC0, uv, NG, Sq, gu };
        d00 = fq_2Arr;
        fq_2[] fq_2Arr2 = (fq_2[]) fq_2Arr.clone();
        an0 = fq_2Arr2;
        Zg = new bm0_1();
        for (fq_2 fq_2Var : fq_2Arr2) {
            Zg.gE0(fq_2Var.Iq0, fq_2Var);
        }
        Stream.of(an0).filter(fq_2::ap0).toArray(fq_2[]::new);
        Stream.of(an0).filter(fq_2::oF0).toArray(fq_2[]::new);
    }

    public final boolean oF0() {
        return this.Gq;
    }

    public final boolean ap0() {
        return this.ce0;
    }
}

