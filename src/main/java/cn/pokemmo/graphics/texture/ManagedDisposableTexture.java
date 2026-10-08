package cn.pokemmo.graphics.texture;

import com.badlogic.gdx.graphics.Texture;
import f.S60;
import f.ZO;

public class ManagedDisposableTexture extends Texture {
    public final ZO db;

    public ManagedDisposableTexture(ZO zo, S60 s60) {
        super(s60);
        this.db = zo;
    }

    @Override
    public void dispose() {
        super.dispose();
        this.db.WD0.dispose();
    }
}
