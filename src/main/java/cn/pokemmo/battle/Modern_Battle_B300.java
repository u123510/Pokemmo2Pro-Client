package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.b30_0
 */
public class Modern_Battle_B300 {
    public final byte Pp0;
    public final byte B6;

    public Modern_Battle_B300(byte by, byte by2) {
        this.Pp0 = by;
        this.B6 = by2;
    }

    public final byte a70() {
        return this.Pp0;
    }

    public final byte B50() {
        return this.B6;
    }

    public final byte bG() {
        byte by = this.B6;
        return (byte)(this.Pp0 & 0xF | by << 4);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof b30_0)) {
            return false;
        }
        b30_0 other = (b30_0)object;
        return this.Pp0 == other.Pp0 && this.B6 == other.B6;
    }

    public final int hashCode() {
        int n = b30_0.class.hashCode() + 12;
        return this.bG() + n;
    }
}
