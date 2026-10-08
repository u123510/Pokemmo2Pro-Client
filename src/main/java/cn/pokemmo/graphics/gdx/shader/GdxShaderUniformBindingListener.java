package cn.pokemmo.graphics.gdx.shader;

import f.*;


import com.badlogic.gdx.math.Matrix4;
import f.BJ0;
import f.C8;
import f.CI0;
import f.Jn0;
import f.PH;
import f.QT;
import f.dw_2;
import f.eh_2;
import f.jn_0;
import f.jy_1;
import f.le0_2;
import f.ql_0;
import f.qq_0;
import f.tw0_0;
import f.ui_1;
import f.uk0_2;
import f.zk0_1;

public class GdxShaderUniformBindingListener
extends uk0_2 {
    public final /* synthetic */ QT JS;

    public GdxShaderUniformBindingListener(QT qT) {
        this.JS = qT;
    }

    @Override
    public final void Qa(Jn0 jn0) {
        super.Qa(jn0);
        this.JS.JG = this.Jj0;
    }

    @Override
    public final void aUX(zk0_1 zk0_12) {
        super.aUX(zk0_12);
        QT qt = this.JS;
        if (qt.MT != null && dw_2.o70) {
            jn_0 window = tw0_0.LD0;
            ui_1 ui = window.j20;
            jy_1 renderer = window.aj;
            eh_2 batch = window.K10;
            BJ0 camera = window.U1;
            ui.end();
            ql_0 viewport = qt.RX;
            Qz0 frame = qt.lH;
            if (tw0_0.kz0() ^ true) {
                viewport.j80 = frame.A20;
                viewport.Wm0 = frame.SB0 - 25;
                viewport.IA = frame.Mx;
                viewport.Eu0 = frame.OB + 63;
            } else {
                viewport.j80 = frame.A20;
                viewport.Wm0 = frame.SB0 - 8;
                viewport.IA = frame.Mx;
                viewport.Eu0 = frame.OB + 60;
            }
            boolean night = qt.Nc;
            camera.Q30 = night ? -8.0f : 0.0f;
            camera.d00 = night ? -7.0f : 0.0f;
            camera.Ui = viewport.IA;
            camera.yG = viewport.Eu0;
            camera.Rg0 = 1.5f;
            camera.rj.x = 0.0f;
            camera.rj.y = 0.0f;
            camera.rj.z = -3.25f;
            camera.JP(0.25f, night ? 0.5f : 0.0f, night ? 1.0f : 0.0f);
            renderer.vE0(ui.jP, qt.RX, qt.Js0);
            PH.Sj(qt.Js0);
            float scale = window.Ew;
            int width = (int) (viewport.j80 / scale);
            int height = (int) ((window.Hv0() - viewport.Wm0 - viewport.Eu0) / scale);
            int x = (int) (viewport.IA / scale);
            int y = (int) (viewport.Eu0 / scale);
            CI0.r40(width, height, x, y);
            camera.ye(true);
            batch.jK(camera);
            qt.MT.begin();
            qt.MT.update();
            qt.MT.me0();
            qt.MT.end();
            batch.eo0(qt.MT);
            batch.end();
            ui.W30();
            PH.eF();
            ((qq_0) this.Em0.AK).va.kF(false);
        }
        le0_2 widget = qt.wO;
        N1 tint = widget.z70;
        if (tint != null && tint.LpT8) {
            widget.Zo0(zk0_12);
            return;
        }
        if (widget.IM) {
            widget.U10(zk0_12);
            return;
        }
        widget.HP(zk0_12);
    }
}
