package cn.pokemmo.graphics.gdx.particle;

import f.*;


import com.badlogic.gdx.graphics.Texture;

public class GdxParticleEmitterRenderer extends z2_0 {

    public GdxParticleEmitterRenderer(U8 v1) {
        super(v1);
    }

    @Override
    public final boolean N30(hl0_1 v1, int i2, boolean i3) {
        short z4 = ((U8) this.Ii0).Z4;
        byte b = (byte) (z4 & 0x7F);
        int i4 = (z4 >> 8) & 0xF;
        int i2_val = (z4 >> 12) & 0x7;
        short s = (short) (i2_val + 5149);
        if (b > 5) {
            s = 0;
        }
        if (s == 5214) {
            s = 1446;
        }
        Wr wr = vd0(b, i4);
        if (wr == null) {
            return true;
        }
        int x = (int) this.VH.x - ((wr.H8().getWidth() - 16) / 2);
        int y = ((int) this.VH.y + 2) - (int) (Math.floor((double) (wr.H8().getHeight() / 16) * 0.5D) * 16.0D);
        tj0_0 tj0 = tw0_0.Tl0;
        CH0 ch0 = ((U8) this.Ii0).pu;
        if (i4 > 4) {
            i2_val = -1;
        }
        tj0.qd0(i2_val, ch0, s);
        Texture texture = wr.H8();
        v1.CH0(texture, (float) x, (float) y);
        return true;
    }

    @Override
    public final boolean jq0(BJ0 v1, ER v2, U5 v3, int i4, boolean i5) {
        short z4 = ((U8) this.Ii0).Z4;
        byte b = (byte) (z4 & 0x7F);
        int i5_val = (z4 >> 8) & 0xF;
        int i1 = (z4 >> 12) & 0x7;
        short s = (short) (i1 + 5149);
        if (b > 5) {
            s = 0;
        }
        if (s == 5214) {
            s = 1446;
        }
        Wr wr = vd0(b, i5_val);
        if (wr == null) {
            return true;
        }
        tj0_0 tj0 = tw0_0.Tl0;
        CH0 ch0 = ((U8) this.Ii0).pu;
        if (i5_val > 4) {
            i1 = -1;
        }
        tj0.qd0(i1, ch0, s);
        com3__3 com3 = this.c;
        if (com3 != null && com3.a50 == wr.fr0 && com3.kn0 == wr.Tq) {
            com3.bq0.R4(new LPT6_(wr.H8()));
        } else {
            this.c = new com3__3(wr.fr0, wr.Tq, new LPT6_(wr.H8()), false);
        }
        this.c.OF0(0.011f);
        this.c.qq0(vo_2.z0);
        this.c.qr0(this.VH);
        if (wr.Tq == 16) {
            this.c.j.z = (float) ((double) this.c.j.z + 0.05D);
            this.c.j.y = (float) ((double) this.c.j.y - 0.15D);
        } else {
            this.c.j.y = (float) ((double) this.c.j.y - 0.1D);
        }
        this.c.DB0(this.n80, this.qv0.St0);
        v2.Lh0(this.c, v3);
        return true;
    }

    @Override
    public final bi0_1 U20() {
        return (U8) this.Ii0;
    }

    public final Wr vd0(byte b, int i2) {
        int frame;
        switch (i2) {
            case 0:
            case 1:
            default:
                frame = 0;
                break;
            case 2:
                frame = 1;
                break;
            case 3:
                frame = 3;
                break;
            case 4:
                frame = 5;
                break;
            case 5:
                frame = 7;
                break;
            case 6:
                frame = 9;
                break;
            case 7:
                frame = 10;
                break;
        }
        if (frame > 0 && frame < 9) {
            long t = System.nanoTime() - (long) ((U8) this.Ii0).ba0.Lq0 * 300000000L - (long) ((U8) this.Ii0).ba0.B5 * 300000000L;
            if ((t / 1200000000L) % 2L == 1L) {
                frame++;
            }
        }
        Wr result = null;
        if (frame != 9 && frame != 10 && frame != 0 && b != 65) {
            aa0_2 aa0 = tw0_0.Ll0;
            UY t1 = aa0.t1;
            if (t1 != null) {
                if (b < 0) {
                    b = 0;
                }
                if (frame < 3) {
                    result = t1.aUx[64][frame - 1];
                } else {
                    int frameIdx = frame - 3;
                    if (frameIdx >= 6) {
                        frameIdx = 0;
                    }
                    int idx;
                    if (b >= 0 && b < t1.aUx.length) {
                        idx = b;
                    } else {
                        idx = (b & 0xFF) % t1.aUx.length;
                    }
                    result = t1.aUx[idx][frameIdx];
                }
            } else if (aa0.LPT2 != null) {
                if (b >= 53) {
                    b = (byte) (b - 17);
                }
                ba0_0 ba0 = ba0_0.Ln0;
                int fIdx = (frame < 9) ? frame : 0;
                int idx;
                if (b >= 0 && b < ba0.By0.length) {
                    idx = b;
                } else {
                    idx = (b & 0xFF) % ba0.By0.length;
                }
                result = ba0.By0[idx][fIdx];
            }
        }
        if (result == null) {
            ht_0 ht;
            if (b == 65) {
                ht = QI.Py.kN((byte) 10, 1063, false);
            } else {
                ht = QI.Py.kN((byte) 10, 1062, false);
            }
            result = ht.li0(frame);
        }
        return result;
    }
}
