// 
// Decompiled by Procyon v0.6.0
// 

package f;

import java.util.function.Predicate;
import java.util.stream.Stream;

public final class QL extends cn.pokemmo.particle.vanity.PokemonParticleVanity
{
    public static final QL Ll;
    public static final QL Uy0;
    public static final QL lQ;
    public static final QL N8;
    public static final QL[] ak0;
    public static final QL[] rn0;
    public static final QL[] j90;
    public static final QL[] td0;
    public static final QL[] ZO;
    public static final bm0_1 vA;
    public static final QL[] k60;
    public static QL Q8(final byte b) {
        if (b == -2) {
            return QL.lQ;
        }
        return (QL)t_0.BI0(QL.vA.BM(b), QL.class, b);
    }

    public static QL[] Sa0(final int length) {
        return new QL[length];
    }

    public static QL[] sY(final int length) {
        return new QL[length];
    }

    public static QL[] j3(final int length) {
        return new QL[length];
    }
    
    public static boolean Xg0(final QL ql) {
        return ql.D7 >= 0;
    }
    
    static {
        final zj_0 wb;
        final QL ql = new QL(0, (byte)(-5), wb = zj_0.Wb);
        final QL ql2 = Ll = new QL(1, (byte)(-4), wb);
        final QL ql3 = Uy0 = new QL(2, (byte)(-3), wb);
        final QL ql4 = lQ = new QL(3, (byte)(-1), wb);
        final QL ql5 = N8 = new QL(4, (byte)0, zj_0.fn0);
        final QL ql6 = new QL(5, (byte)1, wb);
        final zj_0 lpT3;
        final QL ql7 = new QL(6, (byte)2, lpT3 = zj_0.LpT3);
        final QL ql8 = new QL(7, (byte)3, lpT3);
        final QL ql9 = new QL(8, (byte)4, lpT3);
        final QL ql10 = new QL(9, (byte)5, lpT3);
        final QL ql11 = new QL(10, (byte)6, lpT3);
        final QL ql12 = new QL(11, (byte)7, lpT3);
        final QL ql13 = new QL(12, (byte)8, lpT3);
        final QL ql14 = new QL(13, (byte)9, lpT3);
        final QL ql15 = new QL(14, (byte)10, lpT3);
        final QL ql16 = new QL(15, (byte)11, lpT3);
        final QL ql17 = new QL(16, (byte)12, lpT3);
        final QL ql18 = new QL(17, (byte)13, lpT3);
        final QL ql19 = new QL(18, (byte)14, lpT3);
        final QL ql20 = new QL(19, (byte)15, lpT3);
        final QL ql21 = new QL(20, (byte)16, lpT3);
        final QL ql22 = new QL(21, (byte)17, lpT3);
        final QL ql23 = new QL(22, (byte)18, lpT3);
        final QL ql24 = new QL(23, (byte)19, lpT3);
        final QL ql25 = new QL(24, (byte)20, lpT3);
        final QL ql26 = new QL(25, (byte)21, lpT3);
        final QL ql27 = new QL(26, (byte)22, lpT3);
        final QL ql28 = new QL(27, (byte)23, lpT3);
        final QL ql29 = new QL(28, (byte)24, lpT3);
        final QL ql30 = new QL(29, (byte)25, lpT3);
        final QL ql31 = new QL(30, (byte)26, lpT3);
        final QL ql32 = new QL(31, (byte)27, lpT3);
        final QL ql33 = new QL(32, (byte)28, lpT3);
        final QL ql34 = new QL(33, (byte)29, lpT3);
        final QL ql35 = new QL(34, (byte)30, lpT3);
        final QL ql36 = new QL(35, (byte)31, lpT3);
        final QL ql37 = new QL(36, (byte)32, lpT3);
        final QL ql38 = new QL(37, (byte)33, lpT3);
        final QL ql39 = new QL(38, (byte)34, zj_0.dC0);
        final QL ql40 = new QL(39, (byte)35, lpT3);
        final QL ql41 = new QL(40, (byte)36, lpT3);
        final QL ql42 = new QL(41, (byte)37, lpT3);
        final QL ql43 = new QL(42, (byte)38, lpT3);
        final QL[] k61;
        (k61 = new QL[43])[0] = ql;
        k61[1] = ql2;
        k61[2] = ql3;
        k61[3] = ql4;
        k61[4] = ql5;
        k61[5] = ql6;
        k61[6] = ql7;
        k61[7] = ql8;
        k61[8] = ql9;
        k61[9] = ql10;
        k61[10] = ql11;
        k61[11] = ql12;
        k61[12] = ql13;
        k61[13] = ql14;
        k61[14] = ql15;
        k61[15] = ql16;
        k61[16] = ql17;
        k61[17] = ql18;
        k61[18] = ql19;
        k61[19] = ql20;
        k61[20] = ql21;
        k61[21] = ql22;
        k61[22] = ql23;
        k61[23] = ql24;
        k61[24] = ql25;
        k61[25] = ql26;
        k61[26] = ql27;
        k61[27] = ql28;
        k61[28] = ql29;
        k61[29] = ql30;
        k61[30] = ql31;
        k61[31] = ql32;
        k61[32] = ql33;
        k61[33] = ql34;
        k61[34] = ql35;
        k61[35] = ql36;
        k61[36] = ql37;
        k61[37] = ql38;
        k61[38] = ql39;
        k61[39] = ql40;
        k61[40] = ql41;
        k61[41] = ql42;
        k61[42] = ql43;
        k60 = k61;
        final QL[] array2;
        final QL[] array = ak0 = (array2 = k61.clone());
        rn0 = new QL[0];
        vA = new bm0_1();
        for (int length = array.length, i = 0; i < length; ++i) {
            final QL ql44 = array2[i];
            QL.vA.gE0(ql44.D7, ql44);
        }
        final QL[] ak = QL.ak0;
        j90 = Stream.of(ak).filter(QL::Xg0).toArray(QL[]::new);
        td0 = Stream.of(ak).filter(QL::new$).toArray(QL[]::new);
        ZO = Stream.of(ak).filter(QL::Nw).toArray(QL[]::new);
    }
    
