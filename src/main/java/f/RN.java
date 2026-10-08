package f;

import cn.pokemmo.task.callback.TaskCallbackRn;

/**
 * 异步任务回调兼容门面 (TaskCallbackRn Shim)
 */
public final class RN extends TaskCallbackRn {
    public RN(HX effect, byte channel, BU controller) {
        super(effect, channel, controller);
    }
}
