package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

public class ItemSpriteLabel extends BaseLabel {
    public final E90 goto$;
    public final Mm fq;
    public final int dA;
    public final cd0_2 hE;

    public ItemSpriteLabel(String text, int index, E90 sprite) {
        super(text);
        this.uf("spritelabel");
        if (sprite == null) {
            this.goto$ = tw0_0.e60.at();
        } else {
            this.goto$ = sprite;
        }
        Mm value = new Mm(this, sprite);
        this.fq = value;
        value.CF0(index);
        this.dA = index;
        this.hE = null;
    }

    public ItemSpriteLabel(String text, int index, cd0_2 data) {
        super(text);
        this.uf("spritelabel");
        this.hE = data;
        Mm value = new Mm(this, data);
        this.fq = value;
        value.CF0(index);
        this.dA = index;
        this.goto$ = null;
    }

    @Override
    public final void uA0(Jn0 style) {
        ux0_0 border = (ux0_0) ((LC0) style).N30("border", false, ux0_0.class, null);
        if (border == null) {
            return;
        }
        this.vi(border.aP, border.ZK0 + this.dA * 20, border.W30, border.Ar0);
    }

    @Override
    public final void lt0() {
        int width = this.m0();
        int x = le0_2.du0(this.R1(), width, this.Ya0);
        int height = this.rm0();
        int y = le0_2.du0(this.Se(), height, this.G4);
        this.oY(x, y);
        this.Iu();
    }

    @Override
    public final void Dw0(zk0_1 window) {
        if (this.goto$ == null && this.hE == null) {
            return;
        }
        int x = (this.dA - 1) * -16 - 12;
        int y = (this.dA - 1) * -10 - 12;
        this.fq.Vd0(x, y);
    }
}
