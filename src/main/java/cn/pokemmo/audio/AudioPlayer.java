package cn.pokemmo.audio;

/**
 * 音频播放器核心接口 (Audio Player)
 * 抽象定义 LibGDX 音频流、原生音频、MIDI 音频及音效播放器的统一控制接口。
 *
 * 原混淆类: f.OE0
 */
public interface AudioPlayer {
    void FB0();

    void nj0(boolean var1);

    void wy0();

    void resume();

    boolean ge();

    byte Fv();

    short Ib0();

    void aw(float var1);

    void oz0(float var1);

    default void Oo(float f) {
    }

    default boolean Vy0() {
        return false;
    }

    default void N90(Runnable runnable) {
        throw new UnsupportedOperationException();
    }
}
