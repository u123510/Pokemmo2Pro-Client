package f;

import cn.pokemmo.ui.twl.core.TwlPopupWindow;

/**
 * 弹出窗口与主渲染循环兼容垫片
 * @see cn.pokemmo.ui.twl.core.TwlPopupWindow
 */
public final class bl0_2 extends TwlPopupWindow {
    public final ga0_0 l40;

    public bl0_2(ga0_0 renderer, Qy0 ui, qq_0 input, Bg0 game, jv_1 controller, PC0 platform, ok_0 layout) {
        super(renderer, ui, input, game, controller, platform, layout);
        this.l40 = renderer;
    }
}
