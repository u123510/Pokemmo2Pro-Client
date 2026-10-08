package cn.pokemmo.task.callback;

import f.*;

/**
 * 训练家动作发包与状态复位回调 (Trainer Action Send Task Callback)
 * 对应混淆类: f.T50
 */
public class TrainerActionSendTaskCallback implements Runnable {
    public final pe0_2 owner;
    public final pe0_2 Ce;

    public TrainerActionSendTaskCallback(pe0_2 owner) {
        this.owner = owner;
        this.Ce = owner;
    }

    @Override
    public void run() {
        tw0_0.rl.fk0.uQ(new T30(this.Ce.PY.KZ.ug0));
        this.Ce.Ub = 0;
        this.Ce.rr0();
    }
}
