/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.console;

import f.*;
import java.util.*;


import f.N9;
import f.WY;
import f.jq0_0;
import f.zy0_0;

/*
 * Renamed from f.kd0
 */
public class ReloadConsoleCommand
extends BaseConsoleCommand {
    public ReloadConsoleCommand() {
        super("reload");
    }

    @Override
    public void Hh(String[] stringArray) {
        Object object = "用法: >reload <ui|commands>";
        if (stringArray.length < 2) {
            WY.Ba0((String)object);
            return;
        }
        if (stringArray[1].equals("ui")) {
            object = jq0_0.Tq();
            if (object == null) {
                WY.Ba0("已成功重新加载 UI 界面与主题资源。");
            } else {
                Object object2 = object;
                object = "red";
                zy0_0.CF0.Xt("重新加载 UI 失败:", (String)object);
                object = "red";
                zy0_0.CF0.Xt(((Throwable)object2).getCause().getMessage(), (String)object);
                WY.Ba0("");
            }
        } else if (stringArray[1].equals("commands")) {
            N9 n9 = N9.HK0;
            n9.md0.clear();
            n9.de();
            WY.Ba0("已成功重新加载指令配置列表。");
        } else {
            WY.Ba0((String)object);
        }
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
