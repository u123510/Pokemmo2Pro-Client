package cn.pokemmo.task.callback;

import f.lg_0;

/**
 * 网络状态标志重置任务回调 (Network Flag Reset Task Callback)
 * 对应混淆类: f.JG
 */
public class NetworkFlagResetTaskCallback implements Runnable {

    @Override
    public void run() {
        lg_0.k.T0 = false;
    }
}
