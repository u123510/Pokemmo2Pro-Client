package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackHh00 implements Runnable  {
    public final BR vG;

    public TaskCallbackHh00(BR owner) {
        this.vG = owner;
    }

    @Override
    public final void run() {
        this.vG.lZ.kN();
        Ge0.Vv0 = 0;
        com6__1.WI0.cI0((short)0, (short)0);
        nf_0.zo0().w30(500, true);
        tw0_0.PK0 = null;
        tw0_0.rl = null;
        yt_1 world = tw0_0.e60;
        if (world != null) {
            world.dispose();
            tw0_0.e60 = null;
        }
        jn_0 screen = tw0_0.LD0;
        vo_2 scene = screen.Sc;
        if (scene != null) {
            scene.dispose();
            screen.Sc = null;
        }
        XD overlay = screen.no0;
        if (overlay != null) {
            if (!overlay.bb0) {
                overlay.bb0 = true;
                overlay.c80();
            }
            if (overlay.zr0()) {
                BU.T50.Ll(true);
            }
            overlay.dispose();
            Runnable callback = overlay.zM;
            if (callback != null) {
                callback.run();
            }
        }
        screen.no0 = null;
        tw0_0.LD0.Uk0(null);
        Sr resources = tw0_0.LD0.VW;
        if (resources != null) {
            resources.dispose();
            tw0_0.LD0.VW = null;
        }
        tw0_0.RE0.qq();
        tw0_0.lM.BO();
        synchronized (UM.Kf0) {
            UM.Kf0.Og.clear();
        }
        yt_1.l00 = CH0.j1;
        xr_0 loader = tw0_0.Jp;
        if (loader != null) {
            loader.Dc0 = true;
            tw0_0.Jp = null;
        }
    }
}
