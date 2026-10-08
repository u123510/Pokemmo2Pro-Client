package cn.pokemmo.graphics.shader;

import f.Tv0;
import f.W00;
import f.fy0_0;
import f.qi_1;

/**
 * 3D模型与批处理着色器接口
 * 原始接口: f.o9_0
 */
public interface ModelShader extends fy0_0 {
    public void init();

    public boolean canRender(W00 var1);

    public void begin(Tv0 var1, qi_1 var2);

    public void render(W00 var1);

    public void end();
}
