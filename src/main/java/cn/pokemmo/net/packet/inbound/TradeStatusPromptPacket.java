/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

/*
 * Renamed from f.Jv
 */
public class TradeStatusPromptPacket
extends S20 {
    public byte ip;
    public short mL0;
    public CH0 OE0 = CH0.j1;
    public short xp0;
    public short UA;
    public byte Uv;

    public TradeStatusPromptPacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(byteBuffer, k20_02);
    }

    @Override
    public final void Oj0() {
        TradeStatusPromptPacket jv_02 = this;
        jv_02.ip = jv_02.Rj.get();
        jv_02.mL0 = jv_02.Rj.getShort();
        jv_02.OE0 = jv_02.pE();
        jv_02.xp0 = jv_02.Rj.getShort();
        jv_02.UA = jv_02.Rj.getShort();
        jv_02.Uv = jv_02.Rj.get();
    }

    @Override
    public final void os0() {
        Ge0 ge0 = this.sr0();
        TradeStatusPromptPacket jv_02 = this;
        byte by = jv_02.ip;
        short s = jv_02.mL0;
        CH0 cH0 = jv_02.OE0;
        short s2 = jv_02.xp0;
        short s3 = jv_02.UA;
        byte by2 = jv_02.Uv;
        Dm0 dm0 = ge0.bh;
        if (dm0 != null) {
            if (dm0.hq0) {
                VF0 vF02 = new VF0(by2, cH0, s2, s3);
                dm0.Ti0[by][s] = vF02;
                dm0.aUX = true;
            }
            if (by == dm0.c80) {
                ge0.yt0();
            }
        }
    }
}

