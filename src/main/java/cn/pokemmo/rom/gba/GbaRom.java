package cn.pokemmo.rom.gba;

import f.*;
import java.util.*;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel.MapMode;

public class GbaRom {
    public final qa0_1 asBridge() {
        return this instanceof qa0_1 ? (qa0_1) this : null;
    }

    public final String getGameCode() {
        return this.iq0;
    }

    public final byte getVersion() {
        return this.I40;
    }

    public final br_2 getConfig() {
        return this.EZ;
    }

    public final byte getGameType() {
        return this.rt0();
    }

    public final boolean isFireRed() {
        return this.rt0() == 0;
    }

    public final boolean isEmerald() {
        return this.rt0() == 1;
    }

    public final ByteBuffer getBuffer() {
        return this.vy0();
    }

    public final Dn0 getRomFile() {
        return this.hW;
    }

    public static final dl_1 F1 = Cq0.E1(GbaRom.class);
    public final ByteBuffer VL0;
    public final String iq0;
    public final byte I40;
    public final br_2 EZ;
    public final O2 uv0;
    public final Dn0 hW;
    public String i00 = null;

    public GbaRom(Dn0 var1) {
       this.hW = var1;
       byte[] var2;
       var1.yM(var2 = new byte[255], 255);
       ByteBuffer var7;
       ByteBuffer var10000 = var7 = ByteBuffer.wrap(var2).order(ByteOrder.LITTLE_ENDIAN);
       var10000.position(172);
       byte[] var3;
       var10000.get(var3 = new byte[4]);
       String var4;
       String var9 = var4 = new String(var3);
       this.iq0 = var4;
       var7.position(172);
       var7.getInt();
       var7.position(188);
      byte var8;
      this.I40 = var8 = var7.get();
      if ((this.EZ = fx_0.ky0(var9, var8, asBridge())) == null) {
         if (fx_0.rp0(var4)) {
            throw new RD(TI0.Ga(var4.getBytes()) + " v" + var8 + " is not currently a supported rom type.");
         } else {
            throw new xk0_1(TI0.Ga(var4.getBytes()) + " v" + var8 + " is not currently a supported rom type.");
         }
      } else {
         this.uv0 = O2.h0(var8, var4);
         this.VL0 = var1.zs0(MapMode.READ_ONLY);
         dl_1 var10 = F1;
         String var5 = var4.trim();
         Byte var6 = var8;
         var10.info("Loaded GBA ROM {} v1.{}", var5, var6);
      }
   }

   public final ByteBuffer vy0() {
      return this.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
   }

   public final br_2 lQ() {
      return this.EZ;
   }

   public final Dn0 Dq0() {
      return this.hW;
   }

   public final byte rt0() {
      O2 var1;
      return (byte)((var1 = this.uv0) != null ? (var1.t90 ? 0 : 1) : this.EZ.Yw0);
   }

