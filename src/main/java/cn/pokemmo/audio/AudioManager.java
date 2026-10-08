package cn.pokemmo.audio;

import f.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 音频主引擎与全局声音管理器 (Audio Manager)
 * 统一调度 BGM、环境音、UI音效、技能音效、原生音频播放器与多音轨混音。
 *
 * 原混淆类: f.bu_0
 */
public class AudioManager {
    public static final dl_1 sX = Cq0.E1(AudioManager.class);
    public static final float COm9 = 0.001f;
    public final CB0 z6 = new CB0();
    public final SQ B2 = new SQ();
    public OE0 e00;
    public final ArrayList<OE0> k = new ArrayList<>();
    public boolean Am;
    public final x30 JZ = new x30();

    public static float d40(bi0_1 entity) {
        yt_1 world = tw0_0.e60;
        if (world == null || world.jB0 == null || entity == null || entity.pu.equals(world.jB0.pu)) return 1.0f;
        if (dw_2.is0) return 0.0f;
        float distance = entity.uR().ze0.SH0(world.jB0.L8.ze0);
        distance = N50.Fc(entity.ba0.uS) ? distance * 4.0f : distance / 16.0f;
        return Math.min(1.0f, (17.0f - distance) / 15.0f);
    }

    public final void P5() { for (OE0 player : this.k) player.aw(ff0_0.TJ0.wg()); this.Vw(); }
    public final void a80() { for (OE0 player : this.k) player.aw(0.0f); this.Vw(); }
    public final void fL() { for (OE0 player : this.k) if (!player.ge()) player.nj0(false); this.Vw(); }
    public final void cb() { if (this.e00 != null) this.e00.resume(); }

    public final void ed(byte channel, short sound) {
        float volume = mutedVolume();
        ff0_0 profile = ff0_0.Gz0;
        OE0 player = this.Mb0(channel, sound, (short)-1, profile);
        player.aw(profile.wg() * volume);
        player.FB0();
        if (!(player instanceof Xu0) && this.e00 != null) this.e00.wy0();
    }

    public final void xd(byte channel, short sound) {
        float volume = mutedVolume();
        ff0_0 profile = ff0_0.h30;
        OE0 player = this.Mb0(channel, sound, (short)-1, profile);
        player.aw(profile.wg() * volume);
        player.FB0();
    }

    public final void t7(byte channel, short sound) {
        for (OE0 player : this.k) if (!player.ge() && player.Fv() == channel && player.Ib0() == sound) player.nj0(false);
    }

    public final void tZ(boolean last) {
        ff0_0 profile = ff0_0.TJ0;
        OE0 player = this.Mb0((byte)2, (short)1397, (short)-1, profile);
        player.oz0(0.0f);
        player.aw(profile.wg() * mutedVolume());
        player.FB0();
        if (last) this.Am = false;
    }

    public final void No0(float volume, boolean suppressDuplicates, byte channel, short sound, short variant, float pan, float pitch) {
        lg_0.k.lPT5(() -> this.Kd(volume, suppressDuplicates, channel, sound, variant, pan, pitch));
    }

    public final void Kd(float volume, boolean suppressDuplicates, byte channel, short sound, short variant, float pan, float pitch) {
        if (dw_2.Sj && !tw0_0.LD0.Rg0) volume = 0.0f;
        if (!suppressDuplicates && N50.Fc(channel)) {
            for (OE0 player : this.k) if (!player.ge() && player.Fv() == channel && player.Ib0() == sound) return;
        }
        ff0_0 profile = ff0_0.TJ0;
        OE0 player = this.Mb0(channel, sound, variant, profile);
        player.oz0(pan);
        player.aw(profile.wg() * volume);
        player.Oo(pitch);
        player.FB0();
        this.Vw();
        this.k.add(player);
    }

    public final void o30(boolean suppressDuplicates, byte channel, short sound, float pan) {
        float volume = mutedVolume();
        if (!suppressDuplicates && N50.Fc(channel)) {
            for (OE0 player : this.k) if (!player.ge() && player.Fv() == channel && player.Ib0() == sound) return;
        }
        ff0_0 profile = ff0_0.TJ0;
        OE0 player = this.Mb0(channel, sound, (short)-1, profile);
        player.aw(profile.wg() * volume);
        player.oz0(pan);
        player.FB0();
        this.Vw();
        this.k.add(player);
    }

    public final void Ua0(boolean stop) {
        OE0 player = this.e00;
        if (player != null) {
            player.nj0(stop);
            this.e00 = null;
        }
    }

    public final void rw() { if (this.e00 != null && !this.e00.ge()) this.e00.FB0(); }
    public final void QA(byte channel, short sound, boolean stop, boolean replace) { this.bk0(channel, sound, stop, replace); }

    public final void Eh(byte channel, short sound, boolean stop, boolean replace) {
        xs_0 nativePlayer = xs_0.YL;
        if (nativePlayer != null && nativePlayer.isAlive()) lg_0.k.lPT5(() -> this.bk0(channel, sound, stop, replace));
    }

