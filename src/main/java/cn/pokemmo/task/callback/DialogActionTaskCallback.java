package cn.pokemmo.task.callback;

import f.ox_0;

/**
 * 对话框动作触发回调 (Dialog Action Task Callback)
 * 对应混淆类: f.yp_0
 */
public class DialogActionTaskCallback implements Runnable {
    public final ox_0 kr0;

    public DialogActionTaskCallback(ox_0 ox_0) {
        this.kr0 = ox_0;
    }

    @Override
    public void run() {
        this.kr0.LR.u3(this.kr0);
        this.kr0.getClass();
    }
}
