package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction012Packet extends Nt implements eb0_0 {
    public final d70_0 bu;

    public StatAction012Packet(d70_0 value) {
        this.bu = value;
    }

    @Override
    public final byte BL0() {
        return 12;
    }

    @Override
    public final void IE0(PF sender, PF target, boolean flag1, boolean flag2, short value, boolean flag3, ML0 context, qn_1 callback) {
        a10_0 state = context.yd0;
        d70_0 previous = state.O00;
        d70_0 current = this.bu;
        Oz0 listener = tw0_0.LD0.he0;
        state.O00 = current;

        if (previous == current) {
            if (current != d70_0.Do) {
                ++state.Xe0;
            }
            if (current == d70_0.Sl0) {
                context.wJ(sm0_0.c0(200400), "", null);
            } else if (current == d70_0.Mt0 || current == d70_0.Ga0) {
                context.wJ(sm0_0.c0(200401), "", null);
            } else if (current == d70_0.HD) {
                context.wJ(sm0_0.c0(200402), "", null);
            } else if (current == d70_0.gh) {
                context.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 95, sm0_0.zb0), "", null);
            } else if (current == d70_0.gl) {
                context.wJ(sm0_0.c0(200369), "", null);
            } else if (current == d70_0.tA) {
                context.wJ(sm0_0.c0(200360), "", null);
            }
        } else if (current == d70_0.Do) {
            state.Xe0 = 0;
            int previousRank = previous.R60;
            if (previousRank > d70_0.HD.R60) {
                if (previous == d70_0.gl) {
                    context.wJ(sm0_0.c0(200367), "", null);
                } else if (previous == d70_0.tA) {
                    context.wJ(sm0_0.c0(200361), "", null);
                }
            } else {
                context.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, previousRank + 88, sm0_0.zb0), "", null);
            }
        } else {
            state.Xe0 = 0;
            if (current == d70_0.Mt0) {
                // The original switch case deliberately produces no message.
            } else if (current == d70_0.gl) {
                context.wJ(sm0_0.c0(200370), "", null);
            } else if (current == d70_0.tA) {
                context.wJ(sm0_0.c0(200362), "", null);
            } else if (current == d70_0.lv) {
                context.wJ(sm0_0.c0(200381), "", null);
            } else {
                context.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, current.R60 + 83, sm0_0.zb0), "", null);
            }
        }

        if (listener != null) {
            listener.fM(current);
        }
    }
}
