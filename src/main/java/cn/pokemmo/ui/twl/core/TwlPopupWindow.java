package cn.pokemmo.ui.twl.core;

import f.Bg0;
import f.MD0;
import f.N1;
import f.Nj;
import f.PC0;
import f.Qy0;
import f.ga0_0;
import f.gn_0;
import f.jn_0;
import f.jv_1;
import f.le0_2;
import f.lg_0;
import f.lpt3__1;
import f.ok_0;
import f.pa0_0;
import f.qq_0;
import f.tw0_0;
import f.ug_2;
import f.wl0_2;
import f.zk0_1;
import java.util.ConcurrentModificationException;

/**
 * 弹出窗口与主渲染循环控制 (PopupWindow)
 */
public class TwlPopupWindow extends zk0_1 {
    public final ga0_0 renderer;

    public TwlPopupWindow(ga0_0 renderer, Qy0 ui, qq_0 input, Bg0 game, jv_1 controller, PC0 platform, ok_0 layout) {
        super(ui, input, game, controller, platform, layout);
        this.renderer = renderer;
    }

    public ga0_0 getRenderer() {
        return this.renderer;
    }

    public void update() {
        this.jR();
        long now = System.currentTimeMillis();
        this.HA = Math.max(0, (int) (now - this.ss0));
        this.ss0 = now;
        try {
            int delay = this.QD;
            if (delay != 0 && now - this.Ef0 > delay) {
                this.Ef0 = now;
                this.QD = 33;
                this.Lh0.bp0 = true;
                this.A90(9);
            }
            ga0_0.AUx(this.renderer);
        } catch (ConcurrentModificationException | IndexOutOfBoundsException | NullPointerException exception) {
            ga0_0.qn.error("Error handling input from renderer.", exception);
        }
        this.Gy0();
        this.X10();
        this.kg();
        this.Iu();
        this.tl0();
    }

    @Override
    public boolean Wq0(int x, int y, int button, boolean pressed) {
        if (tw0_0.iE.M20()) {
            return true;
        }
        if (jn_0.Ey0) {
            le0_2 widget = this.renderer.u10.BQ(x, y);
            if (widget != null) {
                le0_2 nested = widget.BQ(x, y);
                if (nested != null) {
                    widget = nested;
                }
                if (widget.aq().contains("tooltip-help")) {
                    return super.Wq0(x, y, button, pressed);
                }
                if (lpt3__1.rl0) {
                    N1 transition = widget.nf();
                    if (transition == null) {
                        transition = new N1(widget);
                    }
                    if (!transition.dL0()) {
                        transition.bT(new gn_0((byte) 0, (byte) -1, (byte) 0, (byte) -6), 750);
                        wl0_2 previous = widget.Jh0();
                        widget.Nd(this.renderer.Vp);
                        transition.Q4(new ug_2(widget, previous, transition));
                    }
                    widget.LPT8(transition);
                    widget.ur0();
                }
                String diagnostics = widget.getClass().getName() + "\n" + widget.vV() + "\n" + widget.aq()
                        + "\nPos: " + widget.Nl0() + " " + widget.wF()
                        + "\nSize: " + widget.R00() + " " + widget.RR()
                        + "\nInner Size: " + widget.a3() + " " + widget.k5()
                        + "\nBorder LR: " + widget.Vx0() + " " + widget.DN()
                        + "\nBorder TB: " + widget.Bx() + " " + widget.P6() + "\n\nSTATES: \n";
                MD0[] states = {Nj.r2, Nj.uK};
                for (MD0 state : states) {
                    diagnostics = diagnostics + state.su() + " = " + widget.Ed0().t5(state) + "\n";
                }
                if (lg_0.lW.Is()) {
                    if (lpt3__1.yg0) {
                        Qy0.Sq().jE(diagnostics);
                    }
                    System.out.println(diagnostics);
                }
                if (lpt3__1.UL) {
                    Qy0.Sq().vk(widget, diagnostics, pa0_0.L00);
                }
            }
        }
        return super.Wq0(x, y, button, pressed);
    }
}
