package f;

import cn.pokemmo.ui.widget.panel.scroll.InventoryScrollablePanel;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * 双向兼容垫片 - l3_0 -> InventoryScrollablePanel
 */
public class l3_0 extends InventoryScrollablePanel {
    public l3_0(q10_0 type, short id, o60_0 item, qu_2 owner) {
        super(type, id, item, owner);
    }
}
