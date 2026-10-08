/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.CE;
import f.cq_0;
import f.k1_0;

/*
 * Renamed from f.hc0
 */
public class TradeSessionSubPacket
extends BaseSubProtocolPacket {
    public TradeSessionSubPacket(byte by) {
        super((byte)14, by);
    }

    @Override
    public final boolean Ev0(CE cE, cq_0 cq_02) {
        byte by;
        return cE == null ? false : ((by = this.HU) == 2 ? cE.aUX() : (by == 0 ? cE.aR() : cE.aR() ^ true));
    }
}

