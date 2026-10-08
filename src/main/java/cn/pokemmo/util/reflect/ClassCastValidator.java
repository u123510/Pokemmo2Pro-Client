package cn.pokemmo.util.reflect;

public abstract class ClassCastValidator {
    public static void Xj(Object object) {
        if (object == null) {
            return;
        }
        throw new ClassCastException();
    }
}
