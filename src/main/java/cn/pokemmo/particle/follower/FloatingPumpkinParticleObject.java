package cn.pokemmo.particle.follower;

import cn.pokemmo.particle.ParticleManager;
import com.badlogic.gdx.graphics.Color;
import f.*;

/**
 * 悬浮律动南瓜 3D 对象 (Floating Pumpkin Particle Object)
 * 在万圣节剧情/过场中与粒子管理器协同，呈现周期性浮动和闪烁发光效果。
 *
 * 原混淆类: f.Ts0
 */
public class FloatingPumpkinParticleObject extends Ou0 {
    public static final C8 tV = new C8();

    public float fX;
    public float SH0;
    public boolean M10;
    public int xV;
    public final float kg;
    public PRN_ Nf;
    public final PRN_ YF;
    public Pv0 d2;
    public final boolean xa0;
    public final boolean Qg0;
    public C8 Ep;

    public FloatingPumpkinParticleObject(ut_0 ut, ParticleManager particleManager, float scale, float period, C8 position, boolean inverted) {
        super(ut, "PumpkinObject", scale, null);
        this.eB(true);
        this.xa0 = true;
        this.Ep = position;
        this.Qg0 = inverted;
        ((Xz0) super.ZE0.get(0)).Fc0.mf0(scale, scale, scale);

        if (inverted) {
            float x = position.x;
            float y = -position.y;
            float z = position.z;
            this.Ep = new C8(x, y, z);
            this.M10 = true;
        }

        this.a8();
        float brightness = 1.0f;
        if (inverted) {
            brightness = 0.25f;
            BM bm0 = (BM) super.Y3.get(0);
            PRN_ prn0 = new PRN_(PRN_.Ly, new Color(0.45250002f, 0.45250002f, 0.45250002f, 0.1f));
            this.Nf = prn0;
            bm0.LPT8(prn0);
        }

        BM bm1 = (BM) super.Y3.get(1);
        PRN_ prn1 = new PRN_(PRN_.sI, Color.ORANGE.cpy().mul(brightness * 0.2f));
        this.YF = prn1;
        bm1.LPT8(prn1);

        BM bm2 = (BM) super.Y3.get(1);
        PRN_ prn2 = new PRN_(PRN_.xE, new Color(brightness * 0.21f + 0.6f, brightness * 0.21f + 0.6f, brightness * 0.21f + 0.6f, 0.1f));
        this.Nf = prn2;
        bm2.LPT8(prn2);

        this.xV = rg0_2.j40(3000, 5000);
        this.kg = period;
    }

    @Override
    public void v3(float delta, float ignored) {
        if (this.Qg0) {
            super.ho.CN(C8.X, -180.0f);
            super.ho.tO(C8.Y, 180.0f);
        }

        C8 target = tV;
        tV.np(this.Ep);
        if (this.xa0) {
            float progress = this.SH0 / this.kg;
            if (this.M10) {
                progress = 1.0f - progress;
            }

            float curved = by_0.pF0.F0(progress);
            target.y += curved * 0.75f;
        }

        super.ho.Y1(target);
        float dt = lg_0.S4.uL;
        this.fX += dt;
        this.SH0 += dt;
        if (this.SH0 > this.kg) {
            this.SH0 = 0.0f;
            this.M10 ^= true;
        }

        if (this.fX >= (float) this.xV / 1000.0f) {
            this.fX = 0.0f;
            this.xV = rg0_2.j40(1000, 2500);
        }

        Pv0 season = Pv0.Vd;
        if (Pv0.Vd != this.d2) {
            this.d2 = season;
            ((BM) super.Y3.get(1)).LPT8(this.Nf);
        }

        float glow = this.fX * 1000.0f / (float) this.xV;
        if (glow > 0.5f) {
            glow = 1.0f - glow;
        }

        Color white = Color.WHITE;
        float r = white.r * glow * 0.5f;
        float g = white.g * glow * 0.5f;
        this.YF.v50.set(r, g, white.b * glow * 0.5f, 1.0f);
        this.Nf.v50.set(glow * 0.25f + 0.55f, glow * 0.25f + 0.55f, glow * 0.25f + 0.55f, 0.1f);
    }

    @Override
    public void O4() {
    }
}
