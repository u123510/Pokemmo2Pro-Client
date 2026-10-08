package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.Arrays;

public class BattleMultiTargetFaintAction extends de_1 {

    public BattleMultiTargetFaintAction(byte b, CH0[] arrCH0, short[] arrs) {
        super(b, arrCH0, arrs);
    }

    public static void DO(PF[] arrPF, ML0 ml0) {
        for (PF pf : arrPF) {
            kw_0 kw0 = new kw_0((byte) 0, new H90(pf));
            ml0.lZ.add(kw0);
        }
    }

    public static Runnable QF0(PF[] arrPF, ML0 ml0) {
        return () -> DO(arrPF, ml0);
    }

    @Override
    public final byte BL0() {
        return -25;
    }

    @Override
    public final void IE0(PF pf, PF pf2, boolean z, boolean z2, short s, boolean z3, ML0 ml0, qn_1 qn1) {
        PF[] arrPF = Arrays.stream(ml0.yd0.wI0[this.rA])
                .filter(this::Vj)
                .toArray(PF[]::new);
        String str = "";
        int len = arrPF.length;
        if (len == 1) {
            str = sm0_0.wa0(200518, arrPF[0].Yp());
        } else if (len == 2) {
            str = sm0_0.wa0(200519, sm0_0.Bx(200458, new String[]{arrPF[0].Yp(), arrPF[1].Yp()}));
        } else if (len == 3) {
            str = sm0_0.wa0(200519, sm0_0.Bx(200459, new String[]{arrPF[0].Yp(), arrPF[1].Yp(), arrPF[2].Yp()}));
        }
        ml0.I1(str, "", QF0(arrPF, ml0));
    }

    public final boolean Vj(PF pf) {
        return pf != null && !pf.zi0.hf0() && this.lG0(pf.Zo0());
    }
}
