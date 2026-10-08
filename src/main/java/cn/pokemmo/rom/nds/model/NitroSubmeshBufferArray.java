package cn.pokemmo.rom.nds.model;

import f.p8_0;
import java.nio.ByteBuffer;

public class NitroSubmeshBufferArray {
    public final p8_0[] Gd0;

    public NitroSubmeshBufferArray(ByteBuffer byteBuffer, int n) {
        this.Gd0 = new p8_0[n];
        for (int j = 0; j < n; ++j) {
            this.Gd0[j] = new p8_0(byteBuffer);
        }
    }
}
