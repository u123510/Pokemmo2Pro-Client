package cn.pokemmo.task.callback;

import f.*;

/**
 * 玩家实体动作数据包发送回调 (Player Packet Send Task Callback)
 * 对应混淆类: f.rw_1
 */
public class PlayerPacketSendTaskCallback implements Runnable {
    public final TaskCallbackX7 jn;

    public PlayerPacketSendTaskCallback(TaskCallbackX7 x7) {
        this.jn = x7;
    }

    @Override
    public void run() {
        CH0 ch0 = this.jn.ld.YX;
        tw0_0.rl.fk0.uQ(new yp_1(ch0));
    }
}
