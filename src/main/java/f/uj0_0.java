package f;

import cn.pokemmo.constant.enums.CaseSensitivity;

import java.io.Serializable;

public enum uj0_0 implements Serializable {
    Bn(0, "Sensitive", true),
    INSENSITIVE(1, "Insensitive", false),
    SYSTEM(2, "System", !(Y50.z2 == '\\'));

    private static final long serialVersionUID = -6343169151696340687L;
    public final String Jl;
    public final transient boolean kH;
    public static final uj0_0[] By0 = values();

    uj0_0(int ignored, String display, boolean sensitive) {
        this.Jl = display;
        this.kH = sensitive;
    }

    private Object readResolve() {
        for (uj0_0 value : values()) {
            if (value.Jl.equals(this.Jl)) return value;
        }
        throw new IllegalArgumentException("Invalid IOCase name: " + this.Jl);
    }

    @Override
    public final String toString() { return this.Jl; }

    public CaseSensitivity asModern() {
        return CaseSensitivity.valueOf(name());
    }
}