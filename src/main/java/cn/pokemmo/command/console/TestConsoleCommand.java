/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.console;

import f.*;
import java.util.*;


import f.Ft0;
import f.Qy0;
import f.WY;

/*
 * Renamed from f.s70
 */
public class TestConsoleCommand
extends BaseConsoleCommand {
    public TestConsoleCommand() {
        super("test");
    }

    @Override
    public void Hh(String[] stringArray) {
        Qy0 qy0 = Qy0.yI0;
        Ft0 ft02 = new Ft0();
        qy0.F9(qy0.fU(), ft02);
        ft02.RY(720, 520);
        ft02.lt0();
        ft02.vf(pa0_0.Ol);
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
