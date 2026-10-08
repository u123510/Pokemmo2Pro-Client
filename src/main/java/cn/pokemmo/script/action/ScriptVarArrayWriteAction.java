package cn.pokemmo.script.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;

public class ScriptVarArrayWriteAction extends BaseScriptAction {
    public static final Matrix4 io0;
    public final float[] Mp0 = new float[192];

    public ScriptVarArrayWriteAction() {
    }

    static {
        io0 = new Matrix4();
    }

    @Override
    public final void set(Wm0 var1, int var2, W00 var3, wh_0 var4) {
        for (int var5 = 0; var5 < this.Mp0.length; ++var5) {
            int var6 = var5 / 16;
            Matrix4[] var7 = var3.lpt7;
            Matrix4 var8;
            float var9;
            if (var7 != null && var6 < var7.length && (var8 = var7[var6]) != null) {
                var9 = var8.EW[var5 % 16];
            } else {
                var9 = io0.EW[var5 % 16];
            }
            this.Mp0[var5] = var9;
        }

        int var10 = var1.loc(var2);
        lg_0.Sf0.glUniformMatrix4fv(var10, this.Mp0.length / 16, false, this.Mp0, 0);
    }
}
