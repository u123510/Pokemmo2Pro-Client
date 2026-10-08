package cn.pokemmo.ui.widget.dropdown;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import f.X6;
import f.fp0_0;
import f.pg0_2;


public class ResolutionDropdownWidget
extends BaseDropdownWidget {
    public ResolutionDropdownWidget(pg0_2 pg0_22) {
        super(pg0_22);
    }

    @Override
    public final String RA(int n) {
        return fp0_0.uD(new StringBuilder(), (int)(((Float)this.mu0.KB.YS(n)).floatValue() * 100.0f), "%");
    }
}
