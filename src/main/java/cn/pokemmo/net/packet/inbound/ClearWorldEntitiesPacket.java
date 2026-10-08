/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.GH;
import f.k20_0;
import f.yt_1;
import java.nio.ByteBuffer;
import java.util.Enumeration;

/*
 * Renamed from f.a4
 */
public class ClearWorldEntitiesPacket
extends GH {
    public ClearWorldEntitiesPacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
    }

    @Override
    public final void os0() {
        yt_1 yt_12 = this.sr0().cJ0;
        Enumeration enumeration = yt_12.pn0.keys();
        while (enumeration.hasMoreElements()) {
            yt_12.xc((CH0)enumeration.nextElement());
        }
    }
}

