package cn.pokemmo.task.callback;

import f.*;

/**
 * 快捷发包动作任务回调 (Packet Send Task Callback A9)
 * 对应混淆类: f.A9
 */
public class PacketSendTaskCallbackA9 implements Runnable {
    public final w_0 wx;

    public PacketSendTaskCallbackA9(w_0 var1) {
        this.wx = var1;
    }

    @Override
    public void run() {
        HV yx = this.wx.YX;
        tw0_0.rl.fk0.uQ(new WE0((byte) 0, yx.Lpt3, yx.yx0));
    }
}
