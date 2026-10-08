package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.af0_0
 */
public class Modern_Battle_Af00 {
    public static final af0_0 SS = new af0_0();
    public long P10 = 0L;
    public int Lu0 = 0;
    public int fq0 = 0;
    public int mr = 0;
    public int jL0 = 0;
    public long De = 0L;

    public Modern_Battle_Af00() {
        super();
    }

    public final void bk() {
        long l = hk0_1.KG;
        if (l < this.De) {
            if (l - this.P10 > (long)this.jL0) {
                this.P10 = l;
                ++this.Lu0;
            }
        } else {
            this.fq0 = 0;
            this.mr = 0;
        }
    }
}
