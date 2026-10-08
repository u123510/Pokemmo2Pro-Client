package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


public class LanguageSlashCommand extends BaseSlashCommand {
    public LanguageSlashCommand() {
        super("/lang");
    }

    @Override
    public void sr0(String[] args) {
        if (args.length < 2) {
            tw0_0.rl.jC("用法: /lang <语言代码>", zo_0.Dd);
            return;
        }
        G50 language = G50.Rl(args[1]);
        if (language != null) {
            if (!language.PM.equalsIgnoreCase(dw_2.fP)) {
                dw_2.fP = language.PM;
                if (tw0_0.rl != null) {
                    tw0_0.rl.da0();
                }
            }
            tw0_0.rl.GC(language, null, false, true);
            return;
        }
        String available = "";
        for (G50 value : G50.aG) {
            if (!available.isEmpty()) {
                available = available.concat(", ");
            }
            available = available + value.na;
        }
        tw0_0.rl.jC(jj0_0.hw0("无效的语言代码。可选语言代码: ", available), zo_0.Dd);
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
