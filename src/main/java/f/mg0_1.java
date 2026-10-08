package f;

import com.studiohartman.jamepad.ControllerManager;
import cn.pokemmo.task.callback.TaskCallbackMg01;

/**
 * 异步任务回调兼容门面 (TaskCallbackMg01 Shim)
 */
public final class mg0_1 extends TaskCallbackMg01 {
    public mg0_1(ControllerManager controllerManager, vc0_1 vc0_1) {
        super(controllerManager, vc0_1);
    }
}
