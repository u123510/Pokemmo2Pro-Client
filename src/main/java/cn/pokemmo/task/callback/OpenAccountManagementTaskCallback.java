package cn.pokemmo.task.callback;

import f.e30_0;
import f.lg_0;

/**
 * 打开账户管理中心 URL 任务回调 (Open Account Management Task Callback)
 * 对应混淆类: f.con__4
 */
public class OpenAccountManagementTaskCallback implements Runnable {
    public final e30_0 Ug0;

    public OpenAccountManagementTaskCallback(e30_0 v1) {
        this.Ug0 = v1;
    }

    @Override
    public void run() {
        lg_0.lv0.Lf("https://manage.pokemmo.com/accounts/" + this.Ug0.import$);
    }
}
