package cn.pokemmo.ui.widget.progress;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import f.ae0_1;
import f.hk0_1;
import f.zk0_1;


public class ExpProgressBarWidget
extends BaseProgressControlWidget {
    public float NQ;
    public long Uz0;

    public ExpProgressBarWidget() {
        ExpProgressBarWidget com8__12 = this;
        com8__12.NQ = 0.0f;
        com8__12.Uz0 = 0L;
        com8__12.aE(0.0f);
        com8__12.uf("smoothprogressbar");
    }

    @Override
    public final void aE(float f) {
        if (f == 0.0f) {
            super.aE(0.0f);
        }
        this.NQ = f;
    }

    @Override
    public final void HP(zk0_1 zk0_12) {
        float f = this.uc;
        float f2 = this.NQ;
        if (f != f2 && this.Uz0 + 10L < hk0_1.KG) {
            super.aE(Math.min(f + 0.01f, f2));
            this.Uz0 = hk0_1.KG;
        }
        super.HP(zk0_12);
    }
}
