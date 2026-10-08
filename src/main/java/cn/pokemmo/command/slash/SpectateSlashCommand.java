package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


public class SpectateSlashCommand extends BaseSlashCommand {


    public SpectateSlashCommand() {
        super("/spectate");
    }


    public void sr0(String[] v1) {
        if (v1.length < 2) {
            tw0_0.rl.jC("用法: /spectate <目标玩家名>", zo_0.Dd);
            return;
        }
        E90 target = tw0_0.e60.xA(v1[1]);
        if (target == null) {
            tw0_0.rl.jC(sm0_0.c0(68), zo_0.Dd);
            return;
        }
        tw0_0.rl.fk0.uQ(new da0_1(target.pu));
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
