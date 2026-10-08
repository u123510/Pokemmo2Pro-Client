/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.console;

import f.*;
import java.util.*;


import f.BR;
import f.WY;
import f.tw0_0;

/*
 * Renamed from f.jC
 */
public class LogoutConsoleCommand
extends BaseConsoleCommand {
    public LogoutConsoleCommand() {
        super("logout");
    }

    @Override
    public void Hh(String[] stringArray) {
        BR bR = tw0_0.rl;
        if (bR != null && !bR.Qw) {
            WY.Ba0("控制台触发登出...");
            tw0_0.rl.m9();
        } else {
            WY.Ba0("当前账号已处于登出状态。");
        }
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
