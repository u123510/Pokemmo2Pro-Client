package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackWn0 implements Runnable  {
    public final tx_0 SM;
    public final String zV;
    public final jb0_0[] BH;

    public TaskCallbackWn0(tx_0 type, String name, jb0_0[] entries) {
        this.SM = type;
        this.zV = name;
        this.BH = entries;
    }

    @Override
    public final void run() {
        BU ui = BU.T50;
        if (ui == null || ui.OJ == null) {
            return;
        }
        byte slot = 0;
        while (slot < this.SM.NG0.length) {
            if (this.SM.NG0[slot].Uz0()) {
                break;
            }
            slot = (byte) (slot + 1);
        }
        if (slot < 0 || slot >= this.SM.NG0.length) {
            Qy0.yI0.dk(-1, sm0_0.wa0(2306, this.zV));
            return;
        }
        for (jb0_0 entry : this.BH) {
            VU value = entry.ol0();
            if (value == null) {
                continue;
            }
            if (slot > 5) {
                Qy0.yI0.dk(-1, sm0_0.wa0(2306, this.zV));
                break;
            }
            byte next = (byte) (slot + 1);
            tw0_0.rl.fk0.uQ(new cw_2(this.SM.wo, slot, value.pu));
            slot = next;
        }
    }
}
