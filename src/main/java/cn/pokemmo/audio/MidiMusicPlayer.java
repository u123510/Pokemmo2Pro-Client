package cn.pokemmo.audio;

import f.OE0;

/**
 * MIDI音乐/空音频播放器实现 (Midi Music Player)
 * 用于加载和播放游戏MIDI背景音乐或作为缺失音效的静默占位播放器。
 *
 * 原混淆类: f.Xu0
 */
public class MidiMusicPlayer implements AudioPlayer, OE0 {
    public final byte hD0;
    public final short Ov;

    public MidiMusicPlayer(byte by, short s) {
        this.hD0 = by;
        this.Ov = s;
    }

    @Override
    public void FB0() {
    }

    @Override
    public void wy0() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void nj0(boolean bl) {
    }

    @Override
    public byte Fv() {
        return this.hD0;
    }

    @Override
    public short Ib0() {
        return this.Ov;
    }

    @Override
    public void aw(float f) {
    }

    @Override
    public void oz0(float f) {
    }

    @Override
    public boolean ge() {
        return true;
    }
}
