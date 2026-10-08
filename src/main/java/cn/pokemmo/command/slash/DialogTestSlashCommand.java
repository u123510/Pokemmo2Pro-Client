package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


public class DialogTestSlashCommand extends BaseSlashCommand {
    public DialogTestSlashCommand() {
        super("/dialogtest");
    }

    @Override
    public void sr0(String[] args) {
        if (args.length < 2) {
            tw0_0.rl.jC("用法: /dialogtest <字符串ID>", zo_0.Dd);
            return;
        }
        try {
            String message = g6_0.dG(Integer.parseInt(args[1]), g6_0.LS);
            if (tw0_0.PK0 != null) {
                tw0_0.LD0.he0.N10.wJ(message, "", null);
            } else {
                tw0_0.FL.Ad(message);
            }
        } catch (NumberFormatException error) {
            tw0_0.rl.jC("用法: /dialogtest <字符串ID>", zo_0.Dd);
        }
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
