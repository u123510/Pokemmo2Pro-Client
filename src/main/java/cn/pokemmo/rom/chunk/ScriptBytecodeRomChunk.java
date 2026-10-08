/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.chunk;

import f.*;

import f.be0_1;
import f.ol0_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.gB
 */
public class ScriptBytecodeRomChunk
extends BaseRomResourceChunk {
    public ByteBuffer sf0;

    public static int f20(short s) {
        return ((s & 0x1F) * 8 & 0xFF) << 16 | 0xFF000000 | (((s & 0x3E0) >> 5) * 8 & 0xFF) << 8 | ((s & 0x7C00) >> 10) * 8 & 0xFF;
    }

    @Override
    public final void pH(ByteBuffer byteBuffer, int ... nArray) {
        this.sf0 = byteBuffer;
        int n = nArray[0];
        this.a00 = (short)(byteBuffer.getShort() & 0x1FFF) * 8 + n;
        byteBuffer.getShort();
    }

    public byte[] COm6(ol0_0 ol0_02) {
        this.sf0.position(this.a00);
        int n = 32;
        if (32 > this.sf0.remaining()) {
            n = this.sf0.remaining();
        }
        byte[] byArray = new byte[n];
        this.sf0.get(byArray);
        return byArray;
    }

    public int[] yF0(ol0_0 ol0_02) {
        this.sf0.position(this.a00);
        int n = ol0_02.cOn;
        if (n > this.sf0.remaining()) {
            n = this.sf0.remaining();
        }
        int[] nArray = new int[n /= 2];
        for (int j = 0; j < n; ++j) {
            nArray[j] = ScriptBytecodeRomChunk.f20(this.sf0.getShort());
        }
        return nArray;
    }
}

