package cn.pokemmo.battle.animation.special;

import f.*;

import java.util.Arrays;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleJ40Animation
 * 原始类: f.J40
 */
public class BattleJ40Animation extends MU {
   public static final C8 jo = new C8();
   public final a10_0 Xf0;
   public final PF bV;
   public final boolean s9;
   public boolean j7 = true;
   public final con__6 nG;
   public lc_0 wC;
   public final C8[] n;

   public BattleJ40Animation(a10_0 var1, PF var2, boolean var3, con__6 var4) {
      super(var2);
      this.Xf0 = var1;
      this.bV = var2;
      this.s9 = var3;
      this.nG = var4;
      C8[] var5;
      C8[] var10001 = var5 = new C8[5];
      C8 var6;
      var6 = new C8(0.5F, 2.0F, 6.0F);
      var10001[0] = var6;
      C8 var7;
      var7 = new C8(0.5F, 2.0F, 6.0F);
      var10001[1] = var7;
      C8 var8;
      var8 = new C8(1.5F, 4.5F, 4.0F);
      var10001[2] = var8;
      C8 var9;
      var9 = new C8(3.0F, 3.5F, 4.0F);
      var10001[3] = var9;
      C8 var10;
      var10 = new C8(3.0F, 3.5F, 3.5F);
      var10001[4] = var10;
      this.n = var5;
   }

   public static void Uv(C8 var0, int var1, D2 var2) {
      C8 var10000 = co_1.Kl0;
      C8 var10001 = co_1.Kl0;
      C8 var5;
      C8 var10002 = var5 = co_1.Kl0;
      var5.getClass();
      float var6 = var0.x;
      float var9 = var0.y;
      float var3 = var0.z;
      var10002.x = var6;
      var10001.y = var9;
      var10000.z = var3;
      var10000 = co_1.cOm6;
      var10001 = co_1.cOm6;
      C8 var7;
      var10002 = var7 = co_1.cOm6;
      var7.getClass();
      float var4 = var0.x;
      float var8 = var0.y;
      float var10 = var0.z;
      var10002.x = var4;
      var10001.y = var8;
      var10000.z = var10;
   }

   public static C8 ob(com3__3 var0) {
      return T3.hf(var0.j, var0.j);
   }

   public static void ro(C8 var0, int var1, D2 var2) {
      C8 var10000 = co_1.Kl0;
      C8 var10001 = co_1.Kl0;
      C8 var5;
      C8 var10002 = var5 = co_1.Kl0;
      var5.getClass();
      float var6 = var0.x;
      float var9 = var0.y;
      float var3 = var0.z;
      var10002.x = var6;
      var10001.y = var9;
      var10000.z = var3;
      var10000 = co_1.cOm6;
      var10001 = co_1.cOm6;
      C8 var7;
      var10002 = var7 = co_1.cOm6;
      var7.getClass();
      float var4 = var0.x;
      float var8 = var0.y;
      float var10 = var0.z;
      var10002.x = var4;
      var10001.y = var8;
      var10000.z = var10;
   }

   public static C8 E0(com3__3 var0) {
      return T3.hf(var0.j, var0.j);
   }

   public static void m90(C8 var0, int var1, D2 var2) {
      C8 var10000 = co_1.Kl0;
      C8 var10001 = co_1.Kl0;
      C8 var5;
      C8 var10002 = var5 = co_1.Kl0;
      var5.getClass();
      float var6 = var0.x;
      float var9 = var0.y;
      float var3 = var0.z;
      var10002.x = var6;
      var10001.y = var9;
      var10000.z = var3;
      var10000 = co_1.cOm6;
      var10001 = co_1.cOm6;
      C8 var7;
      var10002 = var7 = co_1.cOm6;
      var7.getClass();
      float var4 = var0.x;
      float var8 = var0.y;
      float var10 = var0.z;
      var10002.x = var4;
      var10001.y = var8;
      var10000.z = var10;
   }

