package cn.pokemmo.task.callback;

import cn.pokemmo.audio.openal.OpenALDeviceMonitorTask;
import cn.pokemmo.audio.openal.OpenALAudioEngine;

/**
 * @deprecated 历史误命名类。f.Nt0 实际语义为 OpenAL 音频输出设备热插拔监听守护任务，属于音频子系统。
 * 现代规范实现请使用 {@link OpenALDeviceMonitorTask}，向下兼容垫片请使用 {@link f.Nt0}。
 */
@Deprecated
public class TaskCallbackNt0Capital extends OpenALDeviceMonitorTask {
    public TaskCallbackNt0Capital(OpenALAudioEngine owner) {
        super(owner);
    }
}
