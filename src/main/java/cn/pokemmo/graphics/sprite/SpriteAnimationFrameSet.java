package cn.pokemmo.graphics.sprite;

import f.B5;
import f.LPT6_;
import f.go0_0;
import f.hk0_1;
import f.i4_0;
import f.ix0_0;
import f.vg_2;
import java.nio.ByteBuffer;

/**
 * 精灵动画帧/图块集合 (Sprite Animation Frame Set)
 * <p>
 * 原始混淆类: {@code f.db0_2}
 */
public class SpriteAnimationFrameSet {
    public final vg_2[][] Lw0;
    public final LPT6_[] BI0;
    public LPT6_[][] gO;
    public int[] NC;
    public byte oB;
    public byte wN;
    public byte W7;
    public byte Gn0;
    public final int[] zK;
    public final int cY;
    public B5[][] Nf;
    public LPT6_[] zC;
    public short bm;

    public SpriteAnimationFrameSet(int i1, ByteBuffer buf) {
        this.Lw0 = new vg_2[2][4];
        this.BI0 = new LPT6_[2];
        this.gO = null;
        this.NC = new int[2];
        this.zK = new int[2];
        this.Nf = null;
        this.zC = null;
        this.bm = 0;
        this.cY = i1;
        if (buf != null) {
            for (int i = 0; i < this.Lw0.length; i++) {
                for (int j = 0; j < this.Lw0[i].length; j++) {
                    this.Lw0[i][j] = new vg_2(buf);
                }
            }
        }
    }

    public void lD(byte b1, byte b2, byte b3, byte b4) {
        this.oB = b1;
        this.wN = b2;
        this.W7 = b3;
        this.Gn0 = b4;
    }

    public void E70(i4_0[][] v1, i4_0[][][] v2, go0_0 v3) {
        if (this.gO != null) {
            return;
        }
        this.NC = new int[2];
        for (int i4 = 0; i4 < this.Lw0.length; i4++) {
            for (int i5 = 0; i5 < this.Lw0[i4].length; i5++) {
                if (v2[i4] != null && v2[i4][i5] != null) {
                    if (v2[i4][i5].length > this.NC[i4]) {
                        this.NC[i4] = v2[i4][i5].length;
                    }
                }
            }
        }
        i4_0[][] pixmaps = new i4_0[2][];
        this.gO = new LPT6_[2][];
        for (int i5 = 0; i5 < this.Lw0.length; i5++) {
            int count = this.NC[i5];
            pixmaps[i5] = new i4_0[count];
            this.gO[i5] = new LPT6_[count];
            for (int i6 = 0; i6 < this.NC[i5]; i6++) {
                pixmaps[i5][i6] = new i4_0(16, 16, ix0_0.Vw);
            }
        }
        if (this.NC[0] < 1 && this.NC[1] < 1) {
            return;
        }
        for (int i5 = 0; i5 < this.Lw0.length; i5++) {
            this.zK[i5] = this.Lw0[i5][0].E70 & 1023;
            for (int i6 = 0; i6 < this.Lw0[i5].length; i6++) {
                if (v2[i5][i6] == null) {
                    for (int i7 = 0; i7 < this.NC[i5]; i7++) {
                        if (v1[i5][i6] != null) {
                            if (pixmaps[i5][i7] == null) {
                                pixmaps[i5][i7] = new i4_0(16, 16, ix0_0.Vw);
                            }
                            pixmaps[i5][i7].NH0(v1[i5][i6], (i6 % 2) * 8, (i6 / 2) * 8);
                        }
                    }
                } else {
                    for (int i7 = 0; i7 < this.NC[i5]; i7++) {
                        i4_0 tilePixmap = v2[i5][i6][i7 % v2[i5][i6].length];
                        boolean needDispose = false;
                        vg_2 vg_2Var = this.Lw0[i5][i6];
                        if ((vg_2Var.E70 & 1024) != 0 || (vg_2Var.E70 & 2048) != 0) {
                            i4_0 flippedPixmap = new i4_0(8, 8, tilePixmap.rH0());
                            for (int i11 = 0; i11 < 8; i11++) {
                                for (int i12 = 0; i12 < 8; i12++) {
                                    int srcX = (vg_2Var.E70 & 1024) != 0 ? 7 - i11 : i11;
                                    int srcY = (vg_2Var.E70 & 2048) != 0 ? 7 - i12 : i12;
                                    flippedPixmap.XF.XS(i11, i12, tilePixmap.XF.iH0(srcX, srcY));
                                }
                            }
                            needDispose = true;
                            tilePixmap = flippedPixmap;
                        }
                        if (pixmaps[i5][i7] != null) {
                            pixmaps[i5][i7].NH0(tilePixmap, (i6 % 2) * 8, (i6 / 2) * 8);
                        }
                        if (needDispose) {
                            tilePixmap.dispose();
                        }
                    }
                }
            }
            for (int i6 = 0; i6 < this.NC[i5]; i6++) {
                synchronized (v3) {
                    v3.y9(null, pixmaps[i5][i6]);
                }
                if (pixmaps[i5][i6] != null) {
                    pixmaps[i5][i6].dispose();
                }
            }
        }
    }

    public LPT6_ gA0(int i1) {
        int[] nc = this.NC;
        if (nc != null) {
            int len = nc[i1];
            if (len > 0) {
                int frame = (int) ((hk0_1.KG / 300L) % ((long) len));
                return this.gO[i1][frame];
            }
        }
        return this.BI0[i1];
    }

    public B5 cS(int i1, int i2) {
        B5 b5 = this.Nf[i1][i2];
        if (b5 == null) {
            return null;
        }
        short e70 = this.Lw0[i1][i2].E70;
        boolean flipX = (e70 & 1024) != 0;
        boolean flipY = (e70 & 2048) != 0;
        boolean b5FlippedX = b5.yQ > b5.Yo;
        boolean b5FlippedY = b5.Y60 > b5.Ll0;
        boolean doFlipX = b5FlippedX != flipX;
        boolean doFlipY = b5FlippedY != flipY;
        b5.Wu0(doFlipX, doFlipY);
        return this.Nf[i1][i2];
    }

    public short C90() {
        return this.bm;
    }
}
