/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GG0;
import f.GH;
import f.gz_1;
import f.k20_0;
import f.tw0_0;
import java.nio.ByteBuffer;

public class PlayerMoneyUpdatePacket
extends GH {
    public int p60;

    public PlayerMoneyUpdatePacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.p60 = this.Rj.getInt();
    }

    @Override
    public final void os0() {
        gz_1 gz_12;
        int n = this.p60;
        if (n < 1) {
            GG0 gG0 = (GG0)tw0_0.Xl0.HV.get(0);
            if (gG0 instanceof gz_1) {
                gG0 = (gz_1)gG0;
                if (!((gz_1)gG0).Uq0) {
                    ((gz_1)gG0).Uq0 = true;
                    ((gz_1)gG0).kw();
                    tw0_0.Xl0.HV.sj0(gG0, true);
                }
            }
            return;
        }
        gz_1 gz_13 = new gz_1((long)n);
        n = 0;
        tw0_0.Xl0.HV.P6(n, gz_13);
    }
}

