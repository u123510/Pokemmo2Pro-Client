/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

/*
 * Renamed from f.ff
 */
public class ServerOpcode039Packet
extends GH {
    public boolean U20;

    public ServerOpcode039Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        boolean bl = (this.Rj.get() & 0xFF) == 1;
        this.U20 = bl;
    }

    @Override
    public final void os0() {
        boolean bl = this.U20;
        Object object = (BR)this.sr0();
        BU bU = ((BR)object).lZ.zK0;
        if (bU != null) {
            bU.Nc0(bl);
            if (!bl) {
                bU = ((BR)object).lZ.zK0;
                lr_0 lr_02 = bU.Xf0;
                if (lr_02 != null && lr_02.yw0) {
                    bU.U1(null, false, true);
                }
            }
            if (!bl) {
                BU bU2 = ((BR)object).lZ.zK0;
                object = bU2.de0;
                if (object != null && ((qu_2)object).D7) {
                    bU2.RG0(null, false, true);
                }
            }
        }
    }
}