   public static C8 n20(com3__3 var0) {
      return T3.hf(var0.j, var0.j);
   }

   @Override
   public final MU us() {
      this.zh0().Ms(super.Vs.wP);
      this.Vc();
      return this;
   }

   public final pw_1 zh0() {
      if (this.nG == con__6.pn0) {
         return this.MH0();
      }

      short var10000 = this.bV.p10();
      short var1 = this.bV.coM9();
      switch (var10000) {
         case 12:
         case 15:
         case 17:
         case 22:
         case 41:
         case 42:
         case 49:
         case 63:
         case 70:
         case 71:
         case 72:
         case 73:
         case 81:
         case 82:
         case 90:
         case 91:
         case 92:
         case 93:
         case 109:
         case 110:
         case 116:
         case 117:
         case 118:
         case 119:
         case 120:
         case 121:
         case 129:
         case 130:
         case 137:
         case 138:
         case 139:
         case 140:
         case 142:
         case 145:
         case 146:
         case 151:
         case 166:
         case 169:
         case 170:
         case 171:
         case 174:
         case 187:
         case 188:
         case 189:
         case 193:
         case 200:
         case 201:
         case 211:
         case 223:
         case 226:
         case 230:
         case 233:
         case 249:
         case 250:
         case 251:
         case 267:
         case 269:
         case 270:
         case 278:
         case 279:
         case 284:
         case 291:
         case 292:
         case 307:
         case 313:
         case 314:
         case 318:
         case 319:
         case 320:
         case 321:
         case 330:
         case 333:
         case 337:
         case 338:
         case 339:
         case 340:
         case 344:
         case 347:
         case 349:
         case 351:
         case 353:
         case 355:
         case 358:
         case 362:
         case 367:
         case 368:
         case 369:
         case 370:
         case 374:
         case 375:
         case 380:
         case 381:
         case 382:
         case 384:
         case 385:
         case 412:
         case 413:
         case 414:
         case 415:
         case 416:
         case 425:
         case 426:
         case 429:
         case 433:
         case 436:
         case 437:
         case 455:
         case 456:
         case 457:
         case 458:
         case 462:
         case 468:
         case 469:
         case 472:
         case 474:
         case 476:
         case 477:
         case 478:
         case 479:
         case 480:
         case 481:
         case 482:
         case 488:
         case 489:
         case 491:
         case 517:
         case 518:
         case 527:
         case 528:
         case 550:
         case 561:
         case 562:
         case 563:
         case 564:
         case 567:
         case 577:
         case 578:
         case 579:
         case 582:
         case 583:
         case 584:
         case 587:
         case 589:
         case 592:
         case 593:
         case 594:
         case 598:
         case 599:
         case 601:
         case 602:
         case 605:
         case 606:
         case 608:
         case 609:
         case 615:
         case 618:
         case 628:
         case 635:
         case 637:
         case 641:
         case 642:
         case 645:
            return this.fv();
         case 487:
            if (var1 == 1) {
               return this.fv();
            }
            break;
         case 648:
            if (var1 == 0) {
               return this.fv();
            }
      }

      var10000 = var1 = this.bV.p10();
      this.bV.coM9();
      return var10000 != 50 && var1 != 51 ? this.Px() : this.coM9();
   }

   @Override
   public final boolean Bv0(boolean var1) {
      return false;
   }

