/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.E90;
import f.GH;
import f.bi0_1;
import f.k20_0;
import f.yt_1;
import java.nio.ByteBuffer;

public class ServerOpcode158Packet
extends GH {
    public CH0 p00 = CH0.j1;
    public byte dn0;
    public short mE0 = (short)-1;

    public ServerOpcode158Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode158Packet mm0 = this;
        mm0.p00 = mm0.pE();
        this.dn0 = mm0.Rj.get();
        if (this.dn0 != -1) {
            ServerOpcode158Packet mm02 = this;
            mm02.mE0 = mm02.Rj.getShort();
            mm02.Rj.get();
            mm02.Rj.get();
        }
    }

    @Override
    public final void os0() {
        yt_1 world = this.sr0().cJ0;
        if (world.jB0 != null && world.dj0.equals(this.p00)) {
            world.jB0.Yj(this.dn0, this.mE0);
        } else {
            bi0_1 entity = (bi0_1)world.pn0.get(this.p00);
            if (entity instanceof E90) {
                ((E90)entity).Yj(this.dn0, this.mE0);
            }
        }
    }
}
