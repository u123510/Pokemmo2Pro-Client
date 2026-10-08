package cn.pokemmo.audio.track;

import com.pokeemu.sseqj.Sseqj;
import f.AA0;
import f.ff0_0;
import java.nio.ByteBuffer;

/**
 * NDS SSEQ 原生音频序列播放器
 * 
 * 职责:
 * 通过 Sseqj JNI 原生动态库加载并解析 NDS SDAT 中 SSEQ 音频序列，执行高保真微秒级硬件合成。
 * 
 * 原混淆类: f.Fy0
 */
public class SseqNativeSoundPlayer extends AA0 {
    public static byte fG0 = -1;

    public SseqNativeSoundPlayer(byte region, short trackId, short soundArchiveId, ff0_0 category) {
        super(region, trackId, category);
        long handle = Sseqj.newPlayer(g10);
        this.h40 = handle;
        if (handle != 0L) {
            if (Sseqj.loadSSEQ(handle, region, trackId, soundArchiveId) != 0) {
                if (region == 2) {
                    if (trackId != 1055) {
                        if (trackId != 1057) {
                            if (trackId == 1063) {
                                Sseqj.setTrackMuted(this.h40, 8, true);
                            }
                        } else {
                            Sseqj.setTrackMuted(this.h40, 7, true);
                            Sseqj.setTrackMuted(this.h40, 8, true);
                        }
                    } else {
                        Sseqj.setTrackMuted(this.h40, 6, true);
                        Sseqj.setTrackMuted(this.h40, 7, true);
                        Sseqj.setTrackMuted(this.h40, 8, true);
                        Sseqj.setTrackMuted(this.h40, 9, true);
                    }
                }
                if (fG0 != -1) {
                    for (byte track = 0; track < 16; track = (byte) (track + 1)) {
                        long h = this.h40;
                        boolean muted = (fG0 & 1 << track) == 0;
                        Sseqj.setTrackMuted(h, track, muted);
                    }
                }
                return;
            }
            throw new RuntimeException("Unable to load sseq");
        }
        throw new RuntimeException("Unable to allocate player");
    }

    @Override
    public final void aw(float volume) {
        this.I3 = volume;
        long handle = this.h40;
        if (handle == 0L) {
            return;
        }
        Sseqj.setVolume(handle, volume);
    }

    @Override
    public final void oz0(float pan) {
        long handle = this.h40;
        if (handle == 0L) {
            return;
        }
        Sseqj.setPan(handle, pan);
    }

    @Override
    public final int UY(ByteBuffer buffer, int samples) {
        long handle = this.h40;
        if (handle == 0L) {
            return 1;
        }
        return Sseqj.generateSamples(handle, buffer, samples);
    }

    @Override
    public final void Oo(float pitch) {
        long handle = this.h40;
        if (handle == 0L) {
            return;
        }
        Sseqj.setPitchShift(handle, pitch);
    }

    @Override
    public final boolean Y0() {
        long handle = this.h40;
        if (handle == 0L) {
            return true;
        }
        return Sseqj.isStopped(handle);
    }

    @Override
    public final void dispose() {
        long handle = this.h40;
        if (handle == 0L) {
            return;
        }
        this.h40 = 0L;
        Sseqj.deletePlayer(handle);
    }
}
