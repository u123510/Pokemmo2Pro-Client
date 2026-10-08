package cn.pokemmo.task.callback;

import f.*;

/**
 * 纹理资产异步加载任务回调 (Asset Load Task Callback)
 * 对应混淆类: f.com7__0
 */
public class AssetLoadTaskCallback implements Runnable {
    public final VU a60;
    public final TH OE;

    public AssetLoadTaskCallback(TH th, VU vu) {
        this.OE = th;
        this.a60 = vu;
    }

    @Override
    public void run() {
        BU.T50.FI(this.a60, this.OE, qo_1.DL, false);
    }
}
