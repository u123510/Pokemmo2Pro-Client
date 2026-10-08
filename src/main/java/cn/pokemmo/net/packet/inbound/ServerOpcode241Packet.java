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
 * Renamed from f.l90
 */
public class ServerOpcode241Packet
extends GH {
    public byte NuL;

    public ServerOpcode241Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.NuL = this.Rj.get();
    }

    @Override
    public final void os0() {
        tw0_0.e60.cv0 = this.NuL;
    }
}

