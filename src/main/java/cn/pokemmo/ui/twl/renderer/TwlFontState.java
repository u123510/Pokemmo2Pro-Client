package cn.pokemmo.ui.twl.renderer;

import f.Dr0;
import f.gn_0;
import f.qq_0;

/**
 * 字体渲染状态 (FontState)
 */
public class TwlFontState {
    public final gn_0 color;
    public final int offsetX;
    public final int offsetY;

    public TwlFontState(Dr0 params) {
        ((Boolean) params.gE0(Dr0.ca)).booleanValue();
        ((Boolean) params.gE0(Dr0.Y0)).booleanValue();
        this.color = (gn_0) params.gE0(Dr0.wG);
        this.offsetX = (Integer) params.gE0(qq_0.ae0);
        this.offsetY = (Integer) params.gE0(qq_0.vn0);
        ((Integer) params.gE0(qq_0.en)).intValue();
    }

    public gn_0 getColor() {
        return this.color;
    }

    public int getOffsetX() {
        return this.offsetX;
    }

    public int getOffsetY() {
        return this.offsetY;
    }
}
