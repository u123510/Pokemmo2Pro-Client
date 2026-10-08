/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


import f.c8_0;
import f.g7_0;
import f.prn__2;
import f.tw0_0;
import f.zo_0;

public class TimeSlashCommand
extends BaseSlashCommand {
    public TimeSlashCommand() {
        super("/time", false);
    }

    @Override
    public void sr0(String[] stringArray) {
        c8_0 c8_02 = c8_0.JD0;
        tw0_0.rl.jC(g7_0.Zx(c8_02.S7.eu, new StringBuilder("当前游戏时间: ").append(c8_02.d60()).append(":").append(c8_02.ki0() % 3600 / 60).append(". ("), ")"), zo_0.Dd);
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
