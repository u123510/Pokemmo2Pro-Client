package cn.pokemmo.net.packet;

import f.*;

public class PacketTypeModeTuple {
    public static final dl_1 sG = Cq0.E1(PacketTypeModeTuple.class);
    public final JJ0 hq;
    public final cr_0 Zh;
    public final int da0;
    public final int qA;
    public final w7_0 ib;

    public PacketTypeModeTuple(JJ0 mode, cr_0 type, int first, int second) {
        this.ib = new w7_0();
        this.hq = mode;
        this.Zh = type;
        this.da0 = first;
        this.qA = second;
    }

    public final lpt2__5[] f90() {
        return (lpt2__5[]) this.ib.qy(new lpt2__5[0]);
    }

    public final lpt2__5 xe(short id) {
        if (this.ib.bL0(id)) {
            return (lpt2__5) this.ib.f5(id);
        }
        return this.u20(id, this.Zh, (short) 0, (short) 0);
    }

    public final cr_0 ez0() {
        return this.Zh;
    }

    public final int T60() {
        return this.da0;
    }

    public final int Ri0() {
        return this.qA;
    }

    public final lpt2__5 u20(short id, cr_0 type, short quantity, short extra) {
        int kind = Kh.kn[this.hq.Qs0];
        if (kind == 2) {
            yj_2 item = QO.NX.xW(id);
            if (item == null) {
                sG.error("Missing item {} for shop!", Short.valueOf(id), new RuntimeException());
                return null;
            }
            lpt2__5 result = new lpt2__5(item, type, quantity, this.ib.Rv, extra);
            this.ib.coM4(result.FE(), result);
            return result;
        }
        if (kind == 1) {
            mc0_1 item = gu0.l2.lPT6(id);
            lpt2__5 result = new lpt2__5(item, type, 0, quantity, this.ib.Rv, extra);
            this.ib.coM4(result.FE(), result);
            return result;
        }
        return null;
    }
}
