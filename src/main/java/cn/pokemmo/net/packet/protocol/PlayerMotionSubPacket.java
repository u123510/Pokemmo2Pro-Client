/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.CE;
import f.cq_0;
import f.k1_0;

/*
 * Renamed from f.db
 */
public class PlayerMotionSubPacket
extends BaseSubProtocolPacket {
    public PlayerMotionSubPacket(byte by) {
        super((byte)2, by);
    }

    @Override
    public final boolean Ev0(CE cE, cq_0 cq_02) {
        return cE != null && cE.yb.f10 == this.HU;
    }
}

