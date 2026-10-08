package cn.pokemmo.battle;

import f.*;
import java.nio.ByteBuffer;

public class BattleTurnStatusRecord {
    public static BattleTurnStatusRecord RR;
    public static Wr[] QC0;
    public static int[] J4;
    public static int[] sk0;
    public static int[] throws$;

    public final short p00;
    public final byte JZ;
    public final byte Fv;
    public final byte Ky0;
    public final byte Z80;
    public final byte vd;
    public final byte U0;
    public final byte uw;
    public final byte Oy0;
    public final byte pE0;
    public final byte io0;
    public final short vq;
    public Wr[] TK;

    public BattleTurnStatusRecord(ByteBuffer buffer) {
        this.TK = QC0;
        this.p00 = buffer.getShort();
        byte type = buffer.get();
        this.JZ = type;
        this.Fv = buffer.get();
        this.Ky0 = buffer.get();
        buffer.get();
        buffer.get();
        this.Z80 = buffer.get();
        buffer.get();
        this.vd = buffer.get();
        buffer.get();
        this.U0 = buffer.get();
        this.uw = buffer.get();
        this.Oy0 = buffer.get();
        this.pE0 = buffer.get();
        byte flags = buffer.get();
        short value = buffer.getShort();
        this.vq = value;
        buffer.position(buffer.position() + 10);
        if (type == 2 && value == 2) {
            flags = -16;
        }
        this.io0 = flags;
    }

    public BattleTurnStatusRecord(byte type, short value, short secondaryValue) {
        this.TK = QC0;
        this.p00 = value;
        this.vq = secondaryValue;
        this.U0 = 1;
        this.uw = 1;
        this.JZ = type;
        this.Fv = 0;
        this.Z80 = 0;
        this.Oy0 = 0;
        if (value == 8202) {
            this.vd = 8;
            this.pE0 = 16;
            this.io0 = 0;
            this.Ky0 = 2;
        } else {
            this.vd = 0;
            this.pE0 = 0;
            this.io0 = 0;
            this.Ky0 = 0;
        }
    }

    public BattleTurnStatusRecord() {
        this.TK = QC0;
        this.p00 = 0;
        this.JZ = 0;
        this.Fv = 0;
        this.Ky0 = 0;
        this.Z80 = 0;
        this.vd = 8;
        this.U0 = 1;
        this.uw = 1;
        this.Oy0 = 0;
        this.pE0 = 0;
        this.io0 = 0;
        this.vq = 196;
    }

    public final Wr gs0(byte direction, int frame) {
        Wr[] frames = this.TK;
        int index;
        switch (this.vd) {
            case 5:
            case 12:
                if (direction == 0) {
                    index = frame % 2 + 2;
                } else if (direction == 2) {
                    index = frame % 2 + 4;
                } else if (direction == 3) {
                    index = sk0[frame % 2] + 4;
                } else {
                    index = frame % 2;
                }
                break;
            case 8:
            case 19:
                index = 0;
                break;
            case 13:
            case 14:
                if (direction == 0) {
                    index = 2;
                } else if (direction == 2) {
                    index = 4;
                } else if (direction == 3) {
                    index = this.vd == 13 ? 4 : 6;
                } else {
                    index = 0;
                }
                index += (int) (hk0_1.KG / 333L % 2L);
                break;
            case 18:
                index = direction == 2
                        ? 12
                        : throws$[(int) (hk0_1.KG / 240L % 6L)];
                break;
            case 21:
                index = (int) (hk0_1.KG / 120L % 20L);
                break;
            case 22:
                index = throws$[(int) (hk0_1.KG / 240L % 6L)];
                break;
            case 29:
                index = 7 + (int) (hk0_1.KG / 240L % 5L);
                break;
            default:
                if (direction == 0) {
                    index = J4[frame % 4] + 3;
                } else if (direction == 2) {
                    index = J4[frame % 4] + 6;
                } else if (direction == 3) {
                    index = J4[frame % 4] + 9;
                } else {
                    index = J4[frame % 4];
                }
        }

        if (index >= frames.length) {
            index = 0;
        }
        return frames[index];
    }

        static {
        if (f.ej_1.RR == null) {
            try {
                Class.forName(f.ej_1.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
