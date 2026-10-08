/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.shader.uniform;

import f.*;
import java.util.*;


import f.HH0;
import f.W00;
import f.Wm0;
import f.wh_0;

/*
 * Renamed from f.lI
 */
public class InvViewProjMatrixUniformSetter
extends BaseGlobalUniformSetter {
    @Override
    public void set(Wm0 wm0, int n, W00 w00, wh_0 wh_02) {
        wm0.set(n, wm0.camera.iJ);
    }
}

