/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.chunk;

import f.*;

import f.Cq0;
import f.be0_1;
import f.dl_1;
import f.mg0_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.ou0
 */
public class ItemPropertyRomChunk
extends BaseRomResourceChunk {
    public static final dl_1 Fz = Cq0.E1(ItemPropertyRomChunk.class);
    public int HU;
    public int Rh;
    public int Aux;
    public int cS;
    public mg0_0[] A10;

    @Override
    public final void pH(ByteBuffer byteBuffer, int ... nArray) {
        this.a00 = byteBuffer.getInt();
    }

    @Override
    public final void vD(ByteBuffer byteBuffer) {
        int n;
        int n2;
        if (byteBuffer.getInt() != 1128333386) {
            Fz.getClass();
            return;
        }
        ByteBuffer byteBuffer2 = byteBuffer;
        this.HU = byteBuffer.getShort();
        this.Rh = byteBuffer.getShort();
        byteBuffer2.getInt();
        this.Aux = byteBuffer2.getInt();
        this.cS = byteBuffer.getInt();
        int[] nArray = new int[this.Rh];
        for (n2 = 0; n2 < (n = this.Rh); ++n2) {
            nArray[n2] = byteBuffer.getShort() & 0xFFFF;
        }
        this.A10 = new mg0_0[n];
        for (n2 = 0; n2 < this.Rh; ++n2) {
            byteBuffer.position(this.a00 + nArray[n2]);
            ItemPropertyRomChunk ou0_02 = this;
            int n3 = ou0_02.HU;
            int n4 = ou0_02.a00;
            int n5 = ou0_02.Aux;
            int n6 = ou0_02.cS;
            mg0_0 mg0_03 = new mg0_0(n3, n4, n5, n6, byteBuffer);
            this.A10[n2] = mg0_03;
        }
    }
}

