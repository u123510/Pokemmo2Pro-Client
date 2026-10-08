package cn.pokemmo.command.console;

import f.*;
import java.util.*;


public class BattleActionConsoleCommand extends BaseConsoleCommand {
    public BattleActionConsoleCommand() {
        super("ba");
    }

    public static void ei(PF pF, boolean bl, a10_0 battle) {
        pF.wb0(bl);
        jk_0 model = pF.qi;
        model.yJ = pF.vF(battle);
        model.tX = pF.h90(battle);
    }

    @Override
    public void Hh(String[] args) {
        byte teamId = 0;
        byte slotId = 0;
        if (args.length < 2) {
            WY.Ba0("用法: >ba <spawn|despawn|reset|setsprite|info> [队伍ID] [槽位ID]");
            return;
        }
        if (tw0_0.PK0 == null) {
            zy0_0.CF0.Xt("必须在对战中才能使用此指令。", "red");
            return;
        }
        if (args.length == 3) {
            try {
                teamId = Byte.parseByte(args[2]);
            } catch (NumberFormatException ex) {
                zy0_0.CF0.Xt("队伍ID解析错误，请检查输入。", "red");
                return;
            }
        }
        if (args.length > 4) {
            try {
                teamId = Byte.parseByte(args[2]);
                slotId = Byte.parseByte(args[3]);
            } catch (NumberFormatException ex) {
                zy0_0.CF0.Xt("队伍ID解析错误，请检查输入。", "red");
                return;
            }
        }

        a10_0 battle = tw0_0.PK0;
        PF pF = battle.Ce(teamId, slotId);
        jk_0 model = pF.qi;
        boolean ownSide = battle.eI() == a10_0.Vp0(teamId);

        if (args[1].equals("setsprite")) {
            if (args.length != 5) {
                WY.Ba0("用法: >ba setsprite <队伍ID> <槽位ID> <宝可梦ID>");
                return;
            }
            try {
                pF.p10();
                short monsterId = Short.parseShort(args[4]);
                pF.rm0 = monsterId;
                pF.Z10 = (cq_0) mp_1.vf0().k2.get(Short.valueOf(monsterId));
                lg_0.k.lPT5(() -> DC.ei(pF, ownSide, battle));
            } catch (NumberFormatException ex) {
                zy0_0.CF0.Xt("宝可梦ID解析错误，请检查输入。", "red");
            }
            return;
        }

        if (args[1].equals("info")) {
            WY.Ba0("\n");
            WY.Ba0(">> 坐标位置 = " + pF.qi.yJ + " / " + pF.qi.tX);
            WY.Ba0(">> 不透明度 = " + pF.qi.J5);
            WY.Ba0(">> 缩放 x/y = " + pF.qi.fj0 + " / " + pF.qi.I40);
            WY.Ba0(">> 缩放 y = " + pF.qi.I40);
            model.cOm6 = model.dq();
            model.wN = model.native$();
            return;
        }

        if (args[1].equals("reset")) {
            model.fj0 = 1.0f;
            model.I40 = 1.0f;
            model.J5 = 255;
            model.kH0();
            model.cOm6 = model.dq();
            model.wN = model.native$();
            model.yJ = pF.vF(battle);
            model.tX = pF.h90(battle);
        }
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
