package cn.pokemmo.ui.widget.component;

import f.*;

public class DynamicSliderMarker {
    public final int tM;
    public final int dG0;
    public final boolean UO;
    public final int IK0;
    public int Kk0;
    public final String ot0;
    public final int sf;
    public final int By0;

    public DynamicSliderMarker(int type, int format, String name) {
        this(type, format, type == 4 ? 5121 : 5126, type == 4,
                name, 0);
    }

    public DynamicSliderMarker(int type, int format, String name, int flags) {
        this(type, format, type == 4 ? 5121 : 5126, type == 4,
                name, flags);
    }

    public DynamicSliderMarker(int type, int format, int dataType, boolean normalized, String name) {
        this(type, format, dataType, normalized, name, 0);
    }

    public DynamicSliderMarker(int type, int format, int dataType, boolean normalized,
                String name, int flags) {
        this.tM = type;
        this.dG0 = format;
        this.IK0 = dataType;
        this.UO = normalized;
        this.ot0 = name;
        this.sf = flags;
        this.By0 = Integer.numberOfTrailingZeros(type);
    }

    @Override
    public final boolean equals(Object other) {
        return other instanceof kz_0 && this.hM((kz_0) other);
    }

    public final boolean hM(kz_0 other) {
        return other != null
                && this.tM == other.tM
                && this.dG0 == other.dG0
                && this.IK0 == other.IK0
                && this.UO == other.UO
                && this.ot0.equals(other.ot0)
                && this.sf == other.sf;
    }

    @Override
    public final int hashCode() {
        int value = (this.By0 << 8) + (this.sf & 255);
        value = value * 541 + this.dG0;
        return value * 541 + this.ot0.hashCode();
    }
}
