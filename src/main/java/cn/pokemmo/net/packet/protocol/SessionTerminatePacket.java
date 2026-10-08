/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.CE;
import f.Mg;
import f.cq_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.nN
 */
public class SessionTerminatePacket
extends BaseSystemProtocolPacket {
    public final int pv0;
    public final int hb0;

    public SessionTerminatePacket(int n, int n2) {
        super((byte)15);
        this.pv0 = n;
        this.hb0 = n2;
    }

    @Override
    public final void hG(ByteBuffer byteBuffer) {
        byteBuffer.put(this.mG);
        byteBuffer.putInt(this.pv0);
        byteBuffer.putInt(this.hb0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean Ev0(CE cE, cq_0 cq_02) {
        if (cE == null) {
            return false;
        }
        int n = cE.t50;
        if (n <= this.pv0) return false;
        if (n >= this.hb0) return false;
        return true;
    }
}

