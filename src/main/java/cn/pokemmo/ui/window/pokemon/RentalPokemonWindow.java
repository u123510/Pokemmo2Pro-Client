package cn.pokemmo.ui.window.pokemon;

import f.*;

import java.util.Arrays;

/**
 * 租赁宝可梦窗口
 *
 * 原混淆类: f.TH
 */
public class RentalPokemonWindow extends R90 {
    public final TH asBridge() {
        return (TH) (Object) this;
    }

   public final byte sE0;
   public final byte uI;
   public final byte Do;
   public final lo0_0 XB0;
   public final xe_1 f3;
   public final xe_1 sd0;
   public final cg_0 WH;
   public final fy_2 H3;
   public final VU[] Cw0;
   public final VU[] ET;
   public final byte[] x40;
   public final t00_0[] Qe0;
   public final wx_2 jq;
   public final wx_2 ra0;
   public i[] NK0;

   public RentalPokemonWindow(BU var1, byte var2, byte var3, byte var4, byte var5, VU[] var6) {
      wx_2 wx_2;
      wx_2 = new wx_2();
      this.jq = wx_2;
      wx_2 = new wx_2();
      this.ra0 = wx_2;
      this.NK0 = new i[0];
      this.sE0 = var4;
      this.uI = var5;
      this.Do = var2;
      this.Cw0 = var2 == 0 || var2 == 2 ? var6 : (var2 == 1 ? tw0_0.rl.r1(_volatile.BV).rT() : null);

      gn_0 gn_0 = new gn_0((byte)-1, (byte)-1, (byte)-1, (byte)-1);
      N1 n1 = new N1(asBridge(), gn_0);

      this.LPT8(n1);
      this.uf("mm-rental-window");
      this.Hy(sm0_0.c0(5511));
      this.ff0(1);
      lo0_0 lo0_0;
      lo0_0 = new lo0_0();
      this.XB0 = lo0_0;
      if (this.Cw0.length > 7) {
         lo0_0.Qs0(2);
      } else {
         lo0_0.Qs0(3);
      }

      fy_2 fy_2;
      fy_2 = new fy_2();
      this.H3 = fy_2;
      xe_1 xe_1x = new xe_1(sm0_0.c0(5512));

      this.f3 = xe_1x;
      xe_1x.RR(new ze0_0(asBridge(), var3, var1));
      xe_1 xe_1xx;
      xe_1x = xe_1xx = new xe_1(sm0_0.c0(nf0_0.Bq0));

      this.sd0 = xe_1xx;
      xe_1x.RR(new U2(var3, var1));
      this.ET = new VU[var4];
      this.x40 = new byte[var4];
      this.Qe0 = new t00_0[var4];

      for (byte b0 = 0; b0 < var4; b0++) {
         t00_0[] at00_0 = this.Qe0;
         t00_0 t00_0;
         t00_0 = new t00_0(asBridge(), b0);
         at00_0[b0] = t00_0;
         this.x40[b0] = -1;
      }

      cg_0 cg_0x = new cg_0();

      this.WH = cg_0x;
      cg_0x.I7();
      cg_0x.Ii(new ub0_0(asBridge()));
      I7 i7;
      I7 i72 = i7 = this.H3.H10();
      Hm0 hm0;
      Hm0 hm01 = hm0 = this.H3.lo0();
      i7.Kn0(this.XB0);
      hm01.Kn0(this.XB0);
      i72.X20(this.H3.lo0().LPt3(this.Qe0));
      I7 i71 = this.H3.H10();

      for (byte b2 = 0; b2 < var4; b2++) {
         if (b2 > 0) {
            i71.Ze0();
         }

         i71.Kn0(this.Qe0[b2]);
      }

      hm0.X20(i71);
      if ((var5 & 1) != 0) {
         i7.X20(this.H3.C7(new le0_2[]{this.f3, this.sd0})).Ze0();
         hm0.X20(this.H3.hb(new le0_2[]{this.f3, this.sd0}));
      } else {
         i7.X20(this.H3.hb(new le0_2[]{this.f3})).Ze0();
         hm0.X20(this.H3.C7(new le0_2[]{this.f3}));
      }

      this.H3.x40(i7);
      this.H3.WQ(hm0);
      this.SL(this.H3);
      if ((var5 & 8) != 0) {
         for (byte b1 = 0; b1 < var4; b1++) {
            this.Ox0(b1);
         }
      }

      this.zA();
      this.Ew();
   }

