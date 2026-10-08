package f;

import cn.pokemmo.math.geometry.Int3Consumer;

/**
 * 3D 坐标消费门面
 * @see cn.pokemmo.math.geometry.Int3Consumer
 */
public interface Z6 extends Int3Consumer {
    @Override
    void AD0(int var1, int var2, int var3);

    @Override
    default void accept(int x, int y, int z) {
        AD0(x, y, z);
    }
}
