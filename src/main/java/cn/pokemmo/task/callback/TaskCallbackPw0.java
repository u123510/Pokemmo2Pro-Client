/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import com.pokeemu.client.gF;
import f.Mx;
import f.dw_2;
import f.wl0_0;

public class TaskCallbackPw0
implements Runnable  {
    public final /* synthetic */ boolean nd0;
    public final /* synthetic */ Mx uc0;

    public TaskCallbackPw0(Mx mx, boolean bl) {
        this.uc0 = mx;
        this.nd0 = bl;
    }

    @Override
    public final void run() {
        wl0_0 wl0_02 = this.uc0.JY.ge;
        if (wl0_02 != null) {
            ((gF)wl0_02).getClass();
            dw_2.qC = this.nd0;
        }
    }
}

