package cn.pokemmo.ui.layout.twl;

import com.badlogic.gdx.graphics.Texture;
import f.DF0;
import f.EI;
import f.LJ0;
import f.es_1;
import f.i4_0;

public class WidgetContainerBase {
    public final EI Ep0;
    public final i4_0 WD0;
    public Texture q5;
    public final es_1 ZV;
    public boolean Rc0;

    public WidgetContainerBase(LJ0 v1) {
        super();
        this.Ep0 = new EI();
        this.ZV = new es_1();
        i4_0 i4 = new i4_0(v1.Tx, v1.NZ, v1.Hs0);
        this.WD0 = i4;
        i4.Pa0(DF0.Ha0);
        i4.bI(v1.Te0());
        i4.kd();
    }
}
