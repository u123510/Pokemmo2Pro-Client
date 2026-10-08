package cn.pokemmo.ui.widget.progress;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class LabeledProgressBarWidget extends BaseProgressControlWidget {
    public int fM;
    public int ha0;
    public int Cm0;
    public final cn_0 pc;
    public boolean fp0;
    public long t30;

    public LabeledProgressBarWidget(cn_0 label) {
        super();
        this.fp0 = false;
        this.t30 = 0L;
        this.fM = 1;
        this.Cm0 = 1;
        this.ha0 = 1;
        this.pc = label;
        this.CH();
    }

    @Override
    public final void HP(zk0_1 context) {
        super.HP(context);
        int height = this.ha0;
        if (height < 1) {
            this.aE(1.0f);
            return;
        }
        int current = this.Cm0;
        int target = this.fM;
        if (current == target) {
            return;
        }
        int steps;
        if (this.fp0) {
            long previous = this.t30;
            steps = (int) ((hk0_1.KG - previous) / 40L);
            if (steps < 1) {
                return;
            }
            this.t30 = previous + (long) steps * 40L;
        } else {
            this.fp0 = true;
            steps = 1;
            this.t30 = hk0_1.KG;
        }
        int change = (int) (Math.max(1.0, height * 0.05) * steps);
        if (current > target) {
            this.Cm0 = Math.max(target, current - change);
        } else {
            this.Cm0 = Math.min(target, current + change);
        }
        this.CH();
    }

    @Override
    public final boolean nd0(i70_0 event) {
        this.k50(event);
        int type = event.zu;
        return E00.C10(type) && type != 8;
    }

    public final void CH() {
        double progress = tx_1.uF(this.Cm0, this.ha0);
        float fraction = (float) (progress / 100.0);
        if (this.pc != null) {
            this.pc.Sk(new StringBuilder()
                    .append(this.Cm0)
                    .append(" / ")
                    .append(this.ha0)
                    .toString());
        }
        this.aE(fraction);
        this.GH0 = 100;
        String theme;
        if (progress > 50.0) {
            theme = "health-progressbar";
        } else if (progress > 25.0) {
            theme = "health-progressbar-orange";
        } else {
            theme = "health-progressbar-red";
        }
        if (!theme.equals(this.gW)) {
            this.uf(theme);
            this.yI();
        }
    }
}
