/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.k20_0;
import f.yj_1;
import java.nio.ByteBuffer;

public class ServerOpcode029Packet
extends GH {
    public short je0;

    public ServerOpcode029Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.je0 = this.Rj.getShort();
    }

    @Override
    public final void os0() {
        if (this.sr0() != null) {
            short s = this.je0;
            yj_1 yj_12 = this.sr0().yh0.IK0;
            if (yj_12 != null) {
                yj_12.uo0(s);
            }
        }
    }
}

