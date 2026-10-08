package cn.pokemmo.battle.tournament;

import f.*;

import java.text.NumberFormat;
import java.util.HashMap;

public class TournamentEventDescriptor {
    public final CH0 LB0;
    public final byte NO;
    public final byte wn0;
    public final String va0;
    public final short H10;
    public final Cq kl;
    public final long th0;
    public final byte Ib0;
    public final int lg0;
    public i9[] ab0;
    public final byte Fb0;
    public JN[] SM;
    public U80[] eY;
    public HashMap X0;
    public final N2[] i30;
    public final boolean o9;
    public final boolean CoM8;

    public static short dR(short i0, short i1) {
        short s = 0;
        int i3 = 0;
        while (true) {
            i1 = (short) (i1 / 2);
            if (i1 <= 0) {
                break;
            }
            int i4 = i3 + i1;
            i3 = i4;
            if (i4 > i0) {
                break;
            }
            s = (short) (s + 1);
        }
        return s;
    }

    public TournamentEventDescriptor(CH0 ch0, byte b, byte b2, String str, short s, byte b3, Cq cq, long j, byte b4, int i, byte b5, boolean z, boolean z2) {
        this.ab0 = new i9[0];
        this.SM = null;
        this.X0 = new HashMap();
        this.LB0 = ch0;
        this.NO = b;
        this.wn0 = b2;
        this.va0 = str;
        this.H10 = s;
        this.i30 = N2.qk0(b3);
        this.kl = cq;
        this.th0 = j;
        this.Ib0 = b4;
        this.lg0 = i;
        this.Fb0 = b5;
        this.o9 = z;
        boolean com8 = false;
        if (z && av_1.ai(cq, Ge()) != null) {
            com8 = z2;
        }
        if (b4 == 1) {
            com8 = true;
        }
        this.CoM8 = com8;
        El0();
    }

    public final void El0() {
        this.eY = new U80[(short) (this.H10 - 1)];
        for (short s = 0; s < this.eY.length; s = (short) (s + 1)) {
            this.eY[s] = new U80(s, dR(s, this.H10));
        }
    }

    public final CH0 X00() {
        return this.LB0;
    }

    public final String Y10() {
        if (this.va0.startsWith("SEASONFINALE")) {
            byte season = 0;
            av_1 av_1Var = null;
            boolean isFirst = false;
            try {
                String[] parts = this.va0.split("-");
                season = Byte.parseByte(parts[1]);
                av_1Var = (av_1) av_1.rh.BM(Byte.parseByte(parts[2]));
                isFirst = Integer.parseInt(parts[3]) > 0;
            } catch (Exception ignored) {
            }
            String tierName = "?";
            if (av_1Var != null) {
                if (av_1Var.k10) {
                    av_1[] allTiers = av_1.Vk0;
                    int len = allTiers.length;
                    int i = 0;
                    while (true) {
                        if (i >= len) {
                            av_1Var = null;
                            break;
                        }
                        av_1 candidate = allTiers[i];
                        if (candidate.Lq == av_1Var.Lq && !candidate.k10) {
                            av_1Var = candidate;
                            break;
                        }
                        i++;
                    }
                }
                if (av_1Var != null) {
                    tierName = av_1Var.toString();
                }
            }
            String rankType = sm0_0.c0(isFirst ? 5403 : 5404);
            return sm0_0.Bx(5402, new String[]{tierName, season + "", rankType});
        }
        return sm0_0.dd(this.va0);
    }

    public final N2 Ge() {
        return N2.d6(this.i30);
    }

    public final String FA() {
        byte b = this.Ib0;
        if (b == 1) {
            return sm0_0.c0(9121);
        }
        if (b == 2) {
            return "$" + NumberFormat.getInstance().format((long) this.lg0);
        }
        if (b == 3) {
            return NumberFormat.getInstance().format((long) this.lg0) + " " + sm0_0.c0(121);
        }
        return sm0_0.c0(nf0_0.Po);
    }

    public final U80 MO(short i1) {
        if (i1 >= 0 && this.eY != null && i1 < this.eY.length) {
            return this.eY[i1];
        }
        return null;
    }
}
