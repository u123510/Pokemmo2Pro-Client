package cn.pokemmo.util.collection;

import f.*;


/**
 * 现代化重构类 - 原始混淆类: f.bl_0
 */
public class Modern_Col_Bl0
extends G40 {

    public final E90 Dp;
    public final long wW = System.currentTimeMillis();
    public boolean oj = false;

    public Modern_Col_Bl0(E90 e90) {
        this.Dp = e90;
        tw0_0.rl.Am(true);
        e90.Hp0().OV(nk_0.J9);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void Qr() {
        if (System.currentTimeMillis() - this.wW < (long)3000) {
            return;
        }
        if (!this.oj) {
            String string;
            pk0_0 pk0_02;
            this.oj = true;
            if (tw0_0.PK0 != null) {
                this.Dp.il0.fY(nk_0.Qi0, false);
                pk0_02 = tw0_0.FL;
                int n = 263;
                int n2 = 3;
                String[] stringArray = sm0_0.zb0;
                string = sm0_0.Bw((byte)2, lpt6__2.YG0, n, n2, stringArray);
            } else {
                this.Dp.il0.mV = null;
                pk0_02 = tw0_0.FL;
                int n = 263;
                int n3 = 4;
                String[] stringArray = sm0_0.zb0;
                string = sm0_0.Bw((byte)2, lpt6__2.YG0, n, n3, stringArray);
            }
            pk0_02.Ad(string);
            tw0_0.rl.Am(false);
        }
    }

    @Override
    public final void zR() {
        this.Dp.il0.mV = null;
    }

    @Override
    public final boolean Ob0() {
        return this.oj && !tw0_0.FL.gi0();
    }

    @Override
    public final byte tQ() {
        throw new UnsupportedOperationException();
    }
}


