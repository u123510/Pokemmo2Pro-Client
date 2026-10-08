package cn.pokemmo.graphics.model.node;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.graphics.model.node.BaseSceneNodeModel;

public class ShadowProjectorMeshNode extends BaseSceneNodeModel {
    public static final C8 PG;

    public ShadowProjectorMeshNode(ut_0 v1) {
        super(v1, "CNYTigerGameObject", 0.9f, null);
        this.eB(true);
    }

    static {
        PG = new C8();
    }

    public final void eo0(C8 v1) {
        C8 pg = PG;
        pg.getClass();
        pg.x = v1.x;
        pg.y = v1.y;
        pg.z = v1.z;
        pg.Vy(0.025f, 0.25f, -0.25f);
        this.ho.Y1(pg);
    }
}
