/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


import f.UH;
import f.prn__2;
import f.tw0_0;

public class BattleCancelSlashCommand
extends BaseSlashCommand {
    public BattleCancelSlashCommand() {
        super("/b_cancel");
    }

    @Override
    public void sr0(String[] stringArray) {
        tw0_0.rl.fk0.uQ(new UH());
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
