package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleSoundEffectTask extends N60 {
    public boolean vk;
    public final b30_0 iL;
    public final PF AD0;
    public final con__6 zm0;

    public BattleSoundEffectTask(PF v1, b30_0 v2, con__6 v3) {
        this.vk = false;
        this.AD0 = v1;
        this.iL = v2;
        this.zm0 = v3;
    }

    @Override
    public final boolean lPt1() {
        return this.vk;
    }

    @Override
    public final void ii() {
        a10_0 v1 = tw0_0.PK0;
        if (v1 == null) {
            return;
        }
        boolean i2 = this.iL.Pp0 == v1.Ez0();
        byte i3 = this.iL.Pp0;
        byte i4 = this.iL.B6;
        PF v5 = this.AD0;
        PF v6 = v1.wI0[i3][i4];
        if (v6 != null) {
            v6.c20();
        }
        v1.wI0[i3][i4] = v5;

        ML0 v3 = tw0_0.LD0.he0.N10;
        v3.X60(false);
        this.vk = true;
        this.AD0.getClass();

        String text;
        if (i2 && this.zm0 == con__6.Wt0) {
            byte i10 = this.iL.Pp0;
            byte i9 = this.iL.B6;
            O8 o8 = (i9 >= 0 && i10 <= v1.eG.length) ? v1.eG[i10].Sf(i9) : null;
            String strTrainer = o8.M2();
            String strMon = this.AD0.nz0(true);
            text = sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 17, new String[]{strTrainer, strMon});
        } else if (i2) {
            byte oppTrainer = a10_0.Vp0(this.iL.Pp0);
            byte oppSlot = this.iL.B6;
            PF oppMon = v1.Ce(oppTrainer, oppSlot);
            int i4_sub = 11;
            if (oppMon != null) {
                double curHp = (double) oppMon.uk();
                double maxHp = (double) oppMon.zi0.Sj;
                if (curHp < maxHp * 0.75) {
                    if (curHp >= maxHp * 0.5) {
                        i4_sub = 21;
                    } else if (curHp >= maxHp * 0.25) {
                        i4_sub = 22;
                    } else {
                        i4_sub = 24;
                    }
                }
            }
            text = sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, i4_sub, new String[]{this.AD0.A60()});
        } else if (this.zm0 == con__6.pn0) {
            String otherMonName = "";
            int isSpecial = 0;
            PF[] team = v1.wI0[this.iL.Pp0];
            PF normalSlot = null;
            PF specialSlot = null;
            for (int i10 = 0; i10 < team.length; ++i10) {
                PF mon = team[i10];
                if (mon != null && !mon.zi0.hf0() && mon != this.AD0) {
                    if (mon.zi0.Bn.GK0 != xg_1.rv) {
                        normalSlot = mon;
                    } else if (specialSlot == null) {
                        specialSlot = mon;
                    }
                }
            }
            if (normalSlot != null) {
                short itemId = normalSlot.p10();
                if (itemId == 1023 || (itemId >= 1000 && itemId <= 1002)) {
                    isSpecial = 1;
                }
                otherMonName = normalSlot.nz0(true);
            } else if (specialSlot != null) {
                otherMonName = specialSlot.nz0(true);
            }
            if (isSpecial != 0) {
                text = sm0_0.Bx(5037, new String[]{otherMonName, this.AD0.nz0(true)});
            } else if (!otherMonName.isEmpty()) {
                text = sm0_0.Bx(5036, new String[]{otherMonName, this.AD0.nz0(true)});
            } else {
                text = sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 1, new String[]{this.AD0.nz0(true)});
            }
        } else {
            byte i10 = this.iL.Pp0;
            byte i9 = this.iL.B6;
            O8 o8 = (i9 >= 0 && i10 <= v1.eG.length) ? v1.eG[i10].Sf(i9) : null;
            String strTrainer = o8.M2();
            String strMon = this.AD0.nz0(true);
            text = sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 17, new String[]{strTrainer, strMon});
        }

        v3.I1(text, "", null);
        v3.lZ.add(new kw_0(new J40(v1, this.AD0, i2, this.zm0)));
        if (this.AD0.om0()) {
            v3.lZ.add(new cg0_0(v1, null, this.AD0));
        }
        jd0_1 v1_anim = v3.Hi(this.AD0);
        if (v1_anim != null) {
            v1_anim.le0(this.AD0, false, this.AD0.uk());
            v1_anim.Hm(true);
        }
    }

    @Override
    public final NU gJ0() {
        return NU.ha0;
    }
}
