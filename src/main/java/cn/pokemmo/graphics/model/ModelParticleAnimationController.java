package cn.pokemmo.graphics.model;

import f.*;

public class ModelParticleAnimationController extends ModelNodeTransformController {
    public final ur0_0 fn0;
    public PG mH0;
    public PG hb;
    public float XL0;
    public PG WL0;
    public float us0;
    public float ab;
    public boolean sF;
    public boolean RU;

    public ModelParticleAnimationController(cn.pokemmo.graphics.gdx.model.GdxModelInstance v1) {
        super(v1);
        this.fn0 = new ur0_0();
        this.RU = false;
    }

    public final void qo(float f1) {
        if (this.WL0 != null) {
            float t = this.us0 + f1;
            this.us0 = t;
            if (t >= this.ab) {
                I2 it = this.WL0.Ul0.jl.ZD();
                while (it.hasNext()) {
                    ((yg0_0) it.next()).Cr.Jq = false;
                }
                this.RU = true;
                this.fn0.free(this.WL0);
                this.WL0 = null;
            }
        }
        if (this.RU) {
            this.iJ0.a8();
            this.RU = false;
        }

        PG current = this.mH0;
        if (current == null || current.DL0 == 0 || current.Ul0 == null) {
            return;
        }

        float delta = f1;
        if (current.DL0 != 0) {
            delta = f1 * current.lK0;
            int loops;
            if (!LW.iF(current.md)) {
                float newTime = current.Ym + delta;
                current.Ym = newTime;
                if (current.lK0 < 0.0f) {
                    float dur = current.md;
                    loops = (int) Math.abs((dur - newTime) / dur);
                    current.Ym = dur - Math.abs(newTime % dur);
                } else {
                    loops = (int) Math.abs(newTime / current.md);
                    current.Ym = Math.abs(current.Ym % current.md);
                }
            } else {
                loops = 1;
            }

            for (int i4 = 0; i4 < loops; i4++) {
                if (current.DL0 > 0) {
                    current.DL0--;
                }
                if (current.DL0 != 0 && current.Lpt3 != null) {
                    current.Lpt3.em();
                }
                if (current.DL0 == 0) {
                    float rem = (float) (loops - 1 - i4) * current.md;
                    float offset = current.md < 0.0f ? current.md - current.Ym : current.Ym;
                    delta = delta + rem + offset;
                    float finalTime = delta;
                    if (finalTime < 0.0f) {
                        finalTime = 0.0f;
                    }
                    current.Ym = finalTime;
                    if (current.Lpt3 != null) {
                        current.Lpt3.lS();
                    }
                    break;
                }
                if (i4 == loops - 1) {
                    delta = -1.0f;
                }
            }
        }

        if (delta >= 0.0f && this.hb != null) {
            PG next = this.hb;
            float trans = this.XL0;
            oa0(next, trans);
            this.hb = null;
            if (delta > 0.0f) {
                qo(delta);
            }
            return;
        }

        if (this.WL0 != null) {
            ji0_2 anim1 = this.WL0.Ul0;
            float time1 = this.WL0.mM + this.WL0.Ym;
            ji0_2 anim2 = this.mH0.Ul0;
            float time2 = this.mH0.mM + this.mH0.Ym;
            float alpha = this.us0 / this.ab;
            if (anim2 == null || alpha == 0.0f) {
                if (this.um) {
                    throw new nf_1("Call end() first");
                }
                Ux0(null, null, 1.0f, anim1, time1);
                this.iJ0.a8();
            } else if (anim1 == null || alpha == 1.0f) {
                if (this.um) {
                    throw new nf_1("Call end() first");
                }
                Ux0(null, null, 1.0f, anim2, time2);
                this.iJ0.a8();
            } else {
                if (this.um) {
                    throw new nf_1("Call end() first");
                }
                this.um = true;
                Ux0(Com5, this.gs, 1.0f, anim1, time1);
                if (!this.um) {
                    throw new nf_1("You must call begin() before adding an animation");
                }
                Ux0(Com5, this.gs, alpha, anim2, time2);
                if (!this.um) {
                    throw new nf_1("You must call begin() first");
                }
                a60_0 it = Com5.lb0();
                while (it.hasNext()) {
                    xn_1 entry = (xn_1) it.next();
                    cd0_0 transform = (cd0_0) entry.kM;
                    ((Xz0) entry.I20).TJ0.oF0(transform.l6, transform.M30, transform.M2);
                    this.gs.free(entry.kM);
                }
                Com5.b20();
                this.iJ0.a8();
                this.um = false;
            }
        } else {
            PG currentAnim = this.mH0;
            ji0_2 anim = currentAnim.Ul0;
            float time = currentAnim.mM + currentAnim.Ym;
            if (this.um) {
                throw new nf_1("Call end() first");
            }
            Ux0(null, null, 1.0f, anim, time);
            this.iJ0.a8();
        }
    }

    public final void oa0(PG v1, float f2) {
        PG current = this.mH0;
        if (current == null || current.DL0 == 0) {
            this.mH0 = v1;
            return;
        }
        if (!this.sF && v1 != null && current.Ul0 == v1.Ul0) {
            v1.Ym = current.Ym;
            this.fn0.free(current);
            this.mH0 = v1;
            return;
        }
        if (this.WL0 != null) {
            I2 it = this.WL0.Ul0.jl.ZD();
            while (it.hasNext()) {
                ((yg0_0) it.next()).Cr.Jq = false;
            }
            this.fn0.free(this.WL0);
        }
        this.WL0 = this.mH0;
        this.mH0 = v1;
        this.us0 = 0.0f;
        this.ab = f2;
    }

    public final PG Fe(String v1, int i2, float f3, gw_0 v4) {
        if (v1 == null) {
            return null;
        }
        ji0_2 anim = null;
        for (int i = 0; i < this.iJ0.HZ.KB; i++) {
            ji0_2 a = (ji0_2) this.iJ0.HZ.get(i);
            if (a.Ys0.equals(v1)) {
                anim = a;
                break;
            }
        }
        if (anim == null) {
            throw new nf_1("Unknown animation: ".concat(v1));
        }
        PG pg = (PG) this.fn0.obtain();
        pg.Ul0 = anim;
        pg.Lpt3 = v4;
        pg.DL0 = i2;
        pg.lK0 = f3;
        pg.mM = 0.0f;
        float dur = anim.Oj;
        pg.md = dur;
        pg.Ym = f3 < 0.0f ? dur : 0.0f;
        return pg;
    }
}
