package f;

import cn.pokemmo.task.callback.TaskCallbackMh;

/**
 * 异步任务回调兼容门面 (TaskCallbackMh Shim)
 */
public final class MH extends TaskCallbackMh {
    public MH(hn_1 owner, int slot) {
        super(owner, slot);
    }
}
