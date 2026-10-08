/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.badlogic.gdx.graphics.Color
 *  com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt
 *  com.badlogic.gdx.math.Matrix4
 *  f.AG0
 *  f.BJ0
 *  f.C8
 *  f.ER
 *  f.I2
 *  f.LPT6_
 *  f.LW
 *  f.U5
 *  f.Vs0
 *  f.bi0_1
 *  f.com3__3
 *  f.dw_2
 *  f.es_1
 *  f.hk0_1
 *  f.hl0_1
 *  f.mg_0
 *  f.mz_2
 *  f.uh_1
 *  f.vo_2
 *  f.yz_2
 *  f.zv_2
 */
package cn.pokemmo.graphics.gdx.particle;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerExt;
import com.badlogic.gdx.math.Matrix4;

public class GdxFollowerParticleRenderer
extends mg_0 {
    public static final C8 M = new C8();
    public static final Matrix4 JO = new Matrix4();
    public final yz_2 Rd;
    public final yz_2 uk;
    public short fp0;
    public byte hn;
    public AG0[] yv;
    public float[] gK0;
    public com3__3 fi;
    public final es_1 Cq;
    public boolean xj0;
    public long F30;
    public int wT;
    public boolean Uc;
    public boolean yJ0;
    public boolean N10;

    public GdxFollowerParticleRenderer(bi0_1 bi0_12) {
        super(bi0_12);
        yz_2 yz_22 = new yz_2(4, 332).Hu();
        this.Rd = yz_22;
        this.uk = new yz_2(2, 166).lPt5(yz_22.uy0());
        this.fp0 = (short)-1;
        this.hn = (byte)-1;
        this.yv = null;
        this.gK0 = null;
        this.Cq = new es_1(2);
        this.xj0 = false;
        this.F30 = -1L;
        this.wT = 0;
        this.Uc = false;
        this.yJ0 = false;
    }

    public boolean N30(hl0_1 hl0_12, int n, boolean bl) {
        AG0 aG0 = this.Me(null);
        if (aG0 == null) {
            return true;
        }
        GdxFollowerParticleRenderer ai0 = this;
        ai0.wH0(ai0.wT, hl0_12);
        boolean bl2 = false;
        if (ai0.wT != 255) {
            Color color = Vs0.se.cpy();
            float f = color.a;
            color.a = (float)this.wT / 255.0f * f;
            hl0_12.oH.set(color);
            hl0_12.og = color.toFloatBits();
            bl2 = true;
        }
        bl = this.yv.length < 7 && bl;
        int n2 = 0;
        int n3 = 0;
        float[] fArray = this.gK0;
        if (this.gK0 != null) {
            double d = n3;
            n3 = (int)(d - (double)fArray[1] * 0.25);
            n2 = (int)(d - (double)fArray[2] * 0.25);
        }
        AG0 aG02 = aG0;
        LPT6_ region = aG02.d3();
        int n4 = aG02.g6;
        int n5 = (this.hn & 0xFFFFFF80) != 0 ? 3 : 4;
        n4 = n4 / n5 * 3;
        C8 c8 = this.VH;
        float f = c8.x - (float)n3 - 4.0f;
        n3 = n4 - 24;
        float f2 = f - (float)(n3 / 2);
        int n6 = bl ? n4 : 0;
        float f3 = f2 + (float)n6;
        float f4 = c8.y - (float)n2 - 8.0f - (float)n3 - (this.w60() ? 1.0f : 0.0f);
        float f5 = bl ? (float)(-n4) : (float)n4;
        float f6 = n4;
        hl0_12.S50(region, f3, f4, f5, f6);
        if (bl2) {
            float f7 = Vs0.lv;
            Color.abgr8888ToColor((Color)hl0_12.oH, (float)f7);
            hl0_12.og = f7;
        }
        return true;
    }

    public boolean jq0(BJ0 bJ0, ER eR, U5 u5, int n, boolean n2) {
        float f;
        float f7;
        AG0 aG0 = this.Me(u5);
        if (aG0 == null) {
            return true;
        }
        if (this.wT > 125) {
            boolean bl = false;
            this.xD(bJ0, eR, u5, false, bl);
        }
        float f3 = (this.hn & 0xFFFFFF80) != 0 ? 1.3333334f : 1.0f;
        C8 c8 = M;
        c8.np(this.VH);
        LPT6_ lPT6_ = aG0.d3();
        c8.z = f7 = c8.z - 0.02f;
        c8.y = f = c8.y - 0.01f;
        int n3 = aG0.g6;
        if (n3 > 32 || f3 > 1.0f) {
            float f2 = ((float)n3 * f3 - 32.0f) / 32.0f;
            c8.y = f2 * 0.08f + f;
            c8.z = f7 - f2 * 0.16f;
        }
        f7 = 0.01171875f;
        f3 = (float)aG0.gj * f7 * f3;
        float[] fArray = this.gK0;
        if (this.gK0 != null) {
            f = fArray[0];
            if (f > 0.0f) {
                f3 *= f;
            }
            float f5 = c8.x;
            c8.x = fArray[1] * 0.01f + f5;
            f5 = c8.y;
            c8.y = fArray[2] * 0.01f + f5;
            f5 = c8.z;
            c8.z = fArray[3] * 0.01f + f5;
        }
        if (this.fi == null) {
            int n4 = 1;
            int n5 = 1;
            boolean bl = true;
            com3__3 com3__33 = new com3__3(n4, n5, lPT6_, bl);
            this.fi = com3__33;
        }
        float f6 = 0.0f;
        zv_2 zv_22 = this.Ii0.ba0;
        if (zv_22.uS == 3 && zv_22.Lpt2) {
            LT lt = zv_22.LPt1();
            if (lt != null && lt.XC0() != 0.0f) {
                f6 = lt.XC0();
            if (LW.LH0((float)90.0f, (float)f6)) {
                c8.Vy(0.2f, 0.25f, -0.05f);
            } else if (LW.LH0((float)270.0f, (float)f6)) {
                c8.Vy(-0.15f, 0.2f, 0.0f);
            }
            }
        }
        boolean flip = (this.yv.length < 7 || this.yJ0) && n2;
        this.fi.Gb0(lPT6_, flip);
        int n6 = this.wT;
        if (n6 != 255) {
            float f8 = f3 * 0.75f;
            c8.y -= (1.0f - (float)n6 / 255.0f) * f8;
        }
        if (this.w60()) {
            mz_2 mz_22 = this.fi.bq0;
            mz_22.j70 = 1.5f / (float)aG0.g6 * mz_22.aU + mz_22.j70;
        }
        this.fi.qr0(c8);
        this.fi.DB0(this.n80, this.qv0.St0);
        this.fi.OF0(f3 * (float)this.wT / 255.0f);
        this.fi.qq0(vo_2.z0);
        if (!LW.LH0((float)f6, (float)0.0f)) {
            this.fi.qI0.tO(C8.Z, f6);
        }
        JO.IW(this.VH);
        I2 i2 = this.Cq.ZD();
        while (i2.hasNext()) {
            ParticleEffectExt effect = (ParticleEffectExt)i2.next();
            if (effect.isComplete()) {
                this.Cq.sj0((Object)effect, true);
                continue;
            }
            effect.setTransform(JO);
        }
        int n5 = this.wT;
        if (n5 != 255) {
            float f9 = 1.0f - (float)n5 / 255.0f;
            this.fi.nu(1.0f, 1.0f, 1.0f, f9);
        } else {
            this.fi.nu(0.0f, 0.0f, 0.0f, 0.0f);
            Color color = Color.WHITE;
            this.fi.CQ.v50.set(color);
        }
        this.fi.Vg();
        eR.Lh0((uh_1)this.fi, u5);
        return true;
    }

    /*
     * Exception decompiling
     */
    public final AG0 Me(U5 u5) {
        boolean spawned = false;
        bi0_1 baseEntity = null;
        short pokemonIndexId = this.Ii0.mI0();
        byte rarity = this.Ii0.QL();
        bi0_1 entity = this.Ii0;

        if (entity instanceof KF) {
            KF follower = (KF)entity;
            baseEntity = follower.KL0;
            zv_2 followerPos = follower.ba0;
            zv_2 basePos = baseEntity.ba0;
            if (followerPos.uS == basePos.uS
                    && followerPos.o0 == basePos.o0
                    && followerPos.ID0 == basePos.ID0
                    && followerPos.Lq0 == basePos.Lq0
                    && followerPos.B5 == basePos.B5
                    && followerPos.JT == basePos.JT
                    && followerPos.Lpt2 == basePos.Lpt2) {
                this.wT = 0;
                this.F30 = hk0_1.KG;
                return null;
            }
            LT followerTile = followerPos.LPt1();
            if (followerTile != null) {
                if (followerTile.Oo(this.Ii0) != null || followerTile.V50(this.Ii0.ba0.JT)) {
                    this.wT = 0;
                    this.F30 = hk0_1.KG;
                    return null;
                }
            }
        }

        if (!this.xj0) {
            short oldPokemonIndexId = this.fp0;
            if ((oldPokemonIndexId != pokemonIndexId || this.hn != rarity || this.N10) && oldPokemonIndexId != -1 && this.yv != null) {
                this.xj0 = true;
                this.F30 = hk0_1.KG;
            }
        }

        if (this.xj0) {
            pokemonIndexId = this.fp0;
            rarity = this.hn;
        }

        if (this.fp0 != pokemonIndexId || this.hn != rarity) {
            this.F30 = hk0_1.KG;
            this.fp0 = pokemonIndexId;
            this.hn = rarity;
            SS sprites = SS.hG0;
            this.yv = sprites.U(pokemonIndexId, rarity, true);
            this.gK0 = (float[])sprites.KU.f5(pokemonIndexId);
            sprites.jC.l90(pokemonIndexId | (rarity << 16));
            this.Uc = rg0_0.Prn(0, pokemonIndexId) > 0;
            this.yJ0 = rg0_0.dM(pokemonIndexId) > 0;

            if (baseEntity != null && baseEntity.Ou() && pokemonIndexId > 0) {
                spawned = true;
                if (this.yv != null) {
                    if (tw0_0.PK0 == null || tw0_0.rl == null || tw0_0.rl.nz()) {
                        di0_0.Hv0(pokemonIndexId, (byte)(rarity & 31), 1.0f, 0.0f, false);
                    }
                } else if (!((KF)this.Ii0).Pm0) {
                    tw0_0.rl.qK(sm0_0.c0(6910));
                }
            }

            if (this.Ii0 instanceof KF) {
                ((KF)this.Ii0).Pm0 = false;
            }
            if (this.yv == null) {
                return null;
            }
        }

        if (pokemonIndexId < 1 || this.yv == null) {
            return null;
        }

        int elapsed = (int)(hk0_1.KG - this.F30);
        if (this.xj0) {
            this.wT = Math.max(0, 255 - (int)((float)elapsed / 300.0f * 255.0f));
            if (this.wT < 1 && !this.N10) {
                this.xj0 = false;
                this.fp0 = (short)-1;
            }
        } else if (elapsed >= 150) {
            this.wT = Math.min(255, (int)((float)(elapsed - 150) / 300.0f * 255.0f));
        }

        byte frame = (byte)this.Rd.gZ();
        byte direction = this.Ii0.ba0.Y30;
        SS sprites = SS.hG0;
        boolean hasCustomModel = this.Uc;
        boolean hasChristmasModel = this.yJ0;
        int offset = 0;
        if (!hasChristmasModel && sprites.jC.l90(pokemonIndexId | (rarity << 16))) {
            byte[] frameMap = sprites.PB0[direction];
            if (frameMap.length < frame) {
                frame = (byte)(frame - 2);
            }
            frame = frameMap[frame];
        } else {
            if (hasChristmasModel) {
                switch (direction) {
                    case 0:
                        offset = 3;
                        break;
                    case 1:
                        offset = 5;
                        break;
                    case 2:
                    case 3:
                        offset = 7;
                        break;
                    default:
                        offset = 0;
                        break;
                }
            } else if (hasCustomModel) {
                switch (direction) {
                    case 0:
                        offset = 3;
                        break;
                    case 1:
                        offset = 0;
                        break;
                    case 2:
                        offset = 6;
                        break;
                    case 3:
                        offset = 9;
                        break;
                    default:
                        offset = 0;
                        break;
                }
            } else {
                switch (direction) {
                    case 0:
                        offset = 2;
                        break;
                    case 1:
                        offset = 0;
                        break;
                    case 2:
                        offset = 4;
                        break;
                    case 3:
                        offset = 6;
                        break;
                    default:
                        offset = 0;
                        break;
                }
            }
            frame = (byte)(frame % 2 + offset);
        }
        if (frame >= this.yv.length) {
            frame = (byte)(frame - 2);
        }

        if (spawned && u5 != null && !dw_2.is0) {
            this.Cq.clear();
            ff_0 particleManager = tw0_0.LD0.Sc.Fq0();
            if (particleManager != null) {
                String suffix = "";
                boolean shiny = (this.hn & 64) != 0;
                boolean alpha = (this.hn & -128) != 0;
                if (shiny) {
                    suffix = "_shiny";
                }
                if (alpha) {
                    suffix = suffix.concat("_alpha");
                }
                ParticleEffectExt followerEffect = particleManager.UH0("custom/spawn_follower" + suffix);
                ParticleEffectExt ballEffect = particleManager.UH0("custom/spawn_follower_ball");
                VU match = null;
                VU[] party = tw0_0.rl.r1(_volatile.BV).rT();
                for (VU vu : party) {
                    if (vu == null) {
                        continue;
                    }
                    if (vu.I8.Yb0 == this.fp0 && vu.I8.aR() == alpha && vu.I8.I() == shiny) {
                        match = vu;
                    }
                }
                int ballType = match != null ? match.I8.QQ : 3;
                ParticleControllerExt ballController = ballEffect.findController("Ball");
                if (ballController != null) {
                    ballController.aps_id = ballType * 4 + 46;
                    ballController.getRenderer().getBatch().getTexture().dispose();
                    Texture texture = particleManager.RY(ballController);
                    ballEffect.addResource(texture);
                    ballController.getRenderer().getBatch().setTexture(texture);
                    try {
                        Object colorInfluencer = ballController.findInfluencer((Class)Class.forName("com.badlogic.gdx.graphics.g3d.particles.influencers.ColorInfluencer$Single"));
                        if (colorInfluencer != null) {
                            PRN_ colorAttribute = (PRN_)u5.sg(PRN_.xE);
                            if (colorAttribute != null) {
                                Color color = colorAttribute.v50;
                                float[] colors = new float[9];
                                for (int i = 0; i < 3; ++i) {
                                    int idx = i * 3;
                                    colors[idx] = color.r;
                                    colors[idx + 1] = color.g;
                                    colors[idx + 2] = color.b;
                                }
                                Object colorValue = colorInfluencer.getClass().getField("colorValue").get(colorInfluencer);
                                colorValue.getClass().getMethod("setColors", float[].class).invoke(colorValue, (Object)colors);
                            }
                        }
                    } catch (ReflectiveOperationException ignored) {
                    }
                }

                ParticleEffectExt[] effects = new ParticleEffectExt[]{followerEffect, ballEffect};
                for (ParticleEffectExt effect : effects) {
                    particleManager.fY(effect);
                    effect.init();
                    effect.start();
                }
                JO.IW(this.VH);
                this.Cq.G6((Object[])effects, 0, effects.length);
                I2 it = this.Cq.ZD();
                while (it.hasNext()) {
                    ((ParticleEffectExt)it.next()).setTransform(JO);
                }
            }
        }

        return this.yv[frame];
    }

    public final boolean w60() {
        int n = dw_2.XN;
        if (n == 2) {
            return false;
        }
        if (n == 1 && hk0_1.KG - this.Ii0.il0.gd > 300L) {
            return false;
        }
        return this.uk.gZ() == 0;
    }
}
