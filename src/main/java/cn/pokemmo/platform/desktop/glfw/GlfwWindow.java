/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.platform.desktop.glfw;

import f.*;


import f.COM7_;
import f.Dt0;
import f.EA;
import f.F70;
import f.GS;
import f.K70;
import f.T7;
import f.Z3;
import f.w0_0;
import java.io.PrintStream;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GlfwWindow
extends K70 {
    public static final PrintStream super$ = System.err;
    public boolean jZ = false;
    public final int cs0 = Integer.MAX_VALUE;
    public int a80 = 16;
    public int YF0 = 512;
    public int l7 = 9;
    public COM7_ sK = COM7_.ms;
    public int Ti = 3;
    public int ay = 2;
    public int m = 8;
    public int A20 = 8;
    public int ta = 8;
    public int Nu = 8;
    public int Hm0 = 16;
    public int Io0 = 0;
    public int Yz = 0;
    public boolean of0;
    public int Rk = 60;
    public int Xs0 = 0;
    public F70 hE = F70.Ap;
    public boolean s00 = false;
    public PrintStream fX = System.err;

    public static DZ sF0(DZ dZ) {
        DZ dZ3 = new DZ();
        dZ3.d1(dZ);
        dZ3.jZ = dZ.jZ;
        dZ3.a80 = dZ.a80;
        dZ3.YF0 = dZ.YF0;
        dZ3.l7 = dZ.l7;
        dZ3.sK = dZ.sK;
        dZ3.Ti = dZ.Ti;
        dZ3.ay = dZ.ay;
        dZ3.m = dZ.m;
        dZ3.A20 = dZ.A20;
        dZ3.ta = dZ.ta;
        dZ3.Nu = dZ.Nu;
        dZ3.Hm0 = dZ.Hm0;
        dZ3.Io0 = dZ.Io0;
        dZ3.Yz = dZ.Yz;
        dZ3.of0 = dZ.of0;
        dZ3.Rk = dZ.Rk;
        dZ3.Xs0 = dZ.Xs0;
        dZ3.hE = dZ.hE;
        dZ3.s00 = dZ.s00;
        dZ3.fX = dZ.fX;
        return dZ3;
    }

    public static Z3 rr0(EA eA) {
        GLFWVidMode gLFWVidMode;
        Dt0.jd();
        eA = (T7)eA;
        GLFWVidMode gLFWVidMode2 = gLFWVidMode = GLFW.glfwGetVideoMode(((T7)eA).Y2);
        long l = ((T7)eA).Y2;
        int n = gLFWVidMode2.width();
        int n2 = gLFWVidMode2.height();
        int n3 = gLFWVidMode2.refreshRate();
        int n4 = gLFWVidMode2.redBits();
        GLFWVidMode gLFWVidMode3 = gLFWVidMode;
        int n5 = gLFWVidMode3.greenBits() + n4;
        n5 = gLFWVidMode3.blueBits() + n5;
        return new Z3(l, n, n2, n3, n5);
    }

    public static GS[] Wn() {
        Dt0.jd();
        GLFWVidMode.Buffer buffer = GLFW.glfwGetVideoModes(GLFW.glfwGetPrimaryMonitor());
        int n = buffer.limit();
        GS[] gSArray = new GS[n];
        for (int j = 0; j < n; ++j) {
            GLFWVidMode gLFWVidMode = (GLFWVidMode)buffer.get(j);
            GLFWVidMode gLFWVidMode2 = gLFWVidMode;
            long l = GLFW.glfwGetPrimaryMonitor();
            int n2 = gLFWVidMode2.width();
            int n3 = gLFWVidMode2.height();
            int n4 = gLFWVidMode2.refreshRate();
            int n5 = gLFWVidMode2.redBits();
            GLFWVidMode gLFWVidMode3 = gLFWVidMode;
            int n6 = gLFWVidMode3.greenBits() + n5;
            n6 = gLFWVidMode3.blueBits() + n6;
            gSArray[j] = new Z3(l, n2, n3, n4, n6);
        }
        return gSArray;
    }

    public static GS[] Ji0(EA eA) {
        Dt0.jd();
        eA = (T7)eA;
        GLFWVidMode.Buffer buffer = GLFW.glfwGetVideoModes(((T7)eA).Y2);
        int n = buffer.limit();
        GS[] gSArray = new GS[n];
        for (int j = 0; j < n; ++j) {
            GLFWVidMode gLFWVidMode = (GLFWVidMode)buffer.get(j);
            GLFWVidMode gLFWVidMode2 = gLFWVidMode;
            long l = ((T7)eA).Y2;
            int n2 = gLFWVidMode2.width();
            int n3 = gLFWVidMode2.height();
            int n4 = gLFWVidMode2.refreshRate();
            int n5 = gLFWVidMode2.redBits();
            GLFWVidMode gLFWVidMode3 = gLFWVidMode;
            int n6 = gLFWVidMode3.greenBits() + n5;
            n6 = gLFWVidMode3.blueBits() + n6;
            gSArray[j] = new Z3(l, n2, n3, n4, n6);
        }
        return gSArray;
    }

    public static EA[] pJ0() {
        Dt0.jd();
        PointerBuffer pointerBuffer = GLFW.glfwGetMonitors();
        EA[] eAArray = new EA[pointerBuffer.limit()];
        for (int j = 0; j < pointerBuffer.limit(); ++j) {
            long l = pointerBuffer.get(j);
            IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
            IntBuffer intBuffer2 = BufferUtils.createIntBuffer(1);
            GLFW.glfwGetMonitorPos(l, intBuffer, intBuffer2);
            int n = intBuffer.get(0);
            int n2 = intBuffer2.get(0);
            String string = GLFW.glfwGetMonitorName(l);
            eAArray[j] = new T7(l, n, n2, string);
        }
        return eAArray;
    }

    public static w0_0 jW(T7 t7, int n, int n2) {
        int n3;
        int n4;
        IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
        IntBuffer intBuffer2 = BufferUtils.createIntBuffer(1);
        IntBuffer intBuffer3 = BufferUtils.createIntBuffer(1);
        IntBuffer intBuffer4 = BufferUtils.createIntBuffer(1);
        T7 t72 = t7;
        Z3 z3 = DZ.rr0(t72);
        GLFW.glfwGetMonitorWorkarea(t72.Y2, intBuffer, intBuffer2, intBuffer3, intBuffer4);
        int n5 = intBuffer3.get(0);
        int n6 = intBuffer4.get(0);
        if (n > n5) {
            n4 = t7.jD0;
            n5 = z3.Vo;
        } else {
            n4 = intBuffer.get(0);
        }
        if (n2 > n6) {
            n3 = t7.SI;
            n6 = z3.c50;
        } else {
            n3 = intBuffer2.get(0);
        }
        n = Math.max(n4, (n5 - n) / 2 + n4);
        return new w0_0(n, Math.max(n3, (n6 - n2) / 2 + n3));
    }

    public final void aB(int n) {
        GlfwWindow dZ = this;
        dZ.a80 = 16;
        dZ.YF0 = n;
        dZ.l7 = 6;
    }

    public final void dq0(COM7_ cOM7_) {
        GlfwWindow dZ = this;
        dZ.sK = cOM7_;
        dZ.Ti = 3;
        dZ.ay = 2;
    }

    public final void VF0(int n) {
        GlfwWindow dZ = this;
        dZ.m = 8;
        dZ.A20 = 8;
        dZ.ta = 8;
        dZ.Nu = 8;
        dZ.Hm0 = 16;
        dZ.Io0 = 0;
        dZ.Yz = n;
    }

    public final void Oa(int n) {
        this.Rk = n;
    }

    public final void To0(int n) {
        this.Xs0 = n;
    }
}


