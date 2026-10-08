package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Random;
import org.lwjgl.glfw.GLFW;

public class BattleActiveMonsterUpdatePacket extends pd0_0 {
   public a10_0 Gf;
   public PF[][] Cx0;
   public O8[] Ui0;
   public _volatile zT;
   public boolean CoM7;
   public boolean OA;
   public boolean gd0;
   public boolean TM;
   public byte uR = -1;
   public byte e7 = 0;
   public byte k3 = 0;
   public N2[] qU = N2.N60;
   public lq0[] c70 = lq0.CoM4;
   public dl_2[][] e10 = null;
   public byte Km = -1;
   public short ro = 0;
   public av_1 eA = null;
   public XA0 ri0;
   public d70_0 XH = d70_0.Do;
   public int vK = 0;
   public Oy0 uy0;
   public gc_2[] Xn0 = gc_2.Uu;
   public byte Nn = 0;
   public int m;
   public boolean r40;

   public BattleActiveMonsterUpdatePacket(k20_0 k20_0, ByteBuffer bytebuffer) {
      super(k20_0, bytebuffer);
   }

   @Override
   public final void Oj0() {
      int i = super.Rj.get();
      int j = super.Rj.get();
      int k = super.Rj.get();
      Cq cq = Cq.Gl(super.Rj.get());
      byte b0 = super.Rj.get();
      this.ri0 = (XA0)t_0.BI0(XA0.kN.BM(b0), XA0.class, b0);
      b0 = super.Rj.get();
      rh0_1 battleType = (rh0_1)t_0.BI0(rh0_1.ze0.BM(b0), rh0_1.class, b0);
      int l = super.Rj.getInt();
      int i1 = super.Rj.getShort();
      byte b1 = super.Rj.get();
      zg0_0 battleMode = (zg0_0)t_0.BI0(zg0_0.pQ.BM(b1), zg0_0.class, b1);
      boolean flag;
      if (super.Rj.get() == 1) {
         flag = true;
      } else {
         flag = false;
      }

      boolean flag1 = super.Rj.get() == 1;
      int flags = super.Rj.getInt();
      this.OA = (flags & 4) != 0;
      this.gd0 = (flags & 65536) != 0;
      this.TM = (flags & 262144) != 0;
      if ((flags & 2) != 0) {
         this.CoM7 = true;
         this.uR = super.Rj.get();
      }

      if ((flags & 8) != 0) {
         this.e7 = super.Rj.get();
      }

      if ((flags & 16) != 0) {
         this.qU = N2.qk0(super.Rj.get());
      }

      if ((flags & 32) != 0) {
         this.c70 = this.Nx0();
      }

      if ((flags & 64) != 0) {
         this.e10 = new dl_2[2][];

         for (int j3 = 0; j3 < 2; j3++) {
            byte b2 = super.Rj.get();
            this.e10[j3] = new dl_2[b2];

            for (int k1 = 0; k1 < b2; k1++) {
               if (super.Rj.get() != 0) {
                  dl_2[] adl_2 = this.e10[j3];
                  dl_2 dl_2;
                  dl_2 = new dl_2();
                  adl_2[k1] = dl_2;
                  dl_2 = this.e10[j3][k1];
                  boolean active = super.Rj.get() == 1;
                  int duration = super.Rj.getShort() & '\uffff';
                  dl_2.Ui0 = active;
                  dl_2.VS = duration;
                  if (active) {
                     dl_2.V1 = (int)(System.currentTimeMillis() / 1000L);
                     int remaining;
                     if (dl_2.Ui0) {
                        remaining = dl_2.VS - (int)(System.currentTimeMillis() / 1000L - dl_2.V1);
                        if (remaining < 0) {
                           remaining = 0;
                        }

                        int l1 = dl_2.EG;
                        if (dl_2.EG > 0 && remaining > l1) {
                           remaining = l1;
                        }
                     } else {
                        remaining = dl_2.VS;
                        if (dl_2.VS < 0) {
                           remaining = 0;
                        }
                     }

                     dl_2.EG = remaining - 1;
                  } else {
                     dl_2.EG = -1;
                  }

                  this.e10[j3][k1].sE0 = super.Rj.getShort() & '\uffff';
               }
            }
         }
      }

      if ((flags & 128) != 0) {
         this.Km = super.Rj.get();
         this.ro = super.Rj.getShort();
      }

      if ((flags & 256) != 0) {
         this.eA = (av_1)av_1.rh.BM(super.Rj.get());
      }

      if ((flags & 512) != 0) {
         this.k3 = super.Rj.get();
      }

      if ((flags & 1024) != 0) {
         this.zT = (_volatile)_volatile.zs0.BM(super.Rj.get());
      }

      if ((flags & 2048) != 0) {
         byte value = super.Rj.get();
         this.uy0 = (Oy0)t_0.BI0(Oy0.Cu.BM(value), Oy0.class, value);
         this.Xn0 = gc_2.rY(super.Rj.get());
      }

      if ((flags & 4096) != 0) {
         this.m = super.Rj.getInt();
      }

      this.r40 = (flags & 8192) != 0;
      if ((flags & 16384) != 0) {
         byte value = super.Rj.get();
         j30_0 ignored = (j30_0)t_0.BI0(j30_0.v7.BM(value), j30_0.class, value);
      }

      if ((flags & 32768) != 0) {
         this.Nn = super.Rj.get();
      }

      boolean flag2 = false;
      dy_1 dy_1 = null;
      if (battleMode.u) {
         if (super.Rj.get() == 1) {
            flag2 = true;
         } else {
            flag2 = false;
         }

         if (super.Rj.get() != 0) {
            dy_1 = new dy_1();
            boolean flag6;
            if (super.Rj.get() == 1) {
               flag6 = true;
            } else {
               flag6 = false;
            }

            int k3x = super.Rj.getShort() & '\uffff';
            int l3 = super.Rj.getShort() & '\uffff';
            dy_1.K50 = flag6;
            dy_1.r6 = k3x;
            dy_1.sB0 = l3;
            if (flag6) {
               dy_1.yJ0 = (int)(System.currentTimeMillis() / 1000L);
               dy_1.coM5 = dy_1.mi0() - 1;
            } else {
               dy_1.coM5 = -1;
            }
         }
      }

      this.Cx0 = new PF[i][];
      this.Ui0 = new O8[i];

      for (byte b8 = 0; b8 < i; b8++) {
         this.Ui0[b8] = this.LPt4(b8);
         if (this.Ui0[b8].Td0() == con__6.Ei) {
            PF[][] apf3 = this.Cx0;
            PF[] apf6 = new PF[b8 > 0 ? cq.Lw0 : cq.e50];
            apf3[b8] = apf6;
         } else if (battleMode != zg0_0.ef0 && (battleMode != zg0_0.oi || b8 == j)) {
            PF[][] apf2 = this.Cx0;
            PF[] apf5 = new PF[b8 > 0 ? cq.Lw0 : cq.e50];
            apf2[b8] = apf5;
            int i4;
            if ((i4 = super.Rj.getInt()) != 0) {
               ek_0 ek_0 = this.Ui0[b8].zI;
               if ((i4 & 1) != 0) {
                  byte[][] abyte4 = new byte[super.Rj.get()][2];

                  for (int k4 = 0; k4 < abyte4.length; k4++) {
                     abyte4[k4][0] = super.Rj.get();
                     abyte4[k4][1] = super.Rj.get();
                  }

                  if (ek_0 != null) {
                     int l4 = abyte4.length;

                     for (int j5 = 0; j5 < l4; j5++) {
                        fq_2 move = fq_2.NG(abyte4[j5][0]);
                        byte b3 = abyte4[j5][1];
                        ek_0.Ka0(move, b3);
                     }
                  }
               }

               if ((i4 & 8) != 0) {
                  byte b15 = super.Rj.get();
                  if (ek_0 != null) {
                     ek_0.Wn0 = b15;
                  }
               }

               if ((i4 & 16) != 0) {
                  byte b16 = super.Rj.get();
                  if (ek_0 != null) {
                     ek_0.cU = b16;
                  }
               }

               if ((i4 & 32) != 0) {
                  byte b17 = super.Rj.get();
                  if (ek_0 != null) {
                     ek_0.COm5 = b17;
                  }
               }

               if ((i4 & 64) != 0) {
                  byte b18 = super.Rj.get();
                  if (ek_0 != null) {
                     ek_0.kI0 = b18;
                  }
               }

               if ((i4 & 128) != 0 && ek_0 != null) {
                  ek_0.Eo = true;
               }

               if ((i4 & 256) != 0) {
                  byte b19 = super.Rj.get();
                  if (ek_0 != null) {
                     ek_0.bB0 = b19;
                  }
               }

               if ((i4 & 512) != 0) {
                  byte b20 = super.Rj.get();
                  short short1 = super.Rj.getShort();
                  short short4 = super.Rj.getShort();
                  byte b27 = super.Rj.get();
                  if (ek_0 != null) {
                     ek_0.Rz0 = short4;
                     ek_0.rE0 = b20;
                     ek_0.wb0 = b27;
                     ek_0.vD0 = short1;
                     boolean flag7;
                     if (b27 > 1) {
                        flag7 = true;
                     } else {
                        flag7 = false;
                     }

                     ek_0.LPt4 = flag7;
                  }
               }

               if ((i4 & 1024) != 0) {
                  byte b21 = super.Rj.get();
                  short short2 = super.Rj.getShort();
                  short short5 = super.Rj.getShort();
                  byte b28 = super.Rj.get();
                  if (ek_0 != null) {
                     ek_0.fP = short5;
                     ek_0.aw0 = b21;
                     ek_0.ei0 = b28;
                     ek_0.id0 = short2;
                     boolean flag8;
                     if (b28 > 1) {
                        flag8 = true;
                     } else {
                        flag8 = false;
                     }

                     ek_0.Oa = flag8;
                  }
               }

               if ((i4 & 2048) != 0) {
                  byte b22 = super.Rj.get();
                  if (ek_0 != null) {
                     ek_0.Jy0 = b22;
                  }
               }

               if ((i4 & 4096) != 0) {
                  byte b23 = super.Rj.get();
                  if (ek_0 != null) {
                     ek_0.tw = b23;
                  }
               }

               if ((i4 & 8192) != 0) {
                  byte b24 = super.Rj.get();
                  if (ek_0 != null) {
                     ek_0.CT = b24;
                  }
               }

               if ((i4 & 16384) != 0 && ek_0 != null) {
                  ek_0.HT = true;
               }
            }

            byte b10 = super.Rj.get();

            for (byte b13 = 0; b13 < b10; b13++) {
               byte b25 = super.Rj.get();

               for (int i5 = 0; i5 < b25; i5++) {
                  O8 o82 = this.Ui0[b8];
                  Oy0 oy01 = this.uy0;
                  gc_2[] agc_21 = this.Xn0;
                  this.cI0(o82, oy01, agc_21);
               }
            }

            for (byte b11 = 0; b11 < (apf5 = this.Cx0[b8]).length; b11++) {
               O8 o83 = this.Ui0[b8];
               XA0 xa01 = this.ri0;
               apf5[b11] = this.ml(o83, b11, xa01);
            }
         } else {
            this.Cx0[b8] = new PF[super.Rj.get()];

            PF[] apf4;
            for (byte b9 = 0; b9 < (apf4 = this.Cx0[b8]).length; b9++) {
               PF pf1;
               if (super.Rj.get() == 0) {
                  pf1 = null;
               } else {
                  tb0_1 tb0_1;
                  tb0_1 tb0_1x = tb0_1 = this.Ui0[b8].zz()[b9];
                  b30_0 slot = b30_0.U5(b8, b9);
                  CH0 ch0 = CH0.j1;
                  short short6 = super.Rj.getShort();
                  byte b30 = super.Rj.get();
                  byte b31 = super.Rj.get();
                  byte b32 = super.Rj.get();
                  short short7 = super.Rj.getShort();
                  QL ql = QL.lQ;
                  tb0_1x.eo0(ch0, short6, b30, "", b31, b32, (short)0, short7, (short)1, (short)1, ql, (byte)0, (byte)3);
                  PF pf2;
                  pf2 = new PF(this.Ui0[b8], tb0_1, slot);
                  pf1 = pf2;
               }

               apf4[b9] = pf1;
            }
         }
      }

      XA0 xa0 = this.ri0;
      if (this.ri0 == XA0.PRN) {
         byte b7 = this.e7;
         _volatile _volatile = this.zT;
         N2[] an21 = this.qU;
         lq0[] alq01 = this.c70;
         O8[] ao83 = this.Ui0;
         PF[][] apf7 = this.Cx0;
         cj_0 cj_0x = new cj_0(cq, battleMode, l, b7, battleType, xa0, _volatile, an21, alq01, (byte)j, flag, ao83, apf7);
         cj_0x.v5 = ib0_0.NV(super.Rj.get());
         super.Rj.get();
         if ((i = super.Rj.get()) < 0) {
            i = (byte)0;
         }

         if (i > 5) {
            i = (byte)5;
         }

         cj_0x.A3 = (byte)i;
         this.Gf = cj_0x;
      } else {
         byte b12 = this.e7;
         byte b14 = this.k3;
         byte b26 = this.Km;
         short short3 = this.ro;
         _volatile _volatilex = this.zT;
         boolean flag9 = this.CoM7;
         byte b29 = this.uR;
         byte b4 = this.Nn;
         N2[] an2 = this.qU;
         lq0[] alq0 = this.c70;
         Oy0 oy0 = this.uy0;
         gc_2[] agc_2 = this.Xn0;
         O8[] ao8 = this.Ui0;
         PF[][] apf = this.Cx0;
         boolean flag4 = this.OA;
         a10_0 a10_0xxx = new a10_0(
            cq, battleMode, l, b12, b14, battleType, xa0, b26, short3, _volatilex, flag9, b29, b4, an2, alq0, oy0, agc_2, (byte)j, (byte)k, flag, ao8, apf, flag4
         );
         this.Gf = a10_0xxx;
         a10_0 a10_0x = this.Gf;
         if (a10_0xxx.m2 = this.gd0) {
            O8[] ao81 = a10_0xxx.eG;
            j = a10_0xxx.eG.length;

            for (int i2 = 0; i2 < j; i2++) {
               O8 o8;
               if ((o8 = ao81[i2]) instanceof pi0_1) {
                  ((pi0_1)o8).Jo = true;
               } else if (o8 instanceof Jh && o8.Td0().M8) {
                  Jh jh = (Jh)o8;
                  ((Jh)o8).Jo = true;
                  Iterator iterator = jh.l40.values().iterator();

                  while (iterator.hasNext()) {
                     ((sv_2)iterator.next()).Uf0.Jo = true;
                  }
               }
            }
         }

         this.Gf.getClass();
         if (((i = super.Rj.getInt()) & 1) != 0) {
            byte b5 = super.Rj.get();
            this.XH = (d70_0)t_0.BI0(d70_0.UB.BM(b5), d70_0.class, b5);
            this.vK = super.Rj.getInt();
         }

         if ((i & 2) != 0) {
            a10_0x = this.Gf;
            bj0_2 bj0_2;
            gw0_0 gw0_0xx;
            bj0_2 = new bj0_2(gw0_0xx = gw0_0.U4, super.Rj.get());
            a10_0x.l2.put(gw0_0xx, bj0_2);
         }

         if ((i & 4) != 0) {
            a10_0x = this.Gf;
            bj0_2 bj0_2x;
            gw0_0 gw0_0xxxx;
            bj0_2x = new bj0_2(gw0_0xxxx = gw0_0.cZ, super.Rj.get());
            a10_0x.l2.put(gw0_0xxxx, bj0_2x);
         }

         if ((i & 8) != 0) {
            a10_0x = this.Gf;
            bj0_2 bj0_2xx;
            gw0_0 gw0_0xxxxx;
            bj0_2xx = new bj0_2(gw0_0xxxxx = gw0_0.sm0, super.Rj.get());
            a10_0x.l2.put(gw0_0xxxxx, bj0_2xx);
         }

         if ((i & 16) != 0) {
            a10_0x = this.Gf;
            bj0_2 bj0_2xxx;
            gw0_0 combatModifier = gw0_0.cOm9;
            bj0_2xxx = new bj0_2(combatModifier, super.Rj.get());
            a10_0x.l2.put(combatModifier, bj0_2xxx);
         }

         if ((i & 32) != 0) {
            this.Gf.getClass();
         }

         if ((i & 64) != 0) {
            a10_0x = this.Gf;
            bj0_2 bj0_2xxxxx;
            gw0_0 gw0_0x;
            bj0_2xxxxx = new bj0_2(gw0_0x = gw0_0.lV, super.Rj.get());
            a10_0x.l2.put(gw0_0x, bj0_2xxxxx);
         }

         if ((i & 128) != 0) {
            a10_0x = this.Gf;
            bj0_2 bj0_2xxxx;
            gw0_0 gw0_0xxx;
            bj0_2xxxx = new bj0_2(gw0_0xxx = gw0_0.vz, super.Rj.get());
            a10_0x.l2.put(gw0_0xxx, bj0_2xxxx);
         }
      }

      a10_0 a10_0x = this.Gf;
      a10_0x.I60 = this.e10;
      a10_0x.rU = dy_1;
      a10_0x.Pl0 = (short)i1;
      a10_0x.vy0 = flag2;
      a10_0x.p10 = this.eA;
      a10_0x.a40 = flag1;
      a10_0x.O00 = this.XH;
      a10_0x.Xe0 = this.vK;
      j = this.m;
      if (this.m != 0) {
         Random random;
         random = new Random(j);
         Iq0 iq0 = new Iq0(Math.max(tw0_0.Ll0.Nl0.length, 10));
         byte[] abyte = tw0_0.Ll0.Nl0;
         Iq0 iq01 = iq0;
         iq01.B30(abyte);
         int j2;
         if (iq01.dg((byte)0) && iq0.dg((byte)1) && (j2 = iq0.Q80((byte)0)) >= 0) {
            iq0.dx0(j2);
         }

         int slotCount = iq0.Rv;
         byte[] abyte1 = new byte[slotCount];
         byte[] abyte2 = iq0.MO;
         byte[] abyte3;
         i1 = (abyte3 = iq0.Ut).length;
         int candidateCount = 0;

         while (true) {
            int k5 = i1;
            i1 += -1;
            if (k5 <= 0) {
               byte b6 = abyte1[random.nextInt(slotCount)];
               short[] ashort = a10_0.Fk0[b6];
               short[] ashort1 = a10_0.Fk0[b6];
               a10_0x.LPt4 = b6;
               a10_0x.pk = ashort[random.nextInt(ashort1.length)];
               break;
            }

            if (abyte3[i1] == 1) {
               abyte1[candidateCount] = abyte2[i1];
               candidateCount++;
            }
         }
      }

      a10_0 a10_0xxxx = this.Gf;
      a10_0x = a10_0xxxx;
      this.Gf.iv0 = this.r40;
      O8[] ao82;
      k = (ao82 = a10_0x.eG).length;

      for (int k2 = 0; k2 < k; k2++) {
         O8 o81 = ao82[k2];
         if (!a10_0xxxx.a40 && o81 instanceof MC) {
            tw0_0.e60.qu0(((MC)o81).ZG);
         }

         if (a10_0xxxx.nf == Cq.Sa0) {
            PF[] apf1;
            l = (apf1 = a10_0xxxx.wI0[o81.ZG0]).length;

            for (int l2 = 0; l2 < l; l2++) {
               PF pf;
               if ((pf = apf1[l2]) != null && pf.zi0.Bj()) {
                  a10_0xxxx.Nv0 = pf;
                  break;
               }
            }
         }
      }

      if (!a10_0xxxx.a40 && !tw0_0.LD0.Rg0 && (a10_0xxxx.m40 || a10_0xxxx.S0 * 60 > 0)) {
         try {
            GLFW.glfwRequestWindowAttention(lg_0.S4.rt0.hc0);
         } finally {
            ;
         }

         if (dw_2.t00) {
            tw0_0.RE0.P7((short)1617);
         }
      }

      a10_0 a10_0xxxxx;
      if ((a10_0xxxxx = this.Gf).m40 && flag && (!battleMode.u || a10_0xxxxx.a40)) {
         uy_2 uy_2;
         uy_2 = new uy_2();
         a10_0xxxxx.Tk0.add(uy_2);
      }
   }

