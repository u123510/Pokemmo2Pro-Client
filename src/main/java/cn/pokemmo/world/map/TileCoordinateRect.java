/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.map;

import f.*;

import f.QA0;
import f.jj0_0;

/*
 * Renamed from f.LPT4
 */
public class TileCoordinateRect {
    public final int Lf0;

    public static void i8(int n, int n2, int n3, int n4) {
        boolean bl = false;
        String string = "";
        if (n4 < 0 || n4 > 255) {
            bl = true;
            string = " Alpha";
        }
        if (n < 0 || n > 255) {
            bl = true;
            string = QA0.W0(string, " Red");
        }
        if (n2 < 0 || n2 > 255) {
            bl = true;
            string = QA0.W0(string, " Green");
        }
        if (n3 < 0 || n3 > 255) {
            bl = true;
            string = QA0.W0(string, " Blue");
        }
        if (!bl) {
            return;
        }
        throw new IllegalArgumentException(jj0_0.hw0("Color parameter outside of expected range:", string));
    }

    public TileCoordinateRect(int n, int n2, int n3, int n4) {
        this.Lf0 = (n4 & 0xFF) << 24 | (n & 0xFF) << 16 | (n2 & 0xFF) << 8 | n3 & 0xFF;
        LPT4_.i8(n, n2, n3, n4);
    }

    public final int Cc() {
        return this.Lf0 >> 16 & 0xFF;
    }

    public final int TB0() {
        return this.Lf0 >> 8 & 0xFF;
    }

    public final int tr() {
        return this.Lf0 & 0xFF;
    }

    public final int rR() {
        return this.Lf0;
    }

    public final int hashCode() {
        return this.Lf0;
    }

    public final boolean equals(Object object) {
        return object instanceof TileCoordinateRect && ((TileCoordinateRect)object).Lf0 == this.Lf0;
    }

    public final String toString() {
        return LPT4_.class.getSimpleName() + "[r=" + this.Cc() + ",g=" + this.TB0() + ",b=" + this.tr() + "]";
    }

    public final LPT4_ RJ0(int n) {
        if (n > 255) {
            n = 255;
        }
        if (n < 0) {
            n = 0;
        }
        float f = (float)n / 255.0f;
        float f2 = (1.0f - f) * 255.0f;
        int n2 = (int)(f * (float)this.Cc() + f2);
        int n3 = (int)(f * (float)this.TB0() + f2);
        int n4 = (int)(f * (float)this.tr() + f2);
        return new LPT4_(n2, n3, n4, 255);
    }
}

