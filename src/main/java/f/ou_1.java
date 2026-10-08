package f;

import cn.pokemmo.audio.AudioChannelHandle;

public interface ou_1 extends AudioChannelHandle {
    @Override
    void oM();

    @Override
    int Oe();

    @Override
    default void stop() {
        oM();
    }

    @Override
    default int getSourceId() {
        return Oe();
    }
}
