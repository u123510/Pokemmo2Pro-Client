package cn.pokemmo.ui.widget.component;

public interface LayoutResizeListener {
    void onBeforeResize();

    void onResize(int width, int height);

    void onAfterResize();

    default void oj() {
        onBeforeResize();
    }

    default void Rw(int var1, int var2) {
        onResize(var1, var2);
    }

    default void zR() {
        onAfterResize();
    }
}
