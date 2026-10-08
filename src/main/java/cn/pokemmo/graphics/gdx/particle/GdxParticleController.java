package cn.pokemmo.graphics.gdx.particle;

import f.*;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import com.badlogic.gdx.math.Matrix4;

public abstract class GdxParticleController {
    public static final C8 bg0;
    public static final C8 vz;
    public static final C8 jE0;
    public static final C8 OL0;
    public static final C8 Iy0;
    public static final C8 Ze0;
    public final bi0_1 Ii0;
    public final C8 ze0;
    public final C8 OA0;
    public final C8 VH;
    public final C8 Af;
    public final C8 n80;
    public Matrix4 Cs;
    public boolean EH;
    public long oh;
    public boolean dm0;
    public boolean mG;
    public byte R5;
    public Tv0 qv0;
    public int ui0;
    public final yz_2 ol0;
    public final yz_2 Fp;
    public final yz_2 rY;
    public oq_1 Xf0;
    public boolean Np0;
    public boolean w5;
    public long Sc;
    public Ou0 dA;
    public Ou0 aC0;
    public Ou0 Qc0;
    public Ou0 JW;
    public Ou0 Wa0;
    public Ou0 RP;
    public Ou0 Z00;
    public Ou0 lK0;
    public qe_0 rh0;
    public qe_0 WV;
    public boolean j80;
    public Ou0 Co;
    public byte hD0;
    public float Hn;
    public final C8 Iw;
    public final me0_2 vj;
    public final me0_2 fl0;
    public nk_0 xC;

    static {
        bg0 = new C8();
        vz = new C8();
        jE0 = new C8();
        OL0 = new C8();
        Iy0 = new C8();
        Ze0 = new C8();
    }

    public GdxParticleController(bi0_1 actor) {
        ze0 = new C8();
        OA0 = new C8();
        VH = new C8();
        Af = new C8();
        n80 = new C8();
        Cs = null;
        EH = true;
        dm0 = false;
        mG = false;
        R5 = -1;
        qv0 = null;
        ui0 = 0;
        ol0 = new yz_2(2, 300);
        Fp = new yz_2(50, 25);
        rY = new yz_2(4, 180).Hu();
        Np0 = true;
        w5 = true;
        j80 = false;
        Co = null;
        Hn = 0.0F;
        Iw = new C8();
        vj = new me0_2();
        fl0 = new me0_2();
        xC = null;
        Ii0 = actor;
    }

    public final int F7() {
        int direction = ZD();
        if (direction == 3) direction--;
        if (Ii0.uv() && w5 && !Ii0.oI0() && !Ii0.LH0() && !Ii0.Ze()) {
            int frame = si0_0.Fz(direction, 2, 9, direction);
            if (ui0 == 1) frame++;
            else if (ui0 == 3) frame += 2;
            direction = frame;
        } else if (Ii0.LH0() || Ii0.Ze()) {
            if (ui0 == 1) direction += 3;
            else if (ui0 == 3) direction += 6;
        } else {
            if (ui0 == 1) direction = direction * 2 + 3;
            else if (ui0 == 3) direction = direction * 2 + 4;
        }
        return direction;
    }

    public void ej0() {
    }

    public bi0_1 U20() {
        return Ii0;
    }

    public abstract boolean jq0(BJ0 camera, ER renderer, U5 environment, int frame, boolean flip);

    public int ji() {
        throw new RuntimeException();
    }

    public int CoM5() {
        throw new RuntimeException();
    }

    public final byte ZD() {
        byte direction = R5;
        return direction != -1 ? direction : Ii0.ba0.Y30;
    }

    public void Oq(boolean first, boolean second) {
        throw new RuntimeException();
    }

    public boolean wJ0() {
        return false;
    }

