/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.k20_0;
import f.tw0_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.z8
 */
public class ServerOpcode251Packet
extends GH {
    public boolean fw0 = true;

    public ServerOpcode251Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        boolean bl = this.Rj.get() == 1;
        this.fw0 = bl;
    }

    @Override
    public final void os0() {
        tw0_0.LD0.Sc.GU(this.fw0);
    }
}

