package f;

import cn.pokemmo.ui.widget.model.property.TextPropertyModel;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * 双向兼容垫片 - at_0 -> TextPropertyModel
 */
public class at_0 extends TextPropertyModel {
    public at_0() {
        super();
    }
    public at_0(String text) {
        super(text);
    }
    public at_0(String text, Runnable callback) {
        super(text, callback);
    }
}
