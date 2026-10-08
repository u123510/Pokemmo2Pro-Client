package cn.pokemmo.audio;

import f.fy0_0;

/**
 * 游戏音效控制接口
 * 原始接口: f.AC0
 */
public interface SoundEffect extends fy0_0 {
    public long FB0();

    public long zK0(float var1, float var2, float var3);

    public void stop();

    public void wy0();

    public void lb0(long var1, boolean var3);
}
