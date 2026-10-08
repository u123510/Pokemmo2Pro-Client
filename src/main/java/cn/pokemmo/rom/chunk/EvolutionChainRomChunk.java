/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.chunk;

import f.*;

import f.be0_1;
import f.px_1;
import java.nio.ByteBuffer;

/*
 * Renamed from f.lm0
 */
public class EvolutionChainRomChunk
extends BaseRomResourceChunk {
    public int a;
    public int CL0;
    public int q7;
    public int ek;
    public int jm;
    public int jR;
    public int K7;
    public int Qb0;
    public int HC0;
    public int v2;
    public float[] Ij;
    public float[] Tl0;
    public float[] R90;
    public float[] wj;

    @Override
    public final void pH(ByteBuffer byteBuffer, int ... nArray) {
        this.a00 = 0;
        this.a = byteBuffer.getInt();
        this.CL0 = byteBuffer.getInt();
        this.q7 = byteBuffer.getInt();
        this.ek = byteBuffer.getInt();
        this.jm = byteBuffer.getInt();
        this.jR = byteBuffer.getInt();
        this.K7 = byteBuffer.getInt();
        this.Qb0 = byteBuffer.getInt();
        this.HC0 = byteBuffer.getInt();
        this.v2 = byteBuffer.getInt();
    }

    @Override
    public final void vD(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3 = byteBuffer.position();
        if (((long)this.a & 0x20000000L) == 0L) {
            byteBuffer.position(n3 + this.CL0);
            n2 = this.a;
            n = (int)(((long)n2 & 0xC0000000L) >> 29);
            if (n == 0) {
                ++n;
            }
            this.Ij = ((long)n2 & 0x10000000L) != 0L ? px_1.oV((int)(((long)n2 & 0xFFFFL) / (long)n), byteBuffer) : px_1.x6((int)(((long)n2 & 0xFFFFL) / (long)n), byteBuffer);
        }
        if (((long)this.q7 & 0x20000000L) == 0L) {
            byteBuffer.position(n3 + this.ek);
            n2 = this.q7;
            n = (int)(((long)n2 & 0xC0000000L) >> 29);
            if (n == 0) {
                ++n;
            }
            this.Tl0 = ((long)n2 & 0x10000000L) != 0L ? px_1.oV((int)(((long)n2 & 0xFFFFL) / (long)n), byteBuffer) : px_1.x6((int)(((long)n2 & 0xFFFFL) / (long)n), byteBuffer);
        }
        if (((long)this.jm & 0x20000000L) == 0L) {
            byteBuffer.position(n3 + this.jR);
            n2 = this.jm;
            n = (int)(((long)n2 & 0xC0000000L) >> 29);
            if (n == 0) {
                ++n;
            }
            n2 = (int)(((long)n2 & 0xFFFFL) / (long)n);
            int[] nArray = new int[n2];
            for (int j = 0; j < n2; ++j) {
                nArray[j] = byteBuffer.getInt();
            }
        }
        if (((long)this.K7 & 0x20000000L) == 0L) {
            byteBuffer.position(n3 + this.Qb0);
            n2 = this.K7;
            int n4 = (int)(((long)n2 & 0xC0000000L) >> 29);
            if (n4 == 0) {
                ++n4;
            }
            this.R90 = ((long)n2 & 0x10000000L) != 0L ? px_1.oV((int)(((long)n2 & 0xFFFFL) / (long)n4), byteBuffer) : px_1.x6((int)(((long)n2 & 0xFFFFL) / (long)n4), byteBuffer);
        }
        if (((long)this.HC0 & 0x20000000L) == 0L) {
            byteBuffer.position(n3 + this.v2);
            n3 = this.HC0;
            n2 = (int)(((long)n3 & 0xC0000000L) >> 29);
            if (n2 == 0) {
                ++n2;
            }
            this.wj = ((long)n3 & 0x10000000L) != 0L ? px_1.oV((int)(((long)n3 & 0xFFFFL) / (long)n2), byteBuffer) : px_1.x6((int)(((long)n3 & 0xFFFFL) / (long)n2), byteBuffer);
        }
    }
}

