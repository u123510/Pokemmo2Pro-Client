package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.ArrayList;

public class BattleOpcode092Packet extends GH {
    public static ArrayList MH0;
    public int sG;
    public boolean vq0;
    public boolean xA;
    public V0 FE0;

    public BattleOpcode092Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.sG = this.Rj.getInt();
        this.vq0 = (this.Rj.get() & 255) == 1;
        this.xA = (this.Rj.get() & 255) == 1;
        byte first = this.Rj.get();
        byte second = this.Rj.get();
        byte third = this.Rj.get();
        int count = this.Rj.getShort() & 65535;
        QA[] entries = new QA[count];
        for (int index = 0; index < count; index++) {
            byte fourth = this.Rj.get();
            short a = this.Rj.getShort();
            short b = this.Rj.getShort();
            short c = this.Rj.getShort();
            short d = this.Rj.getShort();
            short e = this.Rj.getShort();
            String name = this.q60();
            short f = this.Rj.getShort();
            entries[index] = new QA(first, second, third, fourth, a, b, c, d, e, name, f);
        }
        this.FE0 = new V0(first, second, third, entries);
    }

    @Override
    public final void os0() {
        if (this.vq0) {
            MH0 = new ArrayList();
        }
        MH0.add(this.FE0);
        if (!this.xA) {
            return;
        }
        BR world = (BR) this.sr0();
        int id = this.sG;
        V0[] entries = (V0[]) MH0.toArray(new V0[0]);
        BU battle = world.lZ.zK0;
        if (battle == null) {
            return;
        }
        battle.XV();
        battle.z10 = new b40_0(battle, id, entries);
        battle.SL(battle.z10);
        battle.z10.lt0();
        int x = tw0_0.LD0.ew0() / 2 - battle.z10.Mx / 2;
        int y = tw0_0.LD0.Hv0() / 2 - battle.z10.OB / 2;
        battle.z10.E40(x, y);
    }
}
