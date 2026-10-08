package f;

import cn.pokemmo.graphics.animation.track.TimedTimelineSequence;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - oq_1 -> TimedTimelineSequence
 */
public class oq_1 extends TimedTimelineSequence {
    public oq_1(int n, int n2) {
        super(n, n2);
    }
    public oq_1(int n, int n2, int n3) {
        super(n, n2, n3);
    }
}
