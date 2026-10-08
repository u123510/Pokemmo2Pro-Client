package cn.pokemmo.input;

import com.badlogic.gdx.controllers.desktop.JamepadControllerManager;
import f.*;

/**
 * 手柄设备检测与生命周期管理器 (Gamepad Controller Manager)
 * 包装 Jamepad 底层手柄控制器管理器，提供多手柄接入与拔出的线程安全锁保护。
 *
 * 原混淆类: f.eo_0
 */
public class GamepadManager extends ca0_1 {
    public final JamepadControllerManager Vl;

    public GamepadManager(JamepadControllerManager owner) {
        super(owner);
        this.Vl = owner;
    }

    public GamepadManager(JamepadControllerManager owner, int ignored) {
        this(owner);
    }

    @Override
    public void COm6(o3_0 value) {
        es_1 lock = this.Vl.getControllers();
        synchronized (lock) {
            this.Vl.getControllers().Ue0(value);
        }
        super.COm6(value);
    }

    @Override
    public void Pr0(LH0 value) {
        es_1 lock = this.Vl.getControllers();
        synchronized (lock) {
            this.Vl.getControllers().sj0(value, true);
        }
        super.Pr0(value);
    }
}
