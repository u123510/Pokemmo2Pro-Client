package f;

import cn.pokemmo.world.render.blend.deferred.TypedTileBlender;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - mk0_1 -> TypedTileBlender
 */
public class mk0_1 extends TypedTileBlender {
    public mk0_1(byte type, short id) {
        super(type, id);
    }
}
