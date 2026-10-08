package f;

import cn.pokemmo.graphics.material.attribute.DirectionalLightsAttribute;

public class CP extends DirectionalLightsAttribute {
    public CP() {
        super();
    }

    public CP(DirectionalLightsAttribute var1) {
        super(var1);
    }

    @Override
    public hf_1 pD0() {
        return new CP(this);
    }
}
