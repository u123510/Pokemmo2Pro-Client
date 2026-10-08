/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.script.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.W00;
import f.Wm0;
import f.cc0_2;
import f.mz_2;
import f.oc0_0;
import f.ph0_2;
import f.wh_0;

public class ScriptVarCompareNotEqualAction extends BaseScriptAction {
    @Override
    public final void set(Wm0 wm0, int n, W00 w00, wh_0 wh_02) {
        cc0_2 cc0_22 = wm0.context.iG;
        wm0.set(n, ((ph0_2)cc0_22).d30(((mz_2)wh_02.sg((long)mz_2.yS)).I3));
    }
}

