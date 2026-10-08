/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.RE;
import f._volatile;
import f.k20_0;
import java.nio.ByteBuffer;

public class ClientOpcode015RequestPacket
extends RE {
    public final CH0 od0;
    public final short Cn0;
    public final _volatile YH0;

    public ClientOpcode015RequestPacket(_volatile volatile_, CH0 cH0, short s) {
        super(15);
        this.od0 = cH0;
        this.Cn0 = s;
        this.YH0 = volatile_;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.od0.Sa);
        byteBuffer.putShort(this.Cn0);
        byteBuffer.put(this.YH0.Go0);
    }
}

