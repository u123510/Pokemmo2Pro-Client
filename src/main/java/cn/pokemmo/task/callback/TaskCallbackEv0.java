package cn.pokemmo.task.callback;

import f.*;

import java.lang.reflect.Field;

public class TaskCallbackEv0 implements Runnable  {
    public final ao0_0 XK0;

    public TaskCallbackEv0(ao0_0 owner) {
        super();
        this.XK0 = owner;
    }

    @Override
    public final void run() {
        try {
            Field requestField = ao0_0.class.getField("EY");
            Field dialogField = ao0_0.class.getField("Jq");
            HV request = (HV) requestField.get(this.XK0);
            zg0_2 dialog = (zg0_2) dialogField.get(this.XK0);
            tw0_0.rl.fk0.uQ(new WE0((byte) 0, request.Lpt3, request.yx0));
            dialog.K20.u3(dialog);
        } catch (ReflectiveOperationException exception) {
            throw new RuntimeException(exception);
        }
    }
}
