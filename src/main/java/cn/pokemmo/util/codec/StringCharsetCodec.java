package cn.pokemmo.util.codec;

import f.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;

public class StringCharsetCodec {

    public final int[] kT;
    public int jy0;
    public final byte[] O9;
    public int er;
    public int uy0;
    public int Vw;
    public Float ye0;
    public boolean sd;
    public final int[] Zq;
    public final PushbackInputStream f70;
    public final c50_0 TK;
    public final byte[] dK0;
    public final AE0[] LE;
    public byte[] cOn;
    public boolean Wq;

    public StringCharsetCodec(InputStream v1) {
        this.kT = new int[433];
        this.O9 = new byte[1732];
        this.Zq = new int[]{
            0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071
        };
        this.TK = new c50_0();
        this.dK0 = new byte[4];
        this.LE = new AE0[1];
        this.cOn = null;
        this.Wq = true;

        if (v1 == null) {
            throw new NullPointerException("in");
        }
        BufferedInputStream bis = new BufferedInputStream(v1);
        DD0(bis);
        this.Wq = true;
        this.f70 = new PushbackInputStream(bis, 1732);
        IH();
    }

    public static Go0 gw(int i0, Exception v1) {
        Go0 go0 = new Go0(Go0.ri(i0), v1);
        go0.COm8 = i0;
        return go0;
    }

    @SuppressWarnings("unchecked")
    private static <E extends Throwable> RuntimeException sneakyThrow(Throwable e) throws E {
        throw (E) e;
    }

    public static int u10(BufferedInputStream v0) {
        byte[] v1 = new byte[4];
        int i2 = -10;
        try {
            v0.read(v1, 0, 3);
            if (v1[0] == 73 && v1[1] == 68 && v1[2] == 51) {
                v0.read(v1, 0, 3);
                v0.read(v1, 0, 4);
                i2 = (v1[0] << 21) + (v1[1] << 14) + (v1[2] << 7) + v1[3];
            }
        } catch (IOException e) {
            throw sneakyThrow(e);
        }
        return i2 + 10;
    }

    public static String Sm(byte[] v0, int i1, int i2) {
        int i3 = 1;
        String v4 = null;
        try {
            String[] v5 = new String[]{"ISO-8859-1", "UTF16", "UTF-16BE", "UTF-8"};
            String v2 = v5[v0[i1]];
            int i0 = i1 + i3;
            int i1_rem = i2 - i3;
            v4 = new String(v0, i0, i1_rem, v2);
        } catch (UnsupportedEncodingException ignored) {
        }
        return v4;
    }

    public final void qe0() {
        try {
            this.f70.close();
        } catch (IOException e) {
            throw sneakyThrow(gw(258, e));
        }
    }

    public final c50_0 k0() {
        c50_0 v1 = null;
        try {
            v1 = sT();
            if (this.Wq) {
                v1.En(this.O9);
                this.Wq = false;
            }
        } catch (Throwable th) {
            if (th instanceof Go0) {
                Go0 v2 = (Go0) th;
                int i3 = v2.COm8;
                if (i3 == 261) {
                    try {
                        IH();
                        v1 = sT();
                    } catch (Throwable e) {
                        if (e instanceof Go0) {
                            int i2 = ((Go0) e).COm8;
                            if (i2 != 260) {
                                throw sneakyThrow(gw(i2, (Exception) e));
                            }
                        } else {
                            throw sneakyThrow(e);
                        }
                    }
                } else if (i3 != 260) {
                    throw sneakyThrow(gw(i3, v2));
                }
            } else {
                throw sneakyThrow(th);
            }
        }
        return v1;
    }

    public final void IH() {
        this.jy0 = -1;
        this.er = -1;
        this.uy0 = -1;
    }

    public final boolean jO(int i1, int i2, int i3) {
        boolean i0;
        if (i2 == 0) {
            i0 = (i1 & 0xFFE00000) == 0xFFE00000;
        } else if ((i1 & -521216) != i3 || ((i1 & 192) == 192) != this.sd) {
            i0 = false;
        } else {
            i0 = true;
        }
        if (i0) {
            i0 = ((i1 >>> 10) & 3) != 3;
        }
        if (i0) {
            i0 = ((i1 >>> 17) & 3) != 0;
        }
        if (i0) {
            i0 = ((i1 >>> 19) & 3) != 1;
        }
        return i0;
    }

