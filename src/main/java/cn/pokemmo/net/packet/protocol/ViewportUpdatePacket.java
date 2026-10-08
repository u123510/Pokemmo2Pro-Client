/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.Mg;
import java.nio.ByteBuffer;

/*
 * Renamed from f.vq
 */
public class ViewportUpdatePacket
extends BaseSystemProtocolPacket {
    public final short Ae0;

    public ViewportUpdatePacket(short s) {
        super((byte)0);
        this.Ae0 = s;
    }

    @Override
    public final int ha() {
        return this.Ae0;
    }

    @Override
    public final void hG(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.put(this.mG);
        byteBuffer2.putShort((short)1);
        byteBuffer.putShort(this.Ae0);
    }
}

