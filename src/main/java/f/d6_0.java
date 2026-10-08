package f;

import cn.pokemmo.ui.twl.renderer.TwlSWCursor;

/**
 * 软件鼠标指针兼容垫片
 * @see cn.pokemmo.ui.twl.renderer.TwlSWCursor
 */
public final class d6_0 extends TwlSWCursor {
    public final xu_1 EU;
    public final int Bl0;
    public final int n3;
    public final wl0_2 ar;

    public d6_0(xu_1 renderer, int x, int y, int width, int height, int hotSpotX, int hotSpotY, wl0_2 image) {
        super(renderer, x, y, width, height, hotSpotX, hotSpotY, image);
        this.EU = renderer;
        this.Bl0 = hotSpotX;
        this.n3 = hotSpotY;
        this.ar = image;
    }
}
