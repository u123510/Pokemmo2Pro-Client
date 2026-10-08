package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.RR
 */
public class Modern_Util_RR {

    public final boolean Kj0;
    public final String Ii0;
    public final byte[] f0;

    public Modern_Util_RR(String value, String encodedValue) {
        this.Ii0 = value;
        if (encodedValue == null) {
            this.f0 = null;
            this.Kj0 = false;
            return;
        }

        byte[] decoded;
        try {
            decoded = TI0.Kd(encodedValue);
        } catch (IllegalArgumentException ignored) {
            this.f0 = null;
            this.Kj0 = false;
            return;
        }
        this.f0 = decoded;
        this.Kj0 = decoded != null;
    }

    public final boolean equals(Object object) {
        return object instanceof RR && ((RR)object).Ii0.equalsIgnoreCase(this.Ii0);
    }

    public final String toString() {
        return this.Ii0;
    }
}

