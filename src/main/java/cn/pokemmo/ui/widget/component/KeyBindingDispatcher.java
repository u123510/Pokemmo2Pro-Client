package cn.pokemmo.ui.widget.component;

import f.a9_0;
import f.da_1;
import f.i70_0;

public class KeyBindingDispatcher {
    public da_1[] ec = new da_1[16];
    public int Ir;

    public KeyBindingDispatcher() {
    }

    public boolean jf0(i70_0 var1, String var2) {
        da_1 var3 = (da_1) a9_0.i40(this.ec, var2);
        if (var3 == null) {
            return false;
        }
        int var4 = var1.zu;
        if (var4 == 10) {
            if ((var3.By & 2) != 0) {
                var3.Hy.run();
                return true;
            }
        }
        if (var4 == 9 && (var3.By & 1) != 0) {
            if (!var1.l() || (var3.By & 4) != 0) {
                var3.Hy.run();
                return true;
            }
        }
        return true;
    }

    public void B8(String var1, Runnable var2, int var3) {
        da_1[] var4 = (da_1[]) a9_0.bj(this.ec, this.Ir++);
        this.ec = var4;
        da_1 var5 = new da_1(var1, var2, var3);
        int var6 = var5.Yj0 & (var4.length - 1);
        var5.Qk = var4[var6];
        var4[var6] = var5;
    }
}
