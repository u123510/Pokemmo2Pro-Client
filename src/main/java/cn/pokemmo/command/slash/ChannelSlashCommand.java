/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


import f.prn__2;
import f.tw0_0;
import f.zo_0;

public class ChannelSlashCommand
extends BaseSlashCommand {
    public final zo_0 Zv;

    public ChannelSlashCommand(String string, zo_0 zo_02) {
        super(string, false);
        this.Zv = zo_02;
    }

    @Override
    public void sr0(String[] stringArray) {
        tw0_0.rl.GC(null, this.Zv, false, true);
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
