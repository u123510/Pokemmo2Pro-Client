package cn.pokemmo.task;

import f.FF0;
import f.fv_1;

public class CompositeTaskNode extends FF0 {
    public final fv_1 Lc0;

    public CompositeTaskNode() {
        super();
        this.Lc0 = new fv_1();
    }

    @Override
    public void GD0() {
        this.A30 = true;
        for (int i = 0; i < this.Lc0.wg.KB; i++) {
            ((FF0) this.Lc0.wg.get(i)).GD0();
        }
    }
}
