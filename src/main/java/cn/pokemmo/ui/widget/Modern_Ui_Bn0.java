package cn.pokemmo.ui.widget;

import f.*;


/**
 * 现代化重构类 - 原始混淆类: f.bn_0
 */
public class Modern_Ui_Bn0 extends te0_0 implements ro0_0 {

    public boolean du0;
    public boolean Bp;
    public final boolean Ux;

    public Modern_Ui_Bn0() {
        super();
        this.du0 = true;
        this.Ux = true;
    }

    public float Q70() {
        return this.uq0();
    }

    public float n30() {
        return this.Tn0();
    }

    public float uq0() {
        return 0.0f;
    }

    public float Tn0() {
        return 0.0f;
    }

    public final void Gu() {
    }

    public final void Y00() {
    }

    public final void PD0() {
        if (!this.Ux) {
            return;
        }
        xv_0 xv0 = this.xO;
        if (this.Bp && xv0 != null) {
            ir_0 ir = this.uP;
            if (ir != null && ir.cx0 == xv0) {
                this.DC(ir.Prn.qj, ir.Prn.eY);
            } else {
                this.DC(xv0.E20, xv0.TK0);
            }
        }
        if (!this.du0) {
            return;
        }
        this.du0 = false;
        this.Od();
    }

    public final void KE0() {
        if (!this.Ux) {
            return;
        }
        this.du0 = true;
        xv_0 xv0 = this.xO;
        if (xv0 instanceof ro0_0) {
            ((ro0_0) xv0).KE0();
        }
    }

    public final void Ne0() {
        this.du0 = true;
    }

    public void BS(ui_1 ui, float f) {
        this.PD0();
    }

    public void Od() {
    }
}

