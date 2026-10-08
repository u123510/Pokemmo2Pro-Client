package cn.pokemmo.io.file;

import f.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyValuePropertiesFileReader {
    public final es_1 Ow;
    public final es_1 bg0;

    public KeyValuePropertiesFileReader() {
        this.Ow = new es_1();
        this.bg0 = new es_1();
    }

    public KeyValuePropertiesFileReader(Dn0 dn0, Dn0 dn02, boolean z) {
        this.Ow = new es_1();
        this.bg0 = new es_1();
        C1(dn0, dn02, z);
    }

    public static int ow0(String str, String[] strArr) {
        if (str == null) {
            return 0;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return 0;
        }
        int indexOf = trim.indexOf(58);
        if (indexOf == -1) {
            return 0;
        }
        strArr[0] = trim.substring(0, indexOf).trim();
        int i = 1;
        int i2 = indexOf + 1;
        while (true) {
            int indexOf2 = trim.indexOf(44, i2);
            if (indexOf2 == -1) {
                strArr[i] = trim.substring(i2).trim();
                return i;
            }
            strArr[i] = trim.substring(i2, indexOf2).trim();
            i2 = indexOf2 + 1;
            if (i == 4) {
                return 4;
            }
            i++;
        }
    }

    public final void C1(Dn0 dn0, Dn0 dn02, boolean z) {
        String[] strArr = new String[5];
        nb_2 nb_2 = new nb_2(15, 0.99f);
        nb_2.WK0("size", new Lz(strArr));
        nb_2.WK0("format", new AH(strArr));
        nb_2.WK0("filter", new Iw0(strArr));
        nb_2.WK0("repeat", new qz_0(strArr));
        nb_2.WK0("pma", new y50_0(strArr));
        boolean[] zArr = new boolean[]{false};
        nb_2 nb_22 = new nb_2(127, 0.99f);
        nb_22.WK0("xy", new qk0_0(strArr));
        nb_22.WK0("size", new YF(strArr));
        nb_22.WK0("bounds", new xl0_0(strArr));
        nb_22.WK0("offset", new B70(strArr));
        nb_22.WK0("orig", new F(strArr));
        nb_22.WK0("offsets", new xa_2(strArr));
        nb_22.WK0("rotate", new zl_0(strArr));
        nb_22.WK0("index", new p0_0(strArr, zArr));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dn0.uf0()), 1024);
        try {
            String readLine = bufferedReader.readLine();
            while (readLine != null && readLine.trim().length() == 0) {
                readLine = bufferedReader.readLine();
            }
            while (readLine != null && readLine.trim().length() != 0 && ow0(readLine, strArr) != 0) {
                readLine = bufferedReader.readLine();
            }
            uj_2 uj_2 = null;
            es_1 es_1 = null;
            es_1 es_12 = null;
            while (readLine != null) {
                if (readLine.trim().length() == 0) {
                    uj_2 = null;
                    readLine = bufferedReader.readLine();
                } else if (uj_2 == null) {
                    uj_2 = new uj_2();
                    uj_2.u7 = dn02.wp(readLine);
                    while (true) {
                        readLine = bufferedReader.readLine();
                        if (ow0(readLine, strArr) == 0) {
                            this.Ow.Ue0(uj_2);
                            break;
                        }
                        wk0_1 wk0_1 = (wk0_1) nb_2.Wk0(strArr[0]);
                        if (wk0_1 != null) {
                            wk0_1.s2(uj_2);
                        }
                    }
                } else {
                    K40 k40 = new K40();
                    k40.wN = uj_2;
                    k40.Ew = readLine.trim();
                    if (z) {
                        k40.tV = true;
                    }
                    while (true) {
                        readLine = bufferedReader.readLine();
                        int ow0 = ow0(readLine, strArr);
                        if (ow0 == 0) {
                            if (k40.dN == 0 && k40.F == 0) {
                                k40.dN = k40.vQ;
                                k40.F = k40.wz;
                            }
                            if (es_1 != null && es_1.KB > 0) {
                                k40.FH0 = (String[]) es_1.Mo0(String.class);
                                k40.rK = (int[][]) es_12.Mo0(int[].class);
                                es_1.clear();
                                es_12.clear();
                            }
                            this.bg0.Ue0(k40);
                            break;
                        }
                        wk0_1 wk0_12 = (wk0_1) nb_22.Wk0(strArr[0]);
                        if (wk0_12 != null) {
                            wk0_12.s2(k40);
                        } else {
                            if (es_1 == null) {
                                es_1 = new es_1(8);
                                es_12 = new es_1(8);
                            }
                            es_1.Ue0(strArr[0]);
                            int[] iArr = new int[ow0];
                            int i = 0;
                            while (i < ow0) {
                                int i2 = i + 1;
                                try {
                                    iArr[i] = Integer.parseInt(strArr[i2]);
                                } catch (NumberFormatException unused) {
                                }
                                i = i2;
                            }
                            es_12.Ue0(iArr);
                        }
                    }
                }
            }
            KT.E1(bufferedReader);
            if (zArr[0]) {
                this.bg0.sort(new rU());
            }
        } catch (Exception e) {
            throw new nf_1("Error reading texture atlas file: " + dn0, e);
        } catch (Throwable th) {
            KT.E1(bufferedReader);
            throw th;
        }
    }
}
