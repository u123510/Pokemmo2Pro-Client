package cn.pokemmo.collection.list;

import f.*;

import java.util.Comparator;

public class FastSnapshotArray extends es_1 {
    public int Lw;
    public final Nn0 WB;
    public int JY;

    public FastSnapshotArray() {
        this.WB = new Nn0(0);
    }

    public FastSnapshotArray(es_1 es_1Var) {
        super(es_1Var);
        this.WB = new Nn0(0);
    }

    public FastSnapshotArray(boolean z, int i, Class cls) {
        super(z, i, cls);
        this.WB = new Nn0(0);
    }

    public FastSnapshotArray(boolean z, int i) {
        super(z, i);
        this.WB = new Nn0(0);
    }

    public FastSnapshotArray(boolean z, Object[] objArr, int i, int i2) {
        super(z, objArr, i, i2);
        this.WB = new Nn0(0);
    }

    public FastSnapshotArray(Class cls) {
        super(cls);
        this.WB = new Nn0(0);
    }

    public FastSnapshotArray(int i) {
        super(i);
        this.WB = new Nn0(0);
    }

    public FastSnapshotArray(Object[] objArr) {
        super(objArr);
        this.WB = new Nn0(0);
    }

    public final void Lu() {
        int i = this.Lw;
        if (i != 0) {
            int newLw = i - 1;
            this.Lw = newLw;
            if (newLw == 0) {
                int jy = this.JY;
                if (jy > 0 && jy == this.KB) {
                    this.WB.Ml = 0;
                    clear();
                } else {
                    int ml = this.WB.Ml;
                    for (int i2 = 0; i2 < ml; i2++) {
                        Nn0 nn0 = this.WB;
                        int idx = nn0.bR[nn0.Ml = nn0.Ml - 1];
                        if (idx >= this.JY) {
                            Tx0(idx);
                        }
                    }
                    for (int i3 = this.JY - 1; i3 >= 0; i3--) {
                        Tx0(i3);
                    }
                }
                this.JY = 0;
            }
            return;
        }
        throw new IllegalStateException("begin must be called before end.");
    }

    @Override
    public final boolean sj0(Object v1, boolean i2) {
        if (this.Lw > 0) {
            int idx = E8(v1, i2);
            if (idx == -1) {
                return false;
            }
            vg(idx);
            return true;
        }
        return super.sj0(v1, i2);
    }

    @Override
    public final Object Tx0(int i1) {
        if (this.Lw > 0) {
            vg(i1);
            return get(i1);
        }
        return super.Tx0(i1);
    }

    @Override
    public final void cB(int i1) {
        if (this.Lw > 0) {
            while (i1 >= 0) {
                vg(i1);
                i1--;
            }
            return;
        }
        super.cB(i1);
    }

    @Override
    public final void clear() {
        if (this.Lw > 0) {
            this.JY = this.KB;
            return;
        }
        super.clear();
    }

    @Override
    public final void c0(int i1, Object v2) {
        if (this.Lw <= 0) {
            super.c0(i1, v2);
            return;
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    @Override
    public final void P6(int i1, Object v2) {
        if (this.Lw <= 0) {
            super.P6(i1, v2);
            return;
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    @Override
    public final Object rq0() {
        if (this.Lw <= 0) {
            return super.rq0();
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    @Override
    public final void sort(Comparator v1) {
        if (this.Lw <= 0) {
            super.sort(v1);
            return;
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    @Override
    public final void Qe0() {
        if (this.Lw <= 0) {
            super.Qe0();
            return;
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    @Override
    public final void fu0(int i1) {
        if (this.Lw <= 0) {
            super.fu0(i1);
            return;
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    public final void vg(int i1) {
        if (i1 >= this.JY) {
            int ml = this.WB.Ml;
            for (int i2 = 0; i2 < ml; i2++) {
                int val = this.WB.X8(i2);
                if (i1 == val) {
                    return;
                }
                if (i1 < val) {
                    Nn0 nn0 = this.WB;
                    if (i2 <= nn0.Ml) {
                        int[] bR = nn0.bR;
                        if (nn0.Ml == bR.length) {
                            bR = nn0.Wn(Math.max(8, (int) (((float) nn0.Ml) * 1.75f)));
                        }
                        if (nn0.M60) {
                            System.arraycopy(bR, i2, bR, i2 + 1, nn0.Ml - i2);
                        } else {
                            bR[nn0.Ml] = bR[i2];
                        }
                        nn0.Ml++;
                        bR[i2] = i1;
                        return;
                    }
                    throw new IndexOutOfBoundsException(CO.go("index can't be > size: ", i2, " > ").append(nn0.Ml).toString());
                }
            }
            this.WB.ja0(i1);
        }
    }
}
