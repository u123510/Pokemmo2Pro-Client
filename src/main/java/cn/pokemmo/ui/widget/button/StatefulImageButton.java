package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public class StatefulImageButton extends BaseButton {
    public int rn = -1;
    public int Mb0 = -1;
    public final Br0 og;
    public boolean iy0;

    public StatefulImageButton() { this(-1, -1, 0); }
    public StatefulImageButton(LPT6_ var1, float var2) {
        this(-1, -1, 0);
        this.JH().r8(new LPT6_[]{var1});
        this.JH().dA(var2);
        this.RF();
    }
    public StatefulImageButton(int var1, int var2) { this(var1, var2, 0); }
    public StatefulImageButton(int var1, int var2, int unused) {
        super("");
        this.og = new Br0(this);
        this.iy0 = true;
        this.uf("spritelabel");
        this.VA(var1, var2);
    }
    public final Br0 JH() { return this.og; }
    public final boolean hi0() { return this.eE && this.og.yH0() > 0 && this.og.De0() > 0; }
    @Override public final void a80(Jn0 var1) { if (this.Mb0 <= -1 || this.rn <= -1) super.a80(var1); }
    @Override public final void el0(Jn0 var1) { }
    @Override public final void Kz0(Jn0 var1) { if (this.Mb0 <= -1 || this.rn <= -1) super.Kz0(var1); }
    @Override public final int R1() { return this.Mb0 > -1 && this.rn > -1 ? this.rn : super.R1(); }
    @Override public final int Se() { return this.Mb0 > -1 && this.rn > -1 ? this.Mb0 : super.Se(); }
    public final void VA(int var1, int var2) {
        this.rn = var1;
        this.Mb0 = var2;
        if (var2 > -1 && var1 > -1) {
            this.RY(var1, var2);
            this.g2(var1, var2);
            this.oY(var1, var2);
        }
    }
    public final void RF() { this.VA(this.og.De0(), this.og.yH0()); }
    @Override public void K8() {
        if (this.Mb0 > -1 && this.rn > -1) {
            this.RY(this.rn, this.Mb0);
            this.g2(this.rn, this.Mb0);
            this.oY(this.rn, this.Mb0);
        }
    }
    @Override public final void Dw0(zk0_1 var1) { if (this.iy0) this.og.t00(); }
}
