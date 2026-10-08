package f;

import cn.pokemmo.io.filter.FileFilterUtils;
import java.util.ArrayList;

public abstract class AUX_ extends FileFilterUtils {
    public static final int LPt6 = 0;

    static {
        iq_2[] var0 = new iq_2[2];
        Nw0 var1 = Nw0.Af;
        var0[0] = var1;
        var0[1] = new ID("CVS");
        mz_0 var6 = new mz_0(Mv(var0));
        new ud0_2(var6);
        var0 = new iq_2[2];
        var0[0] = var1;
        var0[1] = new ID(".svn");
        mz_0 var5 = new mz_0(Mv(var0));
        new ud0_2(var5);
    }

    public static ArrayList Mv(iq_2... var0) {
        return toList(var0);
    }
}
