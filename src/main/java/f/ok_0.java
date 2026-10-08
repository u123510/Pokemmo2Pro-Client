package f;

import cn.pokemmo.ui.widget.component.FilterableItemListBox;
import com.badlogic.gdx.graphics.Color;

public final class ok_0 extends FilterableItemListBox {
    public static final ok_0 kX;
    public static final Color OP;
    public static final Color tR;
    public static final Color WB;

    public ok_0() {
        super();
    }

    static {

        kX = new ok_0();
        OP = new Color(0.0f, 0.0f, 1.0f, 1.0f);
        tR = new Color(1.0f, 0.0f, 0.0f, 1.0f);
        WB = new Color(0.0f, 1.0f, 0.0f, 1.0f);
        h20_0.RV = kX;
    
        FilterableItemListBox.kX = kX;
        FilterableItemListBox.OP = OP;
        FilterableItemListBox.tR = tR;
        FilterableItemListBox.WB = WB;
    }
}
