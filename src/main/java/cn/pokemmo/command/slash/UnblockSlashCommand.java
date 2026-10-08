/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


import f.hp_1;
import f.prn__2;
import f.tw0_0;
import f.zo_0;

public class UnblockSlashCommand
extends BaseSlashCommand {
    public UnblockSlashCommand() {
        super("/unblock");
    }

    @Override
    public void sr0(String[] stringArray) {
        if (stringArray.length < 2) {
            tw0_0.rl.jC("用法: /unblock <目标玩家名>", zo_0.Dd);
            return;
        }
        String string = stringArray[1];
        tw0_0.rl.fk0.uQ(new hp_1(string));
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
