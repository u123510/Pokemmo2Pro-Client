/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.chunk;

import f.*;

import f.be0_1;
import java.nio.ByteBuffer;

/*
 * Renamed from f.eW
 */
public class MapTilemapRomChunk
extends BaseRomResourceChunk {
    public int pe0;
    public int[] COM1;

    @Override
    public final void pH(ByteBuffer byteBuffer, int ... nArray) {
        this.a00 = byteBuffer.getShort();
        this.pe0 = byteBuffer.get() & 0xFF;
        byteBuffer.get();
        this.COM1 = new int[this.pe0];
    }

    @Override
    public final void vD(ByteBuffer byteBuffer) {
        for (int j = 0; j < this.pe0; ++j) {
            this.COM1[j] = byteBuffer.get() & 0xFF;
        }
    }
}

