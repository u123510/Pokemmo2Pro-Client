package cn.pokemmo.graphics.render;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Matrix4;
import f.*;

/**
 * 现代化重构类 - 原始类: f.wa_1
 */
public class ShapeRendererDisposable implements fy0_0 {

    public final o90_0 M80;
    public boolean Fe;
    public final Matrix4 H30;
    public final Matrix4 G;
    public final Matrix4 JD0;
    public final Color bp;
    public ou_0 rU;

    public ShapeRendererDisposable() {
        this(5000);
    }

    public ShapeRendererDisposable(int i1) {
        this(i1, null);
    }

    public ShapeRendererDisposable(int i1, lt_1 lt_1Var) {
        this.Fe = false;
        Matrix4 matrix4 = new Matrix4();
        this.H30 = matrix4;
        this.G = new Matrix4();
        this.JD0 = new Matrix4();
        new Bp0();
        this.bp = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        if (lt_1Var == null) {
            this.M80 = new o90_0(i1, false, true, 0);
        } else {
            this.M80 = new o90_0(i1, false, true, 0, lt_1Var);
        }
        matrix4.BI((float) lg_0.S4.Kr0(), (float) lg_0.S4.sD0());
        this.Fe = true;
    }

    public final void hM(ou_0 ou_0Var) {
        if (this.rU != null) {
            throw new IllegalStateException("Call end() before beginning a new shape batch.");
        }
        this.rU = ou_0Var;
        if (this.Fe) {
            this.H30.getClass();
            this.JD0.Dd0(this.H30.EW);
            Matrix4.md0(this.JD0.EW, this.G.EW);
            this.Fe = false;
        }
        this.M80.Cv.getClass();
        this.M80.Cv.Dd0(this.JD0.EW);
        this.M80.cy = this.rU.GQ;
    }

    public final void rr0(ou_0 ou_0Var, ou_0 ou_0Var2, int i3) {
        ou_0 current = this.rU;
        if (current == null) {
            throw new IllegalStateException("begin must be called first.");
        }
        if (current != ou_0Var && current != ou_0Var2) {
            if (ou_0Var2 == null) {
                throw new IllegalStateException("Must call begin(ShapeType." + ou_0Var + ").");
            }
            throw new IllegalStateException("Must call begin(ShapeType." + ou_0Var + ") or begin(ShapeType." + ou_0Var2 + ").");
        }
        if (this.Fe) {
            end();
            hM(current);
        } else if (this.M80.SK0 - this.M80.hU < i3) {
            end();
            hM(current);
        }
    }

    public final void end() {
        o90_0 o90 = this.M80;
        if (o90.hU != 0) {
            lt_1 hq = o90.HQ;
            hq.getClass();
            lg_0.Sf0.glUseProgram(hq.lH);
            lg_0.Sf0.glUniformMatrix4fv(o90.HQ.WD0("u_projModelView", lt_1.Ln0), 1, false, o90.Cv.EW, 0);
            for (int i = 0; i < o90.Il; i++) {
                o90.HQ.WI();
                lg_0.Sf0.glUniform1i(o90.HQ.WD0(o90.f50[i], lt_1.Ln0), i);
            }
            o90.wv0.COM6.ce0(0, o90.up, o90.XL0);
            int count = o90.wv0.Sw0.Kd() > 0 ? o90.wv0.Sw0.Id() : o90.wv0.COM6.mB0();
            o90.wv0.zm(o90.HQ, o90.cy, 0, count, o90.wv0.uf);
            o90.up = 0;
            o90.hU = 0;
        }
        this.rU = null;
    }

    @Override
    public final void dispose() {
        if (this.M80.CoM7 && this.M80.HQ != null) {
            this.M80.HQ.dispose();
        }
        this.M80.wv0.dispose();
    }
}
