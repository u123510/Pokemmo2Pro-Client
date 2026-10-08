/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.YX;
import f.k20_0;
import f.lg_0;
import java.nio.ByteBuffer;

public class ServerOpcode031Packet
extends GH {
    public byte FF;
    public short Mx0;
    public short XI0;
    public short Kh;
    public short ZO;

    public ServerOpcode031Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode031Packet k7 = this;
        k7.FF = k7.Rj.get();
        k7.Mx0 = k7.Rj.getShort();
        k7.XI0 = k7.Rj.getShort();
        k7.Kh = k7.Rj.getShort();
        k7.ZO = k7.Rj.getShort();
    }

    @Override
    public final void os0() {
        lg_0.k.lPT5(new YX((K7) this));
    }
}

