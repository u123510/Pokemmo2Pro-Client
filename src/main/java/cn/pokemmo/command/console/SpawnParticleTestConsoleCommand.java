/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.console;

import f.*;
import java.util.*;


import f.Cq;
import f.QL;
import f.WY;
import f.a10_0;
import f.cg0_0;
import f.tw0_0;
import f.vr_1;

/*
 * Renamed from f.b20
 */
public class SpawnParticleTestConsoleCommand
extends BaseConsoleCommand {
    public SpawnParticleTestConsoleCommand() {
        super("spawnparticletest");
    }

    @Override
    public void Hh(String[] stringArray) {
        if (stringArray.length < 3) {
            WY.Ba0("用法: >spawnparticletest [粒子ID] [队伍ID] [槽位ID]");
            return;
        }
        if (tw0_0.PK0 != null && tw0_0.LD0.he0 != null) {
            cg0_0 cg0_02;
            QL qL;
            try {
                qL = QL.Q8(Byte.parseByte(stringArray[1]));
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
            byte by = Byte.parseByte(stringArray[2]);
            byte by2 = Byte.parseByte(stringArray[3]);
            byte by3 = 0;
            byte by4 = 1;
            if (by < 0) {
                by = by3;
            } else if (by > by4) {
                by = by4;
            }
            by = by;
            by3 = 0;
            Cq cq = tw0_0.PK0.nf;
            byte by5 = (byte)((by > 0 ? cq.Lw0 : cq.e50) - 1);
            if (by2 < 0) {
                by2 = by3;
            } else if (by2 > by5) {
                by2 = by5;
            }
            by2 = by2;
            ((vr_1)tw0_0.LD0.he0).OB0.end();
            ((vr_1)tw0_0.LD0.he0).OB0.Vk.Wd0();
            a10_0 a10_02 = tw0_0.PK0;
            cg0_02 = new cg0_0(a10_02, qL, a10_02.Ce(by, by2));
            tw0_0.LD0.he0.N10.lZ.add(cg0_02);
            return;
        }
        WY.Ba0("必须在对战中才能使用此指令。");
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
