package cn.pokemmo.rom.nds.terrain;

import f.*;
import java.nio.ByteBuffer;

public class NdsTerrainChunkFooter extends ab0_2 implements Cloneable {
    public final int K7;
    public int ZQ;
    public int hS;
    public short[][][][] Jk;
    public o2_0 Np;
    public boolean Bi;

    public NdsTerrainChunkFooter(l50_0 v1, short i2, Ae v3) {
        super(v1, i2, v3);
        this.hS = 0;
        this.Bi = false;
        if (v1.Tz() == 3) {
            this.K7 = 16;
        } else {
            this.K7 = 20;
        }
        this.qB0 = 32;
        this.N70 = 32;
    }

    public NdsTerrainChunkFooter(qj0_1 v1) {
        super(v1);
        this.K7 = v1.K7;
        this.hS = v1.hS;
        this.Bi = v1.Bi;
        this.Jk = v1.Jk;
        this.qB0 = v1.qB0;
        this.N70 = v1.N70;
        this.ZQ = v1.ZQ;
        this.Np = v1.Np;
    }

    public final void nk() {
        if (this.Bi) {
            return;
        }
        this.Bi = true;
        ByteBuffer buf = this.il.j90();
        byte i2 = this.H50.Tz();
        int pos = buf.position();
        int i4 = buf.getInt();
        int i5 = buf.getInt();
        int i6 = buf.getInt();
        buf.getInt();
        int i7 = 52;
        if (i2 != 3) {
            buf.getShort();
            i7 = buf.getShort();
        }
        int v = pos + this.K7 + i4;
        this.eo = v;
        this.vW = this.eo + i5;
        this.ZQ = this.vW + i6;
        this.hS = i5 / 48;
        if (i2 != 3) {
            buf.position(buf.position() + i7);
            this.vW += i7;
            this.eo += i7;
            this.ZQ += i7;
        }
        short[][] v3 = new short[this.qB0][this.N70];
        for (int y = 0; y < this.N70; y++) {
            for (int x = 0; x < this.qB0; x++) {
                v3[x][y] = buf.getShort();
            }
        }
        buf.position(this.ZQ);
        o2_0 v4 = new o2_0(i2, buf, this.M2);
        this.Np = v4;
        if (i2 == 3) {
            short m = this.M2;
            if (m == 28) {
                v4.fn();
            } else if (m == 171) {
                v4.SG0();
            } else if (m == 188) {
                v4.CV();
            } else if (m == 235) {
                v4.md();
            }
        } else if (i2 == 4) {
            switch (this.M2) {
                case 17:
                    v4.iy0(27, 28, 5.0f);
                    break;
                case 81:
                    v4.yy0();
                    break;
                case 84:
                    v4.iy0(0, 22, 3.0f);
                    break;
                case 141:
                    v4.iy0(18, 14, 0.5f);
                    break;
                case 237:
                    v4.ng0();
                    break;
                case 254:
                    v4.f4();
                    break;
                case 261:
                    v4.rd0();
                    break;
                case 360:
                    v4.iy0(6, 2, 1.0f);
                    this.Np.iy0(8, 2, 1.0f);
                    break;
                case 397:
                    v4.iy0(4, 8, 1.0f);
                    break;
                case 404:
                    v4.iy0(7, 11, 1.0f);
                    break;
                case 414:
                    v4.iy0(6, 2, 1.0f);
                    break;
                case 429:
                    v4.iy0(6, 27, 1.0f);
                    break;
                case 481:
                    v4.Lf();
                    break;
                case 523:
                    v4.N80();
                    break;
                case 529:
                    v4.iy0(2, 10, 3.0f);
                    break;
                case 558:
                    v4.iy0(31, 13, 0.0f);
                    break;
                case 583:
                    v4.iy0(18, 1, 7.0f);
                    this.Np.iy0(2, 1, 7.0f);
                    break;
                case 584:
                    v4.iy0(6, 5, 7.5f);
                    this.Np.iy0(7, 5, 7.5f);
                    break;
                case 604:
                    v4.iy0(18, 1, 1.0f);
                    break;
                case 608:
                    v4.Rc0();
                    break;
                case 611:
                    v4.iy0(11, 18, 2.0f);
                    break;
                case 625:
                    v4.iy0(0, 25, 2.0f);
                    this.Np.iy0(18, 26, 1.0f);
                    break;
            }
        }

        this.Jk = new short[this.Np.n30()][2][this.qB0][this.N70];
        for (int i1 = 0; i1 < this.Np.n30(); i1++) {
            for (int y = 0; y < this.N70; y++) {
                for (int x = 0; x < this.qB0; x++) {
                    short val = v3[x][y];
                    short s6 = (short) (val & 0xFF);
                    short s7 = (short) ((val >> 8) & 0xFF);
                    if (this.Np.n30() > 1) {
                        int maxLayer = 0;
                        float maxH = -999.0f;
                        for (int l = 0; l < this.Np.n30(); l++) {
                            float h = this.Np.a80(l, x, y);
                            if (h > maxH) {
                                maxH = h;
                                maxLayer = l;
                            }
                        }
                        if (s6 == 125) {
                            if (i1 != maxLayer) {
                                s6 = 33;
                            }
                        } else if (s6 == 117) {
                            if (i1 != maxLayer) {
                                s6 = 168;
                            }
                        } else if (s6 == 115 || s6 == 124) {
                            if (i1 != maxLayer) {
                                s6 = 21;
                            }
                        } else if (s6 == 114) {
                            if (i1 != maxLayer) {
                                s6 = 8;
                            }
                        } else if (s6 == 122 || s6 == 118) {
                            if (i1 != maxLayer) {
                                s6 = 0;
                            }
                        } else if (s6 == 34) {
                            if (i1 == maxLayer) {
                                s6 = 21;
                            } else {
                                s6 = 8;
                            }
                        }
                    }
                    if (i2 == 4 && s6 == 62 && s7 == 128) {
                        s6 = 0;
                    }
                    this.Jk[i1][0][x][y] = s6;
                    this.Jk[i1][1][x][y] = s7;
                }
            }
        }

        if (i2 == 3) {
            this.O();
        } else if (i2 == 4) {
            this.FB0();
        }

        if (i2 == 3 && this.M2 == 435) {
            this.Jk[0][1][16][10] = (short) -128;
            this.Jk[0][1][16][11] = (short) -128;
            this.Jk[0][1][16][12] = (short) -128;
            this.Jk[0][1][17][10] = (short) -128;
            this.Jk[0][0][17][11] = (short) 0;
            this.Np.iy0(17, 11, (this.Np.if0(17, 11) + 1.0f));
            this.Jk[0][0][17][12] = (short) 0;
            this.Np.iy0(17, 12, (this.Np.if0(17, 12) + 0.5f));
            this.Jk[0][1][18][10] = (short) -128;
            this.Jk[0][1][18][11] = (short) -128;
            this.Jk[0][1][18][12] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 154) {
            this.Jk[0][1][16][10] = (short) -128;
            this.Jk[0][1][16][11] = (short) -128;
            this.Jk[0][1][16][12] = (short) -128;
            this.Jk[0][1][17][10] = (short) -128;
            this.Np.iy0(17, 11, (this.Np.if0(17, 11) + 1.0f));
            this.Np.iy0(17, 12, (this.Np.if0(17, 12) + 0.5f));
            this.Jk[0][1][18][10] = (short) -128;
            this.Jk[0][1][18][11] = (short) -128;
            this.Jk[0][1][18][12] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 150) {
            this.Jk[0][1][11][16] = (short) -128;
            this.Jk[0][1][11][17] = (short) -128;
            this.Jk[0][1][11][18] = (short) -128;
            this.Jk[0][1][12][16] = (short) -128;
            this.Jk[0][0][12][17] = (short) 0;
            this.Np.iy0(12, 17, (this.Np.if0(12, 17) + 1.0f));
            this.Jk[0][0][12][18] = (short) 0;
            this.Np.iy0(12, 18, (this.Np.if0(12, 18) + 0.5f));
            this.Jk[0][1][13][16] = (short) -128;
            this.Jk[0][1][13][17] = (short) -128;
            this.Jk[0][1][13][18] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 42) {
            this.Jk[0][1][20][8] = (short) -128;
            this.Jk[0][1][20][9] = (short) -128;
            this.Jk[0][1][20][10] = (short) -128;
            this.Jk[0][1][21][8] = (short) -128;
            this.Np.iy0(21, 9, (this.Np.if0(21, 9) + 1.0f));
            this.Np.iy0(21, 10, (this.Np.if0(21, 10) + 0.5f));
            this.Jk[0][1][22][8] = (short) -128;
            this.Jk[0][1][22][9] = (short) -128;
            this.Jk[0][1][22][10] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 90) {
            this.Jk[0][1][31][2] = (short) -128;
            this.Jk[0][1][31][3] = (short) -128;
            this.Jk[0][1][31][4] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 91) {
            this.Jk[0][1][0][2] = (short) -128;
            this.Np.iy0(0, 3, (this.Np.if0(0, 3) + 1.0f));
            this.Np.iy0(0, 4, (this.Np.if0(0, 4) + 0.5f));
            this.Jk[0][1][1][2] = (short) -128;
            this.Jk[0][1][1][3] = (short) -128;
            this.Jk[0][1][1][4] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 643) {
            this.Jk[0][1][6][3] = (short) -128;
            this.Jk[0][1][6][4] = (short) -128;
            this.Jk[0][1][6][5] = (short) -128;
            this.Jk[0][1][7][3] = (short) -128;
            this.Jk[0][0][7][4] = (short) 0;
            this.Np.iy0(7, 4, (this.Np.if0(7, 4) + 1.0f));
            this.Jk[0][0][7][5] = (short) 0;
            this.Np.iy0(7, 5, (this.Np.if0(7, 5) + 0.5f));
            this.Jk[0][1][8][3] = (short) -128;
            this.Jk[0][1][8][4] = (short) -128;
            this.Jk[0][1][8][5] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 26) {
            this.Jk[0][1][6][13] = (short) -128;
            this.Jk[0][1][6][14] = (short) -128;
            this.Jk[0][1][6][15] = (short) -128;
            this.Jk[0][1][7][13] = (short) -128;
            this.Np.iy0(7, 14, (this.Np.if0(7, 14) + 1.0f));
            this.Np.iy0(7, 15, (this.Np.if0(7, 15) + 0.5f));
            this.Jk[0][1][8][13] = (short) -128;
            this.Jk[0][1][8][14] = (short) -128;
            this.Jk[0][1][8][15] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 65) {
            this.Jk[0][1][17][12] = (short) -128;
            this.Jk[0][1][17][13] = (short) -128;
            this.Jk[0][1][17][14] = (short) -128;
            this.Jk[0][1][18][12] = (short) -128;
            this.Np.iy0(18, 13, (this.Np.if0(18, 13) + 1.0f));
            this.Np.iy0(18, 14, (this.Np.if0(18, 14) + 0.5f));
            this.Jk[0][1][19][12] = (short) -128;
            this.Jk[0][1][19][13] = (short) -128;
            this.Jk[0][1][19][14] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 343) {
            this.Jk[0][1][5][26] = (short) -128;
            this.Jk[0][1][5][27] = (short) -128;
            this.Jk[0][1][5][28] = (short) -128;
            this.Jk[0][1][6][26] = (short) -128;
            this.Np.iy0(6, 27, (this.Np.if0(6, 27) + 1.0f));
            this.Np.iy0(6, 28, (this.Np.if0(6, 28) + 0.5f));
            this.Jk[0][1][7][26] = (short) -128;
            this.Jk[0][1][7][27] = (short) -128;
            this.Jk[0][1][7][28] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 107) {
            this.Jk[0][1][15][3] = (short) -128;
            this.Jk[0][1][15][4] = (short) -128;
            this.Jk[0][1][15][5] = (short) -128;
            this.Jk[0][1][16][3] = (short) -128;
            this.Jk[0][0][16][4] = (short) 0;
            this.Np.iy0(16, 4, (this.Np.if0(16, 4) + 1.0f));
            this.Jk[0][0][16][5] = (short) 0;
            this.Np.iy0(16, 5, (this.Np.if0(16, 5) + 0.5f));
            this.Jk[0][1][17][3] = (short) -128;
            this.Jk[0][1][17][4] = (short) -128;
            this.Jk[0][1][17][5] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 13) {
            this.Jk[0][1][7][20] = (short) -128;
            this.Jk[0][1][7][21] = (short) -128;
            this.Jk[0][1][7][22] = (short) -128;
            this.Jk[0][1][8][20] = (short) -128;
            this.Np.iy0(8, 21, (this.Np.if0(8, 21) + 1.0f));
            this.Np.iy0(8, 22, (this.Np.if0(8, 22) + 0.5f));
            this.Jk[0][1][9][20] = (short) -128;
            this.Jk[0][1][9][21] = (short) -128;
            this.Jk[0][1][9][22] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 163) {
            this.Jk[0][1][7][27] = (short) -128;
            this.Jk[0][1][7][28] = (short) -128;
            this.Jk[0][1][7][29] = (short) -128;
            this.Jk[0][1][8][27] = (short) -128;
            this.Np.iy0(8, 28, (this.Np.if0(8, 28) + 1.0f));
            this.Np.iy0(8, 29, (this.Np.if0(8, 29) + 0.5f));
            this.Jk[0][1][9][27] = (short) -128;
            this.Jk[0][1][9][28] = (short) -128;
            this.Jk[0][1][9][29] = (short) -128;
        }
        if (i2 == 4 && this.M2 == 607) {
            this.Jk[0][1][16][20] = (short) -128;
            this.Jk[0][1][16][21] = (short) -128;
            this.Jk[0][1][16][22] = (short) -128;
            this.Jk[0][1][17][20] = (short) -128;
            this.Jk[0][0][17][21] = (short) 0;
            this.Np.iy0(17, 21, (this.Np.if0(17, 21) + 1.0f));
            this.Jk[0][0][17][22] = (short) 0;
            this.Np.iy0(17, 22, (this.Np.if0(17, 22) + 0.5f));
            this.Jk[0][1][18][20] = (short) -128;
            this.Jk[0][1][18][21] = (short) -128;
            this.Jk[0][1][18][22] = (short) -128;
        }
        if (i2 == 4 && this.M2 == 49) {
            this.Jk[0][1][19][10] = (short) -128;
            this.Jk[0][1][19][11] = (short) -128;
            this.Jk[0][1][19][12] = (short) -128;
            this.Jk[0][1][20][10] = (short) -128;
            this.Np.iy0(20, 11, (this.Np.if0(20, 11) + 1.0f));
            this.Np.iy0(20, 12, (this.Np.if0(20, 12) + 0.5f));
            this.Jk[0][1][21][10] = (short) -128;
            this.Jk[0][1][21][11] = (short) -128;
            this.Jk[0][1][21][12] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 123) {
            this.Jk[0][1][14][10] = (short) -128;
            this.Jk[0][1][14][11] = (short) -128;
            this.Jk[0][1][14][12] = (short) -128;
            this.Jk[0][1][15][10] = (short) -128;
            this.Np.iy0(15, 11, (this.Np.if0(15, 11) + 1.0f));
            this.Np.iy0(15, 12, (this.Np.if0(15, 12) + 0.5f));
            this.Jk[0][1][16][10] = (short) -128;
            this.Jk[0][1][16][11] = (short) -128;
            this.Jk[0][1][16][12] = (short) -128;
        }
        if (i2 == 4 && this.M2 == 56) {
            this.Jk[0][1][18][3] = (short) -128;
            this.Jk[0][1][18][4] = (short) -128;
            this.Jk[0][1][18][5] = (short) -128;
            this.Jk[0][1][19][3] = (short) -128;
            this.Np.iy0(19, 4, (this.Np.if0(19, 4) + 1.0f));
            this.Np.iy0(19, 5, (this.Np.if0(19, 5) + 0.5f));
            this.Jk[0][1][20][3] = (short) -128;
            this.Jk[0][1][20][4] = (short) -128;
            this.Jk[0][1][20][5] = (short) -128;
        }
        if (i2 == 4 && this.M2 == 76) {
            this.Jk[0][1][14][8] = (short) -128;
            this.Jk[0][1][14][9] = (short) -128;
            this.Jk[0][1][14][10] = (short) -128;
            this.Jk[0][1][15][8] = (short) -128;
            this.Np.iy0(15, 9, (this.Np.if0(15, 9) + 1.0f));
            this.Np.iy0(15, 10, (this.Np.if0(15, 10) + 0.5f));
            this.Jk[0][1][16][8] = (short) -128;
            this.Jk[0][1][16][9] = (short) -128;
            this.Jk[0][1][16][10] = (short) -128;
        }
        if (i2 == 4 && this.M2 == 45) {
            this.Jk[0][1][27][26] = (short) -128;
            this.Jk[0][1][27][27] = (short) -128;
            this.Jk[0][1][27][28] = (short) -128;
            this.Jk[0][1][28][26] = (short) -128;
            this.Np.iy0(28, 27, (this.Np.if0(28, 27) + 1.0f));
            this.Np.iy0(28, 28, (this.Np.if0(28, 28) + 0.5f));
            this.Jk[0][1][29][26] = (short) -128;
            this.Jk[0][1][29][27] = (short) -128;
            this.Jk[0][1][29][28] = (short) -128;
        }
        if (i2 == 4 && this.M2 == 618) {
            this.Jk[0][1][16][15] = (short) -128;
            this.Jk[0][1][16][16] = (short) -128;
            this.Jk[0][1][16][17] = (short) -128;
            this.Jk[0][1][17][15] = (short) -128;
            this.Np.iy0(17, 16, (this.Np.if0(17, 16) + 1.0f));
            this.Np.iy0(17, 17, (this.Np.if0(17, 17) + 0.5f));
            this.Jk[0][1][18][15] = (short) -128;
            this.Jk[0][1][18][16] = (short) -128;
            this.Jk[0][1][18][17] = (short) -128;
        }
        if (i2 == 4 && this.M2 == 596) {
            this.Jk[0][1][25][7] = (short) -128;
            this.Jk[0][1][25][8] = (short) -128;
            this.Jk[0][1][25][9] = (short) -128;
            this.Jk[0][1][26][7] = (short) -128;
            this.Jk[0][0][26][8] = (short) 0;
            this.Np.iy0(26, 8, (this.Np.if0(26, 8) + 1.0f));
            this.Jk[0][0][26][9] = (short) 0;
            this.Np.iy0(26, 9, (this.Np.if0(26, 9) + 0.5f));
            this.Jk[0][1][27][7] = (short) -128;
            this.Jk[0][1][27][8] = (short) -128;
            this.Jk[0][1][27][9] = (short) -128;
        }
        if (i2 == 4 && this.M2 == 102) {
            this.Jk[0][1][31][17] = (short) -128;
            this.Jk[0][1][31][18] = (short) -128;
            this.Jk[0][1][31][19] = (short) -128;
        }
        if (i2 == 4 && this.M2 == 103) {
            this.Jk[0][1][0][17] = (short) -128;
            this.Np.iy0(0, 18, (this.Np.if0(0, 18) + 1.0f));
            this.Np.iy0(0, 19, (this.Np.if0(0, 19) + 0.5f));
            this.Jk[0][1][1][17] = (short) -128;
            this.Jk[0][1][1][18] = (short) -128;
            this.Jk[0][1][1][19] = (short) -128;
        }
        if (i2 == 4 && this.M2 == 110) {
            this.Jk[0][1][23][19] = (short) -128;
            this.Jk[0][1][23][20] = (short) -128;
            this.Jk[0][1][23][21] = (short) -128;
            this.Jk[0][1][24][19] = (short) -128;
            this.Np.iy0(24, 20, (this.Np.if0(24, 20) + 1.0f));
            this.Np.iy0(24, 21, (this.Np.if0(24, 21) + 0.5f));
            this.Jk[0][1][25][19] = (short) -128;
            this.Jk[0][1][25][20] = (short) -128;
            this.Jk[0][1][25][21] = (short) -128;
        }
        if (i2 == 4 && this.M2 == 505) {
            this.Jk[0][1][5][10] = (short) -128;
            this.Jk[0][1][5][11] = (short) -128;
            this.Jk[0][1][5][12] = (short) -128;
            this.Jk[0][1][6][10] = (short) -128;
            this.Jk[0][0][6][11] = (short) 0;
            this.Np.iy0(6, 11, (this.Np.if0(6, 11) + 1.0f));
            this.Jk[0][0][6][12] = (short) 0;
            this.Np.iy0(6, 12, (this.Np.if0(6, 12) + 0.5f));
            this.Jk[0][1][7][10] = (short) -128;
            this.Jk[0][1][7][11] = (short) -128;
            this.Jk[0][1][7][12] = (short) -128;
        }
        if (i2 == 4 && this.M2 == 113) {
            this.Jk[0][1][30][20] = (short) -128;
            this.Jk[0][1][30][21] = (short) -128;
            this.Jk[0][1][30][22] = (short) -128;
            this.Jk[0][1][31][20] = (short) -128;
            this.Np.iy0(31, 21, (this.Np.if0(31, 21) + 1.0f));
            this.Np.iy0(31, 22, (this.Np.if0(31, 22) + 0.5f));
        }
        if (i2 == 4 && this.M2 == 112) {
            this.Jk[0][1][0][20] = (short) -128;
            this.Jk[0][1][0][21] = (short) -128;
            this.Jk[0][1][0][22] = (short) -128;
        }
        if (i2 == 4 && this.M2 == 27) {
            this.Jk[0][1][5][11] = (short) -128;
            this.Jk[0][1][5][12] = (short) -128;
            this.Jk[0][1][5][13] = (short) -128;
            this.Jk[0][1][6][11] = (short) -128;
            this.Np.iy0(6, 12, (this.Np.if0(6, 12) + 1.0f));
            this.Np.iy0(6, 13, (this.Np.if0(6, 13) + 0.5f));
            this.Jk[0][1][7][11] = (short) -128;
            this.Jk[0][1][7][12] = (short) -128;
            this.Jk[0][1][7][13] = (short) -128;
        }
        if (i2 == 4 && this.M2 == 31) {
            this.Jk[0][1][13][7] = (short) -128;
            this.Jk[0][1][13][8] = (short) -128;
            this.Jk[0][1][13][9] = (short) -128;
            this.Jk[0][1][14][7] = (short) -128;
            this.Np.iy0(14, 8, (this.Np.if0(14, 8) + 1.0f));
            this.Np.iy0(14, 9, (this.Np.if0(14, 9) + 0.5f));
            this.Jk[0][1][15][7] = (short) -128;
            this.Jk[0][1][15][8] = (short) -128;
            this.Jk[0][1][15][9] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 562) {
            this.Jk[0][1][13][11] = (short) -128;
            this.Jk[0][1][13][12] = (short) -128;
            this.Jk[0][1][13][13] = (short) -128;
            this.Jk[0][1][14][11] = (short) -128;
            this.Jk[0][0][14][12] = (short) 0;
            this.Np.iy0(14, 12, (this.Np.if0(14, 12) + 1.0f));
            this.Jk[0][0][14][13] = (short) 0;
            this.Np.iy0(14, 13, (this.Np.if0(14, 13) + 0.5f));
            this.Jk[0][1][15][11] = (short) -128;
            this.Jk[0][1][15][12] = (short) -128;
            this.Jk[0][1][15][13] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 562) {
            this.Jk[0][1][17][11] = (short) -128;
            this.Jk[0][1][17][12] = (short) -128;
            this.Jk[0][1][17][13] = (short) -128;
            this.Jk[0][1][18][11] = (short) -128;
            this.Jk[0][0][18][12] = (short) 0;
            this.Np.iy0(18, 12, (this.Np.if0(18, 12) + 1.0f));
            this.Jk[0][0][18][13] = (short) 0;
            this.Np.iy0(18, 13, (this.Np.if0(18, 13) + 0.5f));
            this.Jk[0][1][19][11] = (short) -128;
            this.Jk[0][1][19][12] = (short) -128;
            this.Jk[0][1][19][13] = (short) -128;
        }
        if (i2 == 3 && this.M2 == 666) {
            this.Jk[0][1][6][7] = (short) -128;
            this.Jk[0][1][6][8] = (short) -128;
            this.Jk[0][1][6][9] = (short) -128;
            this.Jk[0][1][7][7] = (short) -128;
            this.Jk[0][0][7][8] = (short) 0;
            this.Np.iy0(7, 8, (this.Np.if0(7, 8) + 1.0f));
            this.Jk[0][0][7][9] = (short) 0;
            this.Np.iy0(7, 9, (this.Np.if0(7, 9) + 0.5f));
            this.Jk[0][1][8][7] = (short) -128;
            this.Jk[0][1][8][8] = (short) -128;
            this.Jk[0][1][8][9] = (short) -128;
        }
    }

