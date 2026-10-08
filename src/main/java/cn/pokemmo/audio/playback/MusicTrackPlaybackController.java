package cn.pokemmo.audio.playback;

import f.*;

import java.util.List;

public class MusicTrackPlaybackController implements je0_1 {
    public final gg0_0 RJ;
    public boolean Oj0;
    public boolean Yo;
    public byte C;
    public short dh;
    public float M70;
    public final List aA0;

    public MusicTrackPlaybackController(Dn0 v1, List v2) {
        super();
        this.Oj0 = false;
        this.Yo = false;
        this.dh = 0;
        this.aA0 = v2;
        u90_0 audio = lg_0.MF;
        if (audio == null) {
            CB0.xS.error("Gdx audio is null, check configuration.");
            this.RJ = null;
            this.Oj0 = true;
            return;
        }
        gg0_0 music;
        try {
            music = audio.Vr(v1);
        } catch (Exception e) {
            BR br = tw0_0.rl;
            if (br != null) {
                br.qK(sm0_0.wa0(1231, v1.toString()));
            }
            CB0.xS.error("Error loading sound {}. Please check any mods for errors.", v1, e);
            this.RJ = null;
            this.Oj0 = true;
            return;
        }
        this.RJ = music;
    }

    @Override
    public final void oz0(float f1) {
        if (!this.Oj0) {
            this.RJ.T8(f1, this.M70);
        }
    }

    @Override
    public final boolean i80() {
        if (this.Oj0) {
            return true;
        }
        if (this.RJ.QY()) {
            return false;
        }
        this.Oj0 = true;
        this.RJ.dispose();
        return true;
    }

    @Override
    public final void finalize() {
        try {
            if (!this.Oj0) {
                this.RJ.stop();
                this.Oj0 = true;
                this.RJ.dispose();
            }
        } catch (Exception ignored) {
        }
        try {
            super.finalize();
        } catch (Throwable ignored) {
        }
    }

    @Override
    public final void FB0() {
        if (!this.Oj0) {
            this.RJ.em0(this.Yo);
            this.RJ.aw(this.M70);
            this.RJ.FB0();
            this.aA0.add(this);
        }
    }

    @Override
    public final void wy0() {
        if (!this.Oj0) {
            this.RJ.wy0();
        }
    }

    @Override
    public final void resume() {
        if (!this.Oj0) {
            this.RJ.FB0();
        }
    }

    @Override
    public final void nj0(boolean i1) {
        if (!this.Oj0) {
            this.RJ.stop();
        }
    }

    @Override
    public final boolean ge() {
        return this.Oj0;
    }

    @Override
    public final byte Fv() {
        return this.C;
    }

    @Override
    public final short Ib0() {
        return this.dh;
    }

    @Override
    public final void aw(float f1) {
        this.M70 = f1;
        if (!this.Oj0 && this.RJ != null) {
            this.RJ.aw(f1);
        }
    }
}
