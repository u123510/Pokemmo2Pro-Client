package cn.pokemmo.ui.window.admin;

import f.*;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

/**
 * 图形压缩与配置调试器窗口
 *
 * 原混淆类: f.qg_0
 */
public class GraphicsDebuggerWindow extends R90 {
    public final tk0_0 R9;
    public Texture Pi;
    public final W9 V5;
    public final X6 a1;

    public GraphicsDebuggerWindow() {
        super();
        this.uf("/resizableframe");
        this.Pb0(this::xe0);

        tk0_0 content = new tk0_0();
        A40 table = content.gg0;
        int configCount = tw0_0.Ll0.Qz0.pu().Vo().length;
        String[] labels = new String[configCount];
        for (int index = 0; index < configCount; ++index) {
            labels[index] = String.valueOf(index);
        }

        this.a1 = new X6(new pg0_2(labels));
        this.a1.Bd(0);
        this.a1.Rm0(this::WQ);

        this.V5 = new W9();
        this.V5.k50(true);
        this.V5.RR(this::ES);

        table.es("Config: ").yi0(this.a1).im0();
        table.es("Compress: ").yi0(this.V5).im0();

        xe_1 reset = new xe_1("Reset");
        reset.RR(qg_0::dE0);
        table.vx0(reset).ae0(Integer.valueOf(2)).im0();

        this.R9 = new tk0_0();
        table.vx0(this.R9).Yt().ae0(Integer.valueOf(2)).im0();
        this.R9.gg0.yI().ys0(2.0F);
        this.qh0();
        table.EF(15.0F);
        this.SL(content);
    }

    public static void nF(hb_1 config, int id) {
        vo_2 scene = tw0_0.LD0.Sc;
        // The original callbacks assume an L00 renderer, but other renderer types can remain active.
        if (!(scene instanceof L00)) {
            return;
        }

        L00 renderer = (L00) scene;
        renderer.DP = config.M10[id];
        if (renderer.DP == null) {
            renderer.mH(renderer.K60);
        }
        renderer.mD0();
    }

    public static void dE0() {
        vo_2 scene = tw0_0.LD0.Sc;
        if (!(scene instanceof L00)) {
            return;
        }

        L00 renderer = (L00) scene;
        renderer.DP = null;
        renderer.mH(renderer.K60);
        renderer.mD0();
    }

    public final void qh0() {
        hb_1 config = tw0_0.Ll0.Qz0.Oq0.Vo0[this.a1.mu0.Mw0];
        A40 table = this.R9.gg0;
        table.OO();

        Texture previousTexture = this.Pi;
        if (previousTexture != null) {
            previousTexture.dispose();
        }

        int colorCount = config.M10.length;
        i4_0 pixmap = new i4_0(colorCount, 4, ix0_0.Vw);
        for (int row = 0; row < 5; ++row) {
            for (int column = 0; column < colorCount; ++column) {
                rj0_2 colors = config.M10[column];
                Color color = null;
                switch (row) {
                    case 0:
                        color = colors.r30;
                        break;
                    case 1:
                        color = colors.Ak0;
                        break;
                    case 2:
                        color = colors.sm0;
                        break;
                    case 3:
                        color = colors.oE;
                        break;
                    case 4:
                        color = colors.B90;
                        break;
                    default:
                        break;
                }

                if (color != null) {
                    pixmap.XF.XS(column, row, Color.rgba8888(color));
                }
            }
        }

        this.Pi = new Texture(pixmap);
        pixmap.dispose();

        table.es("Time");
        table.es("#");
        table.es("Env");
        table.es("BG");
        table.es("Fog");
        table.es("Win");
        table.es("Win2").Rr0.Rg();

        int previousId = 0;
        for (int timeIndex = 0; timeIndex < 48; ++timeIndex) {
            int id = hb_1.lP(timeIndex * 30);
            if (id == previousId && this.V5.ER.U20()) {
                continue;
            }

            table.es(tx_1.bp((long) (timeIndex * 1800)));
            table.es("ID: " + id);
            for (int colorIndex = 0; colorIndex < 5; ++colorIndex) {
                S70 swatch = new S70(-1, -1, 0);
                swatch.VA(32, 16);
                LPT6_ region = new LPT6_(this.Pi, id, colorIndex, 1, 1);
                swatch.og.r8(new LPT6_[]{region});
                swatch.og.OA0 = true;
                swatch.og.IF = 32;
                swatch.og.gx0 = 16;
                swatch.og.sj = 1;
                table.vx0(swatch);
            }

            xe_1 preview = new xe_1("Preview");
            preview.uf("label");
            table.vx0(preview);
            int previewId = id;
            preview.RR(() -> nF(config, previewId));
            table.Rg();
            previousId = id;
        }

        this.lt0();
    }

    public final void N00(zk0_1 context) {
        this.Pi.dispose();
    }

    public final void ES() {
        this.qh0();
    }

    public final void WQ() {
        this.qh0();
    }
}
