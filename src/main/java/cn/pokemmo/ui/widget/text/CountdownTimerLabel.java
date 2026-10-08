/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

import f.GF0;
import f.sm0_0;
import f.xe_1;

public class CountdownTimerLabel extends BaseLabel
implements GF0 {
    public int O1;

    public CountdownTimerLabel(int n) {
        super(null, false, null);
        this.D4(n);
    }

    public final void Tj() {
        this.SU(sm0_0.c0(this.O1));
    }

    public final void D4(int n) {
        if (n != this.O1) {
            this.O1 = n;
            this.SU(sm0_0.c0((int)n));
        }
    }
}
