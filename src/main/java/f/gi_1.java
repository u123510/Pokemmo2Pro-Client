package f;

import cn.pokemmo.ui.widget.panel.scroll.ChatScrollablePanel;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * 双向兼容垫片 - gi_1 -> ChatScrollablePanel
 */
public class gi_1 extends ChatScrollablePanel {
    public gi_1(mc0_1 v1, byte i2, tu_2 v3) {
        super(v1, i2, v3);
    }
    public gi_1(mc0_1 v1, byte i2, tu_2 v3, boolean i4, boolean i5, String v6) {
        super(v1, i2, v3, i4, i5, v6);
    }
}
