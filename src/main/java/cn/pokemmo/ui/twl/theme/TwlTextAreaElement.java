package cn.pokemmo.ui.twl.theme;

import f.D90;
import java.util.Objects;

/**
 * TWL 文本区域模型元素基类 (TextAreaModel.Element)
 * 原始混淆类: f.ay_0
 */
public abstract class TwlTextAreaElement {
    public final D90 style;

    // 混淆别名字段兼容
    public final D90 Ph;

    public TwlTextAreaElement(D90 style) {
        Objects.requireNonNull(style, "style");
        this.style = style;
        this.Ph = style;
    }

    public D90 getStyle() {
        return this.style;
    }

    public static void checkNotNull(Object object, String message) {
        if (object == null) {
            throw new NullPointerException(message);
        }
    }

    public static void o1(Object object, String string) {
        checkNotNull(object, string);
    }
}
