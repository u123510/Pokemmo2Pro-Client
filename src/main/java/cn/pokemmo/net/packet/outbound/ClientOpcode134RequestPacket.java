/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.oW
 */
public class ClientOpcode134RequestPacket
extends RE {
    public final short hI0;
    public final short yl0;
    public final short Be0;
    public final short zD0;
    public final short cJ;

    public ClientOpcode134RequestPacket(short s, short s2, short s3, short s4, short s5) {
        super(134);
        this.hI0 = s;
        this.yl0 = s2;
        this.Be0 = s3;
        this.zD0 = s4;
        this.cJ = s5;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.hI0);
        byteBuffer.putShort(this.yl0);
        byteBuffer.putShort(this.Be0);
        byteBuffer.putShort(this.zD0);
        byteBuffer.putShort(this.cJ);
    }
}

