/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.CE;
import f.Mg;
import f.cq_0;
import f.gc_2;
import java.nio.ByteBuffer;

/*
 * Renamed from f.lt0
 */
public class ActionDescriptorPacket
extends BaseSystemProtocolPacket {
    public final gc_2 Oe0;
    public final short D80;

    public ActionDescriptorPacket(byte by, gc_2 gc_22, short s) {
        super(by);
        this.Oe0 = gc_22;
        this.D80 = s;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean Ev0(CE cE, cq_0 object) {
        gc_2 gc_22 = this.Oe0;
        if (gc_22 == null) return false;
        if (cE == null) return false;
        byte by = this.mG;
        if (by != 5) {
            if (by != 6) {
                if (by != 17) {
                    if (by != 18) {
                        return false;
                    }
                    if (cE.ZY(gc_22) > this.D80) return false;
                    return true;
                }
                if (cE.ZY(gc_22) < this.D80) return false;
                return true;
            }
            if (cE.RI(gc_22) > this.D80) return false;
            return true;
        }
        if (cE.RI(gc_22) < this.D80) return false;
        return true;
    }

    @Override
    public final int ha() {
        return this.D80;
    }

    @Override
    public final void hG(ByteBuffer byteBuffer) {
        byteBuffer.put(this.mG);
        gc_2 gc_22 = this.Oe0;
        byte by = gc_22 == null ? (byte)0 : gc_22.v10;
        byteBuffer.put(by);
        byteBuffer.putShort(this.D80);
    }
}

