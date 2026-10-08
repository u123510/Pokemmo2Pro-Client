package cn.pokemmo.graphics.model.node;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.graphics.model.node.BaseSceneNodeModel;

import com.badlogic.gdx.math.Matrix4;

public class ClonedHierarchyModelNode extends BaseSceneNodeModel {
    public static final C8 R30;
    public static final me0_2 vL0;
    public static final C8 gV;
    public static final C8 uL0;
    public static final C8 So0;
    public final Matrix4 Nk0;

    public ClonedHierarchyModelNode(Ou0 v1) {
        super(v1);
        this.Nk0 = new Matrix4();
        ((BM) this.Y3.get(0)).LPT8(new sh_0(0.0f));
    }

    static {
        R30 = new C8();
        vL0 = new me0_2();
        gV = new C8();
        uL0 = new C8();
        So0 = new C8();
    }

    public final Matrix4 Q8(C8 v1, C8 v2, BJ0 v3) {
        Xz0 node = this.Ve0("Hero_body", true);
        this.a8();
        Matrix4 transform = node.TG0;
        transform.V1(R30);
        vL0.et0(false, transform);
        C8 v4 = new C8(vL0.al(C8.X), vL0.al(C8.Y), vL0.al(C8.Z));
        v4.na(v4.x, v4.y, v4.z);
        v4.na(0.0f, 0.0f, 0.05f);
        vL0.Rx0();

        So0.x = v2.x;
        So0.y = v2.y;
        So0.z = v2.z;
        So0.Vy(v1.x, v1.y, v1.z);
        So0.KM();

        gV.np(v3.St0).Xv0(So0).KM();

        uL0.x = So0.x;
        uL0.y = So0.y;
        uL0.z = So0.z;
        gV.Xv0(uL0).KM();

        vL0.WA0(false, uL0.x, gV.x, So0.x, uL0.y, gV.y, So0.y, uL0.z, gV.z, So0.z);

        this.Nk0.oF0(R30, vL0, _native.Ep0);
        this.Nk0.tO(C8.X, v4.x);
        this.Nk0.tO(C8.Y, v4.y);
        this.Nk0.tO(C8.Z, v4.z);
        return this.Nk0;
    }
}
