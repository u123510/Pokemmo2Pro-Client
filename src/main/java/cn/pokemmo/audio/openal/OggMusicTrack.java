package cn.pokemmo.audio.openal;

import f.*;

import java.io.Closeable;
import java.io.InputStream;

public class OggMusicTrack extends pp_2 {
    public Fn0 M7;
    public Fn0 uh;

    public OggMusicTrack(cn.pokemmo.audio.openal.OpenALAudioEngine audio, Dn0 file) {
        super(audio, file);
        if (audio.Ze) {
            return;
        }
        this.M7 = new Fn0(file.uf0());
        this.Ei0(this.M7.ql0(), this.M7.oY());
    }

    @Override
    public final int jo0(byte[] buffer) {
        if (this.M7 == null) {
            InputStream input = this.LpT6.uf0();
            this.M7 = new Fn0(input, this.uh);
            this.Ei0(this.M7.iJ.OF, this.M7.iJ.Ne0);
            this.uh = null;
        }
        return this.M7.read(buffer, 0, buffer.length);
    }

    @Override
    public final void vK0() {
        KT.E1((Closeable)this.M7);
        this.uh = null;
        this.M7 = null;
    }

    @Override
    public final void JV() {
        KT.E1((Closeable)this.M7);
        this.uh = this.M7;
        this.M7 = null;
    }

}
