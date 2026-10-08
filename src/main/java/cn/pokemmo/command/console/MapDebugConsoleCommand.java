/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.console;

import f.*;
import java.util.*;


import f.Qy0;
import f.UV;
import f.WY;

/*
 * Renamed from f.oE
 */
public class MapDebugConsoleCommand
extends BaseConsoleCommand {
    public MapDebugConsoleCommand() {
        super("mapdebug");
    }

    @Override
    public void Hh(String[] stringArray) {
        if (tw0_0.LD0 == null || tw0_0.LD0.Sc == null) {
            zy0_0.CF0.Xt("当前未进入游戏地图，无法打开地图调试窗口。", "red");
            return;
        }
        UV uV = new UV();
        Qy0 qy0 = Qy0.yI0;
        qy0.F9(qy0.fU(), uV);
        uV.RY(600, 400);
        uV.lt0();
        uV.vf(pa0_0.Ol);
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
