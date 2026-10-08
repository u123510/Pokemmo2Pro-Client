package f;

import cn.pokemmo.audio.stream.decoder.MidiAudioStreamDecoder;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - r2 -> MidiAudioStreamDecoder
 */
public class r2 extends MidiAudioStreamDecoder {
    public r2(Dn0 source) {
        super(source);
    }
}
