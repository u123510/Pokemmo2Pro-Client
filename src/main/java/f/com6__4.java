package f;

import cn.pokemmo.lifecycle.CleanableResource;

public interface com6__4 extends CleanableResource {
    @Override
    void wy0();

    @Override
    void dispose();

    @Override
    default void clean() {
        wy0();
    }
}
