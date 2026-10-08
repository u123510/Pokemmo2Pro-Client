package cn.pokemmo.audio.stream.decoder;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.ArrayList;
import java.util.Arrays;

public class PcmWaveAudioStreamDecoder extends BaseAudioStreamDecoder {
    public static final dl_1 QJ0 = Cq0.E1(PcmWaveAudioStreamDecoder.class);
    public static final dl_1 z6 = Cq0.t00("mod");
    public static final int[] mC = new int[0];
    public int[] B3;
    public UZ om;
    public AG0[] fu;

    public PcmWaveAudioStreamDecoder(Dn0 source, int[] frameTimes) {
        super(source);
        this.B3 = mC;
        this.om = null;
        this.fu = null;
        if (frameTimes == null) {
            return;
        }

        hj0_1 gif = this.G90();
        if (frameTimes.length == 1) {
            this.B3 = new int[gif.HY()];
            Arrays.fill(this.B3, frameTimes[0]);
        } else if (frameTimes.length == gif.HY()) {
            this.B3 = frameTimes;
        } else {
            throw new IllegalArgumentException("Invalid frame times length. Expected: " + gif.HY() + " Has: " + frameTimes.length);
        }
    }

    public final AG0[] sj() {
        AG0[] frames = this.fu;
        UZ animation = this.om;
        if (frames != null && animation != null && !animation.MH) {
            animation.Ik = hk0_1.KG;
            return frames;
        }

        ArrayList parts = new ArrayList();
        hj0_1 gif = this.G90();
        parts.add(gif);
        AG0[] loadedFrames = new AG0[gif.kl0];
        for (int index = 0; index < loadedFrames.length; index++) {
            Wr wrapper = new Wr(new fd_0(gif, index));
            AG0 frame = new AG0(wrapper, 0, 0, -1, -1);
            loadedFrames[index] = frame;
            parts.add(wrapper);
            parts.add(frame);
        }

        this.om = new UZ(parts);
        this.fu = loadedFrames;
        return loadedFrames;
    }

    public final int[] ag0() {
        return this.B3;
    }

    public final hj0_1 G90() {
        try {
            hj0_1 gif = new hj0_1();
            gif.Ik = hk0_1.KG;
            int status = gif.Qc(this.I40.LpT7(2048));
            if (this.B3.length == 0) {
                this.B3 = new int[gif.kl0];
                for (int index = 0; index < this.B3.length; index++) {
                    gif.Lpt7 = -1;
                    if (index < gif.kl0) {
                        gif.Lpt7 = ((dv_0)gif.No.elementAt(index)).COm4;
                    }
                    this.B3[index] = gif.Lpt7;
                }
            }
            return status == 0 ? gif : null;
        } catch (Exception error) {
            QJ0.error("Error loading gif {}", this.I40.el(), error);
            z6.error("Error loading gif {}", this.I40.el(), error);
            if (Iu0.C80((nf_1)error)) {
                PcmWaveAudioStreamDecoder.<RuntimeException>rethrowUnchecked(error);
            }
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void rethrowUnchecked(Throwable error) throws T {
        throw (T)error;
    }
}
