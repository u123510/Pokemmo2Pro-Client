package cn.pokemmo.task.callback;

import f.ag0_0;
import f.wl0_0;

/**
 * UI 窗口非空校验回调 (Null Check Task Callback)
 * 对应混淆类: f.bp_1
 */
public class NullCheckTaskCallbackBp1 implements Runnable {
    public final ag0_0 If0;

    public NullCheckTaskCallbackBp1(ag0_0 If0) {
        this.If0 = If0;
    }

    @Override
    public void run() {
        wl0_0 w = this.If0.cL0.ge;
        if (w != null) {
            w.getClass();
        }
    }
}
