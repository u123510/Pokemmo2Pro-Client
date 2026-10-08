package cn.pokemmo.graphics.sprite;

import f.AG0;
import f.G90;
import f.GN;
import f.IE;
import f.J30;
import f.Q20;
import f.TQ;
import f.U70;
import f.Wr;
import f.XG0;
import f.YJ;
import f._class;
import f._try;
import f.br_2;
import f.i4_0;
import f.i8_0;
import f.ix0_0;
import f.j7_0;
import f.me0_0;
import f.qa0_1;
import f.ql0_0;
import f.tx_1;
import f.z00_0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * GBA 精灵与图块表缓存管理器 (GBA Sprite Sheet Cache)
 * <p>
 * 原始混淆类: {@code f.ji0_0}
 */
public class GbaSpriteSheetCache {
    public Wr[] cL;
    public Wr nE0;
    public Wr VE0;
    public AG0[] IK0;
    public AG0[] Yq;
    public AG0[] X0;
    public AG0[] E30;
    public AG0 gK0;
    public Wr default$;
    public Wr Ne;
    public Wr[] Com1;
    public Wr[] do0;
    public Wr[] PZ;
    public AG0 uF;

    public static i4_0 J60(ByteBuffer byteBuffer, int i, int[][] iArr, int i2, int i3) {
        ByteBuffer order = ByteBuffer.wrap(tx_1.Gi(i2, byteBuffer)).order(ByteOrder.LITTLE_ENDIAN);
        XG0 xg0 = XG0.hi0;
        Q20 q20 = new Q20(i, 1, 1, xg0, byteBuffer);
        i8_0 i8_02 = new i8_0(xg0, i3 * 32, order);
        int length = iArr.length * 8;
        int length2 = iArr[0].length * 8;
        i4_0 i4_02 = new i4_0(length2, length, ix0_0.Vw);
        for (int i4 = 0; i4 < iArr.length; i4++) {
            for (int i5 = 0; i5 < iArr[i4].length; i5++) {
                q20.xx0(i4_02, i5 * 8, i4 * 8, iArr[i4][i5], i8_02, 0, false, false);
            }
        }
        return i4_02;
    }

    public void y9(qa0_1 qa0_12) {
        if (qa0_12.rt0() == 1) {
            ByteBuffer order = qa0_12.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
            order.position(qa0_12.EZ.V(br_2.V9));
            int GF0 = G90.GF0(order.getInt());
            int GF02 = G90.GF0(order.getInt());
            order.getInt();
            int GF03 = G90.GF0(order.getInt());
            int GF04 = G90.GF0(order.getInt());
            this.nE0 = new Wr(new GN(qa0_12, GF0, GF04));
            this.cL = new Wr[5];
            this.cL[0] = new Wr(new TQ(GF02, GF03, GF04, 1, 0, qa0_12));
            this.cL[1] = new Wr(new TQ(GF02, GF03, GF04, 1, 128, qa0_12));
            this.cL[2] = new Wr(new TQ(GF02, GF03, GF04, 2, 0, qa0_12));
            this.cL[3] = new Wr(new TQ(GF02, GF03, GF04, 2, 128, qa0_12));
            this.cL[4] = new Wr(new TQ(GF02, GF03, GF04, 3, 0, qa0_12));
            this.VE0 = new Wr(new YJ(qa0_12));
            Wr wr = new Wr(new _try(qa0_12));
            this.IK0 = new AG0[7];
            for (int i = 0; i < this.IK0.length; i++) {
                this.IK0[i] = new AG0(wr, 0, i * 16, 16, 16);
            }
            ByteBuffer order2 = ByteBuffer.wrap(tx_1.Gi(GF04, order)).order(ByteOrder.LITTLE_ENDIAN);
            order.position(qa0_12.EZ.V(br_2.Xn0));
            int GF05 = G90.GF0(order.getInt());
            int GF06 = G90.GF0(order.getInt());
            int GF07 = G90.GF0(order.getInt());
            order.getInt();
            int GF08 = G90.GF0(order.getInt());
            this.default$ = new Wr(new j7_0(GF05, GF06, GF08, qa0_12));
            this.Ne = new Wr(new j7_0(GF05, GF07, GF08, qa0_12));
            int[] iArr = new int[]{162, 163, 164, 165, 166};
            Wr[] wrArr = new Wr[5];
            for (int i2 = 0; i2 < 5; i2++) {
                wrArr[i2] = new Wr(new U70(qa0_12, GF05, iArr[i2], GF08));
            }
            this.Com1 = wrArr;
            int[] iArr2 = new int[]{178, 179, 180};
            Wr[] wrArr2 = new Wr[3];
            for (int i3 = 0; i3 < 3; i3++) {
                wrArr2[i3] = new Wr(new U70(qa0_12, GF05, iArr2[i3], GF08));
            }
            this.do0 = wrArr2;
            this.PZ = new Wr[4];
            this.PZ[0] = new Wr(new me0_0(order, GF05, new int[][]{new int[]{67, 68}, new int[]{83, 84}}, GF08));
            this.PZ[1] = new Wr(new me0_0(order, GF05, new int[][]{new int[]{69, 70}, new int[]{85, 86}}, GF08));
            this.PZ[2] = new Wr(new me0_0(order, GF05, new int[][]{new int[]{71, 72}, new int[]{87, 88}}, GF08));
            this.PZ[3] = new Wr(new me0_0(order, GF05, new int[][]{new int[]{73, 74}, new int[]{89, 90}}, GF08));
            this.gK0 = new AG0(new Wr(new IE(GF0, qa0_12, order2)), 32, 24, 8, 8);
            Wr wr2 = new Wr(new z00_0(GF0, qa0_12, order2));
            this.X0 = new AG0[5];
            this.X0[0] = new AG0(wr2, 0, 32, 40, 16);
            this.X0[1] = new AG0(wr2, 40, 32, 40, 16);
            this.X0[2] = new AG0(wr2, 80, 32, 40, 16);
            this.X0[3] = new AG0(wr2, 80, 48, 40, 16);
            this.X0[4] = new AG0(wr2, 80, 64, 40, 16);
            Wr wr3 = new Wr(new J30(GF0, qa0_12, order2));
            this.Yq = new AG0[6];
            for (int i4 = 0; i4 < 4; i4++) {
                this.Yq[i4] = new AG0(wr3, (i4 * 8) + 8, 8, 8, 8);
            }
            for (int i5 = 0; i5 < 2; i5++) {
                this.Yq[i5 + 4] = new AG0(wr3, (i5 * 8) + 40, 24, 8, 8);
            }
            Wr wr4 = new Wr(new ql0_0(GF0, qa0_12, order2));
            this.E30 = new AG0[5];
            for (int i6 = 0; i6 < this.E30.length; i6++) {
                this.E30[i6] = new AG0(wr4, 64, i6 * 16, 16, 16);
            }
            this.uF = new AG0(new Wr(new _class(GF0, qa0_12, order2)), 16, 24, 16, 8);
        }
    }

    public AG0 Ls0() {
        return this.uF;
    }

    public AG0 qG0() {
        return this.gK0;
    }

    public AG0 UH(int i) {
        return this.Yq[i];
    }

    public Wr Nn(int i) {
        return this.Com1[i];
    }

    public Wr Q20(int i) {
        return this.do0[i];
    }
}
