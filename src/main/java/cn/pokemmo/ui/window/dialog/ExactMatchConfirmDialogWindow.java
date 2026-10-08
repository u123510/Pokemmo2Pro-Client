package cn.pokemmo.ui.window.dialog;

import f.*;

/**
 * 文本精确匹配确认弹窗
 *
 * 原混淆类: f.oz_2
 */
public class ExactMatchConfirmDialogWindow extends InputConfirmDialogWindow {

    public ExactMatchConfirmDialogWindow(String name, String value, lpt5__1 listener) {
        super(name, value.length(), listener);
        this.Jz.pw0(false);
        this.Pw.Ii(index -> this.GT(value, index));
    }

    public final void GT(String value, int index) {
        this.Jz.pw0(this.Pw.dI0.toString().equalsIgnoreCase(value));
    }
}
