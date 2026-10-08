package cn.pokemmo.graphics.gl;

import f.fy0_0;
import java.nio.ShortBuffer;

/**
 * OpenGL 索引缓冲区数据接口
 * 原始接口: f.lk0_2
 */
public interface IndexData extends fy0_0 {
    public int Id();

    public int Kd();

    public void Gy0(int var1, short[] var2);

    public ShortBuffer st0(boolean var1);

    public void bind();

    public void qe();
}
