/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import f.Cq;
import f.GV;
import f.N2;
import f.RE;
import f.bo_1;
import f.k20_0;
import f.lq0;
import java.nio.ByteBuffer;

public class CharacterCreationRequestPacket
extends RE {
    public final String FC;
    public final Cq XE;
    public final byte OS;
    public final byte oy0;
    public final N2 Pp0;
    public final lq0[] Jd0;
    public final byte Iu0;
    public final byte xC0;

    public CharacterCreationRequestPacket(String string, Cq cq, boolean bl, boolean bl2, boolean bl3, byte by, byte by2, N2 n2, lq0[] lq0Array, byte by3) {
        super(37);
        this.FC = string;
        this.XE = cq;
        this.oy0 = by;
        this.Pp0 = n2;
        this.Jd0 = lq0Array;
        this.Iu0 = by2;
        this.xC0 = by3;
        byte by4 = 0;
        if (bl) {
            by4 = (byte)1;
        }
        if (bl2) {
            by4 = (byte)(by4 | 2);
        }
        if (bl3) {
            by4 = (byte)(by4 | 4);
        }
        if (by > 0) {
            by4 = (byte)(by4 | 8);
        }
        if (n2 != null) {
            by4 = (byte)(by4 | 0x10);
        }
        if (lq0Array.length > 0) {
            by4 = (byte)(by4 | 0x20);
        }
        if (by2 > 0) {
            by4 = (byte)(by4 | 0x40);
        }
        this.OS = by4;
    }

    @Override
    public final void ig0(k20_0 k20_02, ByteBuffer byteBuffer) {
        CharacterCreationRequestPacket bs0 = this;
        bo_1.cK(bs0.FC, byteBuffer);
        byteBuffer.put(bs0.XE.WW);
        byteBuffer.put(this.xC0);
        byteBuffer.put(this.OS);
        if ((this.OS & 8) != 0) {
            byteBuffer.put(this.oy0);
        }
        if ((this.OS & 0x10) != 0) {
            byteBuffer.put(this.Pp0.yz);
        }
        if ((this.OS & 0x20) != 0) {
            lq0[] lq0Array = this.Jd0;
            byteBuffer.put((byte)lq0Array.length);
            int n = this.Jd0.length;
            for (int j = 0; j < n; ++j) {
                lq0 lq02 = lq0Array[j];
                GV gV = lq02.xz0;
                byteBuffer.put(gV.gk);
                if (!gV.jC0) continue;
                byteBuffer.put(lq02.rE);
            }
        }
        if ((this.OS & 0x40) != 0) {
            byteBuffer.put(this.Iu0);
        }
    }
}

