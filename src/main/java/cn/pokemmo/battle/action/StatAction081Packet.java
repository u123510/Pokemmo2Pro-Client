package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction081Packet extends Nt implements eb0_0 {
    public final byte nD;
    public final byte[][] BO;

    public StatAction081Packet(byte type) {
        if (type != 1) {
            throw new RuntimeException();
        }
        this.nD = type;
        this.BO = null;
    }

    public StatAction081Packet(byte type, byte[][] options) {
        if (type != 0) {
            throw new RuntimeException();
        }
        this.nD = type;
        this.BO = options;
    }

    public static void lpt7(ML0 context, int choice, byte[][] options, byte[] scores) {
        context.wJ(sm0_0.c0(choice + 206002), "", () -> wc(context, choice, options));
        byte first = options[0][choice];
        byte second = options[1][choice];
        if (first == second) {
            ++scores[0];
            ++scores[1];
        } else if (first > second) {
            scores[0] = (byte)(scores[0] + 2);
        } else {
            scores[1] = (byte)(scores[1] + 2);
        }
    }

    public static void wc(ML0 context, int choice, byte[][] options) {
        fk0_0 selector = context.SB;
        if (selector != null) {
            selector.Pw(choice, options);
        }
    }

    @Override
    public final byte BL0() {
        return 81;
    }

    @Override
    public final void IE0(PF ignoredFirst, PF ignoredSecond, boolean ignoredThird, boolean ignoredFourth,
            short ignoredFifth, boolean ignoredSixth, ML0 context, qn_1 ignoredSeventh) {
        byte type = this.nD;
        a10_0 battle = context.yd0;
        if (battle == null) {
            return;
        }

        byte firstIndex = battle.Ez0();
        byte secondIndex = battle.eI();
        PF first = battle.Ce(firstIndex, (byte)0);
        PF second = battle.Ce(secondIndex, (byte)0);
        if (first == null || second == null) {
            return;
        }

        String[] names = {first.A60(), second.A60()};
        if (type != 0) {
            if (type == 1) {
                context.wJ(sm0_0.vs(206008, new byte[]{5, 6}, names), "", null);
            }
            return;
        }

        byte[][] options = this.BO;
        if (context.SB == null) {
            fk0_0 selector = new fk0_0(first.A60(), second.A60());
            context.SB = selector;
            context.F9(context.fU(), selector);
        }

        byte[] scores = new byte[2];
        for (int round = 0; round < 4; ++round) {
            if (round == 0) {
                context.wJ(sm0_0.c0(206001), "", null);
            } else {
                int choice = round - 1;
                lpt5__5.hL.ZD(() -> lpt7(context, choice, options, scores), (long)(round * 2000));
            }
        }

        lpt5__5.hL.ZD(
                () -> this.lF(scores, context, names, second, first, firstIndex, secondIndex, battle), 8500L);
    }

    public final void lF(byte[] scores, ML0 context, String[] names, PF second, PF first,
            byte firstIndex, byte secondIndex, a10_0 battle) {
        byte firstScore = scores[0];
        byte secondScore = scores[1];
        if (firstScore == secondScore) {
            context.wJ(sm0_0.c0(206007), "", null);
            context.wJ(sm0_0.vs(205360, new byte[]{5, 6}, names), "", null);
            context.lZ.add(new kw_0(new X00(context, second, true)));
            context.lZ.add(new kw_0(new X00(context, first, true)));
        } else {
            byte winner = (byte)(firstScore > secondScore ? 0 : 1);
            byte[] format = {0, 1, 35, 5};
            String[] values = new String[4];
            values[0] = Byte.toString(scores[secondIndex]);
            values[1] = Byte.toString(scores[firstIndex]);
            values[2] = battle.mn(winner).M2();
            values[3] = winner == firstIndex ? first.A60() : second.A60();
            context.wJ(sm0_0.vs(206005, format, values), "", null);
            int message = (firstIndex == winner ? 358 : 359) + 205000;
            context.wJ(sm0_0.vs(message, new byte[]{5, 6}, names), "", null);
            context.lZ.add(new kw_0(new X00(context, battle.Ce(a10_0.Vp0(winner), (byte)0), true)));
        }

        context.lZ.add(new t30_0(context, first, second));
    }
}
