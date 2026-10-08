/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.GH;
import f.a10_0;
import f.k20_0;
import f.tb0_1;
import f.tw0_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.mv
 */
public class BattleOpcode200Packet
extends GH {
    public CH0 h6;

    public BattleOpcode200Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.h6 = this.pE();
    }

    @Override
    public final void os0() {
        a10_0 a10_02 = tw0_0.PK0;
        if (a10_02 == null) {
            return;
        }
        tb0_1 tb0_12 = a10_02.yD0(this.h6);
        if (tb0_12 == null) {
            return;
        }
        tb0_12.Ua0.oj0(tb0_12);
    }
}

