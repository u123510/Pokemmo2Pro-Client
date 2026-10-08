package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


public class BlockSlashCommand extends BaseSlashCommand {
    public BlockSlashCommand() {
        super("/block");
    }

    @Override
    public void sr0(String[] var1) {
        if (var1.length < 2) {
            tw0_0.rl.jC("用法: /block <目标玩家名> [屏蔽原因]", zo_0.Dd);
            return;
        }
        String var2 = var1[1];
        StringBuilder var3 = new StringBuilder();
        for (int var4 = 2; var4 < var1.length; ++var4) {
            if (var4 > 2) {
                var3.append(" ");
            }
            var3.append(var1[var4]);
        }
        tw0_0.rl.fk0.uQ(new T20(var2, var3.toString()));
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
