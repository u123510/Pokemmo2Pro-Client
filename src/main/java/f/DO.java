package f;

import cn.pokemmo.task.callback.TaskCallbackDo;

/**
 * 异步任务回调兼容门面 (TaskCallbackDo Shim)
 */
public final class DO extends TaskCallbackDo {
    public DO(H20 h20, boolean bl) {
        super(h20, bl);
    }
}
