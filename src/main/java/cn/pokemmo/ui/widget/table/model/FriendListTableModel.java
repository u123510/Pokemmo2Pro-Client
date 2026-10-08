package cn.pokemmo.ui.widget.table.model;

import f.*;
import java.text.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.table.model.BaseTableModel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FriendListTableModel extends BaseTableModel {
   public final pk_0 JK;
   public final ab_1 kY;
   public ce0_0[] jy = new ce0_0[0];
   public final SimpleDateFormat BD0 = new SimpleDateFormat("yyyy-MM-dd");
   public final String[] Lx0;
   public ia0_1[] Yr0;

   public FriendListTableModel(pk_0 var1, ab_1 var2) {
      if (tw0_0.kz0()) {
         String[] var3;
         String[] var10001 = var3 = new String[5];
         var10001[0] = sm0_0.c0(2702);
         var10001[1] = sm0_0.c0(2703);
         var10001[2] = sm0_0.c0(2704);
         var10001[3] = sm0_0.c0(1659);
         var10001[4] = sm0_0.c0(1683);
         this.Lx0 = var3;
      } else {
         String[] var4;
         String[] var5 = var4 = new String[4];
         var5[0] = sm0_0.c0(2702);
         var5[1] = sm0_0.c0(2703);
         var5[2] = sm0_0.c0(2704);
         var5[3] = sm0_0.c0(1659);
         this.Lx0 = var4;
      }

      this.JK = var1;
      this.kY = var2;
   }

   public final int oK0() {
      return this.jy.length;
   }

   public final int Zy() {
      return this.Lx0.length;
   }

   public final String LPT7(int var1) {
      return this.Lx0[var1];
   }

   public final Object RG0(int var1, int var2) {
      int var10000 = var2;
      ce0_0 var11 = this.jy[var1];
      switch (var10000) {
         case 0:
            ia0_1[] var3;
            if ((var3 = this.Yr0) != null && var3.length > var1) {
               ia0_1 cached = var3[var1];
               if (cached != null) {
                  return cached;
               }

               OT var13;
               if (var11.YX.equals(tw0_0.e60.dj0)) {
                  OT var17 = var13 = new OT(0, 0, tw0_0.e60.jB0);
                  var17.iB(true);
               } else {
                  OT var18 = var13 = new OT(0, 0, var11.GG0);
                  byte var4 = 0;
                  byte var5 = 0;
                  cd0_2 var6 = var11.GG0;
                  var18.iB(var11.mo0);
               }

               if (tw0_0.kz0()) {
                  var13.Te0(-28, -52);
                  byte var14 = 2;
                  var13.J60.Ta = var14;
               } else {
                  var13.Te0(-14, -26);
               }

               ia0_1 var15;
               ia0_1 var19 = var15 = new ia0_1(1);
               FriendListTableModel var10001 = this;
               DU var8;
               DU var10006 = var8 = new DU(var11.GG0.DR);
               ((le0_2)var10006).uf("label");
               var10006.lv = false;
               ((le0_2)var15).F9(((le0_2)var15).fU(), var13);
               ((le0_2)var15).F9(((le0_2)var15).fU(), var8);
               var10001.Yr0[var1] = var15;
               return var19;
            }

            return null;
         case 1:
            return this.BD0.format(new Date((long)var11.ED * 1000L));
         case 2:
            String var7 = this.JK.Ha0(var11.qf0);
            if (tw0_0.kz0() ^ true) {
               var1 = 7;
            } else {
               var1 = 11;
            }

            if (var7.length() > var1) {
               var7 = var7.substring(0, var1) + "..";
            }

            return var7;
         case 3:
            return var11.mo0 ? sm0_0.c0(1678) : this.BD0.format(new Date((long)var11.GG0.gw * 1000L));
         case 4:
            xe_1 var9;
            xe_1 var16 = var9 = new xe_1(sm0_0.c0(1683));
            var16.RR(new pj0_0(this, var11, var9));
            return var16;
         default:
            return "";
      }
   }

   public final Object fh0(int var1, int var2) {
      ce0_0 var3 = this.jy[var1];
      return var2 != 2 ? "" : this.JK.Ha0(var3.qf0);
   }
}

