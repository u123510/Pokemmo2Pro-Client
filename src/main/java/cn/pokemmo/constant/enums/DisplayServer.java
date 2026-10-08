package cn.pokemmo.constant.enums;

import f.*;

public enum DisplayServer {
    Wayland(393219),
    X11(393220);

    public static final DisplayServer wk0 = Wayland;
    public static final DisplayServer Ox = X11;

    public final int Va0;

    DisplayServer(int i3) {
        this.Va0 = i3;
    }

    public static DisplayServer ik(boolean i0) {
        if (i0) {
            return Ox;
        }
        return wk0;
    }

    public final int Ax0() {
        return this.Va0;
    }

    public f.m4_0 toLegacy() {
        return f.m4_0.valueOf(name());
    }
}