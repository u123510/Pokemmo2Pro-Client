package cn.pokemmo.ui.widget.model.property;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class SpacerPropertyModel extends BaseObservablePropertyModel {
    public SpacerPropertyModel() {
        super();
    }

    @Override
    public final le0_2 pl0(TJ0 tj0, int i) {
        le0_2 res = new le0_2((KG0) null, false);
        String name = this.F0;
        if (name != null) {
            res.uf(name);
        } else {
            res.uf("spacer");
        }
        return res;
    }
}
