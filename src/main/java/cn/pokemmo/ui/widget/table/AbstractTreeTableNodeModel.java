package cn.pokemmo.ui.widget.table;

import f.*;
import java.util.ArrayList;

public abstract class AbstractTreeTableNodeModel extends M0 implements vk_0 {
    public static final boolean Ye = !com6__0.class.desiredAssertionStatus();
    public final ArrayList ua;
    public r60_0[] Z;

    public AbstractTreeTableNodeModel() {
        this.ua = new ArrayList();
    }

    @Override
    public final Object Tb(int i1) {
        return null;
    }

    @Override
    public final void uj() {
    }

    @Override
    public final Zh getParent() {
        return null;
    }

    @Override
    public final boolean zD() {
        return false;
    }

    @Override
    public final int cx() {
        return this.ua.size();
    }

    @Override
    public final Zh rW(int i1) {
        return (Zh) this.ua.get(i1);
    }

    @Override
    public final int Fi(Zh v1) {
        int size = this.ua.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.ua.get(i2) == v1) {
                return i2;
            }
        }
        return -1;
    }

    public final void q1(int i1, Zh v2) {
        int i0 = 1;
        r60_0[] v3;
        if ((v3 = this.Z) != null) {
            int i4 = v3.length;
            for (int i5 = 0; i5 < i4; i5++) {
                QN v6 = v3[i5].OB;
                Cs0 v7;
                if ((v7 = (Cs0) a9_0.i40(v6.Vg0, v2)) != null) {
                    wb_1 v8;
                    if ((v8 = v7.Ma0) != null) {
                        assert v8.VQ >= i1;
                        int i10 = v8.VQ;
                        int i11 = i10 + i0;
                        int[] v12 = v8.p2;
                        if (i11 >= v12.length) {
                            v12 = new int[i11];
                            v8.li(0, i10, v12);
                            v8.p2 = v12;
                        } else {
                            v8.li(0, i10, v12);
                        }
                        System.arraycopy(v8.p2, i1, v8.p2, i1 + i0, v8.VQ - i1);
                        v8.VQ = i11;
                        v8.DE(i1, i0);
                        v8.iB0(0, i11);
                        assert v7.Ma0.VQ == v2.cx();
                    }
                    if (v7.Z5 != null) {
                        Cs0[] newZ5 = new Cs0[v2.cx()];
                        System.arraycopy(v7.Z5, 0, newZ5, 0, i1);
                        Cs0[] oldZ5 = v7.Z5;
                        System.arraycopy(oldZ5, i1, newZ5, i1 + i0, oldZ5.length - i1);
                        v7.Z5 = newZ5;
                    }
                    if (v6.pF(v7)) {
                        int i7 = v6.xK0(v2.rW(i1));
                        assert i7 < v6.Dx0;
                        v6.dK0(i7, i0);
                    }
                }
            }
        }
    }
}
