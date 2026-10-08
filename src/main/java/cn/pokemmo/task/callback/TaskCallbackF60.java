package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackF60 implements Runnable  {
    public final le0_2 r20;
    public final String c60;

    public TaskCallbackF60(le0_2 widget, String name) {
        if (widget == null) {
            throw new NullPointerException("widget");
        }
        this.r20 = widget;
        this.c60 = name;
    }

    @Override
    public void run() {
        pu_2 table = this.r20.o5;
        if (table == null) {
            return;
        }
        da_1 entry = (da_1)a9_0.i40(table.ec, this.c60);
        if (entry != null) {
            entry.Hy.run();
        }
    }
}
