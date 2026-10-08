package cn.pokemmo.rom.nds.event;

import f.*;

import java.nio.ByteBuffer;

public class BwMapEventMatrix extends AbstractNdsMapEventMatrix implements Cloneable {
    public short[][][][] r4;
    public short[][][] ZK;
    public boolean Xi0;

    public BwMapEventMatrix(nj0_0 v1, short i2, Ae v3) {
        super(v1, i2, v3);
        this.Xi0 = false;
    }

    public BwMapEventMatrix(BwMapEventMatrix v1) {
        super(v1);
        this.Xi0 = false;
        this.r4 = v1.r4;
        this.ZK = v1.ZK;
    }

    public final void nk() {
        if (this.Xi0) {
            return;
        }
        this.Xi0 = true;
        ByteBuffer v1 = this.il.j90();
        this.p90 = v1.getInt();
        this.vW = v1.getInt();
        int i2 = this.p90;
        if (i2 == 149326) {
            this.mc0 = new int[0];
            this.eo = v1.getInt();
            v1.getInt();
        } else if (i2 == 214098 || i2 == 213591) {
            int[] v2 = new int[1];
            v2[0] = v1.getInt();
            this.mc0 = v2;
            this.eo = v1.getInt();
            v1.getInt();
        } else {
            int[] v2 = new int[2];
            v2[0] = v1.getInt();
            v2[1] = v1.getInt();
            this.mc0 = v2;
            this.eo = v1.getInt();
            v1.getInt();
        }
        this.r4 = new short[this.mc0.length][][][];
        this.ZK = new short[this.mc0.length][][];
        for (int i = 0; i < this.mc0.length; i++) {
            v1.position(this.mc0[i]);
            short i3 = v1.getShort();
            short i4 = v1.getShort();
            if (this.qB0 == 0 && this.N70 == 0) {
                this.qB0 = i3;
                this.N70 = i4;
            }
            if (this.qB0 != i3 || this.N70 != i4) {
                throw new RuntimeException(this.il.SL + " Size mismatch:" + i3 + " " + i4);
            }
            this.r4[i] = new short[4][i3][i4];
            for (int i5 = 0; i5 < i4; i5++) {
                for (int i6 = 0; i6 < i3; i6++) {
                    for (int i7 = 0; i7 < 4; i7++) {
                        if (this.p90 == 214098) {
                            v1.position(v1.position() + 4);
                        }
                        this.r4[i][i7][i6][i5] = v1.getShort();
                    }
                }
            }
            int offset;
            if (i <= 0 && this.mc0.length >= 2) {
                offset = this.mc0[1];
            } else {
                offset = this.eo;
            }
            int i3_len = (offset - v1.position()) / 8;
            this.ZK[i] = new short[i3_len][4];
            for (short i4_idx = 0; i4_idx < i3_len; i4_idx++) {
                for (int i5 = 0; i5 < 4; i5++) {
                    this.ZK[i][i4_idx][i5] = v1.getShort();
                }
            }
        }
        if (this.M2 == 524) {
            int i1 = this.mc0[0];
            this.mc0 = new int[] { i1, 0, 0, 0 };
            short[][][][] v1_arr = new short[4][][][];
            short[][][] oldR4_0 = this.r4[0];
            this.r4 = v1_arr;
            v1_arr[0] = oldR4_0;
            this.r4[0][3][14][20] = 129;
            this.r4[0][2][14][20] = 1;
            this.r4[0][3][16][20] = 129;
            this.r4[0][2][16][20] = 1;
            for (int i1_idx = 1; i1_idx < 4; i1_idx++) {
                this.r4[i1_idx] = new short[4][this.qB0][this.N70];
                for (int i2_idx = 0; i2_idx < this.N70; i2_idx++) {
                    for (int i3_idx = 0; i3_idx < this.qB0; i3_idx++) {
                        boolean flag = false;
                        if (i3_idx > 6 && i3_idx < 24 && i2_idx > 18 && i2_idx < 27) {
                            flag = true;
                        }
                        if (i1_idx == 1) {
                            if (i3_idx < 8 && (i2_idx == 19 || i2_idx == 23)) {
                                flag = false;
                            }
                            if (i3_idx > 22 && (i2_idx == 19 || i2_idx == 23)) {
                                flag = false;
                            }
                            if (i3_idx > 12 && i2_idx < 23) {
                                flag = false;
                            }
                            if (i3_idx > 17) {
                                flag = false;
                            }
                        }
                        if (i1_idx == 2) {
                            if (i3_idx < 8 && i2_idx <= 23) {
                                flag = false;
                            }
                            if (i3_idx > 22 && (i2_idx == 19 || i2_idx == 23)) {
                                flag = false;
                            }
                            if (i3_idx > 7 && i3_idx < 18 && i2_idx > 19 && i2_idx < 23) {
                                flag = false;
                            }
                            if (i3_idx == 16 && i2_idx == 23) {
                                flag = false;
                            }
                            if (i3_idx == 13 && i2_idx == 23) {
                                flag = false;
                            }
                        }
                        if (i1_idx == 3) {
                            if (i3_idx < 8 && (i2_idx == 19 || i2_idx == 23)) {
                                flag = false;
                            }
                            if (i3_idx > 22 && (i2_idx == 19 || i2_idx == 23)) {
                                flag = false;
                            }
                            if (i3_idx > 12 && i3_idx < 18 && i2_idx > 19 && i2_idx < 23) {
                                if (i3_idx != 15 && !(i2_idx == 21 && i3_idx > 13 && i3_idx < 17)) {
                                    flag = false;
                                }
                            }
                            if (i3_idx < 13 && i2_idx > 23) {
                                flag = false;
                            }
                            if (i3_idx == 19 && i2_idx == 19) {
                                flag = false;
                            }
                        }
                        if ((i3_idx == 8 || i3_idx == 12) && (i2_idx == 20 || i2_idx == 24)) {
                            flag = false;
                        }
                        if ((i3_idx == 13 || i3_idx == 17) && (i2_idx == 20 || i2_idx == 24)) {
                            flag = false;
                        }
                        if ((i3_idx == 18 || i3_idx == 22) && (i2_idx == 20 || i2_idx == 24)) {
                            flag = false;
                        }
                        this.r4[i1_idx][3][i3_idx][i2_idx] = (short) (flag ? 128 : 129);
                        this.r4[i1_idx][2][i3_idx][i2_idx] = (short) (flag ? 0 : 1);
                    }
                }
            }
            short[][][] oldZK = this.ZK;
            short[][][] newZK = new short[4][0][0];
            this.ZK = newZK;
            newZK[0] = oldZK[0];
        } else if (this.M2 == 215) {
            for (int i1 = 0; i1 < this.N70; i1++) {
                for (int i2_idx = 0; i2_idx < this.qB0; i2_idx++) {
                    if (i2_idx > 5 && i2_idx < 23 && i1 > 12 && i1 < 26) {
                        this.r4[0][3][i2_idx][i1] = 128;
                        this.r4[0][2][i2_idx][i1] = 0;
                    }
                }
            }
        } else if (this.M2 == 392) {
            for (int i1 = 0; i1 < this.N70; i1++) {
                for (int i2_idx = 0; i2_idx < this.qB0; i2_idx++) {
                    if (i2_idx > 9 && i2_idx < 18 && i1 > 25 && i1 < 30) {
                        this.r4[0][3][i2_idx][i1] = 128;
                        this.r4[0][2][i2_idx][i1] = 0;
                    }
                }
            }
        } else if (this.M2 == 393) {
            for (int i1 = 0; i1 < this.N70; i1++) {
                for (int i2_idx = 0; i2_idx < this.qB0; i2_idx++) {
                    if (i2_idx > 9 && i2_idx < 18 && i1 > 17 && i1 < 22) {
                        this.r4[0][3][i2_idx][i1] = 128;
                        this.r4[0][2][i2_idx][i1] = 0;
                    }
                }
            }
        } else if (this.M2 == 394) {
            for (int i1 = 0; i1 < this.N70; i1++) {
                for (int i2_idx = 0; i2_idx < this.qB0; i2_idx++) {
                    if ((i2_idx > 13 && i2_idx < 22 && i1 > 0 && i1 < 5) || (i2_idx > 14 && i2_idx < 23 && i1 > 9 && i1 < 14)) {
                        this.r4[0][3][i2_idx][i1] = 128;
                        this.r4[0][2][i2_idx][i1] = 0;
                    }
                }
            }
        } else if (this.M2 == 395) {
            for (int i1 = 0; i1 < this.N70; i1++) {
                for (int i2_idx = 0; i2_idx < this.qB0; i2_idx++) {
                    if ((i2_idx > -1 && i2_idx < 8 && i1 > 3 && i1 < 8)
                            || (i2_idx > 11 && i2_idx < 20 && i1 > 3 && i1 < 8)
                            || (i2_idx > 11 && i2_idx < 20 && i1 > 11 && i1 < 16)) {
                        this.r4[0][3][i2_idx][i1] = 128;
                        this.r4[0][2][i2_idx][i1] = 0;
                    }
                }
            }
        } else if (this.M2 == 533) {
            for (int i1 = 0; i1 < this.N70; i1++) {
                for (int i2_idx = 0; i2_idx < this.qB0; i2_idx++) {
                    if (((i2_idx > 3 && i2_idx < 19) && (i1 == 3 || i1 == 12))
                            || ((i2_idx == 3 || i2_idx == 19) && (i1 > 3 && i1 < 12))) {
                        this.r4[0][3][i2_idx][i1] = 129;
                        this.r4[0][2][i2_idx][i1] = 1;
                    }
                }
            }
        } else if (this.M2 == 232) {
            for (int i1 = 0; i1 < 3; i1++) {
                for (int i2_idx = 0; i2_idx < 3; i2_idx++) {
                    Ro0(i2_idx * 8 + 9, i1 * 8 + 9, 6, 5);
                }
            }
        } else if (this.M2 == 233) {
            for (int i1 = 0; i1 < 3; i1++) {
                for (int i2_idx = 0; i2_idx < 2; i2_idx++) {
                    if (i2_idx != 1 || i1 != 0) {
                        Ro0(i2_idx * 8 + 1, i1 * 8 + 9, 6, 5);
                    }
                }
            }
            Ro0(48, 16, 2, 2);
            Ro0(48, 20, 2, 2);
            Ro0(48, 24, 2, 2);
            Ro0(48, 28, 2, 2);
        } else if (this.M2 == 234) {
            Ro0(9, 33, 5, 4);
            Ro0(9, 41, 5, 4);
            Ro0(17, 41, 5, 4);
            Ro0(26, 42, 4, 3);
            Ro0(21, 32, 11, 6);
            Ro0(16, 48, 2, 2);
            Ro0(20, 48, 2, 2);
            Ro0(24, 48, 2, 2);
            Ro0(28, 48, 2, 2);
        } else if (this.M2 == 235) {
            Ro0(0, 0, 2, 6);
            Ro0(33, 41, 5, 4);
            Ro0(42, 42, 4, 3);
            Ro0(32, 48, 2, 2);
            Ro0(36, 48, 2, 2);
            Ro0(40, 48, 2, 2);
            Ro0(44, 48, 2, 2);
            this.r4[0][3][11][4] = 0;
            this.r4[0][2][11][4] = 0;
        }

        if (this.M2 == 337) {
            Ro0(42, 56, 1, 1);
            Ro0(42, 57, 1, 1);
            Ro0(42, 58, 1, 1);
            Ro0(43, 56, 1, 1);
            pd(11, 25);
            pd(11, 26);
            Ro0(44, 56, 1, 1);
            Ro0(44, 57, 1, 1);
            Ro0(44, 58, 1, 1);
        }
        if (this.M2 == 392) {
            Ro0(26, 19, 1, 1);
            Ro0(26, 20, 1, 1);
            Ro0(26, 21, 1, 1);
            Ro0(27, 19, 1, 1);
            pd(27, 20);
            pd(27, 21);
            Ro0(28, 19, 1, 1);
            Ro0(28, 20, 1, 1);
            Ro0(28, 21, 1, 1);
        }
        if (this.M2 == 2) {
            Ro0(748, 730, 1, 1);
            Ro0(748, 731, 1, 1);
            Ro0(748, 732, 1, 1);
            Ro0(749, 730, 1, 1);
            pd(13, 27);
            pd(13, 28);
            Ro0(750, 730, 1, 1);
            Ro0(750, 731, 1, 1);
            Ro0(750, 732, 1, 1);
        }
        if (this.M2 == 281) {
            Ro0(12, 42, 1, 1);
            Ro0(12, 43, 1, 1);
            Ro0(12, 44, 1, 1);
            Ro0(13, 42, 1, 1);
            pd(13, 11);
            pd(13, 12);
            Ro0(14, 42, 1, 1);
            Ro0(14, 43, 1, 1);
            Ro0(14, 44, 1, 1);
        }
        if (this.M2 == 95) {
            Ro0(714, 350, 1, 1);
            Ro0(714, 351, 1, 1);
        }
        if (this.M2 == 98) {
            Ro0(714, 352, 1, 1);
        }
        if (this.M2 == 95) {
            Ro0(715, 350, 1, 1);
            pd(11, 31);
        }
        if (this.M2 == 98) {
            pd(11, 0);
        }
        if (this.M2 == 95) {
            Ro0(716, 350, 1, 1);
            Ro0(716, 351, 1, 1);
        }
        if (this.M2 == 98) {
            Ro0(716, 352, 1, 1);
        }
        if (this.M2 == 361) {
            Ro0(5, 2, 1, 1);
            Ro0(5, 3, 1, 1);
            Ro0(5, 4, 1, 1);
            Ro0(6, 2, 1, 1);
            pd(6, 3);
            pd(6, 4);
            Ro0(7, 2, 1, 1);
            Ro0(7, 3, 1, 1);
            Ro0(7, 4, 1, 1);
        }
        if (this.M2 == 7) {
            Ro0(764, 622, 1, 1);
            Ro0(764, 623, 1, 1);
            Ro0(764, 624, 1, 1);
            Ro0(765, 622, 1, 1);
            pd(29, 15);
            pd(29, 16);
            Ro0(766, 622, 1, 1);
            Ro0(766, 623, 1, 1);
            Ro0(766, 624, 1, 1);
        }
        if (this.M2 == 26) {
            Ro0(648, 713, 1, 1);
            Ro0(648, 714, 1, 1);
            Ro0(648, 715, 1, 1);
            Ro0(649, 713, 1, 1);
            pd(9, 10);
            pd(9, 11);
            Ro0(650, 713, 1, 1);
            Ro0(650, 714, 1, 1);
            Ro0(650, 715, 1, 1);
        }
        if (this.M2 == 422) {
            Ro0(19, 23, 1, 1);
            Ro0(19, 24, 1, 1);
            Ro0(19, 25, 1, 1);
            Ro0(20, 23, 1, 1);
            pd(20, 24);
            pd(20, 25);
            Ro0(21, 23, 1, 1);
            Ro0(21, 24, 1, 1);
            Ro0(21, 25, 1, 1);
        }
        if (this.M2 == 351) {
            Ro0(43, 35, 1, 1);
            Ro0(43, 36, 1, 1);
            Ro0(43, 37, 1, 1);
            Ro0(44, 35, 1, 1);
            pd(12, 4);
            pd(12, 5);
            Ro0(45, 35, 1, 1);
            Ro0(45, 36, 1, 1);
            Ro0(45, 37, 1, 1);
        }
        if (this.M2 == 32) {
            Ro0(413, 568, 1, 1);
            Ro0(413, 569, 1, 1);
            Ro0(413, 570, 1, 1);
            Ro0(414, 568, 1, 1);
            pd(30, 25);
            pd(30, 26);
            Ro0(415, 568, 1, 1);
            Ro0(415, 569, 1, 1);
            Ro0(415, 570, 1, 1);
        }
        if (this.M2 == 451) {
            Ro0(38, 61, 1, 1);
            Ro0(38, 62, 1, 1);
            Ro0(38, 63, 1, 1);
            Ro0(39, 61, 1, 1);
            pd(7, 30);
            pd(7, 31);
            Ro0(40, 61, 1, 1);
            Ro0(40, 62, 1, 1);
            Ro0(40, 63, 1, 1);
        }
    }

    public final short[][][][] D4() {
        return this.r4;
    }

    public final void Ro0(int i1, int i2, int i3, int i4) {
        i1 %= this.qB0;
        i2 %= this.N70;
        for (short i5 = 0; i5 < i4; i5++) {
            for (short i6 = 0; i6 < i3; i6++) {
                this.r4[0][3][i1 + i6][i2 + i5] = 129;
                this.r4[0][2][i1 + i6][i2 + i5] = 1;
            }
        }
    }

    public final void pd(int i1, int i2) {
        this.r4[0][3][i1][i2] = 0;
    }
}
