package f;

import cn.pokemmo.audio.stream.decoder.PcmWaveAudioStreamDecoder;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - Ru0 -> PcmWaveAudioStreamDecoder
 */
public class Ru0 extends PcmWaveAudioStreamDecoder {
    public Ru0(Dn0 source, int[] frameTimes) {
        super(source, frameTimes);
    }
}
