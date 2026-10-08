package cn.pokemmo.constant.enums;

import f.*;

/** Contest/event kind and its protocol identifiers. */
public enum PacketOpcodeCategory {
    M4((byte) -1, 61),
    ol((byte) 0, 6600),
    os((byte) 1, 6601),
    I9((byte) 2, 6602),
    APRIL_FOOLS((byte) 3, 6603),
    MOONCAKE_FESTIVAL((byte) 4, 6604),
    TENTH_ANNIVERSARY((byte) 5, 6605),
    ANNIVERSARY((byte) 6, 6606);

    public static final PacketOpcodeCategory[] Rt0;
    public static final bm0_1 MR;
    public final byte OE0;
    public final int YL0;

    PacketOpcodeCategory(byte code, int textId) {
        this.OE0 = code;
        this.YL0 = textId;
    }

    public static PacketOpcodeCategory BE0(byte code) {
        if (code == (byte) -1) {
            return null;
        }
        return (PacketOpcodeCategory) MR.BM(code);
    }

    static {
        Rt0 = values();
        MR = new bm0_1();
        for (PacketOpcodeCategory value : Rt0) {
            MR.gE0(value.OE0, value);
        }
    }

    @Override
    public final String toString() {
        return sm0_0.cU.l90(this.YL0) ? sm0_0.c0(this.YL0) : super.toString();
    }

    public f.tu_0 toLegacy() {
        return f.tu_0.valueOf(name());
    }
}