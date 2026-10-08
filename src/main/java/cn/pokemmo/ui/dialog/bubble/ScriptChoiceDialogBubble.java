package cn.pokemmo.ui.dialog.bubble;

import f.C;
import f.CH0;
import f.E00;
import f.i70_0;
import f.jm_1;
import f.rp_0;

/**
 * 脚本多选交互气泡视窗 (Script Choice Dialog Bubble)
 * 专门用于脚本触发的多选菜单交互，拦截按键事件并在按下取消键（B键）时回传 127 取消状态。
 *
 * 原混淆类: f.C
 */
public class ScriptChoiceDialogBubble extends MessageBoxBubble {

    public ScriptChoiceDialogBubble(CH0 ch0, jm_1 jm1, String text, byte optionIndex, String... options) {
        super((byte) 0, ch0, jm1, text, null, null, (byte) 10, optionIndex, (byte) 0, 0L, options);
    }

    @Override
    public boolean nd0(i70_0 event) {
        if (E00.ZU(event.zu)) {
            int keyCode = event.finally$;
            rp_0 cancelBinding = rp_0.nK0;
            if (cancelBinding != null && cancelBinding.Ov(keyCode)) {
                this.m80((byte) 127);
                return false;
            }
        }
        return super.nd0(event);
    }
}
