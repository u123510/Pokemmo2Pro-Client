package f;

import cn.pokemmo.world.render.blend.deferred.IndexedTileBlender;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - EL0 -> IndexedTileBlender
 */
public class EL0 extends IndexedTileBlender {
    public EL0(byte index, LT tile) {
        super(index, tile);
    }
}
