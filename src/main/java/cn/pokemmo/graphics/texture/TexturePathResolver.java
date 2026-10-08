package cn.pokemmo.graphics.texture;

import com.badlogic.gdx.graphics.Texture;

/**
 * 纹理文件路径动态解析接口
 */
public interface TexturePathResolver {
    Texture resolveTexture(String path);

    default Texture De0(String path) {
        return resolveTexture(path);
    }
}
