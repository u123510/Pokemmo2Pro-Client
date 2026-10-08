package cn.pokemmo.ui.widget.progress;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import f.E00;
import f.ae0_1;
import f.i70_0;


public class HpProgressBarWidget
extends BaseProgressControlWidget {
    @Override
    public final boolean nd0(i70_0 i70_02) {
        this.k50(i70_02);
        int n = i70_02.zu;
        if (E00.C10(n)) {
            return n != 8;
        }
        return false;
    }
}
