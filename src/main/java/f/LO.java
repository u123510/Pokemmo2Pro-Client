package f;

import cn.pokemmo.task.callback.TaskCallbackLo;

/**
 * 异步任务回调兼容门面 (TaskCallbackLo Shim)
 */
public final class LO extends TaskCallbackLo {
    public LO(BU bU) {
        super(bU);
    }
}