    public final void tD0(hl0_1 batch, PC0 camera, _else map) {
        long now = hk0_1.KG;
        EA0 animation = Ii0.il0;
        oh = now - animation.gd;
        dm0 = animation.BQ;
        mG = animation.EL;
        EH = true;
        ze0.np(animation.t60);
        ze0.Fg0(16.0F);
        ze0.x += map.j3();
        ze0.y += map.qF() - 2;
        ze0.z = 0.0F;
        ze0.x = (float) (int) ze0.x;
        ze0.y = (float) (int) ze0.y;
        C8 position = VH;
        position.getClass();
        position.x = ze0.x;
        position.y = ze0.y;
        position.z = ze0.z;
        position.getClass();
        position.na(OA0.x, OA0.y, OA0.z);
        VH.x += 8.0F;
        VH.y -= 10.0F;
        camera.zz(VH);
        bi0_1 actor = Ii0;
        nk_0 state = actor.il0.mV;
        if (state == nk_0.Te0 || state == nk_0.HL || state == nk_0.mG0 || state == nk_0.Gw0
                || state == nk_0.Bb || state == nk_0.Vy || state == nk_0.XX) {
            actor.PC0(RL0.aN);
        } else if (actor.wq0 == RL0.aN) {
            actor.PC0(RL0.S60);
        }
        Ii0.il0.p3();
        if (Ii0.aB()) tw0_0.Tl0.Ov(Ii0, VH);
        if (Ii0.CI0()) tw0_0.Tl0.L60(Ii0, VH);
        actor = Ii0;
        actor.getClass();
        if (!(actor instanceof KF)) tw0_0.FL.YK(Ii0.pu, VH);
        if (ve0(batch, null, null, null, Ii0.il0.mV)) return;
        actor = Ii0;
        if (actor instanceof MO && ((MO) actor).F7.rh0) return;
        if (oW(batch)) return;
        if (PD(batch, null, null)) return;
        int direction = ZD();
        if (direction == 3) direction--;
        Nq(batch, Ii0.ki0(), direction, false);
    }

    public final void is() {
        long now = hk0_1.KG;
        EA0 animation = Ii0.il0;
        oh = now - animation.gd;
        dm0 = animation.BQ;
        mG = animation.EL;
        animation.p3();
    }

    public final boolean PD(hl0_1 batch, ER renderer, U5 environment) {
        int interval;
        if (Ii0.uv() && !Ii0.oI0()) interval = 140;
        else {
            Ii0.getClass();
            interval = 160;
        }
        if (oh > (long) (interval * 2)) {
            Sc = 0L;
            ui0 = 0;
            return false;
        }
        Sc += hk0_1.HI0;
        if (Sc > (long) (interval * 4)) Sc = 0L;
        ui0 = (int) (Sc / (long) interval) % 4;
        int frame = F7();
        if (renderer != null) {
            Ii0.ki0();
            El(renderer, environment, frame, false);
        } else {
            Nq(batch, Ii0.ki0(), frame, false);
        }
        return true;
    }

