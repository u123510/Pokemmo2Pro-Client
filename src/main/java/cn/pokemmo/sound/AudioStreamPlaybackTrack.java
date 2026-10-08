package cn.pokemmo.sound;

import f.*;

public class AudioStreamPlaybackTrack implements wx_1 {
    public static long Oa = 0L;
    public static final long D70;
    public static final int tn0 = 0;
    public int Je0;
    public Sz0 n50;
    public Hh dD0;
    public final ij_1[] lpT8;
    public final int[] Ku0;
    public final int TP;

    public AudioStreamPlaybackTrack(float interval, es_1 frames) {
        int count = frames.KB;
        this.lpT8 = new ij_1[count];
        int frameDuration = (int) (interval * 1000.0f);
        this.TP = frameDuration * count;
        this.Ku0 = new int[count];
        for (int index = 0; index < count; index++) {
            this.lpT8[index] = (ij_1) frames.get(index);
            this.Ku0[index] = frameDuration;
        }
    }

    public AudioStreamPlaybackTrack(Nn0 durations, es_1 frames) {
        this.lpT8 = new ij_1[frames.KB];
        this.Ku0 = durations.Ni();
        int total = 0;
        for (int index = 0; index < durations.Ml; index++) {
            this.lpT8[index] = (ij_1) frames.get(index);
            total += durations.X8(index);
        }
        this.TP = total;
    }

    static {
        D70 = System.currentTimeMillis();
    }

    @Override
    public final int tL0() {
        return this.Je0;
    }

    public final ij_1 lpT9() {
        ij_1[] frames = this.lpT8;
        int remaining = (int) (Oa % this.TP);
        for (int index = 0; index < this.Ku0.length; index++) {
            int duration = this.Ku0[index];
            if (remaining <= duration) {
                return frames[index];
            }
            remaining -= duration;
        }
        throw new nf_1("Could not determine current animation frame in AnimatedTiledMapTile.  This should never happen.");
    }

    @Override
    public final LPT6_ LT() {
        return this.lpT9().oE0;
    }

    @Override
    public final float OS() {
        return this.lpT9().LPt9;
    }

    @Override
    public final float Yl0() {
        return this.lpT9().f70;
    }

    @Override
    public final Sz0 oZ() {
        if (this.n50 == null) {
            this.n50 = new Sz0();
        }
        return this.n50;
    }

    @Override
    public final Hh pA() {
        if (this.dD0 == null) {
            this.dD0 = new Hh();
        }
        return this.dD0;
    }
}
