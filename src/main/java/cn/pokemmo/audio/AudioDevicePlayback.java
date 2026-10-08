package cn.pokemmo.audio;

import f.fy0_0;

/**
 * 原生音频设备回放接口
 * 原始接口: f.if_1
 */
public interface AudioDevicePlayback extends fy0_0 {
    public void GW(int var1, short[] var2);

    public void wy0();

    public void resume();
}
