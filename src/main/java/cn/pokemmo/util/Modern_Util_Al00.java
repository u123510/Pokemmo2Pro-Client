package cn.pokemmo.util;

import f.*;


/**
 * 现代化重构类 - 原始混淆类: f.al0_0
 */
public class Modern_Util_Al00 extends ge_0 {

    public long Lx;
    public boolean C9;
    public final CH0 Mv;
    public final qk0_2 S60;

    public Modern_Util_Al00(CH0 owner, String message) {
        this.C9 = false;
        this.S60 = new qk0_2();
        this.LX(this.S60);
        this.S60.Eo("<div style=\"display: inline; word-wrap: break-word;\">"
                + wq_0.P60(message) + "\n</div>");
        this.Mv = owner;
        this.Lx = System.currentTimeMillis() + 5000L;
    }

    public final void close() {
        lg_0.k.lPT5(new Am0((al0_0)this));
    }

    public final void throws$() {
        this.C9 = true;
        this.z70 = new N1(new t5_0((al0_0)this), gn_0.WHITE);
        this.z70.iG0(250);
        this.z70.Q4(this::close);
    }

    public final void HP(zk0_1 context) {
        if (System.currentTimeMillis() >= this.Lx && !this.C9) {
            this.throws$();
        }
        super.HP(context);
    }

    public final void K8() {
        this.lt0();
        super.K8();
    }
}

