package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class CharacterCreationPreviewComponent extends BaseComponent {
    public static f.tt0_0 j0;
    public final UV d6;
    public final R90 Z20;
    public final tk0_0 b20;
    public final es_1 Ol;
    public wt_0 G2;
    public final tk0_0 ix0;
    public le0_2 Mu;

    public CharacterCreationPreviewComponent() {
        super();
        this.Ol = new es_1(4);
        this.uf("debugui");

        vo_2 scene = tw0_0.LD0.wL();
        if (scene == null) {
            this.d6 = null;
            this.Z20 = null;
            this.ix0 = null;
            this.b20 = null;
            return;
        }

        scene.vT();
        this.d6 = new UV();
        this.Z20 = new R90();
        this.Oq0(false);

        this.ix0 = new tk0_0();
        this.ix0.uf("topmenu");

        xe_1 view = new xe_1("View");
        view.RR(() -> this.Km(view));
        this.ix0.Xf0(view).Wa0();

        xe_1 debugOptions = new xe_1("Debug Options");
        this.ix0.Xf0(debugOptions).Wa0();
        debugOptions.RR(() -> this.mc(debugOptions));

        xe_1 cameraOptions = new xe_1("Camera Options");
        this.ix0.Xf0(cameraOptions).Wa0().dw0();

        xe_1 debugTools = new xe_1("Debug Tools");
        debugTools.RR(() -> this.nC0(debugTools));
        this.ix0.Xf0(debugTools).Wa0().dw0();

        this.d6.Hy("");
        this.Z20.Hy("");
        this.d6.uf("left-panel");
        this.Z20.uf("right-panel");

        this.b20 = new tk0_0();
        lo0_0 content = new lo0_0(this.b20);
        content.M60();
        content.Qs0(2);
        this.Z20.SL(content);

        this.d6.ff0(2);
        this.Z20.ff0(2);
        this.SL(this.ix0);
        this.SL(this.d6);
        this.SL(this.Z20);
        j0 = (f.tt0_0)(Object)this;
    }

    public static boolean C7() {
        return j0 != null;
    }

    public static void av0() {
        if (nv0_0.dc) {
            nv0_0.dc = false;
            Qy0.yI0.dk(-1, "OW Animation Load enabled");
        } else {
            nv0_0.dc = true;
            Qy0.yI0.dk(-1, "OW Animation Load disabled");
        }
    }

    public static void de0() {
        if (nv0_0.cOm2) {
            nv0_0.cOm2 = false;
            Qy0.yI0.dk(-1, "Frustum rendering enabled");
        } else {
            nv0_0.cOm2 = true;
            Qy0.yI0.dk(-1, "Frustum rendering disabled");
        }
    }

    public final void nC0(xe_1 button) {
        EP menu = new EP();
        menu.mA0("Stop World Animations", this::wa);
        menu.mA0("Play World Animations", this::Pk);
        UA.CI0(menu, button);
    }

    public final void mc(xe_1 button) {
        EP menu = new EP();
        menu.mA0("Vector3", this::lPT1);
        menu.mA0("Env Color", this::Ps);
        menu.mA0("Light table", this::h6);
        menu.mA0("Toggle map frustrum", CharacterCreationPreviewComponent::de0);
        menu.mA0("Disable OW Animations", CharacterCreationPreviewComponent::av0);
        UA.CI0(menu, button);
    }

    public final void Ps() {
        vo_2 scene = tw0_0.LD0.Sc;
        if (scene instanceof L00) {
            L00 renderer = (L00) scene;
            vp0_0 panel = new vp0_0(renderer.aD0.l0);
            this.F9(this.fU(), panel);
        }
    }

    public final void Km(xe_1 button) {
        EP menu = new EP();
        EP permissions = new EP("Permission Settings");
        menu.hx.add(permissions);
        permissions.mA0("Disable", this::z40);
        permissions.mA0("View", this::lPT7);
        permissions.mA0("View All Permissions", this::P3);
        UA.CI0(menu, button);
    }

    public final void P3() {
        this.M70(1);
    }

    public final void lPT1() {
        vp0_0 panel = new vp0_0();
        this.F9(this.fU(), panel);
    }

    public final void wa() {
        vo_2 scene = tw0_0.LD0.Sc;
        // These debug actions can be invoked before the scene animation list is initialized.
        if (scene == null || scene.qf == null) {
            return;
        }

        I2 iterator = scene.qf.ZD();
        while (iterator.hasNext()) {
            nv0_0 animation = (nv0_0) iterator.next();
            animation.wp0.EG();
        }
    }

    public final void Pk() {
        vo_2 scene = tw0_0.LD0.Sc;
        if (scene == null || scene.qf == null) {
            return;
        }

        I2 iterator = scene.qf.ZD();
        while (iterator.hasNext()) {
            nv0_0 animation = (nv0_0) iterator.next();
            animation.wp0.TI(true);
        }
    }

    public final void M70(int mode) {
        UV panel = this.d6;
        es_1 permissionRows = panel.v8;
        if (permissionRows.KB > 0) {
            I2 iterator = permissionRows.ZD();
            while (iterator.hasNext()) {
                GG row = (GG) iterator.next();
                panel.Im0.u3(row.LpT4);
            }
            panel.v8.clear();
            Qy0.yI0.u3(panel.Im0);
        }

        panel.Im0 = new le0_2(null, false);
        panel.Im0.uf("permContainer");
        Qy0.yI0.F9(Qy0.yI0.fU(), panel.Im0);

        if (tw0_0.e60.N60() instanceof XF0) {
            XF0 world = (XF0) tw0_0.e60.N60();
            C8 position = tw0_0.e60.jB0.il0.t60;
            wa0_2 origin = world.i80;
            int centerX = (int) ((position.x - origin.Iz0) / (float) world.yd);
            int centerY = (int) ((position.y - origin.Ig) / (float) world.ie);

            for (int mapX = centerX - 1; mapX <= centerX + 1; ++mapX) {
                for (int mapY = centerY - 1; mapY <= centerY + 1; ++mapY) {
                    bm_1 tile = world.gg(mapX, mapY);
                    if (tile == null || tile.D4().length < 1) {
                        continue;
                    }

                    int levelCount = tile.D4().length;
                    ab0_2 dimensions = (ab0_2) tile;
                    int width = dimensions.qB0;
                    int height = dimensions.N70;
                    for (byte level = 0; level < levelCount; level = (byte) (level + 1)) {
                        for (short x = 0; x < width; x = (short) (x + 1)) {
                            for (short y = 0; y < height; y = (short) (y + 1)) {
                                Ll0 value = tile.n5(level, x, y);
                                if (value == null || value.rK0() || value.re() == 0) {
                                    continue;
                                }
                                if (mode == 0 && value.S80() == -10.0F) {
                                    continue;
                                }

                                GG row = new GG(panel, value);
                                panel.v8.Ue0(row);
                                panel.Im0.F9(panel.Im0.fU(), row.LpT4);
                                row.LpT4.lt0();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void z40() {
        UV panel = this.d6;
        I2 iterator = panel.v8.ZD();
        while (iterator.hasNext()) {
            GG row = (GG) iterator.next();
            panel.Im0.u3(row.LpT4);
        }
        panel.v8.clear();
        Qy0.yI0.u3(panel.Im0);
    }

    public final boolean nd0(i70_0 event) {
        if (E00.C10(event.zu) && (event.nA0 == 0 || event.nA0 == 1)) {
            int x = event.f8;
            UV leftPanel = this.d6;
            if (x > leftPanel.A20 + leftPanel.Mx && x < this.Z20.A20) {
                KU children = this.t30;
                if (children != null) {
                    I2 iterator = children.ZD();
                    while (iterator.hasNext()) {
                        le0_2 child = (le0_2) iterator.next();
                        if (child.Of()) {
                            child.f00();
                        }
                    }
                }
            }
        }
        return super.nd0(event);
    }

    public final void DP(BM value, Ou0 animation, int first, int second, int third) {
        if (this.G2 != null) {
            le0_2 selected = this.Mu;
            if (selected != null) {
                this.Ol.sj0(selected, true);
            }
            this.Mu = null;
            this.n90();
            this.G2.vl.fR(PRN_.Ly);
            this.G2.dispose();
            this.Ol.sj0(this.G2, true);
        }

        this.G2 = new wt_0(value, animation, first, second, third);
        this.Ol.Ue0(this.G2);
        this.n90();
    }

    public final void n90() {
        A40 table = this.b20.gg0;
        table.OO();
        ((tk0_0) table.Op).COm3();

        I2 iterator = this.Ol.ZD();
        while (iterator.hasNext()) {
            le0_2 child = (le0_2) iterator.next();
            j1_0 cell = table.vx0(child).NA().Wa0();
            cell.Hb0 = Integer.valueOf(1);
            cell.rs0 = Float.valueOf(1.0F);
            cell.Rr0.Rg();
        }
    }

    public final void K8() {
        this.kh0();
        this.ix0.Iu();
        this.ix0.lt0();

        pa0_0 leftAlignment = pa0_0.qQ;
        this.ix0.vf(leftAlignment);
        this.d6.RY(535, lg_0.S4.sD0() - (this.ix0.SB0 + this.ix0.OB));
        this.d6.g2(700, lg_0.S4.sD0() - (this.ix0.SB0 + this.ix0.OB));
        this.Z20.RY(340, lg_0.S4.sD0() - (this.ix0.SB0 + this.ix0.OB));
        this.Z20.g2(700, lg_0.S4.sD0() - (this.ix0.SB0 + this.ix0.OB));
        this.d6.lt0();
        this.Z20.lt0();
        this.d6.A20(leftAlignment, 0, this.ix0.SB0 + this.ix0.OB);
        this.Z20.A20(pa0_0.Mk, 0, this.ix0.SB0 + this.ix0.OB);
    }

    public final int yJ() {
        return this.d6.Mx + this.Z20.Mx;
    }

    public final int Dn0() {
        return this.ix0.SB0 + this.ix0.OB;
    }

    public final void h6() {
        qg_0 panel = new qg_0();
        this.F9(this.fU(), panel);
    }

    public final void lPT7() {
        this.M70(0);
    }
}
