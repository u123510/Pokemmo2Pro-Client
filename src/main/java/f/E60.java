package f;

import cn.pokemmo.graphics.texture.TexturePathResolver;
import com.badlogic.gdx.graphics.Texture;

/**
 * 纹理路径解析门面
 * @see cn.pokemmo.graphics.texture.TexturePathResolver
 */
public interface E60 extends TexturePathResolver {
    @Override
    Texture De0(String var1);

    @Override
    default Texture resolveTexture(String path) {
        return De0(path);
    }
}
