package f;

import cn.pokemmo.graphics.material.attribute.ColorAttribute;
import com.badlogic.gdx.graphics.Color;

public class PRN_ extends ColorAttribute {
    public PRN_(long var1) {
        super(var1);
    }

    public PRN_(long var1, Color var3) {
        super(var1, var3);
    }

    public PRN_(long var1, float var3, float var4, float var5, float var6) {
        super(var1, var3, var4, var5, var6);
    }

    public PRN_(ColorAttribute var1) {
        super(var1);
    }

    @Override
    public hf_1 pD0() {
        return new PRN_(this);
    }
}
