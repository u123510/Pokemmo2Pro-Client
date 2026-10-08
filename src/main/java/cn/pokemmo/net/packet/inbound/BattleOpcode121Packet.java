package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;

public class BattleOpcode121Packet extends GH {
    public CH0 q10;
    public xs_2 zw0;

    public BattleOpcode121Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.q10 = this.pE();
        this.zw0 = new xs_2();
        this.zw0.bB = this.Rj.getInt();
        byte flags = this.Rj.get();
        if ((flags & 1) != 0) {
            this.zw0.t90 = this.Rj.getInt();
        }
        if ((flags & 2) != 0) {
            this.zw0.QS = this.Rj.getInt();
        }
        if ((flags & 4) != 0) {
            this.zw0.Pd0 = this.Rj.getInt();
        }
        if ((flags & 8) != 0) {
            this.zw0.za0 = this.Rj.getInt();
        }
        if ((flags & 16) != 0) {
            this.zw0.l20 = this.Rj.getInt();
        }
        if ((flags & 32) != 0) {
            this.zw0.tI = this.Rj.getInt();
        }
    }

    @Override
    public final void os0() {
        if (this.sr0().FJ0(this.q10, _volatile.pG0) == null) {
            return;
        }
        a10_0 state = tw0_0.PK0;
        if (state == null || state.nf == Cq.Jd) {
            return;
        }
        CH0 key = this.q10;
        xs_2 amount = this.zw0;
        Collection entries = state.Tk0;
        Iterator iterator = entries.iterator();
        while (iterator.hasNext()) {
            TC0 event = (TC0) iterator.next();
            if (!(event instanceof LM)) {
                continue;
            }
            LM level = (LM) event;
            CH0 eventKey = level.Rw0 == null ? CH0.j1 : level.Rw0.pu;
            if (!eventKey.equals(key)) {
                continue;
            }
            if (level.M6 == null) {
                level.M6 = amount;
                return;
            }
            xs_2 total = level.M6;
            total.bB += amount.bB;
            total.t90 += amount.t90;
            total.QS += amount.QS;
            total.Pd0 += amount.Pd0;
            total.za0 += amount.za0;
            total.l20 += amount.l20;
            total.tI += amount.tI;
            return;
        }
    }
}
