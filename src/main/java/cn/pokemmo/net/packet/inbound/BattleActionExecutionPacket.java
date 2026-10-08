package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.ArrayList;

public class BattleActionExecutionPacket extends JK0 {
    public CH0 WE;
    public short cn;
    public byte x40;
    public ArrayList<qn_1> Gx0;

    public BattleActionExecutionPacket(k20_0 v1, ByteBuffer v2) {
        super(v2, v1);
    }

    @Override
    public final void Oj0() {
        this.WE = this.pE();
        this.cn = this.Rj.getShort();
        this.x40 = this.Rj.get();
        this.Gx0 = new ArrayList<>();
        int count = this.Rj.get() & 255;
        for (int i = 0; i < count; i++) {
            qn_1 entry = new qn_1(this.pE(), this.Rj.getShort());
            int nested = this.Rj.get() & 255;
            for (int j = 0; j < nested; j++) {
                Nt value = this.S2();
                if (value != null) {
                    entry.XW.add(value);
                }
            }
            this.Gx0.add(entry);
        }
    }

    @Override
    public final void os0() {
        a10_0 resource = tw0_0.PK0;
        if (resource == null) {
            return;
        }
        if (resource.Sv == XA0.PRN) {
            H8 event = new H8(this.WE, this.cn, this.Gx0);
            resource.Tk0.add(event);
        } else {
            NZ event = new NZ(this.WE, this.cn, this.x40, this.Gx0);
            resource.Tk0.add(event);
        }
    }
}

