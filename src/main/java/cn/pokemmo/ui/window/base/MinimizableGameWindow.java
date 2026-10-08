package cn.pokemmo.ui.window.base;

import f.nx_2;

/**
 * 可折叠/最小化的游戏窗口基类 (Minimizable Game Window)
 * 支持窗口最小化收起、悬浮小部件以及还原展开逻辑。
 *
 * 原混淆基类: f.nx_2
 */
public abstract class MinimizableGameWindow extends nx_2 {

    public MinimizableGameWindow(String theme) {
        super(theme);
    }

    public MinimizableGameWindow(String theme, boolean enabled) {
        super(theme, enabled);
    }
}
