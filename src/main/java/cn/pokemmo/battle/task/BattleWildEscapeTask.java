package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleWildEscapeTask extends N60 {
    public static final dl_1 hb0;
    public final byte nG;
    public final byte LY;
    public final byte so0;
    public final byte bu0;
    public final short y00;
    public MU R70;
    public boolean oW;
    public final boolean Jo;

    static {
        hb0 = Cq0.E1(BattleWildEscapeTask.class);
    }

    public BattleWildEscapeTask(byte b, byte b2, byte b3, byte b4, short s, boolean z) {
        this.oW = false;
        this.nG = b;
        this.LY = b2;
        this.so0 = b3;
        this.bu0 = b4;
        this.y00 = s;
        this.Jo = z;
    }

    @Override
    public final boolean lPt1() {
        return this.R70 == null || this.R70.bL();
    }

    @Override
    public final void ii() {
        a10_0 a10_0Var = tw0_0.PK0;
        if (a10_0Var == null) {
            return;
        }
        if (this.y00 > 0) {
            vk0_1 vk0_1Var = (vk0_1) ec0_2.Sx().f4.f5(this.y00);
            if (vk0_1Var != null && this.R70 == null) {
                PF pf = null;
                if (this.nG >= 0 && this.LY >= 0) {
                    pf = a10_0Var.wI0[this.nG][this.LY];
                }
                PF pf2 = null;
                if (this.so0 >= 0 && this.bu0 >= 0) {
                    pf2 = a10_0Var.wI0[this.so0][this.bu0];
                }
                if (vk0_1Var.lr0()) {
                    PF[] pfArr = a10_0Var.wI0[this.so0];
                    MU mu = qk_2.cR.import$(pf, vk0_1Var.hC0);
                    mu.kA0(pfArr);
                    this.R70 = mu;
                } else {
                    PF[] pfArr = new PF[]{pf2};
                    MU mu = qk_2.cR.import$(pf, vk0_1Var.hC0);
                    mu.kA0(pfArr);
                    this.R70 = mu;
                }
            }
        }
        if (this.R70 == null && this.y00 > 0) {
            hb0.error(sm0_0.wa0(5033, Integer.toString(this.y00)));
            tw0_0.rl.qK(sm0_0.wa0(5034, Integer.toString(this.y00)));
        }
        if (!this.oW && this.R70 != null) {
            try {
                if (this.Jo) {
                    this.R70.Kh();
                } else {
                    this.R70.us();
                }
            } catch (Exception e) {
                hb0.error(sm0_0.wa0(5033, Integer.toString(this.y00)), e);
                tw0_0.rl.qK(sm0_0.wa0(5034, Integer.toString(this.y00)));
                this.R70 = null;
            }
            this.oW = true;
        }
        tw0_0.LD0.he0.aY = this.R70;
    }

    @Override
    public final NU gJ0() {
        return NU.ig0;
    }
}
