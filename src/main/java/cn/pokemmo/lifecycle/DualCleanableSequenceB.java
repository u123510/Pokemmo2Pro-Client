package cn.pokemmo.lifecycle;

import f.NN;
import f.zc0_1;

public class DualCleanableSequenceB extends NN {
    public final zc0_1 L50;

    public DualCleanableSequenceB(zc0_1 zc0_1, zc0_1 zc0_12) {
        super(zc0_1);
        this.L50 = zc0_12;
    }

    @Override
    public void em() {
        super.em();
        this.L50.em();
    }
}
