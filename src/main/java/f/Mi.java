package f;

import cn.pokemmo.audio.stream.decoder.CompositeAudioStreamDecoder;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - Mi -> CompositeAudioStreamDecoder
 */
public class Mi extends CompositeAudioStreamDecoder {
    public Mi(ro_1[] frames, int[] frameTimes) {
        super(frames, frameTimes);
    }
}
