package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class FriendRequestPacket extends GH {
    public CH0 QI0;

    public FriendRequestPacket(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }

    @Override
    public final void Oj0() {
        this.QI0 = this.pE();
    }

    @Override
    public final void os0() {
        Ge0 var1 = this.sr0();
        if (var1.gd0 != null) {
            BR var2 = (BR)var1;
            yi_1 var3 = var1.gd0;
            var3.Ku0 = this.QI0;
            xg_0 var4 = var2.lZ.zK0.LPT8;
            var4.Xf = var3.Ku0;
            for (si_0 var5 : var3.yJ()) {
                var4.DN(var5);
            }
            var1.fP();
        }
    }
}
