package f;

import cn.pokemmo.graphics.material.attribute.TextureFormatAttribute;

public class xd_2 extends TextureFormatAttribute {
    public xd_2(long value) {
        super(value);
    }

    public xd_2(long value, int index) {
        super(value, index);
    }

    public xd_2(TextureFormatAttribute source) {
        super(source);
    }

    @Override
    public hf_1 pD0() {
        return new xd_2(this);
    }
}
