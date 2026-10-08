package cn.pokemmo.audio.openal;

import f.*;
import cn.pokemmo.audio.AudioEngine;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.ALUtil;
import org.lwjgl.openal.SOFTReopenDevice;

public class OpenALAudioEngine implements AudioEngine {
    public final int eU;
    public final int ts0;
    public Nn0 uB0;
    public Nn0 Id0;
    public J7 qA0;
    public nl_1 Bx0;
    public long Iv;
    public final nb_2 fO;
    public final nb_2 Ia;
    public OpenALSoundEffect[] N8;
    public int is0;
    public String ll0;
    public Thread Xs0;
    public final es_1 yj0;
    public long gl0;
    public long Rd;
    public boolean Ze;

    public OpenALAudioEngine() {
        this(16, 9, 512);
    }

    public OpenALAudioEngine(int i1, int i2, int i3) {
        this.Iv = 0L;
        this.fO = new nb_2();
        this.Ia = new nb_2();
        this.is0 = -1;
        this.ll0 = null;
        this.yj0 = new es_1(false, 1, pp_2.class);
        this.Ze = false;
        this.eU = i3;
        this.ts0 = i2;
        aB0(By0.class, "ogg");
        UP(rj_0.class, "ogg");
        aB0(gg_1.class, "wav");
        UP(xy_1.class, "wav");
        aB0(tl0_1.class, "mp3");
        UP(sl_1.class, "mp3");

        long j2 = ALC10.alcOpenDevice((ByteBuffer) null);
        this.gl0 = j2;
        if (j2 == 0L) {
            this.Ze = true;
            return;
        }

        ALCCapabilities v4 = ALC.createCapabilities(j2);
        long j5 = ALC10.alcCreateContext(j2, (IntBuffer) null);
        this.Rd = j5;
        if (j5 == 0L) {
            ALC10.alcCloseDevice(j2);
            this.Ze = true;
            return;
        }

        if (!ALC10.alcMakeContextCurrent(j5)) {
            this.Ze = true;
            return;
        }

        AL.createCapabilities(v4);
        AL10.alGetError();

        this.Id0 = new Nn0(false, i1);
        for (int i = 0; i < i1; i++) {
            int src = AL10.alGenSources();
            if (AL10.alGetError() != 0) {
                break;
            }
            this.Id0.ja0(src);
        }

        this.uB0 = new Nn0(this.Id0);
        this.qA0 = new J7();
        this.Bx0 = new nl_1();

        FloatBuffer orientation = BufferUtils.createFloatBuffer(6);
        orientation.put(new float[]{0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 0.0f});
        orientation.flip();
        AL10.alListenerfv(4111, orientation);

        FloatBuffer velocity = BufferUtils.createFloatBuffer(3);
        velocity.put(new float[]{0.0f, 0.0f, 0.0f});
        velocity.flip();
        AL10.alListenerfv(4102, velocity);

        FloatBuffer position = BufferUtils.createFloatBuffer(3);
        position.put(new float[]{0.0f, 0.0f, 0.0f});
        position.flip();
        AL10.alListenerfv(4100, position);

        AL10.alDisable(6571);

        Thread thread = new Thread(new Nt0(this));
        this.Xs0 = thread;
        thread.setDaemon(true);
        thread.start();

        this.N8 = new OpenALSoundEffect[i1];
    }

    public final boolean IH0(String v1, boolean i2) {
        if (i2) {
            this.ll0 = v1;
        }
        return SOFTReopenDevice.alcReopenDeviceSOFT(this.gl0, v1, (IntBuffer) null);
    }

    @Override
    public final boolean AF(String v1) {
        return IH0(v1, true);
    }

    @Override
    public final String[] Rr0() {
        List<String> list = ALUtil.getStringList(0L, 4115);
        if (list == null) {
            return new String[0];
        }
        return list.toArray(new String[0]);
    }

