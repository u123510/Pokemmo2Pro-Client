package cn.pokemmo.graphics;

/**
 * 纹理贴图环绕与裁剪模式 (Texture Wrap Mode)
 *
 * 原混淆类: f.q8_0
 */
public enum TextureWrapMode {
    Eb,
    CLAMP,
    ai0,
    S;

    public static final TextureWrapMode[] hw0 = values();

    public f.q8_0 asBridge() {
        return f.q8_0.valueOf(name());
    }
}
