/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.console;

import f.*;
import java.util.*;


import f.WY;
import f.qk_2;
import f.tw0_0;
import f.zy0_0;

public class DumpConsoleCommand
extends BaseConsoleCommand {
    public DumpConsoleCommand() {
        super("dump");
    }

    @Override
    public void Hh(String[] stringArray) {
        if (stringArray.length < 2) {
            WY.Ba0("用法: >dump <skilldurations>");
            return;
        }
        if (stringArray[1].equalsIgnoreCase("skilldurations")) {
            if (tw0_0.PK0 == null) {
                String string = "red";
                zy0_0.CF0.Xt("该指令仅在对战中生效。", string);
                return;
            }
            qk_2.cR.dw0();
            WY.Ba0("请查看控制台日志或剪贴板获取详情。");
        }
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
