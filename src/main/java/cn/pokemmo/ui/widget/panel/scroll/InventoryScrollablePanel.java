package cn.pokemmo.ui.widget.panel.scroll;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class InventoryScrollablePanel extends BaseScrollablePanel {
    public InventoryScrollablePanel(q10_0 type, short id, o60_0 item, qu_2 owner) {
        super(type, id);
        this.uf("previewwidget");
        this.H3.SU(sm0_0.c0(5843));
        this.H3.RR(new _while((l3_0) (Object) this, item, owner));
        this.x00();
    }

    public final void K8() {
        this.EG.lt0();
        this.lt0();
        this.N80(pa0_0.Ol);
    }

    public final void x00() {
        this.uf("previewwidget");
        fy_2 root = new fy_2();
        this.EG = root;
        this.Co.RR(new oz_0((l3_0) (Object) this));
        this.F9(this.fU(), root);
        root.x40(XN.sA(root, root).Xq(new ya_1[]{
            root.hb(new le0_2[]{this.gI}),
            root.hb(new le0_2[]{this.Va0, this.o80}),
            root.hb(new le0_2[]{this.GF0}),
            root.hb(new le0_2[]{this.extends$}),
            root.C7(new le0_2[]{this.H3, this.Co})
        }));

        Hm0 outer = D5.fE0(root, root);
        ya_1 inner = D5.fE0(root, root).Xq(new ya_1[]{
            root.C7(new le0_2[]{this.Va0}).Ze0().Kn0(this.o80),
            root.C7(new le0_2[]{this.GF0}),
            root.C7(new le0_2[]{this.extends$}),
            root.hb(new le0_2[]{this.H3, this.Co})
        });
        outer.Xq(new ya_1[]{
            new I7(root).Ze0().Kn0(this.gI).Ze0(),
            new I7(root).qd(300).X20(inner),
            root.C7(new le0_2[]{this.GF0}),
            root.C7(new le0_2[]{this.extends$}),
            root.hb(new le0_2[]{this.H3, this.Co})
        });
        this.EG.WQ(outer);
    }
}
