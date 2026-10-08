package cn.pokemmo.ui.widget;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.W50
 */
public class Modern_Ui_W50 extends VL0 {

    public final /* synthetic */ IZ qv0;

    public Modern_Ui_W50(IZ widget, Aj range) {
        super(range);
        this.qv0 = widget;
    }

    @Override
    public final void case$(int value) {
        int previous = this.eB0;
        super.case$(value);

        IZ widget = this.qv0;
        RJ0 range = tw0_0.rl.Bb(tw0_0.rl.u40);
        if (widget.wy() > range.a90(widget.mk0.nn.wQ)) {
            super.case$(previous);
        }

        int count = widget.wy();
        String[] args = new String[2];
        args[0] = widget.mk0.Ua();
        args[1] = String.valueOf(count);
        widget.la0.Sk(sm0_0.Bx(5638, args));

        range = tw0_0.rl.Bb(tw0_0.rl.u40);
        if (range.a90(widget.mk0.nn.wQ) < count) {
            for (VL0 child : widget.fa) {
                child.aB0.pw0(this.eB0 > 0);
                child.BA0.pw0(child.eB0 < 31);
            }
        }

        CE source = widget.Pv;
        byte[] values = new byte[gc_2.Wp.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = source.RI(gc_2.Wp[i]);
        }

        for (gc_2 stat : gc_2.Wp) {
            VL0 child = widget.fa[stat.CoM2];
            int target = values[stat.v10];
            if (this.eB0 > target) {
                child.aB0.pw0(true);
                child.BA0.pw0(false);
            } else if (this.eB0 < target) {
                child.aB0.pw0(false);
                child.BA0.pw0(true);
            } else {
                child.aB0.pw0(false);
                child.BA0.pw0(false);
            }
        }

        this.BA0.pw0(this.eB0 < 31);
        this.aB0.pw0(this.eB0 > 0);
    }
}

