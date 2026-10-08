/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  f.ea0_1
 *  f.jj0_0
 *  f.o6
 */
package com.studiohartman.jamepad;

import com.studiohartman.jamepad.ControllerIndex;
import f.ea0_1;
import f.jj0_0;
import f.o6;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ControllerManager {
    public final o6 vp0;
    public boolean jz0;
    public ControllerIndex[] gF0;

    public ControllerManager(o6 o62) {
        this(o62, 0);
    }

    public ControllerManager(o6 o62, int n) {
        this.vp0 = o62;
        this.jz0 = false;
        o62.getClass();
        this.gF0 = new ControllerIndex[4];
        new ea0_1().h9("jamepad");
    }

    private native boolean nativeInitSDLGamepad(boolean var1);

    private native void nativeCloseSDLGamepad();

    private native boolean nativeControllerConnectedOrDisconnected();

    private native boolean nativeAddMappingsFromBuffer(byte[] var1, int var2);

    public final void rr0() {
        if (!this.jz0) {
            ControllerManager controllerManager = this;
            controllerManager.vp0.getClass();
            if (controllerManager.nativeInitSDLGamepad(true)) {
                this.jz0 = true;
                try {
                    this.Sa0("/gamecontrollerdb.txt");
                }
                catch (Exception exception) {
                    System.err.println("Failed to load mapping with original location \"/gamecontrollerdb.txt\", Falling back of SDL's built in mappings");
                    exception.printStackTrace();
                }
                for (int n = 0; n < this.gF0.length; ++n) {
                    this.gF0[n] = new ControllerIndex(n);
                }
                return;
            }
            throw new IllegalStateException("Failed to initialize SDL in native method!");
        }
        throw new IllegalStateException("SDL is already initialized!");
    }

    public final void Bc() {
        ControllerIndex[] controllerIndexArray = this.gF0;
        int n = this.gF0.length;
        for (int i = 0; i < n; ++i) {
            controllerIndexArray[i].O1();
        }
        this.nativeCloseSDLGamepad();
        this.gF0 = new ControllerIndex[0];
        this.jz0 = false;
    }

    public final boolean xx() {
        if (this.jz0) {
            if (this.nativeControllerConnectedOrDisconnected()) {
                int n = 0;
                while (true) {
                    ControllerIndex[] controllerIndexArray = this.gF0;
                    if (n >= this.gF0.length) break;
                    controllerIndexArray[n].Zn();
                    ++n;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("SDL_GameController is not initialized!");
    }

    public final void Sa0(String object) {
        InputStream inputStream = this.getClass().getResourceAsStream((String)object);
        if (inputStream == null) {
            inputStream = ClassLoader.getSystemResourceAsStream((String)object);
        }
        if (inputStream != null) {
            try {
                int n;
                this.vp0.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int n2 = 4096;
                byte[] byArray = new byte[4096];
                while ((n = inputStream.read(byArray, 0, n2)) != -1) {
                    byteArrayOutputStream.write(byArray, 0, n);
                }
                byte[] byArray2 = byteArrayOutputStream.toByteArray();
                if (this.nativeAddMappingsFromBuffer(byArray2, byArray2.length)) {
                    return;
                }
                throw new IllegalStateException("Failed to set SDL controller mappings! Falling back to build in SDL mappings.");
            } catch (IOException ex) {
                throw new IllegalStateException(ex);
            }
        }
        throw new IllegalStateException(jj0_0.hw0((String)"Cannot open resource from classpath ", (String)object));
    }

    public native String getLastNativeError();
}