    public final short[][][][] D4() {
        return this.Jk;
    }

    public final void FB0() {
        int m = this.M2;
        if (m == 478) {
            this.Jk[0][0][6][3] = 0;
        } else if (m == 493) {
            this.Jk[0][1][3][10] = 128;
            this.Jk[0][1][13][10] = 128;
        } else if (m == 495) {
            this.Jk[0][0][15][9] = 0;
        }
    }

    public final void O() {
        int m = this.M2;
        if (m == 333) {
            this.Np.iy0(2, 2, 0.0f);
        } else if (m == 274) {
            for (int i1 = 0; i1 < this.Jk.length; i1++) {
                this.Jk[i1][0][10][13] = 0;
            }
        } else if (m == 225) {
            for (int i1 = 0; i1 < 4; i1++) {
                for (int i2 = 0; i2 < 32; i2++) {
                    for (int i3 = 0; i3 < 32; i3++) {
                        int i4 = 1;
                        if (i3 > 27) {
                            i4 = 0;
                        }
                        if (i1 == 0) {
                            if (i2 < 6 || i3 < 8 || !(i2 <= 26 || i3 >= 21) ||
                                (i2 == 14 && i3 == 25) ||
                                (i2 == 18 && i3 == 25) ||
                                (i2 == 9 && i3 >= 8 && i3 <= 11) ||
                                (i3 == 11 && i2 >= 9 && i2 <= 26) ||
                                (i2 == 17 && i3 >= 11 && i3 <= 15) ||
                                (i3 == 18 && i2 >= 9 && i2 <= 19) ||
                                (i2 == 19 && i3 >= 18 && i3 <= 27) ||
                                (i3 == 20 && i2 >= 19 && i2 <= 23) ||
                                (i2 == 23 && i3 >= 20 && i3 <= 24) ||
                                (i3 == 24 && i2 >= 23 && i2 <= 27) ||
                                (i2 == 27 && i3 >= 20 && i3 <= 24)) {
                                i4 = 0;
                            }
                        } else if (i1 == 1) {
                            if (i3 < 3 ||
                                (i2 >= 1 && i2 <= 5 && i3 <= 19) ||
                                (i2 >= 6 && i2 <= 9 && i3 >= 12 && i3 <= 19) ||
                                (i2 >= 10 && i2 <= 19 && i3 >= 15 && i3 <= 27) ||
                                (i2 >= 20 && i2 <= 30 && i3 >= 24 && i3 <= 27) ||
                                (i2 == 9 && i3 >= 3 && i3 <= 14) ||
                                (i2 == 13 && i3 >= 6 && i3 <= 14) ||
                                (i2 == 17 && i3 >= 11 && i3 <= 14) ||
                                (i2 == 19 && i3 >= 6 && i3 <= 11) ||
                                (i2 == 22 && i3 >= 3 && i3 <= 16) ||
                                (i2 == 27 && i3 >= 6 && i3 <= 11) ||
                                (i2 == 7 && i3 >= 22 && i3 <= 27) ||
                                (i2 == 23 && i3 >= 20 && i3 <= 23) ||
                                (i2 == 27 && i3 >= 16 && i3 <= 23) ||
                                (i3 == 6 && i2 >= 13 && i2 <= 19) ||
                                (i3 == 6 && i2 >= 24 && i2 <= 27) ||
                                (i3 == 11 && i2 >= 13 && i2 <= 30) ||
                                (i3 == 16 && i2 >= 22 && i2 <= 28) ||
                                (i3 == 20 && i2 >= 20 && i2 <= 23) ||
                                (i3 == 22 && i2 >= 3 && i2 <= 7)) {
                                i4 = 0;
                            }
                            if ((i2 == 7 && i3 == 9) || (i2 == 16 && i3 == 9)) {
                                i4 = 0;
                            }
                            if (i3 == 22 && (i2 == 10 || i2 == 11 || i2 == 18 || i2 == 19)) {
                                i4 = 1;
                            }
                        } else if (i1 == 2) {
                            if (i3 < 3 || i3 > 27 ||
                                (i2 >= 1 && i2 <= 5 && i3 >= 18 && i3 <= 23) ||
                                (i2 >= 6 && i2 <= 23 && i3 >= 11 && i3 <= 23) ||
                                (i2 >= 9 && i2 <= 15 && i3 <= 5) ||
                                (i2 >= 9 && i2 <= 13 && i3 >= 6 && i3 <= 10) ||
                                (i2 >= 18 && i2 <= 23 && i3 <= 5) ||
                                (i2 >= 20 && i2 <= 23 && i3 >= 6 && i3 <= 10) ||
                                (i2 >= 24 && i2 <= 30 && i3 >= 15 && i3 <= 23) ||
                                (i2 >= 8 && i2 <= 22 && i3 >= 24 && i3 <= 27) ||
                                (i2 == 3 && i3 >= 3 && i3 <= 11) ||
                                (i2 == 25 && i3 >= 7 && i3 <= 14) ||
                                (i2 == 27 && i3 >= 7 && i3 <= 14) ||
                                (i2 == 24 && i3 >= 24 && i3 <= 27) ||
                                (i3 == 7 && i2 >= 6 && i2 <= 8) ||
                                (i3 == 11 && i2 >= 1 && i2 <= 3) ||
                                (i3 == 7 && i2 >= 24 && i2 <= 30 && i2 != 26)) {
                                i4 = 0;
                            }
                            if ((i2 == 7 && i3 == 9) || (i2 == 16 && i3 == 9)) {
                                i4 = 0;
                            }
                            if ((i3 == 4 && ((i2 >= 9 && i2 <= 10) || (i2 >= 14 && i2 <= 15))) ||
                                (i3 == 4 && ((i2 >= 18 && i2 <= 19) || (i2 >= 22 && i2 <= 23))) ||
                                (i3 == 12 && ((i2 >= 6 && i2 <= 7) || (i2 >= 22 && i2 <= 23))) ||
                                (i3 == 26 && ((i2 >= 8 && i2 <= 9) || (i2 >= 21 && i2 <= 22))) ||
                                (i2 == 2 && ((i3 >= 18 && i3 <= 19) || (i3 >= 22 && i3 <= 23))) ||
                                (i2 == 26 && ((i3 >= 15 && i3 <= 16) || (i3 >= 22 && i3 <= 23))) ||
                                (i2 == 29 && ((i3 >= 15 && i3 <= 16) || (i3 >= 22 && i3 <= 23)))) {
                                i4 = 1;
                            }
                        } else if (i1 == 3) {
                            i4 = 0;
                            if ((i2 >= 15 && i2 <= 17 && i3 >= 3 && i3 <= 5) ||
                                (i2 >= 14 && i2 <= 18 && i3 >= 6 && i3 <= 10) ||
                                (i2 >= 1 && i2 <= 8 && i3 >= 8 && i3 <= 10) ||
                                (i2 >= 28 && i2 <= 30 && i3 >= 3 && i3 <= 5) ||
                                (i2 >= 1 && i2 <= 3 && i3 >= 25 && i3 <= 27) ||
                                (i2 >= 28 && i2 <= 30 && i3 >= 25 && i3 <= 27) ||
                                (i2 == 2 && ((i3 >= 11 && i3 <= 12) || (i3 >= 23 && i3 <= 24))) ||
                                (i2 == 29 && ((i3 >= 6 && i3 <= 7) || (i3 >= 23 && i3 <= 24))) ||
                                (i3 == 4 && ((i2 >= 18 && i2 <= 19) || (i2 >= 26 && i2 <= 27))) ||
                                (i3 == 26 && ((i2 >= 4 && i2 <= 5) || (i2 >= 26 && i2 <= 27)))) {
                                i4 = 1;
                            }
                        }

                        short[][][] v4 = this.Jk[i1];
                        short[] v5 = v4[1][i2];
                        short i6 = (i4 != 0) ? (short) 0 : (short) 128;
                        v5[i3] = i6;
                        if (i1 != 0 || i2 != 16 || i3 != 27) {
                            v4[0][i2][i3] = 0;
                        }
                    }
                }
            }
        }
    }
}
