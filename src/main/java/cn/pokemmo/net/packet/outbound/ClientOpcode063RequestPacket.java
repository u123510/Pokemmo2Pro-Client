/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.bt_0;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.gg
 */
public class ClientOpcode063RequestPacket
extends RE {
    public final bt_0 pI0;

    public ClientOpcode063RequestPacket(bt_0 bt_02) {
        super(63);
        this.pI0 = bt_02;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        this.pI0.rp0(byteBuffer);
    }
}

