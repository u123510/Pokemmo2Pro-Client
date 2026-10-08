package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackIl0 implements Runnable  {
    public final boolean FJ0;
    public final Qy0 La;

    public TaskCallbackIl0(Qy0 qy0, boolean bl) {
        this.La = qy0;
        this.FJ0 = bl;
    }

    @Override
    public final void run() {
        boolean show = this.FJ0;
        if (show) {
            Qy0 qy0 = this.La;
            p00_0 widget = qy0.nd;
            if (widget.K20 == null) {
                qy0.F9(qy0.fU(), widget);
                return;
            }
        }
        if (!show) {
            p00_0 widget = this.La.nd;
            if (widget.K20 != null) {
                widget.xe0();
            }
        }
    }
}
