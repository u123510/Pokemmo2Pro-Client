/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.math;

import f.*;

import f.C8;
import f.es_1;
import f.lt_2;
import f.tx_2;

public class MatrixBufferCollection
implements tx_2 {
    public lt_2[] qc;
    public es_1 KK;
    public int cI;
    public boolean nl0;
    public int bM0;
    public lt_2 Cg0;
    public lt_2 jj0;
    public lt_2 Ym;

    public static lt_2 ic0(lt_2 lt_22, int n, float f, lt_2[] lt_2Array, int n2, boolean bl, lt_2 lt_23) {
        if (n2 == 3) {
            float f2 = f;
            n2 = lt_2Array.length;
            float f3 = 1.0f - f;
            float f4 = f2 * f2;
            float f5 = f4 * f;
            lt_22.lY(lt_2Array[n]).G7((f5 * 3.0f - f4 * 6.0f + 4.0f) * 0.16666667f);
            if (bl || n > 0) {
                float f6 = f3;
                lt_22.Xg0(lt_23.lY(lt_2Array[(n2 + n - 1) % n2]).G7(f6 * f6 * f3 * 0.16666667f));
            }
            if (bl || n < n2 - 1) {
                float f7 = f;
                f = f5 * -3.0f;
                f = f4 * 3.0f + f;
                lt_22.Xg0(lt_23.lY(lt_2Array[(n + 1) % n2]).G7((f7 * 3.0f + f + 1.0f) * 0.16666667f));
            }
            if (bl || n < n2 - 2) {
                lt_22.Xg0(lt_23.lY(lt_2Array[(n + 2) % n2]).G7(f5 * 0.16666667f));
            }
            return lt_22;
        }
        throw new IllegalArgumentException();
    }

    public MatrixBufferCollection() {
    }

    public MatrixBufferCollection(lt_2[] lt_2Array, int n, boolean bl) {
        ML mL = (ML) this;
        mL.al0(lt_2Array, n, bl);
    }

    public final void al0(lt_2[] lt_2Array, int n, boolean bl) {
        if (this.Cg0 == null) {
            this.Cg0 = lt_2Array[0].f10();
        }
        if (this.jj0 == null) {
            this.jj0 = lt_2Array[0].f10();
        }
        if (this.Ym == null) {
            this.Ym = lt_2Array[0].f10();
        }
        ML mL = (ML) this;
        mL.qc = lt_2Array;
        mL.cI = n;
        mL.nl0 = bl;
        int n2 = bl ? lt_2Array.length : lt_2Array.length - n;
        this.bM0 = n2;
        es_1 samples = this.KK;
        if (samples == null) {
            samples = new es_1(n2);
            this.KK = samples;
        } else {
            samples.clear();
            this.KK.Bv(this.bM0);
        }
        for (n2 = 0; n2 < this.bM0; ++n2) {
            int n3;
            lt_2 lt_22 = lt_2Array[0].f10();
            if (bl) {
                n3 = n2;
            } else {
                float f = n2;
                n3 = (int)((float)n * 0.5f + f);
            }
            samples.Ue0(ML.ic0(lt_22, n3, 0.0f, lt_2Array, n, bl, this.Cg0));
        }
    }

    @Override
    public final lt_2 DA0(float f, C8 lt_22) {
        float f2 = f;
        int n = this.bM0;
        float f3 = f2 * (float)n;
        n = f2 >= 1.0f ? --n : (int)f3;
        f3 -= (float)n;
        boolean bl = this.nl0;
        if (!bl) {
            n += (int)((float)this.cI * 0.5f);
        }
        lt_2 c8 = lt_22;
        int n2 = n;
        lt_2[] lt_2Array = this.qc;
        n = this.cI;
        return ML.ic0(c8, n2, f3, lt_2Array, n, bl, this.Cg0);
    }
}
