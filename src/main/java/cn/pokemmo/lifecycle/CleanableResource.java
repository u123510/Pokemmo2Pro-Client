package cn.pokemmo.lifecycle;

public interface CleanableResource {
    void clean();

    void dispose();

    default void wy0() {
        clean();
    }
}
