package cn.pokemmo.io.stream;

public class DefaultBufferSizeHolder {
    public final int z60;

    public DefaultBufferSizeHolder() {
        this.z60 = 512;
    }

    @Override
    public Object clone() {
        return new DefaultBufferSizeHolder();
    }

    public int cE() {
        return this.z60;
    }
}
