package cn.pokemmo.ui.widget;

import f.*;

import java.util.ArrayList;

public class ClippedContainerWidget extends jw_0 {
    public final ArrayList zj0;
    public final ArrayList Q5;
    public final ArrayList dx0;
    public char[] Nw;

    public ClippedContainerWidget(ay_0 ay0) {
        super(ay0);
        this.zj0 = new ArrayList();
        this.Q5 = new ArrayList();
        this.dx0 = new ArrayList();
        this.Nw = ge_0.XD;
    }

    @Override
    public final void dr(Hq0 hq0) {
        hq0.ZB += this.rs0;
        int x = hq0.ZB;
        hq0.B60 += this.D10;
        int y = hq0.B60;
        qq_0 qq0 = (qq_0) hq0.eH0;
        qq0.al(x, y, this.J, this.Nm0);
        try {
            dq_0 dq0 = qq0.J50;
            pt_1 pt1 = dq0.mz0[dq0.CF - 1];
            if (pt1.Yw > pt1.V && pt1.tj > pt1.YE) {
                int size = this.zj0.size();
                for (int i = 0; i < size; i++) {
                    ((jw_0) this.zj0.get(i)).dr(hq0);
                }
            }
        } finally {
            qq0.Lpt9();
            hq0.ZB -= this.rs0;
            hq0.B60 -= this.D10;
        }
    }

    @Override
    public final void UL(int x, int y) {
        int curX = x + this.rs0;
        int curY = y + this.D10;
        int size = this.zj0.size();
        for (int i = 0; i < size; i++) {
            ((jw_0) this.zj0.get(i)).UL(curX, curY);
        }
    }

    @Override
    public final void Fk0(int x, int y, ArrayList list) {
        int curX = x + this.rs0;
        int curY = y + this.D10;
        int q5Size = this.Q5.size();
        for (int i = 0; i < q5Size; i++) {
            V30 v30 = (V30) this.Q5.get(i);
            v30.rs0 += curX;
            v30.D10 += curY;
            list.add(v30);
        }
        int zj0Size = this.zj0.size();
        for (int i = 0; i < zj0Size; i++) {
            ((jw_0) this.zj0.get(i)).Fk0(curX, curY, list);
        }
    }

    @Override
    public final void final$() {
        int size = this.zj0.size();
        for (int i = 0; i < size; i++) {
            ((jw_0) this.zj0.get(i)).final$();
        }
        this.zj0.clear();
        this.Q5.clear();
        this.Nw = ge_0.XD;
    }

    @Override
    public final jw_0 RL(int x, int y) {
        int localX = x - this.rs0;
        int localY = y - this.D10;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.Nw.length && localY >= i3) {
            int i7 = this.Nw[i5];
            int i6 = this.Nw[i5 + 1];
            i5 += 2;
            if (i6 > 0) {
                if (i7 == 0 || localY < i7) {
                    for (int i8 = 0; i8 < i6; i8++) {
                        jw_0 child = (jw_0) this.zj0.get(i4 + i8);
                        if (localX >= child.rs0 && localX < child.rs0 + child.J
                                && localY >= child.D10 && localY < child.D10 + child.Nm0) {
                            return child.RL(localX, localY);
                        }
                    }
                    if (i7 > 0 && localX >= ((jw_0) this.zj0.get(i4)).rs0) {
                        jw_0 last = null;
                        for (int i9 = 0; i9 < i6; i9++) {
                            jw_0 child = (jw_0) this.zj0.get(i4 + i9);
                            if (child.rs0 >= localX) {
                                if (last == null || last.xE0 == child.xE0) {
                                    return child;
                                }
                            }
                            last = child;
                        }
                    }
                }
                i4 += i6;
            }
            if (i7 > 0) {
                i3 = i7;
            }
        }
        return this;
    }

    @Override
    public final boolean dd(jw_0 jw0) {
        boolean any = false;
        int size = this.zj0.size();
        for (int i = 0; i < size; i++) {
            any |= ((jw_0) this.zj0.get(i)).dd(jw0);
        }
        if (any) {
            this.lo = true;
        } else {
            super.dd(jw0);
        }
        int count = this.zj0.size();
        for (int i = 0; i < count; i++) {
            jw_0 child = (jw_0) this.zj0.get(i);
            if (child.US) {
                child.lo = this.lo;
            }
        }
        return this.lo;
    }
}
