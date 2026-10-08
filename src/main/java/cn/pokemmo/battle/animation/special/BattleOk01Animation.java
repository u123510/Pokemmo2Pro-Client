package cn.pokemmo.battle.animation.special;

import f.*;

import aurelienribon.tweenengine.equations.Bounce;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleOk01Animation
 * 原始类: f.ok0_1
 */
public class BattleOk01Animation extends MU {
    public static final C8 ry;
    public final PF gc;
    public final int cu;
    public final int Z4;
    public lc_0 Mt;

    static {
        ry = new C8();
    }

    public BattleOk01Animation(PF var1, int var2, int var3) {
        super(var1);
        this.gc = var1;
        this.cu = var2;
        this.Z4 = var3;
    }

    public static void vt0(int var0, D2 var1) {
        tw0_0.RE0.SA0((byte) 2, (short) 1304);
        tw0_0.RE0.BK0(false);
    }

    @Override
    public final boolean Bv0(boolean var1) {
        return false;
    }

    public final void hi(int var1, D2 var2) {
        if (this.Vs != null) {
            this.Vs.A6.remove(this.Mt);
        }
    }

    public void oO(int var1, D2 var2) {
        this.Mt.Fs("open");
    }

    public void Ml0(int var1, D2 var2) {
        this.Mt.Fs("shake1");
    }

    public void cy0(int var1, D2 var2) {
        this.Mt.Fs("shake2");
    }

    public void nt(int var1, D2 var2) {
        this.Mt.Fs("shake1");
    }

    public void ot0(int var1, D2 var2) {
        this.Mt.Fs("stop");
    }

    public void ed(int var1, D2 var2) {
        this.Mt.Fs("spin");
    }

    public void com1(int var1, D2 var2) {
        this.Mt.Fs("stop");
    }

    public void mF(int var1, D2 var2) {
        this.Mt.Fs("open");
    }

