package cn.pokemmo.audio.stream.decoder;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BufferedAudioStreamDecoder extends BaseAudioStreamDecoder {
    public static final dl_1 Py0;
    public static final dl_1 sd0;
    public AG0[] Mi;

    public BufferedAudioStreamDecoder(Dn0 file) {
        super(file);
        this.Mi = null;
    }

    static {
        Py0 = Cq0.E1(BufferedAudioStreamDecoder.class);
        sd0 = Cq0.t00("mod");
    }

    public final AG0[] sj() {
        if (this.Mi != null) {
            return this.Mi;
        }
        AG0[] result = new AG0[1];
        result[0] = new AG0(new Wr(new yf_1((ro_1) (Object) this)), 0, 0, -1, -1);
        this.Mi = result;
        return result;
    }

    public final i4_0 By() {
        try {
            return new i4_0(this.I40);
        } catch (Exception error) {
            Py0.error("Error loading png {}", this.I40.el(), error);
            sd0.error("Error loading png {}", this.I40.el(), error);
            if (!tw0_0.hH0.C80((nf_1) error)) {
                return LP.tl0;
            }
            throw (RuntimeException) error;
        }
    }
}
