package cn.pokemmo.audio.track;

import com.pokeemu.agbplayj.Agbplayj;
import f.AA0;
import f.ff0_0;
import java.nio.ByteBuffer;

/**
 * GBA Agbplay 原生音频播放器
 * 
 * 职责:
 * 通过 Agbplayj JNI 原生动态库调用 Game Boy Advance DirectSound 驱动，还原火红/叶绿/绿宝石原生音效与背景乐。
 * 
 * 原混淆类: f.zl_1
 */
public class AgbplayNativeSoundPlayer extends AA0 {

    public AgbplayNativeSoundPlayer(byte region, short songId, ff0_0 category) {
        super(region, songId, category);
        long handle = Agbplayj.newPlayer();
        this.h40 = handle;
        if (handle != 0L) {
            if (Agbplayj.loadSong(handle, region, songId) != 0) {
                return;
            }
            throw new RuntimeException("Unable to load agbplayj");
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
        Agbplayj.setVolume(handle, volume);
    }

    @Override
    public final void oz0(float pan) {
    }

    @Override
    public final int UY(ByteBuffer buffer, int samples) {
        long handle = this.h40;
        if (handle == 0L) {
            return 1;
        }
        return Agbplayj.generateSamples(handle, buffer, samples);
    }

    @Override
    public final boolean Y0() {
        long handle = this.h40;
        if (handle == 0L) {
            return true;
        }
        return Agbplayj.isStopped(handle);
    }

    @Override
    public final void dispose() {
        long handle = this.h40;
        if (handle == 0L) {
            return;
        }
        this.h40 = 0L;
        Agbplayj.deletePlayer(handle);
    }
}