   public final void Ox0(byte var1) {
      if (var1 >= 0) {
         VU[] avu = this.Cw0;
         if (var1 < this.Cw0.length) {
            VU vu = avu[var1];
            if (Arrays.asList(this.ET).contains(vu)) {
               return;
            }

            byte b0 = 0;

            while (true) {
               VU[] avu1 = this.ET;
               if (b0 >= this.ET.length) {
                  return;
               }

               if (avu1[b0] == null) {
                  avu1[b0] = vu;
                  this.x40[b0] = var1;
                  this.Qe0[b0].Td(vu.I8.Yb0);
                  t00_0 t00_0x;
                  String s;
                  if (this.Do == 2) {
                     t00_0x = this.Qe0[b0];
                     t00_0x = this.Qe0[b0];
                     s = vu.na0();
                  } else {
                     t00_0x = this.Qe0[b0];
                     t00_0x = this.Qe0[b0];
                     s = lb0_2.Ky(vu, false, false, false);
                  }

                  t00_0x.yj0 = s;
                  t00_0x.yB0();
                  Br0 br0 = this.Qe0[b0].tp0;
                  Br0 br01 = this.Qe0[b0].tp0;
                  byte b1 = 36;
                  var1 = 36;
                  this.Qe0[b0].tp0.OA0 = true;
                  br01.IF = b1;
                  br0.gx0 = var1;
                  this.Ew();
                  return;
               }

               b0++;
            }
         }
      }
   }

   public final void zA() {
      fy_2 fy_2;
      fy_2 = new fy_2();
      I7 i7;
      i7 = new I7(fy_2);
      Hm0 hm0;
      hm0 = new Hm0(fy_2);
      this.NK0 = new i[7];
      byte b0 = 0;
      VU[] avu = this.Cw0;
      int ix = this.Cw0.length;

      for (int j = 0; j < ix; j++) {
         VU vu;
         if ((vu = avu[j]) != null) {
            cq_0 cq_0 = mp_1.vf0().W50(vu.I8.Yb0);
            if (this.WH.yy() <= 0 || tx_1.SC(cq_0.Ay(false), this.WH.dI0.toString().toLowerCase())) {
               boolean flag;
               if (this.Do != 2) {
                  flag = true;
               } else {
                  flag = false;
               }

               i[] ai1 = this.NK0;
               i entry = new i(asBridge(), vu, b0, flag);
               ai1[b0] = entry;
               if (++b0 % 7 == 0) {
                  b0 = 0;
                  i7.X20(new Hm0(fy_2).LPt3(this.NK0));
                  hm0.X20(new I7(fy_2).LPt3(this.NK0));
               }
            }
         }
      }

      if (b0 > 0) {
         i[] ai = new i[b0];

         for (int k = 0; k < b0; k++) {
            ai[k] = this.NK0[k];
         }

         i7.X20(new Hm0(fy_2).LPt3(ai));
         hm0.X20(new I7(fy_2).LPt3(ai));
      }

      fy_2.x40(i7);
      fy_2.WQ(hm0);
      this.XB0.AH0(fy_2);
      this.Ew();
      super.K8();
   }

   public final void a80(Jn0 var1) {
   }

   public final void K8() {
      super.K8();
   }

