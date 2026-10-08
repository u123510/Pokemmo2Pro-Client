package cn.pokemmo.ui.widget.model.property;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class TextPropertyModel extends BaseObservablePropertyModel {
    public Runnable eu0;

    public TextPropertyModel() {
    }

    public TextPropertyModel(String text) {
        super(text);
    }

    public TextPropertyModel(String text, Runnable callback) {
        super(text);
        this.eu0 = callback;
    }

    @Override
    public final le0_2 pl0(TJ0 context, int index) {
        ee_1 button = new ee_1(this);
        button.uf(this.F0 != null ? this.F0 : "button");
        button.RR(context.Br);
        if (this.eu0 != null) {
            button.RR(this.eu0);
        }
        return button;
    }
}
