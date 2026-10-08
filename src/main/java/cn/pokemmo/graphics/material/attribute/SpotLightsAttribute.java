package cn.pokemmo.graphics.material.attribute;

import f.*;
import java.util.*;


public class SpotLightsAttribute extends BaseMaterialAttribute {
    public static final long uv0 = hf_1.T20("spotLights");
    public final es_1 Ai0 = new es_1(1);

    public SpotLightsAttribute() {
        super(uv0);
    }

    public SpotLightsAttribute(SpotLightsAttribute other) {
        this();
        this.Ai0.E3(other.Ai0);
    }

    @Override
    public final int hashCode() {
        int hash = this.YF * 7489;
        I2 iterator = this.Ai0.ZD();
        while (iterator.hasNext()) {
            Ew0 light = (Ew0) iterator.next();
            hash = hash * 1237 + (light == null ? 0 : light.hashCode());
        }
        return hash;
    }

    @Override
    public hf_1 pD0() {
        return new f.Lm0(this);
    }

    @Override
    public final int compareTo(Object other) {
        hf_1 attribute = (hf_1) other;
        return this.yO == attribute.yO ? 0 : (this.yO < attribute.yO ? -1 : 1);
    }
}
