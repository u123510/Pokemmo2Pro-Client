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
 * Renamed from f.Kb0
 */
public class ClientOpcode082RequestPacket
extends RE {
    public final int Rc;

    public ClientOpcode082RequestPacket(int n) {
        super(82);
        this.Rc = n;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Rc);
    }
}