   public final pw_1 Px() {
      ie_0 var10000 = tw0_0.Ll0.Qz0.vE0;
      this.bV.ZI(this.bV.COm2(), true);
      com3__3[] var1 = this.bV.Br0;
      C8[] var2 = Arrays.stream(this.bV.Br0).map(BattleJ40Animation::n20).toArray(C8[]::new);
      C8 var3 = T3.hf(this.bV.LpT9.j, this.bV.LpT9.j);
      lc_0 var4 = lc_0.ju0(var10000.LP(4, this.bV.rp0()));
      this.wC = var4;
      super.Vs.A6.add(var4);
      C8 var22;
      var22 = new C8();
      if (this.s9) {
         float var9 = var3.x - 0.5F;
         float var5 = var3.y - 0.5F;
         float var6 = var3.z;
         this.wC.aa(var9, var5, var6);
      } else {
         float var10 = var3.x;
         float var27 = var3.y + 0.5F;
         float var36 = var3.z;
         this.wC.aa(var10, var27, var36);
      }

      (super.E8 = pw_1.xC()).Xf0();

      for (com3__3 var37 : var1) {
         super.E8
            .y80(ao_1.yp(7, var37).UD(0.0F, 0.0F))
            .y80(ao_1.yp(8, var37).Om0(1.0F, 1.0F, 1.0F, 1.0F))
            .y80(ao_1.yp(10, var37).Om0(1.0F, 1.0F, 1.0F, 1.0F))
            .y80(MU.eK0((short)1382, this.s9));
      }

      super.E8.mz0();
      if (this.s9) {
         this.n[2].na(this.bV.Sz(tw0_0.PK0), 0.0F, 0.0F);
         this.n[3].na(this.bV.Sz(tw0_0.PK0), 0.0F, 0.0F);
         this.n[4].na(this.bV.Sz(tw0_0.PK0), 0.0F, 0.0F);
         tl_0 var12;
         var12 = new tl_0(this.n, false);
         pw_1 var29 = super.E8.TD0();

         for (float var38 = 0.0F; var38 < 1.0F; var38 += 0.01F) {
            C8 var7 = jo;
            var12.HB0(jo, var38);
            ao_1 var58 = ao_1.DX(this.wC, 4, 0.01F);
            float var38x = var7.x;
            float var42 = var7.y;
            float var8 = var7.z;
            var29.y80(var58.kt(var38x, var42, var8));
         }

         var29.mz0();
         var29.y80(ao_1.pc((varA, varB) -> this.interface$(var22, varA, varB)));
         C8[] var45 = this.n;
         C8[] var52 = this.n;
         C8 var59 = this.n[2];
         C8 var62 = this.n[2];
         C8 var10004 = this.n[2];
         float var13 = 4.5F;
         float var30 = 4.0F;
         var10004.x = 1.5F;
         var62.y = var13;
         var59.z = var30;
         C8 var53 = var52[3];
         float var14 = 3.5F;
         float var31 = 4.0F;
         var53.x = 3.0F;
         var53.y = var14;
         var53.z = var31;
         C8 var46 = var45[4];
         float var15 = 3.5F;
         float var32 = 3.5F;
         var46.x = 3.0F;
         var46.y = var15;
         var46.z = var32;
      } else {
         super.E8.p1(0.5F);
         var22.np(this.wC.ei0);
      }

      super.E8.Xf0();
      pw_1 var47 = super.E8.TD0();
      ao_1 var54 = ao_1.DX(this.wC, 9, 0.2F);
      float var16 = 0.0F;
      var54.h5[0] = var16;
      var47.y80(var54).y80(ao_1.DX(this.wC, 4, 0.01F).kt(0.0F, 0.0F, 0.0F));
      super.E8.Xf0();

      for (int var17 = 0; var17 < var1.length; var17++) {
         pw_1 var48 = super.E8;
         var54 = ao_1.DX(var1[var17], 4, 0.01F);
         C8 var60 = var2[var17];
         float var33 = var2[var17].x;
         float var40 = var2[var17].y + 0.55F;
         float var43 = var60.z;
         var48.y80(var54.kt(var33, var40, var43));
      }

      super.E8.mz0();
      pw_1 var18 = super.E8.y80(MU.kO((short)1383)).y80(ao_1.pc(this::Qj0)).y80(ao_1.pc((varA, varB) -> BattleJ40Animation.m90(var22, varA, varB)));
      String var23;
      if (this.bV.rp0() == 15) {
         var23 = "spawn_cherish";
      } else {
         var23 = "spawn";
      }

      var18.y80(this.vy(var23));
      ao_1 var19;
      if ((var19 = this.Mx(this.bV.rp0())) != null) {
         super.E8.y80(var19);
      }

      super.E8.p1(0.4F);
      super.E8.Xf0();
      int var20 = var1.length;

      for (int var24 = 0; var24 < var20; var24++) {
         super.E8.y80(ao_1.DX(var1[var24], 7, 1.0F).UD(1.1F, 1.1F));
      }

      super.E8.mz0();
      super.E8.TD0();
      super.E8.Xf0();

      for (int var21 = 0; var21 < var1.length; var21++) {
         ao_1 var25;
         if (this.Xf0.nf.po0(this.bV.Kj0)) {
            ao_1 var49 = var25 = ao_1.DX(var1[var21], 11, 0.25F);
            float var34 = 0.0F;
            var49.h5[0] = var34;
         } else {
            var25 = ao_1.DX(var1[var21], 10, 0.25F).Om0(0.0F, 0.0F, 0.0F, 0.6F);
         }

         pw_1 var50 = super.E8.y80(ao_1.DX(var1[var21], 7, 0.4F).UD(1.0F, 1.0F)).y80(var25);
         var54 = ao_1.DX(var1[var21], 4, 0.5F);
         C8 var61 = var2[var21];
         float var26 = var2[var21].x;
         float var35 = var2[var21].y;
         float var41 = var61.z;
         var50.y80(var54.kt(var26, var35, var41));
      }

      super.E8.mz0();
      super.E8.y80(MU.eK0(this.bV.HF(), this.bV.COm2()));
      super.E8.mz0();
      super.E8.mz0();
      super.E8.mz0();
      return super.E8;
   }

