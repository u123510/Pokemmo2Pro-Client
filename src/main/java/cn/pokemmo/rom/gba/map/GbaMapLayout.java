/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.gba.map;

import f.*;

import f.Cq0;
import f.G90;
import f.br_2;
import f.ku0_0;
import f.qa0_1;
import java.nio.ByteBuffer;

/*
 * Renamed from f.Ng0
 */
public class GbaMapLayout {
    public final short VO;
    public final int Nv0;
    public final byte Dg;
    public final byte FY;
    public final boolean Ls0;
    public short[] sh0;
    public short[] ls0;

    public GbaMapLayout(short s, ByteBuffer byteBuffer, qa0_1 qa0_12) {
        int n;
        qa0_1 qa0_13 = qa0_12;
        ByteBuffer byteBuffer2 = byteBuffer;
        this.VO = s;
        byteBuffer2.position();
        int n2 = byteBuffer2.getInt();
        int n3 = byteBuffer2.getInt();
        this.Nv0 = n = G90.GF0(byteBuffer2.getInt());
        int n4 = G90.GF0(byteBuffer2.getInt());
        int n5 = G90.GF0(byteBuffer2.getInt());
        int n6 = G90.GF0(byteBuffer2.getInt());
        qa0_1 qa0_14 = qa0_12;
        int n7 = n5;
        n5 = br_2.XB;
        int cfr_ignored_0 = (n7 - qa0_12.lQ().V(n5)) / 24;
        qa0_14.rt0();
        int cfr_ignored_1 = (n6 - qa0_14.lQ().V(n5)) / 24;
        qa0_13.rt0();
        if (qa0_13.rt0() == 1) {
            this.Dg = (byte)2;
            this.FY = (byte)2;
        } else {
            ByteBuffer byteBuffer3 = byteBuffer;
            this.Dg = byteBuffer3.get();
            this.FY = byteBuffer3.get();
            byteBuffer3.getShort();
        }
        this.Ls0 = n2 <= 65535 && n3 <= 65535 && this.Dg >= 0 && this.FY >= 0 && n4 >= 1 && n4 < byteBuffer.limit() && n >= 1 && n < byteBuffer.limit();
        if (this.Ls0) {
            short[] sArray;
            byteBuffer.position(n4);
            this.sh0 = new short[n2 * n3];
            n2 = 0;
            while (true) {
                sArray = this.sh0;
                if (n2 >= this.sh0.length) break;
                sArray[n2] = byteBuffer.getShort();
                ++n2;
            }
            byteBuffer.position(this.Nv0);
            this.ls0 = new short[this.Dg * this.FY];
            n2 = 0;
            while (true) {
                sArray = this.ls0;
                if (n2 >= this.ls0.length) break;
                sArray[n2] = byteBuffer.getShort();
                ++n2;
            }
            ku0_0.YH().Qm0(qa0_12.rt0(), s, this.sh0);
        }
    }

    public GbaMapLayout(byte by, ByteBuffer byteBuffer, short s) {
        byte by2;
        byte by3;
        this.VO = s;
        int n = byteBuffer.getInt();
        ByteBuffer byteBuffer2 = byteBuffer;
        int n2 = byteBuffer.getInt();
        this.Nv0 = 0;
        byteBuffer2.getInt();
        byteBuffer2.getInt();
        this.Dg = by3 = byteBuffer2.get();
        this.FY = by2 = byteBuffer.get();
        byteBuffer.getShort();
        this.Ls0 = n <= 65535 && n2 <= 65535 && by3 >= 0 && by2 >= 0;
        if (this.Ls0) {
            short[] sArray;
            this.sh0 = new short[n * n2];
            n = 0;
            while (true) {
                sArray = this.sh0;
                if (n >= this.sh0.length) break;
                sArray[n] = byteBuffer.getShort();
                ++n;
            }
            this.ls0 = new short[this.Dg * this.FY];
            n = 0;
            while (true) {
                sArray = this.ls0;
                if (n >= this.ls0.length) break;
                sArray[n] = byteBuffer.getShort();
                ++n;
            }
            ku0_0.YH().Qm0(by, s, this.sh0);
        }
    }

    static {
        Cq0.E1(ng0_0.class);
    }
}

