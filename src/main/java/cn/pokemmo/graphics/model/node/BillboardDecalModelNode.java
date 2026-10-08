package cn.pokemmo.graphics.model.node;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.graphics.model.node.BaseSceneNodeModel;

public class BillboardDecalModelNode extends BaseSceneNodeModel {
    public static final C8 ct0;

    public BillboardDecalModelNode(ut_0 v1) {
        super(v1, "CNYDragon", 32.0f, null);
        this.eB(true);
    }

    static {
        ct0 = new C8();
    }

    public final boolean VP() {
        return false;
    }

    public final void eo0(C8 v1) {
        C8 ct = ct0;
        ct.getClass();
        ct.x = v1.x;
        ct.y = v1.y;
        ct.z = v1.z;
        ct.Vy(0.025f, 0.25f, -0.1f);
        this.ho.Y1(ct);
    }
}
