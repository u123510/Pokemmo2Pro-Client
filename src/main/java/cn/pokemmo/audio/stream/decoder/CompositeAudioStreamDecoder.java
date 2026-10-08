package cn.pokemmo.audio.stream.decoder;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.Arrays;

public class CompositeAudioStreamDecoder
extends BaseAudioStreamDecoder {
    public AG0[] N80;
    public final ro_1[] Yz;
    public final int[] Ew;

    public CompositeAudioStreamDecoder(ro_1[] frames, int[] frameTimes) {
        super(frames[0].N80());
        this.Yz = frames;
        if (frameTimes == null || frameTimes.length == 0) {
            this.Ew = new int[frames.length];
            Arrays.fill(this.Ew, 100);
            return;
        }
        if (frameTimes.length == 1) {
            this.Ew = new int[frames.length];
            Arrays.fill(this.Ew, frameTimes[0]);
            return;
        }
        if (frameTimes.length != frames.length) {
            throw new IllegalArgumentException("Invalid frame times length. Expected: " + frames.length + " Has: " + frameTimes.length);
        }
        this.Ew = frameTimes;
    }

    @Override
    public final AG0[] sj() {
        AG0[] aG0Array = this.N80;
        if (this.N80 != null) {
            return aG0Array;
        }
        this.N80 = new AG0[this.Yz.length];
        for (int j = 0; j < this.Yz.length; ++j) {
            this.N80[j] = new AG0(new Wr(new xd_0((Mi) (Object) this, j)), 0, 0, -1, -1);
        }
        return this.N80;
    }

    @Override
    public final boolean tS() {
        return true;
    }

    @Override
    public final int[] ag0() {
        return this.Ew;
    }
}
