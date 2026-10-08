package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


public class EvoDebugSlashCommand extends BaseSlashCommand {
    public EvoDebugSlashCommand() {
        super("/evodebug");
    }

    @Override
    public void sr0(String[] args) {
        VU monster = tw0_0.rl.r1(_volatile.BV).Ry0((short) 0);
        if (monster == null) {
            tw0_0.rl.jC("没有可用的宝可梦", zo_0.Pk);
            return;
        }
        java.util.ArrayList evolutions = monster.f60.Xn;
        if (evolutions.size() < 1) {
            tw0_0.rl.jC("当前宝可梦无法进化", zo_0.Pk);
            return;
        }
        monster.u60 = ((P80) evolutions.get(0)).YS;
        tw0_0.LD0.IK(monster, true);
    }

    @Override
    public final int qo0() {
        return 8;
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
