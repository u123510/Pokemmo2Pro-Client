package cn.pokemmo.audio.stream.decoder;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ChainedAudioStreamDecoder extends BaseAudioStreamDecoder {
    public final ty0[] UK0;

    public ChainedAudioStreamDecoder(ro_1 ro_1) {
        super((Dn0) null);
        this.UK0 = new ty0[2];
        for (int i = 0; i < 2; i++) {
            this.UK0[i] = ro_1;
        }
    }

    public final i4_0 By() {
        throw new RuntimeException("Not supported");
    }
}
