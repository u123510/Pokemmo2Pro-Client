package cn.pokemmo.graphics.model.node;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.graphics.model.node.BaseSceneNodeModel;

public class DynamicTerrainMeshNode extends BaseSceneNodeModel {
    public static final C8 D9;

    public DynamicTerrainMeshNode(ut_0 v1) {
        super(v1, "CNYRabbitGameObject", 0.3f, null);
        this.eB(true);
    }

    static {
        D9 = new C8();
    }

    public final void eo0(C8 v1) {
        C8 d9 = D9;
        d9.getClass();
        d9.x = v1.x;
        d9.y = v1.y;
        d9.z = v1.z;
        d9.Vy(0.0f, 0.1f, -0.1f);
        this.ho.Y1(d9);
    }
}
