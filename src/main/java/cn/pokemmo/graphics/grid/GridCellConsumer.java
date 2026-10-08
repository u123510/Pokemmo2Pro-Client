package cn.pokemmo.graphics.grid;

import f.cw0_0;

/**
 * 二维网格单元消费接口
 */
public interface GridCellConsumer {
    void consume(int x, int y, cw0_0 cell);

    default void cOm6(int var1, int var2, cw0_0 var3) {
        consume(var1, var2, var3);
    }
}
