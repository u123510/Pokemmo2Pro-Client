package cn.pokemmo.rom.nds.terrain;

import f.GT;
import f.c1_0;
import f.ha0_1;
import f.qa0_0;
import f.rf0_1;
import f.si0_0;
import f.sq_0;
import f.zj_1;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * NDS 3D 地形高度场与高程网格数据块 (NDS 3D Terrain Elevation & Collision Chunk)
 * <p>
 * 从二进制流（魔数 {@code 0x43484E4B} 即 "CHUN"）解包各面元、法线与坡度记录，
 * 并通过 {@link #ay0()} 计算并填充 32x32 局部网格的高程表 {@code Lo}。
 * <p>
 * 原始混淆类: {@code f.o2_0}
 */
public class NdsTerrainElevationChunk {
    public final byte I40;
    public final short XW;
    public final qa0_0[] Eh0;
    public final rf0_1[] MK;
    public final zj_1[] rz;
    public final sq_0[] jw;
    public final GT[] Pc0;
    public final c1_0[] cH0;
    public ha0_1 Lo;
    public int sr0;
    public boolean o4;

    public static boolean vo(ByteBuffer byteBuffer) {
        return byteBuffer.getInt(((Buffer) byteBuffer).position()) == 1128809538;
    }

    public NdsTerrainElevationChunk(byte b, ByteBuffer byteBuffer, short s) {
        this.sr0 = 1;
        this.o4 = false;
        this.I40 = b;
        this.XW = s;
        if (!vo(byteBuffer)) {
            this.Eh0 = null;
            this.MK = null;
            this.rz = null;
            this.jw = null;
            this.Pc0 = null;
            this.cH0 = null;
            this.Lo = new ha0_1(1);
            return;
        }
        byteBuffer.getInt();
        this.Eh0 = new qa0_0[byteBuffer.getShort()];
        this.MK = new rf0_1[byteBuffer.getShort()];
        this.rz = new zj_1[byteBuffer.getShort()];
        this.jw = new sq_0[byteBuffer.getShort()];
        this.Pc0 = new GT[byteBuffer.getShort()];
        this.cH0 = new c1_0[byteBuffer.getShort()];

        for (short s2 = 0; s2 < this.Eh0.length; s2 = (short) (s2 + 1)) {
            this.Eh0[s2] = new qa0_0(byteBuffer);
        }
        for (short s3 = 0; s3 < this.MK.length; s3 = (short) (s3 + 1)) {
            this.MK[s3] = new rf0_1(byteBuffer);
        }
        for (short s4 = 0; s4 < this.rz.length; s4 = (short) (s4 + 1)) {
            this.rz[s4] = new zj_1(byteBuffer);
        }
        for (short s5 = 0; s5 < this.jw.length; s5 = (short) (s5 + 1)) {
            this.jw[s5] = new sq_0(this, byteBuffer);
        }
        for (short s6 = 0; s6 < this.Pc0.length; s6 = (short) (s6 + 1)) {
            this.Pc0[s6] = new GT(byteBuffer);
        }
        for (short s7 = 0; s7 < this.cH0.length; s7 = (short) (s7 + 1)) {
            this.cH0[s7] = new c1_0(byteBuffer);
        }
        ay0();
    }

    public final qa0_0[] bB0() {
        return this.Eh0;
    }

    public final rf0_1[] xD0() {
        return this.MK;
    }

    public final zj_1[] Xt0() {
        return this.rz;
    }

    public final void ay0() {
        if (this.o4) {
            return;
        }
        this.Lo = new ha0_1(1024);
        int maxL = 0;
        float f = 1.6f;
        if (this.I40 == 4) {
            switch (this.XW) {
                case 109:
                case 110:
                case 111:
                case 112:
                    f = 1.4f;
                    break;
                default:
                    break;
            }
        }
        sq_0[] arr = this.jw;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            sq_0 sq = arr[i];
            qa0_0 rt = sq.rt0;
            qa0_0 sync = sq.synchronized$;
            int dx = rt.SV - sync.SV;
            int dy = rt.V7 - sync.V7;
            int baseX = sync.SV + 16;
            int baseY = sync.V7 + 16;
            for (int curX = baseX; curX < baseX + dx; curX++) {
                if (curX >= 0) {
                    if (curX >= 32) {
                        break;
                    }
                    for (int curY = baseY; curY < baseY + dy; curY++) {
                        if (curY >= 0) {
                            if (curY >= 32) {
                                break;
                            }
                            float height = sq.oi((float) (curX - 15), (float) (curY - 15));
                            int layer = 0;
                            int key = curY * 32 + curX;
                            while (this.Lo.bf0(key) >= 0) {
                                int idx = this.Lo.bf0(key);
                                float existing = idx < 0 ? this.Lo.DM : this.Lo.US[idx];
                                if (Math.abs(existing - height) <= f) {
                                    rf0_1 ug = sq.Ug;
                                    if (ug.S30 != 0 || ug.nN != 0) {
                                        break;
                                    }
                                    this.Lo.Ns(key, height);
                                    break;
                                }
                                layer++;
                                if (layer > maxL) {
                                    maxL = layer;
                                }
                                key = si0_0.Fz(layer, 1024, curY * 32, curX);
                            }
                            if (this.Lo.bf0(key) < 0) {
                                this.Lo.Ns(key, height);
                            }
                        }
                    }
                }
            }
        }

        sq_0[] arr2 = this.jw;
        int len2 = arr2.length;
        for (int i2 = 0; i2 < len2; i2++) {
            sq_0 sq2 = arr2[i2];
            qa0_0 sync2 = sq2.synchronized$;
            if (sync2.Jk != 0 || sync2.o90 != 0 || sq2.rt0.Jk != 0 || sq2.rt0.o90 != 0) {
                int absX = Math.abs(sync2.SV - (sq2.rt0.SV + ((-sq2.rt0.Jk | sq2.rt0.Jk) >>> -1)));
                int absY = Math.abs(sq2.synchronized$.V7 - (sq2.rt0.V7 + ((-sq2.rt0.o90 | sq2.rt0.o90) >>> -1)));
                int startX = sq2.synchronized$.SV + 16;
                int startY = sq2.synchronized$.V7 + 16;
                for (int curX2 = startX; curX2 < startX + absX; curX2++) {
                    if (curX2 >= 0) {
                        if (curX2 >= 32) {
                            break;
                        }
                        for (int curY2 = startY; curY2 < startY + absY; curY2++) {
                            if (curY2 >= 0) {
                                if (curY2 >= 32) {
                                    break;
                                }
                                if (curY2 == startY || curY2 == startY + absY - 1 || curX2 == startX || curX2 == startX + absX - 1) {
                                    float h = sq2.oi((float) (curX2 - 15), (float) (curY2 - 15));
                                    int k = curY2 * 32 + curX2;
                                    if (this.Lo.bf0(k) < 0) {
                                        this.Lo.Ns(k, h);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.sr0 = Math.min(4, maxL + 1);
        this.o4 = true;
    }

    public final float if0(int i, int i2) {
        int key = i2 * 32 + i;
        int idx = this.Lo.bf0(key);
        if (idx < 0) {
            return this.Lo.DM;
        }
        return this.Lo.US[idx];
    }

    public final float a80(int i, int i2, int i3) {
        int key = si0_0.Fz(i3, 32, i * 1024, i2);
        int idx = this.Lo.bf0(key);
        if (idx < 0) {
            return this.Lo.DM;
        }
        return this.Lo.US[idx];
    }

    public final void fn() {
        for (int i = 11; i <= 18; i++) {
            int key = 704 + i;
            this.Lo.Ns(key, if0(i, 23));
        }
        for (int i = 11; i <= 18; i++) {
            for (int i2 = 29; i2 <= 31; i2++) {
                int key = i2 * 32 + i;
                this.Lo.Ns(key, if0(i, 28));
            }
        }
        for (int i = 21; i <= 22; i++) {
            for (int i2 = 24; i2 <= 27; i2++) {
                this.Lo.Ns(i2 * 32 + i, 3.0f);
            }
        }
    }

    public final void SG0() {
        for (int i = 6; i <= 31; i++) {
            for (int i2 = 28; i2 < 32; i2++) {
                this.Lo.Ns(i2 * 32 + i, 1.0f);
            }
        }
    }

    public final void md() {
        int i = 24;
        for (int i2 = 0; i2 < 32; i2++) {
            this.Lo.Ns(i2 * 32 + i, 0.0f);
        }
    }

    public final void yy0() {
        float val = if0(20, 15);
        for (int i = 19; i <= 31; i++) {
            if (i >= 21) {
                for (int j = 4; j <= 8; j++) {
                    this.Lo.Ns(j * 32 + i, val);
                }
            }
            for (int j2 = 9; j2 <= 13; j2++) {
                this.Lo.Ns(j2 * 32 + i, val);
            }
        }
    }

    public final void Lf() {
        for (int i = 6; i <= 8; i++) {
            for (int i2 = 26; i2 <= 29; i2++) {
                this.Lo.Ns(i2 * 32 + i, if0(i - 1, i2));
            }
        }
    }

    public final void ng0() {
        for (int i = 9; i <= 13; i++) {
            int key = 736 + i;
            this.Lo.Ns(key, if0(i, 22));
        }
    }

    public final void f4() {
        for (int i = 2; i <= 24; i++) {
            int key = 64 + i;
            this.Lo.Ns(key, if0(i, 3));
        }
    }

    public final void rd0() {
        for (int i = 4; i <= 20; i++) {
            for (int i2 = 23; i2 <= 24; i2++) {
                this.Lo.Ns(i2 * 32 + i, if0(i, i2 - 1));
            }
        }
    }

    public final void N80() {
        for (int i = 7; i <= 12; i++) {
            this.Lo.Ns(992 + i, 7.0f);
        }
    }

    public final void Rc0() {
        for (int i = 6; i <= 8; i++) {
            for (int i2 = 0; i2 <= 1; i2++) {
                this.Lo.Ns(i2 * 32 + i, 1.0f);
            }
        }
    }

    public final int n30() {
        return this.sr0;
    }

    public final void iy0(int i, int i2, float f) {
        this.Lo.Ns(i2 * 32 + i, f);
    }

    public final void CV() {
        float f = 0.0f;
        for (int i = 0; i < this.sr0; i++) {
            for (int i2 = 0; i2 < 32; i2++) {
                for (int i4 = 0; i4 < 32; i4++) {
                    this.Lo.Ns(si0_0.Fz(i4, 32, i * 1024, i2), f);
                }
            }
        }
    }
}
