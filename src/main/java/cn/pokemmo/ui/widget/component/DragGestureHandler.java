package cn.pokemmo.ui.widget.component;

import cn.pokemmo.graphics.gdx.texture.GdxSpriteEffectNode;
import f.X5;
import f.ni_1;
import f.vc_0;

public class DragGestureHandler extends vc_0 {
    public final GdxSpriteEffectNode jq0;

    public DragGestureHandler(GdxSpriteEffectNode x5) {
        this.jq0 = x5;
    }

    @Override
    public boolean DP(ni_1 ni_1, float f, float g, int i, int j) {
        if (this.jq0.R5) {
            return false;
        }
        this.jq0.R5 = true;
        this.jq0.Zb(f, g, false);
        return true;
    }

    @Override
    public void Ri0(ni_1 ni_1, float f, float g, int i) {
        this.jq0.Zb(f, g, false);
    }

    @Override
    public void static$(ni_1 ni_1, float f, float g, int i, int j) {
        this.jq0.R5 = false;
        boolean z = this.jq0.as;
        this.jq0.Zb(f, g, z);
    }
}
