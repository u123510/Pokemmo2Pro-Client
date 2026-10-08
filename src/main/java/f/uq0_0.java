package f;

import cn.pokemmo.data.DataPackageLoader;
import java.nio.ByteBuffer;

/**
 * Shim: uq0_0 -> DataPackageLoader
 * @see cn.pokemmo.data.DataPackageLoader
 */
public abstract class uq0_0 extends DataPackageLoader {
    public static boolean ha0() {
        return DataPackageLoader.ha0();
    }

    public static boolean xu0(ByteBuffer buffer) {
        return DataPackageLoader.xu0(buffer);
    }
}
