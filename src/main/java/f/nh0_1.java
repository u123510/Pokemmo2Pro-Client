package f;

import cn.pokemmo.ui.twl.renderer.TwlTintStack;

/**
 * 着色层级栈兼容垫片
 * @see cn.pokemmo.ui.twl.renderer.TwlTintStack
 */
public final class nh0_1 extends TwlTintStack {
    public final nh0_1 Tf0;
    public nh0_1 qa;
    public float Jl0;
    public float fN;
    public float h6;
    public float UX;
    public final ui_1 pX;

    public nh0_1(ui_1 ui_12) {
        super(ui_12);
        this.pX = ui_12;
        this.Tf0 = this;
        this.Jl0 = 0.003921569f;
        this.fN = 0.003921569f;
        this.h6 = 0.003921569f;
        this.UX = 0.003921569f;
    }

    public nh0_1(nh0_1 nh0_12) {
        super(nh0_12);
        this.Tf0 = nh0_12;
        this.pX = nh0_12.pX;
    }

    public final nh0_1 j60(float f, float f2, float f3, float f4) {
        if (this.qa == null) {
            this.qa = new nh0_1(this);
        }
        nh0_1 nh0_12 = this.qa;
        nh0_12.Jl0 = this.Jl0 * f;
        nh0_12.fN = this.fN * f2;
        nh0_12.h6 = this.h6 * f3;
        nh0_12.UX = this.UX * f4;
        return nh0_12;
    }

    public final void VF(gn_0 gn_02) {
        float f = this.fN * (float)(gn_02.x8 & 0xFF);
        float f2 = this.h6 * (float)(gn_02.sh & 0xFF);
        float f3 = this.UX * (float)(gn_02.FY & 0xFF);
        this.pX.TJ0(this.Jl0 * (float)(gn_02.cv & 0xFF), f, f2, f3);
    }
}
