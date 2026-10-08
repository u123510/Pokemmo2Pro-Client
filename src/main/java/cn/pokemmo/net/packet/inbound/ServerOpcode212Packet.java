/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

/*
 * Renamed from f.y70
 */
public class ServerOpcode212Packet
extends GH {
    public byte l20;
    public int Na0;
    public short jO;

    public ServerOpcode212Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode212Packet y70_02 = this;
        y70_02.l20 = y70_02.Rj.get();
        y70_02.Na0 = y70_02.Rj.getInt();
        y70_02.jO = y70_02.Rj.getShort();
    }

    @Override
    public final void os0() {
        Object object = hq_2.ZG;
        object = (OJ)((hq_2)object).kg.BM(this.l20);
        if (object == null) {
            return;
        }
        Object object2 = object;
        ServerOpcode212Packet y70_02 = this;
        int n = y70_02.Na0;
        short s = y70_02.jO;
        ((OJ)object2).kA0 = n;
        ((OJ)object2).uY = s;
        le0_2 le0_22 = ((BR)this.sr0()).lZ.zK0;
        if (le0_22 != null && (le0_22 = ((BU)le0_22).Y80) != null) {
            ((wr0)le0_22).update();
        }
    }
}

