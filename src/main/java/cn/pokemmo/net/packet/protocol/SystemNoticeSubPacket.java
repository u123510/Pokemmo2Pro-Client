/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.CE;
import f.cq_0;
import f.k1_0;

/*
 * Renamed from f.z30
 */
public class SystemNoticeSubPacket
extends BaseSubProtocolPacket {
    public SystemNoticeSubPacket(byte by) {
        super((byte)13, by);
    }

    @Override
    public final boolean Ev0(CE cE, cq_0 cq_02) {
        return cE == null ? false : (this.HU == 0 ? cE.ca() : cE.ca() ^ true);
    }
}

