package cn.pokemmo.audio;

public interface AudioChannelHandle {
    void stop();

    int getSourceId();

    default void oM() {
        stop();
    }

    default int Oe() {
        return getSourceId();
    }
}
