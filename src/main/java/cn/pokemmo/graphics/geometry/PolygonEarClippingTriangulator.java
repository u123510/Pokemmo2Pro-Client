package cn.pokemmo.graphics.geometry;

import f.*;

public class PolygonEarClippingTriangulator {
    public final BB G9;
    public short[] eI0;
    public float[] H4;
    public int nb;
    public final Nn0 Dm;
    public final BB Gk0;

    public PolygonEarClippingTriangulator() {
        this.G9 = new BB();
        this.Dm = new Nn0();
        this.Gk0 = new BB();
    }

    public final BB PRn(float[] fArr) {
        int i2 = 0;
        int i3 = fArr.length;
        this.H4 = fArr;
        int i4 = i3 / 2;
        this.nb = i4;
        BB bb = this.G9;
        bb.Sd0 = 0;
        bb.Wf(i4);
        bb.Sd0 = i4;
        short[] sArr = bb.mi0;
        this.eI0 = sArr;
        int dummy = rl0_0.ga0;
        if (i3 > 2) {
            float f = 0.0f;
            int i5 = i3 - 2;
            float f2 = fArr[i5];
            float f3 = fArr[i3 - 1];
            while (i2 <= i5) {
                float f4 = fArr[i2];
                float f5 = fArr[i2 + 1];
                f += f2 * f5 - f4 * f3;
                i2 += 2;
                f2 = f4;
                f3 = f5;
            }
            if (f < 0.0f) {
                for (short s = 0; s < i4; s = (short) (s + 1)) {
                    sArr[s] = s;
                }
            } else {
                int i6 = i4 - 1;
                for (int i7 = 0; i7 < i4; i7++) {
                    sArr[i7] = (short) (i6 - i7);
                }
            }
        } else {
            int i8 = i4 - 1;
            for (int i9 = 0; i9 < i4; i9++) {
                sArr[i9] = (short) (i8 - i9);
            }
        }
        Nn0 nn0 = this.Dm;
        nn0.Ml = 0;
        if (i4 < 0) {
            throw new IllegalArgumentException("additionalCapacity must be >= 0: " + i4);
        }
        if (i4 > nn0.bR.length) {
            nn0.Wn(Math.max(8, Math.max(i4, (int) (nn0.Ml * 1.75f))));
        }
        for (int i10 = 0; i10 < i4; i10++) {
            nn0.ja0(this.Kz0(i10));
        }
        BB bb2 = this.Gk0;
        bb2.Sd0 = 0;
        bb2.Wf(Math.max(0, i4 - 2) * 3);
        int[] iArr = this.Dm.bR;
        while (true) {
            int i11 = this.nb;
            if (i11 <= 3) {
                break;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    int[] iArr2 = this.Dm.bR;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i11) {
                            i12 = 0;
                            break;
                        } else if (iArr2[i13] != -1) {
                            i12 = i13;
                            break;
                        } else {
                            i13++;
                        }
                    }
                    break;
                }
                int[] iArr3 = this.Dm.bR;
                if (iArr3[i12] != -1) {
                    int i14 = i12 == 0 ? this.nb : i12;
                    int i15 = i14 - 1;
                    int i16 = this.nb;
                    int i17 = (i12 + 1) % i16;
                    short[] sArr2 = this.eI0;
                    int p1 = sArr2[i15] * 2;
                    int p2 = sArr2[i12] * 2;
                    int p3 = sArr2[i17] * 2;
                    float[] fArr2 = this.H4;
                    float x1 = fArr2[p1];
                    float y1 = fArr2[p1 + 1];
                    float x2 = fArr2[p2];
                    float y2 = fArr2[p2 + 1];
                    float x3 = fArr2[p3];
                    float y3 = fArr2[p3 + 1];
                    int i18 = (i17 + 1) % i16;
                    boolean isEar = true;
                    while (i18 != i15) {
                        if (iArr3[i18] != 1) {
                            float px = fArr2[sArr2[i18] * 2];
                            float py = fArr2[sArr2[i18] * 2 + 1];
                            if ((int) Math.signum(fe_2.Ga0(y3, py, x1, (py - y1) * x3) + (y1 - py) * px) >= 0
                                    && (int) Math.signum(fe_2.Ga0(y1, py, x2, (py - y2) * x1) + (y2 - py) * px) >= 0
                                    && (int) Math.signum(fe_2.Ga0(y2, py, x3, (py - y3) * x2) + (y3 - py) * px) >= 0) {
                                isEar = false;
                                break;
                            }
                        }
                        i18 = (i18 + 1) % this.nb;
                    }
                    if (isEar) {
                        break;
                    }
                }
                i12++;
            }
            short[] sArr3 = this.eI0;
            BB bb3 = this.Gk0;
            int i19 = i12 == 0 ? this.nb : i12;
            int i20 = i12 + 1;
            int i21 = i20 % this.nb;
            bb3.e80(sArr3[i19 - 1]);
            bb3.e80(sArr3[i12]);
            bb3.e80(sArr3[i21]);
            BB bb4 = this.G9;
            int i22 = bb4.Sd0;
            if (i12 >= i22) {
                throw new IndexOutOfBoundsException(
                        CO.go("index can't be >= size: ", i12, " >= ").append(bb4.Sd0).toString());
            }
            short[] sArr4 = bb4.mi0;
            int i23 = i22 - 1;
            bb4.Sd0 = i23;
            if (bb4.kU) {
                System.arraycopy(sArr4, i20, sArr4, i12, i23 - i12);
            } else {
                sArr4[i12] = sArr4[i23];
            }
            this.Dm.CK0(i12);
            int i24 = this.nb - 1;
            this.nb = i24;
            int i25 = (i12 == 0 ? i24 : i12) - 1;
            if (i12 == i24) {
                i12 = 0;
            }
            iArr[i25] = this.Kz0(i25);
            iArr[i12] = this.Kz0(i12);
        }
        if (this.nb == 3) {
            BB bb5 = this.Gk0;
            short[] sArr5 = this.eI0;
            bb5.e80(sArr5[0]);
            bb5.e80(sArr5[1]);
            bb5.e80(sArr5[2]);
        }
        return this.Gk0;
    }

    public final int Kz0(int i) {
        short[] sArr = this.eI0;
        int i2 = i == 0 ? this.nb : i;
        int p1 = sArr[i2 - 1] * 2;
        int p2 = sArr[i] * 2;
        int p3 = sArr[(i + 1) % this.nb] * 2;
        float[] fArr = this.H4;
        float x1 = fArr[p1];
        float y1 = fArr[p1 + 1];
        float x2 = fArr[p2];
        float y2 = fArr[p2 + 1];
        float x3 = fArr[p3];
        float y3 = fArr[p3 + 1];
        return (int) Math.signum(fe_2.Ga0(y1, y3, x2, (y3 - y2) * x1) + (y2 - y1) * x3);
    }
}
