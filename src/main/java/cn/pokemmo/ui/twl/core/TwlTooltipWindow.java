package cn.pokemmo.ui.twl.core;

import cn.pokemmo.ui.widget.component.BaseFloatingOverlayComponent;
import f.Jn0;
import f.LC0;
import f.MD0;
import f.qq_0;
import f.zk0_1;

/**
 * TWL 悬浮提示框窗口 (TooltipWindow)
 * 原始混淆类: f.E20
 */
public class TwlTooltipWindow extends BaseFloatingOverlayComponent {
    public static final MD0 FADE_STATE = MD0.cB("fade");
    public int fadeInDuration;

    // 混淆字段兼容
    public int hK;

    @Override
    public String Ck() {
        return "tooltipwindow";
    }

    @Override
    public void Ib(Jn0 jn0) {
        super.Ib(jn0);
        this.fadeInDuration = ((LC0) ((Object) jn0)).H10(0, "fadeInTime");
        this.hK = this.fadeInDuration;
    }

    @Override
    public void Ll(boolean bl) {
        super.Ll(bl);
        this.M.Mk(FADE_STATE);
    }

    @Override
    public void HP(zk0_1 zk0_12) {
        int duration = this.fadeInDuration > 0 ? this.fadeInDuration : this.hK;
        int elapsed = this.M.Bd(FADE_STATE);
        if (elapsed < duration) {
            float alpha = (float) elapsed / (float) duration;
            ((qq_0) zk0_12.AK).g50 = ((qq_0) zk0_12.AK).g50.j60(1.0f, 1.0f, 1.0f, alpha);
            try {
                super.HP(zk0_12);
                ((qq_0) zk0_12.AK).kY();
            } catch (Throwable throwable) {
                ((qq_0) zk0_12.AK).kY();
                throw throwable;
            }
        } else {
            super.HP(zk0_12);
        }
    }
}
