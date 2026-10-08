package f;

import cn.pokemmo.graphics.gl.GLFrameBufferArray;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.utils.BufferUtils;
import java.nio.FloatBuffer;
import org.lwjgl.glfw.GLFW;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.lq_2
 * 核心逻辑已迁移至 cn.pokemmo.graphics.gl.GLFrameBufferArray
 */
public abstract class lq_2 extends GLFrameBufferArray {

    public lq_2(int i) {
        super(i);
    }

    public lq_2(int i, int i2) {
        super(i, i2);
    }

}
