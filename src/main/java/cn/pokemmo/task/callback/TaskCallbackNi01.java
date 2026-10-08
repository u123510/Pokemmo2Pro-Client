/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.a7_0;
import f.yz_1;

/*
 * Renamed from f.nI0
 */
public class TaskCallbackNi01
implements Runnable  {
    public final /* synthetic */ yz_1 wa0;

    public TaskCallbackNi01(yz_1 yz_12) {
        this.wa0 = yz_12;
    }

    @Override
    public final void run() {
        TaskCallbackNi01 ni0_12 = this;
        ni0_12.wa0.x00();
        ni0_12.wa0.z70.so0 = (Runnable[])a7_0.tp0(this, ni0_12.wa0.z70.so0);
    }
}

