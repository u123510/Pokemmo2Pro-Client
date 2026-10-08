package cn.pokemmo.graphics.texture;

import com.badlogic.gdx.graphics.Texture;
import f.E60;
import f.VE;
import f.a00_0;
import f.eb0_1;
import f.zv_1;

public class TextureParameterLoader implements E60 {
    public final eb0_1 ET;
    public final eb0_1 Pc0;
    public final a00_0 wI0;
    public final a00_0 N5;
    public final boolean Xs0;

    public TextureParameterLoader() {
        this.Pc0 = eb0_1.jc0;
        this.ET = eb0_1.jc0;
        this.N5 = a00_0.xm0;
        this.wI0 = a00_0.xm0;
        this.Xs0 = false;
    }

    public TextureParameterLoader(eb0_1 minFilter, eb0_1 magFilter, a00_0 uWrap,
                                  a00_0 vWrap, boolean useMipMaps) {
        this.ET = minFilter;
        this.Pc0 = magFilter;
        this.wI0 = uWrap;
        this.N5 = vWrap;
        this.Xs0 = useMipMaps;
    }

    @Override
    public Texture De0(String path) {
        Texture texture = new Texture(new VE(path, zv_1.tt0), this.Xs0);
        texture.setFilter(this.ET, this.Pc0);
        texture.setWrap(this.wI0, this.N5);
        return texture;
    }
}
