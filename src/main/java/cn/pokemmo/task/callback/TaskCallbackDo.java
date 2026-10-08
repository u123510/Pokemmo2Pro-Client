/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import com.pokeemu.client.gF;
import f.H20;
import f.wl0_0;

public class TaskCallbackDo
implements Runnable  {
    public final /* synthetic */ boolean Od0;
    public final /* synthetic */ H20 G10;

    public TaskCallbackDo(H20 h20, boolean bl) {
        this.G10 = h20;
        this.Od0 = bl;
    }

    @Override
    public final void run() {
        wl0_0 wl0_02 = this.G10.Nf.ge;
        if (wl0_02 != null) {
            if (this.Od0) {
                ((gF)wl0_02).N6.resume();
            } else {
                ((gF)wl0_02).N6.wy0();
            }
            this.G10.Nf.getClass();
        }
    }
}

