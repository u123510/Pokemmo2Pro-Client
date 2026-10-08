/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.k20_0;
import f.oa_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.Ol
 */
public class ServerOpcode172Packet
extends GH {
    public byte[] OQ;

    public ServerOpcode172Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        byte[] byArray = new byte[this.Rj.getShort() & 0xFFFF];
        this.Rj.get(byArray);
        this.OQ = byArray;
    }

    @Override
    public final void os0() {
        oa_0 oa_02 = this.sr0().ZE0;
        if (oa_02 != null) {
            oa_02.td(this.OQ);
        }
    }
}

