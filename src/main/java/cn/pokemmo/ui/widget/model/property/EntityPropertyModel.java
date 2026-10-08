package cn.pokemmo.ui.widget.model.property;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class EntityPropertyModel extends BaseObservablePropertyModel {
    public gt_0 UI;
    public cg_0 Sv;

    public EntityPropertyModel(dz_0 v1) {
        super("");
        this.Sv = v1;
    }

    public final le0_2 pl0(TJ0 v1, int i2) {
        if (this.Sv == null) {
            cg_0 v3 = new cg_0(null, new wn0_0());
            this.Sv = v3;
            gt_0 v2 = this.UI;
            if (v2 != null) {
                v3.em = (gt_0[]) a7_0.gE(v3.em, v2, gt_0.class);
            }
            this.Sv.aO(null);
        }
        cg_0 v4 = this.Sv;
        String v3 = this.F0;
        if (v3 != null) {
            v4.uf(v3);
        } else {
            v4.uf("editfield");
        }
        return this.Sv;
    }
}
