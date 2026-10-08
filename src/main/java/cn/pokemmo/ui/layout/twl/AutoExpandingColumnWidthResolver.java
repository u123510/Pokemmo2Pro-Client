package cn.pokemmo.ui.layout.twl;

import f.I7;
import f.Nj;
import f.W20;
import f.fy_2;
import f.wb_1;

public class AutoExpandingColumnWidthResolver extends wb_1 {
    public final Nj Dk;

    public AutoExpandingColumnWidthResolver(Nj var1) {
        this.Dk = var1;
    }

    public void DE(int var1, int var2) {
        boolean var3 = this.Dk.i9();
        if (!var3) {
            int var4 = 0;
            for (int var5 = 0; var5 < var2; ++var5) {
                int var6 = var1 + var5;
                int var7 = this.Dk.Rs(this.Dk.G70[var6].m0());
                this.p2[var6] = var7;
                var4 += var7;
            }

            if (var4 >= this.Dk.a3()) {
                return;
            }
        }
        this.VS();
        for (int var8 = 0; var8 < var2; ++var8) {
            this.p2[var1 + var8] = this.Dk.Rs(this.Dk.G70[var8].Th0);
        }
    }

    public void VS() {
        if (this.Dk.G70 != null) {
            fy_2 var1 = new fy_2();
            I7 var2 = new I7(var1);

            for (W20 var3 : this.Dk.G70) {
                var2.Vv(var3.Gs0);
            }

            var2.od(0, 0, this.Dk.a3());
        }
    }
}
