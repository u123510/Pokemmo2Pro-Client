package cn.pokemmo.graphics.material.attribute;

import f.*;
import java.util.*;


public class PointLightsAttribute extends BaseMaterialAttribute {
    public static final long Tl0;
    public final es_1 jA;

    public PointLightsAttribute() {
        super(Tl0);
        this.jA = new es_1(1);
    }

    public PointLightsAttribute(PointLightsAttribute other) {
        this();
        this.jA.E3(other.jA);
    }

    static {
        Tl0 = hf_1.T20("pointLights");
    }

    @Override
    public final int hashCode() {
        int result = this.YF * 7489;
        I2 iterator = this.jA.ZD();
        while (iterator.hasNext()) {
            dm0_0 value = (dm0_0) iterator.next();
            result = result * 1231 + (value == null ? 0 : value.hashCode());
        }
        return result;
    }

    @Override
    public hf_1 pD0() {
        return new f.fi_2(this);
    }

    @Override
    public final int compareTo(Object object) {
        return Long.compare(this.yO, ((hf_1) object).yO);
    }
}
