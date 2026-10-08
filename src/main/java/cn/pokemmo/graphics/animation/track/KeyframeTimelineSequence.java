package cn.pokemmo.graphics.animation.track;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class KeyframeTimelineSequence extends BaseTimelineSequence {
    public final jk_0[] zL;
    public boolean lK;
    public final int Px0;
    public final int iL;
    public int WV;

    public KeyframeTimelineSequence(jk_0[] v1, int i2) {
        super(0);
        this.lK = false;
        this.WV = 125;
        this.zL = v1;
        this.Px0 = i2;
        this.iL = 0;
    }

    public final void nr(hl0_1 v1) {
        if (!this.lK) {
            Ti0();
        }
        super.nr(v1);
    }

    public final d3 Ti0() {
        this.lK = true;
        int i1 = this.Px0 + 45;
        int i2 = this.iL;
        int i3 = this.WV;
        jk_0[] arr = this.zL;
        int i4 = i3 * arr.length;
        kv_2 kv = new kv_2(arr, i4, i3, i1, i2);
        this.bj0.add(kv);
        return this;
    }
}
