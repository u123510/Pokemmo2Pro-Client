/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.GH;
import f.Im;
import f.TT;
import f.av_1;
import f.k20_0;
import f.sf0_2;
import f.zo_0;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;

/*
 * Renamed from f.c00
 */
public class ServerOpcode075Packet
extends GH {
    public Im kD;

    public ServerOpcode075Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.kD = this.X90();
    }

    @Override
    public final void os0() {
        Im im = this.kD;
        av_1 av_12 = im.SJ0;
        float oldElo = this.sr0().A20.op0(im.u20, av_12).UI0;
        float newElo = this.kD.UI0;
        if (oldElo != newElo) {
            float difference = newElo - oldElo;
            DecimalFormat format = new DecimalFormat("#.00");
            String message = new StringBuilder("Your current ELO is now: ")
                .append(format.format(this.kD.UI0)).append(" (")
                .append(difference > 0.0f ? "+" : "")
                .append(format.format(difference)).append(").").toString();
            this.sr0().ug(new sf0_2(zo_0.n4, CH0.j1, "", null, (byte)0, message));
        }
        TT tT = ((GH)this).sr0().A20;
        Im[] imArray = new Im[]{this.kD};
        tT.getClass();
        Im entry = imArray[0];
        byte rank = entry.SJ0.NR;
        tT.r0.put(entry.u20 * 16 + rank, entry);
    }
}
