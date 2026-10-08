package cn.pokemmo.task.callback;

import f.tw0_0;

/**
 * 对话框关闭与遮罩移除任务回调 (Dialog Dismiss Task Callback)
 * 对应混淆类: f.WI0
 */
public class DialogDismissTaskCallback implements Runnable {

    @Override
    public void run() {
        tw0_0.RE0.BK0(false);
    }
}
