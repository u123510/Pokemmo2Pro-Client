/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.Bw0;
import java.util.HashMap;

public class TaskCallbackQw
implements Runnable  {
    @Override
    public final void run() {
        new HashMap<String, Boolean>().put("usersubmitted", Boolean.TRUE);
        boolean bl = false;
        Bw0.Sx0(Bw0.Cp(new RuntimeException("User Submitted Error Report")), bl);
    }
}

