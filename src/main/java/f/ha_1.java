package f;

import cn.pokemmo.graphics.material.attribute.TileSetAttribute;

public class ha_1 extends TileSetAttribute {
    public ha_1(short s) {
        super(s);
    }

    public ha_1(TileSetAttribute ha_12) {
        super(ha_12);
    }

    @Override
    public hf_1 pD0() {
        return new ha_1(this);
    }
}
