package cn.pokemmo.audio.openal;

import f.*;
import cn.pokemmo.audio.MusicTrack;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;

public abstract class OpenALMusicTrack implements MusicTrack {
    public static final byte[] vl = new byte[40960];
    public static final ByteBuffer Df0 = BufferUtils.createByteBuffer(40960);
    public final UJ0 tm0;
    public final OpenALAudioEngine rr;
    public IntBuffer RG;
    public int X6 = -1;
    public int fp0;
    public int Pp;
    public boolean X8;
    public boolean Gy0;
    public float ea = 1.0f;
    public float p90 = 0.0f;
    public float ZG0;
    public final Dn0 LpT6;

    public OpenALMusicTrack(OpenALAudioEngine f40_0Var, Dn0 dn0) {
        this.tm0 = new UJ0(3);
        this.rr = f40_0Var;
        this.LpT6 = dn0;
    }

    public final void Ei0(int i, int i2) {
        int i3;
        if (i > 1) {
            i3 = 4355;
        } else {
            i3 = 4353;
        }
        this.fp0 = i3;
        this.Pp = i2;
        this.ZG0 = 40960.0f / (float) (i * 2 * i2);
    }

    @Override
    public final void FB0() {
        OpenALAudioEngine f40_0Var = this.rr;
        if (f40_0Var.Ze) {
            return;
        }
        if (this.X6 == -1) {
            int vI = f40_0Var.vI(true);
            this.X6 = vI;
            if (vI == -1) {
                return;
            }
            this.rr.yj0.Ue0(this);
            if (this.RG == null) {
                this.RG = BufferUtils.createIntBuffer(3);
                AL10.alGetError();
                AL10.alGenBuffers(this.RG);
                int alGetError = AL10.alGetError();
                if (alGetError != 0) {
                    throw new nf_1(yr_1.pG("Unable to allocate audio buffers. AL Error: ", alGetError));
                }
            }
            AL10.alSourcei(this.X6, 4103, 0);
            T8(this.ea, this.p90);
            AL10.alGetError();
            for (int i = 0; i < 3; i++) {
                int i2 = this.RG.get(i);
                if (!cR(i2)) {
                    break;
                }
                AL10.alSourceQueueBuffers(this.X6, i2);
            }
            if (AL10.alGetError() != 0) {
                stop();
                return;
            }
        }
        if (!this.Gy0) {
            AL10.alSourcePlay(this.X6);
            this.Gy0 = true;
        }
    }

    @Override
    public final void stop() {
        OpenALAudioEngine f40_0Var = this.rr;
        if (f40_0Var.Ze || this.X6 == -1) {
            return;
        }
        this.rr.yj0.sj0(this, true);
        vK0();
        OpenALAudioEngine f40_0Var2 = this.rr;
        int i = this.X6;
        if (!f40_0Var2.Ze) {
            AL10.alSourceStop(i);
            AL10.alSourcei(i, 4105, 0);
            Long l = (Long) f40_0Var2.Bx0.remove(i);
            if (l != null) {
                f40_0Var2.qA0.qa0(l.longValue());
            }
            f40_0Var2.uB0.ja0(i);
        }
        this.X6 = -1;
        this.tm0.Or = 0;
        this.Gy0 = false;
    }

    @Override
    public final void wy0() {
        if (this.rr.Ze) {
            return;
        }
        int i = this.X6;
        if (i != -1) {
            AL10.alSourcePause(i);
        }
        this.Gy0 = false;
    }

    @Override
    public final boolean QY() {
        if (this.rr.Ze || this.X6 == -1) {
            return false;
        }
        return this.Gy0;
    }

    @Override
    public final void em0(boolean z) {
        this.X8 = z;
    }

    @Override
    public final void aw(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("volume cannot be < 0: " + f);
        }
        this.ea = f;
        if (this.rr.Ze) {
            return;
        }
        int i = this.X6;
        if (i != -1) {
            AL10.alSourcef(i, 4106, f);
        }
    }

    @Override
    public final void T8(float f, float f2) {
        this.ea = f;
        this.p90 = f2;
        if (this.rr.Ze) {
            return;
        }
        int i = this.X6;
        if (i == -1) {
            return;
        }
        AL10.alSource3f(i, 4100, LW.Fm0((f - 1.0f) * 1.5707964f), 0.0f, LW.Po0((f + 1.0f) * 1.5707964f));
        AL10.alSourcef(this.X6, 4106, f2);
    }

    public abstract int jo0(byte[] bArr);

    public abstract void vK0();

    public void JV() {
        vK0();
    }

    @Override
    public final void dispose() {
        stop();
        if (this.rr.Ze) {
            return;
        }
        IntBuffer intBuffer = this.RG;
        if (intBuffer == null) {
            return;
        }
        AL10.alDeleteBuffers(intBuffer);
        this.RG = null;
    }

    public final boolean cR(int i) {
        float f;
        ByteBuffer byteBuffer = Df0;
        ((Buffer) byteBuffer).clear();
        byte[] bArr = vl;
        int jo0 = jo0(bArr);
        if (jo0 <= 0) {
            if (!this.X8) {
                return false;
            }
            JV();
            jo0 = jo0(bArr);
            if (jo0 <= 0) {
                return false;
            }
            UJ0 uj0 = this.tm0;
            if (uj0.Or > 0) {
                if (0 >= uj0.Or) {
                    throw new IndexOutOfBoundsException("index can't be >= size: 0 >= " + uj0.Or);
                }
                uj0.iS[0] = 0.0f;
            }
        }
        UJ0 uj02 = this.tm0;
        int i2 = uj02.Or;
        if (i2 > 0) {
            if (i2 == 0) {
                throw new IllegalStateException("Array is empty.");
            }
            f = uj02.iS[0];
        } else {
            f = 0.0f;
        }
        float f2 = (((float) jo0) * this.ZG0) / 40960.0f + f;
        if (0 < 0) {
            throw new IndexOutOfBoundsException("index can't be > size: 0 > " + uj02.Or);
        }
        float[] fArr = uj02.iS;
        if (i2 == fArr.length) {
            fArr = uj02.TT(Math.max(8, (int) (((float) i2) * 1.75f)));
        }
        if (uj02.Y1) {
            System.arraycopy(fArr, 0, fArr, 1, uj02.Or);
        } else {
            fArr[uj02.Or] = fArr[0];
        }
        int i3 = uj02.Or;
        uj02.Or = i3 + 1;
        fArr[0] = f2;
        byteBuffer.put(bArr, 0, jo0);
        ((Buffer) byteBuffer).flip();
        AL10.alBufferData(i, this.fp0, byteBuffer, this.Pp);
        return true;
    }
}
