package cn.pokemmo.audio.track;

import f.LB0;
import f.ao_1;
import f.pw_1;

public abstract class AudioTrackFilterHelper {
    public static pw_1 applyFilter(LB0 lB0, pw_1 pw_12, float f) {
        return pw_12.y80(ao_1.pc(lB0)).p1(f);
    }

    public static pw_1 Ri0(LB0 lB0, pw_1 pw_12, float f) {
        return applyFilter(lB0, pw_12, f);
    }
}
