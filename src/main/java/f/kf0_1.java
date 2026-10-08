package f;

import cn.pokemmo.ui.widget.model.property.IconPropertyModel;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * 双向兼容垫片 - kf0_1 -> IconPropertyModel
 */
public class kf0_1 extends IconPropertyModel {
    public kf0_1(String str, Texture texture, Runnable runnable) {
        super(str, texture, runnable);
    }
    public kf0_1(String str, AG0 aG0, int i, int i2, int i3, Runnable runnable) {
        super(str, aG0, i, i2, i3, runnable);
    }
    public kf0_1(String str, Wr wr, int i, int i2, int i3, int i4, Runnable runnable, boolean z) {
        super(str, wr, i, i2, i3, i4, runnable, z);
    }
}
