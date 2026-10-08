package cn.pokemmo.ui.input;

import f.*;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;

/**
 * 现代化重构类 - 原始类: f.k3_0
 */
public class GlfwInputProcessor extends VA0 implements fy0_0 {

    public final Su0 rt0;
    public sY Z7;
    public lb0_1 COm2;
    public Aa lv;
    public pt0_0 MH;
    public volatile int cJ;
    public volatile int eP;
    public volatile int Cl;
    public volatile int DB;
    public volatile boolean pt0;
    public long hp;
    public float uL;
    public long Z60;
    public int CJ;
    public int fs0;
    public int cu0;
    public int Pm0;
    public int ZH0;
    public int G0;
    public Z3 mH0;
    public final IntBuffer Is0;
    public final IntBuffer tu0;
    public _public UB;

    public GlfwInputProcessor(Su0 su0) {
        this.pt0 = true;
        this.hp = -1L;
        this.Z60 = 0L;
        this.mH0 = null;
        this.Is0 = BufferUtils.createIntBuffer(1);
        this.tu0 = BufferUtils.createIntBuffer(1);
        // this.UB initialized in f.k3_0
        this.rt0 = su0;
        COM7_ sK = su0.Zp().sK;
        if (sK == COM7_.WV) {
            A1 a1 = new A1();
            this.MH = a1;
            this.lv = a1;
            this.COm2 = a1;
            this.Z7 = a1;
        } else if (sK == COM7_.kH) {
            Tr0 tr0 = new Tr0();
            this.lv = tr0;
            this.COm2 = tr0;
            this.Z7 = tr0;
        } else if (sK == COM7_.wE) {
            u20_0 u20_0Var = new u20_0();
            this.COm2 = u20_0Var;
            this.Z7 = u20_0Var;
        } else {
            sY sYVar;
            try {
                if (su0.Zp().sK == COM7_.ms) {
                    sYVar = new CA0();
                } else {
                    sYVar = (sY) Class.forName("com.badlogic.gdx.backends.lwjgl3.angle.Lwjgl3GLES20").newInstance();
                }
            } catch (Throwable th) {
                throw new nf_1("Couldn't instantiate GLES20.", th);
            }
            this.Z7 = sYVar;
            this.COm2 = null;
        }
        AR();
        yt0();
    }

    public static void iJ0(k3_0 k3_0Var, long j) {
        k3_0Var.AR();
        Su0 su0 = k3_0Var.rt0;
        if (!su0.H8) {
            return;
        }
        su0.Xv();
        k3_0Var.Z7.glViewport(0, 0, k3_0Var.cJ, k3_0Var.eP);
        k3_0Var.rt0.Ez.Gg(k3_0Var.Kr0(), k3_0Var.sD0());
        k3_0Var.rt0.Ez.Ux0();
        GLFW.glfwSwapBuffers(j);
    }

    public final void yt0() {
        String glGetString = this.Z7.glGetString(7938);
        String glGetString2 = this.Z7.glGetString(7936);
        String glGetString3 = this.Z7.glGetString(7937);
        o50_0 o50_0Var = new o50_0(hb0_2.BN, glGetString, glGetString2, glGetString3);
        int i = o50_0Var.H20;
        if (i > 3 || (i == 3 && o50_0Var.zM >= 2)) {
            this.Z7.glEnable(34895);
        } else if (GLFW.glfwExtensionSupported("GL_ARB_seamless_cube_map")) {
            this.Z7.glEnable(34895);
        }
    }

    public final Su0 q90() {
        return this.rt0;
    }

    public final void AR() {
        GLFW.glfwGetFramebufferSize(this.rt0.hc0, this.Is0, this.tu0);
        this.cJ = this.Is0.get(0);
        this.eP = this.tu0.get(0);
        GLFW.glfwGetWindowSize(this.rt0.hc0, this.Is0, this.tu0);
        this.Cl = this.Is0.get(0);
        this.DB = this.tu0.get(0);
        DZ dz = this.rt0.IG0;
        new xz_2(dz.m, dz.A20, dz.ta, dz.Nu, dz.Hm0, dz.Io0, dz.Yz, false);
    }

    public final sY Tb() {
        return this.Z7;
    }

    public final lb0_1 rO() {
        return this.COm2;
    }

    public final Aa V8() {
        return this.lv;
    }

    public final pt0_0 hn() {
        return this.MH;
    }

    public final int Kr0() {
        if (this.rt0.IG0.hE == F70.TK) {
            return this.cJ;
        }
        return this.Cl;
    }

    public final int sD0() {
        if (this.rt0.IG0.hE == F70.TK) {
            return this.eP;
        }
        return this.DB;
    }

    public final float Ce() {
        return this.uL;
    }

