package cn.pokemmo.graphics.texture;

import com.badlogic.gdx.graphics.Texture;
import f.*;

/**
 * 现代化重构类 - 原始类: f.rc0_0
 */
public class SpriteAtlasCompositor implements fy0_0 {

    public final int NE0;
    public final S70 T1;
    public final S70 interface$;
    public int zR;
    public int pq;
    public final int Tw0;
    public final int cK;
    public float CoM2;
    public boolean nk0;
    public final Texture BV;
    public final Texture ct;
    public final sr_0 I00;

    public SpriteAtlasCompositor(sr_0 v1, int i2, i4_0 v3, i4_0 v4) {
        this.I00 = v1;
        this.CoM2 = 0.0f;
        this.nk0 = false;
        this.NE0 = i2;
        int r = (i2 % 4) + 2;
        this.zR = r;
        int q = (i2 / 4) + 1;
        this.pq = q;
        this.Tw0 = r;
        this.cK = q;
        Texture t1 = new Texture(v3);
        this.BV = t1;
        Texture t2 = new Texture(v4);
        this.ct = t2;
        S70 s1 = new S70();
        this.T1 = s1;
        s1.fn0();
        s1.JH().LX(new Texture[]{t1});
        v1.SL(s1);
        S70 s2 = new S70();
        this.interface$ = s2;
        s2.fn0();
        s2.JH().LX(new Texture[]{t2});
        v1.SL(s2);
        KB();
    }

    public static void yl(SpriteAtlasCompositor v0, boolean i1) {
        if (!v0.nk0) {
            if (i1) {
                v0.CoM2 += 90.0f;
            } else {
                v0.CoM2 -= 90.0f;
            }
            if (LW.LH0(360.0f, v0.CoM2) || v0.CoM2 > 360.0f) {
                v0.CoM2 = 0.0f;
            }
            if (v0.CoM2 < 0.0f) {
                v0.CoM2 += 360.0f;
            }
        }
    }

    public final void update() {
        int x = this.zR;
        int y = this.pq;
        float scale = (float) this.I00.ik;
        int offset = 0;
        int ag0 = this.I00.Ag0();
        sr_0 parent = this.I00;
        if (parent.Rm0 == (rc0_0) this) {
            x = parent.oJ0;
            y = parent.Hs;
            scale = parent.ik * 1.1000000238f;
            offset = (int) ((double) (parent.ik * -32) * 0.05d);
        }
        int tileSize = 32 * parent.ik;
        this.T1.oY(tileSize, tileSize);
        int posX = (parent.A20 + parent.e80) + 32 * x * parent.ik + offset + ag0;
        int posY = si0_0.Fz(32 * y, parent.ik, parent.SB0 + parent.y9, offset);
        this.T1.E40(posX, posY);
        this.T1.og.EJ0 = scale;
        this.T1.og.Xf0 = this.CoM2;
        int tileSize2 = 32 * this.I00.ik;
        this.interface$.oY(tileSize2, tileSize2);
        sr_0 p = this.I00;
        int pX = (p.A20 + p.e80) + p.ik * 32 * x + offset + ag0;
        int pY = si0_0.Fz(32 * y, p.ik, p.SB0 + p.y9, offset);
        this.interface$.E40(pX, pY);
        this.interface$.og.EJ0 = scale;
        this.interface$.og.Xf0 = this.CoM2;
        this.interface$.og.wx0(this.I00.Fj0);
    }

    @Override
    public final void dispose() {
        this.BV.dispose();
        this.ct.dispose();
    }

