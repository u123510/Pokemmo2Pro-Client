package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

public class TooltipFloatingLabel extends BaseLabel {
    public final Mm t60;
    public final X90 T90;
    public final S70[] UB;

    public TooltipFloatingLabel(COm8_ owner, ly_1 layout, X90 type) {
        super();
        this.T90 = type;
        q10_0 group = type.ZD0();
        if (group == q10_0.Ci) {
            this.uf("wardrobe-addon-item-back");
        } else if (group != q10_0.Bj0 && group != q10_0.VI
                && group != q10_0.rg0 && group != q10_0.uz) {
            this.uf("wardrobe-addon-item-body");
        } else {
            this.uf("wardrobe-addon-item");
        }

        Mm model = new Mm(this);
        this.t60 = model;
        if (group != q10_0.VI) {
            model.qd((byte) 30, group, (short) 0);
        }
        if (group != q10_0.uz) {
            model.qd((byte) 0, group, (short) 2);
        }
        model.qd((byte) 3, group, type.Y0());
        model.CF0(2);
        this.RR(new rj_2((f.ic0_1)(Object)this, owner, layout));
        S70[] parts;
        if (type.KE0() > 0) {
            mc0_1 image = gu0.Az0().lPT6(type.KE0());
            parts = jq0_0.dq0(image);
            jq0_0.eV(image);
        } else {
            parts = new S70[0];
        }
        this.UB = parts;
        for (S70 part : parts) {
            this.SL(part);
        }
    }

    @Override
    public final void Dw0(zk0_1 context) {
        super.Dw0(context);
        this.t60.Si = -32;
        this.t60.Zx0 = -32;
        q10_0 group = this.T90.SG;
        if (group == q10_0.Bj0 || group == q10_0.VI
                || group == q10_0.rg0 || group == q10_0.uz) {
            this.t60.Vd0(-32, -32);
        } else if (group == q10_0.Qh0) {
            this.t60.eQ((byte) 18, -32, -32);
        } else if (group == q10_0.Ci) {
            this.t60.eQ((byte) 0, -16, -32);
        } else {
            this.t60.eQ((byte) 0, -32, -32);
        }
    }

    @Override
    public final void K8() {
        for (int index = 0; index < this.UB.length; index++) {
            S70 part = this.UB[index];
            part.E40(this.A20 + 4 + index * 16, this.SB0 + this.OB - 20);
        }
    }
}
