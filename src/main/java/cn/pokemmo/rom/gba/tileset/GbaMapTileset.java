package cn.pokemmo.rom.gba.tileset;

import f.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class GbaMapTileset {
    public final int eR;
    public final Q20 lO;
    public final i8_0[] V10;
    public final p2_0 v2;
    public final BN fv;
    public final boolean wf;
    public final qa0_1 Gn;

    public GbaMapTileset(int i1, qa0_1 v2, p2_0 v3) {
        this.V10 = new i8_0[16];
        this.eR = i1;
        this.v2 = v3;
        this.Gn = v2;
        ByteBuffer v4 = v2.vy0();
        int i5 = v2.lQ().V(br_2.XB) + (i1 * 24);
        if (v2.rt0() == 1 && i1 > 57) {
            i5 += 8;
        }
        v4.position(i5);
        v4.get();
        boolean isSub = v4.get() > 0;
        this.wf = isSub;
        if (isSub && v3 == null) {
            throw new RuntimeException("Tileset: " + i1 + " is a sub tileset, but is being used as a main.");
        }
        v4.get();
        XG0 v6 = (v4.get() == 1) ? XG0.fP : XG0.hi0;
        int i7 = G90.GF0(v4.getInt());
        int i8 = G90.GF0(v4.getInt());
        int i9 = G90.GF0(v4.getInt());
        int i10;
        int i11;
        if (v2.rt0() == 1) {
            i10 = G90.GF0(v4.getInt());
            i11 = G90.GF0(v4.getInt());
        } else {
            i11 = G90.GF0(v4.getInt());
            i10 = G90.GF0(v4.getInt());
        }
        if (i11 > 0 && i11 < v4.limit()) {
            q6_0.nb0().ho(i1, i11, v2);
        }
        int tileCount = (i10 - i9) / 16;
        if (tileCount < 0 || tileCount > 640) {
            throw new RuntimeException("Invalid tile count of " + tileCount + " for tileset " + i1);
        }
        if (!isSub && v2.rt0() == 1) {
            tileCount = 512;
        }
        for (int i = 0; i < this.V10.length; i++) {
            this.V10[i] = da_0.gs0().OY(v6, i8, v2);
            i8 += 32;
            if (c8_0.A90().YG() != 1) {
                this.V10[i] = Bg.C80(v2.rt0(), c8_0.A90().YG(), i1, i, this.V10[i]);
            }
        }
        this.lO = new Q20(i7, 16, 80, v6, v4);
        this.fv = new BN(i9, i1, v3, tileCount, v2.rt0(), v2.vy0());
        v4.position(i10);
        db0_2[] blocks = this.fv.lpt2();
        for (int i = 0; i < blocks.length; i++) {
            db0_2 block = blocks[i];
            if (v2.rt0() == 1) {
                byte b1 = v4.get();
                byte b2 = v4.get();
                block.lD(b1, (byte) 0, (byte) 0, b2);
            } else {
                byte b1 = v4.get();
                byte b2 = v4.get();
                byte b3 = v4.get();
                byte b4 = v4.get();
                block.lD(b1, b2, b3, b4);
            }
        }
    }

    public void nj(ByteBuffer v1, go0_0 v2, p2_0 v3) {
        db0_2[] blocks = this.fv.z00;
        int numBlocks = blocks.length;
        for (int i6 = 0; i6 < numBlocks; i6++) {
            db0_2 block = blocks[i6];
            int cY = block.cY;
            cl_1 cl = cl_1.nj0;
            LPT5_ lpt5 = (LPT5_) cl.X7.get(Integer.valueOf(this.Gn.rt0() * 10000 + cY));
            if (lpt5 != null) {
                ByteBuffer v10 = v1.duplicate().order(ByteOrder.LITTLE_ENDIAN);
                int wB0 = lpt5.wB0;
                short sn = lpt5.SN;
                int i12;
                if ((sn & 512) != 0) {
                    i12 = 24;
                } else if ((sn & 256) != 0) {
                    i12 = 12;
                } else {
                    i12 = 8;
                }
                v10.position(wB0);
                byte[] bytes;
                if (tx_1.T30(v10, kd_2.Gu0) > 0) {
                    bytes = tx_1.Gi(wB0, v10);
                } else {
                    bytes = new byte[i12 * 64];
                    v10.get(bytes);
                }
                byte[] jN = lpt5.jN;
                int frameCount = bytes.length / 2 / 2 * 8 / 16 / 2 / 8;
                i4_0[] frames = new i4_0[frameCount];
                int i14 = 16;
                int i15 = 128;
                for (int i16 = 0; i16 < frameCount; i16++) {
                    frames[i16] = new i4_0(i14, i14, ix0_0.Vw);
                    int x = 0;
                    int y = 0;
                    int startOffset = i16 * i15;
                    for (int i20 = startOffset; i20 < startOffset + i15; i20++) {
                        i8_0 palette = this.V10[jN[(i20 / 32) % jN.length]];
                        byte b = bytes[i20];
                        int p1 = b & 15;
                        int p2 = (b >> 4) & 15;
                        if (p1 > 0) {
                            frames[i16].XF.XS(x, y, palette.ax[p1]);
                        }
                        if (p2 > 0) {
                            frames[i16].XF.XS(x + 1, y, palette.ax[p2]);
                        }
                        int nextX = x + 2;
                        int nextY = y;
                        if (nextX % 8 == 0) {
                            nextY = y + 1;
                            if (nextY % 8 == 0) {
                                nextY = y - 7;
                            } else {
                                nextX = x - 6;
                            }
                            if (nextX == i14) {
                                x = 0;
                                y = nextY + 8;
                            } else {
                                x = nextX;
                                y = nextY;
                            }
                        } else {
                            x = nextX;
                        }
                    }
                }
                lpt5.zy0 = frameCount;
                for (int i8 = 0; i8 < frameCount; i8++) {
                    synchronized (v2) {
                        v2.y9(null, frames[i8]);
                    }
                    frames[i8].dispose();
                }
            }

            i4_0[] v8 = new i4_0[2];
            v8[0] = new i4_0(16, 16, ix0_0.Vw);
            v8[1] = new i4_0(16, 16, ix0_0.Vw);
            i4_0[][] v9 = new i4_0[2][4];
            i4_0[][][] v10 = new i4_0[2][4][];
            boolean hasAnim = false;

            for (int i12 = 0; i12 < 2; i12++) {
                boolean empty = true;
                for (int i14 = 0; i14 < 4; i14++) {
                    vg_2 subTile = block.Lw0[i12][i14];
                    int tileId = subTile.E70 & 1023;
                    i4_0 tilePix;
                    if (this.wf) {
                        p2_0 parent = this.v2;
                        db0_2[] parentBlocks = parent.fv.z00;
                        if (tileId < parentBlocks.length) {
                            int palIndex = subTile.gs();
                            i8_0 pal = (palIndex < 6) ? parent.V10[palIndex] : this.V10[palIndex];
                            tilePix = parent.lO.SQ(tileId, pal);
                        } else {
                            int offset = tileId - parentBlocks.length;
                            int palIndex = subTile.gs();
                            i8_0 pal = (palIndex < 6) ? parent.V10[palIndex] : this.V10[palIndex];
                            tilePix = this.lO.SQ(offset, pal);
                        }
                    } else {
                        db0_2[] myBlocks = this.fv.z00;
                        if (tileId < myBlocks.length) {
                            tilePix = this.lO.SQ(tileId, this.V10[subTile.gs()]);
                        } else {
                            tilePix = v3.lO.SQ(tileId - myBlocks.length, v3.V10[subTile.gs()]);
                        }
                    }

                    if (tilePix != null) {
                        empty = false;
                        short flags = subTile.E70;
                        if ((flags & 1024) != 0 || (flags & 2048) != 0) {
                            i4_0 flipped = new i4_0(8, 8, tilePix.rH0());
                            for (int i18 = 0; i18 < 8; i18++) {
                                for (int i19 = 0; i19 < 8; i19++) {
                                    int srcX = ((subTile.E70 & 1024) != 0) ? (7 - i18) : i18;
                                    int srcY = ((subTile.E70 & 2048) != 0) ? (7 - i19) : i19;
                                    int color = tilePix.XF.iH0(srcX, srcY);
                                    flipped.XF.XS(i18, i19, color);
                                }
                            }
                            tilePix.dispose();
                            tilePix = flipped;
                        }
                        v8[i12].NH0(tilePix, (i14 % 2) * 8, (i14 / 2) * 8);
                    }
                    v9[i12][i14] = tilePix;

                    q6_0 q6 = q6_0.EG0;
                    int animTileId = subTile.E70 & 1023;
                    boolean isSub = this.wf;
                    int tilesetId = (isSub && animTileId <= this.v2.fv.z00.length) ? this.v2.eR : this.eR;
                    i8_0 pal = (isSub && animTileId <= this.v2.fv.z00.length) ? this.v2.V10[subTile.gs()] : this.V10[subTile.gs()];
                    qa0_1 rom = this.Gn;
                    xc0_2[] animDefs = q6.An0;
                    Dz0 animData = null;
                    for (int i22 = 0; i22 < animDefs.length; i22++) {
                        xc0_2 def = animDefs[i22];
                        if (def.n0 == 0) continue;
                        if (tilesetId == def.lb0 && rom.rt0() == def.Ax0 && animTileId >= def.Zh && animTileId < def.Pm) {
                            animData = (Dz0) def.Vy.get(Integer.valueOf(pal.nv0));
                            if (animData == null) {
                                animData = new Dz0(v1, def.n0, pal, def.t3, def.Zh, def.LG0, def.rw);
                                def.Vy.put(Integer.valueOf(pal.nv0), animData);
                            }
                            break;
                        }
                    }
                    i4_0[] animFrames = null;
                    if (animData != null && animData.Hl0 != null) {
                        animFrames = animData.Hl0[animTileId - animData.fm];
                    }
                    v10[i12][i14] = animFrames;
                    if (animFrames != null) {
                        hasAnim = true;
                    }
                }
                if (empty) {
                    v2.Z6(null);
                } else {
                    v2.Z6(v8[i12]);
                }
                v8[i12].dispose();
            }
            if (hasAnim) {
                block.E70(v9, v10, v2);
            }
            for (int i8 = 0; i8 < v9.length; i8++) {
                if (v9[i8] != null) {
                    for (int i12 = 0; i12 < v9[i8].length; i12++) {
                        if (v9[i8][i12] != null) {
                            v9[i8][i12].dispose();
                        }
                    }
                }
            }
        }
    }

    public final void SD0(go0_0 v1) {
        db0_2[] blocks = this.fv.z00;
        int length = blocks.length;
        for (int i4 = 0; i4 < length; i4++) {
            db0_2 block = blocks[i4];
            int cY = block.cY;
            cl_1 cl = cl_1.nj0;
            LPT5_ lpt5 = (LPT5_) cl.X7.get(Integer.valueOf(this.Gn.rt0() * 10000 + cY));
            if (lpt5 != null) {
                int count = lpt5.zy0;
                LPT6_[] animTex = new LPT6_[count];
                for (int i9 = 0; i9 < count; i9++) {
                    animTex[i9] = v1.zV();
                }
                block.zC = animTex;
                block.bm = lpt5.SN;
            }
            for (int i6 = 0; i6 < 2; i6++) {
                block.BI0[i6] = v1.zV();
            }
            if (block.NC[0] >= 1 || block.NC[1] >= 1) {
                for (int i6 = 0; i6 < block.Lw0.length; i6++) {
                    for (int i7 = 0; i7 < block.NC[i6]; i7++) {
                        block.gO[i6][i7] = v1.zV();
                    }
                }
            }
        }
    }

    public final db0_2[] MD() {
        return this.fv.z00;
    }

    public final int GL() {
        return this.fv.z00.length;
    }
}
