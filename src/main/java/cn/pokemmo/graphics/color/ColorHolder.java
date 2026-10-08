package cn.pokemmo.graphics.color;

import com.badlogic.gdx.graphics.Color;
import f.YA;
import f.sc_0;

public class ColorHolder {
    public Color O7;

    public ColorHolder() {
        this.O7 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public ColorHolder(sc_0 v1, Color v2, YA v3) {
        Color c = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.O7 = c;
        c.set(v2);
    }

    public ColorHolder(ColorHolder v1) {
        this.O7 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        v1.getClass();
        if (v1.O7 != null) {
            this.O7 = new Color(v1.O7);
        }
    }
}
