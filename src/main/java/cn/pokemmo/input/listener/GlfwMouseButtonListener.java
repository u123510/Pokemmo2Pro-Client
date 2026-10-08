package cn.pokemmo.input.listener;

import f.*;
import org.lwjgl.glfw.GLFWMouseButtonCallback;

public class GlfwMouseButtonListener extends GLFWMouseButtonCallback {
    public final DB0 ha0;

    public GlfwMouseButtonListener(DB0 owner) {
        super();
        this.ha0 = owner;
    }

    @Override
    public final void invoke(long window, int button, int action, int mods) {
        int mapped;
        switch (button) {
            case 0:
                mapped = 0;
                break;
            case 1:
                mapped = 1;
                break;
            case 2:
                mapped = 2;
                break;
            case 3:
                mapped = 3;
                break;
            case 4:
                mapped = 4;
                break;
            default:
                mapped = -1;
                break;
        }
        if (button != -1 && mapped == -1) {
            return;
        }
        long timestamp = System.nanoTime();
        if (action == 1) {
            this.ha0.Ct++;
            this.ha0.S5 = true;
            this.ha0.tJ0[mapped] = true;
            this.ha0.wc0.gw.rt0.G20();
            y5 input = this.ha0.ki;
            synchronized (input) {
                input.kr0.ja0(3);
                input.P20(timestamp);
                input.kr0.ja0(this.ha0.bk0);
                input.kr0.ja0(this.ha0.zs);
                input.kr0.ja0(0);
                input.kr0.ja0(mapped);
            }
        } else {
            this.ha0.Ct = Math.max(this.ha0.Ct - 1, 0);
            this.ha0.wc0.gw.rt0.G20();
            this.ha0.ki.RF0(this.ha0.bk0, this.ha0.zs, mapped, timestamp);
        }
    }
}
