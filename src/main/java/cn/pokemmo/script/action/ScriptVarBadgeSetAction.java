package cn.pokemmo.script.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ScriptVarBadgeSetAction extends BaseScriptAction {
    public ScriptVarBadgeSetAction() {
        super();
    }

    @Override
    public final void set(Wm0 wm0, int i, W00 w00, wh_0 wh_0) {
        ph0_2 contextIG = (ph0_2) wm0.context.iG;
        mz_2 mz = (mz_2) wh_0.sg(mz_2.protected$);
        wm0.set(i, contextIG.d30(mz.I3));
    }
}
