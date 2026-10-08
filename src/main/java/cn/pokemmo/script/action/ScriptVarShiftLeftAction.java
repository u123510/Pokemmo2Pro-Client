package cn.pokemmo.script.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ScriptVarShiftLeftAction extends BaseScriptAction {
    public final i00_0 fg0;

    public ScriptVarShiftLeftAction() {
        super();
        this.fg0 = new i00_0();
    }

    public final void set(Wm0 v1, int i2, W00 v3, wh_0 v4) {
        v1.set(i2, this.fg0.T4(v3.eo0).aM().Se0());
    }
}

