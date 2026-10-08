/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.Mg;
import java.nio.ByteBuffer;

public class KeepAlivePacket
extends BaseSystemProtocolPacket {
    public final int iI;

    public KeepAlivePacket(byte by, int n) {
        super(by);
        this.iI = n;
    }

    @Override
    public final int ha() {
        return this.iI;
    }

    @Override
    public final void hG(ByteBuffer byteBuffer) {
        byteBuffer.put(this.mG);
        byteBuffer.putInt(this.iI);
    }
}

