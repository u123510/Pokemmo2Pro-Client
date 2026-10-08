package cn.pokemmo.io.stream;

import f.ah0_1;
import java.nio.ByteBuffer;

public class ShortBufferArrayReader {
    public final int[] EH0;

    public ShortBufferArrayReader(ah0_1 ah0_12, int n, int n2, ByteBuffer byteBuffer) {
        this.EH0 = new int[n2];
        byteBuffer.position(n - ah0_12.KF.O7);
        for (int j = 0; j < n2; ++j) {
            this.EH0[j] = byteBuffer.getShort();
        }
    }
}
