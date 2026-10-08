package cn.pokemmo.rom.nds.bw;

import f.*;
import com.badlogic.gdx.graphics.Color;
import java.nio.ByteBuffer;

public class BwTrainerModelLoader {
    public static final gh_1 aH0;
    public static final Wr vZ;
    public static Wr aa;
    public final w7_0 rf0;
    public final w7_0 rh;

    public BwTrainerModelLoader() {
        this.rf0 = new w7_0();
        this.rh = new w7_0();
    }

    public static gh_1 Jh0() {
        return aH0;
    }

    static {
        aH0 = new gh_1();
        vZ = new Wr(LP.To0);
    }

    public final void CR(nj0_0 v1) {
        FJ fj = new FJ((Ae) v1.fd0.dg.get("/a/0/2/5"));
        ByteBuffer buf = v1.Gr();
        while (buf.getInt() != 19071103 || buf.getInt() != 16318992 || buf.getInt() != 555 || buf.getInt() != 65668073) {
        }
        Rk0 rk0 = new Rk0(fj.GJ(1), false);
        SQ sq1 = new SQ();
        SQ sq2 = new SQ();
        for (int i6 = 1; i6 < 627; i6++) {
            short itemId = (short) (i6 + 5000);
            short s1 = buf.getShort();
            short s2 = buf.getShort();
            if (!this.rf0.bL0(itemId)) {
                int key = (s1 << 16) | s2;
                Wr wr1;
                Wr wr2;
                if (sq1.l90(key)) {
                    wr1 = (Wr) sq1.get(key);
                    wr2 = (Wr) sq2.get(key);
                } else {
                    Wr wr_normal = new Wr(new pg_1(fj, s2, false, s1, rk0, (byte) 2, null));
                    sq1.uu0(key, wr_normal);
                    Wr wr_shiny = new Wr(new pg_1(fj, s2, true, s1, rk0, (byte) 2, null));
                    sq2.uu0(key, wr_shiny);
                    short[] arr = {1427, 1428, 1429, 1430, 1485, 1498};
                    int switchVal = 0;
                    switch (itemId) {
                        case 5002:
                            switchVal = 2;
                            break;
                        case 5003:
                            switchVal = 1;
                            break;
                        case 5012:
                            switchVal = 3;
                            break;
                        case 5013:
                            switchVal = 5;
                            break;
                        case 5016:
                            switchVal = 4;
                            break;
                        default:
                            break;
                    }
                    short mappedId = arr[switchVal];
                    if (!this.rf0.bL0(mappedId)) {
                        Wr extraWr1 = null;
                        Wr extraWr2 = null;
                        switch (itemId) {
                            case 5002:
                            case 5003:
                            case 5004:
                            case 5012:
                            case 5013:
                            case 5016:
                                extraWr1 = new Wr(new pg_1(fj, s2, false, s1, rk0, (byte) 2, Color.GOLDENROD));
                                extraWr2 = new Wr(new pg_1(fj, s2, true, s1, rk0, (byte) 2, null));
                                break;
                            default:
                                break;
                        }
                        if (extraWr1 != null) {
                            this.rf0.coM4(mappedId, extraWr1);
                            this.rh.coM4(mappedId, extraWr2);
                        }
                    }
                    wr1 = wr_normal;
                    wr2 = wr_shiny;
                }
                this.rf0.coM4(itemId, wr1);
                this.rh.coM4(itemId, wr2);
            }
        }
    }

    public final Wr S1(short i1) {
        return Jg(i1, false);
    }

    public final Wr Jg(short i1, boolean i2) {
        if (i1 < 1) {
            return vZ;
        }
        return F10(gu0.l2.lPT6(i1), i2);
    }

    public final Wr zm(short i1) {
        return F10(gu0.l2.lPT6(i1), false);
    }

    public final Wr Xj0(mc0_1 v1) {
        return F10(v1, false);
    }

    public final Wr F10(mc0_1 v1, boolean i2) {
        if (v1 == null) {
            return vZ;
        }
        Wr wr = PB(v1.V4(), i2);
        if (wr != vZ) {
            return wr;
        }
        return PB(v1.Z8, i2);
    }

    public final Wr Kd0(short i1) {
        return PB(i1, false);
    }

    public final Wr PB(short i1, boolean i2) {
        w7_0 map = i2 ? this.rh : this.rf0;
        Wr wr = (Wr) map.f5(i1);
        if (wr == null) {
            return aa;
        }
        return wr;
    }
}
