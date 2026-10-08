package f;

import cn.pokemmo.graphics.grid.GridCellConsumer;
import f.cw0_0;

/**
 * 网格单元消费门面
 * @see cn.pokemmo.graphics.grid.GridCellConsumer
 */
public interface XL extends GridCellConsumer {
    @Override
    void cOm6(int var1, int var2, cw0_0 var3);

    @Override
    default void consume(int x, int y, cw0_0 cell) {
        cOm6(x, y, cell);
    }
}
