package cn.pokemmo.data;

public class NamedObjectEntry {
    public final Object q90;
    public final String Oo;

    public NamedObjectEntry(Object object, String string) {
        this.Oo = string;
        this.q90 = object;
    }

    @Override
    public String toString() {
        return this.Oo;
    }
}
