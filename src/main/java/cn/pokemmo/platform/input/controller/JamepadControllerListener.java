/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.platform.input.controller;

import f.*;


import com.studiohartman.jamepad.ControllerManager;
import f.com6__4;

/*
 * Renamed from f.Qp
 */
public class JamepadControllerListener
implements com6__4 {
    public final ControllerManager NK;

    public JamepadControllerListener(ControllerManager controllerManager) {
        this.NK = controllerManager;
    }

    @Override
    public final void wy0() {
    }

    @Override
    public final void dispose() {
        this.NK.Bc();
    }
}

