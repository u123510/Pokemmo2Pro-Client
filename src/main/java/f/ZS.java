package f;

import cn.pokemmo.graphics.animation.track.VectorTimelineSequence;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - ZS -> VectorTimelineSequence
 */
public class ZS extends VectorTimelineSequence {
    public ZS(VU vu) {
        super(vu);
    }
}
