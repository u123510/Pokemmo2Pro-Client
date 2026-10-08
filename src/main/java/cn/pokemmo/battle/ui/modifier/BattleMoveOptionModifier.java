package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleMoveOptionModifier extends TC0 {
    public final VU sk;
    public final boolean fj;

    public BattleMoveOptionModifier(VU v1, boolean i2) {
        super();
        this.sk = v1;
        this.fj = i2;
    }

    public final void QC(ML0 v1) {
        VU v2 = this.sk;
        if (v2.u60 < 1) {
            return;
        }
        jn_2 jn = tw0_0.LD0.IK(v2, this.fj);
        v1.lZ.add(new pq_0(jn, this.fj));
    }
}
