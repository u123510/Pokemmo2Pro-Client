/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.CE;
import f.cq_0;
import f.k1_0;

public class GuildProtocolSubPacket
extends BaseSubProtocolPacket {
    public GuildProtocolSubPacket(byte by) {
        super((byte)7, by);
    }

    @Override
    public final boolean Ev0(CE cE, cq_0 cq_02) {
        byte by;
        return cE != null && (cE.Yb0 == 132 || cq_02.B2.zc == (by = this.HU) || cq_02.Cw.zc == by);
    }
}

