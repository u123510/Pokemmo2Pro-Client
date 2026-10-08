package cn.pokemmo.task.callback;

import f.*;

import com.badlogic.gdx.controllers.desktop.JamepadControllerManager;
import com.studiohartman.jamepad.ControllerIndex;
import com.studiohartman.jamepad.ControllerManager;

public class TaskCallbackMg01 implements Runnable  {
    public final ControllerManager ad0;
    public final vc0_1 AE;
    public final nl_1 ze0;
    public final es_1 Kn0;

    public TaskCallbackMg01(ControllerManager controllerManager, vc0_1 vc0_1) {
        JamepadControllerManager.jamepadConfiguration.getClass();
        this.ze0 = new nl_1(4);
        this.Kn0 = new es_1();
        this.ad0 = controllerManager;
        this.AE = vc0_1;
        Dq();
    }

    @Override
    public final void run() {
        if (this.ad0.xx()) {
            Dq();
        }
        xz_1 zG = this.ze0.zG();
        while (zG.hasNext()) {
            o3_0 o3_0 = ((fe0_1) zG.next()).dq0;
            o3_0.getClass();
            jz0_0[] values = jz0_0.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                int ordinal = values[i].ordinal();
                boolean gE0 = o3_0.gE0(ordinal);
                if (gE0 != ((Boolean) o3_0.Pu.get(ordinal)).booleanValue()) {
                    if (gE0) {
                        o3_0.Jk.PL0(o3_0, ordinal);
                    } else {
                        o3_0.Jk.KY(o3_0, ordinal);
                    }
                    Ls0 ls0 = o3_0.Pj;
                    if (ls0.Em0 == 3) {
                        StringBuilder go = CO.go("Button [", ordinal, " - ");
                        go.append(o3_0.C90.get(ordinal));
                        go.append("] is ");
                        go.append(gE0 ? "pressed" : "released");
                        ls0.QR(go.toString());
                    }
                }
                o3_0.Pu.qx0(ordinal, Boolean.valueOf(gE0));
            }
            SW[] values2 = SW.values();
            int length2 = values2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                int ordinal2 = values2[i2].ordinal();
                float lV = o3_0.lV(ordinal2);
                if (lV != ((Float) o3_0.vN.get(ordinal2)).floatValue()) {
                    Ls0 ls02 = o3_0.Pj;
                    if (ls02.Em0 == 3) {
                        StringBuilder go2 = CO.go("Axis [", ordinal2, " - ");
                        go2.append(o3_0.m80.get(ordinal2));
                        go2.append("] moved [");
                        go2.append(lV);
                        go2.append("]");
                        ls02.QR(go2.toString());
                    }
                    o3_0.Jk.H2(o3_0, ordinal2, lV);
                }
                o3_0.vN.qx0(ordinal2, Float.valueOf(lV));
            }
            if (!o3_0.fJ) {
                zG.remove();
            }
        }
        lg_0.k.lPT5(this);
    }

    public final void Dq() {
        xz_1 zG = this.ze0.zG();
        while (zG.hasNext()) {
            fe0_1 fe0_1 = (fe0_1) zG.next();
            fe0_1.ww = null;
            fe0_1.dq0.ch = null;
        }
        this.Kn0.clear();
        JamepadControllerManager.jamepadConfiguration.getClass();
        for (int i = 0; i < 4; i++) {
            try {
                ControllerManager controllerManager = this.ad0;
                if (!controllerManager.jz0) {
                    throw new IllegalStateException("SDL_GameController is not initialized!");
                }
                ControllerIndex controllerIndex = controllerManager.gF0[i];
                if (Boolean.FALSE.booleanValue()) {
                    throw new lk0_0("");
                }
                int Wq0 = controllerIndex.Wq0();
                nl_1 nl_1 = this.ze0;
                boolean contains;
                if (Wq0 == 0) {
                    contains = nl_1.Bu;
                } else {
                    contains = nl_1.auX(Wq0) >= 0;
                }
                if (contains) {
                    fe0_1 fe0_12 = (fe0_1) this.ze0.get(Wq0);
                    fe0_12.ww = controllerIndex;
                    fe0_12.dq0.ch = controllerIndex;
                } else {
                    fe0_1 fe0_13 = new fe0_1(controllerIndex);
                    this.ze0.qx0(Wq0, fe0_13);
                    this.Kn0.Ue0(fe0_13.dq0);
                }
            } catch (ArrayIndexOutOfBoundsException | lk0_0 ignored) {
            }
        }
        xz_1 zG2 = this.ze0.zG();
        while (zG2.hasNext()) {
            fe0_1 fe0_14 = (fe0_1) zG2.next();
            if (fe0_14.ww == null) {
                fe0_14.dq0.RM();
                zG2.remove();
            }
        }
        I2 zd = this.Kn0.ZD();
        while (zd.hasNext()) {
            o3_0 o3_0 = (o3_0) zd.next();
            o3_0.Jk.we0.add(this.AE);
            this.AE.COm6(o3_0);
        }
    }
}
