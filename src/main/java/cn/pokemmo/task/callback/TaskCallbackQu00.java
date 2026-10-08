package cn.pokemmo.task.callback;

import f.*;

import java.util.ArrayList;

public class TaskCallbackQu00 implements Runnable  {
    public final q10_0 wr0;
    public final COm8_ Z8;

    public TaskCallbackQu00(COm8_ owner, q10_0 category) {
        this.Z8 = owner;
        this.wr0 = category;
    }

    @Override
    public final void run() {
        COm8_ owner = this.Z8;
        q10_0 category = this.wr0;
        owner.getClass();
        ArrayList items = new ArrayList();
        w7_0 values = category.Fk;
        values.getClass();
        new M(values);
        V3 iterator = new V3(values);
        while (iterator.hasNext()) {
            items.add((X90) iterator.u7());
        }

        ly_1 screen = new ly_1(owner, items);
        if (screen.c3()) {
            screen.lt0();
            le0_2 selected = owner.Sa[category.iL];
            int x = selected.cz() + 10;
            le0_2 anchor = owner.Sa[category.iL];
            int offset = anchor.SB0 - screen.OB / 2;
            int y = anchor.OB / 2 + offset;
            screen.E40(x, y);
        }
    }
}
