/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.CE;
import f.cq_0;
import f.k1_0;

/*
 * Renamed from f.CoM7
 */
public class ChatChannelSubPacket
extends BaseSubProtocolPacket {
    public ChatChannelSubPacket(byte by) {
        super((byte)1, by);
    }

    @Override
    public final boolean Ev0(CE cE, cq_0 cq_02) {
        if (cE.vn()) {
            return false;
        }
        if (cE.Yb0 == 132) {
            return true;
        }
        int n = cq_02.Ai;
        if (n == 255) {
            return this.HU == -1;
        }
        byte by = 1;
        if (((byte)cE.vQ & 0xFF) >= n) {
            by = 0;
        }
        return by == this.HU;
    }
}

