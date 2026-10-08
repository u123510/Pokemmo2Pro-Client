/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.GH;
import f.k20_0;
import java.nio.ByteBuffer;

public class TargetFocusPacket
extends GH {
    public CH0 kg;

    public TargetFocusPacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.kg = this.pE();
    }

    @Override
    public final void os0() {
        this.sr0().cJ0.xc(this.kg);
    }
}