    public final void KB() {
        int tS = this.I00.tS;
        if (tS == 0) {
            switch (this.NE0) {
                case 1:
                    this.zR = 1;
                    this.pq = 4;
                    this.CoM2 = 270.0f;
                    break;
                case 5:
                    this.zR = 1;
                    this.pq = 1;
                    this.CoM2 = 90.0f;
                    break;
                case 8:
                    this.zR = 5;
                    this.pq = 5;
                    this.CoM2 = 90.0f;
                    break;
                case 10:
                    this.zR = 6;
                    this.pq = 2;
                    this.CoM2 = 180.0f;
                    break;
                default:
                    this.nk0 = true;
                    break;
            }
        } else if (tS == 1) {
            switch (this.NE0) {
                case 0:
                    this.zR = 3;
                    this.pq = 5;
                    this.CoM2 = 180.0f;
                    break;
                case 1:
                    this.zR = 1;
                    this.pq = 3;
                    this.CoM2 = 270.0f;
                    break;
                case 4:
                    this.zR = 5;
                    this.pq = 5;
                    this.CoM2 = 90.0f;
                    break;
                case 5:
                    this.zR = 6;
                    this.pq = 4;
                    this.CoM2 = 180.0f;
                    break;
                case 9:
                    this.zR = 2;
                    this.pq = 0;
                    this.CoM2 = 270.0f;
                    break;
                case 13:
                    this.zR = 4;
                    this.pq = 0;
                    this.CoM2 = 180.0f;
                    break;
                case 15:
                    this.zR = 6;
                    this.pq = 2;
                    this.CoM2 = 270.0f;
                    break;
                default:
                    this.nk0 = true;
                    break;
            }
        } else if (tS == 2) {
            if (this.NE0 == 0) {
                this.zR = 1;
                this.pq = 4;
                this.CoM2 = 270.0f;
            } else {
                switch (this.NE0) {
                    case 6:
                        this.zR = 2;
                        this.pq = 5;
                        this.CoM2 = 180.0f;
                        break;
                    case 7:
                        this.zR = 1;
                        this.pq = 3;
                        this.CoM2 = 0.0f;
                        break;
                    case 8:
                        this.zR = 1;
                        this.pq = 1;
                        this.CoM2 = 0.0f;
                        break;
                    case 9:
                        this.zR = 5;
                        this.pq = 0;
                        this.CoM2 = 0.0f;
                        break;
                    case 10:
                        this.zR = 3;
                        this.pq = 0;
                        this.CoM2 = 90.0f;
                        break;
                    case 11:
                        this.zR = 3;
                        this.pq = 5;
                        this.CoM2 = 90.0f;
                        break;
                    case 12:
                        this.zR = 6;
                        this.pq = 3;
                        this.CoM2 = 270.0f;
                        break;
                    case 13:
                        this.zR = 6;
                        this.pq = 2;
                        this.CoM2 = 180.0f;
                        break;
                    default:
                        this.nk0 = true;
                        break;
                }
            }
        } else if (tS == 3) {
            switch (this.NE0) {
                case 0:
                    this.zR = 5;
                    this.pq = 0;
                    this.CoM2 = 270.0f;
                    break;
                case 1:
                    this.zR = 1;
                    this.pq = 3;
                    this.CoM2 = 270.0f;
                    break;
                case 4:
                    this.zR = 2;
                    this.pq = 5;
                    this.CoM2 = 180.0f;
                    break;
                case 7:
                    this.zR = 3;
                    this.pq = 5;
                    this.CoM2 = 90.0f;
                    break;
                case 8:
                    this.zR = 3;
                    this.pq = 0;
                    this.CoM2 = 0.0f;
                    break;
                case 9:
                    this.zR = 6;
                    this.pq = 2;
                    this.CoM2 = 270.0f;
                    break;
                case 10:
                    this.zR = 6;
                    this.pq = 4;
                    this.CoM2 = 270.0f;
                    break;
                case 12:
                    this.zR = 1;
                    this.pq = 2;
                    this.CoM2 = 180.0f;
                    break;
                case 13:
                    this.zR = 4;
                    this.pq = 0;
                    this.CoM2 = 270.0f;
                    break;
                case 14:
                    this.zR = 1;
                    this.pq = 1;
                    this.CoM2 = 180.0f;
                    break;
                default:
                    this.zR = this.Tw0;
                    this.pq = this.cK;
                    this.CoM2 = 0.0f;
                    this.nk0 = true;
                    break;
            }
        }
    }
}
