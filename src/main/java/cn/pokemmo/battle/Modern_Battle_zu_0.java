package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.zu_0
 */
public abstract class Modern_Battle_zu_0 {

    public Modern_Battle_zu_0() {
        super();
    }

    protected final es_1 controllers = new es_1();
    protected LH0 currentController;

    public static LH0 access$000(zu_0 target) {
        return target.currentController;
    }

    public static LH0 access$002(zu_0 target, LH0 controller) {
        target.currentController = controller;
        return controller;
    }

    public es_1 getControllers() {
        return this.controllers;
    }

    public LH0 getCurrentController() {
        return this.currentController;
    }

    public abstract void addListener(vc0_1 listener);
}

