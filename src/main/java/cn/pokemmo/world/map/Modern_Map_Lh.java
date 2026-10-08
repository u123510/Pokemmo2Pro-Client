package cn.pokemmo.world.map;

import f.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 现代化重构类 - 原始混淆类: f.LH
 */
public class Modern_Map_Lh {

    public static final Matcher JU = Pattern.compile("[ |\\p{L}|\\p{N}|\\p{P}]{1,20}").matcher("");
    public static final byte[] Ed = new byte[0];
    public IG0 ou;
    public byte[] pw0;

    public Modern_Map_Lh() { this(new bm0_1(), Ed); }
    public Modern_Map_Lh(bm0_1 values, byte[] order) { this.ou = values; this.pw0 = order; }

    public final String P2(_volatile type, byte index) {
        if (type == _volatile.Kb) return sm0_0.wa0(2365, "STR_ACC_BOX");
        if (index < 0) return sm0_0.hL0(2367, "STR_B_BOX");
        String value = (String)this.ou.BM(index);
        if (value != null && !value.isEmpty()) return value;
        if (sm0_0.cU.l90(1119)) return sm0_0.wa0(1119, String.valueOf(index + 1));
        return yr_1.pG("STR_BOX_", index);
    }

    public final String jh(_volatile type, byte index) {
        if (type == _volatile.Kb) return sm0_0.wa0(2364, "STR_ACC_BOX");
        if (index < 0) return sm0_0.hL0(2361, "STR_B_BOX");
        return this.P2(type, index);
    }

    public final void iG0(byte index, String value) {
        if (!value.isEmpty() && JU.reset(value).matches()) this.ou.gE0(index, value);
        else this.ou.lz0(index);
    }

    public final int g60(int index) {
        if (index >= 0 && index < this.pw0.length) for (int position = 0; position < this.pw0.length; ++position) if (this.pw0[position] == index) return position;
        return index;
    }
}

