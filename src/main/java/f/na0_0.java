package f;

import cn.pokemmo.graphics.material.attribute.GlowAttribute;
import com.badlogic.gdx.graphics.Color;

public class na0_0 extends GlowAttribute {
    public na0_0(long value) {
        super(value);
    }

    public na0_0(long value, Color color, float alpha) {
        super(value, color, alpha);
    }

    public na0_0(GlowAttribute other) {
        super(other.yO, other.CD0, other.aD);
    }

    @Override
    public hf_1 pD0() {
        return new na0_0(this.yO, this.CD0, this.aD);
    }
}
