package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.Arrays;

public class BattleMultiTargetExpAction extends de_1 {
    public BattleMultiTargetExpAction(byte b, CH0[] cH0Arr, short[] sArr) {
        super(b, cH0Arr, sArr);
    }

    public static PF[] kC0(int i) {
        return new PF[i];
    }

    @Override
    public final byte BL0() {
        return (byte) -24;
    }

    @Override
    public final void IE0(PF pf, PF pf2, boolean z, boolean z2, short s, boolean z3, ML0 ml0, qn_1 qn_1) {
        a10_0 a10 = ml0.yd0;
        PF[] targets = Arrays.stream(a10.wI0[this.rA])
                .filter(this::jA)
                .toArray(BattleMultiTargetExpAction::kC0);
        String msg = sm0_0.c0(200394);
        Runnable action = ls0(ml0, pf, targets);
        ml0.wJ(msg, "", action);
    }

    public final Runnable ls0(ML0 ml0, PF pf, PF[] pfArr) {
        return () -> NU(ml0, pf, pfArr);
    }

    public final void NU(ML0 ml0, PF pf, PF[] pfArr) {
        ml0.lZ.add(new kw_0((byte) 0, new yv_1(pf, true, pfArr)));
        for (PF target : pfArr) {
            short s = Nr(target.Zo0());
            if (s != -1 && s != target.uk()) {
                target.F(s);
                ml0.lZ.add(new wc_1(target, ml0.Hi(target)));
                if (target.zi0.hf0()) {
                    ml0.lZ.add(new kw_0(new X00(ml0, target, true)));
                }
            }
        }
    }

    public final boolean jA(PF pf) {
        return pf != null && !pf.zi0.hf0() && lG0(pf.Zo0());
    }
}
