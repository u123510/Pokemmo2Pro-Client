package cn.pokemmo.battle;

import f.D2;
import java.util.ArrayList;

public class TransientAnimationList {
    public final ArrayList n10;

    public TransientAnimationList() {
        this.n10 = new ArrayList(20);
    }

    public void D70(float f1) {
        for (int i = this.n10.size() - 1; i >= 0; i--) {
            D2 d = (D2) this.n10.get(i);
            if (d.BJ0() && d.ix) {
                this.n10.remove(i);
                d.bC0();
            }
        }
        if (f1 >= 0.0f) {
            int size = this.n10.size();
            for (int i = 0; i < size; i++) {
                ((D2) this.n10.get(i)).mh(f1);
            }
        } else {
            for (int i = this.n10.size() - 1; i >= 0; i--) {
                ((D2) this.n10.get(i)).mh(f1);
            }
        }
    }
}
