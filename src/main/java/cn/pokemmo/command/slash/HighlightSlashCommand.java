/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


import f.CH0;
import f.E90;
import f.prn__2;
import f.tw0_0;
import f.yt_1;
import f.zo_0;

/*
 * Renamed from f.ko0
 */
public class HighlightSlashCommand
extends BaseSlashCommand {
    public HighlightSlashCommand() {
        super("//highlight");
    }

    @Override
    public void sr0(String[] stringArray) {
        if (stringArray.length < 2) {
            yt_1.l00 = CH0.j1;
            return;
        }
        E90 e90 = tw0_0.e60.xA(stringArray[1]);
        if (e90 != null) {
            yt_1.l00 = e90.pu;
            return;
        }
        try {
            yt_1.l00 = CH0.Ab(Long.parseLong(stringArray[1]));
            return;
        }
        catch (NumberFormatException numberFormatException) {
            tw0_0.rl.jC("用法: /highlight <ID或玩家名>", zo_0.Dd);
            return;
        }
    }

    @Override
    public final int qo0() {
        return 5;
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
