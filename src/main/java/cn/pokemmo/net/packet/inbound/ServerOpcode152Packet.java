/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode152Packet
extends GH {
    public short u;
    public short tn;
    public short lB;

    public ServerOpcode152Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode152Packet b50 = this;
        b50.u = b50.Rj.getShort();
        b50.tn = b50.Rj.getShort();
        b50.lB = b50.Rj.getShort();
    }

    @Override
    public final void os0() {
        Ge0 ge0 = this.sr0();
        ServerOpcode152Packet b50 = this;
        short s = b50.u;
        short s2 = b50.tn;
        short s3 = b50.lB;
        ge0.cn = s;
        ge0.Sc0 = s2;
        ge0.CON = s3;
    }
}

