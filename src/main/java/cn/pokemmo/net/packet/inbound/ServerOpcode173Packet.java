package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode173Packet extends GH {
    public boolean NM;
    public java.time.Instant XY;
    public java.time.Instant WE;
    public short wg;
    public rz_0 uJ0;

    public ServerOpcode173Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        boolean present = this.Rj.get() == 1;
        this.NM = present;
        if (!present) {
            return;
        }
        this.XY = this.IK();
        this.WE = this.IK();
        this.wg = this.Rj.getShort();
        this.uJ0 = (rz_0) rz_0.RM.BM(this.Rj.get());
    }

    @Override
    public final void os0() {
        BR root = tw0_0.rl;
        if (root == null) {
            return;
        }
        root.Eo0 = new vh0_0(this.XY, this.WE, this.wg, this.uJ0);
        BU menu = root.lZ.zK0;
        if (menu == null) {
            return;
        }
        if (menu.ix0 != null) {
            menu.ix0.xe0();
            menu.ix0 = null;
        }
        if (this.NM) {
            menu.ix0 = new ju_2();
            menu.SL(menu.ix0);
        }
    }
}
