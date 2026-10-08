package cn.pokemmo.ui.widget.model.property;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import com.badlogic.gdx.graphics.Texture;

public class IconPropertyModel extends BaseObservablePropertyModel {
    public final Runnable ZK0;
    public final int vv0;
    public final int ds0;
    public final AG0 li0;
    public final Wr pi;
    public final Texture dg0;
    public final int LPT1;
    public final int Ml0;
    public final int We0;
    public final boolean qR;

    public IconPropertyModel(String str, Texture texture, Runnable runnable) {
        super(str);
        this.We0 = tw0_0.kz0() ? 2 : 1;
        this.qR = false;
        this.dg0 = texture;
        this.ZK0 = runnable;
        this.vv0 = 0;
        this.ds0 = 0;
        this.LPT1 = 32;
        this.Ml0 = 32;
        this.li0 = null;
        this.pi = null;
    }

    public IconPropertyModel(String str, AG0 aG0, int i, int i2, int i3, Runnable runnable) {
        super(str);
        this.We0 = tw0_0.kz0() ? 2 : 1;
        this.li0 = aG0;
        this.vv0 = 0;
        this.ds0 = i;
        this.ZK0 = runnable;
        this.qR = false;
        this.LPT1 = i2;
        this.Ml0 = i3;
        this.pi = null;
        this.dg0 = null;
    }

    public IconPropertyModel(String str, Wr wr, int i, int i2, int i3, int i4, Runnable runnable, boolean z) {
        super(str);
        this.We0 = tw0_0.kz0() ? 2 : 1;
        this.pi = wr;
        this.vv0 = i;
        this.ds0 = i2;
        this.ZK0 = runnable;
        this.qR = z;
        this.LPT1 = i3;
        this.Ml0 = i4;
        this.li0 = null;
        this.dg0 = null;
    }

    @Override
    public final le0_2 pl0(TJ0 tj0, int i) {
        qj_2 qj_2Var = new qj_2(this.ln, 0, 0);
        if (this.li0 != null) {
            qj_2Var.tp0.o60(new AG0[]{this.li0});
        }
        if (this.pi != null) {
            qj_2Var.tp0.Nk(new Wr[]{this.pi});
        }
        if (this.dg0 != null) {
            qj_2Var.tp0.LX(new Texture[]{this.dg0});
        }
        qj_2Var.tp0.gY = this.vv0 * this.We0;
        qj_2Var.tp0.a4 = this.ds0 * this.We0;
        if (this.F0 != null) {
            qj_2Var.uf(this.F0);
        } else {
            qj_2Var.uf("sprite-menu-button");
        }
        if (this.LPT1 != 0 && this.Ml0 != 0) {
            qj_2Var.tp0.OA0 = true;
            qj_2Var.tp0.IF = this.LPT1 * this.We0;
            qj_2Var.tp0.gx0 = this.Ml0 * this.We0;
        } else {
            qj_2Var.tp0.EJ0 = (float) this.We0;
        }
        if (this.qR && this.ZK0 != null) {
            qj_2Var.RR(this.ZK0);
        }
        qj_2Var.RR(tj0.Br);
        if (!this.qR && this.ZK0 != null) {
            qj_2Var.RR(this.ZK0);
        }
        return qj_2Var;
    }
}
