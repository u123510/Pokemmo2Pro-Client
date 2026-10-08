package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public abstract class BaseBattleActionInboundPacket extends GH {
   public static final dl_1 ZD = Cq0.E1(BaseBattleActionInboundPacket.class);

   public BaseBattleActionInboundPacket(ByteBuffer var1, k20_0 var2) {
      super(var2, var1);
   }

   public final Nt S2() {
      Nt var15 = null;
      Nt var41 = null;
      Nt var158 = null;
      short var1 = super.Rj.get();
      byte var2;
      short var10000 = var2 = super.Rj.get();
      CH0 var3 = CH0.j1;
      int var4;
      CH0 var5;
      if ((var4 = var10000 | 1) == var2) {
         var5 = this.pE();
      } else {
         var5 = var3;
      }

      int var6;
      CH0 var7;
      if ((var6 = var2 | 2) == var2) {
         var7 = this.pE();
      } else {
         var7 = var3;
      }

      label642: {
         label556: {
            label555: {
               label524:
               switch (var1) {
                  case -39:
                     var41 = new pk_2(this.throws$(), i40_0.MG0(this.throws$()));
                     break label555;
                  case -38:
                     var41 = new ZC0(this.throws$(), this.throws$());
                     break label555;
                  case -37:
                     byte var66;
                     byte var176 = var66 = this.throws$();
                     i40_0 var102 = i40_0.Gc;
                     if (var176 == 1) {
                        var102 = i40_0.MG0(this.throws$());
                     }

                     var15 = new RS(var66, var102);
                     break label642;
                  case -36:
                     this.throws$();
                     var1 = this.mC0();
                     byte var101;
                     CH0[] var126 = new CH0[var101 = this.throws$()];

                     for (int var140 = 0; var140 < var101; var140++) {
                        var126[var140] = this.pE();
                     }

                     var15 = new e40(var1, var126);
                     break label642;
                  case -35:
                     short[] var64 = new short[4];
                     byte[] var100 = new byte[4];

                     for (int var125 = 0; var125 < 4; var125++) {
                        var64[var125] = this.mC0();
                        var100[var125] = this.throws$();
                     }

                     var15 = new he_1(var64, var100);
                     break label642;
                  case -34:
                     var41 = new ya_0(this.throws$());
                     break label555;
                  case -33:
                     byte var63;
                     if ((var63 = this.throws$()) != 3 && var63 != 4 && var63 != 5) {
                        var15 = new nj0_2(var63);
                        break label642;
                     }

                     nj0_2 var99;
                     var99 = new nj0_2(var63, this.q60());
                     var158 = var99;
                     break label556;
                  case -32:
                     byte var62;
                     CH0[] var98 = new CH0[var62 = this.throws$()];

                     for (int var124 = 0; var124 < var62; var124++) {
                        var98[var124] = this.pE();
                     }

                     var15 = new com9__1(var98);
                     break label642;
                  case -31:
                     var41 = new H3(this.throws$());
                     break label555;
                  case -30:
                     byte var97 = this.throws$();
                     byte var123 = this.throws$();
                     byte var139 = this.throws$();
                     byte var148 = this.throws$();
                     short var154 = this.mC0();
                     this.mC0();
                     boolean var38;
                     if (this.throws$() == 1) {
                        var38 = true;
                     } else {
                        var38 = false;
                     }

                     
var41 = new pw0_0(var97, var123, var139, var148, var154, var38);
                     break label555;
                  case -29:
                     byte var96 = super.Rj.get();
                     byte var122 = super.Rj.get();
                     byte var138 = this.throws$();
                     boolean var37;
                     if (this.throws$() == 1) {
                        var37 = true;
                     } else {
                        var37 = false;
                     }

                     
var41 = new he0_0(var96, var122, var138, var37);
                     break label555;
                  case -28:
                     var15 = new jw_1();
                     break label642;
                  case -27:
                  case -25:
                  case -24:
                  case -23:
                     byte var95 = super.Rj.get();
                     byte var121;
                     byte var175 = var121 = super.Rj.get();
                     CH0[] var137 = new CH0[var175];
                     short[] var147 = new short[var175];

                     for (int var153 = 0; var153 < var121; var153++) {
                        var137[var153] = this.pE();
                        var147[var153] = super.Rj.getShort();
                     }

                     switch (var1) {
                        case -27:
                           var15 = new uz_0(var95, var137, var147);
                           break label642;
                        case -26:
                        default:
                           break label524;
                        case -25:
                           var15 = new ks_0(var95, var137, var147);
                           break label642;
                        case -24:
                           var15 = new Zp0(var95, var137, var147);
                           break label642;
                        case -23:
                           var15 = new kl_0(var95, var137, var147);
                           break label642;
                     }
                  case -26:
                     var41 = new ay0_0(super.Rj.getShort());
                     break label555;
                  case -22:
                     var41 = new cx0(this.pE(), this.q60());
                     break label555;
                  case -21:
                     var41 = new l7_0(gc_2.PR(super.Rj.getInt()));
                     break label555;
                  case -20:
                     
                     super.Rj.get();
                     var41 = new TR();
                     break label555;
                  case -19:
                     var41 = new js0(super.Rj.get());
                     break label555;
                  case -18:
                     var41 = new ei0_0(super.Rj.get(), super.Rj.get(), super.Rj.get());
                     break label555;
                  case -17:
                     if ((var1 = super.Rj.get()) == 33) {
                        u30_0 var93;
                        
                        byte var61 = super.Rj.get();
                        gc_2[] var36 = gc_2.rY(super.Rj.get());
                        var93 = new u30_0((byte)var1, var61, this.pE(), var36);
                        var158 = var93;
                     } else {
                        u30_0 var94;
                        var94 = new u30_0((byte)var1, super.Rj.get(), this.pE());
                        var158 = var94;
                     }
                     break label556;
                  case -16:
                     byte var92 = super.Rj.get();
                     boolean var35;
                     if (super.Rj.get() == 1) {
                        var35 = true;
                     } else {
                        var35 = false;
                     }

                     
var41 = new lu0_0(var92, var35);
                     break label555;
                  case -15:
                     var41 = new ph0_1(super.Rj.getShort());
                     break label555;
                  case -14:
                     byte var58;
                     gc_2[] var91 = new gc_2[var58 = super.Rj.get()];

                     for (int var119 = 0; var119 < var58; var119++) {
                        var91[var119] = (gc_2)gc_2.z80.BM(super.Rj.get());
                     }

                     var58 = super.Rj.get();
                     byte var120;
                     byte[] var136 = new byte[var120 = super.Rj.get()];

                     for (int var146 = 0; var146 < var120; var146++) {
                        var136[var146] = super.Rj.get();
                     }

                     var15 = new ah_0(var91, var58, var136);
                     break label642;
                  case -13:
                     var41 = new as_1(super.Rj.getShort());
                     break label555;
                  case -12:
                     var41 = new av_0(super.Rj.getShort());
                     break label555;
                  case -11:
                     var41 = new jp_1(super.Rj.getShort());
                     break label555;
                  case -10:
                     var41 = new y9_0(super.Rj.get());
                     break label555;
                  case -9:
                     var41 = new xp_0(super.Rj.get());
                     break label555;
                  case -8:
                     var41 = new l10_0(super.Rj.get());
                     break label555;
                  case -7:
                     var15 = new dk_1();
                     break label642;
                  case -6:
                     var41 = new dh_0(GV.Zd(super.Rj.get()), super.Rj.getShort());
                     break label555;
                  case -5:
                     var41 = new rw_2(super.Rj.get());
                     break label555;
                  case -4:
                     var41 = new xg0_1(super.Rj.get());
                     break label555;
                  case -3:
                     var41 = new ip_0(super.Rj.get());
                     break label555;
                  case -2:
                     var41 = new DS(super.Rj.getShort());
                     break label555;
                  case -1:
                     var41 = new od_2(super.Rj.getShort());
                     break label555;
                  case 0:
                     var41 = new ka_0(super.Rj.getShort());
                     break label555;
                  case 1:
                     var1 = super.Rj.get();
                     byte var89;
                     boolean var118;
                     if (((var89 = super.Rj.get()) & 128) == 0) {
                        var118 = true;
                     } else {
                        var118 = false;
                     }

                     gc_2 var90 = (gc_2)gc_2.z80.BM((byte)(var89 & 127));
                     xy_0 var135;
                     var135 = new xy_0((byte)var1, var90, super.Rj.get(), super.Rj.get(), var118);
                     var158 = var135;
                     break label556;
                  case 2:
                     var10000 = var1 = super.Rj.get();
                     UN var117;
                     byte var134 = super.Rj.get();
                     short var145;
                     if (var10000 == 1) {
                        var145 = super.Rj.getShort();
                     } else {
                        var145 = 0;
                     }

                     if (var1 == 3) {
                        var3 = this.pE();
                     }

                     var117 = new UN((byte)var1, var134, var3, var145);
                     var158 = var117;
                     break label556;
                  case 3:
                     var41 = new o0_0(super.Rj.getShort());
                     break label555;
                  case 4:
                     var158 = gw_1.class$;
                     break label556;
                  case 5:
                     boolean var33;
                     if ((super.Rj.get() & 255) == 1) {
                        var33 = true;
                     } else {
                        var33 = false;
                     }

                     
var41 = new R50(var33);
                     break label555;
                  case 6:
                     var41 = new OK(super.Rj.getShort());
                     break label555;
                  case 7:
                     boolean var32;
                     if ((super.Rj.get() & 255) == 1) {
                        var32 = true;
                     } else {
                        var32 = false;
                     }

                     
var41 = new s00_0(var32);
                     break label555;
                  case 8:
                     boolean var31;
                     if ((super.Rj.get() & 255) == 1) {
                        var31 = true;
                     } else {
                        var31 = false;
                     }

                     
var41 = new aq_1(var31);
                     break label555;
                  case 9:
                  default:
                     dl_1 var171 = ZD;
                     Byte var179 = Byte.valueOf((byte)var1);
                     RuntimeException var30;
                     var30 = new RuntimeException();
                     var171.error("{}", var179, var30);
                     break;
                  case 10:
                     var41 = new qv_2(super.Rj.get());
                     break label555;
                  case 11:
                     byte var11Val = super.Rj.hasRemaining() ? super.Rj.get() : (byte) 2;
                     var41 = new WK0(var11Val);
                     break label555;
                  case 12:
                     byte var29 = super.Rj.get();
                     var41 = new ba_1((d70_0)t_0.BI0(d70_0.UB.BM(var29), d70_0.class, var29));
                     break label555;
                  case 13:
                     
                     byte var88 = super.Rj.get();
                     var41 = new xr_1((d70_0)t_0.BI0(d70_0.UB.BM(var88), d70_0.class, var88), super.Rj.getShort());
                     break label555;
                  case 14:
                     var41 = new v30_0(super.Rj.getShort(), b30_0.f5(super.Rj.get()), super.Rj.getShort());
                     break label555;
                  case 15:
                     boolean var28;
                     if (super.Rj.get() == 1) {
                        var28 = true;
                     } else {
                        var28 = false;
                     }

                     
var41 = new tf0_2(var28);
                     break label555;
                  case 16:
                     var41 = new ea_0(super.Rj.get());
                     break label555;
                  case 17:
                     byte var55 = super.Rj.get();
                     byte var87;
                     gc_2[] var116 = new gc_2[var87 = super.Rj.get()];

                     for (int var132 = 0; var132 < var87; var132++) {
                        var116[var132] = (gc_2)gc_2.z80.BM(super.Rj.get());
                     }

                     byte var133 = super.Rj.get();
                     byte var144;
                     byte[][] var152 = new byte[var144 = super.Rj.get()][];

                     for (int var155 = 0; var155 < var144; var155++) {
                        byte[] var156 = new byte[var87];
                        super.Rj.get(var156);
                        var152[var155] = var156;
                     }

                     var15 = new Iz0(var55, var116, var133, var152);
                     break label642;
                  case 18:
                     var41 = new nb0_0(super.Rj.getShort(), super.Rj.get());
                     break label555;
                  case 19:
                     var41 = new t90_0(super.Rj.getShort());
                     break label555;
                  case 20:
                     var15 = new jg_2();
                     break label642;
                  case 21:
                     var41 = new Hv0(super.Rj.get());
                     break label555;
                  case 22:
                     var41 = new t10_0(super.Rj.get());
                     break label555;
                  case 23:
                     byte var86 = super.Rj.get();
                     short var115 = super.Rj.getShort();
                     boolean var27;
                     if (super.Rj.get() == 1) {
                        var27 = true;
                     } else {
                        var27 = false;
                     }

                     
var41 = new prn__5(var115, var86, var27);
                     break label555;
                  case 24:
                     byte var54;
                     byte var168 = var54 = super.Rj.get();
                     short var85 = super.Rj.getShort();
                     short var114 = 0;
                     if (var168 == 1) {
                        var114 = super.Rj.getShort();
                     }

                     var15 = new sl_0(var54, var85, var114);
                     break label642;
                  case 25:
                     var41 = new _protected(super.Rj.get(), fq_2.NG(super.Rj.get()), super.Rj.get());
                     break label555;
                  case 26:
                     var41 = new g1_0(fq_2.NG(super.Rj.get()), super.Rj.getShort());
                     break label555;
                  case 27:
                     var41 = new z4_0(super.Rj.get());
                     break label555;
                  case 28:
                     byte var84 = super.Rj.get();
                     byte var113 = super.Rj.get();
                     boolean var26;
                     if (super.Rj.get() == 1) {
                        var26 = true;
                     } else {
                        var26 = false;
                     }

                     
var41 = new UP(var84, var113, var26);
                     break label555;
                  case 29:
                     var41 = new td_0(super.Rj.get(), i40_0.MG0(super.Rj.get()));
                     break label555;
                  case 30:
                     var41 = new na0_1(super.Rj.get(), super.Rj.getShort());
                     break label555;
                  case 31:
                     var1 = super.Rj.getShort();
                     byte var83 = super.Rj.get();
                     short[] var112 = new short[4];

                     for (int var130 = 0; var130 < 4; var130++) {
                        var112[var130] = super.Rj.getShort();
                     }

                     short var131 = super.Rj.getShort();
                     short var143 = super.Rj.getShort();
                     byte var151 = super.Rj.get();
                     byte[] var12 = gc_2.PR(super.Rj.getInt());
                     i40_0 var13 = i40_0.MG0(super.Rj.get());
                     i40_0 var25 = i40_0.MG0(super.Rj.get());
                     MQ var14;
                     var14 = new MQ(var1, var83, var112, var131, var143, var151, var12, var13, var25);
                     var158 = var14;
                     break label556;
                  case 32:
                     var41 = new fj_1(super.Rj.get());
                     break label555;
                  case 33:
                     var41 = new qa_0(super.Rj.getShort());
                     break label555;
                  case 34:
                     var15 = new pz_1();
                     break label642;
                  case 35:
                     boolean var24;
                     if ((super.Rj.get() & 255) == 1) {
                        var24 = true;
                     } else {
                        var24 = false;
                     }

                     
var41 = new p80_0(var24);
                     break label555;
                  case 36:
                     var41 = new IP(super.Rj.getShort());
                     break label555;
                  case 37:
                     var15 = new QK0();
                     break label642;
                  case 38:
                     var15 = new BA0();
                     break label642;
                  case 39:
                     var41 = new C20(super.Rj.getShort());
                     break label555;
                  case 40:
                     var15 = new jp_2();
                     break label642;
                  case 41:
                     var10000 = var1 = super.Rj.getShort();
                     KE var111;
                     if (var10000 == 273) {
                        var3 = this.pE();
                     }

                     var111 = new KE(var1, var3, super.Rj.getShort());
                     var158 = var111;
                     break label556;
                  case 42:
                     var41 = new iu_0(super.Rj.getShort());
                     break label555;
                  case 43:
                     short mlFirst = super.Rj.getShort();
                     byte mlType = super.Rj.get();
                     short mlSecond = super.Rj.getShort();
                     short mlThird = super.Rj.getShort();
                     short mlFourth = super.Rj.getShort();
                     var41 = new ml_1(mlType, mlFirst, mlSecond, mlThird, mlFourth);
                     break label555;
                  case 44:
                     var41 = new EJ(super.Rj.get());
                     break label555;
                  case 45:
                     var41 = new sb0_0(super.Rj.get());
                     break label555;
                  case 46:
                     var41 = new yb0_1(super.Rj.get(), super.Rj.getShort());
                     break label555;
                  case 47:
                     var41 = new m10_0(super.Rj.getShort());
                     break label555;
                  case 48:
                     var41 = new ai_1(super.Rj.get());
                     break label555;
                  case 49:
                     var41 = new A90(super.Rj.getShort());
                     break label555;
                  case 50:
                     var41 = new u10_0(super.Rj.get(), super.Rj.getShort());
                     break label555;
                  case 51:
                     byte var51;
                     byte var166 = var51 = super.Rj.get();
                     short var110 = super.Rj.getShort();
                     CH0 var129 = this.pE();
                     short var142 = 0;
                     short var150 = 0;
                     if ((var166 & 1) != 0) {
                        var3 = this.pE();
                     }

                     if ((var51 & 2) != 0 || (var51 & 8) != 0) {
                        var142 = super.Rj.getShort();
                     }

                     if ((var51 & 4) != 0) {
                        var150 = super.Rj.getShort();
                     }

                     var15 = new bv_0(var51, var110, var129, var3, var142, var150);
                     break label642;
                  case 52:
                     var41 = new ld0_0(super.Rj.getShort());
                     break label555;
                  case 53:
                     var41 = new Kv0(super.Rj.getShort());
                     break label555;
                  case 54:
                     var41 = new qs_2(super.Rj.getShort(), super.Rj.getShort());
                     break label555;
                  case 55:
                     var41 = new tz_2(super.Rj.getShort(), super.Rj.getShort());
                     break label555;
                  case 56:
                     var41 = new PM(
                        super.Rj.getShort(), (gc_2)gc_2.z80.BM(super.Rj.get()), super.Rj.get(), super.Rj.get()
                     );
                     break label555;
                  case 57:
                     var41 = new E8(super.Rj.getShort());
                     break label555;
                  case 58:
                     var41 = new vd0_1(super.Rj.get());
                     break label555;
                  case 59:
                     var41 = new FA0(super.Rj.get());
                     break label555;
                  case 60:
                     byte var50;
                     short[] var81 = new short[var50 = super.Rj.get()];

                     for (int var109 = 0; var109 < var50; var109++) {
                        var81[var109] = super.Rj.getShort();
                     }

                     var15 = new ax_2(var81);
                     break label642;
                  case 61:
                     byte var49;
                     byte var165 = var49 = super.Rj.get();
                     v60_0 var80;
                     short var22;
                     if (var165 == 1) {
                        var22 = super.Rj.getShort();
                     } else {
                        var22 = 0;
                     }

                     var80 = new v60_0(var49, var22);
                     var158 = var80;
                     break label556;
                  case 62:
                     var41 = new COM1_(i40_0.MG0(super.Rj.get()), i40_0.MG0(super.Rj.get()), super.Rj.getShort());
                     break label555;
                  case 63:
                     var15 = new hd0_0();
                     break label642;
                  case 64:
                     var41 = new WF(super.Rj.getShort());
                     break label555;
                  case 65:
                     var41 = new p3_0(super.Rj.getShort(), super.Rj.getShort());
                     break label555;
                  case 66:
                     var41 = new ak0_0(super.Rj.getShort());
                     break label555;
                  case 67:
                     var15 = new bb0_1();
                     break label642;
                  case 68:
                     var41 = new QG(super.Rj.getShort(), super.Rj.getShort());
                     break label555;
                  case 69:
                     var41 = new qy0_0(super.Rj.get(), super.Rj.get(), super.Rj.getShort());
                     break label555;
                  case 70:
                     var41 = new bi_2(super.Rj.getShort());
                     break label555;
                  case 71:
                     var41 = new vc0_2(super.Rj.getShort());
                     break label555;
                  case 72:
                     var15 = new yf_0();
                     break label642;
                  case 73:
                     var41 = new im_1(super.Rj.getShort());
                     break label555;
                  case 74:
                     var41 = new Xv0(GV.Zd(super.Rj.get()));
                     break label555;
                  case 75:
                     var41 = new AB(super.Rj.getShort(), super.Rj.getShort());
                     break label555;
                  case 76:
                     byte var48 = super.Rj.get();
                     byte var79;
                     if ((var79 = super.Rj.get()) == 0) {
                        F8 var107;
                        var107 = new F8(var48, var79, super.Rj.getShort(), super.Rj.getShort());
                        var158 = var107;
                     } else {
                        F8 var108;
                        var108 = new F8(var48, var79, super.Rj.getInt());
                        var158 = var108;
                     }
                     break label556;
                  case 77:
                     var41 = new bg0_1(super.Rj.get());
                     break label555;
                  case 78:
                     var41 = new sf0_0(super.Rj.get());
                     break label555;
                  case 79:
                     var41 = new E70(super.Rj.get());
                     break label555;
                  case 80:
                     var41 = new ti0_0(super.Rj.get());
                     break label555;
                  case 81:
                     byte var47;
                     if ((var47 = super.Rj.get()) != 0) {
                        var15 = new VH0(var47);
                     } else {
                        byte var78;
                        byte[][] var106 = new byte[var78 = super.Rj.get()][];

                        for (int var128 = 0; var128 < var78; var128++) {
                           var106[var128] = new byte[super.Rj.get()];

                           byte[] var149;
                           for (int var141 = 0; var141 < (var149 = var106[var128]).length; var141++) {
                              var149[var141] = super.Rj.get();
                           }
                        }

                        var15 = new VH0(var47, var106);
                     }
                     break label642;
                  case 82:
                     var41 = new te_1(super.Rj.getShort());
                     break label555;
                  case 83:
                     var41 = new lq_1(super.Rj.getShort(), super.Rj.getShort());
                     break label555;
                  case 84:
                     var41 = new _throws(this.pE(), super.Rj.getShort());
                     break label555;
                  case 85:
                     var41 = new cm0_1(super.Rj.get());
                     break label555;
                  case 86:
                     byte var46;
                     if (com7__6.LPt8(var46 = super.Rj.get())) {
                        com7__6 var76;
                        var76 = new com7__6((gc_2)gc_2.z80.BM(super.Rj.get()), var46);
                        var158 = var76;
                     } else {
                        if (!com7__6.Lm(var46)) {
                           var15 = new com7__6(var46);
                           break label642;
                        }

                        com7__6 var77;
                        var77 = new com7__6(var46, super.Rj.getShort());
                        var158 = var77;
                     }
                     break label556;
                  case 87:
                     var15 = new TL();
                     break label642;
                  case 88:
                     var15 = new cc0_1();
                     break label642;
                  case 89:
                     short var75 = super.Rj.getShort();
                     boolean var20;
                     if (super.Rj.get() == 1) {
                        var20 = true;
                     } else {
                        var20 = false;
                     }

                     
var41 = new va0_0(var75, var20);
                     break label555;
                  case 90:
                     var41 = new r30_0(super.Rj.getShort());
                     break label555;
                  case 91:
                     var41 = new qn_0(super.Rj.getShort());
                     break label555;
                  case 92:
                     boolean var19;
                     if (super.Rj.get() == 1) {
                        var19 = true;
                     } else {
                        var19 = false;
                     }

                     
var41 = new qx_2(var19);
                     break label555;
                  case 93:
                     byte var45;
                     byte var164 = var45 = super.Rj.get();
                     sg0_2 var74;
                     short var18;
                     if (var164 == 2) {
                        var18 = super.Rj.getShort();
                     } else {
                        var18 = 0;
                     }

                     var74 = new sg0_2(var45, var18);
                     var158 = var74;
                     break label556;
                  case 94:
                     var41 = new Dv0(super.Rj.get());
                     break label555;
                  case 95:
                     var41 = new pf0_1(super.Rj.get());
                     break label555;
                  case 96:
                     var41 = new P5(super.Rj.getShort());
                     break label555;
                  case 97:
                     b30_0 var73 = b30_0.f5(super.Rj.get());
                     byte var105 = super.Rj.get();
                     boolean var17;
                     if (super.Rj.get() == 1) {
                        var17 = true;
                     } else {
                        var17 = false;
                     }

                     
var41 = new jc_0(var73, var105, var17);
                     break label555;
                  case 98:
                     byte var44;
                     byte var163 = var44 = super.Rj.get();
                     m3_0 var72;
                     short var16;
                     if (m3_0.bo0(var163)) {
                        var16 = super.Rj.getShort();
                     } else {
                        var16 = 0;
                     }

                     var72 = new m3_0(var44, var16);
                     var158 = var72;
                     break label556;
                  case 99:
                     var41 = new V40(super.Rj.getShort());
                     break label555;
                  case 100:
                     var1 = super.Rj.getShort();
                     int var71;
                     short[] var104 = new short[var71 = super.Rj.get() & 0xFF];

                     for (int var127 = 0; var127 < var71; var127++) {
                        var104[var127] = super.Rj.getShort();
                     }

                     var15 = new JH0(var1, var104);
                     break label642;
                  case 101:
                     byte var42 = super.Rj.get();
                     int var70;
                     short[][] var103 = new short[var70 = super.Rj.get() & 0xFF][];

                     for (int var9 = 0; var9 < var70; var9++) {
                        var103[var9] = new short[super.Rj.get() & 0xFF];

                        short[] var11;
                        for (int var10 = 0; var10 < (var11 = var103[var9]).length; var10++) {
                           var11[var10] = super.Rj.getShort();
                        }
                     }

                     var15 = new Ku0(var42, var103);
                     break label642;
                  case 102:
                     
                     super.Rj.get();
                     var41 = new RV();
                     break label555;
                  case 103:
                     var41 = new KK0(super.Rj.get());
                     break label555;
                  case 104:
                     var41 = new hi_0(super.Rj.get());
                     break label555;
                  case 105:
                     
                     super.Rj.getShort();
                     var41 = new Kg(super.Rj.getShort());
                     break label555;
                  case 106:
                     
                     byte var178 = super.Rj.get();
                     byte[] var10002 = new byte[super.Rj.get()];
                     super.Rj.get(var10002);
                     var41 = new vq_0(var178, var10002);
                     break label555;
                  case 107:
                     
                     short var177 = super.Rj.getShort();
                     super.Rj.get();
                     var41 = new gr_0(var177, super.Rj.getShort(), super.Rj.getShort(), super.Rj.getShort());
                     break label555;
                  case 108:
                     var41 = new Fp0(super.Rj.getShort());
                     break label555;
                  case 109:
                     var41 = new Wq0(
                        super.Rj.getShort(), super.Rj.get(), this.q60(), super.Rj.getShort(), super.Rj.get(), super.Rj.get(), super.Rj.get()
                     );
                     break label555;
                  case 110:
                     var41 = new QD(super.Rj.get());
                     break label555;
                  case 111:
                     var41 = new w40_0(super.Rj.get());
                     break label555;
                  case 112:
                     var41 = new kl0_1(super.Rj.get());
                     break label555;
                  case 113:
                     var41 = new GO(super.Rj.getShort());
                     break label555;
                  case 114:
                     var41 = new om0_0(super.Rj.get(), super.Rj.getShort());
                     break label555;
                  case 115:
                     var41 = new xd0_0(super.Rj.getShort());
                     break label555;
                  case 116:
                     var41 = new pl0_1(super.Rj.getShort());
                     break label555;
                  case 117:
                     var41 = new O40(this.pE(), this.q60());
                     break label555;
                  case 118:
                     var41 = new IW(this.pE(), super.Rj.getShort(), super.Rj.getShort());
                     break label555;
                  case 119:
                     var41 = new du_0(super.Rj.getShort());
                     break label555;
                  case 120:
                     var41 = new con__0(super.Rj.getShort());
                     break label555;
                  case 121:
                     var41 = new cf_1(super.Rj.getShort());
                     break label555;
                  case 122:
                     byte var40 = super.Rj.get();
                     HN var69;
                     
                     byte[] var10001 = new byte[var40];
                     super.Rj.get(var10001);
                     var69 = new HN(var10001);
                     var158 = var69;
                     break label556;
                  case 123:
                     var15 = new xl_0();
                     break label642;
                  case 124:
                     byte var39;
                     gc_2[] var68 = new gc_2[var39 = super.Rj.get()];

                     for (byte var8 = 0; var8 < var39; var8++) {
                        var68[var8] = (gc_2)gc_2.z80.BM(super.Rj.get());
                     }

                     var15 = new AZ(var68);
                     break label642;
                  case 125:
                     var15 = new COm2_();
                     break label642;
                  case 126:
                     var15 = new Iy0();
                     break label642;
                  case 127:
                     var15 = new pu_1();
                     break label642;
               }

               var158 = null;
               break label556;
            }

            var158 = var41;
         }

         var15 = var158;
      }

      if (var15 == null) {
         return null;
      }

      var15.pj0 = var2;
      if (var4 == var2) {
         var15.jA0 = var5;
         var15.pj0 = (byte)var4;
      }

      if (var6 == var2) {
         var15.fe0 = var7;
         byte var67 = 2;
         var15.pj0 |= var67;
      }

      return var15;
   }
}
