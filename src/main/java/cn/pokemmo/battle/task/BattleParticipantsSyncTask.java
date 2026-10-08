package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleParticipantsSyncTask extends N60 {
    public final /* synthetic */ vq_0 Gv0;
    public final /* synthetic */ ML0 qc0;
    public final /* synthetic */ PF[] sq0;

    public BattleParticipantsSyncTask(vq_0 v1, ML0 v2, PF[] v3) {
        super();
        this.Gv0 = v1;
        this.qc0 = v2;
        this.sq0 = v3;
    }

    public final void ii() {
        this.qc0.X60(false);
        for (int i1 = 0; i1 < this.sq0.length; i1++) {
            PF pf = this.sq0[i1];
            if (pf != null) {
                pf.lPT2();
            }
            jd0_1 jd = this.qc0.Tb0[this.Gv0.HJ][(byte) i1];
            if (jd != null) {
                boolean hasPf = this.sq0[i1] != null;
                jd.Hm(hasPf);
                jd.z2(this.sq0[i1]);
            }
        }
    }

    public final boolean lPt1() {
        return true;
    }

    public final NU gJ0() {
        return NU.Yt;
    }

    public final boolean gL0() {
        return true;
    }
}
