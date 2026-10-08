package cn.pokemmo.graphics.render;

import f.ui_1;

/**
 * 四元浮点数坐标矩阵渲染接口
 */
public interface QuadFloatRenderer {
    void render(ui_1 batch, float x, float y, float width, float height);

    default void Xd(ui_1 var1, float var2, float var3, float var4, float var5) {
        render(var1, var2, var3, var4, var5);
    }
}
