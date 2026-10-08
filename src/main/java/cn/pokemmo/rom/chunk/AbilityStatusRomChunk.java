/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.chunk;

import f.*;

import f.be0_1;
import f.px_1;
import java.nio.ByteBuffer;

/*
 * Renamed from f.Zw
 */
public class AbilityStatusRomChunk
extends BaseRomResourceChunk {
    public long is0;
    public long PC0;
    public long eC;
    public long CJ;
    public long Sg;
    public int cOn;
    public int S2;
    public int J1;
    public int E70;
    public byte cs0;
    public int[] RV;
    public int[] jH0;
    public int[] mG;
    public int[] QB;
    public int[] xk;

    public static int nUL(int n, int n2, long l, int[] nArray) {
        if ((l & 0x20000000L) == 0L) {
            if ((l & 0xC0000000L) == 0L) {
                if (nArray.length <= n2) {
                    return n;
                }
                n = nArray[n2];
            } else if ((l & 0x40000000L) != 0L) {
                if ((n2 & 1) != 0) {
                    if ((long)n2 > (l &= 0x1FFF0000L) >> 16) {
                        n = nArray[(int)((l >> 17) + 1L)];
                    } else {
                        n = n2 >> 1;
                        n = (nArray[n] + nArray[n + 1]) / 2;
                    }
                } else {
                    n = nArray[n2 >> 1];
                }
            } else if ((l & 0x80000000L) != 0L) {
                n = n2 & 3;
                if (n != 0) {
                    if ((long)n2 > (l &= 0x1FFF0000L) >> 16) {
                        n = nArray[(int)((l >> 18) + (long)n)];
                    } else if ((n2 & 1) != 0) {
                        if ((n2 & 2) != 0) {
                            n = n2 >> 2;
                            n2 = n + 1;
                        } else {
                            n = (n2 >>= 2) + 1;
                        }
                        n2 = nArray[n2];
                        n = nArray[n];
                        n = (n2 + n2 + n2 + n) / 4;
                    } else {
                        n = n2 >> 2;
                        n = (nArray[n] + nArray[n + 1]) / 2;
                    }
                } else {
                    n = nArray[n2 >> 2];
                }
            } else {
                n = -1;
            }
        }
        return n;
    }

    @Override
    public final void pH(ByteBuffer byteBuffer, int ... nArray) {
        this.a00 = 0;
        this.is0 = byteBuffer.getInt();
        this.PC0 = byteBuffer.getInt();
        this.eC = byteBuffer.getInt();
        this.CJ = byteBuffer.getInt();
        this.Sg = byteBuffer.getInt();
    }

    @Override
    public final void vD(ByteBuffer byteBuffer) {
        int n;
        long l = this.is0;
        if ((l & 0x20000000L) != 0L) {
            this.cOn = (int)(l & 0xFFFFL);
        } else {
            byteBuffer.position(this.a00 + (int)(l & 0xFFFFL));
            l = this.is0;
            n = (l & 0x40000000L) != 0L ? ((l & 0x80000000L) != 0L ? 4 : 2) : 1;
            this.RV = px_1.BJ0((int)(((l & 0x1FFF0000L) >> 16) / (long)n), byteBuffer);
        }
        l = this.PC0;
        if ((l & 0x20000000L) != 0L) {
            this.S2 = (int)(l & 0xFFFFL);
        } else {
            byteBuffer.position(this.a00 + (int)(l & 0xFFFFL));
            l = this.PC0;
            n = (l & 0x40000000L) != 0L ? ((l & 0x80000000L) != 0L ? 4 : 2) : 1;
            this.jH0 = px_1.BJ0((int)(((l & 0x1FFF0000L) >> 16) / (long)n), byteBuffer);
        }
        l = this.eC;
        if ((l & 0x20000000L) != 0L) {
            this.J1 = (int)(l & 0xFFFFL);
        } else {
            byteBuffer.position(this.a00 + (int)(l & 0xFFFFL));
            l = this.eC;
            n = (l & 0x40000000L) != 0L ? ((l & 0x80000000L) != 0L ? 4 : 2) : 1;
            this.mG = px_1.BJ0((int)(((l & 0x1FFF0000L) >> 16) / (long)n), byteBuffer);
        }
        l = this.CJ;
        if ((l & 0x20000000L) != 0L) {
            this.E70 = (int)(l & 0xFFFFL);
        } else {
            byteBuffer.position(this.a00 + (int)(l & 0xFFFFL));
            l = this.CJ;
            n = (l & 0x40000000L) != 0L ? ((l & 0x80000000L) != 0L ? 4 : 2) : 1;
            this.QB = px_1.BJ0((int)(((l & 0x1FFF0000L) >> 16) / (long)n), byteBuffer);
        }
        l = this.Sg;
        if ((l & 0x20000000L) != 0L) {
            this.cs0 = (byte)(l & 0xFFFFL);
        } else {
            byteBuffer.position(this.a00 + (int)(l & 0xFFFFL));
            l = this.Sg;
            n = (l & 0x40000000L) != 0L ? ((l & 0x80000000L) != 0L ? 4 : 2) : 1;
            int n2 = (int)(((l & 0x1FFF0000L) >> 16) / (long)n);
            int[] nArray = new int[n2];
            for (n = 0; n < n2; ++n) {
                nArray[n] = byteBuffer.get();
            }
            this.xk = nArray;
        }
    }
}

