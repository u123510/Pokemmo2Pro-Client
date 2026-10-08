package cn.pokemmo.io.json;

import f.Dn0;
import f.oe_0;

public interface JsonElementParser {
    oe_0 Zk0(Dn0 var1);

    default oe_0 parse(Dn0 file) {
        return Zk0(file);
    }
}
