package cn.pokemmo.ui.widget.button;

import f.KG0;
import f.dz_2;

/**
 * 通用交互控制控件基类
 * 对应混淆基类: f.dz_2
 * 负责客户端滑块 (Slider)、选色器、进度条及滚动条手柄等。
 */
public abstract class BaseControl extends dz_2 {

    public BaseControl() {
        super();
    }

    public BaseControl(KG0 model) {
        super(model);
    }

    public BaseControl(KG0 model, boolean flag) {
        super(model, flag);
    }

    @SuppressWarnings("unchecked")
    public final <T extends dz_2> T asBridge() {
        return (T) (Object) this;
    }
}
