package cn.pokemmo.audio.openal;

import java.util.Arrays;
import org.lwjgl.openal.ALC10;

/**
 * OpenAL 音频输出设备热插拔监听守护任务 (OpenAL Audio Device Monitor Task)
 * <p>
 * 对应原始混淆类: f.Nt0
 * 职责:
 * 循环轮询检测系统默认 OpenAL 音频设备状态与可用设备列表，当耳机或扬声器等设备发生插拔变动时触发音频重载。
 */
public class OpenALDeviceMonitorTask implements Runnable {
    public String[] Mj0;
    public final OpenALAudioEngine kL0;

    public OpenALDeviceMonitorTask(OpenALAudioEngine owner) {
        this.kL0 = owner;
        this.Mj0 = new String[0];
    }

    @Override
    public final void run() {
        while (true) {
            if (ALC10.alcGetInteger(this.kL0.gl0, 787) == 0) {
                this.kL0.IH0(null, false);
                continue;
            }

            if (this.kL0.ll0 != null) {
                if (Arrays.asList(this.kL0.Rr0()).contains(this.kL0.ll0)) {
                    if (!this.kL0.ll0.equals(ALC10.alcGetString(this.kL0.gl0, 4115))) {
                        this.kL0.IH0(this.kL0.ll0, true);
                    }
                } else if (this.kL0.ll0.equals(ALC10.alcGetString(this.kL0.gl0, 4115))) {
                    this.kL0.IH0(null, false);
                }
            } else {
                String[] values = this.kL0.Rr0();
                if (!Arrays.equals(values, this.Mj0)) {
                    this.kL0.IH0(null, true);
                }
                this.Mj0 = values;
            }

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException ignored) {
                return;
            }
        }
    }
}