   @Override
   public final void os0() {
      if (tw0_0.PK0 != null) {
         jn_2 activeBattle = tw0_0.LD0.hO;
         if (activeBattle != null) {
            BR br = tw0_0.rl;
            if (br != null) {
               CH0 ch0 = activeBattle.zA.pu;
               boolean flag = !activeBattle.W0.ah0;
               br.fk0.uQ(new f2_0(ch0, flag));
            }

            tw0_0.RE0.qq();
            jn_0 state = tw0_0.LD0;
            activeBattle = state.hO;
            if (activeBattle != null) {
               activeBattle.dispose();
               state.hO = null;
            }

            Oz0 oz0 = state.he0;
            if (oz0 != null) {
               oz0.dispose();
               state.he0 = null;
            }

            ML0 ml0 = state.d6.ZW;
            if (ml0 != null) {
               ml0.xe0();
            }

            tw0_0.PK0 = null;
         } else {
            a10_0 previous = tw0_0.PK0;
            if (!previous.a40 && !previous.mo() && previous.nf != Cq.Jd) {
               throw new RuntimeException("");
            }

            Oz0 overlay = tw0_0.LD0.he0;
            overlay.OE = ca_2.zc0;
            overlay.Ow0();
            overlay.N10.lZ.clear();
            previous.Tk0.clear();
            previous.lPt9.clear();
            tw0_0.RE0.qq();
            xr_0 xr = tw0_0.Jp;
            if (xr != null) {
               xr.Dc0 = true;
               tw0_0.Jp = null;
            }

            tw0_0.PK0 = null;
            jn_0 state = tw0_0.LD0;
            state.he0.dispose();
            state.he0 = null;
            ML0 ml01 = state.d6.ZW;
            if (ml01 != null) {
               ml01.xe0();
            }
         }
      }

      if ((tw0_0.PK0 = this.Gf).kd0()) {
         Mj mj = this.sr0().r1(_volatile.BV);
         mj.rr0 = true;
         mj.jf = false;
      }

      a10_0 a10_0xx;
      if ((a10_0xx = this.Gf).a40) {
         Yl yl = Qy0.yI0.zK0.Vi0;
         if (Qy0.yI0.zK0.Vi0 != null) {
            yl.Yi0(true, false);
         }
      } else {
         a10_0xx.H30();
      }
   }

