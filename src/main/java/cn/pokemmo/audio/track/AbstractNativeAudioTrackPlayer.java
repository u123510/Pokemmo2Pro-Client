package cn.pokemmo.audio.track;

import cn.pokemmo.audio.AudioPlayer;
import cn.pokemmo.rom.nds.audio.NdsSdatAudioMuxer;
import f.*;
import java.nio.ByteBuffer;

/**
 * 原生卡带音频通道驱动播放器抽象基类
 * 
 * 职责:
 * 作为 Sseqj (NDS) 与 Agbplayj (GBA) 原生混音引擎的通用抽象，
 * 管理音乐音轨状态（播放、静音、声道衰减、淡出渐变），并自动注册入 NdsSdatAudioMuxer 混音调度链。
 * 
 * 原混淆类: f.AA0
 */
public abstract class AbstractNativeAudioTrackPlayer implements OE0, fy0_0 {
    public static final int bI = 960;
    public static final int g10 = 48000;

    public final byte VE;
    public final short oN;
    public final ff0_0 tJ;
    public long h40 = 0L;
    public boolean Jx0 = false;
    public boolean Jv = false;
    public boolean V2 = false;
    public long VI;
    public long wG;
    public float I3 = 0.0F;
    public Runnable nY = null;

    public AbstractNativeAudioTrackPlayer(byte region, short trackId, ff0_0 category) {
        this.VE = region;
        this.oN = trackId;
        this.tJ = category;
    }

    public abstract void aw(float volume);

    public final void FB0() {
        xs_0 muxer = xs_0.YL;
        if (muxer != null) {
            Object lock = muxer.d00;
            synchronized (lock) {
                if (!muxer.cN.contains(this)) {
                    muxer.cN.add(this);
                }
            }
        }
        this.Jx0 = false;
    }

    public final void wy0() {
        this.Jx0 = true;
    }

    public final void resume() {
        this.Jx0 = false;
    }

    public final void nj0(boolean fade) {
        if (!this.Jv) {
            if (fade && !this.Jx0) {
                if (!this.V2) {
                    this.V2 = true;
                    this.VI = System.currentTimeMillis();
                    this.wG = System.currentTimeMillis() + 450L;
                }
            } else {
                this.Jv = true;
                bu_0 var2;
                if (this.tJ == ff0_0.Gz0 && (var2 = tw0_0.RE0) != null) {
                    var2.D4();
                }
            }
        }
    }

    public abstract int UY(ByteBuffer buffer, int samples);

    public abstract boolean Y0();

    public final boolean ge() {
        return this.Jv;
    }

    public final byte Fv() {
        return this.VE;
    }

    public final short Ib0() {
        return this.oN;
    }

    public final boolean Vy0() {
        return this.V2;
    }

    public final void N90(Runnable callback) {
        this.nY = callback;
    }
}
