package f;

import cn.pokemmo.constant.enums.ContainerEnvironment;

import java.util.EnumMap;

public enum com5__4 {
    Xv0(0, "PokeMMO is running in a Snapcraft.io container"),
    Zv(1, "PokeMMO is running in a Flatpak container"),
    ul(2, "PokeMMO is running in a macOS App Sandbox"),
    a7(3, "");

    public static final l6_0[] Jk0;
    public static final EnumMap<com5__4, l6_0[]> Lh0;
    public static final com5__4[] ua0 = values();
    public final String on;

    com5__4(int ignored, String text) {
        this.on = text;
    }

    static {
        Jk0 = new l6_0[0];
        Lh0 = new EnumMap<>(com5__4.class);
        for (com5__4 value : values()) {
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

    public ContainerEnvironment asModern() {
        return ContainerEnvironment.valueOf(name());
    }
}