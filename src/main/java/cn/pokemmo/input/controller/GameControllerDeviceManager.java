package cn.pokemmo.input.controller;

import f.*;

import java.util.Arrays;
import java.util.HashMap;

public abstract class GameControllerDeviceManager {
    public static final dl_1 zb0 = Cq0.E1(GameControllerDeviceManager.class);
    public static boolean Mf0 = false;
    public static final HashMap PH0 = dw_2.iN();
    public static final HashMap Cn0 = new HashMap();
    public static gc0_0[] B60 = new gc0_0[0];

    public static void ef0() {
        if (Mf0) {
            return;
        }
        B60 = (gc0_0[]) PH0.values().toArray(new gc0_0[0]);
        Mf0 = true;
        dl_1 dl_1Var = zb0;
        dl_1Var.info("Starting controller setup");
        if (!dw_2.Md) {
            dl_1Var.info("Native controllers disabled due to config. (Potentially failed setup)");
            return;
        }
        Tp0 tp0 = new Tp0();
        lpt5__5.hL.ZD(() -> Fw(tp0), 20000L);
        ct0_0.lR();
        ((zu_0) ct0_0.dt0.Wk0(lg_0.k)).getControllers();
        tp0.tk = true;
        Pa();
        et_1 et_1Var = new et_1();
        ct0_0.lR();
        ((zu_0) ct0_0.dt0.Wk0(lg_0.k)).addListener(et_1Var);
    }

    public static es_1 Pa() {
        ef0();
        if (!dw_2.Md) {
            return new es_1();
        }
        ct0_0.lR();
        es_1 controllers = ((zu_0) ct0_0.dt0.Wk0(lg_0.k)).getControllers();
        I2 ZD = controllers.ZD();
        while (ZD.hasNext()) {
            LH0 lh0 = (LH0) ZD.next();
            if (((gc0_0) Cn0.get(lh0)) == null) {
                aY(lh0);
            }
        }
        return controllers;
    }

    public static gc0_0 Kq(LH0 lh0) {
        return (gc0_0) Cn0.get(lh0);
    }

    public static void aY(LH0 lh0) {
        o3_0 o3_0Var = (o3_0) lh0;
        zb0.info("Controller {} ( ax {} btn {}) {} attached. {}", new Object[]{o3_0Var.vC0, Integer.valueOf(o3_0Var.wE()), Integer.valueOf(o3_0Var.SB()), o3_0Var.Kq(), o3_0Var.I80});
        Qy0 qy0 = Qy0.yI0;
        if (qy0 != null) {
            qy0.dk(-1, sm0_0.wa0(1395, o3_0Var.vC0));
            int i = Tu0.wn[o3_0Var.Kq().ordinal()];
        }
        HashMap hashMap = PH0;
        gc0_0 gc0_0Var = (gc0_0) hashMap.get(o3_0Var.vC0);
        if (gc0_0Var != null) {
            gc0_0Var.Dq0 = lh0;
            if (lh0 == null) {
                Arrays.fill(gc0_0Var.te, false);
            } else {
                gc0_0Var.te = new boolean[((o3_0) lh0).wE() * 2];
            }
        } else {
            gc0_0Var = new gc0_0(lh0, o3_0Var.vC0);
            gc0_0Var.GV();
            hashMap.put(o3_0Var.vC0, gc0_0Var);
            B60 = (gc0_0[]) PH0.values().toArray(new gc0_0[0]);
        }
        o3_0Var.Jk.we0.add(gc0_0Var);
        Cn0.put(lh0, gc0_0Var);
    }

    public static void Fw(Tp0 tp0) {
        if (tp0.tk) {
            return;
        }
        dw_2.Md = false;
        dw_2.CY();
        Cq0.E1(GameControllerDeviceManager.class).error("Deadlock setting up controllers. Attempting to restart with controllers disabled.", new RuntimeException());
        tw0_0.uV.Ef0("Error", "Deadlock setting up controllers. Attempting to restart with controllers disabled.\nIf you have Steam application running you can try closing it temporarily and then trying with controller support enabled again.", UE.iC, el0_0::KU, false);
    }

    public static void KU() {
        lg_0.k.T0 = false;
    }
}
