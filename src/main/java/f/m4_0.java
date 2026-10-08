package f;

import cn.pokemmo.constant.enums.DisplayServer;

public enum m4_0 {
    Wayland(393219),
    X11(393220);

    public static final m4_0 wk0 = Wayland;
    public static final m4_0 Ox = X11;

    public final int Va0;

    m4_0(int i3) {
        this.Va0 = i3;
    }

    public static m4_0 ik(boolean i0) {
        if (i0) {
            return Ox;
        }
        return wk0;
    }

    public final int Ax0() {
        return this.Va0;
    }

    public DisplayServer asModern() {
        return DisplayServer.valueOf(name());
    }
}