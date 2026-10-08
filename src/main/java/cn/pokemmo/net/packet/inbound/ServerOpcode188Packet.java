/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.F90;
import f.GH;
import f.J4;
import f.LT;
import f._else;
import f.bH0;
import f.fy0_0;
import f.k20_0;
import f.tw0_0;
import f.yt_1;
import java.nio.ByteBuffer;

/*
 * Renamed from f.me
 */
public class ServerOpcode188Packet
extends GH {
    public byte CC;
    public byte kd0;
    public byte Kl;
    public short Wq;
    public short F60;
    public byte lS;
    public byte Hs0;

    public ServerOpcode188Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode188Packet me_12 = this;
        me_12.CC = me_12.Rj.get();
        me_12.kd0 = me_12.Rj.get();
        me_12.Kl = me_12.Rj.get();
        me_12.Wq = me_12.Rj.getShort();
        me_12.F60 = me_12.Rj.getShort();
        me_12.lS = me_12.Rj.get();
        me_12.Hs0 = me_12.Rj.get();
    }

    @Override
    public final void os0() {
        ServerOpcode188Packet me_12 = this;
        fy0_0 fy0_02 = tw0_0.e60;
        byte by = me_12.CC;
        short s = me_12.kd0;
        byte by2 = me_12.Kl;
        fy0_02 = (_else)((yt_1)fy0_02).E6.get(J4.iA0(by, (byte)s, by2));
        if (fy0_02 == null) {
            return;
        }
        Object object = ((_else)fy0_02).Xg0();
        if (object == null) {
            return;
        }
        if ((object = ((F90)object).Sq0(this.Hs0)) == null) {
            return;
        }
        ServerOpcode188Packet me_13 = this;
        short s2 = me_13.Wq;
        s = me_13.F60;
        by2 = me_13.lS;
        LT lT = ((_else)fy0_02).Fn(s2, s, by2);
        if (lT == null) {
            return;
        }
        ((bH0)object).g70(this.Wq);
        ((bH0)object).Zo0(this.F60);
        ((bH0)object).x80(lT.S80());
    }
}

