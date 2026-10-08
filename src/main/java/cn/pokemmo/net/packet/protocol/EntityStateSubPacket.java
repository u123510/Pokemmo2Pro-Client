/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.CE;
import f.cq_0;
import f.k1_0;

public class EntityStateSubPacket
extends BaseSubProtocolPacket {
    public EntityStateSubPacket(byte by) {
        super((byte)34, by);
    }

    @Override
    public final boolean Ev0(CE cE, cq_0 cq_02) {
        byte by = this.HU;
        return (cE.jw0 & by) == by;
    }
}

