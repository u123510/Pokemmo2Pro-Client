package cn.pokemmo.graphics.model.node;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.graphics.model.node.BaseSceneNodeModel;

import com.badlogic.gdx.math.Matrix4;

public class TranslucentWaterMeshNode extends BaseSceneNodeModel {
    public static final C8 u00 = new C8();

    public TranslucentWaterMeshNode(ut_0 resources, float opacity) {
        super(resources, "DevGameObject", opacity, null);
        this.eB(true);
        if (!this.HZ.isEmpty()) {
            this.TU(0, true);
        }
    }

    @Override
    public final void eo0(C8 value) {
        Matrix4 matrix = this.ho;
        C8 offset = u00;
        float x = value.x;
        float y = value.y;
        float z = value.z;
        offset.x = x;
        offset.y = y;
        offset.z = z;
        matrix.Y1(offset.Vy(0.0F, 0.150000006F, -0.0500000007F));
    }
}
