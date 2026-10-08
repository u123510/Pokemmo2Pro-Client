package cn.pokemmo.collection.wrapper;

import f.a9_0;

public class TypedObjectWrapper extends a9_0 {
    public final Object gO;
    public final boolean tu0;

    public TypedObjectWrapper(Class clazz, Object object, boolean bl) {
        super(clazz);
        this.gO = object;
        this.tu0 = bl;
    }
}
