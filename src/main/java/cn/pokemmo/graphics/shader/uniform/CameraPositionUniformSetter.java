/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.shader.uniform;

import f.*;
import java.util.*;


import f.C8;
import f.HH0;
import f.Tv0;
import f.W00;
import f.Wm0;
import f.wh_0;

public class CameraPositionUniformSetter
extends BaseGlobalUniformSetter {
    @Override
    public void set(Wm0 wm0, int n, W00 w00, wh_0 wh_02) {
        Wm0 wm02 = wm0;
        Tv0 tv0 = wm02.camera;
        C8 c8 = tv0.v40;
        float f = c8.x;
        float f2 = c8.y;
        float f3 = c8.z;
        float f4 = tv0.Qy;
        float f5 = 1.1881f / (f4 * f4);
        wm02.set(n, f, f2, f3, f5);
    }
}