   public final void Ew() {
       wx_2 wx_2xxx = this.jq;
       wx_2 wx_2x = this.jq;
       wx_2 wx_2xx = this.jq;
      this.jq.Rv = 0;
      wx_2x.YB0 = wx_2xxx.uT();
      short[] ashort;
      short[] ashort1 = ashort = wx_2xxx.L1;
      byte[] abyte = wx_2xx.Ut;
       int index = ashort1.length;

       while (true) {
          int l = index;
          index += -1;
         if (l <= 0) {
            wx_2xxx = this.ra0;
            wx_2x = this.ra0;
            wx_2xxx = wx_2xx = this.ra0;
            this.ra0.Rv = 0;
            wx_2x.YB0 = wx_2xxx.uT();
            short[] ashort2 = ashort = wx_2xxx.L1;
            abyte = wx_2xx.Ut;
            index = ashort2.length;

            while (true) {
               int i1 = index;
               index += -1;
               if (i1 <= 0) {
                  byte b0 = 0;

                  while (true) {
                     VU[] avu = this.ET;
                     if (b0 >= this.ET.length) {
                        boolean flag = false;
                        byte b1 = 0;

                        while (true) {
                           VU[] avu1 = this.ET;
                           if (b1 >= this.ET.length) {
                              i[] ai = this.NK0;
                              int j = this.NK0.length;

                               for (int k = 0; k < j; k++) {
                                  i ix = ai[k];
                                  if (ix != null) {
                                     ix.yj0 = null;
                                     ix.yB0();
                                     if (ix.z70 == null) {
                                        ix.z70 = new N1(new t5_0(ix), gn_0.WHITE);
                                    }

                                    if (!ix.pq.I8.vn()) {
                                       switch (ix.pq.I8.Yb0) {
                                          case 150:
                                          case 249:
                                          case 384:
                                          case 493:
                                          case 647:
                                             break;
                                          default:
                                             if (Arrays.asList(this.ET).contains(ix.pq)) {
                                                if (this.Do == 2) {
                                                   VU vu1 = ix.pq;
                                                   String s;
                                                   if (ix.pq == null) {
                                                      s = "";
                                                   } else {
                                                      s = vu1.na0();
                                                   }

                                                   ix.yj0 = s;
                                                   ix.yB0();
                                                } else {
                                                   ix.yj0 = lb0_2.Ky(ix.pq, false, false, false);
                                                   ix.yB0();
                                                }

                                                ix.pw0(false);
                                                ix.z70.bT(new gn_0((byte)0, (byte)0, (byte)0, (byte)55), 250);
                                             } else if ((this.uI & 4) != 0 && this.jq.bL0(ix.pq.I8.Yb0)) {
                                                ix.yj0 = sm0_0.c0(5723);
                                                ix.yB0();
                                                ix.pw0(false);
                                                ix.z70.bT(new gn_0((byte)0, (byte)0, (byte)0, (byte)55), 250);
                                             } else if ((this.uI & 2) != 0 && ix.pq.I8.rh0() > 0 && this.ra0.bL0(ix.pq.I8.rh0())) {
                                                ix.yj0 = sm0_0.c0(5724);
                                                ix.yB0();
                                                ix.pw0(false);
                                                ix.z70.bT(new gn_0((byte)0, (byte)0, (byte)0, (byte)55), 250);
                                             } else {
                                                byte b2 = this.uI;
                                                if ((this.uI & 16) != 0 && ix.pq.I8.wj > 50) {
                                                   ix.yj0 = sm0_0.wa0(5740, String.valueOf(50));
                                                   ix.yB0();
                                                   ix.pw0(false);
                                                   ix.z70.bT(new gn_0((byte)0, (byte)0, (byte)0, (byte)55), 250);
                                                } else if ((b2 & 32) != 0 && ix.pq.I8.iB()) {
                                                   ix.yj0 = sm0_0.c0(5726);
                                                   ix.yB0();
                                                   ix.pw0(false);
                                                   ix.z70.bT(new gn_0((byte)0, (byte)0, (byte)0, (byte)55), 250);
                                                } else {
                                                   if (this.Do == 2) {
                                                      VU vu2 = ix.pq;
                                                      String s1;
                                                      if (ix.pq == null) {
                                                         s1 = "";
                                                      } else {
                                                         s1 = vu2.na0();
                                                      }

                                                      ix.yj0 = s1;
                                                      ix.yB0();
                                                   } else {
                                                      ix.yj0 = lb0_2.Ky(ix.pq, false, false, false);
                                                      ix.yB0();
                                                   }

                                                   ix.pw0(true);
                                                   ix.z70.bT(gn_0.WHITE, 250);
                                                }
                                             }
                                             continue;
                                       }
                                    }

                                    ix.pw0(false);
                                    ix.z70.bT(new gn_0((byte)0, (byte)0, (byte)0, (byte)55), 250);
                                 }
                              }

                              this.f3.pw0(flag ^ true);
                              return;
                           }

                           if (avu1[b1] == null) {
                              flag = true;
                           }

                           b1++;
                        }
                     }

                     VU vu;
                     if ((vu = avu[b0]) != null) {
                        this.jq.TI0(vu.I8.Yb0);
                        this.ra0.TI0(this.ET[b0].I8.rh0());
                     }

                     b0++;
                  }
               }

               ashort[index] = wx_2xx.Tn0;
               abyte[index] = 0;
            }
         }

         ashort[index] = wx_2xx.Tn0;
         abyte[index] = 0;
      }
   }
}
