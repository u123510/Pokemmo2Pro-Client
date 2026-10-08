package f;

import cn.pokemmo.graphics.gl.GlShaderProgram;
import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.lt_1
 * 核心逻辑已迁移至 cn.pokemmo.graphics.gl.GlShaderProgram
 */
public class lt_1 extends GlShaderProgram {

    public lt_1(String v1, String v2) {
        super(v1, v2);
    }

    public lt_1(Dn0 v1, Dn0 v2) {
        super(v1, v2);
    }

    public static void lpt1(du_2 v0, lt_1 v1) {
        GlShaderProgram.lpt1(v0, v1);
    }

}
