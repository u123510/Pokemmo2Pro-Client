package cn.pokemmo.net.packet;

import f.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * 现代化重构类 - 原始混淆类: f.yy0
 */
public class Modern_Net_yy0 {

    public Modern_Net_yy0() {
        super();
    }

    public static final LPT6_[] XI = new LPT6_[9];
    public static final i4_0[] xa0 = new i4_0[9];
    public byte AJ0;
    public LPT6_[] DD0 = XI;
    public final NJ0[] aY = new NJ0[9];
    public i4_0[] PU = xa0;

    public static void ge(LPT6_ lPT6_) {
        lPT6_.OB.dispose();
    }

    public final void ol0() {
        Modern_Net_yy0 yy02 = this;
        Arrays.stream(yy02.PU).filter(Objects::nonNull).forEach(i4_02 -> i4_02.dispose());
        Arrays.stream(yy02.DD0).filter(Objects::nonNull).forEach(yy0::ge);
        for (int j = 0; j < 9; ++j) {
            Modern_Net_yy0 yy03 = this;
            yy03.PU[j] = null;
            yy03.aY[j] = null;
            yy03.DD0[j] = null;
        }
    }
}


