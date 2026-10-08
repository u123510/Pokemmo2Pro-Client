package cn.pokemmo.ui.widget.progress;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import f.ae0_1;
import f.ak0_2;
import f.i70_0;


public class SmoothProgressBarWidget
extends BaseProgressControlWidget {
    public final  ak0_2 vK;

    public SmoothProgressBarWidget(ak0_2 ak0_22) {
        this.vK = ak0_22;
    }

    @Override
    public final boolean nd0(i70_0 i70_02) {
        int n = i70_02.zu;
        if (n == 1) {
            this.vK.k50(i70_02);
        } else if (n == 7) {
            this.vK.k50(i70_02);
        }
        return this.vK.nd0(i70_02);
    }

    @Override
    public final int Se() {
        return 8;
    }
}
