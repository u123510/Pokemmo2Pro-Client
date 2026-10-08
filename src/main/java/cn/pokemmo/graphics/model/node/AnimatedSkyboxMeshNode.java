package cn.pokemmo.graphics.model.node;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.graphics.model.node.BaseSceneNodeModel;

public class AnimatedSkyboxMeshNode extends BaseSceneNodeModel {
    public static final C8 no0;

    public AnimatedSkyboxMeshNode(ut_0 v1, float f2) {
        super(v1, "CustomOverworldGameObject", f2, (u4_0) null);
        this.eB(true);
        if (!v1.AF.isEmpty()) {
            this.TU(0, true);
        }
    }

    static {
        no0 = new C8();
    }

    public void eo0(C8 v1) {
        C8 this_c8 = no0;
        v1.getClass();
        this_c8.x = v1.x;
        this_c8.y = v1.y;
        this_c8.z = v1.z;
        this.ho.Y1(this_c8.Vy(0.0f, 0.15f, -0.05f));
    }
}
