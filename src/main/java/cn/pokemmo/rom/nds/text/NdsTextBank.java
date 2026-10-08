package cn.pokemmo.rom.nds.text;

import f.*;

import java.nio.ByteBuffer;

public class NdsTextBank {
    public static final NdsTextBank zq;
    public static final String[] oo;
    public static int kt0;
    public final lpt6__2 h8;
    public final l50_0 Sb;
    public final String[][][] ul0;
    public final short[][][] Cg0;
    public final boolean D40;
    public final boolean U20;
    public final boolean MV;
    public final FJ Kr0;

    static {
        zq = new NdsTextBank();
        oo = new String[0];
        kt0 = 0;
    }

    public NdsTextBank(l50_0 l50_0, lpt6__2 lpt6__2, Ae ae) {
        this.h8 = lpt6__2;
        this.Sb = l50_0;
        this.D40 = l50_0.nA();
        this.MV = l50_0.f9();
        this.U20 = (l50_0.Tz() == 2);
        this.Kr0 = new FJ(ae);
        this.ul0 = new String[this.Kr0.size()][][];
        this.Cg0 = new short[this.Kr0.size()][][];
    }

    public NdsTextBank() {
        this.h8 = lpt6__2.Q80;
        this.Sb = null;
        this.ul0 = new String[0][0][0];
        this.Cg0 = new short[0][0][0];
        this.D40 = false;
        this.U20 = false;
        this.MV = false;
        this.Kr0 = null;
    }

    public final String ra0(int i1, int i2, int i3) {
        i1 = this.E1(i1);
        if (i1 < 0 || i1 >= this.ul0.length) {
            return "--";
        }
        if (this.D40 && this.U20) {
            i2 = kt0;
        }
        if (this.ul0[i1] == null) {
            this.VJ0(i1);
        }
        if (i2 < 0 || i2 >= this.ul0[i1].length) {
            return "--";
        }
        if (i3 < 0 || i3 >= this.ul0[i1][i2].length) {
            return "--";
        }
        return this.ul0[i1][i2][i3];
    }

    public final void x30(int i1, int i2, String v3, int i4) {
        i1 = this.E1(i1);
        if (i1 < 0 || i1 >= this.ul0.length) {
            return;
        }
        if (this.ul0[i1] == null) {
            this.VJ0(i1);
        }
        if (i2 < 0 || i2 >= this.ul0[i1].length) {
            return;
        }
        if (i4 < 0 || i4 >= this.ul0[i1][i2].length) {
            return;
        }
        this.ul0[i1][i2][i4] = v3;
    }

    public final String[] Sd(int i1) {
        int i2 = 0;
        if (this.D40 && this.U20) {
            i2 = kt0;
        }
        i1 = this.E1(i1);
        if (i1 < 0 || i1 >= this.ul0.length) {
            return oo;
        }
        if (this.ul0[i1] == null) {
            this.VJ0(i1);
        }
        if (i2 < 0 || i2 >= this.ul0[i1].length) {
            i2 = 0;
        }
        return this.ul0[i1][i2];
    }

