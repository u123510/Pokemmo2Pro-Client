/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.GH;
import f.MO;
import f.bi0_1;
import f.k20_0;
import f.tw0_0;
import f.yt_1;
import java.nio.ByteBuffer;

public class ServerOpcode178Packet
extends GH {
    public CH0 ux;
    public byte tp0;

    public ServerOpcode178Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode178Packet mI0 = this;
        mI0.ux = mI0.pE();
        mI0.tp0 = mI0.Rj.get();
    }

    @Override
    public final void os0() {
        yt_1 world = tw0_0.e60;
        bi0_1 entity = (bi0_1)world.pn0.get(this.ux);
        if (entity != null && entity.CI0()) {
            ((MO)entity).gB0(this.tp0);
        }
    }
}
