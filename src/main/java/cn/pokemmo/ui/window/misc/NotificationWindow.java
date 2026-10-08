package cn.pokemmo.ui.window.misc;

import f.*;

/**
 * 游戏内悬浮通知弹窗
 *
 * 原混淆类: f.ox_0
 */
public class NotificationWindow extends R90 {
    public final ox_0 asBridge() { return (ox_0) (Object) this; }

    public long Gu0;
    public final Qy0 LR;
    public boolean xe;

    public NotificationWindow(Qy0 owner, String text, int timeout) {
        super();
        this.xe = false;
        if (timeout < 0) {
            timeout = 5000;
        }
        this.LR = owner;
        this.ff0(1);
        this.uf("notification");
        this.Gu0 = System.currentTimeMillis() + timeout;

        fy_2 panel = new fy_2();
        Mo0 label = new Mo0(asBridge(), text);
        label.uf("label");
        panel.WQ(panel.lo0().Kn0(label));
        panel.x40(panel.H10().Kn0(label));
        this.SL(panel);
    }

    @Override
    public final boolean nd0(i70_0 event) {
        int type = event.zu;
        if (E00.C10(type)) {
            int button = event.nA0;
            if ((button == 1 || button == 0) && type == 3) {
                this.Gu0 = System.currentTimeMillis();
            }
        }
        return super.nd0(event);
    }

    @Override
    public final void HP(zk0_1 window) {
        if (this.xe) {
            if (System.currentTimeMillis() >= this.Gu0 + 300L) {
                lg_0.k.lPT5(new yp_0(asBridge()));
            }
        } else if (System.currentTimeMillis() >= this.Gu0) {
            this.xe = true;
            int duration = 250;
            N1 fade = this.z70;
            if (fade == null) {
                fade = new N1(new xe0_0(this.M, R90.gC), gn_0.WHITE);
                this.z70 = fade;
                if (!this.eE) {
                    fade.iG0(0);
                }
            }
            if (!this.eE) {
                fade.iG0(0);
            }
            fade.iG0(duration);
        }
        super.HP(window);
    }

    @Override
    public final void AD(boolean visible) {
        super.AD(visible);
        if (!visible) {
            lg_0.k.lPT5(new yp_0(asBridge()));
        }
    }
}
