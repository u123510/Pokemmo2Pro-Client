package f;

import cn.pokemmo.battle.entity.modifier.EntityRunnableModifier;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - pp_1 -> EntityRunnableModifier
 */
public class pp_1 extends EntityRunnableModifier {
    public pp_1(Runnable runnable) {
        super(runnable);
    }
}