    public synchronized void VJ0(int i1) {
        if (this.ul0[i1] != null) {
            return;
        }
        ByteBuffer v2 = this.Kr0.GJ(i1).MH(false);
        short i3 = v2.getShort();
        short i4 = v2.getShort();
        v2.getInt();
        v2.getInt();
        int[] v5 = new int[i3];
        this.ul0[i1] = new String[i3][i4];
        this.Cg0[i1] = new short[i3][i4];
        for (int i6 = 0; i6 < i3; i6++) {
            v5[i6] = v2.getInt();
        }
        short[] v6 = new short[3];
        StringBuilder v7 = new StringBuilder();
        for (int i8 = 0; i8 < i3; i8++) {
            int i9 = 31881;
            v2.position(v5[i8]);
            v2.getInt();
            int[] v10 = new int[i4];
            short[] v11 = new short[i4];
            for (int i12 = 0; i12 < i4; i12++) {
                v10[i12] = v2.getInt();
                v11[i12] = v2.getShort();
                this.Cg0[i1][i8][i12] = v2.getShort();
            }
            for (int i12 = 0; i12 < i4; i12++) {
                v7.setLength(0);
                v2.position(v5[i8] + v10[i12]);
                int i13 = 0;
                int i14 = 0;
                int i15 = i9;
                while (i14 < v11[i12]) {
                    short i16 = (short) (v2.getShort() ^ i15);
                    if (i13 != 0) {
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            int i19 = i16 & 0xFFFF;
                            int i20 = i19 >> i17;
                            if (i17 >= 16) {
                                i17 -= 16;
                                if (i17 <= 0) {
                                    continue;
                                }
                                i19 = (i18 | ((i19 << (9 - i17)) & 511));
                                if ((i19 & 0xFF) == 255) {
                                    break;
                                }
                                if (i19 != 0 && i19 != 1) {
                                    v7.append((char) i19);
                                }
                                continue;
                            }
                            i16 = (short) (i20 & 511);
                            if ((i16 & 0xFF) == 255) {
                                break;
                            }
                            if (i16 != 0 && i16 != 1) {
                                v7.append((char) i16);
                            }
                            i16 = (short) (i17 + 9);
                            if (i16 < 16) {
                                i18 = (i19 >> i16) & 511;
                                i16 = (short) (i17 + 18);
                            }
                            i15 = ((i15 << 3) | (i15 >> 13)) & 0xFFFF;
                            if (v2.remaining() < 2) {
                                break;
                            }
                            short i17_new = (short) (v2.getShort() ^ i15);
                            i14++;
                            int i16_prev = i16;
                            i16 = i17_new;
                            i17 = i16_prev;
                        }
                    } else if (i16 == -1) {
                        break;
                    } else if (i16 == -2) {
                        if (v7.length() < 2 || v7.charAt(v7.length() - 2) != '\n' || v7.charAt(v7.length() - 1) != '\n') {
                            v7.append("\n");
                        }
                    } else if (i16 == -3840) {
                        i13 = 1;
                    } else if (i16 == -4096) {
                        v6[0] = 0;
                        v6[1] = 0;
                        v6[2] = 0;
                        for (int i16_idx = 0; i16_idx < 3; i16_idx++) {
                            i15 = ((i15 << 3) | (i15 >> 13)) & 0xFFFF;
                            short sVal = (short) (v2.getShort() ^ i15);
                            if (sVal == 0) break;
                            v6[i16_idx] = sVal;
                        }
                        short s0 = v6[0];
                        if (s0 != -256 && (s0 < -17152 || s0 > -17146)) {
                            if (s0 == -16896 || s0 == -16895) {
                                v7.append("\n\n");
                            } else if (s0 == -16894) {
                                v7.append(String.format("{DELAY_%1$02X}", v6[2]));
                            } else if (s0 >= -16893 && s0 <= -16887) {
                                // ignored
                            } else {
                                v7.append(String.format("{%1$02X}", v6[2]));
                            }
                        }
                    } else if (i16 == 9325) {
                        v7.append((char) 9794);
                    } else if (i16 == 9326) {
                        v7.append((char) 9792);
                    } else if (i16 == 9350) {
                        v7.append("PK");
                    } else if (i16 == 9351) {
                        v7.append("MN");
                    } else if (i16 < 0 || i16 > 10) {
                        v7.append((char) i16);
                    }
                    i15 = ((i15 << 3) | (i15 >> 13)) & 0xFFFF;
                    i14++;
                }
                int i13_add = i9 + 10627;
                if (i13_add > 65535) {
                    i9 = i9 - 54909;
                } else {
                    i9 = i13_add;
                }
                this.ul0[i1][i8][i12] = v7.toString();
            }
        }
    }

    public int E1(int i1) {
        if (!this.D40) {
            return i1;
        }
        if (this.h8 == lpt6__2.YG0) {
            return i1;
        }
        if (i1 == 24) return 25;
        if (i1 == 25) return 26;
        if (i1 == 34) return 35;
        if (i1 == 35) return 34;
        switch (i1) {
            case 0: return 0;
            case 1: return 4;
            case 2: return 5;
            case 3: return 6;
            case 4: return 7;
            case 5: return 8;
            case 6: return 9;
            case 7: return 10;
            case 8: return 11;
            case 9: return 12;
            case 10: return 13;
            case 11: return 14;
            case 12: return 15;
            case 13: return 16;
            case 14: return 17;
            case 15: return 18;
            case 16: return 1;
            case 17: return 2;
            case 18: return 3;
            case 19: return 21;
            case 202: return 203;
            case 203: return 204;
            case 204: return 202;
            default: return i1;
        }
    }
}
