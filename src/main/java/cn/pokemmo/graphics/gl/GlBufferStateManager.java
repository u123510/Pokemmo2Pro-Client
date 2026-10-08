package cn.pokemmo.graphics.gl;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import f.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/**
 * 现代化重构类 - 原始类: f.fn_0
 */
public class GlBufferStateManager implements fy0_0 {

   public static fn_0 m2;
   public LPT6_[] Ja0;
   public LPT6_[] DI0;
   public LPT6_[] Y9;
   public LPT6_ ng0;
   public LPT6_ S7;
   public LPT6_ yC0;
   public LPT6_ g80;
   public LPT6_ ij;
   public LPT6_ Hi;
   public LPT6_[] ba;
   public LPT6_ W9;
   public LPT6_ JC;
   public LPT6_ Xo;
   public LPT6_ Dx0;
   public LPT6_ rM;
   public LPT6_ j70;
   public LPT6_ DK0;
   public LPT6_ dL;
   public LPT6_ GE;
   public LPT6_ bU;
   public LPT6_ uK0;
   public LPT6_ Eg0;
   public LPT6_ Wc0;
   public LPT6_ Com2;
   public LPT6_ qx;
   public LPT6_ Qv;
   public LPT6_ x8;
   public LPT6_ mK;
   public LPT6_ Uw0;
   public LPT6_ dm0;
   public LPT6_ Qr0;
   public LPT6_[] vo0;
   public LPT6_[] n50;
   public LPT6_[] Q90;
   public LPT6_[] D20;
   public LPT6_[] jp;
   public LPT6_[] Ap;
   public LPT6_ zH0;
   public LPT6_ eb0;
   public LPT6_ pL;
   public LPT6_ iz;
   public LPT6_ zZ;
   public LPT6_ tj0;
   public LPT6_ EB;
   public Texture[] jF;
   public LPT6_ ca;
   public LPT6_ aA;
   public LPT6_ t70;
   public LPT6_ yp0;
   public LPT6_ Px;
   public LPT6_ Ft0;
   public LPT6_ bJ0;
   public LPT6_ return$;
   public LPT6_ dw0;
   public LPT6_ v2;
   public LPT6_[] T5;
   public LPT6_[] Lm0;
   public LPT6_[] Wt0;
   public LPT6_[] zH;
   public B5 BI;
   public Texture YZ;
   public Texture o9;
   public Texture bz;
   public Texture lS;
   public LPT6_ kd;
   public D30 vb;
   public O50 q20;
   public String Zr0 = "";

