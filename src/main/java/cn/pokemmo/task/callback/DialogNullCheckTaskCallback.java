package cn.pokemmo.task.callback;

import f.id0_0;
import f.wl0_0;

/**
 * 对话框非空检查任务回调 (Dialog Null Check Task Callback)
 * 对应混淆类: f.dt_1
 */
public class DialogNullCheckTaskCallback implements Runnable {
    public final id0_0 xK;

    public DialogNullCheckTaskCallback(id0_0 id0_0, String[] strArr) {
        this.xK = id0_0;
    }

    @Override
    public void run() {
        wl0_0 ge = this.xK.bg0.ge;
        if (ge != null) {
            ge.getClass();
        }
    }
}
