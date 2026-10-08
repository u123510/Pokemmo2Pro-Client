package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

public class DynamicTextLabel extends BaseLabel {
    public int iK;
    public int oY;
    public pa0_0 W3;
    public final Br0 tp0;
    public boolean tx0;
    public boolean Rv0;

    public DynamicTextLabel() {
        this("", 0, 0);
    }

    public DynamicTextLabel(String text) {
        this(text, 0, 0);
    }

    public DynamicTextLabel(int width, int height) {
        this("", width, height);
    }

    public DynamicTextLabel(String text, int width, int height) {
        super(text);
        this.iK = 0;
        this.oY = 0;
        this.tp0 = new Br0(this);
        this.Rv0 = true;
        if (height > 0 && width > 0) {
            this.RY(width, height);
            this.g2(width, height);
            this.oY(width, height);
        }
        this.iK = width;
        this.oY = height;
        this.uf("button");
    }

    public DynamicTextLabel(String text, pa0_0 pa0) {
        super(text);
        this.iK = 0;
        this.oY = 0;
        this.tp0 = new Br0(this);
        this.Rv0 = true;
        this.W3 = pa0;
        this.uf("button");
    }

    public final Br0 sl() {
        return this.tp0;
    }

    @Override
    public final void a80(Jn0 jn0) {
        if (this.oY > 0 && this.iK > 0) {
            return;
        }
        super.a80(jn0);
    }

    @Override
    public final void el0(Jn0 jn0) {
        super.el0(jn0);
    }

    @Override
    public final void Kz0(Jn0 jn0) {
        if (this.oY > 0 && this.iK > 0) {
            return;
        }
        super.Kz0(jn0);
    }

    @Override
    public final int R1() {
        if (this.oY > 0 && this.iK > 0) {
            return this.iK;
        }
        return super.R1();
    }

    @Override
    public final int Se() {
        if (this.oY > 0 && this.iK > 0) {
            return this.oY;
        }
        return super.Se();
    }

    public final void xf0(int width, int height) {
        this.iK = width;
        this.oY = height;
    }

    @Override
    public void K8() {
        if (this.oY > 0 && this.iK > 0) {
            this.RY(this.iK, this.oY);
            this.g2(this.iK, this.oY);
            this.oY(this.iK, this.oY);
        }
        if (this.W3 != null) {
            this.lt0();
            if (this.OB < this.tp0.yH0()) {
                int size = (int) (this.OB * 1.25);
                this.tp0.OA0 = true;
                this.tp0.IF = size;
                this.tp0.gx0 = size;
            }
            int de0_1 = this.tp0.De0();
            int de0_2 = this.tp0.De0();
            int ordinal = this.W3.ordinal();
            if (ordinal == 0) {
                this.tp0.gY = (this.Mx - de0_1) * this.W3.CB0 / 2 + this.e80;
                this.tp0.a4 = (this.OB - de0_2) * this.W3.V4 / 2;
            } else if (ordinal == 2) {
                this.tp0.gY = (this.Mx - de0_1) * this.W3.CB0 / 2 - this.NV;
                this.tp0.a4 = (this.OB - de0_2) * this.W3.V4 / 2;
            } else if (ordinal == 3) {
                this.tp0.gY = (this.Mx - de0_1) * this.W3.CB0 / 2;
                this.tp0.a4 = (this.OB - de0_2) * this.W3.V4 / 2 + this.y9;
            }
        }
    }

    public final int Pk(boolean b) {
        if (this.W3 != null) {
            int ordinal = this.W3.ordinal();
            if (ordinal == 0) {
                if (this.Tb.uf == jh_0.zN) {
                    return super.Pk(b) + this.tp0.De0();
                }
            } else if (ordinal == 2) {
                if (this.Tb.uf == jh_0.dq) {
                    return super.Pk(b) - this.tp0.De0() - this.NV;
                }
            }
        }
        return super.Pk(b);
    }

    @Override
    public void aUX(zk0_1 v1) {
        super.aUX(v1);
        if (this.tx0 && this.Rv0) {
            this.tp0.t00();
        }
    }

    @Override
    public void Dw0(zk0_1 v1) {
        super.Dw0(v1);
        if (!this.tx0 && this.Rv0) {
            this.tp0.t00();
        }
    }
}