    public final int DA(int i1) {
        int i2 = this.uy0;
        int i3 = i2 + i1;
        if (this.er < 0) {
            this.er = 0;
        }
        if (i3 <= 32) {
            int ret = (this.kT[this.er] >>> (32 - i3)) & this.Zq[i1];
            this.uy0 = i2 + i1;
            if (this.uy0 == 32) {
                this.uy0 = 0;
                this.er++;
            }
            return ret;
        } else {
            int[] v2 = this.kT;
            int i4 = this.er;
            int low16 = v2[i4] & 0xFFFF;
            this.er = i4 + 1;
            int next = v2[this.er] & 0xFFFF0000;
            int combined = ((low16 << 16) & 0xFFFF0000) | ((next >>> 16) & 0xFFFF);
            int ret = (combined >>> (48 - i3)) & this.Zq[i1];
            this.uy0 = i3 - 32;
            return ret;
        }
    }

    public final void DD0(BufferedInputStream v1) {
        int i2 = -1;
        try {
            v1.mark(10);
            if (v1 == null) {
                throw new IOException();
            }
            i2 = u10(v1);
            try {
                v1.reset();
            } catch (IOException ignored) {
            }
        } catch (IOException ignored) {
            try {
                v1.reset();
            } catch (IOException ignored2) {
            }
        } catch (Throwable th) {
            try {
                v1.reset();
            } catch (IOException ignored) {
            }
            throw th;
        }

        if (i2 > 0) {
            try {
                this.cOn = new byte[i2];
                v1.read(this.cOn, 0, i2);
                hm0(this.cOn);
            } catch (IOException ignored) {
            }
        }
    }

    public final void hm0(byte[] v1) {
        if (v1 == null) {
            return;
        }
        String v2 = new String(v1, 0, 3);
        if (!"ID3".equals(v2)) {
            return;
        }
        int i2 = v1[3] & 0xFF;
        if (i2 < 2 || i2 > 4) {
            return;
        }
        Float v3 = null;
        Float v4 = null;
        int i5 = 10;
        try {
            while (i5 < v1.length && v1[i5] > 0) {
                String frameId;
                int frameSize;
                if (i2 == 3 || i2 == 4) {
                    frameId = new String(v1, i5, 4);
                    frameSize = ((v1[i5 + 4] << 24) & 0xFF000000)
                              | ((v1[i5 + 5] << 16) & 0x00FF0000)
                              | ((v1[i5 + 6] << 8) & 0x0000FF00)
                              | (v1[i5 + 7] & 0xFF);
                    i5 += 10;
                } else {
                    frameId = new String(v1, i5, 3);
                    frameSize = ((v1[i5 + 3] << 16))
                              + ((v1[i5 + 4] << 8))
                              + (v1[i5 + 5]);
                    i5 += 6;
                }
                if ("TXXX".equals(frameId)) {
                    String text = Sm(v1, i5, frameSize);
                    String[] parts = text.split("\u0000");
                    if (parts.length == 2) {
                        String desc = parts[0];
                        String value = parts[1];
                        if ("replaygain_track_peak".equals(desc)) {
                            v4 = Float.valueOf(Float.parseFloat(value));
                            if (v3 != null) {
                                break;
                            }
                        } else if ("replaygain_track_gain".equals(desc)) {
                            v3 = Float.valueOf(Float.parseFloat(value.replace(" dB", "")) + 3.0f);
                            if (v4 != null) {
                                break;
                            }
                        }
                    }
                }
                i5 += frameSize;
            }
            if (v3 != null && v4 != null) {
                this.ye0 = Float.valueOf((float) Math.pow(10.0, (double) (v3.floatValue() / 20.0f)));
                this.ye0 = Float.valueOf(Math.min(1.0f / v4.floatValue(), this.ye0.floatValue()));
            }
        } catch (RuntimeException ignored) {
        }
    }

