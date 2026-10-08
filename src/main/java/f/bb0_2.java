package f;

import cn.pokemmo.ui.widget.component.LayoutResizeListener;

public interface bb0_2 extends LayoutResizeListener {
    @Override
    void oj();

    @Override
    void Rw(int var1, int var2);

    @Override
    void zR();

    @Override
    default void onBeforeResize() {
        oj();
    }

    @Override
    default void onResize(int width, int height) {
        Rw(width, height);
    }

    @Override
    default void onAfterResize() {
        zR();
    }
}
