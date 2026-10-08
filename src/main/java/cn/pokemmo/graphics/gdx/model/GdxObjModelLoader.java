package cn.pokemmo.graphics.gdx.model;

import f.*;


import com.badlogic.gdx.graphics.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GdxObjModelLoader extends ir_1 {
    public final UJ0 sS;
    public final UJ0 cQ;
    public final UJ0 Bz;
    public final es_1 C90;

    public GdxObjModelLoader() {
        this(null);
    }

    public GdxObjModelLoader(gq_1 gq_1Var) {
        super(gq_1Var);
        this.sS = new UJ0(300);
        this.cQ = new UJ0(300);
        this.Bz = new UJ0(200);
        this.C90 = new es_1(10);
    }

    public static int P60(int i, String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0) {
            return i + parseInt;
        }
        return parseInt - 1;
    }

    @Override
    public final y90_0 AO(Dn0 dn0, SH0 sh0) {
        boolean z = (sh0 instanceof hq_1) && ((hq_1) sh0).XD;
        kq_1 kq_1Var = new kq_1();
        Um0 um0 = new Um0("default");
        this.C90.Ue0(um0);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dn0.uf0()), 4096);
        int i = 0;
        try {
            String readLine;
            while ((readLine = bufferedReader.readLine()) != null) {
                String[] split = readLine.split("\\s+");
                if (split.length < 1) {
                    break;
                }
                if (split[0].length() != 0) {
                    char charAt = split[0].toLowerCase().charAt(0);
                    if (charAt != '#') {
                        if (charAt == 'v') {
                            if (split[0].length() == 1) {
                                this.sS.O6(Float.parseFloat(split[1]));
                                this.sS.O6(Float.parseFloat(split[2]));
                                this.sS.O6(Float.parseFloat(split[3]));
                            } else if (split[0].charAt(1) == 'n') {
                                this.cQ.O6(Float.parseFloat(split[1]));
                                this.cQ.O6(Float.parseFloat(split[2]));
                                this.cQ.O6(Float.parseFloat(split[3]));
                            } else if (split[0].charAt(1) == 't') {
                                this.Bz.O6(Float.parseFloat(split[1]));
                                this.Bz.O6(z ? 1.0f - Float.parseFloat(split[2]) : Float.parseFloat(split[2]));
                            }
                        } else if (charAt == 'f') {
                            es_1 es_1Var = um0.WQ;
                            for (int i2 = 1; i2 < split.length - 2; ) {
                                String[] split2 = split[1].split("/");
                                es_1Var.Ue0(Integer.valueOf(P60(this.sS.Or, split2[0])));
                                if (split2.length > 2) {
                                    if (i2 == 1) {
                                        um0.Jm = true;
                                    }
                                    es_1Var.Ue0(Integer.valueOf(P60(this.cQ.Or, split2[2])));
                                }
                                if (split2.length > 1 && split2[1].length() > 0) {
                                    if (i2 == 1) {
                                        um0.jB0 = true;
                                    }
                                    es_1Var.Ue0(Integer.valueOf(P60(this.Bz.Or, split2[1])));
                                }
                                int i3 = i2 + 1;
                                String[] split3 = split[i3].split("/");
                                es_1Var.Ue0(Integer.valueOf(P60(this.sS.Or, split3[0])));
                                if (split3.length > 2) {
                                    es_1Var.Ue0(Integer.valueOf(P60(this.cQ.Or, split3[2])));
                                }
                                if (split3.length > 1 && split3[1].length() > 0) {
                                    es_1Var.Ue0(Integer.valueOf(P60(this.Bz.Or, split3[1])));
                                }
                                String[] split4 = split[i2 + 2].split("/");
                                es_1Var.Ue0(Integer.valueOf(P60(this.sS.Or, split4[0])));
                                if (split4.length > 2) {
                                    es_1Var.Ue0(Integer.valueOf(P60(this.cQ.Or, split4[2])));
                                }
                                if (split4.length > 1 && split4[1].length() > 0) {
                                    es_1Var.Ue0(Integer.valueOf(P60(this.Bz.Or, split4[1])));
                                }
                                um0.Sz0++;
                                i2 = i3;
                            }
                        } else if (charAt == 'o' || charAt == 'g') {
                            if (split.length > 1) {
                                String str = split[1];
                                I2 ZD = this.C90.ZD();
                                boolean z2 = false;
                                while (ZD.hasNext()) {
                                    Um0 um02 = (Um0) ZD.next();
                                    if (um02.P9.equals(str)) {
                                        um0 = um02;
                                        z2 = true;
                                        break;
                                    }
                                }
                                if (!z2) {
                                    Um0 um03 = new Um0(str);
                                    this.C90.Ue0(um03);
                                    um0 = um03;
                                }
                            } else {
                                String str2 = "default";
                                I2 ZD2 = this.C90.ZD();
                                boolean z3 = false;
                                while (ZD2.hasNext()) {
                                    Um0 um04 = (Um0) ZD2.next();
                                    if (um04.P9.equals(str2)) {
                                        um0 = um04;
                                        z3 = true;
                                        break;
                                    }
                                }
                                if (!z3) {
                                    Um0 um05 = new Um0(str2);
                                    this.C90.Ue0(um05);
                                    um0 = um05;
                                }
                            }
                        } else if (split[0].equals("mtllib")) {
                            kq_1Var.Dw(dn0.Br().wp(split[1]));
                        } else if (split[0].equals("usemtl")) {
                            if (split.length == 1) {
                                um0.cOM6 = "default";
                            } else {
                                um0.cOM6 = split[1].replace('.', '_');
                            }
                        }
                    }
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            return null;
        }

        for (int i4 = 0; i4 < this.C90.KB; i4++) {
            if (((Um0) this.C90.get(i4)).Sz0 < 1) {
                this.C90.Tx0(i4);
                i4--;
            }
        }
        int i5 = this.C90.KB;
        if (i5 < 1) {
            return null;
        }
        y90_0 y90_0Var = new y90_0();
        for (int i6 = 0; i6 < i5; i6++) {
            Um0 um06 = (Um0) this.C90.get(i6);
            es_1 es_1Var2 = um06.WQ;
            int i7 = es_1Var2.KB;
            int i8 = um06.Sz0;
            boolean z4 = um06.Jm;
            boolean z5 = um06.jB0;
            int i9 = i8 * 3;
            int i10 = 3;
            if (z4) {
                i10 = 6;
            }
            if (z5) {
                i10 += 2;
            }
            float[] fArr = new float[i10 * i9];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i7) {
                int intValue = ((Integer) es_1Var2.get(i11++)).intValue() * 3;
                fArr[i12++] = this.sS.QJ0(intValue++);
                fArr[i12++] = this.sS.QJ0(intValue++);
                fArr[i12++] = this.sS.QJ0(intValue);
                if (z4) {
                    int intValue2 = ((Integer) es_1Var2.get(i11++)).intValue() * 3;
                    fArr[i12++] = this.cQ.QJ0(intValue2++);
                    fArr[i12++] = this.cQ.QJ0(intValue2++);
                    fArr[i12++] = this.cQ.QJ0(intValue2);
                }
                if (z5) {
                    int intValue3 = ((Integer) es_1Var2.get(i11++)).intValue() * 2;
                    fArr[i12++] = this.Bz.QJ0(intValue3++);
                    fArr[i12++] = this.Bz.QJ0(intValue3);
                }
            }
            if (i9 >= 32767) {
                i9 = 0;
            }
            short[] sArr = new short[i9];
            for (int i13 = 0; i13 < i9; i13++) {
                sArr[i13] = (short) i13;
            }
            es_1 es_1Var3 = new es_1();
            es_1Var3.Ue0(new kz_0(1, 3, "a_position"));
            if (z4) {
                es_1Var3.Ue0(new kz_0(8, 3, "a_normal"));
            }
            if (z5) {
                es_1Var3.Ue0(new kz_0(16, 2, "a_texCoord0"));
            }
            i++;
            String num = Integer.toString(i);
            String hw0 = um06.P9.equals("default") ? jj0_0.hw0("node", num) : um06.P9;
            um06.P9.equals("default");
            String hw02 = um06.P9.equals("default") ? jj0_0.hw0("part", num) : um06.P9;

            ui0_0 ui0_0Var = new ui0_0();
            ui0_0Var.OS = hw0;
            ui0_0Var.Dy0 = new C8(1.0f, 1.0f, 1.0f);
            ui0_0Var.X20 = new C8();
            ui0_0Var.IE0 = new me0_2();
            xu_0 xu_0Var = new xu_0();
            xu_0Var.Hi = hw02;
            xu_0Var.ys = um06.cOM6;
            ui0_0Var.Wu = new xu_0[]{xu_0Var};

            vx0 vx0Var = new vx0();
            vx0Var.a80 = hw02;
            vx0Var.Ky0 = sArr;
            vx0Var.Yu0 = 4;

            te_0 te_0Var = new te_0();
            te_0Var.Ef = (kz_0[]) es_1Var3.Mo0(kz_0.class);
            te_0Var.e90 = fArr;
            te_0Var.W = new vx0[]{vx0Var};

            y90_0Var.d9.Ue0(ui0_0Var);
            y90_0Var.Bz.Ue0(te_0Var);

            String str3 = um06.cOM6;
            I2 ZD3 = kq_1Var.O4.ZD();
            ef0_1 ef0_1Var = null;
            while (ZD3.hasNext()) {
                ef0_1 ef0_1Var2 = (ef0_1) ZD3.next();
                if (ef0_1Var2.dq0.equals(str3)) {
                    ef0_1Var = ef0_1Var2;
                    break;
                }
            }
            if (ef0_1Var == null) {
                ef0_1Var = new ef0_1();
                ef0_1Var.dq0 = str3;
                ef0_1Var.lF0 = new Color(Color.WHITE);
                kq_1Var.O4.Ue0(ef0_1Var);
            }
            y90_0Var.zK.Ue0(ef0_1Var);
        }

        if (this.sS.Or > 0) {
            this.sS.Or = 0;
        }
        if (this.cQ.Or > 0) {
            this.cQ.Or = 0;
        }
        if (this.Bz.Or > 0) {
            this.Bz.Or = 0;
        }
        if (this.C90.KB > 0) {
            this.C90.clear();
        }
        return y90_0Var;
    }
}
