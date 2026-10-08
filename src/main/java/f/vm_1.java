package f;

import cn.pokemmo.audio.stream.decoder.ChainedAudioStreamDecoder;
import java.util.*;
import java.nio.ByteBuffer;

/**
 * 双向兼容垫片 - vm_1 -> ChainedAudioStreamDecoder
 */
public class vm_1 extends ChainedAudioStreamDecoder {
    public vm_1(ro_1 ro_1) {
        super(ro_1);
    }
}
