package cn.pokemmo.ui.widget.model.property;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class ValuePropertyModel extends BaseObservablePropertyModel {
    public final E7 MF0;
    public final MD0 jf0;

    public ValuePropertyModel(String text, E7 value) {
        super(text);
        this.jf0 = MD0.cB("picked");
        this.MF0 = value;
    }

    @Override
    public final le0_2 pl0(TJ0 context, int index) {
        HW listener = new HW((v10_0) (Object) this);
        listener.ne0(new tq_0(this.MF0, 0));
        String name = this.F0;
        listener.uf(name != null ? name : "checkbox");
        listener.RR(() -> this.qV(listener));
        return listener;
    }

    public final void qV(ee_1 control) {
        KG0 state = control.M;
        boolean picked = !state.t5(this.jf0);
        state.j70(this.jf0, picked);
    }
}
