package cn.pokemmo.particle.follower;

import cn.pokemmo.particle.ParticleManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import com.badlogic.gdx.math.Matrix4;
import f.*;

/**
 * 万圣节南瓜/南瓜王跟随者 3D 模型与粒子挂载对象 (Pumpkin Particle Follower Object)
 * 挂载并同步更新南瓜周身烟雾/特殊粒子特效 (special/pumpking 或 special/pumpkin_haze)
 *
 * 原混淆类: f.dx0_0
 */
public class PumpkinParticleFollowerObject extends Ou0 {
    public static final C8 sy0 = new C8();
    public static final C8 qi0 = new C8();

    public float e4;
    public float Yq;
    public int cF0;
    public float DN;
    public final PRN_ ss0;
    public final PRN_ Wt;
    public Pv0 rt;
    public final boolean isPumpking;
    public final boolean PC;
    public final ParticleManager particleManager;
    public final ff_0 pl;
    public final ParticleEffectExt particleEffect;
    public final ParticleEffectExt Wx0;
    public final Matrix4 transformMatrix;
    public final Matrix4 FM;
    public final boolean hasHaze;
    public final boolean hj;

    public PumpkinParticleFollowerObject(ut_0 ut, boolean isPumpking, boolean hasHaze, Ou0 parentOu0) {
        super(ut, "PumpkinObject", isPumpking ? 0.66f : 0.25f, null);
        eB(true);
        this.isPumpking = isPumpking;
        this.PC = isPumpking;
        this.hasHaze = hasHaze;
        this.hj = hasHaze;
        this.p8 = parentOu0;

        if (parentOu0 != null) {
            BM bm = (BM) parentOu0.Y3.get(0);
            bm.LPT8(new sh_0(1.0f));
            bm.LPT8(new mb0_2(mb0_2.k6, 0.01f));
            parentOu0.eB(true);
        }

        BM bm1 = (BM) this.Y3.get(1);
        PRN_ prn1 = new PRN_(PRN_.sI, Color.ORANGE.cpy().mul(0.2f));
        this.Wt = prn1;
        bm1.LPT8(prn1);

        BM bm2 = (BM) this.Y3.get(1);
        PRN_ prn2 = new PRN_(PRN_.xE, new Color(0.81f, 0.81f, 0.81f, 0.1f));
        this.ss0 = prn2;
        bm2.LPT8(prn2);

        if (hasHaze) {
            ff_0 pm = tw0_0.LD0.wL().Fq0();
            this.particleManager = pm;
            this.pl = pm;
            String effectName = isPumpking ? "special/pumpking" : "special/pumpkin_haze";
            ParticleEffectExt effect = pm.UH0(effectName);
            this.particleEffect = effect;
            this.Wx0 = effect;
            pm.fY(effect);
            effect.start();
            this.transformMatrix = new Matrix4();
            this.FM = this.transformMatrix;
        } else {
            this.particleManager = null;
            this.pl = null;
            this.particleEffect = null;
            this.Wx0 = null;
            this.transformMatrix = null;
            this.FM = null;
        }

        this.cF0 = rg0_2.j40(3000, 5000);
        this.DN = (float) rg0_2.j40(4000, 6000) / 1000.0f;
    }

    public void eo0(C8 pos) {
        if (this.Wx0 != null) {
            Matrix4 fm = this.FM;
            C8 c8 = sy0;
            c8.x = pos.x;
            c8.y = pos.y;
            c8.z = pos.z;
            float ox = this.PC ? 0.25f : 0.0f;
            float oy = this.PC ? 0.0f : -0.2f;
            float oz = this.PC ? -0.15f : 0.0f;
            fm.IW(c8.na(ox, oy, oz));
            this.Wx0.setTransform(this.FM);
        }

        this.ho.CN(C8.X, -25.0f);
        float progress = this.Yq / this.DN;
        if (progress > 0.5f) {
            progress = 1.0f - progress;
        }

        C8 c8 = sy0;
        c8.x = pos.x;
        c8.y = pos.y;
        c8.z = pos.z;
        if (this.PC) {
            c8.Vy(-0.25f, 0.05f, 0.0f);
        } else {
            c8.Vy(0.0f, 0.15f, -0.075f);
        }

        if (this.p8 != null) {
            C8 qi = qi0;
            qi.np(sy0);
            qi.Vy(0.0f, 0.1f, 0.025f);
            this.p8.ho.F();
            this.p8.ho.Y1(qi);
            float scale = 1.0f - progress * 0.1f;
            this.p8.ho.w2(scale, scale, 1.0f);
        }

        if (this.hj) {
            sy0.z += progress * 0.05f;
        }

        this.ho.Y1(sy0);
        float delta = lg_0.S4.uL;
        this.e4 += delta;
        this.Yq += delta;
        if (this.Yq > this.DN) {
            this.Yq = 0.0f;
            this.DN = (float) rg0_2.j40(4000, 6000) / 1000.0f;
        }

        if (this.e4 >= (float) this.cF0 / 1000.0f) {
            this.e4 = 0.0f;
            this.cF0 = rg0_2.j40(3000, 5000);
        }

        Pv0 season = c8_0.JD0.Yj();
        if (season != this.rt) {
            this.rt = season;
            if (season == Pv0.cY) {
                ((BM) this.Y3.get(1)).fR(PRN_.xE);
            } else {
                ((BM) this.Y3.get(1)).LPT8(this.ss0);
            }
        }

        float glow = (this.e4 * 1000.0f) / (float) this.cF0;
        if (glow > 0.5f) {
            glow = 1.0f - glow;
        }

        Color white = Color.WHITE;
        this.Wt.v50.set(white.r * glow * 0.5f, white.g * glow * 0.5f, white.b * glow * 0.5f, 1.0f);
        float cVal = glow * 0.25f + 0.55f;
        this.ss0.v50.set(cVal, cVal, cVal, 0.1f);
    }

    public void O4() {
        if (this.Wx0 != null) {
            this.pl.Kz0(this.Wx0);
            this.Wx0.dispose();
        }
    }
}
