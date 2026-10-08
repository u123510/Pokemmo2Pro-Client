/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.RE;
import f.k20_0;
import f.py_1;
import f.wx_2;
import java.nio.ByteBuffer;

/*
 * Renamed from f.m2
 */
public class ClientOpcode225RequestPacket
extends RE {
    public final byte dt;
    public final byte Kv;
    public final byte lh0;
    public final short dw0;
    public final py_1 tz;

    public ClientOpcode225RequestPacket(byte by, byte by2, byte by3, py_1 py_12, short s) {
        super(225);
        this.dt = by;
        this.Kv = by2;
        this.lh0 = by3;
        this.dw0 = s;
        if (py_12 == null) {
            py_12 = new py_1(new wx_2());
        }
        this.tz = py_12;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        byteBuffer.put(this.dt);
        byteBuffer.put(this.Kv);
        byteBuffer.put(this.lh0);
        byteBuffer.putShort(this.dw0);
        this.tz.hG(byteBuffer);
    }
}

