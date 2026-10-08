package cn.pokemmo.lifecycle;

import f.NN;
import f.zc0_1;

public class DualCleanableSequenceA extends NN {
    public final zc0_1 th;

    public DualCleanableSequenceA(zc0_1 zc0_1, zc0_1 zc0_12) {
        super(zc0_1);
        this.th = zc0_12;
    }

    @Override
    public void em() {
        super.em();
        this.th.em();
    }
}