    public final boolean ve0(hl0_1 batch, ER renderer, BJ0 camera, U5 environment, nk_0 state) {
        if (state == null) return false;
        int frame = 0;
        short id = Ii0.ki0();
        switch (nn_0.NR[state.Xy0]) {
            case 32:
                Np0 = true;
                break;
            case 31: {
                int elapsed = (int) ((hk0_1.KG - U20().il0.Li0) / 60L);
                if (elapsed > 3) return true;
                if (renderer != null) El(renderer, environment, elapsed, true);
                else Nq(batch, id, elapsed, true);
                return true;
            }
            case 30:
                frame = (int) (hk0_1.KG / 250L % 4L);
                break;
            case 29:
                frame = (int) (hk0_1.KG / 150L % 8L);
                break;
            case 28: {
                short sprite = U20().ki0();
                int elapsed = sprite == 203 || sprite == 2030 ? 0 : (int) ((hk0_1.KG - U20().il0.Li0) / 150L);
                if (elapsed < 8) frame = elapsed;
                break;
            }
            case 27:
                frame = rY.gZ();
                break;
            case 23: case 24: case 25: case 26: {
                U20().il0.mV = null;
                yt_1 client = tw0_0.e60;
                if (client == null) break;
                E90 player = client.jB0;
                if (player == null) break;
                if (!Ii0.pu.equals(player.pu) && dw_2.is0) break;
                ff_0 particles = tw0_0.LD0.Sc.Fq0();
                if (particles == null) break;
                int number = state.Qf0 - nk_0.SB0.Qf0 + 1;
                co_1.Kl0.np(ze0).na(0.0F, 0.0F, 0.25F);
                co_1.cOm6.np(ze0).na(0.0F, 0.0F, 0.25F);
                ParticleEffectExt effect = particles.UH0(new StringBuilder("custom/firework_0").append(number).toString());
                effect.start();
                particles.fY(effect);
                int soundIndex = rg0_2.j40(0, 2);
                short[] sounds = { 1475, 1682, 1683, 1746, 1816 };
                bu_0 audio = tw0_0.RE0;
                bi0_1 actor = Ii0;
                audio.getClass();
                float volume = bu_0.d40(actor);
                if (volume > 0.0F) {
                    int timing = rg0_2.j40(3, 4);
                    audio = tw0_0.RE0;
                    short sound = sounds[rg0_2.j40(3, 4)];
                    audio.IE((byte) 2, sound, (short) -1, true, 0.0F, 1.0F, volume, timing == 4 ? 500 : 50);
                    tw0_0.RE0.IE((byte) 2, sounds[soundIndex], (short) -1, true, 0.0F, 1.0F, volume, 800);
                    if (number == 1 || number == 3) {
                        tw0_0.RE0.IE((byte) 2, (short) 1475, (short) -1, true, 0.0F, 1.0F, volume * 0.5F, 1200);
                    }
                    tw0_0.RE0.IE((byte) 2, (short) 1825, (short) -1, true, 0.0F, 1.0F, volume * 0.25F, 1000);
                }
                break;
            }
            case 22: {
                Np0 = true;
                bi0_1 actor = Ii0;
                if (actor instanceof MO && ((MO) actor).F7.rh0) {
                    switch (actor.ba0.Y30) {
                        case 0: ((MO) actor).gB0((byte) 8); break;
                        case 1: ((MO) actor).gB0((byte) 7); break;
                        case 2: ((MO) actor).gB0((byte) 9); break;
                        case 3: ((MO) actor).gB0((byte) 10); break;
                        default: break;
                    }
                }
                break;
            }
            case 20: case 21:
                if (state != xC) Np0 = false;
                break;
            case 16: case 17: case 18: case 19: {
                byte direction = state.ml0;
                if (lK0 == null) {
                    Ou0 source = fi_0.xL().cU;
                    Ou0 model = tq0_0.ip0(source, source);
                    model.I0 = true;
                    lK0 = model;
                }
                lK0.ho.oF0(VH, vj.Rx0(), scale(1.0F));
                if (direction == 1) {
                    lK0.ho.tO(C8.Y, 180.0F);
                    lK0.ho.el0(0.0F, -0.2199999988F, 0.0F);
                } else if (direction == 3) {
                    lK0.ho.tO(C8.Y, 90.0F);
                    lK0.ho.el0(-0.1000000015F, -0.200000003F, 0.150000006F);
                    direction--;
                } else if (direction == 2) {
                    lK0.ho.tO(C8.Y, -90.0F);
                    lK0.ho.el0(0.1000000015F, -0.200000003F, 0.150000006F);
                } else {
                    lK0.ho.el0(0.0F, -0.2199999988F, 0.224999994F);
                }
                frame = direction;
                renderer.Lh0(lK0, environment);
                break;
            }
            case 15: {
                int elapsed = (int) ((hk0_1.KG - U20().il0.Li0) / 140L);
                if (elapsed < 5 && !Ii0.LH0() && !Ii0.oI0()) frame = Math.min(elapsed + 36, 38);
                if (renderer == null || !Ii0.Ou()) break;
                if (WV == null && hk0_1.KG - U20().il0.Li0 < 100L) {
                    tw0_0.rl.Sy = true;
                    tw0_0.LD0.Uk0(new CX());
                    qe_0 model = new qe_0(fi_0.xL().ct);
                    WV = model;
                    model.sC0(0, false, new u7_0(this));
                }
                if (WV == null) break;
                vj.Rx0();
                WV.ho.oF0(VH, vj, scale(1.0F));
                WV.ho.el0(-0.0500000007F, -0.25F, 0.1000000015F);
                Cs = WV.Q8(ze0, n80, camera);
                WV.PE0 = 1.25F;
                WV.P30(Hn, null);
                eh_2 effects = tw0_0.LD0.K10;
                effects.X60.Ue0(WV);
                effects.Z00 = environment;
                El(tw0_0.LD0.K10, environment, frame, false);
                return true;
            }
            case 14: {
                int elapsed = (int) ((hk0_1.KG - U20().il0.Li0) / 140L);
                if (elapsed >= 8 && elapsed < 15 && !Ii0.LH0() && !Ii0.oI0()) frame = Math.min(elapsed + 28, 38);
                if (renderer == null || !Ii0.Ou()) break;
                long age = hk0_1.KG - U20().il0.Li0;
                if (rh0 == null && age < 500L) {
                    Np0 = false;
                    qe_0 model = new qe_0(fi_0.xL().cg);
                    rh0 = model;
                    model.sC0(0, false, new Pm0(this));
                }
                if (rh0 == null) break;
                vj.Rx0();
                rh0.ho.oF0(VH, vj, scale(1.0F));
                rh0.ho.el0(-0.0500000007F, -0.25F, 0.1000000015F);
                Cs = rh0.Q8(ze0, n80, camera);
                rh0.PE0 = 1.0F;
                rh0.P30(Hn, null);
                eh_2 effects = tw0_0.LD0.K10;
                effects.X60.Ue0(rh0);
                effects.Z00 = environment;
                Np0 = true;
                El(tw0_0.LD0.K10, environment, frame, false);
                return true;
            }
            case 13: {
                switch (ZD()) {
                    case 0: frame = 47; break;
                    case 1: frame = 43; break;
                    case 2: case 3: frame = 39; break;
                    default: break;
                }
                int lowered = 0;
                long age = oh % 750L;
                if (age < 100L || (age > 200L && age < 300L)) {
                    lowered = 1;
                    frame += 2;
                } else frame += 3;
                if (renderer != null) {
                    createTool();
                    vj.Rx0();
                    vj.Ox0(C8.Y, 0.0F);
                    Wa0.ho.oF0(VH, vj, scale(1.0F));
                    C8 offset = t70_0.Ts(Ii0.ba0.Y30).hn0(0.25F, 0.0F, 0.25F);
                    Wa0.ho.el0(offset.x, -0.150000006F - (float) lowered * 0.0250000004F,
                            offset.z + 0.1000000015F);
                    Wa0.P30(Hn, null);
                    renderer.Lh0(Wa0, environment);
                }
                break;
            }
            case 12: {
                switch (ZD()) {
                    case 0: frame = 47; break;
                    case 1: frame = 43; break;
                    case 2: case 3: frame = 39; break;
                    default: break;
                }
                frame += Math.min(3, (int) ((hk0_1.KG - U20().il0.Li0) / 100L));
                if (renderer != null && oh > 300L) {
                    createTool();
                    vj.Rx0();
                    vj.Ox0(C8.Y, 0.0F);
                    Wa0.ho.oF0(VH, vj, scale(1.0F));
                    C8 offset = t70_0.Ts(Ii0.ba0.Y30).hn0(0.25F, 0.0F, 0.25F);
                    Wa0.ho.el0(offset.x, -0.150000006F, offset.z + 0.1000000015F);
                    Wa0.P30(Hn, null);
                    renderer.Lh0(Wa0, environment);
                }
                break;
            }
            case 11: {
                int elapsed = (int) ((hk0_1.KG - U20().il0.Li0) / 140L);
                if (elapsed < 5 && !Ii0.LH0() && !Ii0.oI0()) {
                    int selected = Math.min(elapsed + 36, 38);
                    if (renderer != null) El(renderer, environment, selected, true);
                    else Nq(batch, id, selected, true);
                    return true;
                }
                break;
            }
            case 9: case 10:
                frame = Math.min(3, (int) ((hk0_1.KG - U20().il0.Li0) / 120L));
                if (renderer != null) El(renderer, environment, frame, true);
                else Nq(batch, id, frame, true);
                break;
            case 8:
                frame = F7();
                if (renderer != null) {
                    if (RP == null) {
                        Ou0 source = fi_0.xL().kM;
                        Ou0 model = tq0_0.ip0(source, source);
                        model.I0 = true;
                        RP = model;
                    }
                    if (hk0_1.KG - U20().il0.Li0 < 100L) RP.sC0(0, false, null);
                    vj.Rx0();
                    vj.Ox0(C8.Y, 0.0F);
                    RP.ho.oF0(VH, vj, scale(1.0F));
                    C8 offset = t70_0.Ts(Ii0.ba0.Y30).hn0(0.25F, 0.0F, 0.25F);
                    RP.ho.el0(offset.x, -0.150000006F, offset.z + 0.1000000015F);
                    RP.P30(Hn, null);
                    renderer.Lh0(RP, environment);
                }
                break;
            default:
                xC = null;
                return false;
        }
        xC = state;
        if (renderer != null) El(renderer, environment, frame, false);
        else Nq(batch, id, frame, false);
        return true;
    }