    public final int vI(boolean i1) {
        if (this.Ze) {
            return 0;
        }
        int i3 = this.uB0.Ml;
        for (int i2 = 0; i2 < i3; i2++) {
            int src = this.uB0.X8(i2);
            int state = AL10.alGetSourcei(src, 4112);
            if (state != 4114 && state != 4115) {
                Long v3 = (Long) this.Bx0.remove(src);
                if (v3 != null) {
                    this.qA0.qa0(v3.longValue());
                }
                if (i1) {
                    this.uB0.CK0(i2);
                } else {
                    long j0 = this.Iv++;
                    this.Bx0.qx0(src, Long.valueOf(j0));
                    this.qA0.cw(j0, Integer.valueOf(src));
                }
                AL10.alSourceStop(src);
                AL10.alSourcei(src, 4105, 0);
                AL10.alSourcef(src, 4106, 1.0f);
                AL10.alSourcef(src, 4099, 1.0f);
                AL10.alSource3f(src, 4100, 0.0f, 0.0f, 1.0f);
                AL10.alSourcei(src, 4147, 2);
                return src;
            }
        }
        return -1;
    }

    @Override
    public final void update() {
        if (this.Ze) {
            return;
        }
        for (int i1 = 0; i1 < this.yj0.KB; i1++) {
            pp_2 v2 = ((pp_2[]) this.yj0.rZ)[i1];
            if (v2.rr.Ze) {
                continue;
            }
            int i3 = v2.X6;
            if (i3 == -1) {
                continue;
            }
            boolean flag = false;
            int i4 = AL10.alGetSourcei(i3, 4118);
            while (i4-- > 0) {
                int i5 = AL10.alSourceUnqueueBuffers(v2.X6);
                if (i5 == 40963) {
                    break;
                }
                UJ0 v6 = v2.tm0;
                if (v6.Or > 0) {
                    v6.Or--;
                }
                if (!flag) {
                    if (v2.cR(i5)) {
                        AL10.alSourceQueueBuffers(v2.X6, i5);
                    } else {
                        flag = true;
                    }
                }
            }
            if (flag && AL10.alGetSourcei(v2.X6, 4117) == 0) {
                v2.stop();
            }
            if (v2.Gy0 && AL10.alGetSourcei(v2.X6, 4112) != 4114) {
                AL10.alSourcePlay(v2.X6);
            }
        }
    }

    @Override
    public final void dispose() {
        if (this.Ze) {
            return;
        }
        this.Xs0.interrupt();
        int i2 = this.Id0.Ml;
        for (int i1 = 0; i1 < i2; i1++) {
            int src = this.Id0.X8(i1);
            if (AL10.alGetSourcei(src, 4112) != 4116) {
                AL10.alSourceStop(src);
            }
            AL10.alDeleteSources(src);
        }
        this.Bx0 = null;
        this.qA0 = null;
        ALC10.alcDestroyContext(this.Rd);
        ALC10.alcCloseDevice(this.gl0);
    }

    @Override
    public final gg0_0 Vr(Dn0 v1) {
        if (v1 == null) {
            throw new IllegalArgumentException("file cannot be null.");
        }
        Class<?> clazz = (Class<?>) this.Ia.Wk0(v1.BN().toLowerCase());
        if (clazz == null) {
            throw new nf_1("Unknown file extension for music: " + v1);
        }
        try {
            return (pp_2) (clazz.getConstructors()[0]).newInstance(this, v1);
        } catch (Exception e) {
            throw new nf_1("Error creating music " + clazz.getName() + " for file: " + v1, e);
        }
    }

    @Override
    public final AC0 WC(Dn0 v1) {
        if (v1 == null) {
            throw new IllegalArgumentException("file cannot be null.");
        }
        Class<?> clazz = (Class<?>) this.fO.Wk0(v1.BN().toLowerCase());
        if (clazz == null) {
            throw new nf_1("Unknown file extension for sound: " + v1);
        }
        try {
            return (su_0) (clazz.getConstructors()[0]).newInstance(this, v1);
        } catch (Exception e) {
            throw new nf_1("Error creating sound " + clazz.getName() + " for file: " + v1, e);
        }
    }

    public final void aB0(Class<?> v1, String v2) {
        this.fO.WK0(v2, v1);
    }

    public final void UP(Class<?> v1, String v2) {
        this.Ia.WK0(v2, v1);
    }

    @Override
    public final if_1 aT(int i1) {
        if (this.Ze) {
            return new JX();
        }
        return new ul0_1(this, i1, false, this.eU, this.ts0);
    }
}
