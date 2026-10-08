package cn.pokemmo.script.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ScriptVarPokedexSeenAction extends BaseScriptAction {
    public ScriptVarPokedexSeenAction() {
        super();
    }

    @Override
    public final void set(Wm0 wm0, int i, W00 w00, wh_0 wh_0) {
        mz_2 mz = (mz_2) wh_0.sg(mz_2.protected$);
        wm0.set(i, mz.B50, mz.j70, mz.m90, mz.aU);
    }
}
