/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.Jh;
import f.O8;
import f.a10_0;
import f.k20_0;
import f.pi0_1;
import f.tw0_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.dv
 */
public class BattleOpcode201Packet
extends GH {
    public byte CH;

    public BattleOpcode201Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.CH = this.Rj.get();
    }

    @Override
    public final void os0() {
        a10_0 a10_02 = tw0_0.PK0;
        if (a10_02 != null && !a10_02.a40) {
            a10_0 a10_03 = a10_02;
            O8 o8 = a10_03.mn(a10_03.Ez0());
            if (o8 instanceof Jh) {
                o8 = o8.L40(a10_02.AD);
            }
            if (o8 instanceof pi0_1) {
                System.out.println(o8.M2() + " " + this.CH);
                pi0_1 cfr_ignored_0 = (pi0_1)o8;
            }
            return;
        }
    }
}

