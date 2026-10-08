package f;

import cn.pokemmo.graphics.material.attribute.CubemapAttribute;

public class lpt7__4 extends CubemapAttribute {
    public lpt7__4(long value) {
        super(value);
    }

    public lpt7__4(long value, B90 state) {
        super(value, state);
    }

    public lpt7__4(long value, AH0 texture) {
        super(value, texture);
    }

    public lpt7__4(CubemapAttribute source) {
        super(source);
    }

    @Override
    public hf_1 pD0() {
        return new lpt7__4(this);
    }
}
