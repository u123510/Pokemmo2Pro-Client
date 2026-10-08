package cn.pokemmo.ui.widget.model.property;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class SpritePropertyModel extends BaseObservablePropertyModel {
    public final Runnable dB0;
    public final int I7;
    public final E90 yD0;
    public final cd0_2 F30;

    public SpritePropertyModel(String text, E90 sprite, Runnable callback) {
        super(text);
        this.yD0 = sprite;
        this.F30 = null;
        this.I7 = tw0_0.kz0() ? 2 : 1;
        this.dB0 = callback;
    }

    public SpritePropertyModel(String text, cd0_2 data, Runnable callback) {
        super(text);
        this.yD0 = null;
        this.F30 = data;
        this.I7 = tw0_0.kz0() ? 2 : 1;
        this.dB0 = callback;
    }

    @Override
    public final le0_2 pl0(TJ0 context, int index) {
        rh0_0 result = null;
        if (this.yD0 != null) {
            result = new rh0_0(this.ln, this.I7, this.yD0);
        } else if (this.F30 != null) {
            result = new rh0_0(this.ln, this.I7, this.F30);
        }
        if (result == null) {
            throw new nf_1("Missing player info data.");
        }
        String style = this.F0 != null ? this.F0 : "headshot-menu-button";
        result.uf(style);
        result.RR(context.Br);
        if (this.dB0 != null) {
            result.RR(this.dB0);
        }
        return result;
    }
}
