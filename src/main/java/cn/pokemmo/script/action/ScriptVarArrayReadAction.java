package cn.pokemmo.script.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Color;

public class ScriptVarArrayReadAction extends BaseScriptAction {
    public static final float[] hA;
    public static final C8 l5;
    public final id_2 Yf;
    public final int bz0;
    public final int b50;

    static {
        float[] arr = new float[18];
        for (int i = 0; i < 18; i++) {
            arr[i] = 1.0f;
        }
        hA = arr;
        l5 = new C8();
    }

    public ScriptVarArrayReadAction() {
        super();
        this.Yf = new id_2();
        this.bz0 = 2;
        this.b50 = 5;
    }

    @Override
    public final void set(Wm0 wm0, int i, W00 w00, wh_0 wh_0Var) {
        if (w00.AA0 == null) {
            lt_1 lt_1Var = wm0.program;
            int loc = wm0.loc(i);
            float[] arr = hA;
            lt_1Var.getClass();
            lg_0.Sf0.glUniform3fv(loc, 6, arr, 0);
            return;
        }
        w00.eo0.V1(l5);
        long j = PRN_.xE;
        if (wh_0Var.tM(j)) {
            id_2 id_2Var = this.Yf;
            Color color = ((PRN_) wh_0Var.sg(j)).v50;
            id_2Var.getClass();
            float r = color.r;
            float g = color.g;
            float b = color.b;
            for (int k = 0; k < 18; k += 3) {
                float[] arr2 = id_2Var.l3;
                arr2[k] = r;
                arr2[k + 1] = g;
                arr2[k + 2] = b;
            }
        }
        long j2 = CP.M0;
        if (wh_0Var.tM(j2)) {
            es_1 es_1Var = ((CP) wh_0Var.sg(j2)).Ds0;
            for (int k = this.bz0; k < es_1Var.KB; k++) {
                id_2 id_2Var2 = this.Yf;
                Color color2 = ((qv_0) es_1Var.get(k)).l0;
                C8 c8 = ((qv_0) es_1Var.get(k)).jf;
                id_2Var2.getClass();
                float r2 = color2.r;
                float g2 = color2.g;
                float b2 = color2.b;
                float x = c8.x;
                float y = c8.y;
                float z = c8.z;
                this.Yf.Ve0(r2, g2, b2, x, y, z);
            }
        }
        long j3 = fi_2.Tl0;
        if (wh_0Var.tM(j3)) {
            es_1 es_1Var2 = ((fi_2) wh_0Var.sg(j3)).jA;
            for (int k = this.b50; k < es_1Var2.KB; k++) {
                id_2 id_2Var3 = this.Yf;
                dm0_0 dm0_0Var = (dm0_0) es_1Var2.get(k);
                Color color3 = dm0_0Var.l0;
                C8 c8_2 = dm0_0Var.EJ;
                C8 c8_3 = l5;
                float f = dm0_0Var.ET;
                id_2Var3.getClass();
                float dist = f / (c8_3.SH0(c8_2) + 1.0f);
                float r3 = color3.r * dist;
                float g3 = color3.g * dist;
                float b3 = color3.b * dist;
                float dx = c8_3.x - c8_2.x;
                float dy = c8_3.y - c8_2.y;
                float dz = c8_3.z - c8_2.z;
                this.Yf.Ve0(r3, g3, b3, dx, dy, dz);
            }
        }
        id_2 id_2Var4 = this.Yf;
        for (int k = 0; k < id_2Var4.l3.length; k++) {
            float val = id_2Var4.l3[k];
            if (val < 0.0f) {
                val = 0.0f;
            } else if (val > 1.0f) {
                val = 1.0f;
            }
            id_2Var4.l3[k] = val;
        }
        lt_1 lt_1Var2 = wm0.program;
        int loc2 = wm0.loc(i);
        float[] l3 = this.Yf.l3;
        int len = l3.length;
        lt_1Var2.getClass();
        lg_0.Sf0.glUniform3fv(loc2, len / 3, l3, 0);
    }
}
