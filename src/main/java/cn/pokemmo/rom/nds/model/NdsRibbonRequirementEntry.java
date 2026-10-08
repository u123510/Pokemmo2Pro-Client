/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.nds.model;

import f.v8_0;

import f.v8_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.io
 */
public class NdsRibbonRequirementEntry {
    public final short[] zR;

    public NdsRibbonRequirementEntry(v8_0 v8_02, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        this.zR = new short[4];
        byteBuffer2.get();
        byteBuffer2.get();
        byteBuffer2.get();
        byteBuffer2.get();
        byteBuffer2.get();
        byteBuffer2.get();
        if (v8_02.aT()) {
            byteBuffer.getShort();
        }
        if (v8_02.Nk0()) {
            int n = 0;
            while (true) {
                short[] sArray = this.zR;
                if (n >= this.zR.length) break;
                sArray[n] = byteBuffer.getShort();
                ++n;
            }
        }
        byteBuffer.getShort();
    }
}

