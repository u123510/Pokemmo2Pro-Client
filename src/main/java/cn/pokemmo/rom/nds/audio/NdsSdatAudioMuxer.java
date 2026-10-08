package cn.pokemmo.rom.nds.audio;

import f.*;
import com.badlogic.gdx.utils.BufferUtils;
import com.pokeemu.agbplayj.Agbplayj;
import com.pokeemu.sseqj.Sseqj;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * NDS SDAT 音频混音与驱动总线程 (NDS SDAT Audio Muxer Thread)
 * 
 * 职责:
 * 作为客户端后台常驻声音合成线程 ("soundmuxer"), 遍历所有加载的 NDS ROM,
 * 将其 SDAT 音频数据加载并持续向 Sseqj 原生合成器生成音频采样流。
 * 
 * 原混淆类: f.xs_0
 */

import com.badlogic.gdx.utils.BufferUtils;
import com.pokeemu.agbplayj.Agbplayj;
import com.pokeemu.sseqj.Sseqj;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;

public class NdsSdatAudioMuxer extends Thread implements fy0_0 {
    public static final dl_1 LOGGER = Cq0.E1(NdsSdatAudioMuxer.class);
    public static final dl_1 Ew0 = LOGGER;
    public static xs_0 YL;
    public static boolean rD0;
    public static volatile boolean bj0;
    public static byte f20;
    public static byte[] fe0;
    public final ByteBuffer rv0;
    public final ShortBuffer te;
    public if_1 fd0;
    public final ArrayList cN;
    public final short[] U20;
    public final Object d00;
    public boolean Mt;
    public final ByteBuffer[] t60;

    static {
        
        rD0 = true;
        bj0 = false;
    }

    public NdsSdatAudioMuxer() {
        super();
        this.cN = new ArrayList();
        this.d00 = new Object();
        this.Mt = false;
        this.t60 = new ByteBuffer[11];
        this.setName("soundmuxer");
        this.setDaemon(true);
        this.setPriority(6);
        int i1 = AA0.bI;
        ByteBuffer byteBuffer = BufferUtils.qw0(Math.max(100, i1 * 4));
        this.rv0 = byteBuffer;
        BufferUtils.clear(byteBuffer, byteBuffer.limit());
        this.te = byteBuffer.asShortBuffer();
        this.U20 = new short[i1 * 2];
        if (fe0 == null) {
            fe0 = new byte[32];
            f20 = (byte) Sseqj.generateSamples(0L, byteBuffer, i1);
            byteBuffer.get(fe0);
            byteBuffer.position(0);
        }
        l50_0[] l50_0Arr = tw0_0.Ll0.SW();
        for (int i3 = 0; i3 < l50_0Arr.length; ++i3) {
            l50_0 l50_02 = l50_0Arr[i3];
            ByteBuffer byteBuffer2 = l50_02.RP().OX();
            this.t60[l50_02.Tz()] = byteBuffer2;
            if (Sseqj.loadSDAT(l50_02.Tz(), byteBuffer2, byteBuffer2.limit()) == 0) {
                throw new RuntimeException("Unable to allocate nds sdat");
            }
        }
        qa0_1[] qa0_1Arr = tw0_0.Ll0.PP();
        for (int i3 = 0; i3 < qa0_1Arr.length; ++i3) {
            qa0_1 qa0_12 = qa0_1Arr[i3];
            ByteBuffer byteBuffer3 = qa0_12.vy0();
            this.t60[qa0_12.rt0()] = byteBuffer3;
            if (Agbplayj.loadRom(qa0_12.rt0(), byteBuffer3, byteBuffer3.limit()) == 0) {
                throw new RuntimeException("Unable to allocate gba sdat");
            }
        }
        u90_0 u90_02 = lg_0.MF;
        if (u90_02 != null) {
            try {
                this.fd0 = u90_02.aT(AA0.g10);
            } catch (Exception exception) {
                this.fd0 = null;
                Ew0.error("Error creating new audio device", exception);
            }
        }
        if (this.fd0 == null) {
            rD0 = false;
            Ew0.error("Unable to create newAudioDevice.");
        }
        Ew0.info("Native Audio frame count per buffer size: {}", Integer.valueOf(AA0.bI));
    }

