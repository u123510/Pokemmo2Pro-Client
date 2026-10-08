package cn.pokemmo.util;

import f.*;
import cn.pokemmo.world.weather.WeatherEffectDescriptor;

/**
 * 现代化重构类 - 原始混淆类: f.lr0
 */
public class Modern_Util_Lr0 {

    public int gY;
    public int cb;
    public int qG;
    public int eD;
    public int kb0 = 0;
    public long yI0 = hk0_1.lQ();
    public boolean fj = false;
    public final /* synthetic */ WeatherEffectDescriptor Gc0;

    public Modern_Util_Lr0(WeatherEffectDescriptor ak_02) {
        this.Gc0 = ak_02;
    }

    public Modern_Util_Lr0(ak_0 ak_02) {
        this.Gc0 = ak_02;
    }

    public final void lq0(boolean bl) {
        Modern_Util_Lr0 lr02 = this;
        lr02.kb0 = 0;
        ly0_0 ly0_02 = tw0_0.LD0.Sc.Ej0();
        lr02.qG = rg0_2.j40((int)ly0_02.jG0.x, (int)(ly0_02.Xa0.x * 2.0f)) - (int)ly0_02.ec0.x / 2;
        lr02.eD = rg0_2.j40((int)ly0_02.jG0.y, (int)(ly0_02.Xa0.y * 2.0f)) - (int)ly0_02.ec0.y / 2;
        int n = rg0_2.r4(15);
        int n2 = bl ? 0 : 5;
        Modern_Util_Lr0 lr03 = this;
        n += n2;
        n2 = this.qG;
        lr03.gY = n * 16 + n2;
        lr03.cb = lr03.eD - n * 32;
        if (lr03.Gc0.CJ) {
            this.fj = true;
        }
    }
}


