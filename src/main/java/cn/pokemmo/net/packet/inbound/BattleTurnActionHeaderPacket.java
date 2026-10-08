package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleTurnActionHeaderPacket extends JK0 {
    public byte lPt2;
    public byte TQ;
    public byte COm9;
    public short yB0;
    public short DC;
    public String LPt1;
    public qn_1[] Vl;

    public BattleTurnActionHeaderPacket(k20_0 context, ByteBuffer buffer) {
        super(buffer, context);
    }

    @Override
    public final void Oj0() {
        this.lPt2 = this.Rj.get();
        this.TQ = this.Rj.get();
        this.yB0 = this.Rj.getShort();
        this.COm9 = this.Rj.get();
        this.DC = this.Rj.getShort();
        this.LPt1 = this.q60();
        this.Vl = new qn_1[this.Rj.get() & 255];
        for (int i = 0; i < this.Vl.length; i++) {
            qn_1 entry = new qn_1(this.pE(), this.Rj.getShort());
            int count = this.Rj.get() & 255;
            for (int j = 0; j < count; j++) {
                Nt value = this.S2();
                if (value != null) {
                    entry.XW.add(value);
                }
            }
            this.Vl[i] = entry;
        }
    }

    @Override
    public final void os0() {
        a10_0 target = tw0_0.PK0;
        if (target != null) {
            q80 value = new q80(this.lPt2, this.TQ, this.yB0, this.COm9, this.DC, this.LPt1, this.Vl);
            target.Tk0.add(value);
        }
    }
}
