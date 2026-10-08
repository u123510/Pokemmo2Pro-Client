package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackQ50 implements Runnable  {
    public final BU TK;
    public final zs_2 dM;

    public TaskCallbackQ50(zs_2 dialog, BU client) {
        this.dM = dialog;
        this.TK = client;
    }

    @Override
    public final void run() {
        dw_2.Zd = this.dM.XC0.aq();
        dw_2.He0 = this.dM.Cu.aq();
        dw_2.lL0 = this.dM.OD0.dI0 instanceof wn0_0
                ? ((wn0_0) this.dM.OD0.dI0).YA.toString().replaceAll("\n", ";")
                : ((wn0_0) this.dM.OD0.dI0).YA.toString().replaceAll("\n", ";");
        dw_2.FB = null;
        dw_2.CY();

        BU client = this.TK;
        if (client.Mr != null) {
            client.Mr.xe0();
            client.Mr = null;
        } else {
            zs_2 dialog = new zs_2(client);
            client.Mr = dialog;
            client.SL(dialog);
            client.Mr.lt0();
            client.Mr.vf(pa0_0.Ol);
        }
    }
}
