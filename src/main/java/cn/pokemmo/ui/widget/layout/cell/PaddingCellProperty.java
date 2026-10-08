package cn.pokemmo.ui.widget.layout.cell;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import f.h20_0;
import f.j1_0;
import f.le0_2;
import f.mm_0;


public class PaddingCellProperty
extends BaseLayoutCellProperty {
    @Override
    public final float Sw0(j1_0 j1_02) {
        Object object = j1_02.kh0;
        if (object == null) {
            return 0.0f;
        }
        h20_0.RV.getClass();
        return ((le0_2)object).R1();
    }
}
