package f;

import cn.pokemmo.util.io.DirectBufferCleaner;
import java.nio.Buffer;

/**
 * Shim: m00_0 -> DirectBufferCleaner
 * @see cn.pokemmo.util.io.DirectBufferCleaner
 */
public abstract class m00_0 extends DirectBufferCleaner {
    public static boolean SX(Buffer buffer) {
        return DirectBufferCleaner.SX(buffer);
    }
}
