package cn.pokemmo.script.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;

public class ScriptVarFlagCheckAction extends BaseScriptAction {
    public final Matrix4 E9;

    public ScriptVarFlagCheckAction() {
        this.E9 = new Matrix4();
    }

    public final void set(Wm0 v1, int i2, W00 v3, wh_0 v4) {
        Matrix4 camera_bq = v1.camera.bq;
        camera_bq.getClass();
        Matrix4 m = this.E9.Dd0(camera_bq.EW);
        Matrix4.md0(m.EW, v3.eo0.EW);
        v1.set(i2, m);
    }
}
