package cn.pokemmo.ui.window.admin;

import f.R90;
import f.xn0_0;
import f.y0_0;

/**
 * 管理员玩家搜索窗口 (Admin Player Search Window)
 * 用于后台管理员快速检索特定在线玩家并跳转/监控。
 *
 * 原混淆类: f.my0
 */
public class PlayerSearchWindow extends R90 {
    public final y0_0 RF0;

    public PlayerSearchWindow(xn0_0 v1) {
        super();
        ff0(4);
        uf("adminframe-nontab");
        Hy("Player Search");
        Pb0(() -> {
            if (v1 != null) {
                v1.u3(this);
            }
        });
        this.RF0 = new y0_0();
        SL(this.RF0);
    }

    @Override
    public void K8() {
        RY(300, 400);
        super.K8();
    }
}
