package cn.pokemmo.graphics.model.node;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.graphics.model.node.BaseSceneNodeModel;

import com.badlogic.gdx.graphics.Color;

public class OcclusionCullingMeshNode extends BaseSceneNodeModel {
    public static final C8 Dz0 = new C8();

    public OcclusionCullingMeshNode(ut_0 source) {
        super(source, "CNYRatGameObject", 48.0f, null);
        this.eB(true);
        if (!source.AF.isEmpty()) {
            this.TU(0, true);
        }
        I2 iterator = source.Cs.ZD();
        while (iterator.hasNext()) {
            BM material = (BM) iterator.next();
            material.fR(PRN_.zz);
            material.fR(PRN_.sI);
            material.fR(PRN_.gp0);
            material.fR(sh_0.vF0);
        }
        BM first = (BM) source.Cs.get(0);
        BM second = (BM) source.Cs.get(1);
        if (second != null && first.tM(PRN_.Ly)) {
            ((PRN_) first.Qy(PRN_.Ly)).v50.set(Color.WHITE);
        }
        if (second != null && second.tM(PRN_.Ly)) {
            ((PRN_) second.Qy(PRN_.Ly)).v50.set(Color.BLACK);
        }
    }

    public final void eo0(C8 value) {
        Dz0.np(value).Vy(0.0f, 0.05f, -0.15f);
        this.ho.Y1(Dz0);
    }
}