   public final LPT6_ B20(String var1) {
      Object var2 = null;
      O50 var3 = this.q20;
      if (this.q20 != null) {
         Dn0 var5;
         if ((var5 = var3.E3.wp(var1 + ".png")).os0()) {
            Texture var9;
            var9 = new Texture(var5);
            var3.mO.add(var9);
            LPT6_ var6;
            var6 = new LPT6_(var9);
            LPT6_ var12 = var6;
            return var12 != null ? var12 : this.kd;
         }
      } else {
         D30 var11 = this.vb;
         if (this.vb == null) {
            return (LPT6_)(var2 != null ? var2 : this.kd);
         }

         int var10 = 0;

         for (int var4 = var11.kE.KB; var10 < var4; var10++) {
            if (((yo_2)var11.kE.get(var10)).oL.equals(var1)) {
               yo_2 var7 = (yo_2)var11.kE.get(var10);
               yo_2 var14 = var7;
               return var14 != null ? var14 : this.kd;
            }
         }
      }

      Object var8 = null;
      var2 = var8;
      return (LPT6_)(var2 != null ? var2 : this.kd);
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final Texture Q10(String... var1) {
      int var2 = var1.length;

      for (int var3 = 0; var3 < var2; var3++) {
         String var4 = xq_1.pz0("data/sprites/textures/", var1[var3], ".png");
         if (tw0_0.aB.r1(var4).lG0() != null) {
            try {
               lg_0.I70.getClass();
               return new Texture(new VE(var4, zv_1.tt0));
            } catch (Exception var6) {
               continue;
            }
         }
      }

      return this.bz;
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void qp0() {
      String[] var1;
      (var1 = new String[1])[0] = "error";
      Texture var18 = this.Q10(var1);
      this.lS = var18;
      LPT6_ var2;
      var2 = new LPT6_(var18);
      this.kd = var2;
       i4_0 var19 = new i4_0(1, 1, ix0_0.Vw);
       var19.bI(Color.BLACK);
       var19.XF.XS(0, 0, var19.Je0);
       this.YZ = new Texture(var19);
       var19.dispose();
       i4_0 var20 = new i4_0(1, 1, ix0_0.Vw);
       var20.bI(Color.BLACK.cpy().mul(1.0F, 1.0F, 1.0F, 0.1F));
       var20.XF.XS(0, 0, var20.Je0);
       this.o9 = new Texture(var20);
       var20.dispose();
       i4_0 var21 = new i4_0(1, 1, ix0_0.Vw);
       this.bz = new Texture(var21);
       var21.dispose();
      Dn0 var22;
      if ((var22 = dw_2.tG(dw_2.zs).h80) == null && !(var22 = tw0_0.aB.r1("data/sprites/atlas/main.atlas")).os0()) {
         String var23 = "../client/assets/main.atlas/";
         lg_0.I70.getClass();
         VE var34;
         var34 = new VE(var23, zv_1.tt0);
         var22 = var34;
      }

      if (!var22.RL()) {
         D30 var35;
         var35 = new D30(var22);
         this.vb = var35;
      } else {
         O50 var36;
         var36 = new O50(var22);
         this.q20 = var36;
      }

      this.G40(dw_2.con);
      this.Q90 = new LPT6_[7];
      this.D20 = new LPT6_[7];
       for (int index = 0; index < this.Q90.length; index++) {
          this.Q90[index] = this.is(index, "status_ailment");
          this.D20[index] = this.is(index, "status_ailment_large");
       }
       this.S7 = this.B20("icon_cross");
       this.Hi = this.B20("icon_colorswatch");
       this.g80 = this.B20("icon_gear");
       this.ng0 = this.B20("icon_textedit");
       this.yC0 = this.B20("icon_check");
       this.ba = new LPT6_[]{this.B20("icon_lock_unlocked"), this.B20("icon_lock_locked")};
       this.ij = this.B20("icon_sound");
       this.W9 = this.B20("arrow_down");
       this.JC = this.B20("arrow_up");
       this.Xo = this.B20("arrow_white_up");
       this.Dx0 = this.B20("arrow_white_down");
       this.rM = this.B20("arrow_left");
       this.j70 = this.B20("arrow_right");
       this.DK0 = this.B20("arrow_keypress");
       this.GE = this.B20("disconnected");
       this.dL = this.B20("black-bg");
       this.x8 = this.B20("clock-sun");
       this.Uw0 = this.B20("clock-moon");
       this.mK = this.B20("clock-morning");
       this.pL = this.B20("shiny");
       this.tj0 = this.B20("shiny-small");
       this.iz = this.B20("secret_shiny");
       this.EB = this.B20("secret_shiny-small");
       this.zZ = this.B20("secret_shiny_particle");
       this.zH0 = this.B20("particle");
       this.eb0 = this.B20("particle_small");
       if (tw0_0.Xy0()) {
          this.bU = this.B20("star-light-2x");
          this.uK0 = this.B20("star-bold-2x");
       } else {
          this.bU = this.B20("star-light");
          this.uK0 = this.B20("star-bold");
       }
       if (tw0_0.kz0()) {
          this.Eg0 = this.B20("icon_trash-2x");
          this.Com2 = this.B20("pc_multiselect-default-2x");
          this.qx = this.B20("pc_multiselect-enabled-2x");
          this.dm0 = this.B20("tooltip_mobile");
          this.Qr0 = this.B20("cancel_mobile");
       } else {
          this.Eg0 = this.B20("icon_trash");
          this.Com2 = this.B20("pc_multiselect-default");
          this.qx = this.B20("pc_multiselect-enabled");
          this.dm0 = this.B20("tooltip");
          this.Qr0 = this.B20("cancel");
       }
       this.Qv = this.B20("edit_box_name");
       this.Wc0 = this.B20("icon_trash-black");
       this.jp = new LPT6_[G50.aG.length];
       for (int index = 0; index < this.jp.length; index++) {
          this.jp[index] = this.B20("flag_" + G50.aG[index].PM);
       }
       this.vo0 = new LPT6_[]{this.B20("icon_gender_male"), this.B20("icon_gender_female")};
       this.n50 = new LPT6_[]{this.B20("icon_gender_large_male"), this.B20("icon_gender_large_female")};
       this.aA = this.B20("BPSprite");
       this.ca = this.B20("ClockSprite");
       this.t70 = this.B20("CoinSprite");
       this.Ft0 = this.B20("alphaLight");
       this.Px = this.B20("HiddenAbility");
       this.yp0 = this.B20("HiddenAbilitySmall");
       this.zH = new LPT6_[((qm0_0[]) qm0_0.pA.clone()).length];
       for (int index = 0; index < this.zH.length; index++) {
          this.zH[index] = this.is(index, "addon_flags");
       }
       this.Ap = new LPT6_[QL.j90.length];
       for (int index = 0; index < this.Ap.length; index++) {
          this.Ap[index] = this.is(QL.j90[index].D7, "particle_id");
       }
       this.bJ0 = this.B20("icon_dice");
       this.return$ = this.B20("icon_dice24");
       this.dw0 = this.B20("pencil_memo");
       this.v2 = this.B20("icon_rotate");
       this.T5 = new LPT6_[5];
       this.Lm0 = new LPT6_[5];
       this.Wt0 = new LPT6_[5];
       for (int index = 0; index < this.T5.length; index++) {
          this.T5[index] = this.is(index, "mark");
          this.Lm0[index] = this.is(index, "mark_alt");
          this.Wt0[index] = this.is(index, "mark_alt_dark");
       }

       try {
          lg_0.I70.getClass();
          byte[] pak = FI.MH(new VE("data/sprites/game.pak", zv_1.tt0).kI0());
          ByteBuffer data = ByteBuffer.wrap(pak).order(ByteOrder.LITTLE_ENDIAN);
          data.position(8);
          int textureCount = data.get();
          this.jF = new Texture[textureCount];
          for (int index = 0; index < textureCount; index++) {
             int length = data.getInt();
             i4_0 image = new i4_0(pak, data.position(), length);
             this.jF[index] = new Texture(image);
             image.dispose();
             data.position(data.position() + length);
          }
       } catch (Exception exception) {
          exception.printStackTrace();
       }
       this.BI = new B5(this.jF[2]);
   }

   public final void G40(String var1) {
      String var2 = this.Zr0;
      if (this.Zr0 == null || !var2.equals(var1)) {
         this.Zr0 = var1;
         StringBuilder var7;
         var7 = new StringBuilder();

         for (int var3 = 0; var3 < var1.length(); var3++) {
            char var4;
            if (Character.isLetter(var4 = var1.charAt(var3))) {
               var7.append(var4);
            }
         }

         var1 = var7.toString();
         byte var8 = 18;
         LPT6_[] var11 = new LPT6_[18];

         for (int var14 = 0; var14 < var8; var14++) {
            LPT6_ var5;
            LPT6_ var10000 = var5 = this.B20("monster_type_" + var14 + "_" + var1);
            var11[var14] = var5;
            if (var10000 == this.kd) {
               var11[var14] = this.B20("monster_type_" + var14 + "_en");
            }
         }

         this.Ja0 = var11;
         byte var9 = 18;
         var11 = new LPT6_[18];

         for (int var15 = 0; var15 < var9; var15++) {
            LPT6_ var17;
            LPT6_ var19 = var17 = this.B20("skill_type_" + var15 + "_" + var1);
            var11[var15] = var17;
            if (var19 == this.kd) {
               var11[var15] = this.B20("skill_type_" + var15 + "_en");
            }
         }

         this.DI0 = var11;
         byte var10 = 3;
         var11 = new LPT6_[3];

         for (int var16 = 0; var16 < var10; var16++) {
            LPT6_ var18;
            LPT6_ var20 = var18 = this.B20("skill_damage_" + var16 + "_" + var1);
            var11[var16] = var18;
            if (var20 == this.kd) {
               var11[var16] = this.B20("skill_damage_" + var16 + "_en");
            }
         }

         this.Y9 = var11;
      }
   }

   public final LPT6_ ML0(i40_0 var1) {
      return this.jJ0(var1.j40);
   }

   public final LPT6_ jJ0(int var1) {
      LPT6_[] var2;
      if (var1 >= (var2 = this.Ja0).length) {
         var1 = i40_0.g50.j40;
      }

      return var2[var1];
   }

   public final LPT6_ It(int var1) {
      LPT6_[] var2;
      if (var1 >= (var2 = this.DI0).length) {
         var1 = i40_0.g50.j40;
      }

      return var2[var1];
   }

   public final LPT6_ m7() {
      return this.ng0;
   }

   public final LPT6_ Zp() {
      return this.yC0;
   }

   public final LPT6_ bc0() {
      return this.x8;
   }

   public final LPT6_ Lp() {
      return this.Uw0;
   }

   public final LPT6_ sy() {
      return this.rM;
   }

   public final LPT6_ a7() {
      return this.j70;
   }

   public final LPT6_ wm() {
      return this.Hi;
   }

   public final LPT6_[] LK0() {
      return this.ba;
   }

   public final LPT6_ ln0(byte var1) {
      return this.jp[var1];
   }

   public final LPT6_ Cn(byte var1) {
      return this.vo0[var1];
   }

   public final LPT6_ IE(byte var1) {
      return this.n50[var1];
   }

   public final LPT6_ DI0() {
      return this.Xo;
   }

   public final LPT6_ Zb() {
      return this.Dx0;
   }

   public final LPT6_ p20(boolean var1) {
      return var1 ? this.iz : this.pL;
   }

   public final LPT6_ X40() {
      return this.ca;
   }

   public final LPT6_ wh() {
      return this.aA;
   }

   public final LPT6_ DQ() {
      return this.t70;
   }

   public final LPT6_ Ku(int var1, boolean var2) {
      if (var1 < 0 || var1 >= this.Ap.length) {
         var1 = 0;
      }

      return var1 == 0 && var2 ? this.zZ : this.Ap[var1];
   }

   public final LPT6_ kn() {
      return this.bU;
   }

   public final LPT6_ l80() {
      return this.uK0;
   }

   public final LPT6_ SB() {
      return this.Ft0;
   }

   public final LPT6_ Ki0() {
      return this.yp0;
   }

   public final LPT6_ BX() {
      return this.Px;
   }

   public final LPT6_ Ck0() {
      return this.bJ0;
   }

   public final LPT6_ ll0() {
      return this.v2;
   }

   public final LPT6_ Ny0(int var1, boolean var2, boolean var3) {
      if (var1 < 0 || var1 >= this.T5.length) {
         var1 = 0;
      }

      if (var2) {
         return !var3 && var1 != 4 ? this.Wt0[var1] : this.Lm0[var1];
      } else {
         return this.T5[var1];
      }
   }

   @Override
   public final void dispose() {
      D30 var1 = this.vb;
      if (this.vb != null) {
         var1.dispose();
      }

      O50 var2 = this.q20;
      if (this.q20 != null) {
         var2.dispose();
      }

      this.YZ.dispose();
      this.o9.dispose();
      this.bz.dispose();
      this.lS.dispose();
   }

   public final LPT6_ is(int var1, String var2) {
      LPT6_ var3 = null;
      O50 var4 = this.q20;
      if (this.q20 != null) {
         Dn0 var7;
         if ((var7 = var4.E3.wp(var2 + "_" + var1 + ".png")).os0()) {
            Texture var10;
            var10 = new Texture(var7);
            var4.mO.add(var10);
            LPT6_ var8;
            var8 = new LPT6_(var10);
            var3 = var8;
            return var3 != null ? var3 : this.kd;
         }
      } else {
         D30 var12 = this.vb;
         if (this.vb == null) {
            return var3 != null ? var3 : this.kd;
         }

         int var11 = 0;

         for (int var5 = var12.kE.KB; var11 < var5; var11++) {
            yo_2 var6;
            if ((var6 = (yo_2)var12.kE.get(var11)).oL.equals(var2) && var6.lw == var1) {
               var3 = var6;
               return var3 != null ? var3 : this.kd;
            }
         }
      }

      Object var9 = null;
      var3 = (LPT6_)var9;
      return var3 != null ? var3 : this.kd;
   }

   public static fn_0 qz0() {
      if (m2 == null) {
         m2 = new fn_0();
      }

      return m2;
   }

   public static Texture[] qF() {
       ArrayList<Texture> var0 = new ArrayList<>();

      for (int var1 = 0; var1 < 100; var1++) {
         StringBuilder var10000 = new StringBuilder("data/sprites/textures/bg_");
         Object[] var2;
         (var2 = new Object[1])[0] = var1;
         Dn0 var4;
         if ((var4 = tw0_0.aB.r1(var10000.append(String.format("%02d", var2)).append(".png").toString()).lG0()) == null) {
            break;
         }

         Texture var3;
         var3 = new Texture(var4);
         var0.add(var3);
      }

       return var0.toArray(new Texture[0]);
   }

   public static int Xa(byte var0) {
      if (var0 != -128) {
         if (var0 != 16) {
            if (var0 != 32) {
               if (var0 != 64) {
                  if (var0 != 7) {
                     return var0 != 8 ? 5 : 3;
                  } else {
                     return 4;
                  }
               } else {
                  return 1;
               }
            } else {
               return 0;
            }
         } else {
            return 2;
         }
      } else {
         return 6;
      }
   }
}
