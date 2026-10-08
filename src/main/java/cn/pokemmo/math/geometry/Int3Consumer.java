package cn.pokemmo.math.geometry;

/**
 * 3D 整数坐标三元消费者接口
 */
public interface Int3Consumer {
    void accept(int x, int y, int z);

    default void AD0(int var1, int var2, int var3) {
        accept(var1, var2, var3);
    }
}
