/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.a10_0;
import f.k20_0;
import f.tw0_0;
import f.uy_2;
import java.nio.ByteBuffer;

public class BattleOpcode059Packet
extends GH {
    public BattleOpcode059Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
    }

    @Override
    public final void os0() {
        Object object = tw0_0.PK0;
        if (object != null) {
            Object object2 = object;
            uy_2 uy_22 = new uy_2();
            ((a10_0)object2).Tk0.add(uy_22);
        }
    }
}

