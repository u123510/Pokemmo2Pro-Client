package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import org.lwjgl.glfw.GLFW;

public class BaseInteractiveListComponent extends BaseComponent {
   public static final MD0 Com6 = MD0.cB("error");
   public static final MD0 Ih = MD0.cB("readonly");
   public static final MD0 vh0 = MD0.cB("hover");
   public static final MD0 yk = MD0.cB("cursorMoved");
   public static zk0_1 UP = null;
   public final rk_2 dI0;
   public final EY lK0;
   public NG D1;
   public boolean mK;
   public int FC;
   public int Lpt9;
   public int Z1;
   public int V50;
   public int uc;
   public boolean gu;
   public boolean oi0;
   public boolean tp;
   public int BP = 32767;
   public int jA0 = 5;
   public wl0_2 Mf0;
   public wl0_2 Jm0;
   public char Qe;
   public Object wa0;
   public gt_0[] em;
   public EP cl0;
   public boolean EW;
   public boolean hw0;
   public boolean xE0 = true;
   public final boolean IG = true;
   public nv_1 aY;
   public int O9 = 100;
   public tm_0 S5;
   public cn_0 o00;
   public xw_1 IF = xw_1.lv0;
   public boolean yc0 = true;
   public IntPredicate f90 = null;
   public boolean NR = false;

   public BaseInteractiveListComponent(KG0 var1) {
      this(var1, new wn0_0());
   }

   public BaseInteractiveListComponent() {
      this(null);
   }

   public BaseInteractiveListComponent(KG0 var1, wn0_0 var2) {
      super(var1, true);
      this.dI0 = var2;
      EY var3 = new EY((f.cg_0)(Object)this, this.Ed0());
      this.lK0 = var3;
      this.Qe = '*';
      var3.uf("renderer");
      var3.m00();
      this.SL(var3);
      this.Oq0(true);
      this.q20();
      Runnable var4 = this::i70;
      this.Na("cut", var4);
      Runnable var5 = this::FH0;
      this.Na("copy", var5);
      Runnable var6 = this::Gd;
      this.Na("paste", var6);
      Runnable var7 = this::tf0;
      this.Na("selectAll", var7);
      Runnable var8 = this::ln;
      this.Na("duplicateLineDown", var8);
   }

   public static void Vh0(X10 var0) {
      try {
         lg_0.lW.getClass();
      } catch (nf_1 var1) {
      }
   }

   public static boolean Jb(java.util.regex.Pattern var0, int var1) {
      return var0.matcher((char)var1 + "").matches();
   }

   public static void R9(StringBuilder var0, int var1) {
      var0.append((char)var1);
   }

   public final boolean Rm(String var1) {
      return this.f90 == null || IntStream.range(0, var1.length()).map(var1::charAt).allMatch(this.f90);
   }

   public static boolean Ot0(char var0) {
      if (var0 >= 4352 && var0 <= 4607) {
         return true;
      } else if (var0 >= 12592 && var0 <= 12687) {
         return true;
      } else if (var0 >= 'ꥠ' && var0 <= '\ua97f') {
         return true;
      } else {
         return var0 >= '가' && var0 <= '\ud7af' ? true : var0 >= 'ힰ' && var0 <= '\ud7ff';
      }
   }

   public final void MK0() {
      if (this.aY != null) {
         int var1 = super.SB0 + super.OB;
         zk0_1 var2 = super.Em0;
         int var3;
         if (super.Em0 != null && var1 + this.O9 > var2.VM() && (var3 = super.SB0 - this.O9) >= var2.SB0 + var2.y9) {
            var1 = var3;
         }

         this.aY.E40(super.A20, var1);
         var1 = super.Mx;
         this.aY.oY(var1, this.O9);
      }

      if (this.S5 != null) {
         this.yj0();
      }
   }

   public final void zC0() {
      nv_1 var1 = this.aY;
      if (this.aY == null || var1.K20 == null) {
         if (this.S5 == null) {
            (this.o00 = new cn_0(null, 0)).IM = true;
            (this.S5 = new tm_0(this)).uf("editfield-errorinfowindow");
            cn_0 var2 = this.o00;
            this.S5.F9(this.S5.fU(), var2);
         }

         this.o00.Sk(this.wa0.toString());
         this.S5.Ey();
         this.yj0();
      }
   }

   public final void yj0() {
      int var1 = super.A20;
      int var2 = super.Mx;
      tm_0 var3 = this.S5;
      le0_2 var4 = this.S5.K20;
      if (this.S5.K20 != null) {
         var2 = Math.max(var2, le0_2.du0(var3.R1(), this.S5.m0(), this.S5.Ya0));
         int var6 = var4.cz();
         if (var1 + var2 > var6) {
            var1 = var6 - Math.min(var2, var4.a3());
         }

         this.S5.oY(var2, this.S5.rm0());
         this.S5.E40(var1, super.SB0 + super.OB);
      }
   }

