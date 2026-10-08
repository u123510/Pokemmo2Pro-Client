package f;

import cn.pokemmo.audio.stream.decoder.BufferedAudioStreamDecoder;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - ro_1 -> BufferedAudioStreamDecoder
 */
public class ro_1 extends BufferedAudioStreamDecoder {
    public ro_1(Dn0 file) {
        super(file);
    }
}
