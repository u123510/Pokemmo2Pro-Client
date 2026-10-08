package cn.pokemmo.world.terrain;

import f.*;

/**
 * 现代化重构类 - 原始类: f._else
 */
public abstract class TerrainTileResource implements fy0_0 {

    public final byte dw;
    public byte Bm0;
    public byte case$;
    public byte A30;
    public bd_0 jE;
    public int zC0;
    public int BJ;
    public gh_0 lm0;
    public tW pG;
    public s4_0 Jo0;
    public boolean Z10;
    public final LT[] Hy;

    public TerrainTileResource(byte b, byte b2, byte b3, byte b4) {
        this.lm0 = gh_0.wZ;
        this.pG = tW.cH;
        this.Jo0 = s4_0.OV;
        this.Z10 = false;
        this.Hy = new LT[4];
        this.dw = b;
        this.Bm0 = b2;
        this.case$ = b3;
        this.A30 = b4;
        // this.jE initialized in f._else
    }

    public final LT qk(LT lt, short s, short s2, byte b, int i) {
        if (lt == null || i == 0) {
            return lt;
        }
        if (i < 0) {
            b = tx_1.Qf0(b);
            i = Math.abs(i);
        }
        switch (b) {
            case 0:
                s2 = (short) (s2 + 1);
                break;
            case 1:
                s2 = (short) (s2 - 1);
                break;
            case 2:
                s = (short) (s - 1);
                break;
            case 3:
                s = (short) (s + 1);
                break;
            default:
                throw new RuntimeException("Invalid direction");
        }
        if (lt.gr0()) {
            lt = lt.JG0(b);
        } else {
            lt = LB0(s, s2, lt.S80());
        }
        return qk(lt, s, s2, b, i - 1);
    }

    public final byte ZE() {
        return this.dw;
    }

    public final short p4() {
        return J4.p5(this.Bm0, this.case$);
    }

    public final boolean Km() {
        return this.jE != null;
    }

    public abstract String OE();

    public final byte Lt() {
        return this.A30;
    }

    public abstract short hh0();

    public abstract boolean Wp();

    public abstract LT Fn(int i, int i2, int i3);

    public LT LB0(short s, short s2, float f) {
        return Fn(s, s2, 0);
    }

    public final LT A40(int i, int i2) {
        return Fn(i, i2, 0);
    }

    public LT Jk0(byte b, short s, short s2) {
        return null;
    }

    public LT pR(float f, float f2, float f3) {
        return null;
    }

    public final LT gv(LT lt, byte b, int i) {
        if (lt == null || i == 0) {
            return lt;
        }
        return qk(lt, lt.Tz(), lt.HR(), b, i);
    }

    public int j3() {
        return 0;
    }

    public int qF() {
        return 0;
    }

    public boolean nn() {
        return false;
    }

    public boolean IS() {
        return false;
    }

    public void b60(LT lt) {
    }

    public es_1 L90() {
        return null;
    }

    public F90 Xg0() {
        return null;
    }

    @Override
    public void dispose() {
    }
}
