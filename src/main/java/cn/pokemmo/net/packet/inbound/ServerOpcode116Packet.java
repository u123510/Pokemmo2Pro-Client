/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.k20_0;
import java.nio.ByteBuffer;

public class ServerOpcode116Packet
extends GH {
    public short RN;
    public int hk;
    public String wz0;

    public ServerOpcode116Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode116Packet jr0 = this;
        jr0.RN = jr0.Rj.getShort();
        jr0.hk = jr0.Rj.getInt();
        jr0.wz0 = jr0.q60();
    }

    @Override
    public final void os0() {
        ServerOpcode116Packet jr0 = this;
        short s = jr0.RN;
        int n = jr0.hk;
        this.sr0().Ep.k5(n, jr0.wz0, s);
    }
}

