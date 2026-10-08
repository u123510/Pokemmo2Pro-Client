package cn.pokemmo.graphics.texture;

import com.badlogic.gdx.graphics.Texture;
import f.LPT6_;
import f.fm0_0;
import f.hd0_2;

public class CachedTextureRegionProvider implements fm0_0 {
    public final hd0_2 uI0;

    public CachedTextureRegionProvider(hd0_2 cache) {
        this.uI0 = cache;
    }

    @Override
    public LPT6_ Qq0(String name) {
        Texture texture;
        synchronized (this.uI0) {
            texture = (Texture) this.uI0.Og0(Texture.class, name);
        }
        return new LPT6_(texture);
    }
}
