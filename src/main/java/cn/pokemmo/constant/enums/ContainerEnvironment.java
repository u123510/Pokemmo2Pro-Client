package cn.pokemmo.constant.enums;

import f.*;

import java.util.EnumMap;

public enum ContainerEnvironment {
    Xv0(0, "PokeMMO is running in a Snapcraft.io container"),
    Zv(1, "PokeMMO is running in a Flatpak container"),
    ul(2, "PokeMMO is running in a macOS App Sandbox"),
    a7(3, "");

    public static final l6_0[] Jk0;
    public static final EnumMap<ContainerEnvironment, l6_0[]> Lh0;
    public static final ContainerEnvironment[] ua0 = values();
    public final String on;

    ContainerEnvironment(int ignored, String text) {
        this.on = text;
    }

    static {
        Jk0 = new l6_0[0];
        Lh0 = new EnumMap<>(ContainerEnvironment.class);
        for (ContainerEnvironment value : values()) {
            if (value == Xv0) {
                Lh0.put(value, new l6_0[]{l6_0.F0, l6_0.tt});
            } else {
                Lh0.put(value, Jk0);
            }
        }
    }

    public final String ob0() {
        return this.on;
    }

    public f.com5__4 toLegacy() {
        return f.com5__4.valueOf(name());
    }
}