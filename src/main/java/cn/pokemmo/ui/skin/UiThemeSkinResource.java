package cn.pokemmo.ui.skin;

import com.badlogic.gdx.graphics.Color;
import f.*;

/**
 * 现代化重构类 - 原始类: f.vj_0
 */
public abstract class UiThemeSkinResource implements fy0_0 {

    public final es_1 ym0;
    public final boolean Hd;
    public boolean bb0;
    public boolean Uj;
    public float ru0;
    public float Qj;
    public boolean I9;
    public boolean d9;
    public Runnable zM;
    public final boolean wU;
    public PRN_ UF;
    public BJ0 fC0;
    public U5 BH;
    public ER OB0;
    public ii0_1 cn;
    public final boolean dm;
    public ql_0 u3;
    public int Rh;
    public int rW;
    public int ED0;
    public int bA0;
    public final Color I0;

    public UiThemeSkinResource(boolean dm) {
        this.ym0 = new es_1();
        this.Hd = true;
        this.I0 = new Color(0.0f, 0.0f, 0.0f, 1.0f);
        this.dm = dm;
        this.wU = true;
    }

    public ux_1 CoM5() {
        JA ja = new JA(bn0_0.DK0(), bn0_0.Rn0(), null);
        ja.el = 32;
        return new bn0_0(ja, null);
    }

    public boolean je0(i70_0 v1) {
        return false;
    }

    public void IZ() {
        this.cn = new ii0_1();
        if (this.wU) {
            this.fC0 = new BJ0();
            (this.BH = new U5()).LPT8(this.UF = new PRN_(PRN_.xE, 1.0f, 1.0f, 1.0f, 1.0f));
            ER er = new ER(CoM5(), new Ky0());
            this.OB0 = er;
            this.ym0.Ue0(er);
        }
    }

    public void LPt6(int width, int height) {
        if (!this.dm) {
            if (tw0_0.kz0()) {
                this.bA0 = width;
                this.ED0 = height;
                this.Rh = 0;
                this.rW = 0;
            } else {
                fc0_2.q70(dw_2.c10, false);
                this.bA0 = fc0_2.YQ;
                int h = fc0_2.On0;
                this.ED0 = h;
                int x = (width - fc0_2.YQ) / 2;
                this.Rh = x;
                this.rW = height - h - 50;
            }
            if (this.u3 == null) {
                this.u3 = new ql_0(this.Rh, this.rW, this.bA0, this.ED0);
            } else {
                this.u3.j80 = this.Rh;
                this.u3.Wm0 = this.rW;
                this.u3.IA = this.bA0;
                this.u3.Eu0 = this.ED0;
            }
        } else {
            this.bA0 = width;
            this.ED0 = height;
        }
        if (this.wU) {
            this.fC0.Ui = this.bA0;
            this.fC0.yG = this.ED0;
            this.fC0.ye(true);
        }
    }

    public final void LPt1() {
        if (!this.Uj) {
            IZ();
            ux();
            this.Uj = true;
            this.I9 = true;
            this.Qj = 0.0f;
            this.ru0 = 0.0f;
            gf0();
        }
        update();
        if (!this.dm) {
            CI0.r40(this.Rh, this.rW, this.bA0, this.ED0);
            PH.Sj(this.u3);
        }
        lg_0.OH0.glClearColor(this.I0.r, this.I0.g, this.I0.b, this.I0.a);
        lg_0.OH0.glClear(16640);
        if (this.wU) {
            this.OB0.jK(this.fC0);
        }
        i5();
        if (this.wU) {
            this.OB0.end();
        }
        if (!this.dm) {
            if ((PH.Kz0.KB != 0 ? (ql_0) PH.Kz0.GH0() : null) != null) {
                PH.eF();
            }
            CI0.r40(0, 0, lg_0.S4.Kr0(), lg_0.S4.sD0());
        }
    }

    public abstract void i5();

    public abstract boolean Lpt1();

    public void ux() {
    }

    public boolean zr0() {
        return this instanceof ys_2;
    }

    public void update() {
        if (this.bb0) {
            return;
        }
        if (Lpt1()) {
            if (!this.bb0) {
                this.bb0 = true;
                c80();
            }
            if (zr0()) {
                BU.T50.Ll(true);
            }
            dispose();
            if (this.zM != null) {
                this.zM.run();
            }
            return;
        }
        if (this.I9) {
            float delta = lg_0.S4.uL;
            this.Qj = delta;
            this.ru0 += delta;
        }
        if (this.ru0 < 0.0f) {
            this.ru0 = 0.0f;
        }
        if (this.ru0 >= 3.4028235E38f) {
            this.ru0 = 0.0f;
        }
        this.cn.D70(this.Qj);
    }

    public void gf0() {
        this.ru0 = 0.0f;
        this.I9 = true;
        this.bb0 = false;
        if (zr0()) {
            BU.T50.Ll(false);
        }
    }

    public void c80() {
        if (this.d9) {
            iw_1 iw = tw0_0.FL.Py0();
            if (iw != null) {
                iw.wQ();
            }
        }
        tw0_0.RE0.qq();
    }

    public void dispose() {
        I2 it = this.ym0.ZD();
        while (it.hasNext()) {
            ((fy0_0) it.next()).dispose();
        }
        this.ym0.clear();
    }
}
