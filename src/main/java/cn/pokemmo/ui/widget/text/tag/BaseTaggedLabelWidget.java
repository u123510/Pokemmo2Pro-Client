package cn.pokemmo.ui.widget.text.tag;

import f.pa0_0;
import f.qj_2;

/**
 * BaseTaggedLabelWidget - UI 动态富文本与数值排版标签抽象基类
 * 扩展动态文本标签，支持色彩标签、前缀标识、动态数值格式化与交互高亮。
 */
public abstract class BaseTaggedLabelWidget extends qj_2 {

    public BaseTaggedLabelWidget() {
        super();
    }

    public BaseTaggedLabelWidget(String text) {
        super(text);
    }

    public BaseTaggedLabelWidget(int width, int height) {
        super(width, height);
    }

    public BaseTaggedLabelWidget(String text, int width, int height) {
        super(text, width, height);
    }

    public BaseTaggedLabelWidget(String text, pa0_0 pa0) {
        super(text, pa0);
    }
}
