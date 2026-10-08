package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleItemBagModifier extends TC0 {
    public final b30_0 BB0;
    public final K10 q1;

    public BattleItemBagModifier(b30_0 var1, K10 var2) {
        this.BB0 = var1;
        this.q1 = var2;
    }

    @Override
    public final void QC(ML0 var1) {
        if (this.BB0.Pp0 == var1.yd0.Ez0()) {
            byte var2 = this.BB0.Pp0;
            PF var3 = var1.yd0.Ce(var2, this.BB0.B6);
            String var4 = var3 != null ? var3.A60() : "";
            switch (this.q1.yF0) {
                case 0:
                    tw0_0.RE0.Hq0((byte)2, (short)1386);
                    var1.wJ(sm0_0.Bw((byte)2, lpt6__2.Q80, 15, 72, sm0_0.zb0), "", null);
                    break;
                case 1:
                    var1.wJ(sm0_0.Bw((byte)2, lpt6__2.Q80, 15, 74, sm0_0.zb0), "", null);
                    break;
                case 2:
                    var1.wJ(sm0_0.c0(5023), "", null);
                    break;
                case 3:
                    var1.wJ(sm0_0.wa0(6067, var4), "", null);
                    var1.wJ(sm0_0.Bw((byte)2, lpt6__2.Q80, 15, 72, sm0_0.zb0), "", null);
                    break;
                case 4:
                    var1.wJ(sm0_0.Bw((byte)2, lpt6__2.Q80, 8, 47, new String[]{var4}), "", null);
                    break;
                default:
                    break;
            }
        }

        if (this.q1 == K10.GM) {
            var1.wJ(sm0_0.wa0(5040, var1.yd0.mn(this.BB0.Pp0).jI()), "", null);
        }
    }
}
