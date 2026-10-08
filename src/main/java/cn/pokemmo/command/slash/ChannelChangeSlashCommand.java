/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


import f.prn__2;
import f.tw0_0;
import f.ve0_0;
import f.zo_0;

/*
 * Renamed from f.yD
 */
public class ChannelChangeSlashCommand
extends BaseSlashCommand {
    public ChannelChangeSlashCommand() {
        super("/channelchange");
    }

    @Override
    public void sr0(String[] stringArray) {
        byte by;
        if (stringArray.length < 2) {
            tw0_0.rl.jC("用法: /channelchange <分线ID>", zo_0.Dd);
            return;
        }
        try {
            by = (byte)(Byte.parseByte(stringArray[1]) - 1);
        }
        catch (NumberFormatException numberFormatException) {
            tw0_0.rl.jC("用法: /channelchange <分线ID>", zo_0.Dd);
            return;
        }
        if (by >= 0 && by < tw0_0.e60.cv0) {
            boolean bl = false;
            tw0_0.rl.fk0.uQ(new ve0_0(by, bl));
            return;
        }
        tw0_0.rl.jC("无效的分线 ID。", zo_0.Dd);
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
