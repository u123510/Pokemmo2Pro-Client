package cn.pokemmo.rom.nds.model;

import f.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;

public class NdsCellAnimationSpriteLoader {
    public Texture OL;
    public LPT6_[][] W;
    public final vh_1 ym;
    public final vh_1 m7;
    public final vh_1 ra0;

    static {
        Cq0.E1(NdsCellAnimationSpriteLoader.class);
    }

    public NdsCellAnimationSpriteLoader(FJ v1, FJ v2, FJ v3) {
        this.ym = v1;
        this.m7 = v2;
        this.ra0 = v3;
    }

    public final p_0 LP(int i1, int i2) {
        LPT6_[] v2 = Qn(i2);
        mm_1 v3 = new mm_1(this.m7.EG(130), false);
        short i0 = (short) i1;
        int i4 = v3.yq0(i0);
        int i5 = 0;
        int i6 = 5;
        es_1 v7 = new es_1();
        while (true) {
            int i8 = (int) Math.floor(i5 * 0.6000000238418579);
            if (i8 >= i4) {
                if (i1 == 1) {
                    v7.Ue0(v2[0]);
                }
                return new p_0(0.04f, v7);
            }
            int frameIdx = v3.yz0(i8, i0);
            int frameId = v3.yG.Sc[i1].wz0[frameIdx].Sm.DK0;
            if (v2.length <= frameId) {
                System.out.println("error frame_id > size " + frameId);
                i5 += i6;
            } else {
                v7.Ue0(v2[frameId]);
                i5 += i6;
            }
        }
    }

    public final LPT6_[] Qn(int i1) {
        if (this.OL == null) {
            int i2 = 25;
            i4_0 v3 = new i4_0(544, 800, ix0_0.Vw);
            Rk0 v4 = new Rk0(this.m7.EG(129), false);
            for (int i5 = 0; i5 < 17; ++i5) {
                int i7 = i5 * 2;
                Gt0 v6 = new Gt0(this.m7.EG(i7 + 131), false);
                Tt0 v8 = new Tt0(this.m7.EG(i7 + 132));
                for (int i7_inner = 0; i7_inner < 17; ++i7_inner) {
                    i4_0 v9 = v4.oQ(v6, v8, i7_inner, 32, 32, 0);
                    int col = (i5 == 16) ? 24 : i5;
                    v3.NH0(v9, i7_inner * 32, col * 32);
                    v9.dispose();
                }
            }
            for (int i4 = 16; i4 <= 23; ++i4) {
                int i5 = i4 * 4;
                int i6 = i5 + 48;
                jg_0 v6 = jg_0.vE0(this.ra0.EG(i6));
                for (int i7 = 0; i7 < 8; ++i7) {
                    i4_0 v8 = v6.RB0(i7);
                    if (v8 != null) {
                        int posX = i7 * 32;
                        int posY = i4 * 32;
                        v3.NH0(v8, posX, posY);
                        if (i7 == 0) {
                            for (int i9 = 11; i9 < 17; ++i9) {
                                int i11 = 0;
                                float angle;
                                switch (i9) {
                                    case 12:
                                        i11 = -1;
                                        angle = -33.0f;
                                        break;
                                    case 13:
                                        i11 = -2;
                                        angle = -40.0f;
                                        break;
                                    case 14:
                                        i11 = 1;
                                        angle = 20.0f;
                                        break;
                                    case 15:
                                        i11 = 2;
                                        angle = 33.0f;
                                        break;
                                    case 16:
                                        i11 = 2;
                                        angle = 44.0f;
                                        break;
                                    default:
                                        angle = -10.0f;
                                        break;
                                }
                                Gdx2DPixmap pixmap = v8.XF;
                                int w = pixmap.SH;
                                int h = pixmap.mB0;
                                i4_0 rotated = new i4_0(w, h, v8.rH0());
                                double rad = Math.toRadians(angle);
                                double cos = Math.cos(rad);
                                double sin = Math.sin(rad);
                                int halfW = w / 2;
                                int halfH = h / 2;
                                for (int x = 0; x < w; ++x) {
                                    for (int y = 0; y < h; ++y) {
                                        int dx = x - halfW;
                                        int dy = y - halfH;
                                        int srcX = (int) Math.round(dx * cos + dy * sin) + halfW;
                                        int srcY = (int) Math.round(dy * cos - dx * sin) + halfH;
                                        if (srcX >= 0 && srcX < w && srcY >= 0 && srcY < h) {
                                            int pixel = v8.XF.iH0(srcX, srcY);
                                            rotated.XF.XS(x, y, pixel);
                                        }
                                    }
                                }
                                v3.NH0(rotated, i9 * 32 + i11, posY);
                                rotated.dispose();
                            }
                        }
                        v8.dispose();
                    }
                }
                jg_0 v5_jg = jg_0.vE0(this.ra0.EG(i5 + 49));
                for (int i6_col = 8; i6_col < 11; ++i6_col) {
                    int i7_frame = 1;
                    if (i6_col == 9) {
                        i7_frame = 2;
                    } else if (i6_col == 10) {
                        i7_frame = 4;
                    }
                    i4_0 v7_img = v5_jg.RB0(i7_frame);
                    if (v7_img != null) {
                        v3.NH0(v7_img, i6_col * 32, i4 * 32);
                        v7_img.dispose();
                    }
                }
            }
            this.OL = new Texture(v3);
            this.W = new LPT6_[i2][];
            v3.dispose();
            for (int i3 = 0; i3 < i2; ++i3) {
                LPT6_[] v4_row = new LPT6_[i2];
                for (int i5 = 0; i5 < 17; ++i5) {
                    v4_row[i5] = new LPT6_(this.OL, i5 * 32, i3 * 32, 32, 32);
                }
                this.W[i3] = v4_row;
            }
        }
        LPT6_[][] arr = this.W;
        if (i1 >= arr.length) {
            i1 = 3;
        }
        if (i1 < 0) {
            i1 = 1;
        }
        return arr[i1];
    }
}