    private static C8 scale(float value) {
        bg0.x = value;
        bg0.y = value;
        bg0.z = value;
        return bg0;
    }

    private void createTool() {
        if (Wa0 != null) return;
        Ou0 source = fi_0.xL().SA;
        Ou0 model = tq0_0.ip0(source, source);
        model.I0 = true;
        Wa0 = model;
        model.sC0(0, true, null);
    }

    public final boolean oW(hl0_1 batch) {
        int direction = ZD();
        short id = Ii0.ki0();
        if (direction == 3) direction--;
        if (mG && oh < 300L) {
            if (Xf0 == null) Xf0 = (oq_1) new oq_1((int) ze0.x, (int) ze0.y, 0).Vt0();
            int frame = (int) (oh / 30L);
            if (batch == null) {
                float offset = (float) (frame <= 5 ? frame : 12 - frame) * 0.0199999996F;
                ze0.y += offset;
                Af.y = offset;
                return false;
            }
            float offset = (float) (frame <= 5 ? frame : 12 - frame);
            ze0.y -= offset;
            Af.y = offset;
            Nq(batch, id, direction, false);
            return true;
        }
        if (dm0 && oh < 700L) {
            bi0_1 actor = Ii0;
            if (actor instanceof KF && ((KF) actor).KL0.mI0() == 0) return true;
            int frame = (int) (oh / 15L);
            if (batch == null) {
                if (Z00 == null) {
                    Ou0 source = fi_0.xL().yL;
                    Ou0 model = tq0_0.ip0(source, source);
                    model.I0 = true;
                    Z00 = model;
                }
                float offset;
                if (frame < 20) {
                    j80 = true;
                    offset = (float) frame * 0.0125000002F;
                } else if (frame < 24) {
                    offset = (float) frame * 0.0125000002F;
                } else {
                    offset = (float) (44 - frame) * 0.0125000002F;
                }
                ze0.y += offset;
                Af.y = offset;
                if (oh > 600L && j80) {
                    LT tile = Ii0.ba0.LPt1();
                    tile.ZD0(new n5_0(tile, Z00));
                    j80 = false;
                }
                return false;
            }
            if (Xf0 == null) Xf0 = (oq_1) new oq_1((int) ze0.x, (int) ze0.y).Vt0();
            float offset;
            if (frame < 20) {
                direction = direction * 2 + 3;
                offset = (float) frame;
            } else if (frame < 24) {
                offset = (float) frame;
            } else {
                direction = direction * 2 + 4;
                offset = (float) (44 - frame);
            }
            ze0.y -= offset;
            Af.y = offset;
            Nq(batch, id, direction, false);
            return true;
        }
        Af.rB0();
        return false;
    }

