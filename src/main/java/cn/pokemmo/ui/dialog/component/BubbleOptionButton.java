package cn.pokemmo.ui.dialog.component;

import f.E00;
import f.fg0_1;
import f.i70_0;
import f.xe_1;

/**
 * 气泡对话框选项专用按钮 (Bubble Option Button)
 * 继承自通用按钮组件 xe_1，定制主题并放行 Enter/Space 键事件以供对话框统一调度。
 *
 * 原混淆类: f.fg0_1
 */
public class BubbleOptionButton extends xe_1 {
    public final fg0_1 asBridge() {
        return (fg0_1) (Object) this;
    }

    public BubbleOptionButton(String text) {
        super(text);
        uf("button");
    }

    public BubbleOptionButton() {
        super();
        uf("button");
    }

    @Override
    public boolean nd0(i70_0 event) {
        if (E00.ZU(event.zu)) {
            int key = event.finally$;
            if (key == 66 || key == 62) {
                return false;
            }
        }
        return super.nd0(event);
    }
}
