package cn.pokemmo.graphics.texture;

import com.badlogic.gdx.graphics.Texture;
import f.E60;
import f.hd0_2;

public class SynchronizedTextureLoader implements E60 {
    public final hd0_2 YH;

    public SynchronizedTextureLoader(hd0_2 v1) {
        super();
        this.YH = v1;
    }

    public Texture De0(String v1) {
        synchronized (this.YH) {
            return (Texture) this.YH.Og0(Texture.class, v1);
        }
    }
}
