package f;

import cn.pokemmo.task.callback.TaskCallbackZ80;

/**
 * 异步任务回调兼容门面 (TaskCallbackZ80 Shim)
 */
public final class Z80 extends TaskCallbackZ80 {
    public Z80(EP ep, TJ0 tj0, int i) {
        super(ep, tj0, i);
    }
}
