package cn.pokemmo.ui.dialog.component;

import cn.pokemmo.ui.dialog.bubble.MessageBoxBubble;
import f.E00;
import f.Q7;
import f.fy_2;
import f.i70_0;
import f.ph_0;

/**
 * 对话气泡背景弹出布局面板 (Bubble Popup Layout Panel)
 * 继承自 DialogLayout (fy_2)，监听滚轮与基础输入事件推进对话。
 *
 * 原混淆类: f.ph_0
 */
public class BubblePopupLayout extends fy_2 {
    public final ph_0 asBridge() {
        return (ph_0) (Object) this;
    }

    public final MessageBoxBubble CD0;

    public BubblePopupLayout(MessageBoxBubble owner) {
        this.CD0 = owner;
    }

    @Override
    public boolean nd0(i70_0 event) {
        int eventType = event.zu;
        if (E00.C10(eventType)) {
            if (eventType == 5 && this.CD0 != null) {
                this.CD0.zn0();
            }
            return event.zu != 8;
        }
        return super.nd0(event);
    }
}
