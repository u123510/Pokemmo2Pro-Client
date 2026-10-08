package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.Arrays;

public class StatActionNeg036Packet extends Nt implements eb0_0 {
    public final short F2;
    public final CH0[] NL0;

    public StatActionNeg036Packet(short s, CH0[] cH0Array) {
        this.F2 = s;
        this.NL0 = cH0Array;
    }

    public static /* synthetic */ PF[] nO(int i) {
        return new PF[i];
    }

    @Override
    public final byte BL0() {
        return -36;
    }

    @Override
    public final void IE0(PF pF, PF pF2, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        a10_0 a10_02 = mL0.yd0;
        int n = 200591;
        byte b = a10_0.Vp0(pF.cD0);
        if (b != a10_02.Ez0()) {
            O8 o8 = a10_02.mn(b);
            o8.getClass();
            if (o8 instanceof ux_0) {
                n = 200592;
            } else {
                n = 200593;
            }
        }
        mL0.wJ(sm0_0.wa0(n, sm0_0.c0(((vk0_1) ec0_2.Sx().f4.f5(this.F2)).bt)), "", () -> U9(pF2, mL0, pF));
    }

    public final void U9(PF pF, ML0 mL0, PF pF2) {
        byte b = a10_0.Vp0(pF.cD0);
        PF[] pFArray = (PF[]) Arrays.stream(mL0.yd0.wI0[b]).filter(this::P00).toArray(StatActionNeg036Packet::nO);
        mL0.lZ.add(new kw_0((byte) 0, new lpt7__5(pF2, pFArray)));
    }

    public final boolean P00(PF pF) {
        if (pF != null && !pF.zi0.hf0() && S.ZT(pF.Zo0(), this.NL0)) {
            return true;
        }
        return false;
    }
}
