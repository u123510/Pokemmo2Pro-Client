package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

public class ClientOpcode166RequestPacket extends RE {
    public final P40[] yz0;
    public final int Dg;
    public final int gI0;


    public ClientOpcode166RequestPacket(P40[] var1, int var2, int var3) {
        super(166);
        this.yz0 = var1;
        this.Dg = var2;
        this.gI0 = var3;
    }

    @Override
    public final void ig0(k20_0 var1, ByteBuffer var2) {
        var2.put((byte)+this.gI0);

        for (int var3 = 0; var3 < this.gI0; ++var3) {
            P40 var4 = this.yz0[var3 + this.Dg];
            var2.put(var4.sG0);
            var2.put(var4.ee0);
            if (var4.sG0 == 1) {
                List var5 = var4.et0;
                var2.put((byte)var5.size());

                Iterator var6 = var5.iterator();
                while (var6.hasNext()) {
                    var2.put(((P40)var6.next()).ee0);
                }
            }
        }
    }
}
