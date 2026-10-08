package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.Arrays;
import java.util.stream.Stream;

public class BattleMultiTargetStatAction extends de_1 {
    public BattleMultiTargetStatAction(byte b, CH0[] arr1, short[] arr2) {
        super(b, arr1, arr2);
    }

    public static boolean mm(PF v0) {
        return v0 != null && !v0.zi0.hf0();
    }

    public static boolean eG(PF v0, PF v1) {
        return v1.cD0 != v0.cD0;
    }

    public static boolean Wu(PF v0, PF v1) {
        return v1.cD0 == v0.cD0 && v1 != v0;
    }

    @Override
    public final byte BL0() {
        return (byte) -27;
    }

    @Override
    public final void IE0(PF v1, PF v2, boolean i3, boolean i4, short i5, boolean i6, ML0 v7, qn_1 v8) {
        a10_0 v2_a10 = v7.yd0;
        PF[] v3_arr = Arrays.stream(v2_a10.wI0)
                .flatMap(Stream::of)
                .filter(p -> K60(v1, p))
                .toArray(PF[]::new);

        PF[] v4_allies = Arrays.stream(v3_arr)
                .filter(p -> Wu(v1, p))
                .toArray(PF[]::new);

        PF[] v5_enemies = Arrays.stream(v3_arr)
                .filter(p -> eG(v1, p))
                .toArray(PF[]::new);

        v7.lZ.add(new kw_0((byte) 0, new yg_2(v1, v4_allies, v5_enemies)));

        for (int i = 0; i < v3_arr.length; ++i) {
            PF target = v3_arr[i];
            short form = Nr(target.Zo0());
            if (form != -1 && form != target.uk()) {
                target.F(form);
                v7.lZ.add(new ps_0(target, v7.Hi(target)));
                if (target.zi0.hf0()) {
                    v7.lZ.add(new kw_0(new X00(v7, target, true)));
                }
            }
        }

        if (lG0(v1.Zo0())) {
            v1.F(Nr(v1.Zo0()));
            v7.lZ.add(new ii_1(v1, v7.Hi(v1), new u60_0(v1).vv(v1), false, false));
        }

        tu0_0.mk(v1, 200395, v7, "", null);
        v7.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 101, sm0_0.zb0), "", null);

        PF[] activeMons = Arrays.stream(v2_a10.wI0)
                .flatMap(Stream::of)
                .filter(BattleMultiTargetStatAction::mm)
                .toArray(PF[]::new);

        for (PF mon : activeMons) {
            mon.Ah();
            v7.Hi(mon).XO();
        }
    }

    public final boolean K60(PF v1, PF v2) {
        return v2 != null && lG0(v2.Zo0()) && v2 != v1;
    }
}
