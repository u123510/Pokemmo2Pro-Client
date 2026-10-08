package cn.pokemmo.script.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;

public class ScriptVarPartyHpAction extends BaseScriptAction {
    public final Matrix4 IE;

    public ScriptVarPartyHpAction() {
        this.IE = new Matrix4();
    }

    public final void set(Wm0 v1, int i2, W00 v3, wh_0 v4) {
        Matrix4 camera_iJ = v1.camera.iJ;
        camera_iJ.getClass();
        Matrix4 m = this.IE.Dd0(camera_iJ.EW);
        Matrix4.md0(m.EW, v3.eo0.EW);
        v1.set(i2, m);
    }
}
