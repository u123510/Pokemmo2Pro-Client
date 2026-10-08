package cn.pokemmo.data;

/**
 * 短整型标识持有者包装类
 */
public class ShortIdHolder {
    public final short gz;

    public ShortIdHolder(short s) {
        this.gz = s;
    }

    public short getId() {
        return this.gz;
    }
}
