/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.model.node;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.graphics.model.node.BaseSceneNodeModel;

import f.BM;
import f.C8;
import f.I2;
import f.Ou0;
import f.mb0_2;
import f.sh_0;
import f.ut_0;

public class MultiSubmeshCompositeNode extends BaseSceneNodeModel {
    public static final C8 OG = new C8();
    public final C8 de0;

    public MultiSubmeshCompositeNode(ut_0 source) {
        super(source, "RaidDen", 16.0f, null);
        this.de0 = new C8();
        this.eB(true);
        I2 iterator = this.Y3.ZD();
        while (iterator.hasNext()) {
            BM bM = (BM)iterator.next();
            bM.LPT8(new sh_0(1.0f));
            bM.LPT8(new mb0_2(mb0_2.k6, 0.01f));
        }
        this.de0.mf0(-0.25f, 0.21f, -0.15f);
    }

    public MultiSubmeshCompositeNode(ut_0 source, int n) {
        super(source, "RaidDen", 16.0f, null);
        this.de0 = new C8();
        this.eB(true);
        I2 iterator = this.Y3.ZD();
        while (iterator.hasNext()) {
            BM bM = (BM)iterator.next();
            bM.LPT8(new sh_0(1.0f));
            bM.LPT8(new mb0_2(mb0_2.k6, 0.01f));
        }
        this.de0.mf0(0.12f, 0.15f, 0.17f);
    }

    @Override
    public final void eo0(C8 c8) {
        C8 translation = OG;
        translation.x = c8.x;
        translation.y = c8.y;
        translation.z = c8.z;
        this.ho.Y1(translation.Vy(this.de0.x, this.de0.y, this.de0.z));
    }
}