   public final pw_1 fv() {
      ie_0 var10000 = tw0_0.Ll0.Qz0.vE0;
      this.bV.ZI(this.bV.COm2(), true);
      com3__3[] var1 = this.bV.Br0;
      C8[] var2 = Arrays.stream(this.bV.Br0).map(BattleJ40Animation::E0).toArray(C8[]::new);
      C8 var3 = T3.hf(this.bV.LpT9.j, this.bV.LpT9.j);
      lc_0 var4 = lc_0.ju0(var10000.LP(4, this.bV.rp0()));
      this.wC = var4;
      super.Vs.A6.add(var4);
      C8 var23;
      var23 = new C8();
      if (this.s9) {
         float var9 = var3.x - 0.5F;
         float var5 = var3.y - 0.5F;
         float var6 = var3.z;
         this.wC.aa(var9, var5, var6);
      } else {
         float var10 = var3.x;
         float var28 = var3.y + 0.5F;
         float var38 = var3.z;
         this.wC.aa(var10, var28, var38);
      }

      (super.E8 = pw_1.xC()).Xf0();

      for (com3__3 var39 : var1) {
         super.E8
            .y80(ao_1.yp(7, var39).UD(0.0F, 0.0F))
            .y80(ao_1.yp(8, var39).Om0(1.0F, 1.0F, 1.0F, 1.0F))
            .y80(ao_1.yp(10, var39).Om0(1.0F, 1.0F, 1.0F, 1.0F))
            .y80(MU.eK0((short)1382, this.s9));
      }

      super.E8.mz0();
      if (this.s9) {
         this.n[2].na(this.bV.Sz(tw0_0.PK0), 0.0F, 0.0F);
         this.n[3].na(this.bV.Sz(tw0_0.PK0), 0.0F, 0.0F);
         this.n[4].na(this.bV.Sz(tw0_0.PK0), 0.0F, 0.0F);
         tl_0 var12;
         var12 = new tl_0(this.n, false);
         pw_1 var30 = super.E8.TD0();

         for (float var40 = 0.0F; var40 < 1.0F; var40 += 0.01F) {
            C8 var7 = jo;
            var12.HB0(jo, var40);
            ao_1 var63 = ao_1.DX(this.wC, 4, 0.01F);
            float var40x = var7.x;
            float var45 = var7.y;
            float var8 = var7.z;
            var30.y80(var63.kt(var40x, var45, var8));
         }

         var30.mz0();
         var30.y80(ao_1.pc((varA, varB) -> this.vI0(var23, varA, varB)));
         C8[] var48 = this.n;
         C8[] var56 = this.n;
         C8 var64 = this.n[2];
         C8 var68 = this.n[2];
         C8 var10004 = this.n[2];
         float var13 = 4.5F;
         float var31 = 4.0F;
         var10004.x = 1.5F;
         var68.y = var13;
         var64.z = var31;
         C8 var57 = var56[3];
         float var14 = 3.5F;
         float var32 = 4.0F;
         var57.x = 3.0F;
         var57.y = var14;
         var57.z = var32;
         C8 var49 = var48[4];
         float var15 = 3.5F;
         float var33 = 3.5F;
         var49.x = 3.0F;
         var49.y = var15;
         var49.z = var33;
      } else {
         var23.np(this.wC.ei0);
      }

      pw_1 var50 = super.E8.TD0();
      ao_1 var58 = ao_1.DX(this.wC, 9, 0.2F);
      float var16 = 0.0F;
      var58.h5[0] = var16;
      var50.y80(var58).y80(ao_1.DX(this.wC, 4, 0.01F).kt(0.0F, 0.0F, 0.0F));
      super.E8.Xf0();

      for (int var17 = 0; var17 < var1.length; var17++) {
         pw_1 var51 = super.E8;
         var58 = ao_1.DX(var1[var17], 4, 0.01F);
         C8 var65 = var2[var17];
         float var34 = var2[var17].x;
         float var42 = var2[var17].y + 0.55F;
         float var46 = var65.z;
         var51.y80(var58.kt(var34, var42, var46));
      }

      super.E8.mz0();
      pw_1 var18 = super.E8.y80(MU.kO((short)1383)).y80(ao_1.pc(this::zP)).y80(ao_1.pc((varA, varB) -> BattleJ40Animation.ro(var23, varA, varB)));
      String var24;
      if (this.bV.rp0() == 15) {
         var24 = "spawn_cherish";
      } else {
         var24 = "spawn";
      }

      var18.y80(this.vy(var24));
      ao_1 var19;
      if ((var19 = this.Mx(this.bV.rp0())) != null) {
         super.E8.y80(var19);
      }

      super.E8.p1(0.4F);
      super.E8.y80(MU.eK0(this.bV.HF(), this.bV.COm2()));
      super.E8.Xf0();

      for (int var20 = 0; var20 < var1.length; var20++) {
         super.E8.y80(ao_1.DX(var1[var20], 7, 0.8F).UD(1.1F, 1.1F));
         pw_1 var52 = super.E8;
         var58 = ao_1.DX(var1[var20], 4, 0.8F);
         C8 var66 = var2[var20];
         float var25 = var2[var20].x;
         float var35 = var2[var20].y + 0.9F;
         float var43 = var66.z;
         var52.y80(var58.kt(var25, var35, var43));
      }

      super.E8.mz0();
      super.E8.Xf0();

      for (int var21 = 0; var21 < var1.length; var21++) {
         ao_1 var26;
         if (this.Xf0.nf.po0(this.bV.Kj0)) {
            ao_1 var53 = var26 = ao_1.DX(var1[var21], 11, 0.25F);
            float var36 = 0.0F;
            var53.h5[0] = var36;
         } else {
            var26 = ao_1.DX(var1[var21], 10, 0.25F).Om0(0.0F, 0.0F, 0.0F, 0.6F);
         }

         super.E8.y80(ao_1.DX(var1[var21], 7, 0.4F).UD(1.0F, 1.0F)).y80(var26);
      }

      super.E8.mz0();
      super.E8.Xf0();

      for (int var22 = 0; var22 < var1.length; var22++) {
         pw_1 var54 = super.E8;
         var58 = ao_1.DX(var1[var22], 4, 0.6F);
         C8 var67 = var2[var22];
         float var27 = var2[var22].x;
         float var37 = var2[var22].y;
         float var44 = var67.z;
         var54.y80(var58.kt(var27, var37, var44));
      }

      super.E8.mz0().mz0();
      return super.E8;
   }

