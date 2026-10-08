package cn.pokemmo.ui.widget.button;

import f.KG0;
import f.cn_0;

/**
 * 按钮与点击交互控件基类
 * 对应混淆基类: f.cn_0
 * 负责客户端各类交互动作按钮、图标按钮、单选/复选框等。
 */
public abstract class BaseButton extends cn_0 {

    public BaseButton() {
        super();
    }

    public BaseButton(String text) {
        super(text);
    }

    public BaseButton(KG0 model) {
        super(model);
    }

    public BaseButton(KG0 model, int flags) {
        super(model, flags);
    }

    @SuppressWarnings("unchecked")
    public final <T extends cn_0> T asBridge() {
        return (T) (Object) this;
    }
}
