package cn.pokemmo.assets.loader;

import f.*;
import java.util.*;
import com.badlogic.gdx.graphics.*;


import com.badlogic.gdx.graphics.Texture;

public abstract class TextureAssetLoader extends BaseAssetLoader {
    public final es_1 Mm0;
    public final SH0 qY;

    public TextureAssetLoader(gq_1 v1) {
        super(v1);
        this.Mm0 = new es_1();
        this.qY = new SH0();
    }

    public abstract y90_0 AO(Dn0 v1, SH0 v2);

    @Override
    public final Object loadSync(hd0_2 v1, String v2, Dn0 v3, in_0 v4) {
        SH0 dummy = (SH0) v4;
        y90_0 target = null;
        synchronized (this.Mm0) {
            for (int i5 = 0; i5 < this.Mm0.KB; i5++) {
                xn_1 item = (xn_1) this.Mm0.get(i5);
                if (((String) item.I20).equals(v2)) {
                    target = (y90_0) item.kM;
                    this.Mm0.Tx0(i5);
                }
            }
        }
        if (target == null) {
            return null;
        }
        ut_0 ut = new ut_0(target, new gj_1(v1));
        I2 it = ut.iM.ZD();
        while (it.hasNext()) {
            if (it.next() instanceof Texture) {
                it.remove();
            }
        }
        return ut;
    }

    @Override
    public final void loadAsync(hd0_2 v1, String v2, Dn0 v3, in_0 v4) {
        SH0 dummy = (SH0) v4;
    }

    @Override
    public final es_1 getDependencies(String v1, Dn0 v2, in_0 v3) {
        SH0 param = (SH0) v3;
        es_1 dependencies = new es_1();
        y90_0 modelData = this.AO(v2, param);
        if (modelData != null) {
            xn_1 pair = new xn_1();
            pair.I20 = v1;
            pair.kM = modelData;
            synchronized (this.Mm0) {
                this.Mm0.Ue0(pair);
            }
            Em0 em0 = (param != null) ? param.jz0 : this.qY.jz0;
            I2 it1 = modelData.zK.ZD();
            while (it1.hasNext()) {
                ef0_1 ef = (ef0_1) it1.next();
                es_1 wX = ef.wX;
                if (wX != null) {
                    I2 it2 = wX.ZD();
                    while (it2.hasNext()) {
                        jx0_0 jx = (jx0_0) it2.next();
                        dependencies.Ue0(new cr_2(jx.Dn0, Texture.class, em0));
                    }
                }
            }
        }
        return dependencies;
    }
}