   public final pw_1 coM9() {
      ie_0 var10000 = tw0_0.Ll0.Qz0.vE0;
      this.bV.ZI(this.bV.COm2(), true);
      com3__3[] var1 = this.bV.Br0;
      C8[] var2 = Arrays.stream(this.bV.Br0).map(BattleJ40Animation::ob).toArray(C8[]::new);
      C8 var3 = T3.hf(this.bV.LpT9.j, this.bV.LpT9.j);
      lc_0 var4 = lc_0.ju0(var10000.LP(4, this.bV.rp0()));
      this.wC = var4;
      super.Vs.A6.add(var4);
      C8 var23;
      var23 = new C8();
      if (this.s9) {
         float var10 = var3.x - 0.5F;
         float var5 = var3.y - 0.5F;
         float var6 = var3.z;
         this.wC.aa(var10, var5, var6);
      } else {
         float var11 = var3.x;
         float var27 = var3.y + 0.5F;
         float var35 = var3.z;
         this.wC.aa(var11, var27, var35);
      }

      (super.E8 = pw_1.xC()).Xf0();

      for (com3__3 var36 : var1) {
         super.E8
            .y80(ao_1.yp(7, var36).UD(0.0F, 0.0F))
            .y80(ao_1.yp(8, var36).Om0(1.0F, 1.0F, 1.0F, 1.0F))
            .y80(ao_1.yp(10, var36).Om0(1.0F, 1.0F, 1.0F, 1.0F))
            .y80(MU.eK0((short)1382, this.s9));
      }

      super.E8.mz0();
      if (this.s9) {
         this.n[2].na(this.bV.Sz(tw0_0.PK0), 0.0F, 0.0F);
         this.n[3].na(this.bV.Sz(tw0_0.PK0), 0.0F, 0.0F);
         this.n[4].na(this.bV.Sz(tw0_0.PK0), 0.0F, 0.0F);
         tl_0 var13;
         var13 = new tl_0(this.n, false);
         pw_1 var29 = super.E8.TD0();

         for (float var37 = 0.0F; var37 < 1.0F; var37 += 0.01F) {
            C8 var7 = jo;
            var13.HB0(jo, var37);
            ao_1 var57 = ao_1.DX(this.wC, 4, 0.01F);
            float var37x = var7.x;
            float var41 = var7.y;
            float var8 = var7.z;
            var29.y80(var57.kt(var37x, var41, var8));
         }

         var29.mz0();
         var29.y80(ao_1.pc((varA, varB) -> this.cOm2(var23, varA, varB)));
         C8[] var44 = this.n;
         C8[] var51 = this.n;
         C8 var58 = this.n[2];
         C8 var61 = this.n[2];
         C8 var10004 = this.n[2];
         float var14 = 4.5F;
         float var30 = 4.0F;
         var10004.x = 1.5F;
         var61.y = var14;
         var58.z = var30;
         C8 var52 = var51[3];
         float var15 = 3.5F;
         float var31 = 4.0F;
         var52.x = 3.0F;
         var52.y = var15;
         var52.z = var31;
         C8 var45 = var44[4];
         float var16 = 3.5F;
         float var32 = 3.5F;
         var45.x = 3.0F;
         var45.y = var16;
         var45.z = var32;
      } else {
         super.E8.p1(0.5F);
         var23.np(this.wC.ei0);
      }

      super.E8.Xf0();
      pw_1 var46 = super.E8.TD0();
      ao_1 var53 = ao_1.DX(this.wC, 9, 0.2F);
      float var17 = 0.0F;
      var53.h5[0] = var17;
      var46.y80(var53).y80(ao_1.DX(this.wC, 4, 0.01F).kt(0.0F, 0.0F, 0.0F));
      super.E8.Xf0();

      for (int var18 = 0; var18 < var1.length; var18++) {
         pw_1 var47 = super.E8;
         var53 = ao_1.DX(var1[var18], 4, 0.01F);
         C8 var59 = var2[var18];
         float var33 = var2[var18].x;
         float var39 = var2[var18].y - 0.4F;
         float var42 = var59.z;
         var47.y80(var53.kt(var33, var39, var42));
      }

      super.E8.mz0();
      pw_1 var19 = super.E8.y80(MU.kO((short)1383)).y80(ao_1.pc(this::iD)).y80(ao_1.pc((varA, varB) -> BattleJ40Animation.Uv(var23, varA, varB)));
      String var24;
      if (this.bV.rp0() == 15) {
         var24 = "spawn_cherish";
      } else {
         var24 = "spawn";
      }

      var19.y80(this.vy(var24));
      ao_1 var20;
      if ((var20 = this.Mx(this.bV.rp0())) != null) {
         super.E8.y80(var20);
      }

      super.E8.p1(0.4F);
      super.E8.Xf0();

      for (int var21 = 0; var21 < var1.length; var21++) {
         pw_1 var48 = super.E8.y80(ao_1.DX(var1[var21], 7, 0.5F).UD(1.1F, 1.1F));
         var53 = ao_1.DX(var1[var21], 4, 0.5F);
         C8 var60 = var2[var21];
         float var25 = var2[var21].x;
         float var34 = var2[var21].y;
         float var40 = var60.z;
         var48.y80(var53.kt(var25, var34, var40));
      }

      super.E8.mz0();
      super.E8.TD0();
      super.E8.Xf0();

      for (int var9 = 0; var9 < var1.length; var9++) {
         ao_1 var22;
         if (this.Xf0.nf.po0(this.bV.Kj0)) {
            ao_1 var49 = var22 = ao_1.DX(var1[var9], 11, 0.25F);
            float var26 = 0.0F;
            var49.h5[0] = var26;
         } else {
            var22 = ao_1.DX(var1[var9], 10, 0.25F).Om0(0.0F, 0.0F, 0.0F, 0.6F);
         }

         super.E8.y80(ao_1.DX(var1[var9], 7, 0.4F).UD(1.0F, 1.0F)).y80(var22);
      }

      super.E8.mz0();
      super.E8.mz0();
      super.E8.mz0();
      super.E8.mz0();
      return super.E8;
   }

