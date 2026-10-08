/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.util.math;

import f.*;

import java.util.Random;

public class FastRandom
extends Random {
    public long N00;
    public long qt;

    public FastRandom() {
        O00 o00 = (O00) this;
        o00.setSeed(new Random().nextLong());
    }

    public FastRandom(long l) {
        O00 o00 = (O00) this;
        o00.setSeed(l);
    }

    public FastRandom(long l, long l2) {
        O00 o00 = (O00) this;
        o00.k9(l, l2);
    }

    @Override
    public final long nextLong() {
        long l;
        long l2 = this.N00;
        this.N00 = l = this.qt;
        long l3 = l2 ^ l2 << 23;
        this.qt = l3 = l3 ^ l ^ l3 >>> 17 ^ l >>> 26;
        return l3 + l;
    }

    @Override
    public final int next(int n) {
        return (int)(this.nextLong() & (1L << n) - 1L);
    }

    @Override
    public final int nextInt() {
        return (int)this.nextLong();
    }

    @Override
    public final int nextInt(int n) {
        return (int)this.nextLong(n);
    }

    @Override
    public final long nextLong(long l) {
        if (l > 0L) {
            long l2;
            long l3;
            long l4;
            do {
                l3 = this.nextLong() >>> 1;
            } while (l - 1L + (l4 = l3 - (l2 = l3 % l)) < 0L);
            return l2;
        }
        throw new IllegalArgumentException("n must be positive");
    }

    @Override
    public final double nextDouble() {
        return (double)(this.nextLong() >>> 11) * (double)1.110223E-16f;
    }

    @Override
    public final float nextFloat() {
        return (float)((double)(this.nextLong() >>> 40) * 5.9604644775390625E-8);
    }

    @Override
    public final boolean nextBoolean() {
        return (this.nextLong() & 1L) != 0L;
    }

    @Override
    public final void nextBytes(byte[] byArray) {
        int n = byArray.length;
        block0: while (n != 0) {
            int n2 = n < 8 ? n : 8;
            long l = this.nextLong();
            while (true) {
                int n3 = n2;
                n2 = n3 + -1;
                if (n3 == 0) continue block0;
                byArray[n += -1] = (byte)l;
                l >>= 8;
            }
        }
    }

    @Override
    public final void setSeed(long l) {
        if (l == 0L) {
            l = Long.MIN_VALUE;
        }
        O00 o00 = (O00) this;
        long l2 = l;
        long l3 = (l2 ^ l2 >>> 33) * -49064778989728563L;
        long l4 = (l3 ^ l3 >>> 33) * -4265267296055464877L;
        long l5 = l4 ^ l4 >>> 33;
        long l6 = (l5 ^ l5 >>> 33) * -49064778989728563L;
        long l7 = (l6 ^ l6 >>> 33) * -4265267296055464877L;
        long l8 = l7 ^ l7 >>> 33;
        o00.N00 = l5;
        o00.qt = l8;
    }

    public final void k9(long l, long l2) {
        O00 o00 = (O00) this;
        o00.N00 = l;
        o00.qt = l2;
    }
}

