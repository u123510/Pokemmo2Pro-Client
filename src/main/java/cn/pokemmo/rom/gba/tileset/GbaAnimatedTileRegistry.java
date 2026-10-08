package cn.pokemmo.rom.gba.tileset;

import f.G90;
import f.qa0_1;
import f.xc0_2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

public class GbaAnimatedTileRegistry {
    public static final GbaAnimatedTileRegistry EG0 = new GbaAnimatedTileRegistry();
    public final xc0_2[] An0;

    public GbaAnimatedTileRegistry() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xc0_2((byte) 0, 0, 5, 508, 4, -141));
        arrayList.add(new xc0_2((byte) 0, 0, 8, 464, 18, -61));
        arrayList.add(new xc0_2((byte) 0, 0, 8, 416, 48, -101));
        arrayList.add(new xc0_2((byte) 0, 45, 4, 976, 8, -53));
        arrayList.add(new xc0_2((byte) 0, 28, 2, 880, 7, -33));
        arrayList.add(new xc0_2((byte) 0, 57, 4, 896, 8, -33));
        arrayList.add(new xc0_2((byte) 0, 7, 5, 744, 8, -53));
        arrayList.add(new xc0_2((byte) 1, 0, 4, 508, 4, 203));
        arrayList.add(new xc0_2((byte) 1, 0, 8, 432, 30, 243));
        arrayList.add(new xc0_2((byte) 1, 0, 8, 464, 10, 283));
        arrayList.add(new xc0_2((byte) 1, 0, 4, 496, 6, 323));
        for (int i = 0; i < 8; i++) {
            arrayList.add(new xc0_2((byte) 1, 2, 8, 640 + i * 4, 4, 2003).DP(i));
        }
        arrayList.add(new xc0_2((byte) 1, 2, 2, 960, 4, 2043));
        arrayList.add(new xc0_2((byte) 1, 3, 4, 682, 6, 2175));
        arrayList.add(new xc0_2((byte) 1, 4, 4, 736, 4, 2251));
        for (int i = 0; i < 16; i++) {
            arrayList.add(new xc0_2((byte) 1, 5, 16, 608 + i * 4, 4, 1735).DP(i));
        }
        arrayList.add(new xc0_2((byte) 1, 6, 4, 800, 4, 1479));
        arrayList.add(new xc0_2((byte) 1, 6, 4, 672, 4, 1999));
        arrayList.add(new xc0_2((byte) 1, 6, 4, 804, 4, 1479).DP(2));
        for (int i = 0; i < 8; i++) {
            arrayList.add(new xc0_2((byte) 1, 11, 8, 736 + i * 4, 4, 1755).DP(i));
        }
        arrayList.add(new xc0_2((byte) 1, 12, 4, 976, 30, 1275));
        arrayList.add(new xc0_2((byte) 1, 12, 8, 1008, 8, 1355));
        arrayList.add(new xc0_2((byte) 1, 13, 8, 752, 96, 2375));
        arrayList.add(new xc0_2((byte) 1, 14, 4, 730, 6, 1779));
        arrayList.add(new xc0_2((byte) 1, 15, 4, 730, 6, 1735));
        arrayList.add(new xc0_2((byte) 1, 16, 2, 496, 4, 2911));
        arrayList.add(new xc0_2((byte) 1, 30, 2, 1008, 9, 2007));
        arrayList.add(new xc0_2((byte) 1, 44, 4, 1008, 4, 1135));
        arrayList.add(new xc0_2((byte) 1, 46, 3, 1008, 12, 1999));
        arrayList.add(new xc0_2((byte) 1, 46, 3, 976, 20, 2007));
        arrayList.add(new xc0_2((byte) 1, 51, 2, 656, 16, 2011));
        arrayList.add(new xc0_2((byte) 1, 58, 2, 992, 4, 2007));
        arrayList.add(new xc0_2((byte) 1, 58, 4, 1016, 1, 1967));
        arrayList.add(new xc0_2((byte) 1, 65, 3, 663, 8, 2047));
        arrayList.add(new xc0_2((byte) 1, 65, 3, 647, 8, 2091));
        this.An0 = (xc0_2[]) arrayList.toArray(new xc0_2[0]);
    }

    public static GbaAnimatedTileRegistry nb0() {
        return EG0;
    }
    public static GbaAnimatedTileRegistry getInstance() {
        return EG0;
    }

    public final void ho(int i, int i2, qa0_1 qa0_12) {
        for (xc0_2 xc0_22 : this.An0) {
            if (i == xc0_22.lb0 && qa0_12.rt0() == xc0_22.Ax0 && xc0_22.n0 == 0) {
                ByteBuffer byteBuffer = qa0_12.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
                byteBuffer.position(i2 + xc0_22.D1);
                int n = byteBuffer.getInt();
                if (G90.Uh0(n)) {
                    xc0_22.n0 = G90.GF0(n);
                } else {
                    int n2 = i2 + xc0_22.D1;
                    System.out.println("Error @ " + ("0x" + Integer.toHexString(n2).toUpperCase()));
                }
            }
        }
    }
}
