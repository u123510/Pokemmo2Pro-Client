package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

import com.badlogic.gdx.graphics.Texture;

public abstract class CheckboxWidget implements E60, fy0_0 {
    public final nb_2 QR;
    public es_1 vv0;
    public final nb_2 Wj0;
    public final nb_2 bb;
    public final nb_2 F3;
    public final boolean wi0;
    public boolean Lpt1;
    public am_2 Ak0;
    public int kh;

    public CheckboxWidget() {
        this.QR = new nb_2();
        this.vv0 = null;
        this.Wj0 = new nb_2(1);
        this.bb = new nb_2(1);
        this.F3 = new nb_2(1);
        this.wi0 = false;
        this.Lpt1 = false;
    }

    public CheckboxWidget(int ignored) {
        this.QR = new nb_2();
        this.vv0 = null;
        this.Wj0 = new nb_2(1);
        this.bb = new nb_2(1);
        this.F3 = new nb_2(1);
        this.Lpt1 = false;
        this.wi0 = true;
    }

    public abstract void Od0(vt_0 first, am_2 second);

    public final int En(String name) {
        Integer index = (Integer) this.Wj0.Wk0(name);
        return index == null ? -1 : index.intValue();
    }

    @Override
    public final void dispose() {
        this.Lpt1 = true;
        be_2 textures = this.QR.Ww0();
        while (textures.hasNext()) {
            ((Texture) textures.next()).dispose();
        }
        if (this.vv0 != null) {
            I2 extraTextures = this.vv0.ZD();
            while (extraTextures.hasNext()) {
                ((Texture) extraTextures.next()).dispose();
            }
        }
        this.QR.b20();
    }
}
