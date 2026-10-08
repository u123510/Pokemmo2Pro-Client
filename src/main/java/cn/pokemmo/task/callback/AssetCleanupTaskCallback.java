package cn.pokemmo.task.callback;

import f.BU;

/**
 * 材质资产清理与重载回调 (Asset Cleanup Task Callback)
 * 对应混淆类: f.Cc
 */
public class AssetCleanupTaskCallback implements Runnable {

    @Override
    public void run() {
        BU.T50.G20(false, null);
    }
}
