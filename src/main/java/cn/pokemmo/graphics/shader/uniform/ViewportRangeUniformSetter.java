/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.shader.uniform;

import f.*;
import java.util.*;


import f.HH0;
import f.Tv0;
import f.W00;
import f.Wm0;
import f.wh_0;

/*
 * Renamed from f.kI
 */
public class ViewportRangeUniformSetter
extends BaseGlobalUniformSetter {
    @Override
    public void set(Wm0 wm0, int n, W00 w00, wh_0 wh_02) {
        Wm0 wm02 = wm0;
        Tv0 tv0 = wm02.camera;
        float f = tv0.Wu0;
        float f2 = tv0.Qy;
        wm02.set(n, f, f2);
    }
}

