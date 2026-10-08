package f;

import cn.pokemmo.graphics.TextureWrapMode;

/**
 * 兼容垫片 (Shim) - 纹理贴图环绕与裁剪模式
 * 核心实现已迁移至 cn.pokemmo.graphics.TextureWrapMode
 */
public enum q8_0 {
    Eb,
    CLAMP,
    ai0,
    S;

    public static final q8_0[] hw0 = values();

    public TextureWrapMode asModern() {
        return TextureWrapMode.valueOf(name());
    }
}
