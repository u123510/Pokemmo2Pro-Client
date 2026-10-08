package f;

import cn.pokemmo.ui.widget.panel.scroll.PagedScrollablePanel;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * 双向兼容垫片 - zg0_2 -> PagedScrollablePanel
 */
public class zg0_2 extends PagedScrollablePanel {
    public zg0_2(HV hv) {
        super(hv);
    }
    public zg0_2(K5 k5) {
        super(k5);
    }
}
