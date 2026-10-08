package cn.pokemmo.lifecycle;

public interface PausableLifecycle {
    void pause();

    void resume();

    default void lS() {
        pause();
    }

    default void em() {
        resume();
    }
}