   public final pw_1 MH0() {
      this.bV.ZI(this.bV.COm2(), true);
      com3__3 var1 = this.bV.LpT9;
      C8 var2 = T3.hf(this.bV.LpT9.j, this.bV.LpT9.j);
      (super.E8 = pw_1.xC()
            .y80(ao_1.yp(7, var1).UD(0.0F, 0.0F))
            .y80(ao_1.yp(8, var1).Om0(1.0F, 1.0F, 1.0F, 1.0F))
            .y80(ao_1.yp(10, var1).Om0(1.0F, 1.0F, 1.0F, 1.0F)))
         .p1(0.5F);
      C8 var10002 = co_1.Kl0;
      C8 var10003 = co_1.Kl0;
      C8 var3;
      C8 var10004 = var3 = co_1.Kl0;
      var3.getClass();
      float var17 = var2.x;
      float var4 = var2.y;
      float var5 = var2.z;
      var10004.x = var17;
      var10003.y = var4;
      var10002.z = var5;
      var10002 = co_1.cOm6;
      var10003 = co_1.cOm6;
      var10004 = var3 = co_1.cOm6;
      var3.getClass();
      float var12 = var2.x;
      float var19 = var2.y;
      var4 = var2.z;
      var10004.x = var12;
      var10003.y = var19;
      var10002.z = var4;
      co_1.Xh = ri_0.xQ;
      pw_1 var10001 = super.E8.TD0().y80(ao_1.pc(this::DR)).p1(0.4F).Xf0().y80(ao_1.DX(var1, 7, 0.25F).UD(1.0F, 1.0F));
      ao_1 var29 = ao_1.DX(var1, 11, 0.25F);
      float var7 = 0.0F;
      var29.h5[0] = var7;
      var10001 = var10001.y80(var29).mz0().Xf0();
      ao_1 var30 = ao_1.DX(super.jq, 4, 0.05F);
      float var8 = super.jq.x90.x;
      float var13 = super.jq.x90.y + 0.05F;
      float var20 = super.jq.x90.z;
      var10001 = var10001.y80(var30.kt(var8, var13, var20));
      ao_1 var31 = ao_1.DX(super.jq, 9, 0.05F);
      float var9 = super.jq.rj.x;
      float var14 = super.jq.rj.y + 0.05F;
      float var21 = super.jq.rj.z;
      var10001 = var10001.y80(var31.kt(var9, var14, var21)).mz0().Xf0();
      ao_1 var32 = ao_1.DX(super.jq, 4, 0.1F);
      float var10 = super.jq.x90.x;
      float var15 = super.jq.x90.y;
      float var22 = super.jq.x90.z;
      var10001 = var10001.y80(var32.kt(var10, var15, var22));
      ao_1 var33 = ao_1.DX(super.jq, 9, 0.1F);
      float var6 = super.jq.rj.x;
      float var11 = super.jq.rj.y;
      float var16 = super.jq.rj.z;
      var10001.y80(var33.kt(var6, var11, var16)).mz0().mz0();
      return super.E8;
   }

