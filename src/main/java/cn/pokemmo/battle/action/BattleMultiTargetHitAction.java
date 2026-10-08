package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.Arrays;

public class BattleMultiTargetHitAction extends de_1 {

    public BattleMultiTargetHitAction(byte b, CH0[] cH0Array, short[] sArray) {
        super(b, cH0Array, sArray);
    }

    public static /* synthetic */ PF[] Uy(int i) {
        return new PF[i];
    }

    @Override
    public final byte BL0() {
        return -23;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        PF[] pFArray = (PF[]) Arrays.stream(mL0.yd0.wI0[this.rA]).filter(this::nC).toArray(BattleMultiTargetHitAction::Uy);
        if (mL0.yd0.Ez0() == this.rA) {
            mL0.wJ(sm0_0.c0(200510), "", Wp(pFArray, mL0));
        } else {
            mL0.wJ(sm0_0.c0(200511), "", Wp(pFArray, mL0));
        }
    }

    public final Runnable Wp(PF[] pFArray, ML0 mL0) {
        return () -> tv(pFArray, mL0);
    }

    public final void tv(PF[] pFArray, ML0 mL0) {
        for (PF pF : pFArray) {
            short s = Nr(pF.Zo0());
            if (s != -1 && s != pF.uk()) {
                pF.F(s);
                mL0.lZ.add(new lpt2__4(pF, mL0.Hi(pF)));
                mL0.lZ.add(new kw_0((byte) 0, new EE0(pF).vv(pF)));
                if (pF.zi0.hf0()) {
                    mL0.lZ.add(new kw_0(new X00(mL0, pF, true)));
                }
            }
        }
    }

    public final boolean nC(PF pF) {
        if (pF != null && !pF.zi0.hf0() && lG0(pF.Zo0())) {
            return true;
        }
        return false;
    }
}
