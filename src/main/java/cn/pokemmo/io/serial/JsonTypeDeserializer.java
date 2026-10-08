package cn.pokemmo.io.serial;

import f.gp_1;
import f.oe_0;

public abstract class JsonTypeDeserializer {
    public abstract Object deserialize(gp_1 parser, oe_0 element);

    public Object Ot0(gp_1 var1, oe_0 var2) {
        return deserialize(var1, var2);
    }
}
