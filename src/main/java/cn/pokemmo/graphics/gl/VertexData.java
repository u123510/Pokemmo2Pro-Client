package cn.pokemmo.graphics.gl;

import f.fy0_0;
import f.lt_1;
import f.sa_0;
import java.nio.FloatBuffer;

/**
 * 顶点数据集合接口
 * 原始接口: f.kj_0
 */
public interface VertexData extends fy0_0 {
    public int mB0();

    public int Ew0();

    public sa_0 JP();

    public void ce0(int var1, int var2, float[] var3);

    public FloatBuffer st0(boolean var1);

    public void Fn0(lt_1 var1, int[] var2);

    public void yK0(lt_1 var1, int[] var2);
}
