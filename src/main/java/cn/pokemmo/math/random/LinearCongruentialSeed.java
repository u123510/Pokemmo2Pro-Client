package cn.pokemmo.math.random;

public class LinearCongruentialSeed {
    public long yt0;

    public LinearCongruentialSeed(long l) {
        this.G20(l);
    }

    public void G20(long l) {
        this.yt0 = (l ^ 0x5DEECE66DL) & 0xFFFFFFFFFFFFL;
    }
}
