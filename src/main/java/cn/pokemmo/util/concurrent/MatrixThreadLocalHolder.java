package cn.pokemmo.util.concurrent;

import f.T8;

public class MatrixThreadLocalHolder extends ThreadLocal {
    @Override
    public Object initialValue() {
        return new T8();
    }
}
