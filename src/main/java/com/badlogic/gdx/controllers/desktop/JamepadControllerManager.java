/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.controllers.desktop;

import com.studiohartman.jamepad.ControllerManager;
import f.be0_0;
import f.eo_0;
import f.es_1;
import f.fy0_0;
import f.lg_0;
import f.mg0_1;
import f.o6;
import f.qp_0;
import f.vc0_1;
import f.zu_0;

public class JamepadControllerManager
extends zu_0
implements fy0_0 {
    public static o6 jamepadConfiguration;
    private static boolean nativeLibInitialized = false;
    private static ControllerManager controllerManager;
    private final be0_0 compositeListener;

    public JamepadControllerManager() {
        be0_0 be0_02 = new be0_0();
        this.compositeListener = be0_02;
        be0_02.z00(new eo_0(this));
        if (!nativeLibInitialized) {
            if (jamepadConfiguration == null) {
                jamepadConfiguration = new o6();
            }
            controllerManager = new ControllerManager(jamepadConfiguration);
            controllerManager.rr0();
            new mg0_1(controllerManager, be0_02).run();
            lg_0.k.NH(new qp_0(controllerManager));
            nativeLibInitialized = true;
        }
    }

    public static void addMappingsFromFile(String string) {
        controllerManager.Sa0(string);
    }

    public static void logLastNativeGamepadError() {
        lg_0.k.Xd0("Jamepad", controllerManager.getLastNativeError());
    }

    public static /* synthetic */ es_1 access$100(JamepadControllerManager jamepadControllerManager) {
        return jamepadControllerManager.controllers;
    }

    public static /* synthetic */ es_1 access$200(JamepadControllerManager jamepadControllerManager) {
        return jamepadControllerManager.controllers;
    }

    public static /* synthetic */ es_1 access$300(JamepadControllerManager jamepadControllerManager) {
        return jamepadControllerManager.controllers;
    }

    public static /* synthetic */ es_1 access$400(JamepadControllerManager jamepadControllerManager) {
        return jamepadControllerManager.controllers;
    }

    @Override
    public void addListener(vc0_1 vc0_12) {
        this.compositeListener.we0.add(vc0_12);
    }

    public void removeListener(vc0_1 vc0_12) {
        this.compositeListener.we0.remove(vc0_12);
    }

    public es_1 getListeners() {
        es_1 es_12 = new es_1();
        es_12.Ue0(this.compositeListener);
        return es_12;
    }

    public void clearListeners() {
        this.compositeListener.we0.clear();
        this.compositeListener.we0.add(new eo_0(this));
    }

    @Override
    public void dispose() {
        controllerManager.Bc();
    }
}