   @Override
   public final String Ck() {
      return "editfield";
   }

   public final void Ii(gt_0 var1) {
      this.em = (gt_0[])a7_0.gE(this.em, var1, gt_0.class);
   }

   public final void mS(int var1) {
      gt_0[] var4;
      if ((var4 = this.em) != null) {
         int var2 = var4.length;

         for (int var3 = 0; var3 < var2; var3++) {
            var4[var3].ks0(var1);
         }
      }
   }

   public final void Zg0(boolean var1) {
      boolean var2;
      if (this.D1 != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (var1 != var2) {
         BaseInteractiveListComponent var10000;
         xw_1 var10001;
         if (var1) {
            var10000 = this;
            rk_2 var3 = this.dI0;
            this.D1 = new NG(var3, this.Qe);
            var10001 = xw_1.If;
         } else {
            var10000 = this;
            this.D1 = null;
            var10001 = xw_1.lv0;
         }

         var10000.IF = var10001;
         this.lK0.B(this.Vt0());
         this.lK0.getClass();
         if (this.lK0.m0() > this.lK0.Mx) {
            var1 = true;
         } else {
            var1 = false;
         }

         this.EW = var1;
         this.te0(false);
      }
   }

   public void mm(String var1) {
      this.Gv(var1);
   }

   public final String Np() {
      return ((wn0_0)this.dI0).YA.toString();
   }

   public final boolean Td() {
      return this.Z1 != this.V50;
   }

   public final int yy() {
      return ((wn0_0)this.dI0).YA.length();
   }

   public final void RD(boolean var1) {
      if (this.mK != var1) {
         this.mK = var1;
         this.cl0 = null;
         super.M.j70(Ih, var1);
         String var2 = "readonly";
         this.ow(var2, var1 ^ true, var1);
      }
   }

   public void Nr0(String var1) {
      if (this.f90 != null) {
         StringBuilder var2 = new StringBuilder(var1.length());
         IntStream.range(0, var1.length()).map(var1::charAt).filter(this.f90).forEach(var1x -> R9(var2, var1x));
         if ((var1 = var2.toString()).isEmpty()) {
            return;
         }
      }

      if (!this.mK) {
         int var6 = 0;
         if (this.Td()) {
            this.rS();
            var6 = 1;
         }

         label37: {
            int var3;
            if ((var3 = Math.min(this.m20(var1), this.BP - this.m20(this.dI0))) > 0) {
               rk_2 var10 = this.dI0;
               int var4 = this.FC;
               String var8 = this.Q9(var3, var1);
               if ((var3 = ((wn0_0)var10).sb(var4, 0, var8)) > 0) {
                  this.FC += var3;
                  var6 = 0;

                  while (true) {
                     if (var6 >= var1.length()) {
                        break label37;
                     }

                     if (Ot0(var1.charAt(var6))) {
                        byte var5 = 0;
                        ((wn0_0)this.dI0).sb(var5, ((wn0_0)this.dI0).YA.length(), Normalizer.normalize(this.dI0, Form.NFKC));
                        if (this.FC >= ((wn0_0)this.dI0).YA.length()) {
                           this.FC = Math.max(0, ((wn0_0)this.dI0).YA.length());
                        }
                        break label37;
                     }

                     var6++;
                  }
               }
            }

            if (var6 == 0) {
               return;
            }
         }

         this.wU(0, true);
      }
   }

   public final void Gd() {
      if (!this.WS()) {
         String var1;
         if (lg_0.k.E00 == null) {
            var1 = "";
         } else {
            var1 = GLFW.glfwGetClipboardString(lg_0.S4.rt0.hc0);
         }

         if (var1 == null) {
            var1 = "";
         }

         if (var1.contains("\ufeff")) {
            var1 = var1.replace("\ufeff", "");
         }

         int var2;
         if (!this.gu && (var2 = var1.lastIndexOf(10)) >= 0) {
            StringBuilder var3;
            var3 = new StringBuilder(var1);

            do {
               if (var3.charAt(var2) == '\n') {
                  var3.deleteCharAt(var2);
               }
            } while ((var2 += -1) >= 0);

            var1 = var3.toString();
         }

         this.Nr0(var1);
      }
   }

   public boolean WS() {
      return false;
   }

   public final void FH0() {
      String var5;
      if (this.Td()) {
         rk_2 var1 = this.dI0;
         int var2 = this.Z1;
         int var3 = this.V50;
         var5 = ((wn0_0)var1).YA.substring(var2, var3);
      } else {
         var5 = ((wn0_0)this.dI0).YA.toString();
      }

      if (this.D1 != null) {
         char var4 = this.Qe;
         int var6;
         char[] var7 = new char[var6 = var5.length()];

         for (int var8 = 0; var8 < var6; var8++) {
            var7[var8] = var4;
         }

         var5 = new String(var7);
      }

      II0.ZN(var5);
   }

   public final void i70() {
      if (!this.Td()) {
         this.tf0();
      }

      rk_2 var1 = this.dI0;
      int var2 = this.Z1;
      int var3 = this.V50;
      String var5 = ((wn0_0)var1).YA.substring(var2, var3);
      if (!this.mK) {
         this.rS();
         this.wU(112, true);
      }

      if (this.D1 != null) {
         char var4 = this.Qe;
         int var6;
         char[] var7 = new char[var6 = var5.length()];

         for (int var8 = 0; var8 < var6; var8++) {
            var7[var8] = var4;
         }

         var5 = new String(var7);
      }

      II0.ZN(var5);
   }

   public final void ln() {
      if (this.gu && !this.mK) {
         int var1;
         int var2;
         if (this.Td()) {
            var1 = this.Z1;
            var2 = this.V50;
         } else {
            var2 = this.FC;
            var1 = var2;
         }

         int var3 = this.d40(var1);
         var1 = this.Td0(var2);
         String var4 = "\n".concat(((wn0_0)this.dI0).YA.substring(var3, var1));
         ((wn0_0)this.dI0).sb(var1, 0, var4);
         int var6 = this.FC;
         this.Wi(var4.length() + var6);
         this.wU(0, true);
      }
   }

   public final void ef0(int var1) {
      this.BP = var1;
   }

   @Override
   public final void C(zk0_1 var1) {
   }

   @Override
   public final void N00(zk0_1 var1) {
   }

   @Override
   public final void Ib(Jn0 var1) {
      super.Ib(var1);
      LC0 var3;
      LC0 var10002 = var3 = (LC0)var1;
      this.Mf0 = var3.uT("cursor");
      this.Jm0 = var3.uT("selection");
      this.O9 = var3.H10(100, "autocompletion-height");
      this.jA0 = var3.H10(5, "columns");
      char var4;
      this.Qe = var4 = (char)var10002.H10(42, "passwordChar");
      NG var2 = this.D1;
      if (this.D1 != null && var2.Nz != var4) {
         this.D1 = new NG(this.dI0, var4);
         this.lK0.B(this.Vt0());
         this.lK0.getClass();
         boolean var5;
         if (this.lK0.m0() > this.lK0.Mx) {
            var5 = true;
         } else {
            var5 = false;
         }

         this.EW = var5;
         this.te0(false);
      }
   }

   @Override
   public final void K8() {
      this.uM(this.lK0);
      boolean var1;
      if (this.lK0.m0() > this.lK0.Mx) {
         var1 = true;
      } else {
         var1 = false;
      }

      this.EW = var1;
      this.MK0();
   }

   @Override
   public final void N70() {
      this.MK0();
   }

   @Override
   public final int R1() {
      int var1 = super.R1();
      if (this.jA0 > 0) {
         Y30 var2 = this.lK0.x70;
         if (this.lK0.x70 != null) {
            int var4 = ((zb0_2)var2).computeTextWidth("X") * this.jA0;
            return Math.max(var1, super.e80 + super.NV + var4);
         }
      }

      byte var3 = 0;
      return Math.max(var1, super.e80 + super.NV + var3);
   }

   @Override
   public final int Se() {
      int var1 = super.Se();
      int var2 = this.Bn0();
      if (this.gu) {
         var2 *= this.uc;
      }

      return Math.max(var1, super.y9 + super.Cz + var2);
   }

   @Override
   public final int pi0() {
      if (this.jA0 > 0) {
         Y30 var1 = this.lK0.x70;
         if (this.lK0.x70 != null) {
            return ((zb0_2)var1).computeTextWidth("X") * this.jA0;
         }
      }

      return 0;
   }

   @Override
   public final int zs0() {
      int var1 = this.Bn0();
      if (this.gu) {
         var1 *= this.uc;
      }

      return var1;
   }

   @Override
   public final Object AR() {
      Object var1 = this.wa0;
      if (this.wa0 != null) {
         return var1;
      }

      var1 = super.yj0;
      if (super.yj0 == null && this.D1 == null && this.EW && !this.Of()) {
         var1 = ((wn0_0)this.dI0).YA.toString();
      }

      return var1;
   }

   public final void aO(hf0_0 var1) {
      if (var1 == null) {
         Object var4 = null;
         nv_1 var2 = this.aY;
         if (this.aY != null) {
            if (var2 != null) {
               zk0_1 var3 = var2.Em0;
               if (var2.Em0 != null) {
                  var3.ZC0(var2);
               }
            }

            this.aY = (nv_1)var4;
         }
      } else {
         nv_1 var6 = new nv_1((f.cg_0)(Object)this);
         var6.bN = var1;
         nv_1 var5 = this.aY;
         if (this.aY != var6) {
            if (var5 != null) {
               zk0_1 var7 = var5.Em0;
               if (var5.Em0 != null) {
                  var7.ZC0(var5);
               }
            }

            this.aY = var6;
         }
      }
   }

   @Override
   public final boolean nd0(i70_0 var1) {
      int var2;
      if ((var1.J30 & 9) != 0) {
         var2 = 1;
      } else {
         var2 = 0;
      }

      int var3 = var1.zu;
      if (E00.C10(var1.zu)) {
         boolean var24;
         label190: {
            if (var3 != 7) {
               var3 = var1.AN;
               if (this.yv0(var1.f8, var3)) {
                  var24 = true;
                  break label190;
               }
            }

            var24 = false;
         }

         super.M.j70(vh0, var24);
      }

      if (var1.VP) {
         if (var1.zu == 6 && (var1.J30 & 64) != 0) {
            int var13 = var1.AN;
            this.X(this.Ir(var1.f8, var13), true);
         }

         return true;
      } else {
         if (super.nd0(var1)) {
            return true;
         }

         nv_1 var25 = this.aY;
         if (this.aY != null && var25.nd0(var1)) {
            return true;
         }

         switch (J90.Qj(var1.zu)) {
            case 2:
               if (var1.nA0 == 0) {
                  var3 = var1.AN;
                  if (this.yv0(var1.f8, var3)) {
                     int var12 = var1.AN;
                     this.X(this.Ir(var1.f8, var12), var2 != 0);
                     this.Lpt9 = this.lK0.kk0;
                     return true;
                  }
               }
               break;
            case 3:
               if (var1.nA0 == 1) {
                  var2 = var1.AN;
                  if (this.yv0(var1.f8, var2)) {
                     if (this.cl0 == null) {
                        EP var10 = new EP();
                        if (!this.mK) {
                           F60 var17 = new F60(this, "cut");
                           var10.mA0("cut", var17);
                        }

                        F60 var18 = new F60(this, "copy");
                        var10.mA0("copy", var18);
                        if (!this.mK) {
                           F60 var19 = new F60(this, "paste");
                           var10.mA0("paste", var19);
                           ej0_1 var20 = new ej0_1((f.cg_0)(Object)this);
                           var10.mA0("clear", var20);
                        }

                        _abstract var21 = new _abstract();
                        var10.hx.add(var21);
                        F60 var22 = new F60(this, "selectAll");
                        var10.mA0("select all", var22);
                        this.cl0 = var10;
                     }

                     EP var11 = this.cl0;
                     if (this.cl0 != null) {
                        new TJ0(this).M10(0, var11, this, true);
                     }

                     return true;
                  }
               }
               break;
            case 4:
               var2 = var1.kA;
               if (var1.kA == 2) {
                  int var5 = var1.AN;
                  int var6 = this.Ir(var1.f8, var5);
                  this.Z1 = var6;
                  this.V50 = var6;

                  while (true) {
                     int var7 = this.Z1;
                     if (this.Z1 <= 0) {
                        break;
                     }

                     rk_2 var8 = this.dI0;
                     if (Character.isWhitespace(((wn0_0)var8).YA.charAt(var7 - 1))) {
                        break;
                     }

                     this.Z1--;
                  }

                  while (this.V50 < ((wn0_0)this.dI0).YA.length()) {
                     int var9 = this.V50;
                     if (Character.isWhitespace(((wn0_0)this.dI0).YA.charAt(var9))) {
                        break;
                     }

                     this.V50++;
                  }

                  this.FC = this.Z1;
                  this.te0(false);
                  this.FC = this.V50;
                  this.te0(false);
                  return true;
               }

               if (var2 == 3) {
                  this.tf0();
                  return true;
               }
            case 5:
            case 6:
            default:
               break;
            case 7:
               return false;
            case 8:
               if ((var3 = dp0.r9(var1.finally$)) != 3) {
                  if (var3 == 61) {
                     return false;
                  }

                  if (var3 != 123) {
                     if (var3 != 66) {
                        if (var3 != 67) {
                           if (var3 != 111) {
                              if (var3 != 112) {
                                 switch (var3) {
                                    case 19:
                                       if (this.gu) {
                                          this.X9(-1, var2 != 0);
                                          return true;
                                       }
                                       break;
                                    case 20:
                                       if (this.gu) {
                                          this.X9(1, var2 != 0);
                                          return true;
                                       }
                                       break;
                                    case 21:
                                       this.X(this.FC + -1, var2 != 0);
                                       return true;
                                    case 22:
                                       this.X(this.FC + 1, var2 != 0);
                                       return true;
                                    default:
                                       if (var1.iN()) {
                                          this.Ko(var1.TD);
                                          return true;
                                       }
                                 }

                                 if (this.hw0) {
                                    this.mS(var1.finally$);
                                    return true;
                                 }

                                 return false;
                              }

                              this.mf(true);
                              return true;
                           }

                           this.mS(var1.finally$);
                           return true;
                        }

                        this.mf(false);
                        return true;
                     }

                     if (!this.gu) {
                        label152:
                        if (this.yc0) {
                           lg_0.k.getClass();
                           hb0_2 var4 = hb0_2.BN;
                           if (hb0_2.BN != hb0_2.cw) {
                              lg_0.k.getClass();
                              if (var4 != hb0_2.XU) {
                                 break label152;
                              }
                           }

                           super.Em0.nA0(null);
                           super.Em0.nA0(super.K20);
                        }

                        this.mS(66);
                     }

                     return true;
                  }

                  this.X(this.Td0(this.FC), var2 != 0);
                  return true;
               }

               this.X(this.d40(this.FC), var2 != 0);
               return true;
            case 9:
               if ((var2 = dp0.r9(var1.finally$)) != 3 && var2 != 123 && var2 != 21 && var2 != 22 && var2 != 66 && var2 != 67 && var2 != 111 && var2 != 112) {
                  return var1.iN() || this.hw0;
               }

               return true;
         }

         return E00.C10(var1.zu);
      }
   }

   public final CharSequence Vt0() {
      NG var1 = this.D1;
      if (this.D1 != null) {
         return var1;
      }

      wn0_0 var10000 = (wn0_0)this.dI0;
      wn0_0 var2;
      String var4 = (var2 = (wn0_0)this.dI0).YA.toString();
      if (!var10000.L8.isEmpty()) {
         Iterator var3 = var2.L8.entrySet().iterator();

         while (var3.hasNext()) {
            Entry var5;
            var4 = var4.replace((CharSequence)(var5 = (Entry)var3.next()).getKey(), (CharSequence)var5.getValue());
         }
      }

      return var4;
   }

   public final rk_2 cg0() {
      return this.dI0;
   }

   public final void X9(int var1, boolean var2) {
      if (this.gu) {
         int var3 = this.FC;
         int var4 = 0;
         if (var3 != 0) {
            var4 = this.d40(var3);
         }

         EY var5 = this.lK0;
         zb0_2 var6 = (zb0_2)this.lK0.x70;
         if (this.lK0.x70 != null && var3 > var4) {
            CharSequence var14 = var5.j50;
            var3 = var6.computeTextWidth(var14, var4, var3);
         } else {
            var3 = 0;
         }

         if (var1 < 0) {
            if ((var1 = this.d40(this.FC)) == 0) {
               this.X(0, var2);
               return;
            }

            var1 = this.d40(var1 - 1);
         } else {
            var1 = Math.min(this.Td0(this.FC) + 1, ((wn0_0)this.dI0).YA.length());
         }

         var4 = this.Td0(var1);
         Y30 var15 = this.lK0.x70;
         if (this.lK0.x70 != null) {
            CharSequence var16 = this.Vt0();
            var1 = (var6 = (zb0_2)var15).computeVisibleGlpyhs(var16, var1, var4, var6.getSpaceWidth() / 2 + var3) + var1;
            var3 = var1 + 1;
            var1 = ((wn0_0)this.dI0).Lu0(var3, var1);
         }

         this.X(var1, var2);
      }
   }

   public final void X(int var1, boolean var2) {
      var1 = Math.max(0, Math.min(((wn0_0)this.dI0).YA.length(), var1));
      if (!var2) {
         this.Z1 = var1;
         this.V50 = var1;
      }

      int var3 = this.FC;
      if (this.FC != var1) {
         var1 = ((wn0_0)this.dI0).Lu0(var3, var1);
         var1 = ((wn0_0)this.dI0).Lu0(this.FC, var1);
         if (var2) {
            if (this.Td()) {
               if (this.FC == this.Z1) {
                  this.Z1 = var1;
               } else {
                  this.V50 = var1;
               }
            } else {
               this.Z1 = this.FC;
               this.V50 = var1;
            }

            int var4 = this.Z1;
            int var5 = this.V50;
            if (this.Z1 > this.V50) {
               this.Z1 = var5;
               this.V50 = var4;
            }
         }

         if (this.FC != var1) {
            super.M.Mk(yk);
         }

         this.FC = var1;
         this.te0(false);
         nv_1 var4;
         if ((var4 = this.aY) != null) {
            var4.Jh();
         }
      }
   }

   public final void Wi(int var1) {
      if (var1 >= 0 && var1 <= ((wn0_0)this.dI0).YA.length()) {
         this.X(var1, false);
      } else {
         throw new IllegalArgumentException("pos");
      }
   }

   public final void tf0() {
      this.Z1 = 0;
      this.V50 = ((wn0_0)this.dI0).YA.length();
   }

   public final void te0(boolean var1) {
      int var2;
      if ((var2 = this.lK0.Mx - 5) <= 0) {
         this.oi0 = true;
         this.tp = (boolean)var1;
      } else {
         this.oi0 = false;
         int var3 = this.FC;
         int var4 = 0;
         if (this.gu) {
            var4 = this.d40(var3);
         }

         EY var5 = this.lK0;
         Y30 var6 = this.lK0.x70;
         if (this.lK0.x70 != null && var3 > var4) {
            CharSequence var16 = var5.j50;
            var3 = ((zb0_2)var6).computeTextWidth(var16, var4, var3);
         } else {
            var3 = 0;
         }

         var4 = this.Lpt9;
         if (var3 < this.Lpt9 + 5) {
            this.Lpt9 = Math.max(0, var3 - 5);
         } else if (var1 || var3 - var4 > var2) {
            this.Lpt9 = Math.max(0, var3 - var2);
         }

         lo0_0 var8;
         if (this.gu && (var8 = lo0_0.public$(this)) != null) {
            int var7 = this.Bn0();
            var2 = this.FC;
            rk_2 var13 = this.dI0;
            var4 = 0;

            for (int var17 = 0; var17 < var2; var17++) {
               if (((wn0_0)var13).YA.charAt(var17) == '\n') {
                  var4++;
               }
            }

            int var18 = var4 * var7;
            var8.Iu();
            var2 = var7 / 2;
            var8.Yj0(var18, var7, var2);
         }
      }
   }

   public final void Yr0(IntPredicate var1) {
      this.f90 = var1;
   }

   public final void LPt8(String var1) {
      java.util.regex.Pattern var2 = java.util.regex.Pattern.compile(var1);
      this.f90 = var1x -> Jb(var2, var1x);
   }

   public void Ko(char var1) {
      if (!this.mK && (!Character.isISOControl((char)var1) || this.gu && var1 == 10)) {
         IntPredicate var2 = this.f90;
         if (this.f90 == null || var2.test(var1)) {
            boolean var10 = false;
            if (this.Td()) {
               this.rS();
               var10 = true;
            }

            if (this.m20(this.dI0) < this.BP) {
               rk_2 var11 = this.dI0;
               int var3;
               int var10000 = var3 = this.FC;
               byte var12 = 0;
               wn0_0 var4;
               int var5 = (var4 = (wn0_0)var11).YA.length();
               if (var10000 < 0 || var3 > var5) {
                  throw new StringIndexOutOfBoundsException(var3);
               }

               if (var5 - var3 < 0) {
                  throw new StringIndexOutOfBoundsException();
               }

               var4.YA.insert(var3, (char)var1);
               if (var4.YA.length() < 1) {
                  var4.L8.clear();
               }

               byte var14 = 1;
               Z6[] var15;
               if ((var15 = var4.v90) != null) {
                  int var6 = var15.length;

                  for (int var7 = 0; var7 < var6; var7++) {
                     var15[var7].AD0(var3, var12, var14);
                  }
               }

               this.FC++;
               if (Ot0((char)var1)) {
                  byte var8 = 0;
                  wn0_0 var13;
                  wn0_0 var17 = var13 = (wn0_0)this.dI0;
                  int var18 = var13.YA.length();
                  var17.sb(var8, var18, Normalizer.normalize(this.dI0, Form.NFKC));
                  if (this.FC >= ((wn0_0)this.dI0).YA.length()) {
                     this.FC = Math.max(0, ((wn0_0)this.dI0).YA.length());
                  }
               }
            } else if (!var10) {
               return;
            }

            this.wU(0, true);
         }
      }
   }

   public int m20(CharSequence var1) {
      return var1.length();
   }

   public final void mf(boolean var1) {
      if (!this.mK) {
         if (this.Td()) {
            this.rS();
            this.wU(112, true);
         } else {
            if (var1) {
               if (this.FC >= ((wn0_0)this.dI0).YA.length()) {
                  return;
               }

               rk_2 var4 = this.dI0;
               int var2 = this.FC;
               int var3 = ((wn0_0)var4).Lu0(var2, var2 + 1);
               int var12 = var3 - this.FC;
               if (((wn0_0)this.dI0).sb(var2, var12, "") < 0) {
                  return;
               }
            } else {
               int var2 = this.FC;
               if (var2 <= 0) {
                  return;
               }

               rk_2 var10 = this.dI0;
               int var3 = ((wn0_0)var10).Lu0(var2, var2 - 1);
               int var11 = this.FC - var3;
               this.FC = var3;
               if (((wn0_0)this.dI0).sb(var3, var11, "") < 0) {
                  return;
               }
            }

            this.wU(112, true);
         }
      }
   }

   public final void rS() {
      rk_2 var1 = this.dI0;
      int var2 = this.Z1;
      int var3 = this.V50 - var2;
      if (((wn0_0)var1).sb(var2, var3, "") >= 0) {
         this.X(this.Z1, false);
      }
   }

   public final int Bn0() {
      Y30 var1;
      return (var1 = this.lK0.x70) != null ? ((zb0_2)var1).getLineHeight() : 0;
   }

   public final int d40(int var1) {
      if (!this.gu) {
         return 0;
      }

      rk_2 var3 = this.dI0;

      while (var1 > 0) {
         int var2 = var1 - 1;
         if (((wn0_0)var3).YA.charAt(var2) == '\n') {
            break;
         }

         var1--;
      }

      return var1;
   }

   public final int Td0(int var1) {
      rk_2 var3;
      int var2 = ((wn0_0)(var3 = this.dI0)).YA.length();
      if (!this.gu) {
         return var2;
      }

      while (var1 < var2 && ((wn0_0)var3).YA.charAt(var1) != '\n') {
         var1++;
      }

      return var1;
   }

   public final int Ir(int var1, int var2) {
      EY var3 = this.lK0;
      Y30 var4 = this.lK0.x70;
      if (this.lK0.x70 == null) {
         return 0;
      }

      var1 = (int)((var1 - var3.zN) / zb0_2.lPt8);
      int var14 = 0;
      int var5 = ((wn0_0)this.dI0).YA.length();
      if (this.gu) {
         var2 -= this.lK0.hC();
         int var15 = ((zb0_2)var4).getLineHeight();

         while (true) {
            int var6 = this.Td0(var14);
            if (var14 >= var5 || var2 < var15) {
               var5 = var6;
               break;
            }

            var14 = Math.min(var6 + 1, var5);
            var2 -= var15;
         }
      }

      Y30 var12 = this.lK0.x70;
      if (this.lK0.x70 != null) {
         CharSequence var7 = this.Vt0();
         zb0_2 var13;
         int var8 = (var13 = (zb0_2)var12).computeVisibleGlpyhs(var7, var14, var5, var13.getSpaceWidth() / 2 + var1) + var14;
         var1 = var8 + 1;
         var14 = ((wn0_0)this.dI0).Lu0(var1, var8);
      }

      return var14;
   }

   @Override
   public final void Dw0(zk0_1 var1) {
      if (this.Mf0 != null && (this.Of() || super.sO)) {
         int var2 = this.lK0.zN;
         int var3 = this.FC;
         int var4 = 0;
         if (this.gu) {
            var4 = this.d40(var3);
         }

         EY var5 = this.lK0;
         Y30 var6 = this.lK0.x70;
         int var10000;
         if (this.lK0.x70 != null && var3 > var4) {
            CharSequence var16 = var5.j50;
            var10000 = ((zb0_2)var6).computeTextWidth(var16, var4, var3);
         } else {
            var10000 = 0;
         }

         var2 = var10000 + var2;
         EY var10002 = this.lK0;
         var3 = this.lK0.hC();
         var3 = ((zb0_2)var10002.x70).getBaseLine() / 2 + var3 - 1;
         var4 = this.FC;
         if (!this.gu) {
            var4 = 0;
         } else {
            int var17 = this.Bn0();
            rk_2 var19 = this.dI0;
            int var7 = 0;

            for (int var8 = 0; var8 < var4; var8++) {
               if (((wn0_0)var19).YA.charAt(var8) == '\n') {
                  var7++;
               }
            }

            var4 = var7 * var17;
         }

         var3 += var4;
         wl0_2 var21 = this.Mf0;
         KG0 var15 = super.M;
         int var18 = this.Mf0.Nx();
         int var20 = this.Bn0();
         var21.uf(var15, var2, var3, var18, var20);
      }

      super.Dw0(var1);
   }

   public final void Bl(xw_1 var1) {
      this.IF = var1;
   }

   @Override
   public final void hs() {
      label52: {
         lg_0.k.getClass();
         hb0_2 var1 = hb0_2.BN;
         if (hb0_2.BN != hb0_2.cw) {
            lg_0.k.getClass();
            if (var1 != hb0_2.XU) {
               break label52;
            }
         }

         if (super.OI && !this.mK) {
            if (super.Em0 != null) {
               PC0 var7;
               float var2 = (var7 = (PC0)super.Em0.ps).yG * var7.LH;
               float var3 = (float)super.Em0.OB / lg_0.S4.sD0();
               int var10000 = super.SB0 + super.OB + 1;
               var3 = super.Em0.OB - 0 * var3;
               float var4;
               int var13;
               if ((var4 = var10000) > var3) {
                  var13 = (int)(var4 - var3);
               } else {
                  var13 = 0;
               }

               var7.v40.y = var2 / 2.0F + var13;
               var7.R1(true);
            }

            X10 var8 = new X10();
            xw_1 var9 = this.IF;
            if (!this.NR) {
               ;
            }

            java.util.function.Predicate<String> ignoredValidator = this::Rm;
            nv_1 var10 = this.aY;
            if (this.aY != null) {
               gj_2 var11;
               String[] var14 = new String[(var11 = (gj_2)var10.bN.COM3("", 0, null)).iX.length];
               int var15 = 0;

               while (true) {
                  String[] var5 = var11.iX;
                  if (var15 >= var11.iX.length) {
                     break;
                  }

                  var14[var15] = var5[var15];
                  var15++;
               }
            }

            lg_0.k.lPT5(() -> Vh0(var8));
            UP = super.Em0;
         }
      }

      if (super.Em0 != null) {
         super.Em0.yz0.getClass();
      }

      if (this.wa0 != null) {
         this.zC0();
      } else {
         nv_1 var6;
         if ((var6 = this.aY) != null) {
            var6.Jh();
         }
      }
   }

   @Override
   public void Bt() {
      label34: {
         lg_0.k.getClass();
         hb0_2 var1 = hb0_2.BN;
         if (hb0_2.BN != hb0_2.cw) {
            lg_0.k.getClass();
            if (var1 != hb0_2.XU) {
               break label34;
            }
         }

         zk0_1 var4 = UP;
         if (UP != null) {
            PC0 var10000 = (PC0)var4.ps;
            PC0 var10001 = (PC0)var4.ps;
            ((PC0)var4.ps).LH = 1.0F;
            C8 var10 = var10001.v40;
            float var10004 = var4.Mx / 2.0F;
            float var5 = var4.OB / 2.0F;
            float var2 = 0.0F;
            var10001.v40.x = var10004;
            var10.y = var5;
            var10.z = var2;
            var10000.R1(true);
         }

         lg_0.lW.getClass();
      }

      zk0_1 var6 = super.Em0;
      if (super.Em0 != null) {
         var6.yz0.getClass();
      }

      tm_0 var7 = this.S5;
      if (this.S5 != null) {
         zk0_1 var9 = var7.Em0;
         if (var7.Em0 != null) {
            var9.ZC0(var7);
         }
      }

      nv_1 var3;
      if ((var3 = this.aY) != null) {
         var6 = var3.Em0;
         if (var3.Em0 != null) {
            var6.ZC0(var3);
         }
      }
   }

   public String Q9(int var1, String var2) {
      if (var2.length() > var1) {
         var2 = var2.substring(0, var1);
      }

      return var2;
   }

   public final void J0() {
      this.hw0 = true;
   }

   public final void T1() {
      this.xE0 = false;
   }

   public final void c2() {
      this.gu = true;
   }

   public final void Gv(String var1) {
      var1 = this.Q9(this.BP, var1);
      byte var2 = 0;
      ((wn0_0)this.dI0).sb(var2, ((wn0_0)this.dI0).YA.length(), var1);
      int var4;
      if (this.gu) {
         var4 = 0;
      } else {
         var4 = ((wn0_0)this.dI0).YA.length();
      }

      this.FC = var4;
      this.Z1 = 0;
      this.V50 = 0;
      this.wU(0, this.xE0);
      this.te0(true);
   }

   public final void bj(String var1) {
      KG0 var2 = super.M;
      MD0 var3 = Com6;
      boolean var4;
      if (var1 != null) {
         var4 = true;
      } else {
         var4 = false;
      }

      var2.j70(var3, var4);
      if (this.wa0 != var1) {
         this.wa0 = var1;
         this.yB0();
      }

      if (var1 != null) {
         if (this.Of()) {
            this.zC0();
         }
      } else {
         tm_0 var5;
         if ((var5 = this.S5) != null) {
            zk0_1 var6 = var5.Em0;
            if (var5.Em0 != null) {
               var6.ZC0(var5);
            }
         }
      }
   }

   public final void gW() {
      this.yc0 = false;
   }

   public final void I7() {
      this.NR = true;
   }

   public final void wU(int var1, boolean var2) {
      this.lK0.B(this.Vt0());
      this.lK0.getClass();
      this.EW = this.lK0.m0() > this.lK0.Mx;
      this.te0(false);
      if (this.gu) {
         int var3 = this.lK0.S00;
         if (this.uc != var3) {
            this.uc = var3;
            this.COm3();
         }
      }

      this.mS(var1);
      nv_1 var4;
      if (((var4 = this.aY) != null && var4.K20 != null || var2) && var4 != null) {
         var4.Jh();
      }
   }
}

