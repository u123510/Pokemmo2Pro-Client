package cn.pokemmo.graphics;

import f.*;


/**
 * 现代化重构类 - 原始混淆类: f.bd_1
 */
public class Modern_Gdx_Bd1 extends com1__0 {

    public final A3 sC;
    public final A3 w50;

    public Modern_Gdx_Bd1(A3 target, A3 result) {
        this.w50 = target;
        this.sC = result;
    }

    public final Object Ot0(gp_1 reader, oe_0 node) {
        node = node.dz0;
        while (node != null) {
            Class type = (Class) reader.py0.Wk0(node.Z3);
            if (type == null) {
                type = rd_1.oy0(node.Z3);
            }
            this.O9(reader, node, type);
            node = node.Uu;
        }
        return this.sC;
    }

    public final void O9(gp_1 reader, oe_0 node, Class type) {
        Class storageType = type == E50.class ? YA.class : type;
        node = node.dz0;
        while (node != null) {
            Object value = reader.b20(type, null, node);
            if (value != null) {
                try {
                    this.w50.oj(storageType, value, node.Z3);
                    if (storageType != YA.class && YA.class.isAssignableFrom(storageType)) {
                        this.w50.oj(YA.class, value, node.Z3);
                    }
                } catch (Exception exception) {
                    throw new WC0("Error reading " + type.getSimpleName() + ": " + node.Z3, exception);
                }
            }
            node = node.Uu;
        }
    }
}

