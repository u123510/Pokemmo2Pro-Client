/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


import f.hl_1;
import f.prn__2;
import f.tw0_0;

/*
 * Renamed from f.rA0
 */
public class PingSlashCommand
extends BaseSlashCommand {
    public PingSlashCommand() {
        super("/ping");
    }

    @Override
    public void sr0(String[] stringArray) {
        tw0_0.rl.fk0.uQ(new hl_1(System.currentTimeMillis(), false));
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
