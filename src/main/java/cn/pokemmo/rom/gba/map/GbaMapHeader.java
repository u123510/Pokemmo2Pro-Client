/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.gba.map;

import f.*;

import f.G90;
import f.Qr0;
import f.Z0;
import f.gh_0;
import f.ng0_0;
import f.qa0_1;
import f.s4_0;
import f.sm0_0;
import f.tW;
import f.y3;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class GbaMapHeader {
    public final byte OF0;
    public final int XL0;
    public final int eW;
    public final short RD0;
    public final int iR;
    public final ArrayList Nd;

    public GbaMapHeader(int n, int n2, ByteBuffer byteBuffer, qa0_1 qa0_12) {
        this.Nd = new ArrayList();
        this.OF0 = qa0_12.rt0();
        this.XL0 = n;
        this.eW = n2;
        n = G90.GF0(byteBuffer.getInt());
        ng0_0 ng0_02 = Z0.Bm().nW(qa0_12.rt0(), n);
        int n3 = ng0_02 == null ? -1 : (int)ng0_02.VO;
        ByteBuffer byteBuffer2 = byteBuffer;
        this.RD0 = (short)n3;
        byteBuffer2.getInt();
        n3 = G90.GF0(byteBuffer2.getInt());
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer;
        byteBuffer4.getInt();
        byteBuffer4.getShort();
        byteBuffer4.getShort();
        this.iR = byteBuffer4.get() & 0xFF;
        tW.hL0(byteBuffer3.get());
        s4_0.Sb0(byteBuffer3.get());
        gh_0.t1(byteBuffer3.get());
        byteBuffer3.get();
        byteBuffer3.get();
        byteBuffer3.get();
        y3.wv0(byteBuffer3.get());
        if (n3 > 0) {
            byte by;
            ByteBuffer byteBuffer5 = qa0_12.vy0();
            byteBuffer5.position(n3);
            while ((by = byteBuffer5.get()) >= 1) {
                int n4 = G90.GF0(byteBuffer5.getInt());
                if (by != 2 && by != 4) {
                    this.Nd.add(new Qr0());
                    continue;
                }
                ByteBuffer byteBuffer6 = qa0_12.vy0();
                byteBuffer6.position(n4);
                while (byteBuffer6.getShort() != 0) {
                    ByteBuffer byteBuffer7 = byteBuffer6;
                    byteBuffer7.getShort();
                    byteBuffer7.getInt();
                    this.Nd.add(new Qr0());
                }
            }
        }
    }

    public GbaMapHeader(int n, int n2, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        ByteBuffer byteBuffer3 = byteBuffer;
        this.Nd = new ArrayList();
        this.OF0 = (byte)(n / 50);
        this.XL0 = n;
        this.eW = n2;
        this.RD0 = byteBuffer.getShort();
        byteBuffer3.getShort();
        byteBuffer3.getShort();
        this.iR = byteBuffer3.get() & 0xFF;
        tW.hL0(byteBuffer2.get());
        s4_0.Sb0(byteBuffer2.get());
        gh_0.t1(byteBuffer2.get());
        byteBuffer2.get();
        byteBuffer2.get();
        byteBuffer2.get();
        y3.wv0(byteBuffer2.get());
    }

    public final String Nw0() {
        byte by = this.OF0;
        if (by == 0) {
            return sm0_0.c0((this.iR & 0xFF) - -139912);
        }
        return sm0_0.c0(by * 1000 + 140000 + (this.iR & 0xFF));
    }
}

