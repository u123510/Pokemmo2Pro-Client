package cn.pokemmo.command.console;

import f.*;
import java.util.*;


public class RaidAnimTestConsoleCommand extends BaseConsoleCommand {
    public RaidAnimTestConsoleCommand() {
        super("raidanimtest");
    }

    @Override
    public void Hh(String[] arguments) {
        if (arguments.length < 3) {
            WY.Ba0("用法: >raidanimtest [队伍ID] [槽位ID]");
            return;
        }

        if (tw0_0.PK0 == null || tw0_0.LD0.he0 == null) {
            WY.Ba0("必须在对战中才能使用此指令。");
            return;
        }

        byte team;
        byte slot;
        try {
            team = Byte.parseByte(arguments[1]);
            slot = Byte.parseByte(arguments[2]);
        } catch (Exception exception) {
            exception.printStackTrace();
            return;
        }

        O00 ignoredRandom = LW.Yu;
        if (team < 0) {
            team = 0;
        } else if (team > 1) {
            team = 1;
        }

        Cq teamConfig = tw0_0.PK0.nf;
        int maxSlot = (team > 0 ? teamConfig.Lw0 : teamConfig.e50) - 1;
        if (slot < 0) {
            slot = 0;
        } else if (slot > maxSlot) {
            slot = (byte) maxSlot;
        }

        ((vr_1) tw0_0.LD0.he0).OB0.end();
        ((vr_1) tw0_0.LD0.he0).OB0.Vk.Wd0();

        PF target = tw0_0.PK0.Ce(team, slot);
        ML0 context = tw0_0.LD0.he0.N10;
        ML0 ignoredContext = tw0_0.LD0.he0.N10;

        C8 position = target.LpT9.j;
        position.getClass();
        new C8(position);

        zd0_0 animation = new zd0_0(target, target.zi0.Sj);
        context.lZ.add(new kw_0(animation));
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
