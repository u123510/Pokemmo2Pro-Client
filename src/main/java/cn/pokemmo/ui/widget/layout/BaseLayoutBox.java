package cn.pokemmo.ui.widget.layout;

import f.fy_2;

/**
 * UI 布局容器基类
 * 对应混淆基类: f.fy_2
 * 负责客户端各类视图面板的网格对齐、流式排列与层级排版。
 */
public abstract class BaseLayoutBox extends fy_2 {

    public BaseLayoutBox() {
        super();
    }

    @SuppressWarnings("unchecked")
    public final <T extends fy_2> T asBridge() {
        return (T) (Object) this;
    }
}
