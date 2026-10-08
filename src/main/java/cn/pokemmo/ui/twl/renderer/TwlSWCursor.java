package cn.pokemmo.ui.twl.renderer;

import f.dc0_0;
import f.wl0_2;
import f.xu_1;

/**
 * 软件鼠标指针定义 (SWCursor)
 */
public class TwlSWCursor extends TwlTextureAreaBase implements dc0_0 {
    public final xu_1 renderer;
    public final int hotSpotX;
    public final int hotSpotY;
    public final wl0_2 image;

    public TwlSWCursor(xu_1 renderer, int x, int y, int width, int height, int hotSpotX, int hotSpotY, wl0_2 image) {
        super(x, y, width, height);
        this.renderer = renderer;
        this.hotSpotX = hotSpotX;
        this.hotSpotY = hotSpotY;
        this.image = image;
    }

    public xu_1 getRenderer() {
        return this.renderer;
    }

    public int getHotSpotX() {
        return this.hotSpotX;
    }

    public int getHotSpotY() {
        return this.hotSpotY;
    }

    public wl0_2 getImage() {
        return this.image;
    }
}
