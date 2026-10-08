package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class MonsterDetailDataPacket extends S20 {
    public VU jH;

    public MonsterDetailDataPacket(k20_0 v1, ByteBuffer v2) {
        super(v2, v1);
    }

    @Override
    public final void Oj0() {
        this.jH = new VU(this.Lr0());
    }

    @Override
    public final void os0() {
        Mj mj = this.sr0().r1(this.jH.I8.JF);
        VU value = this.jH;
        switch (dispatchType(value.I8.JF)) {
            case 1:
                a10_0 window = tw0_0.PK0;
                if (window != null && window.nf != Cq.Jd) {
                    window.lPt9.add(new je_0((H60) this, mj));
                    return;
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            default:
                throw new IllegalArgumentException();
        }
        if (mj != null) {
            mj.hD(value);
        }
    }

    private static int dispatchType(_volatile type) {
        if (type == _volatile.BV) return 1;
        if (type == _volatile.CG0) return 2;
        if (type == _volatile.Bf0) return 3;
        if (type == _volatile.Kb) return 4;
        if (type == _volatile.JR) return 5;
        if (type == _volatile.cN) return 6;
        if (type == _volatile.Ch) return 7;
        return 0;
    }
}
