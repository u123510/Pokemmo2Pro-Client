package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

public class TextureSpriteButton extends BaseButton {
    public final int Qr0;
    public final int Im;
    public final Mm J60;

    public TextureSpriteButton(int width, int height, cd0_2 image) {
        super();
        this.uf("spritelabel");
        this.Qr0 = width;
        this.Im = height;
        if (width > 0 && height > 0) {
            this.RY(width, height);
            this.g2(width, height);
            this.oY(width, height);
        }
        this.J60 = new Mm(this, image);
        this.J60.zc();
        this.J60.CF0(1);
    }

    public TextureSpriteButton(int width, int height, E90 image) {
        super();
        this.uf("spritelabel");
        this.Qr0 = width;
        this.Im = height;
        if (width > 0 && height > 0) {
            this.RY(width, height);
            this.g2(width, height);
            this.oY(width, height);
        }
        this.J60 = new Mm(this, image);
        this.J60.zc();
        this.J60.CF0(1);
    }

    public final void Te0(int width, int height) {
        this.J60.Si = width;
        this.J60.Zx0 = height;
    }

    public final void VL0(int value) {
        this.J60.Ta = value;
    }

    public final void a80(Jn0 context) {
        if (this.Qr0 > 0 && this.Im > 0) {
            return;
        }
        super.a80(context);
    }

    public final void el0(Jn0 context) {
        if (this.Qr0 > 0 && this.Im > 0) {
            return;
        }
        super.el0(context);
    }

    public final void Kz0(Jn0 context) {
        if (this.Qr0 > 0 && this.Im > 0) {
            return;
        }
        super.Kz0(context);
    }

    public final int R1() {
        if (this.Qr0 > 0) {
            return this.Qr0;
        }
        return super.R1();
    }

    public final int Se() {
        if (this.Im > 0) {
            return this.Im;
        }
        return super.Se();
    }

    public final void K8() {
        if (this.Qr0 <= 0 || this.Im <= 0) {
            return;
        }
        this.RY(this.Qr0, this.Im);
        this.g2(this.Qr0, this.Im);
        this.oY(this.Qr0, this.Im);
    }

    public final void iB(boolean enabled) {
        if (!enabled) {
            gn_0 color = new gn_0((byte) 99, (byte) 99, (byte) 99, (byte) -1);
            t5_0 wrapper = new t5_0(this);
            N1 behavior = new N1(wrapper, color);
            this.z70 = behavior;
        } else {
            this.z70 = null;
        }
    }

    public final int Pk(boolean value) {
        return super.Pk(value) + 44;
    }

    public final void Dw0(zk0_1 context) {
        this.J60.Vd0(this.J60.Si, this.J60.Zx0);
    }
}
