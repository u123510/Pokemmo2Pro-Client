/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.script.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.W00;
import f.Wm0;
import f.mz_2;
import f.oc0_0;
import f.wh_0;

/*
 * Renamed from f.Dj
 */
public class ScriptVarClampAction extends BaseScriptAction {
    @Override
    public final void set(Wm0 wm0, int n, W00 w00, wh_0 wh_02) {
        mz_2 mz_22 = (mz_2)wh_02.sg(mz_2.Dh0);
        float f = mz_22.B50;
        float f2 = mz_22.j70;
        float f3 = mz_22.m90;
        float f4 = mz_22.aU;
        wm0.set(n, f, f2, f3, f4);
    }
}

