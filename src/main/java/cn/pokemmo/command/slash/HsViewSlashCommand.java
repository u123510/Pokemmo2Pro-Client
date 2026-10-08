/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


import f.k80_0;
import f.prn__2;
import f.q7_0;
import f.tw0_0;

public class HsViewSlashCommand
extends BaseSlashCommand {
    public HsViewSlashCommand() {
        super("/hsview");
    }

    @Override
    public void sr0(String[] stringArray) {
        try {
            k80_0 k80_02;
            if (stringArray == null || stringArray.length < 2) {
                k80_02 = k80_0.At;
            } else {
                k80_02 = (k80_0) k80_0.H70.BM(Byte.parseByte(stringArray[1]));
            }
            if (k80_02 != null && tw0_0.rl != null && tw0_0.rl.fk0 != null) {
                tw0_0.rl.fk0.uQ(new q7_0(k80_02));
            }
        } catch (Exception ignored) {
            return;
        }
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