    public final void Nq(hl0_1 batch, int id, int frame, boolean suppressFlip) {
        if (!Np0 || batch == null || !EH) return;
        if (tw0_0.Ll0.t1 != null && (id == 97 || id == 109)) suppressFlip = true;
        if (id == 92 || id == 1140 || id == 1199) suppressFlip = true;
        else if (id == 1094) {
            frame = 0;
            suppressFlip = true;
        }
        LT tile = Ii0.ba0.LPt1();
        if (Ii0.LH0() || Ii0.Ze()) {
            int base = 0;
            switch (ZD()) {
                case 0: base = 0; break;
                case 1: base = 2; break;
                case 2: case 3: base = 4; break;
                default: break;
            }
            int bob = ol0.gZ();
            int index = base + bob;
            ze0.y += (float) bob;
            Texture texture = QI.Py.kN((byte) 0, 159, false).li0(index).H8();
            boolean flip = ZD() == 3 && !suppressFlip;
            batch.QB0(texture, ze0.x - 8.0F, ze0.y - 8.0F, (float) texture.getWidth(),
                    (float) texture.getHeight(), texture.getWidth(), texture.getHeight(), flip, false);
        }
        nk_0 animation = Ii0.il0.mV;
        boolean alternate = false;
        if (animation != null) {
            byte state = animation.Qf0;
            if (state >= nk_0.FA0.Qf0 && state <= nk_0.Tu0.Qf0) {
                frame = (int) (hk0_1.KG / 35L % 4L);
                if (frame == 3) {
                    alternate = true;
                    frame--;
                }
            }
        }
        boolean flip = (ZD() == 3 || alternate) && !suppressFlip;
        VH.np(ze0).na(OA0.x, OA0.y, OA0.z);
        N30(batch, frame, flip);
        if (tile != null) {
            nt_1 terrain = tile.u40();
            bi0_1 actor = Ii0;
            int mapX = Ii0.ba0.Lq0 * 16 + tile.F2().j3();
            int mapY = Ii0.ba0.B5 * 16 + tile.F2().qF();
            terrain.u00(tile, actor, batch, mapX, mapY, (int) ze0.x, (int) ze0.y);
        }
        oq_1 effect = Xf0;
        if (effect != null) {
            effect.nr(batch);
            if (Xf0.gL0()) {
                Xf0.getClass();
                Xf0 = null;
            }
        }
    }

