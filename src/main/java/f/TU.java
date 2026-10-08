package f;

import cn.pokemmo.ui.twl.core.TwlKeyStroke;

/**
 * 键盘快捷键组合兼容垫片
 * @see cn.pokemmo.ui.twl.core.TwlKeyStroke
 */
public final class TU extends TwlKeyStroke {
    public TU(int modifiers, int keyCode, char keyChar, String action) {
        super(modifiers, keyCode, keyChar, action);
    }

    public static TU R3(String stroke, String action) {
        return parse(stroke, action);
    }
}
