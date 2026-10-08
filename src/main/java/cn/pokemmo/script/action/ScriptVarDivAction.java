/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.script.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;
import f.W00;
import f.Wm0;
import f.lg_0;
import f.oc0_0;
import f.wh_0;

public class ScriptVarDivAction extends BaseScriptAction {
    public static final Matrix4 fr = new Matrix4();
    public final float[] L70;

    public ScriptVarDivAction(int n) {
        this.L70 = new float[n * 16];
    }

    @Override
    public final void set(Wm0 shader, int n, W00 w00, wh_0 wh_02) {
        int n2 = 0;
        while (true) {
            Matrix4 matrix4;
            float[] fArray = this.L70;
            if (n2 >= this.L70.length) break;
            int n3 = n2 / 16;
            Matrix4[] matrix4Array = w00.lpt7;
            if (w00.lpt7 != null && n3 < matrix4Array.length && (matrix4 = matrix4Array[n3]) != null) {
                System.arraycopy(matrix4.EW, 0, fArray, n2, 16);
            } else {
                System.arraycopy(ScriptVarDivAction.fr.EW, 0, fArray, n2, 16);
            }
            n2 += 16;
        }
        int n4 = shader.loc(n);
        lg_0.Sf0.glUniformMatrix4fv(n4, this.L70.length / 16, false, this.L70, 0);
    }
}
