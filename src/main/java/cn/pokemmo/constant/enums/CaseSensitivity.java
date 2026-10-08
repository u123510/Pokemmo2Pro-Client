package cn.pokemmo.constant.enums;

import f.*;

import java.io.Serializable;

public enum CaseSensitivity implements Serializable {
    Bn(0, "Sensitive", true),
    INSENSITIVE(1, "Insensitive", false),
    SYSTEM(2, "System", !(Y50.z2 == '\\'));

    private static final long serialVersionUID = -6343169151696340687L;
    public final String Jl;
    public final transient boolean kH;
    public static final CaseSensitivity[] By0 = values();

    CaseSensitivity(int ignored, String display, boolean sensitive) {
        this.Jl = display;
        this.kH = sensitive;
    }

    private Object readResolve() {
        for (CaseSensitivity value : values()) {
            if (value.Jl.equals(this.Jl)) return value;
        }
        throw new IllegalArgumentException("Invalid IOCase name: " + this.Jl);
    }

    @Override
    public final String toString() { return this.Jl; }

    public f.uj0_0 toLegacy() {
        return f.uj0_0.valueOf(name());
    }
}