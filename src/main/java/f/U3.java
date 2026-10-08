package f;

import cn.pokemmo.task.callback.TaskCallbackU3;

/**
 * 异步任务回调兼容门面 (TaskCallbackU3 Shim)
 */
public final class U3 extends TaskCallbackU3 {
    public U3(BU bU) {
        super(bU);
    }
}
