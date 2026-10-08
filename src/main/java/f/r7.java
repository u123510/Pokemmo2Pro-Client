package f;

import cn.pokemmo.ui.widget.component.SpriteMenuItem;
import f.QJ0;
import f.TJ0;
import f.Wr;
import f.le0_2;

public final class r7 extends SpriteMenuItem {
    public r7(String v1, Wr v2) {
        super(v1, v2);
    }

    public static /* synthetic */ int xy(r7 v0) {
        return v0.cOm6;
    }

    @Override
    public final le0_2 pl0(TJ0 v1, int i2) {
        QJ0 qj0 = new QJ0(this, v1, i2, this.Tv, this.oz0, this.QL);
        String str = this.F0;
        if (str != null) {
            qj0.uf(str);
        } else {
            qj0.uf("sprite-menu-button");
        }
        return qj0;
    }
}
