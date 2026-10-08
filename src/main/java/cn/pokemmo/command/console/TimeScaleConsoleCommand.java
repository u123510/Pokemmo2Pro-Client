/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.console;

import f.*;
import java.util.*;


import f.WY;
import f.tw0_0;
import f.vr_1;
import f.zy0_0;

/*
 * Renamed from f.Hj0
 */
public class TimeScaleConsoleCommand
extends BaseConsoleCommand {
    public TimeScaleConsoleCommand() {
        super("timescale");
    }

    @Override
    public void Hh(String[] stringArray) {
        float f;
        float f2;
        Object object;
        if (stringArray.length != 2) {
            object = "red";
            zy0_0.CF0.Xt("用法: timescale <倍率, 如 1.0>", (String)object);
            return;
        }
        if (tw0_0.PK0 == null) {
            object = "red";
            zy0_0.CF0.Xt("必须在对战中才能使用此指令。", (String)object);
            return;
        }
        try {
            f2 = Float.parseFloat(stringArray[1]);
        }
        catch (NumberFormatException numberFormatException) {
            object = "red";
            zy0_0.CF0.Xt("时间缩放倍率解析错误，请检查输入。", (String)object);
            return;
        }
        if (f2 > 0.0f) {
            ((vr_1)tw0_0.LD0.he0).HC0 = f2;
            String string = "green";
            zy0_0.CF0.Xt("已将时间缩放倍率修改为 " + f2, string);
        }
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