   public final O8 LPt4(byte b0) {
      con__6 con__6x = con__6.i80(super.Rj.get());
      byte b1 = 6;
      if (con__6x != con__6.Ei) {
         b1 = super.Rj.get();
      }

      switch (con__6x.v00) {
         case 0:
            String s = this.q60();
            byte b7 = super.Rj.get();
            this.pE();
            byte b8 = super.Rj.get();
            if (this.TM) {
               super.Rj.get();
            }

            boolean flag = super.Rj.get() == 1;
            gt0_0 effect = null;
            short short1 = -1;
            byte b9 = 0;
            if (flag) {
               effect = (gt0_0)gt0_0.jn0.BM(super.Rj.get());
               short1 = super.Rj.getShort();
               b9 = super.Rj.get();
            }

            qe0_2 qe0_2 = this.ki();
            ec0_1 ec0_1;
            ec0_1 = new ec0_1(b7, qe0_2);
            return new pi0_1(b0, s, ec0_1, effect, short1, b9, b1, b8);
         case 1:
            return new ux_0(b0, b1);
         case 2:
            return new MC(b0, super.Rj.get(), super.Rj.getShort(), b1, super.Rj.get());
         case 3:
            byte b10 = super.Rj.get();
            byte b11 = super.Rj.get();
            byte b6 = super.Rj.get();
            int k = super.Rj.getInt();
            byte b4 = super.Rj.get();
            return new MC(b0, b10, b11, b6, k, b1, b4);
         case 4:
         case 5:
            int i;
            sv_2[] asv_2 = new sv_2[i = super.Rj.get() & 0xFF];

            for (int j = 0; j < i; j++) {
               byte b2 = super.Rj.get();
               byte b3 = super.Rj.get();
               super.Rj.get();
               O8 o8 = this.LPt4(b0);
               sv_2 sv_2;
               sv_2 = new sv_2(o8, b2, b3);
               asv_2[j] = sv_2;
            }

            return this.ri0 == XA0.Fz ? new V6(b0, con__6x, asv_2, b1) : new Jh(b0, con__6x, asv_2, b1);
         case 6:
            return new qe_1(b0);
         default:
            return null;
      }
   }
}

