package cn.pokemmo.world.tile;

import f.*;

public class WaterCurrentTileBehavior extends gp_1 {
    public final A3 mr0;

    public WaterCurrentTileBehavior(A3 owner) {
        this.mr0 = owner;
    }

    @Override
    public final Object b20(Class type, Class ignored, oe_0 resource) {
        if (resource != null && resource.wH0 == lpt3__3.ND0
                && !CharSequence.class.isAssignableFrom(type)) {
            return this.mr0.Ip(type, resource.cd0());
        }
        return super.b20(type, ignored, resource);
    }

    @Override
    public final boolean Cz(String name) {
        return "parent".equals(name);
    }

    @Override
    public final void JD(Object value, oe_0 resource) {
        if (resource.UJ0("parent")) {
            oe_0 parentNode = resource.Is("parent");
            String name = parentNode.cd0();
            Class<?> type = String.class;
            Object parent = b20(type, null, parentNode);
            Class<?> current = parent.getClass();
            while (true) {
                try {
                    G6(this.mr0.Ip(current, name), value);
                    break;
                } catch (nf_1 ex) {
                    current = current.getSuperclass();
                    if (current == Object.class) {
                        WC0 error = new WC0(jj0_0.hw0("Unable to find parent resource with name: ", name));
                        error.bw(resource.dz0.Dq());
                        throw error;
                    }
                }
            }
        }
        super.JD(value, resource);
    }
}
