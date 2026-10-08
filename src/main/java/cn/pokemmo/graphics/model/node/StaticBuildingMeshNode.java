package cn.pokemmo.graphics.model.node;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.graphics.model.node.BaseSceneNodeModel;

public class StaticBuildingMeshNode extends BaseSceneNodeModel {
    public static final C8 V90;

    public StaticBuildingMeshNode(ut_0 v1) {
        super(v1, "CNYOxGameObject", 0.45f, null);
        this.eB(true);
    }

    static {
        V90 = new C8();
    }

    public final void eo0(C8 v1) {
        C8 v90 = V90;
        v90.getClass();
        v90.x = v1.x;
        v90.y = v1.y;
        v90.z = v1.z;
        v90.Vy(0.0f, 0.15f, -0.15f);
        this.ho.Y1(v90);
    }
}
