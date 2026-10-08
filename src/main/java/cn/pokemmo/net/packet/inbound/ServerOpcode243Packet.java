package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.ArrayList;

public class ServerOpcode243Packet extends GH {
    public ServerOpcode243Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    public static boolean Vx0(short id, byte value) {
        mc0_1 entry = gu0.l2.lPT6(id);
        entry.eG = value != 0;
        return true;
    }

    public final void Oj0() {
        h50_0.X9 = this.Rj.get();
        h50_0.uK0 = this.Rj.getShort();
        h50_0.sg0 = this.Rj.getFloat();
        h50_0.XD0 = this.Rj.getShort();
        h50_0.Y30 = this.Rj.getShort();
        h50_0.lv0 = this.Rj.getShort();
        h50_0.bs = this.Rj.getInt();
        h50_0.vB0 = this.Rj.get();
        byte flags = this.Rj.get();
        h50_0.Bj0 = (flags & 1) != 0;
        h50_0.GA = (flags & 2) != 0;
        h50_0.Of0 = (flags & 8) != 0;
        h50_0.ac = (flags & 16) != 0;
        h50_0.sw0 = (flags & 32) != 0;
        h50_0.rb0 = (flags & 64) != 0;
        h50_0.Tu0 = new short[this.Rj.getShort()];
        for (int i = 0; i < h50_0.Tu0.length; i++) {
            h50_0.Tu0[i] = this.Rj.getShort();
        }
        h50_0.Yu = new byte[this.Rj.get()];
        for (int i = 0; i < h50_0.Yu.length; i++) {
            h50_0.Yu[i] = this.Rj.get();
        }
        h50_0.im = new short[this.Rj.getShort()];
        for (int i = 0; i < h50_0.im.length; i++) {
            h50_0.im[i] = this.Rj.getShort();
        }
        h50_0.av0 = new short[this.Rj.getShort()];
        for (int i = 0; i < h50_0.av0.length; i++) {
            h50_0.av0[i] = this.Rj.getShort();
        }
        h50_0.bG = new short[this.Rj.get()];
        for (int i = 0; i < h50_0.bG.length; i++) {
            h50_0.bG[i] = this.Rj.getShort();
        }
        h50_0.Rc = new pi_0();
        int count = this.Rj.getShort() & 0xFFFF;
        for (int i = 0; i < count; i++) {
            short id = this.Rj.getShort();
            byte value = this.Rj.get();
            int index = h50_0.Rc.lpt2(id);
            boolean valid = true;
            if (index < 0) {
                index = -index - 1;
                byte ignored = h50_0.Rc.y10[index];
                valid = false;
            }
            h50_0.Rc.y10[index] = value;
            if (valid && h50_0.Rc.H6) {
                h50_0.Rc.OC0(true);
            }
        }
        h50_0.rb0 = flags != 0;
    }

    public final void os0() {
        ArrayList entries = new ArrayList();
        for (short id : h50_0.im) {
            if (id != 1 && id != 4 && id != 7) {
                entries.add(mp_1.vf0().k2.get(Short.valueOf(id)));
            }
        }
        gu0.l2.lPT6((short) 1422).xC =
            (cq_0[]) entries.toArray(new cq_0[0]);
        pi_0 data = h50_0.Rc;
        G7 predicate = ServerOpcode243Packet::Vx0;
        byte[] flags = data.y10;
        short[] ids = h50_0.Rc.jA0;
        int index = flags.length;
        while (--index > 0 && flags[index] == 1
            && !predicate.yl0(ids[index], flags[index])) {
        }
        tw0_0.LD0.getClass();
        lg_0.k.lPT5(new zi0_2());
    }
}
