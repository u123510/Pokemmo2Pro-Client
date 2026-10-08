package cn.pokemmo.rom.nds.model;

import f.*;


import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NitroOamData {
    public Rz0 yj0;
    public bc0_1 bs0;
    public final Ae qc;
    public final boolean wO;
    public i4_0[] vB;

    public NitroOamData(Ae var1) {
        this(var1, false);
    }

    public NitroOamData(Ae var1, boolean var2) {
        this.qc = var1;
        this.wO = var2;
        this.ty();
    }

    public static boolean RI0(int var0, int var1) {
        return var0 >= 0 && var0 < var1;
    }

    public final i4_0 Nz0(Gt0 var1, Tt0 var2, int var3) {
        return this.oQ(var1, var2, var3, 32, 32, 0);
    }

    public final i4_0 oQ(Gt0 var1, zd_0 var2, int var3, int var4, int var5, int var6) {
        bc0_1 var17;
        dg_0 var10000 = (var17 = this.bs0).bL0[var3];
        int var18 = var17.lN & 3;
        i4_0 var19;
        var19 = new i4_0(var4, var5, ix0_0.Vw);
        kh0_0[] var7;
        if ((var7 = var10000.mm0).length == 0) {
            System.out.println("No OAM");
        } else {
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
                kh0_0 var10;
                short var11;
                short var12;
                if ((var11 = (var10 = var7[var9]).Y4) != 0 && (var12 = var10.bt) != 0) {
                    int var36 = var10.le << var18;
                    xf_0 var13 = new xf_0();
                    byte[] var14 = var1.lJ0;
                    ft_1 var15 = var1.jr0;
                    in_1 var16 = var1.EC0;
                    var13.Zd0(var14, var11, var12, var15, var16);
                    byte[] var28;
                    int dataOffset = var36 * 32;
                    if (dataOffset >= 0 && dataOffset < (var28 = var13.lJ0).length) {
                        int var23;
                        byte[] var29;
                        var13.lJ0 = var29 = new byte[var23 = var28.length - dataOffset];
                        System.arraycopy(var28, dataOffset, var29, 0, var23);
                        dataOffset = var13.lJ0.length;
                        var13.DA0 = new byte[var13.eC0 / var13.ZL * dataOffset];
                    }

                    int palette = var10.up0;
                    if (palette >= var2.dc0.length) {
                        palette = 0;
                    }

                    for(int var30 = 0; var30 < (var14 = var13.DA0).length; ++var30) {
                        var14[var30] = (byte)palette;
                    }

                    int textureWidth = var13.LA;
                    int textureHeight = var13.v4;
                    i4_0 var27 = var13.NK(var2, textureWidth, textureHeight);
                    boolean var21 = var10.um0;
                    if (var21 || var10.ff0) {
                        i4_0 var37 = var27;
                        var27 = fp_2.La(var27, var21, var10.ff0);
                        var37.dispose();
                    }

                    int var31 = var4 / 2 + var10.Cl;
                    int var34 = var5 / 2;
                    int verticalOffset;
                    if (var6 == 0) {
                        verticalOffset = var10.lA0;
                    } else {
                        verticalOffset = var6;
                    }

                    verticalOffset = var34 + verticalOffset;
                    var19.NH0(var27, var31, verticalOffset);
                    var27.dispose();
                }
            }
        }

        return var19;
    }

    public final void DX(int var1, Bp0 var2, Bp0 var3) {
        dg_0 var4;
        dg_0 var10003 = var4 = this.bs0.bL0[var1];
        Bp0 var5 = var4.Ix0;
        var2.getClass();
        var2.x = var5.x;
        var2.y = var5.y;
        var5 = var10003.Zw0;
        var3.getClass();
        var3.x = var5.x;
        var3.y = var5.y;
    }

    public final void Q60(int var1, Gt0 var2, Tt0 var3, i4_0 var4, Bp0 var5, short[] var6) {
        Bp0 var7;
        var7 = new Bp0();
        Bp0 var8;
        var8 = new Bp0();
        this.DX(var1, var7, var8);
        i4_0 var9;
        if ((var9 = this.vB[var1]) == null) {
            var9 = new i4_0((int)var7.x, (int)var7.y, ix0_0.Vw);
            this.else$(var1, var2, var3, var9, var8);
            this.vB[var1] = var9;
        }

        if (var6 == null) {
            int var19 = (int)(var5.x - var8.x);
            var4.NH0(var9, var19, (int)(var5.y - var8.y));
        } else {
            IntBuffer var20 = var4.Rh0().asIntBuffer();
            IntBuffer var21 = var9.Rh0().asIntBuffer();
            Gdx2DPixmap var10002 = var4.XF;
            int var22 = var10002.SH;
            int var23 = var10002.mB0;
            Gdx2DPixmap var10001 = var9.XF;
            int var24 = var10001.SH;
            int var25 = var10001.mB0;
            int var10 = 0;
            byte var11 = 0;
            var4.Pa0(DF0.Ha0);

            while(var10 < var25) {
                for(int var12 = var11; var12 < var24; ++var12) {
                    float var32 = var5.y + (float)var10 - var8.y;
                    float var13 = var32 * (float)var22;
                    float var14;
                    int var26 = (int)(var5.x + (var14 = (float)var12) - var8.x + var13);
                    if (RI0((int)var32, var23) && RI0((int)(var5.x + var14 - var8.x), var22) && RI0(var26, ((Buffer)var20).capacity())) {
                        int var15;
                        int var27;
                        int var16 = (var15 = var12 - (var27 = (int)var8.x)) * var6[0];
                        int var17;
                        int var18;
                        int var28;
                        int var33 = var28 = ((var18 = var10 - (var17 = (int)var8.y)) * var6[1] + var16 >> 8) + var27;
                        var15 *= var6[2];
                        int var30;
                        var16 = (var30 = (var18 * var6[3] + var15 >> 8) + var17) * var24 + var28;
                        if (RI0(var33, var24) && RI0(var30, var25) && RI0(var16, ((Buffer)var21).capacity()) && var9.XF.iH0(var28, var30) != 0) {
                            var20.put(var26, var21.get(var16));
                        }
                    }
                }

                ++var10;
            }
        }

    }

    public final void Lpt8() {
        for(int var1 = 0; var1 < this.vB.length; ++var1) {
            i4_0 var2 = this.vB[var1];
            if (var2 != null) {
                var2.dispose();
                this.vB[var1] = null;
            }
        }

    }

    public final void ty() {
        ByteBuffer var1;
        ByteBuffer var10000 = var1 = this.qc.MH(this.wO);
        (this.yj0 = new Rz0(var1)).Kn(1313031506);
        bc0_1 var2;
        bc0_1 var10003 = var2 = new bc0_1(var1);
        this.bs0 = var10003;
        var10000.position(this.yj0.H20 + var2.Hp + 8);

        bc0_1 var3;
        for(int var11 = 0; var11 < (var3 = this.bs0).j2; ++var11) {
            dg_0[] var26 = var3.bL0;
            dg_0 var4;
            var4 = new dg_0(var3, var1);
            var26[var11] = var4;
        }

        if (var3.BZ != 0) {
            int var12 = ((Buffer)var1).position();
            var1.position(this.yj0.H20 + this.bs0.BZ + 8);
            var10003 = this.bs0;
            var1.getInt();
            var10003.getClass();
            this.bs0.Nv = var1.getInt();
            var1.position(this.yj0.H20 + (var3 = this.bs0).BZ + var3.Nv + 8);

            bc0_1 var17;
            for(int var15 = 0; var15 < (var17 = this.bs0).j2; ++var15) {
                var17.bL0[var15].wu0 = var1.getInt();
                dg_0 var27 = this.bs0.bL0[var15];
                var1.getInt();
                var27.getClass();
            }

            var1.position(var12);
        }

        int var13 = ((Buffer)var1).position();

        short var5;
        bc0_1 var18;
        for(int var16 = 0; var16 < (var5 = (var18 = this.bs0).j2); ++var16) {
            dg_0 var19;
            dg_0 var28 = var19 = var18.bL0[var16];
            var1.position(var13 + var19.Xh);
            var28.R3 = new kh0_0[var28.XG];

            for(short var21 = 0; var21 < var19.XG; ++var21) {
                kh0_0[] var10001 = var19.R3;
                kh0_0 var6;
                var6 = new kh0_0(var1);
                var10001[var21] = var6;
                if (this.bs0.BZ != 0) {
                    var19.R3[var21].Cm = var19.wu0;
                }
            }

            ArrayList var34 = new ArrayList(Arrays.asList(var19.R3));
            Collections.sort(var34);
            var19.mm0 = (kh0_0[])var34.toArray(new kh0_0[0]);
            int[] var22;
            int[] var29 = var22 = new int[2];
            var29[0] = Integer.MAX_VALUE;
            var29[1] = Integer.MAX_VALUE;
            int[] var24;
            var29 = var24 = new int[2];
            var29[0] = Integer.MIN_VALUE;
            var29[1] = Integer.MIN_VALUE;

            kh0_0[] var8;
            for(int var7 = 0; var7 < (var8 = var19.R3).length; ++var7) {
                kh0_0 var25;
                kh0_0 var31 = var25 = var8[var7];
                int var9 = var31.Y4;
                int var10 = var31.bt;
                if (var31.dG0) {
                    var9 *= 2;
                    var10 *= 2;
                }

                var22[0] = Math.min(var22[0], var25.Cl);
                var22[1] = Math.min(var22[1], var25.lA0);
                var24[0] = Math.max(var24[0], var25.Cl + var9);
                var24[1] = Math.max(var24[1], var25.lA0 + var10);
            }

            Bp0 var35 = var19.Ix0;
            int var20;
            var35.x = (float)(var24[0] - (var20 = var22[0]));
            int var23;
            var35.y = (float)(var24[1] - (var23 = var22[1]));
            Bp0 var33 = var19.Zw0;
            var33.x = (float)(0 - var20);
            var33.y = (float)(0 - var23);
        }

        this.vB = new i4_0[var5];
    }

    public final void else$(int var1, Gt0 var2, Tt0 var3, i4_0 var4, Bp0 var5) {
        kh0_0[] var17 = this.bs0.bL0[var1].mm0;

        for(int var18 = 0; var18 < var17.length; ++var18) {
            kh0_0 var6;
            byte[] var12;
            label89: {
                kh0_0 var10001 = var6 = var17[var17.length - var18 - 1];
                int var7 = (short)var10001.le;
                int var8 = var10001.Cm;
                short var9;
                short var51 = var9 = var10001.Y4;
                short var10 = var6.bt;
                var2.getClass();
                int var11;
                var12 = new byte[var11 = var51 * var10];
                To0 var13;
                if (((var13 = var2.vk0).Vb & 255) == 0) {
                    int var40;
                    if (((var40 = var13.pF) & 16) == 0) {
                        var40 = 5;
                    } else {
                        var40 = (var40 >> 20 & 3) + 5;
                    }

                    var7 = (var7 << var40) * 2;
                    if (var2.yz(var12, var8 * 2 + var7, var11, 0)) {
                        byte[] var20 = new byte[var11];
                        var8 = 0;

                        for(int var37 = 0; var37 < var10 / 8; ++var37) {
                            for(int var42 = 0; var42 < var9 / 8; ++var42) {
                                for(int var14 = 0; var14 < 8; ++var14) {
                                    for(int var15 = 0; var15 < 8; ++var15) {
                                        int var10003 = var37 * 8 + var14;
                                        int var16 = var42 * 8 + var15;
                                        var16 = var10003 * var9 + var16;
                                        var20[var16] = var12[var8];
                                        ++var8;
                                    }
                                }
                            }
                        }

                        var12 = var20;
                        break label89;
                    }
                } else {
                    short var21;
                    var8 = var7 / (var21 = (short)(var2.LA / 8)) * 8;
                    var11 = var7 % var21 * 8;
                    int var43 = 0;

                    while(true) {
                        int var45;
                        if (var43 >= var10 || (var45 = var8 + var43) / 8 >= var2.v4) {
                            break label89;
                        }

                        var45 = var45 * var21 * 8 + var11;
                        int var47 = var43 * var9;
                        if (!var2.yz(var12, var45, var9, var47)) {
                            break;
                        }

                        ++var43;
                    }
                }

                var12 = null;
            }

            i4_0 var22;
            short var25 = var6.Y4;
            short var31 = var6.bt;
            ix0_0 var26 = ix0_0.Vw;
            var22 = new i4_0(var25, var31, var26);
            LPT4_[][] var35;
            if ((var31 = var6.up0) >= (var35 = var3.dc0).length) {
                var31 = 0;
            }

            LPT4_[] var33 = var35[var31];
            if (var22.rH0() != var26) {
                throw new RuntimeException("Invalid format");
            }

            Gdx2DPixmap var27;
            int var49 = (var27 = var22.XF).mB0 * var27.SH;
            ByteBuffer var28;
            ByteBuffer var53 = var28 = var22.Rh0();
            var53.position(0);
            int var36 = Math.min(var49, ((Buffer)var53).remaining() / 4);

            for(int var39 = 0; var39 < var36; ++var39) {
                int var44;
                var28.putInt((var44 = var33[var12[var39] & 255].Lf0) << 8 | var44 >>> 24);
            }

            var28.position(0);
            boolean var29 = var6.um0;
            if (var29 || var6.ff0) {
                i4_0 var50 = var22;
                var22 = fp_2.La(var22, (boolean)var29, var6.ff0);
                var50.dispose();
            }

            int var30 = (int)var5.x + var6.Cl;
            int var34 = (int)var5.y + var6.lA0;
            if (var6.dG0) {
                var30 += var6.Y4 / 2;
                var34 += var6.bt / 2;
            }

            var4.NH0(var22, var30, var34);
            var22.dispose();
        }

    }
}

