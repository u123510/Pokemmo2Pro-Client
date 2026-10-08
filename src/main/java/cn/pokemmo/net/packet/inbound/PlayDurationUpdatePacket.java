/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.BR;
import f.BU;
import f.CH0;
import f.GH;
import f.k20_0;
import java.nio.ByteBuffer;
import java.time.Duration;

public class PlayDurationUpdatePacket
extends GH {
    public boolean LK0;
    public CH0 WO = CH0.j1;
    public Duration yf0;
    public Duration eJ0;

    public PlayDurationUpdatePacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        boolean bl = this.Rj.get() == 1;
        this.LK0 = bl;
        if (!bl) {
            return;
        }
        PlayDurationUpdatePacket c402 = this;
        c402.WO = c402.pE();
        c402.yf0 = Duration.ofSeconds(c402.Rj.getShort() & 0xFFFF);
        c402.eJ0 = Duration.ofSeconds(c402.Rj.getShort() & 0xFFFF);
    }

    @Override
    public final void os0() {
        if (!this.LK0) {
            BU controller = ((BR)this.sr0()).lZ.zK0;
            if (controller != null) {
                controller.m80();
            }
            return;
        }
        BU controller = ((BR)this.sr0()).lZ.zK0;
        if (controller != null) {
            controller.WZ(this.WO, this.yf0, this.eJ0);
        }
    }
}
