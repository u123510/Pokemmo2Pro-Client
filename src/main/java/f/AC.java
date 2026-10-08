package f;

import java.time.Duration;

import cn.pokemmo.ui.window.dialog.CaptchaDialogWindow;

/**
 * 防脚本验证码弹窗 兼容垫片
 * 核心实现已迁移至 cn.pokemmo.ui.window.dialog.CaptchaDialogWindow
 */
public final class AC extends CaptchaDialogWindow {
    public AC(CH0 object, Duration duration, Duration duration2) {
        super(object, duration, duration2);
    }

}
