package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.qh0_1
 */
public class Modern_Util_qh0_1 {

    public int Bl0;
    public int Xk0;
    public int OY;
    public int sK0;
    public int Co0 = 2;
    public int f0 = 0;
    public long Xc = hk0_1.lQ();
    public boolean TB = false;
    public final /* synthetic */ kk0_2 SR;

    public Modern_Util_qh0_1(kk0_2 kk0_22) {
        this.SR = kk0_22;
    }

    public final void tp(boolean bl) {
        Modern_Util_qh0_1 qh0_12 = this;
        qh0_12.Co0 = rg0_2.r4(3);
        qh0_12.f0 = 0;
        ly0_0 ly0_02 = tw0_0.LD0.Sc.Ej0();
        qh0_12.OY = rg0_2.j40((int)ly0_02.jG0.x, (int)(ly0_02.Xa0.x * 2.0f)) - (int)ly0_02.ec0.x / 2;
        qh0_12.sK0 = rg0_2.j40((int)ly0_02.jG0.y, (int)(ly0_02.Xa0.y * 2.0f)) - (int)ly0_02.ec0.y / 2;
        int n = rg0_2.r4(15);
        int n2 = bl ? 0 : 5;
        Modern_Util_qh0_1 qh0_13 = this;
        n += n2;
        n2 = this.OY;
        qh0_13.Bl0 = n * 21 + n2;
        qh0_13.Xk0 = qh0_13.sK0 - n * 64;
        if (qh0_13.SR.CJ) {
            this.TB = true;
        }
    }
}


