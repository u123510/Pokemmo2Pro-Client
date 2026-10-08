/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.task.callback;

import f.*;

import f.h50_0;
import f.k3_0;
import f.lg_0;
import f.rg0_2;
import org.lwjgl.glfw.GLFW;

/*
 * Renamed from f.zi0
 */
public class TaskCallbackZi02
implements Runnable  {
    @Override
    public final void run() {
        Object object = new StringBuilder();
        if (h50_0.GA && rg0_2.r4(2) == 0) {
            ((StringBuilder)object).append('\u0420');
        } else {
            ((StringBuilder)object).append('P');
        }
        ((StringBuilder)object).append("ok");
        if (h50_0.GA && rg0_2.r4(2) == 0) {
            ((StringBuilder)object).append('\u0435');
        } else {
            ((StringBuilder)object).append('e');
        }
        if (h50_0.GA && rg0_2.r4(2) == 0) {
            ((StringBuilder)object).append('\u041c');
        } else {
            ((StringBuilder)object).append('M');
        }
        if (h50_0.GA && rg0_2.r4(2) == 0) {
            ((StringBuilder)object).append('\u041c');
        } else {
            ((StringBuilder)object).append('M');
        }
        Object object2 = object;
        ((StringBuilder)object2).append('O');
        object = lg_0.S4;
        String string = ((StringBuilder)object2).toString();
        object.getClass();
        if (string == null) {
            string = "";
        }
        GLFW.glfwSetWindowTitle(((k3_0)object).rt0.hc0, string);
    }
}

