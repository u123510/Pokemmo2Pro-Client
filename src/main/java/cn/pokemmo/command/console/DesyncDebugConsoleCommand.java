/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.console;

import f.*;
import java.util.*;


import f.WY;
import f.vr_1;
import f.zy0_0;

public class DesyncDebugConsoleCommand
extends BaseConsoleCommand {
    public DesyncDebugConsoleCommand() {
        super("desyncdebug");
    }

    @Override
    public void Hh(String[] stringArray) {
        String string = "green";
        zy0_0.CF0.Xt("对战不同步调试状态: " + (vr_1.Zh0 ^= true), string);
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
