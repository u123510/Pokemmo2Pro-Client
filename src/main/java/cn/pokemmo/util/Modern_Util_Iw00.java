package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.iw0_0
 */
public class Modern_Util_Iw00
implements g2_0 {

    public boolean Kn0 = false;
    public boolean z8 = false;
    public final /* synthetic */ com3__5 uP;

    public Modern_Util_Iw00(com3__5 com3__52) {
        this.uP = com3__52;
    }

    @Override
    public final boolean H2(boolean bl, int n) {
        if (this.uP.NQ != tw0_0.LD0.Sc) {
            return false;
        }
        if (!this.Kn0) {
            return true;
        }
        if (bl) {
            rp_0 rp_02 = rp_0.sJ0;
            if ((rp_02 == null || !rp_02.Ov(n)) && (rp_02 = rp_0.nK0) != null && rp_02.Ov(n)) {
                return true;
            }
        }
        if ((bl = this.z8) && this.uP.NQ.COM4 == null) {
            return false;
        }
        if (bl) {
            return true;
        }
        this.z8 = true;
        this.uP.NQ.VI(true, (short)0, (short)0, 0.0f, 0.0f, 0.0f, 0.0f, (short)36);
        return true;
    }
}


