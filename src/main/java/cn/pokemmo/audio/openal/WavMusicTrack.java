package cn.pokemmo.audio.openal;

import f.*;

public class WavMusicTrack extends pp_2 {
    public kk_1 PE0;
    public bn_1 Nn;
    public gk_2 Jz0;

    public WavMusicTrack(cn.pokemmo.audio.openal.OpenALAudioEngine audio, Dn0 file) {
        super(audio, file);
        if (audio.Ze) {
            return;
        }
        this.PE0 = new kk_1(file.uf0());
        this.Jz0 = new gk_2();
        try {
            c50_0 header = this.PE0.k0();
            if (header == null) {
                throw new nf_1("Empty MP3");
            }
            int channels = header.ys0() == 3 ? 1 : 2;
            this.Nn = new bn_1(channels);
            this.Jz0.Du(this.Nn);
            this.Ei0(channels, header.sg());
        } catch (Throwable error) {
            if (!(error instanceof Go0)) {
                throwUnchecked(error);
            }
            throw new nf_1("error while preloading mp3", error);
        }
    }

    @Override
    public final int jo0(byte[] output) {
        try {
            boolean reload = this.PE0 == null;
            if (reload) {
                this.PE0 = new kk_1(this.LpT6.uf0());
                this.Jz0 = new gk_2();
            }
            int offset = 0;
            int limit = output.length - 4608;
            while (offset <= limit) {
                c50_0 header = this.PE0.k0();
                if (header == null) {
                    break;
                }
                if (reload) {
                    int channels = header.fJ == 3 ? 1 : 2;
                    this.Nn = new bn_1(channels);
                    this.Jz0.mO = this.Nn;
                    this.Ei0(channels, header.sg());
                    reload = false;
                }
                try {
                    this.Jz0.D50(this.PE0, header);
                } catch (Exception ignored) {
                    // The decoder skips malformed frames exactly as the original stream path does.
                }
                this.PE0.IH();
                int produced = this.Nn.Ga();
                System.arraycopy(this.Nn.qo0, 0, output, offset, produced);
                offset += produced;
            }
            return offset;
        } catch (Throwable error) {
            this.vK0();
            throw new nf_1("Error reading audio data.", error);
        }
    }

    @Override
    public final void vK0() {
        kk_1 decoder = this.PE0;
        if (decoder == null) {
            return;
        }
        try {
            decoder.qe0();
        } catch (Throwable error) {
            if (!(error instanceof Go0)) {
                throwUnchecked(error);
            }
        }
        this.PE0 = null;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable error) throws T {
        throw (T) error;
    }
}
