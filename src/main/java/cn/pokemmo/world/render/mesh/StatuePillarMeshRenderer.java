package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatuePillarMeshRenderer extends BaseMapMeshRenderer {
    public final Ou0[] Nm;
    public final Ou0[][] lp0;
    public final Ou0[][] Tk;
    public byte[][] jn;
    public final byte[] IB;

    public StatuePillarMeshRenderer(p50_0 p50_02) {
        super(p50_02);
        this.Nm = new Ou0[3];
        this.lp0 = new Ou0[3][2];
        this.Tk = new Ou0[3][2];
        this.jn = new byte[3][2];
        this.IB = new byte[3];
        ra0_0.Ao0().getClass();
        Ou0 ou0 = ra0_0.MO();
        ou0.ho.el0(8.0f, 0.0f, 8.0f);
        yS(ou0);
        float[][] fArray = new float[][] {
            { 3.125f, 0.0f, 7.75f },
            { 10.625f, 0.0f, 5.25f },
            { 6.875f, 1.5f, 6.5f }
        };
        for (int i = 0; i < this.Nm.length; i++) {
            ra0_0.Ao0().getClass();
            this.Nm[i] = ra0_0.Yi0();
            this.Nm[i].ho.el0(fArray[i][0], fArray[i][1], fArray[i][2]);
            if (i == 0) {
                this.Nm[i].ho.tO(C8.Y, 180.0f);
            }
            yS(this.Nm[i]);
            this.Nm[i].kk(0.75f, 0.75f, 0.75f);
        }
        for (int i = 0; i < this.Nm.length; i++) {
            for (int j = 0; j < 2; j++) {
                ra0_0.Ao0().getClass();
                this.lp0[i][j] = ra0_0.yu(j == 1);
                float f = (i == 0) ? -0.5f : 0.5f;
                this.lp0[i][j].ho.el0(fArray[i][0], fArray[i][1], fArray[i][2] + f);
                if (i == 0) {
                    this.lp0[i][j].ho.tO(C8.Y, 180.0f);
                }
                yS(this.lp0[i][j]);
                this.lp0[i][j].kk(0.75f, 0.75f, 0.75f);
                ra0_0.Ao0().getClass();
                this.Tk[i][j] = ra0_0.kc();
                float f2 = (j == 0) ? -1.25f : 1.25f;
                float f3 = (i == 0) ? -0.375f : 0.375f;
                this.Tk[i][j].ho.el0(fArray[i][0] + f2, fArray[i][1], fArray[i][2] + f3);
                this.Tk[i][j].EG();
                yS(this.Tk[i][j]);
                this.Tk[i][j].kk(0.75f, 0.75f, 0.75f);
            }
        }
        ca0();
    }

    public static byte fp(byte b, byte b2) {
        if (b2 == 1) {
            if (b == 3) {
                return 2;
            }
            return 6;
        }
        if (b2 == 2) {
            if (b == 3) {
                return 0;
            }
            return 4;
        }
        if (b2 == 3) {
            if (b == 1) {
                return 3;
            }
            return 1;
        }
        if (b == 1) {
            return 7;
        }
        return 5;
    }

    public final void sn0(short[] sArray) {
        if (sArray.length < 1) {
            return;
        }
        switch (sArray[0]) {
            case 406: {
                if (sArray.length < 2) {
                    return;
                }
                short s = sArray[1];
                byte[][] byArray = new byte[3][2];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 2; j++) {
                        if ((s & (1 << (i * 2 + j))) != 0) {
                            byArray[i][j] = 1;
                        }
                    }
                }
                this.jn = byArray;
                ca0();
                break;
            }
            case 407: {
                if (sArray.length < 3) {
                    return;
                }
                byte b = (byte) sArray[1];
                byte b2 = (byte) sArray[2];
                this.Tk[b][b2].PE0 = 1.0f;
                this.Tk[b][b2].sC0(0, false, null);
                break;
            }
            case 408: {
                break;
            }
            case 409: {
                if (sArray.length < 2) {
                    return;
                }
                byte b = (byte) sArray[1];
                byte b2 = this.IB[b];
                byte b3;
                byte b4 = this.jn[b][0];
                if (b4 == 0 && this.jn[b][1] == 0) {
                    b3 = 3;
                } else if (b4 == 0) {
                    b3 = 2;
                } else if (this.jn[b][1] == 0) {
                    b3 = 1;
                } else {
                    b3 = 0;
                }
                this.IB[b] = b3;
                Ou0 ou0 = this.Nm[b];
                ou0.PE0 = 1.0f;
                ou0.sC0(fp(b2, b3), false, null);
                break;
            }
            case 410: {
                if (sArray.length < 4) {
                    return;
                }
                byte b = (byte) sArray[1];
                byte b5 = (byte) sArray[2];
                byte b6 = (byte) sArray[3];
                if (this.jn[b][b5] == b6) {
                    return;
                }
                this.jn[b][b5] = b6;
                this.lp0[b][b5].PE0 = 1.0f;
                this.lp0[b][b5].sC0(b6, false, null);
                break;
            }
            default: {
                break;
            }
        }
    }

    public final void ca0() {
        for (int i = 0; i < this.Nm.length; i++) {
            byte[] byArray = this.jn[i];
            byte b = byArray[0];
            byte b2;
            if (b == 0 && byArray[1] == 0) {
                b2 = 3;
            } else if (b == 0) {
                b2 = 2;
            } else if (byArray[1] == 0) {
                b2 = 1;
            } else {
                b2 = 0;
            }
            this.IB[i] = b2;
            this.Nm[i].PE0 = 1.0E8f;
            this.Nm[i].sC0(fp(b2, b2), false, null);
            for (int j = 0; j < 2; j++) {
                this.lp0[i][j].PE0 = 1.0E8f;
                this.lp0[i][j].sC0(this.jn[i][j], false, null);
            }
        }
    }
}
