package f;

import cn.pokemmo.ui.widget.model.property.CompositePropertyModel;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * 双向兼容垫片 - EP -> CompositePropertyModel
 */
public class EP extends CompositePropertyModel {
    public EP() {
        super();
    }
    public EP(String name) {
        super(name);
    }
}
