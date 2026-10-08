package cn.pokemmo.data;

/**
 * 整型标识持有者包装类
 */
public class IntIdHolder {
    public final int vQ;

    public IntIdHolder(int n) {
        this.vQ = n;
    }

    public int getId() {
        return this.vQ;
    }
}