    public abstract boolean N30(hl0_1 batch, int frame, boolean flip);

    public final void xD(BJ0 camera, ER renderer, U5 environment, boolean first, boolean large) {
        LT tile = Ii0.ba0.LPt1();
        if (tile == null || !tile.u40().Xc()) return;
        if (Ii0.LH0() || Ii0.Ze()) return;
        zv_2 location = Ii0.ba0;
        if (location.Lpt2 && location.uS == 3) return;
        if (Qc0 == null) {
            Ou0 source = fi_0.xL().OM;
            Ou0 model = tq0_0.ip0(source, source);
            model.I0 = true;
            Qc0 = model;
            if (large) {
                ((Xz0) model.ZE0.get(0)).Fc0.Fg0(3.0F);
                Qc0.a8();
            }
        }
        vj.Rx0();
        vj.Ox0(C8.Y, camera.d00);
        byte region = Ii0.ba0.uS;
        if (region == 2) {
            C8 offset = bg0;
            offset.np(VH).Vy(camera.v40.x, camera.v40.y, camera.v40.z);
            C8 position = vz;
            position.np(VH);
            if (!Ii0.ba0.Lpt2) position.na(offset.x * 0.0199999996F, 0.0F, offset.z * 0.0074999998F);
            offset.x = 1.0F;
            offset.y = 1.0F;
            offset.z = 1.0F;
            Qc0.ho.oF0(position, vj, offset);
            Qc0.ho.el0(0.0F, -0.2199999988F, 0.075000003F);
        } else if (region == 3 || region == 4) {
            bg0.x = 1.0F;
            bg0.y = 1.0F;
            bg0.z = 1.0F;
            Qc0.ho.oF0(VH, vj, bg0);
            Qc0.ho.el0(0.0F, 0.0F, first ? 0.0399999991F : 0.0799999982F);
            if (Ii0.CI0()) Qc0.ho.el0(-0.0049999999F, first ? -0.1000000015F : -0.150000006F, 0.0199999996F);
            else Qc0.ho.el0(0.0F, -0.200000003F, 0.0F);
        }
        if (large) Qc0.ho.el0(0.25F, -0.1000000015F, -0.25F);
        renderer.Lh0(Qc0, environment);
    }

