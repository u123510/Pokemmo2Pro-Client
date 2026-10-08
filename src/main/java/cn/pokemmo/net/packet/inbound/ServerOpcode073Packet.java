/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.BR;
import f.GH;
import f.Yl;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.cg
 */
public class ServerOpcode073Packet
extends GH {
    public ServerOpcode073Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.Rj.get();
    }

    @Override
    public final void os0() {
        Yl yl = ((BR)this.sr0()).lZ.zK0.Vi0;
        if (yl != null) {
            if (yl.Hn0.eE) {
                yl.Yi0(false, true);
            }
            yl.j0 = false;
            yl.PH = false;
            yl.vi0();
        }
    }
}

