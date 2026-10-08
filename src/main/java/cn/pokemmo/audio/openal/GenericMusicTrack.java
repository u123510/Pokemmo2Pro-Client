package cn.pokemmo.audio.openal;

import f.*;

import java.io.IOException;

public class GenericMusicTrack extends pp_2 {
    public Q Sh0;

    public GenericMusicTrack(cn.pokemmo.audio.openal.OpenALAudioEngine audio, Dn0 source) {
        super(audio, source);
        this.Sh0 = new Q(source);
        if (audio.Ze) {
            return;
        }
        this.Ei0(this.Sh0.Tk, this.Sh0.coM6);
    }

    @Override
    public final int jo0(byte[] buffer) {
        if (this.Sh0 == null) {
            this.Sh0 = new Q(this.LpT6);
            this.Ei0(this.Sh0.Tk, this.Sh0.coM6);
        }
        try {
            return this.Sh0.read(buffer);
        } catch (IOException error) {
            throw new nf_1("Error reading WAV file: " + this.LpT6, error);
        }
    }

    @Override
    public final void vK0() {
        KT.E1(this.Sh0);
        this.Sh0 = null;
    }
}
