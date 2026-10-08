package f;

import cn.pokemmo.graphics.material.attribute.OverlayColorAttribute;
import com.badlogic.gdx.graphics.Color;

public class Rv0 extends OverlayColorAttribute {
    public Rv0(long type) {
        super(type);
    }

    public Rv0(long type, Color color) {
        super(type, color);
    }

    public Rv0(long type, int ignored) {
        super(type, ignored);
    }

    public Rv0(OverlayColorAttribute other) {
        super(other.yO, other.Vr);
    }

    @Override
    public hf_1 pD0() {
        return new Rv0(this.yO, this.Vr);
    }
}
