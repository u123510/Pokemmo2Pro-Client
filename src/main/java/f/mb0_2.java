package f;

import cn.pokemmo.graphics.material.attribute.FloatAttribute;

public class mb0_2 extends FloatAttribute {
    public mb0_2(long l) {
        super(l);
    }

    public mb0_2(long l, float f) {
        super(l, f);
    }

    public mb0_2(FloatAttribute other) {
        super(other.yO, other.LL0);
    }

    @Override
    public hf_1 pD0() {
        return new mb0_2(this.yO, this.LL0);
    }
}
