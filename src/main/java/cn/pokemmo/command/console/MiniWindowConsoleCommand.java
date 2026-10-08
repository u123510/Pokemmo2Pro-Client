/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.console;

import f.*;
import java.util.*;


import f.WY;
import f.zy0_0;

public class MiniWindowConsoleCommand
extends BaseConsoleCommand {
    public MiniWindowConsoleCommand() {
        super("mini");
    }

    @Override
    public void Hh(String[] stringArray) {
        zy0_0 zy0_02 = zy0_0.CF0;
        zy0_02.Mb0 ^= true;
        zy0_02.COm3();
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
