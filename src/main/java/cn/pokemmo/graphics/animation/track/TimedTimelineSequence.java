package cn.pokemmo.graphics.animation.track;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.G00;
import f.QI;
import f.d3;
import f.jk_0;


public class TimedTimelineSequence
extends BaseTimelineSequence {
    public final int ob0;
    public final int q1;
    public final int RN;

    public TimedTimelineSequence(int n, int n2) {
        super(0);
        this.ob0 = n;
        this.q1 = n2;
        this.RN = 400;
    }

    public TimedTimelineSequence(int n, int n2, int n3) {
        super(0);
        this.ob0 = n;
        this.q1 = n2;
        this.RN = 280;
    }

    public final d3 Vt0() {
        int n;
        jk_0[] jk_0Array = new jk_0[3];
        for (n = 0; n < 3; ++n) {
            jk_0Array[n] = new jk_0(QI.Py.kN((byte)0, 161, false).li0(n));
        }
        TimedTimelineSequence oq_12 = this;
        n = oq_12.ob0;
        int n2 = oq_12.q1 + 8;
        G00 g002 = new G00(jk_0Array, this.RN, 300, 100, n, n2);
        oq_12.bj0.add(g002);
        return oq_12;
    }
}