   public final void TS() {
      GJ var1;
      (var1 = GJ.Ig0).getClass();
      byte var2 = this.rt0();
      ByteOrder var3;
      ByteBuffer var4;
      ByteBuffer var10000 = var4 = this.VL0.slice().order(var3 = ByteOrder.LITTLE_ENDIAN);
      ByteBuffer var74 = this.VL0.slice().order(var3);
      var10000.position(this.EZ.V(br_2.bD));

      for(byte var5 = 0; var5 < 22; ++var5) {
         int var6 = G90.GF0(var4.getInt());
         short var7 = var4.getShort();
         var4.getShort();
         if (var5 != 0 && var5 != 18 && var5 != 19 && var5 != 21) {
            var74.position(var6);

            for(int var168 = 0; var168 < var7; ++var168) {
               int var10002 = G90.GF0(var74.getInt());
               var74.getInt();
               var74.getInt();
               String var8 = mz_1.BC(var10002, var74);
               short var9 = (short)(var5 * 512 + var168);
               var1.je[var2].coM4(var9, var8);
            }
         }
      }

      String[] var242 = sm0_0.zb0;
      ByteOrder var18;
      ByteBuffer var44 = this.VL0.slice().order(var18 = ByteOrder.LITTLE_ENDIAN);
      br_2 var75;
      if ((var75 = this.EZ).Yw0 == 1) {
         int var243 = var75.V(br_2.UU);
         int var76 = this.rt0() * 1000 + 140000;
         sm0_0.NM(asBridge(), var243, var76, -1);
         var243 = var76 = this.EZ.V(br_2.T70);
         int var106 = this.EZ.V(br_2.sx0);
         int var141 = this.rt0() * 120 + 190000;
         int var169 = Integer.MAX_VALUE;
         if (var243 >= 1) {
            var44.position(var76);
            byte[] var78 = new byte[var106];

            for(int var107 = 0; var107 < var169; ++var107) {
               var44.get(var78);
               byte var190;
               if ((var190 = var78[0]) == -1 || var190 == 0) {
                  break;
               }

               sm0_0.Tm0(var141++, mz_1.Y(var78));
            }
         }

         int var10001 = this.EZ.V(br_2.SU);
         var76 = 100100;
         sm0_0.rc(asBridge(), var10001, var76, -1);
         sm0_0.rc(asBridge(), this.EZ.V(br_2.ZL0), 270600, 14);
         sm0_0.rc(asBridge(), this.EZ.V(var76 = br_2.Jn0), 270200, 8);
         sm0_0.NM(asBridge(), this.EZ.V(var76) + 28, 270250, 4);
         sm0_0.rc(asBridge(), this.EZ.V(var76) + 64, 270255, 4);
         sm0_0.pp(var44, this.EZ.V(br_2.c9), 16, 270300);
         if (this.EZ.ZF0(var76 = br_2.CS)) {
            if (this.EZ.ZF0(var106 = br_2.an0)) {
               byte[] var45 = new byte[this.EZ.V(var106)];
               var44.position(this.EZ.V(var76));
               var44.get(var45);
               sm0_0.Tm0(8, mz_1.Y(var45).replaceAll("\\|[^\\|]+\\|", " "));
            } else {
               sm0_0.Tm0(8, sm0_0.hs(mz_1.Xc(this.EZ.V(var76), var44), " "));
            }
         }

         var243 = this.EZ.V(br_2.L10);
         int var46 = 205000;
         sm0_0.rc(asBridge(), var243, var46, -1);
         sm0_0.rc(asBridge(), this.EZ.V(br_2.J90), 206000, -1);
         sm0_0.pp(this.VL0.slice().order(var18), this.EZ.V(br_2.Yt0), 7, 206100);
         var243 = this.EZ.V(br_2.dW);
         var46 = 285000;
         sm0_0.rc(asBridge(), var243, var46, -1);
         var243 = this.EZ.V(br_2.Fn0);
         var46 = 310000;
         sm0_0.rc(asBridge(), var243, var46, -1);
         sm0_0.pp(this.VL0.slice().order(var18), this.EZ.V(br_2.B6), 223, 310200);
         sm0_0.pp(this.VL0.slice().order(var18), this.EZ.V(br_2.Yh0), 4, 311000);
      } else {
         int var250 = var75.V(br_2.UU);
         int var19 = this.EZ.Yw0 * 1000 + 140000;
         sm0_0.rc(asBridge(), var250, var19, -1);
         var250 = var19 = this.EZ.V(br_2.T70);
         int var82 = this.EZ.V(br_2.sx0);
         int var109 = 190000;
         int var142 = Integer.MAX_VALUE;
         if (var250 >= 1) {
            var44.position(var19);
            byte[] var21 = new byte[var82];

            for(int var83 = 0; var83 < var142; ++var83) {
               var44.get(var21);
               byte var170;
               if ((var170 = var21[0]) == -1 || var170 == 0) {
                  break;
               }

               sm0_0.Tm0(var109++, mz_1.Y(var21));
            }
         }

         var250 = this.EZ.V(br_2.L10);
         var19 = 200000;
         sm0_0.rc(asBridge(), var250, var19, -1);
         var250 = this.EZ.V(br_2.AZ);
         var19 = 300000;
         sm0_0.rc(asBridge(), var250, var19, -1);
         var250 = this.EZ.V(br_2.ZP);
         var19 = 300050;
         sm0_0.rc(asBridge(), var250, var19, -1);
         GJ var25;
         sm0_0.Tm0(6, (var25 = GJ.Ig0).wG0((byte)0, (short)8720));
         sm0_0.Tm0(7, var25.wG0((byte)0, (short)525));
         var250 = 250100;

         try {
            sm0_0.Tm0(var250, sm0_0.hs(mz_1.Xc(this.EZ.V(br_2.yG), var44), (String)null));
         } catch (Exception var17) {
            ((Throwable)var17).printStackTrace();
         }
      }

      gu0 var26;
      (var26 = gu0.l2).getClass();
      (var44 = this.VL0.slice().order(ByteOrder.LITTLE_ENDIAN)).position(this.EZ.V(br_2.Wa0));

      for(int var84 = 0; var84 < this.EZ.V(br_2.ex0); ++var84) {
         mc0_1 var110;
         var110 = new mc0_1();
         int var143;
         int var257 = var143 = this.rt0();
         var110.PX = (byte)var143;
         byte[] var10007 = new byte[14];
         var44.get(var10007);
         String var171 = mz_1.Y(var10007);
         var110.Z8 = var44.getShort();
         var110.TD = var44.getShort();
         var44.get();
         var44.get();
         String var191 = mz_1.BC(G90.GF0(var44.getInt()), var44);
         var44.getShort();
         if (var257 == 0) {
            var110.Yt0 = l5_0.Hv0(var44.get());
         } else {
            byte var210 = var44.get();
            l5_0[] var224;
            int var10 = (var224 = l5_0.tC0).length;
            int var11 = 0;

            l5_0 var12;
            while(true) {
               if (var11 >= var10) {
                  var12 = null;
                  break;
               }

               if ((var12 = var224[var11]).Yf == var210) {
                  break;
               }

               ++var11;
            }

            var110.Yt0 = var12;
         }

         if (var110.Yt0 == l5_0.hB) {
            var110.Bk0 = var44.get();
         } else {
            var44.get();
         }

         var44.getInt();
         var44.getInt();
         var44.getInt();
         var44.getInt();
         if (var110.Yt0 != l5_0.YW) {
            var171 = tx_1.rX(var171);
         }

         int var211;
         var257 = var211 = var110.Z8 + 240000;
         var110.Nl = var211;
         int var144;
         sm0_0.Tm0(var257 + (var144 = var143 * 500), var171);
         sm0_0.Tm0(var110.Nl, var171);
         var257 = var211 = var110.Z8 + 130000;
         var110.Fv = var211;
         sm0_0.Tm0(var257 + var144, var191);
         if ((var143 = var110.Z8) >= 153 && var143 <= 158) {
            sm0_0.Tm0(var110.Fv, var191);
         }

         switch (var143 = var110.Z8) {
            case 5289:
            case 5290:
            case 5291:
            case 5292:
            case 5293:
               var110.Fv = (var143 - 5289) * 2 + 100018;
               break;
            case 5294:
               var110.Fv = 100016;
         }

         sm0_0.Tm0(var110.Fv, var171);
         var110.Yw = var110.Yt0.EF;
         if ((mc0_1)var26.Cb0.get(var110.Z8) == null) {
            var26.Cb0.put(var110.Z8, var110);
            var26.Pd0.put(var110.Z8, var110);
         }
      }

      var44.position(this.EZ.V(br_2.nm));

      for(int var85 = 0; var85 < 58; ++var85) {
         short var111 = (short)(var85 + 289);
         short var147 = var44.getShort();
         var26.lPT6(var111).wb0 = var147;
      }

      QO var27;
      (var27 = QO.NX).getClass();
      int var50;
      if (this.EZ.ZF0(var50 = br_2.hu)) {
         ByteBuffer var86;
         (var86 = this.VL0.slice().order(ByteOrder.LITTLE_ENDIAN)).position(this.EZ.V(var50));

         for(int var51 = 0; var51 < this.EZ.V(br_2.vm0); ++var51) {
            yj_2 var112;
            var112 = new yj_2(this.rt0(), var86);
            var27.Cs.put(var112.su, var112);
         }
      }

      wn_1 var28;
      (var28 = wn_1.pn).getClass();
      ByteBuffer var52;
      (var52 = this.VL0.slice().order(ByteOrder.LITTLE_ENDIAN)).position(this.EZ.V(br_2.y10));
      int var172;
      byte var113;
      for(short var87 = 0; (var113 = var52.get()) >= 0 && var113 <= 3; var87 = (short)var172) {
         var52.position(((Buffer)var52).position() - 1);
         kt0 var114;
         byte var148 = this.rt0();
          var172 = (short)(var87 + 1);
          var114 = new kt0(var148, var52, var87);
         if (var28.XT == null) {
            var28.XT = var114;
         }

         var28.zx0[this.rt0()].xk.coM4(var87, var114);
      }

      Z0 var29;
      Z0 var260 = var29 = Z0.rb;
      var260.getClass();
      ByteOrder var53;
      ByteBuffer var88;
      ByteBuffer var281 = var88 = this.VL0.slice().order(var53 = ByteOrder.LITTLE_ENDIAN);
      ByteBuffer var54 = this.VL0.slice().order(var53);
      var281.position(this.EZ.V(br_2.vj));
      int var115 = 1;
      J10 var149 = var260.Ta[this.rt0()];

      while(true) {
         if ((var172 = var88.getInt()) != 0) {
            if ((var172 = G90.GF0(var172)) < 1) {
               if (var115 < 100) {
                  throw new RuntimeException("Invalid map footer data, possible rom corruption");
               }

               var88.position(this.EZ.V(br_2.gz));
               int[] var55 = new int[10];

               int var150;
               for(var115 = 0; (var150 = G90.GF0(var88.getInt())) >= 1; var115 = var172) {
                  if ((var172 = var115 + 1) > var55.length) {
                     int[] var263 = var55;
                     int[] var282 = var55;
                     var55 = new int[Math.max(var55.length << 1, var172)];
                     int var193 = var282.length;
                     System.arraycopy(var263, 0, var55, 0, var193);
                  }

                  var55[var115] = var150;
               }

               byte var151 = 0;
               int[] var176 = new int[var115];
               if (var115 != 0) {
                  if (var115 <= 0) {
                     throw new ArrayIndexOutOfBoundsException(var151);
                  }

                  System.arraycopy(var55, var151, var176, 0, var115);
               }

               int var56 = this.rt0() * 50;
               int[][] var152 = new int[var115][];

               for(int var194 = 0; var194 < var115; ++var194) {
                  var88.position(var176[var194]);
                  int var213;
                  if (var194 == var115 - 1) {
                     var213 = this.EZ.V(br_2.gz);
                  } else {
                     var213 = var176[var194 + 1];
                  }

                  var152[var194] = new int[(var213 - var176[var194]) / 4];

                  int[] var225;
                  for(int var214 = 0; var214 < (var225 = var152[var194]).length; ++var214) {
                     var225[var214] = G90.GF0(var88.getInt());
                  }
               }

               for(int var177 = 0; var177 < var115; ++var177) {
                  int var195 = var177 + var56;
                  var29.sn[var195] = new ZT[var152[var177].length];

                  int[] var226;
                  for(int var215 = 0; var215 < (var226 = var152[var177]).length; ++var215) {
                     var88.position(var226[var215]);
                     ZT[] var264 = var29.sn[var195];
                     ZT var227;
                     var227 = new ZT(var177, var215, var88, asBridge());
                     var264[var215] = var227;
                  }
               }

               _case var30;
               (var30 = _case.P0).getClass();
               if (this.EZ.ZF0(var56 = br_2.mW)) {
                  a20 var31 = var30.vm0[this.rt0()];
                  ByteOrder var89;
                  ByteBuffer var117;
                  ByteBuffer var265 = var117 = this.VL0.slice().order(var89 = ByteOrder.LITTLE_ENDIAN);
                  ByteBuffer var178 = this.VL0.slice().order(var89);
                  ByteBuffer var90 = this.VL0.slice().order(var89);
                  var265.position(this.EZ.V(var56));
                  var56 = 0;
                  int var153 = 0;

                  int var196;
                  byte var216;
                  label479:
                  while(G90.Uh0(var196 = var117.getInt()) && (var216 = var117.get()) >= 0) {
                     var117.position(((Buffer)var117).position() + 3);
                     String[] var197 = new String[var216];
                     var178.position(G90.GF0(var196));

                     for(int var228 = 0; var228 < var216; ++var228) {
                        int var233;
                        if (!G90.Uh0(var233 = var178.getInt())) {
                           break label479;
                        }

                        var178.getInt();
                        var90.position(G90.GF0(var233));
                        var197[var228] = mz_1.PK0(var90);
                        if (var233 > var153) {
                           var153 = var233;
                        }
                     }

                     a20.vh(var31, new LG0((byte)var56++, var197));
                  }

                  if (this.EZ.ZF0(br_2.com1)) {
                     var56 = this.EZ.V(br_2.lC0);

                     label463:
                     for(byte var179 = 0; var179 < 30; ++var179) {
                        var196 = this.EZ.V(br_2.com1);
                        var117.position(var179 * var56 * 4 + var196);
                        ArrayList var199;
                        var199 = new ArrayList();

                        for(int var217 = 0; var217 < var56; ++var217) {
                           int var229;
                           if (!G90.Uh0(var229 = var117.getInt())) {
                              if (var217 == 0) {
                                 break label463;
                              }
                              break;
                           }

                           var90.position(G90.GF0(var229));
                           var199.add(mz_1.PK0(var90));
                           if (var229 > var153) {
                              var153 = var229;
                           }
                        }

                        LG0 var218;
                        var218 = new LG0(var179, (String[])var199.toArray(new String[0]));
                        var31.Fm0.gE0(var179, var218);
                     }
                  }
               }

               h40_0 var32;
               (var32 = h40_0.t2).getClass();
               if (this.rt0() == 1) {
                  ByteBuffer var60;
                  (var60 = this.VL0.slice().order(ByteOrder.LITTLE_ENDIAN)).position(this.EZ.V(br_2.lr));

                  for(byte var91 = 0; var91 < 21 && G90.Uh0(var115 = var60.getInt()); ++var91) {
                     var115 = G90.GF0(var115);
                     ot_1 var154;
                     var154 = new ot_1(asBridge(), var91, var115);
                     var32.sH0.put(var91, var154);
                     if (var91 == 1) {
                        String var120;
                        if ((var120 = var154.Pc()).contains(" ")) {
                           String[] var266 = var120.split(" ");
                           var120 = var266[var266.length - 1].trim();
                        }

                        sm0_0.Tm0(250101, var120);
                     }

                     if (var91 == 2) {
                        sm0_0.Tm0(260000, var154.Pc());
                        sm0_0.Tm0(260002, var154.Pc());
                     } else if (var91 == 3) {
                        sm0_0.Tm0(260001, var154.Pc());
                        sm0_0.Tm0(260003, var154.Pc());
                     }
                  }

                  var60.position(this.EZ.V(br_2.Xq));

                  for(byte var92 = 0; var92 < 78; ++var92) {
                     int[] var121 = new int[4];

                     for(int var155 = 0; var155 < 4; ++var155) {
                        var121[var155] = G90.GF0(var60.getInt());
                     }

                     pc_2 var156;
                     var156 = new pc_2(var121);
                     ByteBuffer var122 = this.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);

                     int[] var200;
                     for(int var180 = 0; var180 < (var200 = var156.E40).length; ++var180) {
                        var156.dg0[var180] = mz_1.Xc(var200[var180], var122);
                     }

                     var32.Fv.put(var92, var156);
                  }

                  var60.position(this.EZ.V(br_2.rj));

                  for(int var93 = 0; var93 < 205 && (var115 = var60.getInt()) >= 0 && G90.Uh0(var115); ++var93) {
                     var60.get();
                     var60.get();
                     var60.get();
                     var60.get();
                     var115 = G90.GF0(var115);
                     TreeMap var267 = var32.wM;
                     Integer var125 = var93;
                     var267.put(var125, var115);
                  }
               }

               rh_1 var33 = rh_1.vY;
               if (this.rt0() == 1) {
                  var56 = this.rt0();
                  ByteOrder var94;
                  ByteBuffer var126;
                  ByteBuffer var268 = var126 = this.VL0.slice().order(var94 = ByteOrder.LITTLE_ENDIAN);
                  ByteBuffer var95 = this.VL0.slice().order(var94);
                  var268.position(this.EZ.V(br_2.sv));

                  for(int var157 = 0; var157 < 64; ++var157) {
                     var33.L3[var157] = var126.getShort();
                  }

                  byte var158 = 4;
                  int[] var269 = var176 = new int[4];
                  var269[0] = this.EZ.V(br_2.D3);
                  var269[1] = this.EZ.V(br_2.QT);
                  var269[2] = this.EZ.V(br_2.ql);
                  var269[3] = this.EZ.V(br_2.O20);

                  for(byte var201 = 0; var201 < var158; ++var201) {
                     var126.position(var176[var201]);
                     uy_0[] var270 = var33.Yj;
                     uy_0 var219;
                     var219 = new uy_0();
                     var270[var201] = var219;

                     for(short var220 = 0; var220 < rh_1.t2[var201]; ++var220) {
                        e80_0 var230;
                        var230 = new e80_0((byte)var56, var201, var220, var126, var95);
                        var33.Yj[var201].lL0.put(var220, var230);
                     }

                     for(short var221 = 0; var221 < rh_1.Lf0[var201]; ++var221) {
                        tj_2 var231;
                        var231 = new tj_2(var221, var126);
                        var33.Yj[var201].vk0.put(var221, var231);
                     }
                  }
               }

               l4_0 var34;
               (var34 = l4_0.Py0).getClass();
               if (this.rt0() == 1) {
                  ByteBuffer var62;
                  (var62 = this.VL0.slice().order(ByteOrder.LITTLE_ENDIAN)).position(this.EZ.V(br_2.tX));

                  for(byte var96 = 0; var96 < 96; ++var96) {
                     bm0_1 var285 = var34.w8;
                     e_0 var127;
                     var127 = new e_0(var96, var62);
                     var285.gE0(var96, var127);
                  }

                  var62.position(this.EZ.V(br_2.rA0));
                  int var97 = this.EZ.V(br_2.Cq0);
                  var115 = 0;

                  for(short var159 = 0; var159 < var97; ++var159) {
                     M3 var182;
                     M3 var271 = var182 = new M3(var62);
                     byte var202;
                     if ((var202 = var271.V1) > var115) {
                        var115 = var202;
                     }

                     var34.Ij.coM4(var159, var182);
                  }

                  var62.position(this.EZ.V(br_2.oE0));

                  for(byte var98 = 0; var98 < var115 + 1; ++var98) {
                     bm0_1 var286 = var34.Lk0;
                     HU var160;
                     var160 = new HU(var98, var62);
                     var286.gE0(var98, var160);
                  }
               }

               ZU var236;
               (var236 = ZU.kB).getClass();
               H40 var240;
               this.rt0();
                var240 = new H40();
               int var35 = this.EZ.V(br_2.ft);
               int var13 = this.EZ.V(br_2.yY);
               int var14 = this.EZ.V(br_2.h40);
               System.currentTimeMillis();
               ByteBuffer var15;
               ByteBuffer var273 = var15 = this.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
               HashMap var16;
               var16 = new HashMap();
               var273.position(var35);

               while((var35 = G90.GF0(var15.getInt())) >= 1) {
                  var56 = var15.getShort();
                  var15.getShort();
                  i8_0 var37 = da_0.Ic.tv(XG0.hi0, var35, this.VL0.slice().order(ByteOrder.LITTLE_ENDIAN), (byte)0);
                  if (var16.containsKey(Short.valueOf((short)var56))) {
                     break;
                  }

                  var16.put(Short.valueOf((short)var56), var37);
               }

               var15.position(var13);

               for(int var38 = 0; var38 < var14 && (var56 = G90.GF0(var15.getInt())) >= 0 && var56 <= ((Buffer)var15).limit(); ++var38) {
                  var15.getShort();
                  short var99 = var15.getShort();
                   Wr var129;
                   Wr var287 = var129 = new Wr(new wt_1(var56, asBridge(), var16, var99));
                   var287.zz = true;
                  SQ var274 = var240.Com3;
                  var274.j10(((GX)var274).yw0(var38), var129);
               }

               var236.Vp0.gE0(this.rt0(), var240);
               gh_1 var39;
               (var39 = gh_1.aH0).getClass();
               ByteBuffer var65;
               (var65 = this.VL0.slice().order(ByteOrder.LITTLE_ENDIAN)).position(this.EZ.V(br_2.Mh));
               pa0_2 var100;
               var100 = new pa0_2();
               pa0_2 var130;
               var130 = new pa0_2();

               int var183;
               for(short var161 = 0; var161 < this.EZ.V(br_2.ex0) && (var183 = G90.GF0(var65.getInt())) >= 1; ++var161) {
                  int var203 = G90.GF0(var65.getInt());
                  if (!var39.rf0.bL0(var161)) {
                     Wr var185;
                     Wr var205;
                     long var222;
                     if (((ng0_1)var100).Ma0(var222 = (long)var183 << 32 | (long)var203 & 4294967295L) >= 0) {
                        int var184;
                        var185 = (Wr)((var184 = ((ng0_1)var100).Ma0(var222)) < 0 ? null : var100.Xv[var184]);
                        int var204;
                        var205 = (Wr)((var204 = ((ng0_1)var130).Ma0(var222)) < 0 ? null : var130.Xv[var204]);
                     } else {
                        Wr var234;
                        ui_0 var237 = new ui_0(asBridge(), var183, var203);
                         var234 = new Wr(var237);
                        var100.bc0(var222, var234);
                        Wr var238;
                        Lv0 var241 = new Lv0(asBridge(), var183, var203);
                         var238 = new Wr(var241);
                        var130.bc0(var222, var238);
                        var205 = var238;
                        var185 = var234;
                     }

                     var39.rf0.coM4(var161, var185);
                     var39.rh.coM4(var161, var205);
                  }
               }

               i5_0.Jg0().Wv0(asBridge());
               ob0_0 var40;
               (var40 = ob0_0.Ui0()).getClass();
               Wr var66;
               var66 = new Wr(new xh_1(asBridge()));

               for(int var101 = 0; var101 < 8; ++var101) {
                  var40.Zc0[this.rt0()][var101] = new AG0(var66, var101 * 16, 0, 16, 16);
               }

               byte var67;
               if ((var67 = this.rt0()) != 0) {
                  if (var67 == 1) {
                     Wr var41;
                     Y80 var68 = new Y80(asBridge());
                      var41 = new Wr(var68);
                     var40.G60 = var41;
                  }
               } else {
                  Wr var69;
                  var69 = new Wr(new o00_0(asBridge()));
                  var40.lI = new AG0[16];

                  AG0[] var131 = var40.lI;
                  for(int var102 = 0; var102 < var131.length; ++var102) {
                     AG0 var132;
                     int var162 = var102 * 16;
                      var132 = new AG0(var69, 0, var162, 16, 16);
                     var131[var102] = var132;
                  }
               }

               bi0_0 var42;
               (var42 = bi0_0.cs).getClass();
               ByteBuffer var70 = this.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
               if (this.rt0() == 1) {
                  Q20 var103;
                  int var295 = this.EZ.V(br_2.TK0);
                  var103 = new Q20(var295, 1, 8, XG0.hi0, var70);
                  var42.tf0 = new AG0[4];

                  AG0[] var134 = var42.tf0;
                  Wr var186;
                  for(int var71 = 0; var71 < var134.length; ++var71) {
                     int var135 = var71 * 32;
                     AG0 var163;
                     gj0_2 var206 = new gj0_2(var103, asBridge(), var135);
                      var186 = new Wr(var206);
                      var163 = new AG0(var186, 0, 0, 16, 16);
                     var134[var71] = var163;
                  }
               } else {
                  for(int var104 = 0; var104 < 20; ++var104) {
                     int var136 = this.EZ.V(br_2.ej);
                     var70.position(var104 * 20 + var136);
                     var136 = G90.GF0(var70.getInt());
                     int var164 = G90.GF0(var70.getInt());
                     int var187 = G90.GF0(var70.getInt());
                     int var207 = G90.GF0(var70.getInt());
                     int var223 = G90.GF0(var70.getInt());
                     byte var232 = 0;
                     boolean var235 = false;
                     Wr var239;
                     var239 = new Wr(new qk0_1(asBridge(), var136, var164, var223, var232, var235));
                     var42.r0.put(var104, var239);
                     var42.sN.put(var104, new AG0(var239, 240, 0, 272, 112));
                     HashMap var278 = var42.Ch0;
                     Integer var293 = var104;
                     var136 = 2;
                     var164 = 1;
                     var278.put(var293, new Wr(new qk0_1(asBridge(), var187, var207, var223, var136, true)));
                     var136 = 2;
                     var164 = 1;
                     new Wr(new qk0_1(asBridge(), var187, var207, var223, var136, true));
                  }
               }

               QI.Py.ny0(asBridge());
               ba0_0.Ln0.com7(asBridge());
               ph_1.Ry().wx0(asBridge());
               c20_0.eE0().zT(asBridge());
               cl_1 var43;
               (var43 = cl_1.nj0).getClass();
               ByteOrder var72;
               ByteBuffer var105;
               (var105 = this.VL0.slice().order(var72 = ByteOrder.LITTLE_ENDIAN)).position(this.EZ.V(br_2.Uz0));
               ByteBuffer var73 = this.VL0.slice().order(var72);

               short var140;
               while((var140 = var105.getShort()) >= 1) {
                  short var167 = var105.getShort();
                  int var188 = var105.getInt();
                  int var208 = var105.getInt();
                  if (!G90.Uh0(var188) || !G90.Uh0(var208)) {
                     break;
                  }

                  var188 = G90.GF0(var188);
                  int var297 = G90.GF0(var208);
                  byte[] var209 = new byte[8];
                  var73.position(var297);
                  var73.get(var209);
                  var43.X7.put(this.rt0() * 10000 + var140, new LPT5_(var167, var188, var209));
               }

               ji0_0.Hg.y9(asBridge());
               nl_0.iS(this.rt0());
               return;
            }

            var54.position(var172);
            ng0_0 var192;
            ng0_0 var261 = var192 = new ng0_0((short)var115, var54, asBridge());
            if (var261.Ls0) {
               var149.x20.coM4((short)var115, var192);
               if (!var149.JG0.l90(var172)) {
                  SQ var262 = var149.JG0;
                  var262.j10(((GX)var262).yw0(var172), var192);
               }
            }
         }

         ++var115;
      }
   }
}

