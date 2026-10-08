package cn.pokemmo.audio.sequence;

import f.*;

public class MultiTrackAudioSequencer implements wl0_2, ix_1 {
    public static final boolean throw$ = !MultiTrackAudioSequencer.class.desiredAssertionStatus();
    public final wl0_2[] sI0;
    public final int[] mj;
    public final int[] Bm0;
    public final ux0_0 f7;
    public final int yO;
    public final int Rl;
    public final int[] H90;
    public final int[] II;
    public final int Km;
    public final int coM9;

    public MultiTrackAudioSequencer(wl0_2[] i1, int[] i2, int[] i3, ux0_0 i4) {
        if (i2.length == 0 || i3.length == 0) {
            throw new IllegalArgumentException("zero dimension size not allowed");
        }
        if (!throw$ && i2.length * i3.length != i1.length) {
            throw new AssertionError();
        }

        this.sI0 = i1;
        this.mj = i2;
        this.Bm0 = i3;
        this.f7 = i4;
        this.H90 = new int[i2.length];
        this.II = new int[i3.length];

        int width = 0;
        for (int x = 0; x < i2.length; ++x) {
            int columnWidth = 0;
            for (int y = 0; y < i3.length; ++y) {
                columnWidth = Math.max(columnWidth, this.QF(x, y).Nx());
            }
            width += columnWidth;
            this.H90[x] = columnWidth;
        }
        this.yO = width;

        int height = 0;
        for (int y = 0; y < i3.length; ++y) {
            int rowHeight = 0;
            for (int x = 0; x < i2.length; ++x) {
                rowHeight = Math.max(rowHeight, this.QF(x, y).Af());
            }
            height += rowHeight;
            this.II[y] = rowHeight;
        }
        this.Rl = height;

        int weightX = 0;
        for (int weight : i2) {
            if (weight < 0) {
                throw new IllegalArgumentException("negative weight in weightX");
            }
            weightX += weight;
        }
        this.Km = weightX;

        int weightY = 0;
        for (int weight : i3) {
            if (weight < 0) {
                throw new IllegalArgumentException("negative weight in weightY");
            }
            weightY += weight;
        }
        this.coM9 = weightY;

        if (this.Km <= 0 || this.coM9 <= 0) {
            throw new IllegalArgumentException("zero weightX not allowed");
        }
    }

    public MultiTrackAudioSequencer(wl0_2[] i1, MultiTrackAudioSequencer i2) {
        this.sI0 = i1;
        this.mj = i2.mj;
        this.Bm0 = i2.Bm0;
        this.f7 = i2.f7;
        this.H90 = i2.H90;
        this.II = i2.II;
        this.Km = i2.Km;
        this.coM9 = i2.coM9;
        this.yO = i2.yO;
        this.Rl = i2.Rl;
    }

    public final int Nx() {
        return this.yO;
    }

    public final int Af() {
        return this.Rl;
    }

    public final void GO(VT i1, int i2, int i3) {
        this.uf(i1, i2, i3, this.yO, this.Rl);
    }

    public final void uf(rb_1 i1, int i2, int i3, int i4, int i5) {
        int remainingHeight = i5 - this.Rl;
        int remainingWeightY = this.coM9;
        int item = 0;

        for (int y = 0; y < this.Bm0.length; ++y) {
            int rowHeight = this.II[y];
            if (remainingWeightY > 0) {
                int weight = this.Bm0[y];
                int share = remainingHeight * weight / remainingWeightY;
                rowHeight += share;
                remainingHeight -= share;
                remainingWeightY -= weight;
            }

            int remainingWidth = i4 - this.yO;
            int remainingWeightX = this.Km;
            int xPosition = i2;
            for (int x = 0; x < this.mj.length; ++x) {
                int columnWidth = this.H90[x];
                if (remainingWeightX > 0) {
                    int weight = this.mj[x];
                    int share = remainingWidth * weight / remainingWeightX;
                    columnWidth += share;
                    remainingWidth -= share;
                    remainingWeightX -= weight;
                }

                this.sI0[item].uf(i1, xPosition, i3, columnWidth, rowHeight);
                xPosition += columnWidth;
                ++item;
            }
            i3 += rowHeight;
        }
    }

    public final ux0_0 MY() {
        return this.f7;
    }

    public final wl0_2 so(gn_0 i1) {
        wl0_2[] transformed = new wl0_2[this.sI0.length];
        for (int i = 0; i < transformed.length; ++i) {
            transformed[i] = this.sI0[i].so(i1);
        }
        return new MultiTrackAudioSequencer(transformed, this);
    }

    public final wl0_2 QF(int i1, int i2) {
        return this.sI0[i2 * this.mj.length + i1];
    }

    public final LPT6_ LT() {
        return null;
    }
}
