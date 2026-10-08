/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.CE;
import f.cq_0;
import f.k1_0;

public class WorldSyncSubPacket
extends BaseSubProtocolPacket {
    public WorldSyncSubPacket(byte by) {
        super((byte)3, by);
    }

    @Override
    public final boolean Ev0(CE cE, cq_0 cq_02) {
        return cE != null && cE.wj >= this.HU;
    }
}

