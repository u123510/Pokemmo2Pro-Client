package cn.pokemmo.rom.gba.text;

import f.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class GbaTextDecoder {
    public static final bm0_1 A10;
    public static final bm0_1 D00;

    public static String BC(int i0, ByteBuffer v1) {
        int i2 = v1.position();
        if (i0 < 0 || i0 > v1.limit()) {
            return yr_1.pG("Invalid String Offset ", i0);
        }
        v1.position(i0);
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte b = v1.get();
            if (b == -1) {
                break;
            }
            if (b == -4) {
                byte b2 = v1.get();
                if (b2 == 6 || b2 == 8 || b2 == 17) {
                    v1.get();
                } else if (b2 == 11 || b2 == 16) {
                    v1.getShort();
                } else {
                    break;
                }
            } else if (b == -3) {
                byte b2 = v1.get();
                if (D00.dg(b2)) {
                    sb.append((String) D00.BM(b2));
                }
            } else {
                sb.append((String) A10.BM(b));
            }
        }
        v1.position(i2);
        return sb.toString();
    }

    public static String Xc(int i0, ByteBuffer v1) {
        int i2 = v1.position();
        if (i0 < 0 || i0 > v1.limit()) {
            return yr_1.pG("Invalid String Offset ", i0);
        }
        v1.position(i0);
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte b = v1.get();
            if (b == -1) {
                break;
            }
            if (b == -4) {
                byte b2 = v1.get();
                if (b2 == 6 || b2 == 8 || b2 == 17) {
                    v1.get();
                } else if (b2 == 11 || b2 == 16) {
                    v1.getShort();
                }
            } else if (b == -3) {
                byte b2 = v1.get();
                sb.append("{" + String.format("%1$02X", Byte.valueOf(b2)) + "}");
            } else {
                if (!A10.dg(b)) {
                    break;
                }
                sb.append((String) A10.BM(b));
            }
        }
        v1.position(i2);
        return sb.toString();
    }

    public static String PK0(ByteBuffer v0) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte b = v0.get();
            if (b == -1) {
                return sb.toString();
            }
            if (b == -3) {
                byte b2 = v0.get();
                if (D00.dg(b2)) {
                    sb.append((String) D00.BM(b2));
                } else {
                    sb.append("{" + String.format("%1$02X", Byte.valueOf(b2)) + "}");
                }
            } else if (b == -4) {
                byte b2 = v0.get();
                if (b2 == 6 || b2 == 8) {
                    v0.get();
                } else if (b2 == 11 || b2 == 16) {
                    v0.getShort();
                }
            } else {
                if (A10.dg(b)) {
                    sb.append((String) A10.BM(b));
                } else {
                    sb.append("{RAW_" + String.format("%1$02X", Byte.valueOf(b)) + "}");
                }
            }
        }
    }

    public static String Y(byte[] v0) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < v0.length) {
            byte b = v0[i2];
            if (b == -1) {
                break;
            }
            if (b == -3) {
                i2++;
                byte b2 = v0[i2];
                if (D00.dg(b2)) {
                    sb.append((String) D00.BM(b2));
                }
            } else {
                sb.append((String) A10.BM(b));
            }
            i2++;
        }
        return sb.toString();
    }

    public static String TG0(int i0, boolean i1, qa0_1 v2, qa0_1 v3) {
        if ((i0 & 0x10000000) != 0) {
            if (v3 == null) {
                return "Missing ROM";
            }
            v2 = v3;
        }
        i0 &= 0xFFFFFF;
        if (v2 == null) {
            return "ERR";
        }
        G1 g1 = v2.EZ.hG;
        if (g1 != null) {
            if (g1.nG.IJ0(i0) < 0) {
                return "Missing string offset conversion: " + ("0x" + Integer.toHexString(i0).toUpperCase());
            }
            Y60 y60 = v2.EZ.hG.nG;
            int conv = y60.IJ0(i0);
            if (conv < 0) {
                i0 = y60.dJ;
            } else {
                i0 = y60.IL0[conv];
            }
        }
        if (i1) {
            return BC(i0, v2.VL0.slice().order(ByteOrder.LITTLE_ENDIAN));
        } else {
            return Xc(i0, v2.VL0.slice().order(ByteOrder.LITTLE_ENDIAN));
        }
    }

    static {
        A10 = new bm0_1();
        D00 = new bm0_1();

        A10.gE0((byte) 0, " ");
        A10.gE0((byte) 1, "À");
        A10.gE0((byte) 2, "Á");
        A10.gE0((byte) 3, "Â");
        A10.gE0((byte) 4, "Ç");
        A10.gE0((byte) 5, "È");
        A10.gE0((byte) 6, "É");
        A10.gE0((byte) 7, "Ê");
        A10.gE0((byte) 8, "Ë");
        A10.gE0((byte) 9, "Ì");
        A10.gE0((byte) 11, "Î");
        A10.gE0((byte) 12, "Ï");
        A10.gE0((byte) 13, "Ò");
        A10.gE0((byte) 14, "Ó");
        A10.gE0((byte) 15, "Ô");
        A10.gE0((byte) 16, "Œ");
        A10.gE0((byte) 17, "Ù");
        A10.gE0((byte) 18, "Ú");
        A10.gE0((byte) 19, "Û");
        A10.gE0((byte) 20, "Ñ");
        A10.gE0((byte) 21, "ß");
        A10.gE0((byte) 22, "à");
        A10.gE0((byte) 23, "á");
        A10.gE0((byte) 25, "ç");
        A10.gE0((byte) 26, "è");
        A10.gE0((byte) 27, "é");
        A10.gE0((byte) 28, "ê");
        A10.gE0((byte) 29, "ë");
        A10.gE0((byte) 30, "ì");
        A10.gE0((byte) 32, "î");
        A10.gE0((byte) 33, "ï");
        A10.gE0((byte) 34, "ò");
        A10.gE0((byte) 35, "ó");
        A10.gE0((byte) 36, "ô");
        A10.gE0((byte) 37, "œ");
        A10.gE0((byte) 38, "ù");
        A10.gE0((byte) 39, "ú");
        A10.gE0((byte) 40, "û");
        A10.gE0((byte) 41, "ñ");
        A10.gE0((byte) 42, "º");
        A10.gE0((byte) 43, "ª");
        A10.gE0((byte) 44, "er");
        A10.gE0((byte) 45, "&");
        A10.gE0((byte) 46, "+");
        A10.gE0((byte) 52, "[Lv]");
        A10.gE0((byte) 53, ", ");
        A10.gE0((byte) 54, ";");
        A10.gE0((byte) 81, "¿");
        A10.gE0((byte) 82, "¡");
        A10.gE0((byte) 83, "PK");
        A10.gE0((byte) 84, "MN");
        A10.gE0((byte) 85, "PO");
        A10.gE0((byte) 86, "Ké");
        A10.gE0((byte) 87, "BL");
        A10.gE0((byte) 88, "OC");
        A10.gE0((byte) 89, "K");
        A10.gE0((byte) 90, "Í");
        A10.gE0((byte) 91, "%");
        A10.gE0((byte) 92, "(");
        A10.gE0((byte) 93, ")");
        A10.gE0((byte) 94, " PO");
        A10.gE0((byte) 95, "Ké");
        A10.gE0((byte) 96, "ME");
        A10.gE0((byte) 97, "LL");
        A10.gE0((byte) 98, "");
        A10.gE0((byte) 99, "E");
        A10.gE0((byte) 104, "â");
        A10.gE0((byte) 111, "í");
        A10.gE0((byte) 121, "↑");
        A10.gE0((byte) 122, "↓");
        A10.gE0((byte) 123, "←");
        A10.gE0((byte) 124, "→");
        A10.gE0((byte) -124, "e");
        A10.gE0((byte) -123, "<");
        A10.gE0((byte) -122, ">");
        A10.gE0((byte) -120, "Ć");
        A10.gE0((byte) -119, "Ę");
        A10.gE0((byte) -111, "Ó");
        A10.gE0((byte) -110, "ą");
        A10.gE0((byte) -109, "ę");
        A10.gE0((byte) -108, "ó");
        A10.gE0((byte) -107, "ś");
        A10.gE0((byte) -106, "ł");
        A10.gE0((byte) -105, "ń");
        A10.gE0((byte) -104, "ż");
        A10.gE0((byte) -103, "ź");
        A10.gE0((byte) -102, "ć");
        A10.gE0((byte) -101, "Ą");
        A10.gE0((byte) -100, "Ż");
        A10.gE0((byte) -99, "Ź");
        A10.gE0((byte) -98, "Ł");
        A10.gE0((byte) -97, "Ś");
        A10.gE0((byte) -95, "0");
        A10.gE0((byte) -94, "1");
        A10.gE0((byte) -93, "2");
        A10.gE0((byte) -92, "3");
        A10.gE0((byte) -91, "4");
        A10.gE0((byte) -90, "5");
        A10.gE0((byte) -89, "6");
        A10.gE0((byte) -88, "7");
        A10.gE0((byte) -87, "8");
        A10.gE0((byte) -86, "9");
        A10.gE0((byte) -85, "!");
        A10.gE0((byte) -84, "?");
        A10.gE0((byte) -83, ".");
        A10.gE0((byte) -82, "-");
        A10.gE0((byte) -81, "·");
        A10.gE0((byte) -80, "...");
        A10.gE0((byte) -79, "«");
        A10.gE0((byte) -78, "»");
        A10.gE0((byte) -77, "\'");
        A10.gE0((byte) -76, "\'");
        A10.gE0((byte) -75, "♂");
        A10.gE0((byte) -74, "♀");
        A10.gE0((byte) -73, "$");
        A10.gE0((byte) -72, ",");
        A10.gE0((byte) -71, "*");
        A10.gE0((byte) -70, "/");
        A10.gE0((byte) -69, "A");
        A10.gE0((byte) -68, "B");
        A10.gE0((byte) -67, "C");
        A10.gE0((byte) -66, "D");
        A10.gE0((byte) -65, "E");
        A10.gE0((byte) -64, "F");
        A10.gE0((byte) -63, "G");
        A10.gE0((byte) -62, "H");
        A10.gE0((byte) -61, "I");
        A10.gE0((byte) -60, "J");
        A10.gE0((byte) -59, "K");
        A10.gE0((byte) -58, "L");
        A10.gE0((byte) -57, "M");
        A10.gE0((byte) -56, "N");
        A10.gE0((byte) -55, "O");
        A10.gE0((byte) -54, "P");
        A10.gE0((byte) -53, "Q");
        A10.gE0((byte) -52, "R");
        A10.gE0((byte) -51, "S");
        A10.gE0((byte) -50, "T");
        A10.gE0((byte) -49, "U");
        A10.gE0((byte) -48, "V");
        A10.gE0((byte) -47, "W");
        A10.gE0((byte) -46, "X");
        A10.gE0((byte) -45, "Y");
        A10.gE0((byte) -44, "Z");
        A10.gE0((byte) -43, "a");
        A10.gE0((byte) -42, "b");
        A10.gE0((byte) -41, "c");
        A10.gE0((byte) -40, "d");
        A10.gE0((byte) -39, "e");
        A10.gE0((byte) -38, "f");
        A10.gE0((byte) -37, "g");
        A10.gE0((byte) -36, "h");
        A10.gE0((byte) -35, "i");
        A10.gE0((byte) -34, "j");
        A10.gE0((byte) -33, "k");
        A10.gE0((byte) -32, "l");
        A10.gE0((byte) -31, "m");
        A10.gE0((byte) -30, "n");
        A10.gE0((byte) -29, "o");
        A10.gE0((byte) -28, "p");
        A10.gE0((byte) -27, "q");
        A10.gE0((byte) -26, "r");
        A10.gE0((byte) -25, "s");
        A10.gE0((byte) -24, "t");
        A10.gE0((byte) -23, "u");
        A10.gE0((byte) -22, "v");
        A10.gE0((byte) -21, "w");
        A10.gE0((byte) -20, "x");
        A10.gE0((byte) -19, "y");
        A10.gE0((byte) -18, "z");
        A10.gE0((byte) -17, "|>|");
        A10.gE0((byte) -16, ":");
        A10.gE0((byte) -15, "Ä");
        A10.gE0((byte) -14, "Ö");
        A10.gE0((byte) -13, "Ü");
        A10.gE0((byte) -12, "ä");
        A10.gE0((byte) -11, "ö");
        A10.gE0((byte) -10, "ü");
        A10.gE0((byte) -9, "|A|");
        A10.gE0((byte) -8, "|V|");
        A10.gE0((byte) -7, "|<|");
        A10.gE0((byte) -6, "\n\n");
        A10.gE0((byte) -5, "\n\n");
        A10.gE0((byte) -4, "|FC|");
        A10.gE0((byte) -3, "|FD|");
        A10.gE0((byte) -2, "\n");
        A10.gE0((byte) -1, "|end|");

        D00.gE0((byte) 1, "%CHARACTER_NAME%");
        D00.gE0((byte) 6, "%RIVAL_NAME%");
    }
}
