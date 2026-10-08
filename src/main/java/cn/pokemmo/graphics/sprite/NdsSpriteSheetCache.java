package cn.pokemmo.graphics.sprite;

import f.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class NdsSpriteSheetCache {
        public Wr[] ij;
    public Wr HN;
    public AG0[] QR;
    public Wr Oy0;
    public AG0[] QA0;
    public byte[][][] oY;
    public byte[][][] Gt;
    public byte[][] VG0;
    public Wr[] uM;
    public AG0[] bx0;

    public NdsSpriteSheetCache() {
    }

    

    public final void Wv0(qa0_1 qa0_1Var) {
        byte rt0 = qa0_1Var.rt0();
        if (rt0 == 0) {
            ByteBuffer order = qa0_1Var.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
            int v_Ck0 = qa0_1Var.EZ.V(br_2.Ck0);
            int v_xV = qa0_1Var.EZ.V(br_2.xV);
            int[] iArr = new int[]{
                qa0_1Var.EZ.V(br_2.jH),
                qa0_1Var.EZ.V(br_2.LPT7),
                qa0_1Var.EZ.V(br_2.cn0),
                qa0_1Var.EZ.V(br_2.coM5)
            };
            this.ij = new Wr[4];
            for (int i = 0; i < this.ij.length; i++) {
                this.ij[i] = new Wr(new YG(qa0_1Var, v_Ck0, iArr, i, v_xV));
            }
            Wr wr = new Wr(new fo0_0(qa0_1Var));
            this.QR = new AG0[2];
            for (int i = 0; i < this.QR.length; i++) {
                this.QR[i] = new AG0(wr, 0, i * 16, 16, 16);
            }
            this.Oy0 = new Wr(new ak0_1(qa0_1Var));
            Wr wr2 = new Wr(new XK0(qa0_1Var));
            this.QA0 = new AG0[2];
            for (int i = 0; i < this.QA0.length; i++) {
                this.QA0[i] = new AG0(wr2, 0, i * 16, 16, 16);
            }
            this.oY = new byte[4][15][22];
            this.Gt = new byte[4][15][22];
            order.position(qa0_1Var.EZ.V(br_2.ED0));
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 15; j++) {
                    for (int k = 0; k < 22; k++) {
                        byte b = order.get();
                        if ((b & 255) == 197) {
                            b = 0;
                        }
                        this.oY[i][j][k] = b;
                    }
                }
                for (int j = 0; j < 15; j++) {
                    for (int k = 0; k < 22; k++) {
                        byte b = order.get();
                        if ((b & 255) == 197) {
                            b = 0;
                        }
                        this.Gt[i][j][k] = b;
                    }
                }
            }
        } else if (rt0 == 1) {
            ByteBuffer order = qa0_1Var.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
            this.HN = new Wr(new lpt7__3(qa0_1Var));
            this.VG0 = new byte[15][28];
            order.position(qa0_1Var.EZ.V(br_2.ED0));
            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 28; j++) {
                    byte b = order.get();
                    if ((b & 255) == 213) {
                        b = -1;
                    }
                    this.VG0[i][j] = b;
                }
            }
            order.position(qa0_1Var.EZ.V(br_2.Eo0));
            order.getInt();
            order.getInt();
            int[] iArr = new int[4];
            iArr[0] = G90.GF0(order.getInt());
            order.getInt();
            order.getInt();
            iArr[1] = G90.GF0(order.getInt());
            iArr[2] = G90.GF0(order.getInt());
            order.getInt();
            iArr[3] = G90.GF0(order.getInt());
            order.position(order.position() + 12);
            int i4 = G90.GF0(order.getInt());
            order.position(order.position() + 40);
            int i5 = G90.GF0(order.getInt());
            this.uM = new Wr[]{
                new Wr(new nd_2(qa0_1Var, i4, iArr, i5)),
                new Wr(new u9_0(qa0_1Var, i4, iArr, i5)),
                new Wr(new rb0_1(qa0_1Var, i4, iArr, i5)),
                new Wr(new F50(qa0_1Var, i4, iArr, i5))
            };
            this.bx0 = new AG0[]{
                new AG0(this.uM[0], 0, 0, 96, 48),
                new AG0(this.uM[0], 0, 48, 96, 48),
                new AG0(this.uM[0], 0, 72, 96, 48),
                new AG0(this.uM[0], 0, 96, 96, 48)
            };
            order.position(qa0_1Var.EZ.V(br_2.qH));
            int i0 = G90.GF0(order.getInt());
            order.getInt();
            int i3 = G90.GF0(order.getInt());
            order.getInt();
            int i4_2 = G90.GF0(order.getInt());
            order.position(order.position() + 12);
            int i2_2 = G90.GF0(order.getInt());
            new Wr(new S8(qa0_1Var, i0, i2_2));
            new Wr(new iu_1(qa0_1Var, i3, i2_2));
            new Wr(new RH0(qa0_1Var, i4_2, i2_2));
        }
    }

    public final AG0[] hf0() {
        return this.QR;
    }

    public final AG0[] Me0() {
        return this.QA0;
    }
}

