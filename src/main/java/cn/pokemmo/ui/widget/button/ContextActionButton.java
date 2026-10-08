package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public class ContextActionButton extends BaseButton {
    public final /* synthetic */ ng_2 Zm;
    public final /* synthetic */ gc_2 CA0;
    public final /* synthetic */ VU hs;

    public ContextActionButton(ng_2 ng_22, String string, gc_2 gc_22, VU vU) {
        super(string);
        this.Zm = ng_22;
        this.CA0 = gc_22;
        this.hs = vU;
    }

    public static void FF0(String string) {
        tw0_0.rl.getClass();
        tw0_0.rl.Cp(zo_0.Pk, string, "", true);
    }

    @Override
    public final boolean nd0(i70_0 i70_02) {
        int n;
        if (tw0_0.Yw(8) && E00.C10(n = i70_02.zu) && n == 3 && i70_02.nA0 == 1) {
            VU vU = tw0_0.rl.PC0.sF(this.Zm.se);
            if (vU == null) {
                return super.nd0(i70_02);
            }
            short s = vU.I8.ou0;
            EP ep = new EP(sm0_0.c0(1849));
            String[] stringArray = new String[] { "31", "28", "15", "0", "Random" };
            int[] nArray = new int[] { 31, 28, 15, 0, rg0_2.r4(31) };
            for (int i = 0; i < 5; i++) {
                String string = "//setivs " + s;
                for (byte b = 0; b < gc_2.Wp.length; b = (byte) (b + 1)) {
                    if (b == this.CA0.v10) {
                        string = string + " " + nArray[i];
                    } else {
                        string = string + " " + this.hs.I8.RI((gc_2) gc_2.z80.BM(b));
                    }
                }
                String str = string;
                ep.hx.add(new at_0(stringArray[i], () -> FF0(str)));
            }
            UA.rL(ep, this.Zm, i70_02.f8, i70_02.AN);
            return true;
        }
        return super.nd0(i70_02);
    }
}