    public final void El(ER renderer, U5 environment, int frame, boolean suppressFlip) {
        BJ0 camera = (BJ0) tw0_0.LD0.Sc.So();
        VH.np(ze0).na(OA0.x, OA0.y, OA0.z);
        C8 projected = bg0;
        projected.np(VH);
        if (Ii0.CI0() && Ii0.ki0() == 2010) {
            projected.x += 0.25F;
            projected.z -= 0.349999994F;
        }
        projected.z -= 0.125F;
        projected.y += 0.125F;
        if (tt0_0.C7()) {
            jy_1 viewport = tw0_0.LD0.aj;
            camera.ZX(projected, (float) -viewport.df, (float) viewport.gS, (float) viewport.Ty, (float) viewport.Ja);
        } else {
            camera.zz(projected);
        }
        if (U20() != tw0_0.e60.jB0) {
            fv_2 frustum = camera.cON;
            C8 position = ze0;
            boolean visible = true;
            for (int i = 2; i < 6; i++) {
                kg_0 plane = frustum.Bu[i];
                C8 normal = plane.Nf;
                float distance = normal.x * position.x;
                distance = normal.y * position.y + distance;
                distance = normal.z * position.z + distance;
                if (distance < -0.5F - plane.w2) {
                    visible = false;
                    break;
                }
            }
            if (visible) frustum.getClass();
            EH = visible;
        } else {
            EH = true;
        }
        if (EH) {
            if (Ii0.aB()) tw0_0.Tl0.Ov(Ii0, bg0);
            if (Ii0.CI0()) tw0_0.Tl0.L60(Ii0, bg0);
            bi0_1 actor = Ii0;
            actor.getClass();
            if (!(actor instanceof KF)) tw0_0.FL.YK(Ii0.pu, bg0);
        } else {
            tj0_0 labels = tw0_0.Tl0;
            CH0 id = Ii0.pu;
            g70_0 name = (g70_0) labels.B1.remove(id);
            if (name != null) labels.u3(name);
            le0_2 other = (le0_2) labels.k00.remove(id);
            if (other != null) labels.u3(other);
        }
        if (!Np0 || renderer == null || !EH) return;
        Hn += lg_0.S4.uL;
        n80.np(ze0).na(vo_2.ez.x, vo_2.ez.y, vo_2.ez.z);
        LT tile = Ii0.ba0.LPt1();
        if (tile != null) {
            if (Ii0.CI0()) ze0.y -= tile.u40().Wk() / 1.3300000429F;
            else ze0.y -= tile.u40().Wk();
        }
        nk_0 animation = Ii0.il0.mV;
        if (Ii0.LH0() || Ii0.Ze()) {
            float bob = (float) Math.abs(25 - Fp.gZ()) * 0.001F - 0.1000000015F;
            C8 shared = bg0;
            shared.getClass();
            C8 baseOffset = new C8(shared).rB0();
            C8 splashOffset = new C8(shared).rB0();
            boolean splash = true;
            if (Ii0.Ze() || (tile != null && tile.gr0())) splash = false;
            if (Ii0.Ze() && tile != null && !tile.gr0()) {
                ze0.z -= 0.075000003F;
                baseOffset.y -= 0.125F;
                splashOffset.y -= 0.2259999961F;
            } else if (Ii0.LH0() || (tile != null && tile.gr0())) {
                baseOffset.y -= 0.2509999871F;
                splashOffset.y -= 0.2779999971F;
            }
            ze0.y -= bob;
            if (dA == null) {
                Ou0 source = fi_0.xL().Zp;
                Ou0 model = tq0_0.ip0(source, source);
                model.I0 = true;
                dA = model;
                source = fi_0.xL().G5;
                model = tq0_0.ip0(source, source);
                model.I0 = true;
                aC0 = model;
                model.Ey("shibuki01", true, null);
            }
            vj.Rx0();
            fl0.Rx0();
            switch (Ii0.ba0.Y30) {
                case 3: {
                    C8 axis = C8.Y;
                    fl0.Ox0(axis, camera.d00 + 90.0F);
                    vj.getClass();
                    vj.h50(axis.x, axis.y, axis.z, (camera.d00 - 90.0F) * 0.0174532924F);
                    splashOffset.x -= 0.1800000072F;
                    break;
                }
                case 2: {
                    C8 axis = C8.Y;
                    fl0.Ox0(axis, camera.d00 - 90.0F);
                    vj.getClass();
                    vj.h50(axis.x, axis.y, axis.z, (camera.d00 + 90.0F) * 0.0174532924F);
                    splashOffset.x += 0.1800000072F;
                    break;
                }
                case 1: {
                    C8 axis = C8.Y;
                    fl0.Ox0(axis, camera.d00 + 180.0F);
                    vj.getClass();
                    vj.h50(axis.x, axis.y, axis.z, camera.d00 * 0.0174532924F);
                    splashOffset.z += 0.1800000072F;
                    break;
                }
                case 0: {
                    C8 axis = C8.Y;
                    fl0.Ox0(axis, camera.d00);
                    vj.getClass();
                    vj.h50(axis.x, axis.y, axis.z, (camera.d00 + 180.0F) * 0.0174532924F);
                    splashOffset.z -= 0.1800000072F;
                    break;
                }
                default: break;
            }
            long age = oh;
            if (age < 250L && Iw.x < 0.8000000119F) {
                Iw.if$(lg_0.S4.uL * 2.0F);
                if (hD0 != ZD()) {
                    Iw.rB0();
                    hD0 = ZD();
                }
            } else {
                C8 size = Iw;
                float value = size.x;
                if (value > 0.0F) size.dz0(lg_0.S4.uL * 2.0F);
                else if (age < 250L && value > 0.8000000119F && hD0 != ZD()) Iw.rB0();
            }
            aC0.ho.oF0(T3.hf(VH, VH).na(splashOffset.x, splashOffset.y, splashOffset.z), vj, Iw);
            shared.x = 0.8000000119F;
            shared.y = 0.8000000119F;
            shared.z = 0.8000000119F;
            dA.ho.oF0(VH, fl0, shared);
            if (Ii0.ba0.uS == 3 && tile != null && tile.XC0() != 0.0F) {
                C8 axis = C8.Z;
                aC0.ho.tO(axis, tile.XC0());
                dA.ho.tO(axis, tile.XC0());
                dA.ho.el0(0.0F, bob, 0.0F);
                aC0.ho.el0(0.0F, bob, 0.0F);
            } else {
                float negativeBob = -bob;
                dA.ho.el0(0.0F, negativeBob, 0.0F);
                aC0.ho.el0(0.0F, negativeBob, 0.0F);
            }
            Matrix4 matrix = aC0.ho;
            splashOffset.Fg0(0.0500000007F);
            matrix.getClass();
            matrix.el0(splashOffset.x, splashOffset.y, splashOffset.z);
            matrix = dA.ho;
            matrix.getClass();
            matrix.el0(baseOffset.x, baseOffset.y, baseOffset.z);
            aC0.P30(Hn, null);
            long elapsed = hk0_1.KG - U20().il0.Li0;
            if (animation != nk_0.a20 || elapsed < 500L) {
                renderer.Lh0(dA, environment);
                if (Iw.x > 0.0F && splash) renderer.Lh0(aC0, environment);
            }
        }
        boolean alternate = false;
        if (animation != null) {
            byte state = animation.Qf0;
            if (state >= nk_0.FA0.Qf0 && state <= nk_0.Tu0.Qf0) {
                frame = (int) (hk0_1.KG / 35L % 4L);
                if (frame == 3) {
                    alternate = true;
                    frame--;
                }
            }
        }
        boolean flip = (ZD() == 3 || alternate) && !suppressFlip;
        VH.np(ze0).na(OA0.x, OA0.y, OA0.z);
        jq0(camera, renderer, environment, frame, flip);
        if (Co != null) {
            C8 position = jE0.np(VH).Vy(0.0F, -0.1000000015F, 0.0F);
            C8 forward = OL0.np(camera.v40).Vy(position.x, position.y, position.z).KM();
            C8 right = Iy0.np(camera.St0).Xv0(forward).KM();
            C8 vertical = Ze0;
            vertical.getClass();
            vertical.x = forward.x;
            vertical.y = forward.y;
            vertical.z = forward.z;
            vertical.Xv0(right).KM();
            fl0.WA0(false, right.x, vertical.x, forward.x, right.y, vertical.y, forward.y,
                    right.z, vertical.z, forward.z);
            Co.ho.oF0(position, fl0, scale(1.0F));
            renderer.Lh0(Co, environment);
        }
        LT currentTile = Ii0.ba0.LPt1();
        if (currentTile != null) {
            nt_1 terrain = currentTile.u40();
            bi0_1 actor = Ii0;
            C8 position = VH;
            terrain.PI0(currentTile, actor, renderer, environment, camera, position.x, position.y, position.z);
        }
    }