   public final ao_1 Mx(byte var1) {
      return var1 == 15 ? ao_1.pc(this::yL0) : null;
   }

   public final void yL0(int var1, D2 var2) {
      short var7 = 1549;
      byte var8 = 1;
      byte var3;
      if (this.s9) {
         var3 = 14;
      } else {
         var3 = 16;
      }

      float var6 = 200.0F;
      float var4 = 0.8F;
      PF var5 = this.bV;
      this.i6((byte)2, var7, var8, var3, var6, var4, var5);
   }

   public final void DR(int var1, D2 var2) {
      this.bV.U7(1.0F);
   }

   public final void iD(int var1, D2 var2) {
      if (this.j7) {
         this.bV.U7(1.0F);
      }

      vr_1 var3 = super.Vs;
      if (super.Vs != null) {
         var3.A6.remove(this.wC);
      }
   }

   public final void cOm2(C8 var1, int var2, D2 var3) {
      var1.np(this.wC.ei0);
   }

   public final void zP(int var1, D2 var2) {
      if (this.j7) {
         this.bV.U7(1.0F);
      }

      vr_1 var3 = super.Vs;
      if (super.Vs != null) {
         var3.A6.remove(this.wC);
      }
   }

   public final void vI0(C8 var1, int var2, D2 var3) {
      var1.np(this.wC.ei0);
   }

   public final void Qj0(int var1, D2 var2) {
      if (this.j7) {
         this.bV.U7(1.0F);
      }

      vr_1 var3 = super.Vs;
      if (super.Vs != null) {
         var3.A6.remove(this.wC);
      }
   }

   public final void interface$(C8 var1, int var2, D2 var3) {
      var1.np(this.wC.ei0);
   }
}
