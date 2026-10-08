package cn.pokemmo.audio.openal;

import f.*;
import cn.pokemmo.audio.AudioDevicePlayback;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;

public class OpenALAudioDevicePlayback implements AudioDevicePlayback {
    public final OpenALAudioEngine oF0;
    public IntBuffer VG0;
    public int tL;
    public final int kK0;
    public final int Xs0;
    public boolean pw;
    public final float nh;
    public final float pp;
    public byte[] Co0;
    public final int L30;
    public final int dj;
    public final ByteBuffer D6;

    public OpenALAudioDevicePlayback(OpenALAudioEngine f40_0, int sampleRate, boolean isMono, int bufferSize, int bufferCount) {
        this.tL = -1;
        this.nh = 1.0f;
        this.oF0 = f40_0;
        int channels = isMono ? 1 : 2;
        this.L30 = bufferSize;
        this.dj = bufferCount;
        this.kK0 = channels > 1 ? 4355 : 4353;
        this.Xs0 = sampleRate;
        this.pp = (((float) bufferSize) / 2.0f / ((float) channels)) / ((float) sampleRate);
        this.D6 = BufferUtils.createByteBuffer(bufferSize);
    }

    @Override
    public final void GW(int length, short[] samples) {
        if (this.Co0 == null || this.Co0.length < length * 2) {
            this.Co0 = new byte[length * 2];
        }
        int min = Math.min(length, samples.length);
        int i5 = 0;
        for (int i3 = 0; i3 < min; i3++) {
            short s = samples[i3];
            this.Co0[i5++] = (byte) (s & 255);
            this.Co0[i5++] = (byte) ((s >> 8) & 255);
        }
        byte[] bArr = this.Co0;
        int offset = 0;
        int remaining = length * 2;
        if (remaining < 0) {
            throw new IllegalArgumentException("length cannot be < 0.");
        }
        if (this.tL == -1) {
            int vI = this.oF0.vI(true);
            this.tL = vI;
            if (vI == -1) {
                return;
            }
            if (this.VG0 == null) {
                this.VG0 = BufferUtils.createIntBuffer(this.dj);
                AL10.alGetError();
                AL10.alGenBuffers(this.VG0);
                if (AL10.alGetError() != 0) {
                    throw new nf_1("Unabe to allocate audio buffers.");
                }
            }
            AL10.alSourcei(this.tL, 4103, 0);
            AL10.alSourcef(this.tL, 4106, this.nh);
            for (int i4 = 0; i4 < this.dj; i4++) {
                int bufferId = this.VG0.get(i4);
                int written = Math.min(this.L30, remaining);
                this.D6.clear();
                this.D6.put(bArr, offset, written);
                this.D6.flip();
                AL10.alBufferData(bufferId, this.kK0, this.D6, this.Xs0);
                AL10.alSourceQueueBuffers(this.tL, bufferId);
                offset += written;
                remaining -= written;
            }
            AL10.alSourcePlay(this.tL);
            this.pw = true;
        }
        while (remaining > 0) {
            int written2 = Math.min(this.L30, remaining);
            while (true) {
                if (AL10.alGetSourcei(this.tL, 4118) > 0) {
                    int unqueued = AL10.alSourceUnqueueBuffers(this.tL);
                    if (unqueued != 40963) {
                        this.D6.clear();
                        this.D6.put(bArr, offset, written2);
                        this.D6.flip();
                        AL10.alBufferData(unqueued, this.kK0, this.D6, this.Xs0);
                        AL10.alSourceQueueBuffers(this.tL, unqueued);
                        if (!this.pw || AL10.alGetSourcei(this.tL, 4112) != 4114) {
                            AL10.alSourcePlay(this.tL);
                            this.pw = true;
                        }
                        offset += written2;
                        remaining -= written2;
                        break;
                    }
                }
                try {
                    Thread.sleep((long) (this.pp * 1000.0f));
                } catch (InterruptedException interruptedException) {
                }
            }
        }
    }

    @Override
    public final void dispose() {
        if (this.VG0 != null) {
            int i = this.tL;
            if (i != -1) {
                OpenALAudioEngine f40_0 = this.oF0;
                if (!f40_0.Ze) {
                    AL10.alSourceStop(i);
                    AL10.alSourcei(i, 4105, 0);
                    Long l = (Long) f40_0.Bx0.remove(i);
                    if (l != null) {
                        f40_0.qA0.qa0(l.longValue());
                    }
                    f40_0.uB0.ja0(i);
                }
                this.tL = -1;
            }
            AL10.alDeleteBuffers(this.VG0);
            this.VG0 = null;
        }
    }

    @Override
    public final void wy0() {
    }

    @Override
    public final void resume() {
    }
}
