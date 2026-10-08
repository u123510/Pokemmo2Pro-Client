package cn.pokemmo.ui.dialog.component;

import cn.pokemmo.ui.dialog.bubble.MessageBoxBubble;
import f.E00;
import f.Nr0;
import f.ZJ;
import f.i70_0;

/**
 * 带逐字播放/打字机效果的对话文本标签 (Bubble Typewriter Text Label)
 * 继承自富文本动画标签 ZJ，支持鼠标滚轮滚动快速推进/跳过当前文本行。
 *
 * 原混淆类: f.Nr0
 */
public class BubbleTypewriterLabel extends ZJ {
    public final Nr0 asBridge() {
        return (Nr0) (Object) this;
    }

    public final MessageBoxBubble PB0;

    public BubbleTypewriterLabel(MessageBoxBubble owner, int value) {
        super(500, value);
        this.PB0 = owner;
    }

    @Override
    public boolean nd0(i70_0 event) {
        int code = event.zu;
        if (E00.C10(code) && code == 5) {
            if (this.PB0 != null) {
                this.PB0.zn0();
            }
            return true;
        }
        return super.nd0(event);
    }
}
