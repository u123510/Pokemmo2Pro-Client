package cn.pokemmo.resource;

import f.Dn0;
import f.in_0;

public class NamedResourceDescriptor {
    public final String RH0;
    public final Class wj;
    public final in_0 coM1;
    public Dn0 Ju;

    public NamedResourceDescriptor(String name, Class type) {
        this(name, type, null);
    }

    public NamedResourceDescriptor(Dn0 source, Class type) {
        this(source, type, null);
    }

    public NamedResourceDescriptor(String name, Class type, in_0 callback) {
        this.RH0 = name;
        this.wj = type;
        this.coM1 = callback;
    }

    public NamedResourceDescriptor(Dn0 source, Class type, in_0 callback) {
        this.RH0 = source.el();
        this.Ju = source;
        this.wj = type;
        this.coM1 = callback;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.RH0)
                .append(", ")
                .append(this.wj.getName())
                .toString();
    }
}
