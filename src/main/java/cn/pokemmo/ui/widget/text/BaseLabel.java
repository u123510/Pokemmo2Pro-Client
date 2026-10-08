package cn.pokemmo.ui.widget.text;

import f.KG0;
import f.tq_0;
import f.xe_1;

/**
 * 文本标签与信息展示控件基类
 * 对应混淆基类: f.xe_1
 * 负责客户端各类静态标签、富文本、数值展示及格式化信息条目。
 */
public abstract class BaseLabel extends xe_1 {

    public BaseLabel() {
        super();
    }

    public BaseLabel(String text) {
        super(text);
    }

    public BaseLabel(KG0 model) {
        super(model);
    }

    public BaseLabel(KG0 model, int flags) {
        super(model, flags);
    }

    public BaseLabel(tq_0 model) {
        super(model);
    }

    public BaseLabel(KG0 model, boolean flag, tq_0 tq) {
        super(model, flag, tq);
    }

    @SuppressWarnings("unchecked")
    public final <T extends xe_1> T asBridge() {
        return (T) (Object) this;
    }
}
