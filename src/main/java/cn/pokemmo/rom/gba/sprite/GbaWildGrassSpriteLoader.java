/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.gba.sprite;

import f.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Renamed from f.Ba0
 */
public class GbaWildGrassSpriteLoader {
    public static final GbaWildGrassSpriteLoader Ln0 = new GbaWildGrassSpriteLoader();
    public final Wr[][] By0 = new Wr[43][9];

    public final void com7(qa0_1 qa0_12) {
        if (qa0_12 != null && qa0_12.rt0() == 1) {
            int n;
            Object object = ByteOrder.LITTLE_ENDIAN;
            ByteBuffer byteBuffer = qa0_12.VL0.slice().order((ByteOrder)object);
            qa0_1 qa0_13 = qa0_12;
            object = qa0_13.VL0.slice().order((ByteOrder)object);
            byteBuffer.position(qa0_13.EZ.V(br_2.Jr));
            byteBuffer.getInt();
            int n2 = G90.GF0(byteBuffer.getInt());
            byte[][] byArray = new byte[43][5];
            byteBuffer.position(G90.GF0(byteBuffer.getInt()));
            for (n = 0; n < 43; ++n) {
                int n3 = byteBuffer.getInt();
                if (!G90.Uh0(n3)) continue;
                ((ByteBuffer)object).position(G90.GF0(n3));
                for (n3 = 0; n3 < 5; ++n3) {
                    byArray[n][n3] = (byte)(((ByteBuffer)object).get() + 1);
                }
            }
            byteBuffer.position(n2);
            for (n2 = 0; n2 < 43; ++n2) {
                int n4;
                n = byteBuffer.getInt();
                if (!G90.Uh0(n)) continue;
                ((ByteBuffer)object).position(G90.GF0(n));
                int[] nArray = new int[9];
                int[] nArray2 = new int[9];
                for (n4 = 0; n4 < 9; ++n4) {
                    nArray[n4] = G90.GF0(((ByteBuffer)object).getInt());
                    nArray2[n4] = ((ByteBuffer)object).getShort() & 0xFFFF;
                    ((ByteBuffer)object).getShort();
                }
                n4 = 0;
                while (n4 < 9) {
                    Object object2 = QI.Py;
                    int n5 = qa0_12.rt0();
                    int n6 = n4 + 1;
                    object2 = ((i8_0[])((QI)object2).cd.BM((byte)n5))[byArray[n2][n6 / 2]];
                    if (object2 != null) {
                        n5 = nArray[n4];
                        int n7 = nArray2[n4] / 2 / 8 / 4;
                        this.By0[n2][n4] = new Wr(new vw_1(n5, n7, qa0_12, (i8_0)object2));
                    }
                    n4 = n6;
                }
            }
            return;
        }
    }
}

