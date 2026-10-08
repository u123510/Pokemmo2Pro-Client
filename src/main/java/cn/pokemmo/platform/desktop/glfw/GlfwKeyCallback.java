/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.platform.desktop.glfw;

import f.*;


import f.DB0;
import f.y5;
import org.lwjgl.glfw.GLFWKeyCallback;

public class GlfwKeyCallback
extends GLFWKeyCallback {
    public final /* synthetic */ DB0 wi;

    public GlfwKeyCallback(DB0 dB0) {
        this.wi = dB0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void invoke(long l, int n, int n2, int n3, int n4) {
        DB0 dB0;
        dB0 = this.wi;
        if (n3 == 0) {
            dB0.getClass();
            int n5 = DB0.YA0(n);
            --dB0.pM;
            dB0.Ku0[n5] = false;
            dB0.wc0.gw.rt0.G20();
            dB0.ki.Vd(n5, System.nanoTime());
            return;
        }
        if (n3 != 1) {
            if (n3 != 2) {
                dB0.getClass();
                return;
            }
            if (dB0.f7 == '\u0000') return;
            dB0.wc0.gw.rt0.G20();
            dB0.ki.I8(dB0.f7, System.nanoTime());
            return;
        }
        dB0.getClass();
        n = DB0.YA0(n);
        y5 y52 = dB0.ki;
        long l2 = System.nanoTime();
        synchronized (y52) {
            y52.kr0.ja0(0);
            y52.P20(l2);
            y52.kr0.ja0(n);
        }
        ++dB0.pM;
        dB0.com1 = true;
        dB0.Ku0[n] = true;
        dB0.Ae[n] = true;
        dB0.wc0.gw.rt0.G20();
        dB0.f7 = '\u0000';
        n = n != 61 ? (n != 112 ? (n != 160 && n != 66 ? (n != 67 ? 0 : 8) : 10) : 127) : 9;
        if (n == 0) return;
        dB0.ft0.invoke(l, n);
    }
}