    public QL(final int uw0, final byte d7, final zj_0 aUx) {
        super(uw0, d7, aUx);
    }
    
    public final byte Ex() {
        return this.D7;
    }
    
    public final boolean Nw() {
        return this.new$() || this == QL.lQ || this == QL.Ll;
    }
    
    public final boolean new$() {
        return this.aUx == zj_0.LpT3;
    }
    
    public final boolean PR(final e30_0 p0, final CE p1) {
        if (p1.dO(this)) {
            return true;
        }
        final int mode = Np0.As[p1.Hf0.Cg];
        if (mode == 1) {
            return p0.WN.equals(p1.W50) && p0.IJ0(this);
        }
        if (mode == 3) {
            return false;
        }
        if (mode == 2) {
            final CH0 timestamp = p1.W50;
            final long value = timestamp.Sa;
            if (value < Integer.MIN_VALUE || value > Integer.MAX_VALUE) {
                return false;
            }
            if (p0.import$ != timestamp.n30() || this.aUx != zj_0.dC0) {
                return false;
            }
            synchronized (p0.x30) {
                return S.ZT(this, p0.Bx);
            }
        }
        final int count = (p1.I() ? 1 : 0) + p1.bG0.length + p0.Bx.length;
        return (this == Uy0 && count <= 1) || this == lQ;
    }
    
    @Override
    public final String toString() {
        final QL lq;
        int n;
        if (this == (lq = QL.lQ)) {
            n = 61;
        }
        else if (this == QL.Ll) {
            n = 49;
        }
        else {
            n = this.D7 + 10800;
        }
        if (sm0_0.cU.l90(n)) {
            return sm0_0.c0((this == lq) ? 61 : ((this == QL.Ll) ? 49 : (this.D7 + 10800)));
        }
        return super.toString();
    }
}

