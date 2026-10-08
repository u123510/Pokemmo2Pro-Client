package cn.pokemmo.graphics.task;

import f.EA0;
import f.bi0_1;
import f.nk_0;

public class WorldEntitySyncGLTask extends BaseGLTask {
    public final byte Sp0;
    public final bi0_1 iZ;

    public WorldEntitySyncGLTask(byte var1, bi0_1 var2) {
        this.Sp0 = var1;
        this.iZ = var2;
    }

    @Override
    public void run() {
        byte var1 = this.Sp0;
        nk_0 var3;
        if (this.Sp0 != 0) {
            if (var1 != 2) {
                if (var1 != 3) {
                    var3 = nk_0.nx0;
                } else {
                    var3 = nk_0.BE0;
                }
            } else {
                var3 = nk_0.gY;
            }
        } else {
            var3 = nk_0.MF;
        }

        EA0 var10001 = this.iZ.il0;
        nk_0[] var10002 = new nk_0[]{var3, var3, null};
        nk_0 var2 = nk_0.cOm4;
        var10002[2] = var2;
        var10001.LE(var10002);
        this.iZ.rd.il0.LE(var2);
    }
}
