package cn.pokemmo.script.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;

public class ScriptVarItemCheckAction extends BaseScriptAction {
    public final Matrix4 Ja;

    public ScriptVarItemCheckAction() {
        super();
        this.Ja = new Matrix4();
    }

    public final void set(Wm0 v1, int i2, W00 v3, wh_0 v4) {
        Matrix4 bq = v1.camera.bq;
        bq.getClass();
        Matrix4 ja = this.Ja.Dd0(bq.EW);
        Matrix4.md0(ja.EW, v3.eo0.EW);
        v1.set(i2, ja);
    }
}
