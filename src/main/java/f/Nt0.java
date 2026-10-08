package f;

import cn.pokemmo.audio.openal.OpenALDeviceMonitorTask;
import cn.pokemmo.audio.openal.OpenALAudioEngine;

/**
 * 兼容垫片 (Shim) - OpenAL 音频设备监听任务 (OpenAL Audio Device Monitor Task)
 * 原始混淆类: f.Nt0
 * 现代实现类: {@link cn.pokemmo.audio.openal.OpenALDeviceMonitorTask}
 */
public final class Nt0 extends OpenALDeviceMonitorTask {
    public Nt0(OpenALAudioEngine owner) {
        super(owner);
    }
}