    public final void bk0(byte channel, short sound, boolean stop, boolean replace) {
        if (sound == 0) {
            yt_1 world = tw0_0.e60;
            if (world == null) {
                channel = 2;
                sound = 1159;
            } else if (tw0_0.PK0 != null && tw0_0.PK0.nf != Cq.Jd) {
                channel = tw0_0.PK0.cOM1();
                sound = tw0_0.PK0.QA();
            } else {
                _else map = world.N60();
                if (map == null) return;
                channel = map.dw;
                sound = map.hh0();
            }
        }
        boolean deferred = false;
        if (this.e00 != null) {
            if (!replace && this.e00.Ib0() == sound) return;
            this.e00.nj0(stop);
            if (this.e00.Vy0()) {
                this.e00.N90(this::rw);
                deferred = true;
            }
            this.e00 = null;
        }
        if (sound < 1) {
            this.e00 = new Xu0(channel, sound);
            return;
        }
        OE0 player = this.Mb0(channel, sound, (short)-1, ff0_0.Pd);
        this.e00 = player;
        if (!deferred) player.FB0();
    }

    public final void BK0(boolean stop) { lg_0.k.lPT5(() -> this.Ua0(stop)); }
    public final void Hq0(byte channel, short sound) { this.d00(false, channel, sound, 0.0f); }
    public final void IE(byte channel, short sound, short variant, boolean suppressDuplicates, float pan, float pitch, float volume, int delay) {
        lpt5__5.hL.ZD(() -> lg_0.k.lPT5(() -> this.Kd(volume, suppressDuplicates, channel, sound, variant, pan, pitch)), delay);
    }

    public final void lO() {
        if (this.Am) return;
        this.Am = true;
        for (int index = 0; index < 4; index++) {
            boolean last = index == 3;
            lpt5__5.hL.ZD(() -> this.tZ(last), index * 700L + 700L);
        }
    }

    public final void wp0(byte channel, short sound) { lg_0.k.lPT5(() -> this.t7(channel, sound)); }
    public final void SA0(byte channel, short sound) { lg_0.k.lPT5(() -> this.ed(channel, sound)); }
    public final void D4() { lg_0.k.lPT5(this::cb); }
    public final void qq() { lg_0.k.lPT5(this::fL); }
    public final void Xs0() { lg_0.k.lPT5(this::a80); }
    public final void Jh0() { lg_0.k.lPT5(this::P5); }
    public final void Vw() { this.k.removeIf(OE0::ge); }

    public final OE0 Mb0(byte channel, short sound, short variant, ff0_0 profile) {
        float volume = profile.wg();
        if (volume <= COm9 || sound < 1 || (channel != 10 && !tw0_0.Ll0.cOM4(channel)) || (sound == 1999 && channel == 1)) return new Xu0(channel, sound);
        int key = channel * 65536 + sound;
        if (this.B2.l90(key)) {
            try {
                Dn0 definition = (Dn0)this.B2.get(key);
                qx_0 player = new qx_0(definition, this.z6.BE0);
                player.C = channel;
                player.dh = sound;
                boolean music = profile == ff0_0.Pd;
                player.Yo = music;
                player.RJ.em0(music);
                player.aw(volume);
                return player;
            } catch (Exception exception) {
                sX.error("Unable to load mod for {} {}", new Object[]{channel, sound, exception});
            }
        }
        if (N50.Fc(channel) && tw0_0.Ll0.AB(channel) != null) {
            if (channel == 2 && sound == 1351) return new Xu0(channel, sound);
            yb_0[] sounds = tw0_0.Ll0.AB(channel).RP().y60.Pp[0].mR;
            if (sound >= sounds.length || ((aq0_0)sounds[sound]).nul == 20041) return new Xu0(channel, sound);
        }
        if ((channel == 0 && sound > 346) || (channel == 1 && sound > 609)) return new Xu0(channel, sound);
        OE0 player = null;
        if (xs_0.rD0) {
            if (xs_0.YL == null) xs_0.init();
            try {
                if (N50.Fc(channel)) player = new Fy0(channel, sound, variant, profile);
                else if (N50.Aa(channel)) player = new zl_1(channel, sound, profile);
            } catch (Exception exception) {
                xs_0.Ew0.error("NativeSoundPlayer[{},{}] Initialize error", new Object[]{channel, sound, exception});
                xs_0.rD0 = false;
            }
        }
        if (player == null) return new Xu0(channel, sound);
        player.aw(volume);
        return player;
    }

    public final void n90(byte channel, short sound, Dn0 definition) { this.B2.j10(this.B2.yw0(channel * 65536 + sound), definition); }
    public final void d00(boolean suppressDuplicates, byte channel, short sound, float pan) { lg_0.k.lPT5(() -> this.o30(suppressDuplicates, channel, sound, pan)); }
    public final void sK(short sound) { this.Eh((byte)2, sound, true, false); }
    public final void P7(short sound) { lg_0.k.lPT5(() -> this.xd((byte)2, sound)); }
    public final void Ay(short sound) { this.d00(true, (byte)2, sound, 0.0f); }

    private static float mutedVolume() { return dw_2.Sj && !tw0_0.LD0.Rg0 ? 0.0f : 1.0f; }
}
