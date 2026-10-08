package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.ArrayList;

public class BattleOpcode112Packet extends GH {
    public byte[] M0;
    public HV[] B2;

    public BattleOpcode112Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        byte[] bytes = new byte[this.Rj.get() & 255];
        this.Rj.get(bytes);
        this.M0 = bytes;
        this.B2 = new HV[this.Rj.getShort() & 65535];
        for (int index = 0; index < this.B2.length; index++) {
            int lpt3 = this.Rj.getInt();
            byte yd = this.Rj.get();
            short typeId = this.Rj.get();
            if (!E10.h50.dg((byte)typeId)) {
                throw new RuntimeException(yr_1.pG("Type ", typeId));
            }
            E10 type = (E10)E10.h50.BM((byte)typeId);
            short wa = this.Rj.getShort();
            int eo = this.Rj.getInt();
            int yg = this.Rj.getInt();
            int zz = this.Rj.getInt();
            int op = this.Rj.getInt();
            int aq = this.Rj.getInt();
            byte zi = this.Rj.get();
            this.Rj.get();
            HV item = new HV(lpt3, type, yd, wa, eo, yg, zz, op, aq, zi);
            if ((this.Rj.get() & 255) == 1) {
                item.dE0 = new DA(this.Rj.get(), this.Rj.get(), this.Rj.get(), this.Rj.get());
            }
            item.xk0 = this.Rj.getInt();
            this.B2[index] = item;
        }
    }

    @Override
    public final void os0() {
        BR battle = (BR)this.sr0();
        battle.rx0 = this.M0;
        BU world = battle.lZ.zK0;
        if (world == null) {
            return;
        }
        LF0 overlay = world.kx;
        if (overlay != null) {
            E10[] types = E10.pN;
            overlay.Kl0 = new HV[types.length][0];
            es_1 all = new es_1(HV.class);
            for (E10 type : types) {
                ArrayList list = new ArrayList();
                for (HV item : this.B2) {
                    DA condition = item.dE0;
                    if ((condition == null || condition.d70()) && item.xJ0 == type) {
                        list.add(item);
                        if (item.xk0 > -1) {
                            all.Ue0(item);
                        }
                    }
                }
                overlay.Kl0[type.zg] = (HV[])list.toArray(new HV[0]);
            }
            overlay.Kl0[0] = (HV[])all.Mo0(all.rZ.getClass().getComponentType());
            lg_0.k.lPT5(new ot0_0(overlay));
        }
        QT queue = world.OJ;
        if (queue == null) {
            return;
        }
        queue.goto$ = true;
        for (HV item : this.B2) {
            if (item.YD == 1 && item.WA == 1120) {
                queue.uf = item;
            } else if (item.YD == 1 && item.WA == 1194) {
                queue.Eh = item;
            }
        }
        queue.J4();
    }
}
