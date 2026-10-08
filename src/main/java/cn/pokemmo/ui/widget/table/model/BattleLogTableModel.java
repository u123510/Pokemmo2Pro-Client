package cn.pokemmo.ui.widget.table.model;

import f.*;
import java.text.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.table.model.BaseTableModel;

public class BattleLogTableModel extends BaseTableModel {
   public static final String[] ZT;
   public eo0_0[] or0;
   public boolean U10;

   public BattleLogTableModel() {
      super();
      this.or0 = new eo0_0[0];
      this.U10 = true;
   }

   static {
      ZT = new String[]{
         sm0_0.c0(1711),
         sm0_0.c0(1716),
         sm0_0.c0(1712),
         sm0_0.c0(1713),
         sm0_0.c0(1715),
         sm0_0.c0(1714)
      };
   }

   public final int oK0() {
      return this.or0.length;
   }

   public final int Zy() {
      return ZT.length;
   }

   public final String LPT7(int var1) {
      return ZT[var1];
   }

   public final Object RG0(int var1, int var2) {
      eo0_0 var3 = this.or0[var1];
      if (!this.U10) {
         return "???";
      }

      switch (var2) {
         case 0:
            String levelText = var3.TA;
            if (levelText == null) {
               if (var3.Pi0 != null) {
                  levelText = sm0_0.c0(var3.Pi0.Jn + 1750);
               } else if (var3.je != null) {
                  levelText = sm0_0.c0(var3.je.Nl).replaceAll(" - .*", "");
               } else if (var3.mE0 < 2) {
                  levelText = sm0_0.c0(1732);
               } else {
                  levelText = sm0_0.wa0(1731, Integer.toString(var3.mE0));
               }

               var3.TA = levelText;
            }

            return levelText;
         case 1:
            ia0_1 var4 = var3.FX;
            if (var4 == null) {
               cn_0 var5 = new cn_0((KG0)null, 0);
               var5.Sk(var3.JJ());
               var5.uf("dex-move-table-name-label");
               var5.GH0 = 50;
               var5.yj0 = s2_0.Fl0(var3.M60, null, -1);
               var5.yB0();
               var4 = new ia0_1(1);
               var3.FX = var4;
               var4.F9(var4.fU(), var5);
            }

            return var3.FX;
         case 2:
            ia0_1 var6 = var3.yw;
            if (var6 == null) {
               S70 var7 = new S70(64, 30, 0);
               var7.og.r8(new LPT6_[]{fn_0.qz0().jJ0(var3.M60.oG(null, null).j40)});
               if (tw0_0.kz0()) {
                  var7.og.gY = 16;
                  var7.og.a4 = 2;
                  var7.og.EJ0 = 2.0F;
               } else {
                  var7.og.gY = 8;
                  var7.og.a4 = 8;
               }

               var6 = new ia0_1(1);
               var3.yw = var6;
               var6.F9(var6.fU(), var7);
            }

            return var3.yw;
         case 3:
            return var3.k1;
         case 4:
            return var3.aq;
         case 5:
            return var3.XS;
         default:
            return "";
      }
   }

   public final Object fh0(int var1, int var2) {
      return null;
   }
}
