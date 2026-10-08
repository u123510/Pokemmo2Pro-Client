package cn.pokemmo.graphics.color;

import com.badlogic.gdx.graphics.Color;
import f.YA;
import f.sc_0;

public class DualColorHolder {
    public final Color b6;
    public final Color Ei0;

    public DualColorHolder() {
        this.b6 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.Ei0 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public DualColorHolder(sc_0 v1, Color v2, Color v3, YA v4) {
        this.b6 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.Ei0 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.b6.set(v2);
        this.Ei0.set(v3);
    }

    public DualColorHolder(DualColorHolder v1) {
        this.b6 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.Ei0 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        v1.getClass();
        this.b6.set(v1.b6);
        this.Ei0.set(v1.Ei0);
    }
}
