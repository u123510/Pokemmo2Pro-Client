package cn.pokemmo.ui.window.admin;

import f.*;

import com.badlogic.gdx.graphics.Color;

/**
 * 向量与颜色调试窗口
 *
 * 原混淆类: f.vp0_0
 */
public class VectorColorWindow extends R90 {
    public final vp0_0 asBridge() { return (vp0_0) (Object) this; }

    public static final C8 Af = new C8();

    public VectorColorWindow() {
        uf("/resizableframe");
        Pb0(new vn_0(asBridge()));
        tk0_0 tk0_02 = new tk0_0();
        Ay0 ay0 = new Ay0();
        Ay0 ay02 = new Ay0();
        Ay0 ay03 = new Ay0();
        ay0.ld0(vp0_0::ie);
        ay02.ld0(vp0_0::qo);
        ay03.ld0(vp0_0::oE0);
        ay0.tt(-16.0f, 16.0f);
        ay0.yx();
        ay02.tt(-16.0f, 16.0f);
        ay02.yx();
        ay03.tt(-16.0f, 16.0f);
        ay03.yx();
        ay0.Zb0(Af.x);
        ay02.Zb0(Af.y);
        ay03.Zb0(Af.z);
        tk0_02.Xf0(new cn_0("Vector:")).ys0(10.0f).Yt().im0();
        tk0_02.Xf0(ay0).dw0().pK0(5.0f);
        tk0_02.Xf0(ay02).dw0().pK0(5.0f);
        tk0_02.Xf0(ay03).dw0().pK0(5.0f).Xs(5.0f);
        SL(tk0_02);
    }

    public VectorColorWindow(Color color) {
        uf("/resizableframe");
        Pb0(this::xe0);
        tk0_0 tk0_02 = new tk0_0();
        Ay0 ay0 = new Ay0();
        Ay0 ay02 = new Ay0();
        Ay0 ay03 = new Ay0();
        Ay0 ay04 = new Ay0();
        ay0.ld0(f -> Dk(color, f));
        ay02.ld0(f -> La(color, f));
        ay03.ld0(f -> Tm0(color, f));
        ay04.ld0(f -> Lz0(color, f));
        ay0.tt(0.0f, 1.0f);
        ay0.yx();
        ay02.tt(0.0f, 1.0f);
        ay02.yx();
        ay03.tt(0.0f, 1.0f);
        ay03.yx();
        ay04.tt(0.0f, 1.0f);
        ay04.yx();
        ay0.Zb0(color.r);
        ay02.Zb0(color.g);
        ay03.Zb0(color.b);
        ay04.Zb0(color.a);
        tk0_02.Xf0(new cn_0("Color:")).ys0(10.0f).Yt().im0();
        tk0_02.Xf0(ay0).dw0().pK0(5.0f);
        tk0_02.Xf0(ay02).dw0().pK0(5.0f);
        tk0_02.Xf0(ay03).dw0().pK0(5.0f);
        tk0_02.Xf0(ay04).dw0().pK0(5.0f).Xs(5.0f).im0();
        Ay0 ay05 = new Ay0();
        ay05.ld0(f -> px0(color, f));
        ay05.Zb0(color.r);
        ay05.tt(0.0f, 1.0f);
        ay05.yx();
        tk0_02.Xf0(ay05).dw0().ae0(5).pK0(5.0f).Wa(25.0f);
        SL(tk0_02);
    }

    public static /* synthetic */ void px0(Color color, float f) {
        color.r = f;
        color.g = f;
        color.b = f;
    }

    public static /* synthetic */ void Lz0(Color color, float f) {
        color.a = f;
    }

    public static /* synthetic */ void Tm0(Color color, float f) {
        color.b = f;
    }

    public static /* synthetic */ void La(Color color, float f) {
        color.g = f;
    }

    public static /* synthetic */ void Dk(Color color, float f) {
        color.r = f;
    }

    public static /* synthetic */ void oE0(float f) {
        Af.z = f;
    }

    public static /* synthetic */ void qo(float f) {
        Af.y = f;
    }

    public static /* synthetic */ void ie(float f) {
        Af.x = f;
    }
}
