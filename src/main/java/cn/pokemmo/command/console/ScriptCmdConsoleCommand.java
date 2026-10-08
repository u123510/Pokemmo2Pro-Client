/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.console;

import f.*;
import java.util.*;


import f.BR;
import f.QA0;
import f.WY;
import f.tw0_0;
import f.zo_0;

public class ScriptCmdConsoleCommand
extends BaseConsoleCommand {
    public ScriptCmdConsoleCommand() {
        super("cmd");
    }

    @Override
    public void Hh(String[] stringArray) {
        Object object = "";
        for (int j = 1; j < stringArray.length; ++j) {
            object = (String)object + stringArray[j];
            if (j == stringArray.length) continue;
            object = QA0.W0((String)object, " ");
        }
        if (((String)object).length() != 0) {
            BR bR = tw0_0.rl;
            object = "//".concat((String)object);
            bR.getClass();
            bR.Cp(zo_0.Pk, (String)object, "", true);
        }
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