    public final c50_0 sT() {
        if (this.jy0 == -1) {
            c50_0 v1 = this.TK;
            AE0[] v2 = this.LE;
            int i3 = 0;
            while (true) {
                int i4 = v1.Kp;
                if (tF(this.dK0, 0, 3) != 3) {
                    throw sneakyThrow(gw(260, null));
                }
                int i5 = ((this.dK0[0] << 16) & 0x00FF0000)
                       | ((this.dK0[1] << 8) & 0x0000FF00)
                       | (this.dK0[2] & 0xFF);
                do {
                    i5 <<= 8;
                    if (tF(this.dK0, 3, 1) != 1) {
                        throw sneakyThrow(gw(260, null));
                    }
                    i5 |= this.dK0[3] & 0xFF;
                } while (!jO(i5, i4, this.Vw));

                if (v1.Kp == 0) {
                    int i4_wn = (i5 >>> 19) & 1;
                    v1.wn = i4_wn;
                    if (((i5 >>> 20) & 1) == 0) {
                        if (i4_wn != 0) {
                            Go0 go0 = new Go0(Go0.ri(256), null);
                            go0.COm8 = 256;
                            throw sneakyThrow(go0);
                        }
                        v1.wn = 2;
                    }
                    v1.gg0 = (i5 >>> 10) & 3;
                    if (v1.gg0 == 3) {
                        Go0 go0 = new Go0(Go0.ri(256), null);
                        go0.COm8 = 256;
                        throw sneakyThrow(go0);
                    }
                }

                int i4_layer = (4 - (i5 >>> 17)) & 3;
                v1.t90 = i4_layer;
                int i6 = (i5 >>> 16) & 1;
                v1.Ul0 = i6;
                int i7 = (i5 >>> 12) & 15;
                v1.xc = i7;
                int i8 = (i5 >>> 9) & 1;
                int i9 = (i5 >>> 6) & 3;
                v1.fJ = i9;
                int i10 = (i5 >>> 4) & 3;
                v1.z4 = i10;
                if (i9 == 1) {
                    v1.zg0 = (i10 << 2) + 4;
                } else {
                    v1.zg0 = 0;
                }

                if (i4_layer == 1) {
                    v1.yZ = 32;
                } else {
                    int i10_sub;
                    if (i9 == 3) {
                        i10_sub = i7;
                    } else if (i7 == 4) {
                        i10_sub = 1;
                    } else {
                        i10_sub = i7 - 4;
                    }
                    if (i10_sub == 1 || i10_sub == 2) {
                        if (v1.gg0 == 2) {
                            v1.yZ = 12;
                        } else {
                            v1.yZ = 8;
                        }
                    } else if (v1.gg0 == 1 || (i10_sub >= 3 && i10_sub <= 5)) {
                        v1.yZ = 27;
                    } else {
                        v1.yZ = 30;
                    }
                }

                if (v1.zg0 > v1.yZ) {
                    v1.zg0 = v1.yZ;
                }

                if (i4_layer == 1) {
                    int i4_framesize = (c50_0.JF0[v1.wn][0][i7] * 12) / c50_0.FK0[v1.wn][v1.gg0];
                    v1.et0 = i4_framesize;
                    if (i8 != 0) {
                        v1.et0 = i4_framesize + 1;
                    }
                    v1.et0 <<= 2;
                    v1.import$ = 0;
                } else {
                    int i11 = v1.wn;
                    int i7_framesize = (c50_0.JF0[i11][i4_layer - 1][i7] * 144) / c50_0.FK0[i11][v1.gg0];
                    v1.et0 = i7_framesize;
                    if (i11 == 0 || i11 == 2) {
                        v1.et0 = i7_framesize >> 1;
                    }
                    if (i8 != 0) {
                        v1.et0++;
                    }
                    if (i4_layer == 3) {
                        int i7_side;
                        if (i11 == 1) {
                            i7_side = (i9 == 3) ? 17 : 32;
                        } else {
                            i7_side = (i9 == 3) ? 9 : 17;
                        }
                        int i4_len = v1.et0 - i7_side;
                        int i6_crc = (i6 == 0) ? 2 : 0;
                        v1.import$ = i4_len - i6_crc - 4;
                    } else {
                        v1.import$ = 0;
                    }
                }

                v1.et0 -= 4;
                int i4_f = v1.et0;
                byte[] v6 = this.O9;
                int i7_pos = 0;
                int i8_total = 0;
                int i9_rem = i4_f;
                while (i9_rem > 0) {
                    try {
                        int i10_r = this.f70.read(v6, i7_pos, i9_rem);
                        if (i10_r == -1) {
                            while (i9_rem-- > 0) {
                                v6[i7_pos++] = 0;
                            }
                            break;
                        }
                        i8_total += i10_r;
                        i7_pos += i10_r;
                        i9_rem -= i10_r;
                    } catch (IOException e) {
                        throw sneakyThrow(gw(258, e));
                    }
                }

                this.jy0 = i4_f;
                this.er = -1;
                this.uy0 = -1;
                if (v1.et0 >= 0 && i8_total != v1.et0) {
                    Go0 go0 = new Go0(Go0.ri(261), null);
                    go0.COm8 = 261;
                    throw sneakyThrow(go0);
                }

                int i4_kp = v1.Kp;
                int i6_peek = tF(this.dK0, 0, 4);
                int i8_peek = ((this.dK0[0] << 24) & 0xFF000000)
                            | ((this.dK0[1] << 16) & 0x00FF0000)
                            | ((this.dK0[2] << 8) & 0x0000FF00)
                            | (this.dK0[3] & 0xFF);
                try {
                    this.f70.unread(this.dK0, 0, i6_peek);
                } catch (IOException ignored) {
                }

                if (i6_peek != 0 && (i6_peek != 4 || !jO(i8_peek, i4_kp, this.Vw))) {
                    if (this.er == -1 && this.uy0 == -1 && this.jy0 > 0) {
                        try {
                            this.f70.unread(this.O9, 0, this.jy0);
                        } catch (IOException ignored) {
                            Go0 go0 = new Go0(Go0.ri(258), null);
                            go0.COm8 = 258;
                            throw sneakyThrow(go0);
                        }
                    }
                } else {
                    if (v1.Kp == 0) {
                        v1.Kp = 1;
                        this.Vw = i5 & -521216;
                        this.sd = (i5 & 192) == 192;
                    }
                    i3 = 1;
                }

                if (i3 != 0) {
                    i3 = 0;
                    byte[] v4 = this.O9;
                    int i6_len = this.jy0;
                    int i7_idx = 0;
                    int k = 0;
                    while (i7_idx < i6_len) {
                        int b0 = v4[i7_idx];
                        int b1 = (i7_idx + 1 < i6_len) ? v4[i7_idx + 1] : 0;
                        int b2 = (i7_idx + 2 < i6_len) ? v4[i7_idx + 2] : 0;
                        int b3 = (i7_idx + 3 < i6_len) ? v4[i7_idx + 3] : 0;
                        this.kT[k++] = ((b0 << 24) & 0xFF000000)
                                     | ((b1 << 16) & 0x00FF0000)
                                     | ((b2 << 8) & 0x0000FF00)
                                     | (b3 & 0xFF);
                        i7_idx += 4;
                    }
                    this.er = 0;
                    this.uy0 = 0;
                    if (v1.Ul0 == 0) {
                        v1.wA0 = (short) DA(16);
                        if (v1.cz == null) {
                            v1.cz = new AE0();
                        }
                        v1.cz.pI(i5, 16);
                        v2[0] = v1.cz;
                    } else {
                        v2[0] = null;
                    }
                    break;
                }
            }
        }
        return this.TK;
    }

    public final int tF(byte[] v1, int i2, int i3) {
        int i4 = 0;
        while (i3 > 0) {
            try {
                int i5 = this.f70.read(v1, i2, i3);
                if (i5 == -1) {
                    break;
                }
                i4 += i5;
                i2 += i5;
                i3 -= i5;
            } catch (IOException e) {
                throw sneakyThrow(gw(258, e));
            }
        }
        return i4;
    }
}
