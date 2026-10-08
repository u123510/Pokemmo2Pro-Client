package cn.pokemmo.ui.widget.progress;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class CastProgressBarWidget extends BaseProgressControlWidget {
    public final jd0_1 KG;
    public float Com9;
    public float Co0;
    public long MR;
    public boolean default$;

    public CastProgressBarWidget(jd0_1 owner) {
        super();
        this.default$ = false;
        this.KG = owner;
        this.Com9 = 0.0F;
        this.Co0 = 0.0F;
    }

    @Override
    public final void N00(zk0_1 ignored) {
        if (this.default$) {
            tw0_0.RE0.wp0((byte)2, (short)1389);
        }
    }

    @Override
    public final void HP(zk0_1 context) {
        super.HP(context);
        if (LW.LH0(this.Co0, this.Com9)) {
            this.default$ = false;
            return;
        }
        long now = System.currentTimeMillis();
        long delta = now - this.MR;
        if (delta < 20L) {
            return;
        }
        if (!this.default$) {
            this.default$ = true;
            tw0_0.RE0.d00(false, (byte)2, (short)1389, 0.0F);
        }
        int steps = (int)(delta / 20L);
        long tick = System.currentTimeMillis() - delta % 20L;
        this.MR = tick;

        if (this.Co0 >= 1.0F && this.Com9 >= 1.0F) {
            float current = this.Com9;
            this.Co0 = 0.0F;
            this.Com9 = 1.0F - current;
            tw0_0.RE0.wp0((byte)2, (short)1389);
            this.default$ = false;
            tw0_0.RE0.Hq0((byte)2, (short)1390);
            this.MR = System.currentTimeMillis() + 250L;
            this.KG.Cw++;
            cn_0 label = this.KG.ya0;
            String prefix;
            if (this.KG.P70 == null) {
                prefix = "";
            } else {
                prefix = ig_0.u9(59, new StringBuilder(this.KG.P70.A60()).append("  "), " ").toString();
            }
            String value = this.KG.P70 == null ? "--" : Integer.toString(this.KG.Cw);
            label.Sk(prefix + value);
        }

        if (LW.LH0(this.Co0, this.Com9)) {
            this.aE(this.Com9);
            this.Com9 = this.Co0;
            tw0_0.RE0.wp0((byte)2, (short)1389);
            this.default$ = false;
            return;
        }
        float current = this.Co0;
        if (current <= this.Com9) {
            float next = steps * 0.01F + current;
            this.Co0 = next;
            this.aE(next);
        } else {
            this.aE(this.Com9);
            this.Com9 = current;
            tw0_0.RE0.wp0((byte)2, (short)1389);
            this.default$ = false;
        }
    }
}
