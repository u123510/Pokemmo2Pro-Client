package f;

import cn.pokemmo.ui.widget.model.property.SpritePropertyModel;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * 双向兼容垫片 - sw_1 -> SpritePropertyModel
 */
public class sw_1 extends SpritePropertyModel {
    public sw_1(String text, E90 sprite, Runnable callback) {
        super(text, sprite, callback);
    }
    public sw_1(String text, cd0_2 data, Runnable callback) {
        super(text, data, callback);
    }
}
