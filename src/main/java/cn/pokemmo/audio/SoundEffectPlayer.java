package cn.pokemmo.audio;

/**
 * 音效频次限制与节流控制器 (Sound Effect Player / Throttle)
 * 记录音效播放时间戳，防止同屏大量音效短时间内同时爆发引起声音撕裂与卡顿。
 *
 * 原混淆类: f.x30
 */
public class SoundEffectPlayer {
    public final int sI0 = Math.toIntExact(900000);
    public final int gA;
    public final long[] qV = new long[10];

    public SoundEffectPlayer() {
        this.gA = 10;
    }
}
