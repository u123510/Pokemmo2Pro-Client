package f;

import cn.pokemmo.ui.app.ApplicationLifecycleManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.HashMap;
import com.badlogic.gdx.utils.BufferUtils;
import org.lwjgl.glfw.GLFW;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.PA
 * 核心逻辑已迁移至 cn.pokemmo.ui.app.ApplicationLifecycleManager
 */
public abstract class PA extends ApplicationLifecycleManager {

    public PA() {
        super();
    }

    public PA(cg_1 config) {
        super(config);
    }

}
