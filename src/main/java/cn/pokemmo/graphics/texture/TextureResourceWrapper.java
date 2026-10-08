package cn.pokemmo.graphics.texture;

import com.badlogic.gdx.graphics.Texture;
import f.Dn0;
import f.eb0_1;
import f.qq_0;
import java.util.ArrayList;

public class TextureResourceWrapper {
    public final Texture Sd;
    public final Dn0 nx;
    public final qq_0 gd;
    public final int S90;
    public final int OW;
    public ArrayList xA;

    public TextureResourceWrapper(qq_0 v1, Dn0 v2, String v3) {
        this.gd = v1;
        this.nx = v2;
        Texture v1_tex = new Texture(v2);
        this.Sd = v1_tex;
        if (!"nearest".equalsIgnoreCase(v3)) {
            v1_tex.setFilter(eb0_1.jc0, eb0_1.jc0);
        }
        int i2 = v1_tex.getWidth();
        this.S90 = i2;
        this.OW = v1_tex.getHeight();
        if (this.OW <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("size <= 0");
        }
        v1_tex.getWidth();
        v1_tex.getHeight();
    }
}