    public static void init() {
        if (YL == null) {
            try {
                new ea0_1().h9("sseqj");
                int apiLevel = Sseqj.getApiLevel();
                if (apiLevel != 182 && apiLevel > 0) {
                    throw new RuntimeException("Mismatched Sseqj api level. Please repair your client.");
                }
                new ea0_1().h9("agbplayj");
                int apiLevel2 = Agbplayj.getApiLevel();
                if (apiLevel2 != 182 && apiLevel2 > 0) {
                    throw new RuntimeException("Mismatched Agbplayj api level. Please repair your client.");
                }
                xs_0 xs_02 = new xs_0();
                YL = xs_02;
                xs_02.start();
            } catch (DH0 dh0) {
                Ew0.error("Sound Initialize error", dh0);
                YL = null;
                rD0 = false;
                throw dh0;
            } catch (Exception | Error throwable) {
                Ew0.error("Sound Initialize error", throwable);
                YL = null;
                rD0 = false;
            }
        }
    }

    public final void ql0(AA0 aa0) {
        synchronized (this.d00) {
            this.cN.remove(aa0);
        }
    }

    @Override
    public final void run() {
        try {
            while (rD0 && !bj0 && this.fd0 != null) {
                this.Kw0();
            }
        } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            if (bj0) {
                return;
            }
            throw unsatisfiedLinkError;
        }
    }

    public final void Kw0() {
        boolean empty;
        synchronized (this.d00) {
            empty = this.cN.isEmpty();
        }
        if (empty) {
            if (!this.Mt) {
                this.fd0.wy0();
                this.Mt = true;
            }
            try {
                if (bj0) {
                    return;
                }
                Thread.sleep(30L);
            } catch (InterruptedException interruptedException) {
            }
            return;
        }
        if (this.Mt) {
            this.fd0.resume();
            this.Mt = false;
        }
        synchronized (this.d00) {
            BufferUtils.clear(this.rv0, AA0.bI * 4);
            ArrayList toRemove = new ArrayList();
            Iterator iterator = this.cN.iterator();
            while (iterator.hasNext()) {
                Object nextObj = iterator.next();
                if (!(nextObj instanceof AA0)) {
                    continue;
                }
                AA0 sound = (AA0) nextObj;
                if (sound.Jx0) {
                    continue;
                }
                if (sound.V2) {
                    float duration = (float) (sound.wG - sound.VI);
                    float elapsed = (float) (System.currentTimeMillis() - sound.VI);
                    float f5 = 1.0f - elapsed / duration;
                    float fade = f5 * sound.I3;
                    if (fade < 0.0f) {
                        fade = 0.0f;
                    }
                    sound.aw(fade);
                    if ((double) f5 < -0.1) {
                        sound.nj0(false);
                        toRemove.add(sound);
                        Runnable onDone = sound.nY;
                        if (onDone != null) {
                            lg_0.k.lPT5(onDone);
                        }
                        continue;
                    }
                }
                if (sound.Jv) {
                    toRemove.add(sound);
                    continue;
                }
                if (sound.UY(this.rv0, AA0.bI) == 0) {
                    Ew0.info("generateSamples failed, disabling NativeSoundPlayer");
                    rD0 = false;
                    return;
                }
                if (sound.Y0()) {
                    sound.nj0(false);
                    toRemove.add(sound);
                }
            }
            for (Object obj : toRemove) {
                if (obj instanceof AA0) {
                    AA0 sound = (AA0) obj;
                    this.ql0(sound);
                    sound.dispose();
                }
            }
        }
        if (bj0) {
            return;
        }
        this.te.position(0);
        this.te.get(this.U20);
        this.fd0.GW(AA0.bI * 2, this.U20);
    }

    @Override
    public final void dispose() {
        BufferUtils.t7(this.rv0);
        if_1 if_12;
        if ((if_12 = this.fd0) != null) {
            if_12.dispose();
            this.fd0 = null;
        }
    }
}
