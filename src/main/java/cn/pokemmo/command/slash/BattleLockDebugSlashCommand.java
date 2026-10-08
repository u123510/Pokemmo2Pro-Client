package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


public class BattleLockDebugSlashCommand extends BaseSlashCommand {
    public BattleLockDebugSlashCommand() {
        super("/battlelockdebug", false);
    }

    @Override
    public void sr0(String[] args) {
        Oz0 renderState = tw0_0.LD0.he0;
        if (renderState == null) {
            tw0_0.rl.jC("当前未处于对战中。", zo_0.Dd);
            return;
        }
        ML0 gui = renderState.N10;
        N60 entry = gui.BQ;
        zo_0 channel = zo_0.Dd;
        tw0_0.rl.jC("当前渲染条目: " + entry, channel);
        boolean finished = entry == null || entry.lPt1();
        tw0_0.rl.jC(
            new StringBuilder("当前渲染条目已完成: ")
                .append(finished)
                .toString(),
            channel);
        tw0_0.rl.jC("GUI 是否繁忙: " + gui.nC0(), channel);
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
