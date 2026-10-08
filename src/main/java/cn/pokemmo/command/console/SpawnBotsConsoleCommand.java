package cn.pokemmo.command.console;

import f.*;
import java.util.*;


public class SpawnBotsConsoleCommand extends BaseConsoleCommand {
    public SpawnBotsConsoleCommand() {
        super("spawnbots");
    }

    @Override
    public void Hh(String[] strArr) {
        int spawned = 0;
        for (int dx = -5; dx < 5; dx++) {
            for (int dy = -5; dy < 5; dy++) {
                CH0 ch0 = q20_0.do0.vJ();
                byte b = (byte) rg0_2.r4(1);
                qe0_2 qe02 = new qe0_2();
                qe02.Fw = (byte) rg0_2.j40(0, 4);

                q10_0 q10_VI = q10_0.VI;
                short s_VI = (short) (byte) rg0_2.j40(0, q10_VI.Fk.Rv - 1);
                byte b_VI = (byte) rg0_2.j40(0, 47);
                qe02.pr[q10_VI.iL] = s_VI;
                qe02.iu0[q10_VI.iL] = b_VI;

                byte b_uz = (byte) rg0_2.j40(0, 47);
                short s_uz = (short) (byte) rg0_2.j40(2, 2);
                qe02.KA0(b_uz, q10_0.uz, s_uz);

                q10_0 q10_rg0 = q10_0.rg0;
                short s_rg0 = (short) (byte) rg0_2.j40(-1, q10_rg0.Fk.Rv - 1);
                byte b_rg0 = (byte) rg0_2.j40(0, 47);

                q10_0 q10_Ci = q10_0.Ci;
                short s_Ci = (short) (byte) rg0_2.j40(-1, q10_Ci.Fk.Rv - 1);
                byte b_Ci = (byte) rg0_2.j40(0, 47);

                q10_0 q10_bb = q10_0.bb;
                short s_bb = (short) (byte) rg0_2.j40(0, q10_bb.Fk.Rv - 1);
                byte b_bb = (byte) rg0_2.j40(0, 47);

                q10_0 q10_Xl = q10_0.Xl;
                short s_Xl = (short) (byte) rg0_2.j40(-1, q10_Xl.Fk.Rv - 1);
                byte b_Xl = (byte) rg0_2.j40(0, 47);

                q10_0 q10_pv = q10_0.pv;
                short s_pv = (short) (byte) rg0_2.j40(0, q10_pv.Fk.Rv - 1);
                byte b_pv = (byte) rg0_2.j40(0, 47);

                q10_0 q10_l3 = q10_0.l3;
                short s_l3 = (short) (byte) rg0_2.j40(0, q10_l3.Fk.Rv - 1);
                byte b_l3 = (byte) rg0_2.j40(0, 47);

                qe02.pr[q10_rg0.iL] = s_rg0;
                qe02.iu0[q10_rg0.iL] = b_rg0;
                qe02.pr[q10_Ci.iL] = s_Ci;
                qe02.iu0[q10_Ci.iL] = b_Ci;
                qe02.pr[q10_bb.iL] = s_bb;
                qe02.iu0[q10_bb.iL] = b_bb;
                qe02.pr[q10_Xl.iL] = s_Xl;
                qe02.iu0[q10_Xl.iL] = b_Xl;
                qe02.pr[q10_pv.iL] = s_pv;
                qe02.iu0[q10_pv.iL] = b_pv;
                qe02.pr[q10_l3.iL] = s_l3;
                qe02.iu0[q10_l3.iL] = b_l3;

                q10_0 q10_Bj0 = q10_0.Bj0;
                short s_Bj0 = (short) rg0_2.j40(0, q10_Bj0.Fk.Rv - 1);
                byte b_Bj0 = (byte) rg0_2.j40(0, 47);
                qe02.pr[q10_Bj0.iL] = s_Bj0;
                qe02.iu0[q10_Bj0.iL] = b_Bj0;

                zv_2 pos = tw0_0.e60.jB0.ba0.Xr();
                zv_2 playerPos = tw0_0.e60.jB0.ba0;
                _else elseMap = (_else) tw0_0.e60.E6.get(J4.iA0(playerPos.uS, playerPos.o0, playerPos.ID0));
                LT lt = elseMap.Fn((short) (pos.Lq0 + dx), (short) (pos.B5 + dy), 0);
                pos.PX(false, (short) (pos.Lq0 + dx), (short) (pos.B5 + dy), pos.JT, (byte) 0);

                if (lt != null && !lt.LPt1()) {
                    spawned++;
                    tw0_0.e60.Jb0(ch0, b, qe02, "Bot", (byte) 0, pos, (byte) 0, RL0.S60, (byte) -1, (short) -1, (short) 0, (byte) 0, "BOT");
                }
            }
        }
        WY.Ba0("已生成虚拟机器人数量: " + spawned);
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
