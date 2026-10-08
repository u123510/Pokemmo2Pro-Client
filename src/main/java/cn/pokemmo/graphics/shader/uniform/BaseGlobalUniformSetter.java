package cn.pokemmo.graphics.shader.uniform;

import f.HH0;
import f.W00;
import f.Wm0;
import f.wh_0;

/**
 * 着色器全局 Uniform 参数设置器基类
 * 
 * 职责: 标记该着色器参数为全局共享 Uniform (isGlobal = true)，为 3D 摄像机、光照与矩阵提供高效统一的注入管道。
 * 原混淆基类: f.HH0
 */
public abstract class BaseGlobalUniformSetter extends HH0 {

    public BaseGlobalUniformSetter() {
        super();
    }

    /**
     * 将 Uniform 参数绑定/写入 ShaderProgram
     */
    @Override
    public abstract void set(Wm0 shader, int location, W00 renderable, wh_0 combinedAttributes);
}
