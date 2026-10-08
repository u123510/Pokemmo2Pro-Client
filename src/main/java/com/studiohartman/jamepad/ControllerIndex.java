/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  f.J90
 *  f.SW
 *  f.fp0_0
 *  f.jz0_0
 *  f.lk0_0
 */
package com.studiohartman.jamepad;

import f.J90;
import f.SW;
import f.fp0_0;
import f.jz0_0;
import f.lk0_0;

public final class ControllerIndex {
    public final int Ki;
    public long LpT1;
    public final boolean[] Pa0;
    public final boolean[] W40;

    public ControllerIndex(int n) {
        this.Ki = n;
        this.Pa0 = new boolean[jz0_0.values().length];
        this.W40 = new boolean[jz0_0.values().length];
        n = 0;
        while (true) {
            boolean[] blArray = this.Pa0;
            if (n >= this.Pa0.length) break;
            blArray[n] = false;
            this.W40[n] = false;
            ++n;
        }
        this.Bi0();
    }

    private native long nativeConnectController(int var1);

    private native void nativeClose(long var1);

    private native boolean nativeIsConnected(long var1);

    private native boolean nativeCheckButton(long var1, int var3);

    private native boolean nativeButtonAvailable(long var1, int var3);

    private native int nativeCheckAxis(long var1, int var3);

    private native boolean nativeAxisAvailable(long var1, int var3);

    private native String nativeGetName(long var1);

    private native int nativeGetDeviceInstanceID(long var1);

    private native int nativeGetPowerLevel(long var1);

    public final void Bi0() {
        ControllerIndex controllerIndex = this;
        controllerIndex.LpT1 = controllerIndex.nativeConnectController(controllerIndex.Ki);
    }

    public final void ZG() {
        long l = this.LpT1;
        if (l != 0L && this.nativeIsConnected(l)) {
            return;
        }
        throw sneakyThrow(new lk0_0(fp0_0.uD((StringBuilder)new StringBuilder("Controller at index "), (int)this.Ki, (String)" is not connected!")));
    }

    @SuppressWarnings("unchecked")
    private static <E extends Throwable> RuntimeException sneakyThrow(Throwable throwable) throws E {
        throw (E)throwable;
    }

    public final void O1() {
        long l = this.LpT1;
        if (l != 0L) {
            this.nativeClose(l);
            this.LpT1 = 0L;
        }
    }

    public final boolean O00(jz0_0 jz0_02) {
        ControllerIndex controllerIndex = this;
        int n = jz0_02.ordinal();
        controllerIndex.ZG();
        boolean bl = controllerIndex.nativeCheckButton(controllerIndex.LpT1, n);
        boolean[] blArray = this.W40;
        boolean bl2 = bl && !this.Pa0[n];
        blArray[n] = bl2;
        this.Pa0[n] = bl;
        return this.Pa0[jz0_02.ordinal()];
    }

    public final boolean Nt0(jz0_0 jz0_02) {
        ControllerIndex controllerIndex = this;
        controllerIndex.ZG();
        long l = controllerIndex.LpT1;
        int n = jz0_02.ordinal();
        return this.nativeButtonAvailable(l, n);
    }

    public final float aI(SW sW) {
        ControllerIndex controllerIndex = this;
        controllerIndex.ZG();
        long l = controllerIndex.LpT1;
        int n = sW.ordinal();
        return (float)this.nativeCheckAxis(l, n) / 32767.0f;
    }

    public final boolean lM(SW sW) {
        ControllerIndex controllerIndex = this;
        controllerIndex.ZG();
        long l = controllerIndex.LpT1;
        int n = sW.ordinal();
        return this.nativeAxisAvailable(l, n);
    }

    public final String hq() {
        this.ZG();
        String name = this.nativeGetName(this.LpT1);
        if (name == null) {
            return "Unnamed Controller";
        }
        return name;
    }

    public final int Wq0() {
        ControllerIndex controllerIndex = this;
        controllerIndex.ZG();
        return controllerIndex.nativeGetDeviceInstanceID(controllerIndex.LpT1);
    }

    public final void Zn() {
        long l;
        ControllerIndex controllerIndex = this;
        controllerIndex.O1();
        this.LpT1 = l = controllerIndex.nativeConnectController(controllerIndex.Ki);
        if (l != 0L) {
            this.nativeIsConnected(l);
        }
    }

    public final int CB0() {
        ControllerIndex controllerIndex = this;
        controllerIndex.ZG();
        return J90.uY((int)7)[controllerIndex.nativeGetPowerLevel(controllerIndex.LpT1) + 1];
    }
}

