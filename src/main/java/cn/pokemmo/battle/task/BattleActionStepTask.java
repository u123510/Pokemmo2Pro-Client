/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.ML0;
import f.N60;
import f.NU;
import f.PF;
import f.a10_0;
import f.b30_0;
import f.jc_0;
import f.jd0_1;

/*
 * Renamed from f.eh0
 */
public class BattleActionStepTask
extends N60 {
    public final /* synthetic */ ML0 NUl;
    public final /* synthetic */ PF Zu0;
    public final /* synthetic */ PF B1;
    public final /* synthetic */ jc_0 QE0;

    public BattleActionStepTask(jc_0 jc_02, ML0 mL0, PF pF, PF pF2) {
        this.QE0 = jc_02;
        this.NUl = mL0;
        this.Zu0 = pF;
        this.B1 = pF2;
    }

    @Override
    public final void ii() {
        BattleActionStepTask eh0_12 = this;
        Object object = eh0_12.NUl.yd0;
        jc_0 jc_02 = eh0_12.QE0;
        b30_0 b30_02 = jc_02.et0;
        byte by = b30_02.Pp0;
        byte by2 = b30_02.B6;
        byte by3 = jc_02.np0;
        PF pF = ((a10_0)object).wI0[by][by2];
        if (pF != null && !pF.zi0.hf0()) {
            PF pF2 = ((a10_0)object).wI0[by][by3];
            if (pF2 != null) {
                pF2.Kj0 = by2;
                pF2.lPT2();
            }
            pF.Kj0 = by3;
            pF.lPT2();
            ((a10_0)object).wI0[by][by3] = pF;
            ((a10_0)object).wI0[by][by2] = pF2;
            ((a10_0)object).mn(by).Im(by2, by3);
        }
        BattleActionStepTask eh0_13 = this;
        eh0_13.NUl.X60(false);
        object = eh0_13.NUl.Hi(this.Zu0);
        if (object != null) {
            ((jd0_1)object).Hm(true);
        }
        BattleActionStepTask eh0_14 = this;
        eh0_14.NUl.Hi(this.Zu0).z2(this.Zu0);
        object = eh0_14.B1;
        if (object != null) {
            if ((object = this.NUl.Hi((PF)object)) != null) {
                ((jd0_1)object).Hm(true);
            }
            this.NUl.Hi(this.B1).z2(this.B1);
        }
    }

    @Override
    public final boolean lPt1() {
        return true;
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }

    @Override
    public final boolean gL0() {
        return true;
    }
}

