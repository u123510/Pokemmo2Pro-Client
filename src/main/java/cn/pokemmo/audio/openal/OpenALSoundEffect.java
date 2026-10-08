package cn.pokemmo.audio.openal;

import f.*;
import cn.pokemmo.audio.SoundEffect;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import org.lwjgl.openal.AL10;

public class OpenALSoundEffect implements SoundEffect {
    public int OJ0;
    public final OpenALAudioEngine bn0;

    public OpenALSoundEffect(OpenALAudioEngine v1) {
        super();
        this.OJ0 = -1;
        this.bn0 = v1;
    }

    public final void Y60(byte[] bytes, int channels, int sampleRate) {
        int step = (channels > 1) ? 4 : 2;
        int len = bytes.length - (bytes.length % step);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(len);
        byteBuffer.order(ByteOrder.nativeOrder());
        byteBuffer.put(bytes, 0, len);
        byteBuffer.flip();
        Fd(byteBuffer.asShortBuffer(), channels, sampleRate);
    }

    public final void Fd(ShortBuffer buffer, int channels, int sampleRate) {
        int limit = buffer.limit() / channels;
        if (this.OJ0 == -1) {
            this.OJ0 = AL10.alGenBuffers();
            int format = (channels > 1) ? 4355 : 4353;
            AL10.alBufferData(this.OJ0, format, buffer, sampleRate);
        }
    }

    @Override
    public final long FB0() {
        float volume = 1.0f;
        OpenALAudioEngine audio = this.bn0;
        if (audio.Ze) {
            return 0L;
        }
        int sourceId = audio.vI(false);
        if (sourceId == -1) {
            int nextIdx = (audio.is0 + 1) % audio.N8.length;
            audio.is0 = nextIdx;
            OpenALSoundEffect oldSound = audio.N8[nextIdx];
            if (oldSound != null) {
                oldSound.stop();
            }
            audio.N8[audio.is0] = this;
            sourceId = this.bn0.vI(false);
        } else {
            int nextIdx = (audio.is0 + 1) % audio.N8.length;
            audio.is0 = nextIdx;
            audio.N8[nextIdx] = this;
        }
        if (sourceId == -1) {
            return -1L;
        }
        Long soundIdObj = (Long) this.bn0.Bx0.get(sourceId);
        long soundId = (soundIdObj != null) ? soundIdObj.longValue() : -1L;
        AL10.alSourcei(sourceId, 4105, this.OJ0);
        AL10.alSourcei(sourceId, 4103, 0);
        AL10.alSourcef(sourceId, 4106, volume);
        AL10.alSourcePlay(sourceId);
        return soundId;
    }

    @Override
    public final void stop() {
        OpenALAudioEngine audio = this.bn0;
        if (audio.Ze) {
            return;
        }
        int bufferId = this.OJ0;
        int size = audio.uB0.Ml;
        for (int i = 0; i < size; i++) {
            int sourceId = audio.uB0.X8(i);
            if (AL10.alGetSourcei(sourceId, 4105) == bufferId) {
                Long soundId = (Long) audio.Bx0.remove(sourceId);
                if (soundId != null) {
                    audio.qA0.qa0(soundId.longValue());
                }
                AL10.alSourceStop(sourceId);
            }
        }
    }

    @Override
    public final void dispose() {
        OpenALAudioEngine audio = this.bn0;
        if (audio.Ze) {
            return;
        }
        if (this.OJ0 == -1) {
            return;
        }
        int bufferId = this.OJ0;
        int size = audio.uB0.Ml;
        for (int i = 0; i < size; i++) {
            int sourceId = audio.uB0.X8(i);
            if (AL10.alGetSourcei(sourceId, 4105) == bufferId) {
                Long soundId = (Long) audio.Bx0.remove(sourceId);
                if (soundId != null) {
                    audio.qA0.qa0(soundId.longValue());
                }
                AL10.alSourceStop(sourceId);
                AL10.alSourcei(sourceId, 4105, 0);
            }
        }
        AL10.alDeleteBuffers(this.OJ0);
        this.OJ0 = -1;
        OpenALSoundEffect[] n8 = this.bn0.N8;
        for (int i = 0; i < n8.length; i++) {
            if (n8[i] == this) {
                n8[i] = null;
            }
        }
    }

    @Override
    public final void wy0() {
        OpenALAudioEngine audio = this.bn0;
        if (audio.Ze) {
            return;
        }
        int bufferId = this.OJ0;
        int size = audio.uB0.Ml;
        for (int i = 0; i < size; i++) {
            int sourceId = audio.uB0.X8(i);
            if (AL10.alGetSourcei(sourceId, 4105) == bufferId) {
                AL10.alSourcePause(sourceId);
            }
        }
    }

    @Override
    public final void lb0(long soundId, boolean loop) {
        if (this.bn0.Ze) {
            return;
        }
        Integer sourceId = (Integer) this.bn0.qA0.Aw(soundId);
        if (sourceId != null) {
            AL10.alSourcei(sourceId.intValue(), 4103, loop ? 1 : 0);
        }
    }

    @Override
    public final long zK0(float volume, float pitch, float pan) {
        long soundId = FB0();
        if (!this.bn0.Ze) {
            Integer sourceIdObj = (Integer) this.bn0.qA0.Aw(soundId);
            if (sourceIdObj != null) {
                AL10.alSourcef(sourceIdObj.intValue(), 4099, pitch);
            }
        }
        if (!this.bn0.Ze) {
            int sourceId = -1;
            if (soundId == 0L) {
                if (this.bn0.qA0.Wx) {
                    sourceId = ((Integer) this.bn0.qA0.qL).intValue();
                }
            } else {
                int idx = this.bn0.qA0.HK0(soundId);
                if (idx >= 0) {
                    sourceId = ((Integer) this.bn0.qA0.Tj0[idx]).intValue();
                }
            }
            if (sourceId != -1) {
                float x = LW.Fm0((pan - 1.0f) * 1.5707964f);
                float z = LW.Po0((pan + 1.0f) * 1.5707964f);
                AL10.alSource3f(sourceId, 4100, x, 0.0f, z);
                AL10.alSourcef(sourceId, 4106, volume);
            }
        }
        return soundId;
    }
}
