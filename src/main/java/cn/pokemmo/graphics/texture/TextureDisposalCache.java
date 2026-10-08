package cn.pokemmo.graphics.texture;

import com.badlogic.gdx.graphics.Texture;
import java.util.HashMap;

public class TextureDisposalCache {
    public static final TextureDisposalCache NU = new TextureDisposalCache();
    public final HashMap AF0 = new HashMap();

    public void Sq0() {
        for (Object obj : this.AF0.values()) {
            ((Texture) obj).dispose();
        }
        this.AF0.clear();
    }
}
