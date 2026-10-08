/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.CE;
import f.cq_0;
import f.k1_0;

/*
 * Renamed from f.Bd0
 */
public class ZoneTransitionSubPacket
extends BaseSubProtocolPacket {
    public ZoneTransitionSubPacket(byte by) {
        super((byte)11, by);
    }

    @Override
    public final boolean Ev0(CE cE, cq_0 cq_02) {
        return cq_02.gq0.yz == this.HU;
    }
}