    public final void wH0(int alpha, hl0_1 batch) {
        int offset = 0;
        LT tile = Ii0.ba0.LPt1();
        if (tile == null || !tile.u40().Xc()) return;
        if (Ii0.LH0() || Ii0.Ze()) return;
        short id = Ii0.ki0();
        byte region = Ii0.ba0.uS;
        if (region == 0) {
            if (id == 92 || id == 96) offset = -2;
        } else if (region == 1) {
            switch (id) {
                case 59: offset = -2; break;
                case 41: case 94: case 114: case 139: case 140: case 207: return;
                default: break;
            }
        }
        float scale;
        if ((double) Af.y <= 0.001) scale = 0.75F;
        else scale = 0.75F - (Af.y + 5.0F) / 15.0F * 0.25F;
        B5 shadow = fn_0.qz0().BI;
        shadow.Zi0 = scale;
        shadow.D60 = scale;
        shadow.o70 = true;
        fn_0.qz0().BI.Ha0((float) alpha / 255.0F);
        fn_0.qz0().BI.NL0(ze0.x - 4.0F + OA0.x + Af.x + -0.5F);
        fn_0.qz0().BI.ZJ(ze0.y - 3.0F + OA0.y + Af.y + (float) offset);
        fn_0.qz0().BI.jN(batch);
    }
}
