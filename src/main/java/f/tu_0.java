package f;

import cn.pokemmo.constant.enums.PacketOpcodeCategory;

/** Contest/event kind and its protocol identifiers. */
public enum tu_0 {
    M4((byte) -1, 61),
    ol((byte) 0, 6600),
    os((byte) 1, 6601),
    I9((byte) 2, 6602),
    APRIL_FOOLS((byte) 3, 6603),
    MOONCAKE_FESTIVAL((byte) 4, 6604),
    TENTH_ANNIVERSARY((byte) 5, 6605),
    ANNIVERSARY((byte) 6, 6606);

    public static final tu_0[] Rt0;
    public static final bm0_1 MR;
    public final byte OE0;
    public final int YL0;

    tu_0(byte code, int textId) {
        this.OE0 = code;
        this.YL0 = textId;
    }

    public static tu_0 BE0(byte code) {
        if (code == (byte) -1) {
            return null;
        }
        return (tu_0) MR.BM(code);
    }

    static {
        Rt0 = values();
        MR = new bm0_1();
        for (tu_0 value : Rt0) {
            MR.gE0(value.OE0, value);
        }
    }

    @Override
    public final String toString() {
        return sm0_0.cU.l90(this.YL0) ? sm0_0.c0(this.YL0) : super.toString();
    }

    public PacketOpcodeCategory asModern() {
        return PacketOpcodeCategory.valueOf(name());
    }
}