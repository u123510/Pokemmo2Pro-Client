package cn.pokemmo.ui.twl.renderer;

import f.gn_0;
import f.ui_1;

/**
 * 着色层级栈 (TintStack)
 */
public class TwlTintStack {
    public final TwlTintStack parent;
    public TwlTintStack child;
    public float alpha;
    public float red;
    public float green;
    public float blue;
    public final ui_1 renderer;

    public TwlTintStack(ui_1 renderer) {
        this.renderer = renderer;
        this.parent = this;
        this.alpha = 1.0f / 255.0f;
        this.red = 1.0f / 255.0f;
        this.green = 1.0f / 255.0f;
        this.blue = 1.0f / 255.0f;
    }

    public TwlTintStack(TwlTintStack parent) {
        this.parent = parent;
        this.renderer = parent.renderer;
    }

    public TwlTintStack push(float a, float r, float g, float b) {
        if (this.child == null) {
            this.child = new TwlTintStack(this);
        }
        TwlTintStack next = this.child;
        next.alpha = this.alpha * a;
        next.red = this.red * r;
        next.green = this.green * g;
        next.blue = this.blue * b;
        return next;
    }

    public void apply(gn_0 color) {
        float r = this.red * (float) (color.x8 & 0xFF);
        float g = this.green * (float) (color.sh & 0xFF);
        float b = this.blue * (float) (color.FY & 0xFF);
        this.renderer.TJ0(this.alpha * (float) (color.cv & 0xFF), r, g, b);
    }
}
