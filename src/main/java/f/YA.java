package f;

import cn.pokemmo.graphics.render.QuadFloatRenderer;
import f.ui_1;

/**
 * 坐标渲染器门面
 * @see cn.pokemmo.graphics.render.QuadFloatRenderer
 */
public interface YA extends QuadFloatRenderer {
    @Override
    void Xd(ui_1 var1, float var2, float var3, float var4, float var5);

    @Override
    default void render(ui_1 batch, float x, float y, float width, float height) {
        Xd(batch, x, y, width, height);
    }
}
