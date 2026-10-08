package f;

import cn.pokemmo.ui.widget.component.ViewportChangeListener;

public interface ne_2 extends ViewportChangeListener {
    @Override
    void zi(int var1, int var2);

    @Override
    void Oy(int var1, int var2);

    @Override
    void wn0();

    @Override
    default void onViewportOffset(int x, int y) {
        zi(x, y);
    }

    @Override
    default void onViewportSize(int width, int height) {
        Oy(width, height);
    }

    @Override
    default void onViewportReset() {
        wn0();
    }
}