    @Override
    public final MU us() {
        p_0 spin = this.Vs.hB0.LP(4, this.cu);
        p_0 open = new p_0(0.1f, new LPT6_[] { this.Vs.hB0.Qn(this.cu)[10] });
        open.kK0 = OI0.MW;
        this.Mt = lc_0.ju0(open);
        this.Mt.iZ("spin", spin);
        this.Mt.iZ("shake1", this.Vs.hB0.LP(1, this.cu));
        this.Mt.iZ("shake2", this.Vs.hB0.LP(2, this.cu));
        this.Mt.iZ("shake3", this.Vs.hB0.LP(3, this.cu));
        this.Mt.iZ("stop", this.Vs.hB0.LP(0, this.cu));
        this.Mt.iZ("open", open);

        BJ0 fa = this.Vs.FA;
        com3__3[] br0 = this.gc.Br0;
        C8 targetPos = T3.hf(this.gc.LpT9.j, this.gc.LpT9.j);
        this.Vs.A6.add(this.Mt);

        this.E8 = pw_1.xC().Xf0()
            .y80(ao_1.DX(fa, 4, 0.5f).kt(vr_1.SG0.x, vr_1.SG0.y, vr_1.SG0.z))
            .y80(ao_1.DX(fa, 9, 0.5f).kt(vr_1.Lt.x, vr_1.Lt.y, vr_1.Lt.z))
            .mz0();

        C8 ms = vr_1.MS;
        C8[] points = new C8[] {
            new C8(ms.x, ms.y + 0.75f, ms.z + 1.0f),
            new C8(ms.x, ms.y + 0.5f, ms.z + 1.0f),
            new C8(ms.x + 0.5f, ms.y + 1.0f, ms.z - 2.0f),
            new C8(targetPos.x + 0.05f, targetPos.y, targetPos.z + 0.1f),
            new C8(targetPos.x + 0.05f, targetPos.y, targetPos.z + 0.1f)
        };
        tl_0 path = new tl_0(points, false);

        pw_1 arc = this.E8.TD0();
        arc.y80(MU.eK0((short) 1382, true));
        for (float t = 0.0f; t < 1.0f; t += 0.01f) {
            path.HB0(ry, t);
            arc.y80(ao_1.DX(this.Mt, 4, 0.005f).kt(ry.x, ry.y, ry.z));
        }
        arc.mz0();

        this.E8.p1(-0.25f).Xf0()
            .y80(ao_1.DX(fa, 4, 0.25f).kt(targetPos.x, targetPos.y + 0.5f, targetPos.z + 1.0f))
            .y80(ao_1.DX(fa, 9, 0.25f).kt(targetPos.x - 0.5f, targetPos.y - 1.0f, targetPos.z - 1.0f))
            .mz0()
            .y80(ao_1.pc((i, d) -> this.mF(i, d)))
            .y80(MU.eK0((short) 1383, false));

        this.E8.TD0().Xf0();
        for (int i = 0; i < br0.length; ++i) {
            com3__3 c = br0[i];
            this.E8.y80(ao_1.yp(10, c).Om0(new float[] { 1.0f, 1.0f, 1.0f, 0.0f }));
            this.E8.y80(ao_1.yp(7, c).UD(1.0f, 1.0f));
            this.E8.Xf0();
            ao_1 a11 = ao_1.DX(c, 11, 0.2f);
            a11.h5[0] = 1.0f;
            this.E8.y80(a11);
            this.E8.y80(ao_1.DX(c, 7, 0.5f).UD(0.0f, 0.0f));
            this.E8.mz0();
        }

        this.E8.y80(ao_1.DX(this.Mt, 7, 0.5f).UD(1.0f, 1.1f)).mz0();
        this.E8.y80(ao_1.DX(this.Mt, 7, 0.5f).UD(1.0f, 1.0f))
            .y80(ao_1.pc((i, d) -> this.com1(i, d)))
            .mz0()
            .p1(0.25f)
            .y80(ao_1.pc((i, d) -> this.ed(i, d)))
            .y80(MU.eK0((short) 1385, false));

        ao_1 bounceTween = ao_1.DX(this.Mt, 4, 1.0f).kt(targetPos.x + 0.05f, targetPos.y - 0.35f, targetPos.z + 0.1f);
        bounceTween.Yn = Bounce.OUT;
        this.E8.y80(bounceTween);
        this.E8.p1(-0.2f)
            .y80(ao_1.pc((i, d) -> this.ot0(i, d)))
            .p1(0.2f);

        if (this.Z4 > 0) {
            this.E8.p1(0.5f)
                .y80(MU.eK0((short) 1384, false))
                .y80(ao_1.pc((i, d) -> this.nt(i, d)))
                .p1(0.75f);
        }

        if (this.Z4 > 1) {
            this.E8.p1(0.5f)
                .y80(MU.eK0((short) 1384, false))
                .y80(ao_1.pc((i, d) -> this.cy0(i, d)))
                .p1(0.75f);
        }

        if (this.Z4 > 2) {
            this.E8.p1(0.5f)
                .y80(MU.eK0((short) 1384, false))
                .y80(ao_1.pc((i, d) -> this.Ml0(i, d)))
                .p1(0.75f);
        }

        if (this.Z4 < 4) {
            this.E8.p1(0.5f)
                .y80(MU.eK0((short) 1383, false))
                .TD0()
                .y80(ao_1.pc((i, d) -> this.oO(i, d)))
                .Xf0();
            for (int i = 0; i < br0.length; ++i) {
                com3__3 c = br0[i];
                C8 j = c.j;
                this.E8.y80(ao_1.yp(4, c).kt(j.x, j.y - 0.5f, j.z));
                this.E8.Xf0();
                ao_1 a11 = ao_1.DX(c, 11, 1.0f);
                a11.h5[0] = 0.0f;
                this.E8.y80(a11);
                this.E8.y80(ao_1.DX(c, 7, 0.5f).UD(1.0f, 1.0f));
                this.E8.y80(ao_1.DX(c, 4, 0.5f).kt(j.x, j.y, j.z));
                this.E8.mz0();
            }
            this.E8.mz0()
                .p1(-0.5f)
                .y80(ao_1.DX(this.Mt, 7, 0.01f).UD(0.0f, 0.0f))
                .mz0();
        } else {
            this.E8.y80(MU.eK0((short) 1396, false))
                .TD0()
                .y80(ao_1.yp(8, this.Mt).Om0(new float[] { 0.0f, 0.0f, 0.0f, 0.0f }))
                .y80(ao_1.DX(this.Mt, 8, 0.2f).Om0(new float[] { 0.0f, 0.0f, 0.0f, 0.6f }))
                .mz0()
                .y80(ao_1.pc((i, d) -> vt0(i, d)));
        }

        pw_1 camFollow = this.E8.p1(1.0f).Xf0();
        float durCam = this.Z4 == 4 ? 1.5f : 0.5f;
        camFollow.y80(ao_1.DX(fa, 4, durCam).kt(vr_1.SG0.x, vr_1.SG0.y, vr_1.SG0.z));
        float durCam2 = this.Z4 == 4 ? 1.5f : 0.5f;
        camFollow.y80(ao_1.DX(fa, 9, durCam2).kt(vr_1.Lt.x, vr_1.Lt.y, vr_1.Lt.z));
        camFollow.mz0();

        this.E8.y80(ao_1.pc((i, d) -> this.hi(i, d)));
        this.E8.Ms(this.Vs.wP);
        this.Vc();
        return this;
    }
}
