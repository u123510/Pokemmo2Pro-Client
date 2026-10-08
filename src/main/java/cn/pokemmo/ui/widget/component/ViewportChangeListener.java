package cn.pokemmo.ui.widget.component;

public interface ViewportChangeListener {
    void onViewportOffset(int x, int y);

    void onViewportSize(int width, int height);

    void onViewportReset();

    default void zi(int var1, int var2) {
        onViewportOffset(var1, var2);
    }

    default void Oy(int var1, int var2) {
        onViewportSize(var1, var2);
    }

    default void wn0() {
        onViewportReset();
    }
}
