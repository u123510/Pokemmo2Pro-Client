package cn.pokemmo.task.callback;

import f.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TaskCallbackOr0 implements Runnable  {
    public final f80_0 dY;
    public final int hu0;
    public final ef_0 Nl0;

    public TaskCallbackOr0(ef_0 owner, f80_0 source, int index) {
        this.Nl0 = owner;
        this.dY = source;
        this.hu0 = index;
    }

    @Override
    public final void run() {
        if (!this.dY.Of()) {
            return;
        }
        Vt0 menu = new Vt0();
        A5 trigger = A5.PG0;
        RJ0 source = tw0_0.rl.NC[1];
        ArrayList<K5> entries = new ArrayList<>();
        wx_2 seen = new wx_2();
        K5[] values = source.KL();
        for (K5 value : values) {
            short kind = value.nn.wQ;
            if (!seen.bL0(kind) && value.cL.X80()) {
                entries.add(value);
                seen.TI0(kind);
            }
        }
        Collections.sort(entries);
        Iterator<K5> iterator = entries.iterator();
        while (iterator.hasNext()) {
            K5 value = iterator.next();
            String text = new StringBuilder()
                    .append(source.a90(value.nn.wQ))
                    .append("x ")
                    .append(value.Ua())
                    .toString();
            Wr icon = gh_1.aH0.F10(value.cL, false);
            kc0_0 callback = new kc0_0((Or0) this, value);
            kf0_1 item = new kf0_1(text, icon, 3, 3, 24, 24, callback, true);
            menu.hx.add(item);
        }
        xe_1 target;
        if (this.hu0 < 3) {
            target = this.Nl0.coM7[this.hu0 + 1];
        } else {
            target = this.Nl0.Ds0;
        }
        if (menu.hx.size() < 1) {
            menu.mA0(sm0_0.c0(6007), new Pr0());
        }
        UA.jP(menu, target, this.Nl0.coM7[this.hu0]);
    }
}
