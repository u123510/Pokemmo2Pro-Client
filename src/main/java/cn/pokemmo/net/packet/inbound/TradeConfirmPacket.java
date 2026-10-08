package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class TradeConfirmPacket extends GH {
    public CH0 u90;
    public zv_2 sQ;

    public TradeConfirmPacket(k20_0 connection, ByteBuffer input) {
        super(connection, input);
    }

    @Override
    public final void Oj0() {
        this.u90 = this.pE();
        byte first = this.Rj.get();
        byte second = this.Rj.get();
        byte third = this.Rj.get();
        short width = this.Rj.getShort();
        short height = this.Rj.getShort();
        byte mode = this.Rj.get();
        byte packed = this.Rj.get();
        byte flags = (byte) (packed & 3);
        boolean enabled = (packed & 8) != 0;
        this.sQ = new zv_2(first, second, third, enabled, width, height, mode, flags);
    }

    @Override
    public final void os0() {
        Ge0 world = this.sr0();
        yt_1 state = world.cJ0;
        bi0_1 entity = state.ax(this.u90);
        if (entity == null) {
            return;
        }
        entity.il0.p6(this.sQ);
        entity.il0.h10();
        if (entity instanceof E90 && entity.Ou()) {
            Ge0 parent = state.Mm0;
            if (parent.Sy) {
                parent.Sy = false;
                state.jB0.L8.Np0 = false;
                entity.il0.LE(new nk_0[]{nk_0.Nw});
            }
        }
        yt_1.sp0(entity);
        if (entity.CI0()) {
            ((MO) entity).wb.V2(this.sQ);
        }
    }
}
