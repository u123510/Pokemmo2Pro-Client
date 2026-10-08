package f;

import com.badlogic.gdx.controllers.desktop.JamepadControllerManager;
import cn.pokemmo.input.GamepadManager;

/**
 * 兼容垫片 (Shim) - 手柄设备检测与生命周期管理器
 * 核心实现已迁移至 cn.pokemmo.input.GamepadManager
 */
public final class eo_0 extends GamepadManager {

    public eo_0(JamepadControllerManager owner) {
        super(owner);
    }

    public eo_0(JamepadControllerManager owner, int ignored) {
        super(owner, ignored);
    }
}
