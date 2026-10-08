package cn.pokemmo.ui.widget.list;

import f.cg_0;
import f.KG0;
import f.wn0_0;

/**
 * BaseScrollListWidget - 交互式列表滚动面板与项选择器抽象基类
 * 扩展通用交互列表组件，提供项高亮、键盘焦点导航、动态数据绑定与视口裁剪。
 */
public abstract class BaseScrollListWidget extends cg_0 {

    public BaseScrollListWidget() {
        super();
    }

    public BaseScrollListWidget(KG0 var1) {
        super(var1);
    }

    public BaseScrollListWidget(KG0 var1, wn0_0 var2) {
        super(var1, var2);
    }
}