    public final EA Wz0() {
        PointerBuffer glfwGetMonitors = GLFW.glfwGetMonitors();
        int limit = glfwGetMonitors.limit();
        EA[] eaArr = new EA[limit];
        for (int i = 0; i < glfwGetMonitors.limit(); i++) {
            long j = glfwGetMonitors.get(i);
            IntBuffer createIntBuffer = BufferUtils.createIntBuffer(1);
            IntBuffer createIntBuffer2 = BufferUtils.createIntBuffer(1);
            GLFW.glfwGetMonitorPos(j, createIntBuffer, createIntBuffer2);
            eaArr[i] = new T7(j, createIntBuffer.get(0), createIntBuffer2.get(0), GLFW.glfwGetMonitorName(j));
        }
        EA ea = eaArr[0];
        GLFW.glfwGetWindowPos(this.rt0.hc0, this.Is0, this.tu0);
        int winX = this.Is0.get(0);
        int winY = this.tu0.get(0);
        GLFW.glfwGetWindowSize(this.rt0.hc0, this.Is0, this.tu0);
        int winW = this.Is0.get(0);
        int winH = this.tu0.get(0);
        int maxArea = 0;
        for (int i2 = 0; i2 < limit; i2++) {
            EA ea2 = eaArr[i2];
            Z3 rr0 = DZ.rr0(ea2);
            int overlapW = Math.max(0, Math.min(winX + winW, ea2.jD0 + rr0.Vo) - Math.max(winX, ea2.jD0));
            int overlapH = Math.max(0, Math.min(winY + winH, ea2.SI + rr0.c50) - Math.max(winY, ea2.SI));
            int area = overlapW * overlapH;
            if (area > maxArea) {
                ea = ea2;
                maxArea = area;
            }
        }
        return ea;
    }

    public final GS[] Vg() {
        return DZ.Ji0(Wz0());
    }

    @Override
    public final void dispose() {
        this.UB.free();
    }

    public final void n3(GS gs) {
        this.rt0.ND.m9();
        Z3 z3 = (Z3) gs;
        if (GLFW.glfwGetWindowMonitor(this.rt0.hc0) != 0L) {
            Z3 rr0 = DZ.rr0(Wz0());
            if (rr0.QL0 == z3.QL0 && rr0.ax == z3.ax) {
                GLFW.glfwSetWindowSize(this.rt0.hc0, z3.Vo, z3.c50);
            } else {
                GLFW.glfwSetWindowMonitor(this.rt0.hc0, z3.QL0, 0, 0, z3.Vo, z3.c50, z3.ax);
            }
        } else {
            this.cu0 = this.rt0.Py();
            this.Pm0 = this.rt0.hv();
            this.ZH0 = this.Cl;
            this.G0 = this.DB;
            this.mH0 = DZ.rr0(Wz0());
            GLFW.glfwSetWindowMonitor(this.rt0.hc0, z3.QL0, 0, 0, z3.Vo, z3.c50, z3.ax);
        }
        AR();
        DZ dz = this.rt0.IG0;
        dz.qH0 = dz.qH0;
        GLFW.glfwSwapInterval(dz.qH0 ? 1 : 0);
    }

    public final void zE(int i, int i2) {
        this.rt0.ND.m9();
        if (GLFW.glfwGetWindowMonitor(this.rt0.hc0) != 0L) {
            if (this.mH0 == null) {
                this.cu0 = this.rt0.Py();
                this.Pm0 = this.rt0.hv();
                this.ZH0 = this.Cl;
                this.G0 = this.DB;
                this.mH0 = DZ.rr0(Wz0());
            }
            if (i == this.ZH0 && i2 == this.G0) {
                GLFW.glfwSetWindowMonitor(this.rt0.hc0, 0L, this.cu0, this.Pm0, i, i2, this.mH0.ax);
            } else {
                w0_0 jW = DZ.jW((T7) Wz0(), i, i2);
                GLFW.glfwSetWindowMonitor(this.rt0.hc0, 0L, jW.ft, jW.t90, i, i2, this.mH0.ax);
            }
        } else {
            w0_0 w0_0Var = null;
            boolean z = false;
            if (i != this.Cl || i2 != this.DB) {
                z = true;
                w0_0Var = DZ.jW((T7) Wz0(), i, i2);
            }
            GLFW.glfwSetWindowSize(this.rt0.hc0, i, i2);
            if (z) {
                GLFW.glfwSetWindowPos(this.rt0.hc0, w0_0Var.ft, w0_0Var.t90);
            }
        }
        AR();
    }

    public final hz0 JB0(i4_0 i4_0Var, int i, int i2) {
        return new hz0(this.rt0, i4_0Var, i, i2);
    }
}
