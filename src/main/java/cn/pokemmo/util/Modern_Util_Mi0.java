package cn.pokemmo.util;

import f.*;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 现代化重构类 - 原始混淆类: f.mi_0
 */
public class Modern_Util_Mi0
extends sg_2 {

    public VU AG;
    public Consumer Xk0 = Function.identity()::apply;

    public Modern_Util_Mi0() {
        this((VU)null);
    }

    public Modern_Util_Mi0(VU vU) {
        this.AG = vU;
    }

    @Override
    public void zl() {
    }

    public final void Db(VU vU) {
        Modern_Util_Mi0 mi_02 = this;
        mi_02.AG = vU;
        mi_02.Xk0.accept(this);
        mi_02.nI();
        mi_02.zl();
        mi_02.COm3();
    }

    @Override
    public final void av0(sg_2 sg_22) {
        Modern_Util_Mi0 mi_02 = this;
        mi_02.Db(sg_22.ol0());
        a7_0.bH(mi_02.ER.Fc0);
    }

    @Override
    public final VU ol0() {
        return this.AG;
    }

    @Override
    public final boolean HP() {
        return true;
    }

    public final void eL0(Consumer consumer) {
        this.Xk0 = consumer;
    }

    @Override
    public void TG0(i70_0 i70_02) {
        Runnable runnable;
        if (i70_02.nA0 == 0 && (runnable = this.Nj) != null) {
            runnable.run();
        }
        if (i70_02.nA0 == 1) {
            if ((i70_02.J30 & 0x24) != 0) {
                BU.T50.FI(this.AG, this, qo_1.DL, false);
            } else {
                BU.T50.FI(this.AG, null, qo_1.DL, false);
            }
        }
    }

    @Override
    public boolean BT(i70_0 i70_02) {
        return false;
    }

    @Override
    public void Ol0() {
        this.nA();
    }
}


