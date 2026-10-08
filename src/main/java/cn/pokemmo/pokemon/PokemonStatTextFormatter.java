package cn.pokemmo.pokemon;

import f.*;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.stream.Stream;

/**
 * 宝可梦数值高亮与摘要格式化器 (PokemonStatTextFormatter)
 *
 * <p>核心职责：
 * <ul>
 *   <li>宝可梦个体值 (IV) 与努力值 (EV) 的字符串格式化与高亮（如 [#6fb76f]31[]、[#ff6666]0[]）；</li>
 *   <li>宝可梦性格补正、特性、属性、体型、初训家 (OT) 及生蛋亲密度描述文本生成；</li>
 *   <li>训练家卡片与对战队伍摘要格式化；</li>
 *   <li>技能招式威力、命中率、PP 与状态异常说明文本生成。</li>
 * </ul>
 *
 * <p>原始混淆类：{@link f.lb0_2}
 */
public abstract class PokemonStatTextFormatter {
   public static final DecimalFormat mR;

   protected PokemonStatTextFormatter() {
   }

   public static String Ky(VU var0, boolean var1, boolean var2, boolean var3) {
      if (var0 == null) {
         return "";
      }

      if (var0.I8.vn()) {
         return var0.na0();
      }

      if (var1) {
         return ig_0.u9(1809, ig_0.u9(1840, new StringBuilder().append(var0.na0()).append("\n"), " ").append(var0.I8.wj).append("\n"), " ")
            .append(var0.I8.VD)
            .append(" / ")
            .append(var0.Ps.BL0(gc_2.RC))
            .toString();
      }

      mc0_1 var11 = gu0.l2.lPT6(var0.I8.rh0());
      StringBuilder var4;
      var4 = new StringBuilder();
      StringBuilder var5 = new StringBuilder();
      var4.append(ig_0.u9(59, var5, " ").append(var0.I8.wj).append(" ").append(var0.na0()).toString());
      var5 = new StringBuilder("\n");
      var5 = ig_0.u9(1804, var5, " ");
      String var6;
      if (var0.KD() == var0.KI()) {
         var6 = var0.KD().BT();
      } else {
         var6 = var0.KD().BT() + " / " + var0.KI().BT();
      }

      var4.append(var5.append(var6).toString());
      StringBuilder var18;
      var18 = new StringBuilder("\n");
      var4.append(ig_0.u9(1807, var18, " ").append(var0.I8.Ql0()).toString());
      StringBuilder var19;
      var19 = new StringBuilder("\n");
      StringBuilder var10004 = ig_0.u9(1809, var19, " ").append(var0.I8.VD).append(" / ");
      gc_2 var20 = gc_2.RC;
      var4.append(var10004.append(var0.Ps.BL0(gc_2.RC)).toString());
      var5 = new StringBuilder("\n");
      var4.append(ig_0.u9(1824, var5, " ").append(sm0_0.c0(var0.Aq0() + 210000)).toString());
      var5 = new StringBuilder("\n");
      var4.append(ig_0.u9(1805, var5, " ").append(sm0_0.c0(var0.I8.yb.f10 + 180000)).toString());
      var5 = new StringBuilder();
      StringBuilder var10001 = ig_0.u9(1849, var5, " ").append(var0.I8.RI(var20)).append("/");
      gc_2 var28 = gc_2.r4;
      var10001 = var10001.append(var0.I8.RI(gc_2.r4)).append("/");
      gc_2 var32 = gc_2.ly;
      var10001 = var10001.append(var0.I8.RI(gc_2.ly)).append("/");
      gc_2 var7 = gc_2.ej;
      var10001 = var10001.append(var0.I8.RI(gc_2.ej)).append("/");
      gc_2 var8 = gc_2.lL0;
      var10001 = var10001.append(var0.I8.RI(gc_2.lL0)).append("/");
      gc_2 var9 = gc_2.ie0;
      String var10 = var10001.append(var0.I8.RI(gc_2.ie0)).toString();
      if (var3) {
         var10 = var10.replace("31", "[#6fb76f]31[]").replaceAll("([^0-9])0", "$1[#ff6666]0[]").replaceAll("^0/", "[#ff6666]0[]/");
      }

      var4.append("\n" + var10);
      StringBuilder var33;
      var33 = new StringBuilder("\n");
      var4.append(
         ig_0.u9(1800, var33, " ")
            .append(var0.I8.ZY(var20))
            .append("/")
            .append(var0.I8.ZY(var28))
            .append("/")
            .append(var0.I8.ZY(var32))
            .append("/")
            .append(var0.I8.ZY(var7))
            .append("/")
            .append(var0.I8.ZY(var8))
            .append("/")
            .append(var0.I8.ZY(var9))
            .toString()
      );
      String var12;
      if (var0.I8.rh0() > 0) {
         StringBuilder var21;
         var21 = new StringBuilder("\n\n");
         var12 = ig_0.u9(1842, var21, " ").append(sm0_0.c0(var11.Nl)).toString();
      } else {
         var12 = "";
      }

      var4.append(var12);
      var4.append("\n\n" + sm0_0.c0(1843));

      for (int var13 = 0; var13 < 4; var13++) {
         StringBuilder var22;
         var22 = new StringBuilder("\n");
         ec0_2 var35 = ec0_2.Sx();
         short var29 = var0.I8.Gu[var13];
         String var30;
         if ((vk0_1)var35.f4.f5(var29) == null) {
            var30 = "-";
         } else {
            ec0_2 var36 = ec0_2.Sx();
            short var31 = var0.I8.Gu[var13];
            var30 = sm0_0.c0(((vk0_1)var36.f4.f5(var31)).bt);
         }

         var4.append(var22.append(var30).toString());
      }

      if (var2 && var0.I8.df0()) {
         var4.append("\n\n" + sm0_0.c0(1864));
          for (int index = 0; index < var0.I8.V3.length; index++) {
             short moveId = var0.I8.V3[index];
             if (moveId >= 1) {
                vk0_1 move = (vk0_1)ec0_2.Sx().f4.f5(moveId);
                if (move != null) {
                   var4.append("\n");
                   var4.append(sm0_0.c0(move.bt));
                }
             }
          }
      }

      return var4.toString();
   }

   public static String fb0(vk0_1 var0) {
      if (var0 == null) {
         return "";
      }

      StringBuilder var1;
      var1 = new StringBuilder();
      var1.append(sm0_0.c0(1850)).append(" ");
      if (var0.hC0 == 374) {
         var1.append("10 - 130");
      } else {
         short var2 = var0.X00;
         String var5;
         if (var0.X00 == 0) {
            var5 = "-";
         } else {
            var5 = Integer.toString(var2);
         }

         var1.append(var5);
      }

      var1.append(" | ");
      var1.append(sm0_0.c0(1857)).append(" ");
      byte var3;
      String var4;
      if ((var3 = var0.mt0) != 0 && var3 != 101) {
         var4 = Integer.toString(var3);
      } else {
         var4 = "-";
      }

      var1.append(var4);
      return var1.toString();
   }

   public static String Sm(vk0_1 var0) {
      if (var0 == null) {
         return "";
      }

      if (var0.Qj() != null && var0.Qj().zB0() != null) {
         byte var1;
         if (zb0_2.bigCJKFontSizes()) {
            var1 = 22;
         } else {
            var1 = 38;
         }

         StringBuilder var2 = new StringBuilder();
      StringBuilder var10001 = var2;
         var2.append(sm0_0.c0(1863));
         var2.append("\n\n");
         var2.append(sm0_0.c0(var0.Qj().throws$.nH + 310418));
         var2.append("\n");
         var10001.append(hx_1.LPt2(var1, sm0_0.c0(var0.Qj().zB0().fe + 310200).replace("|br|", "\n")));
         var10001.append("\n\n");
         byte var10000 = var1 = var0.Qj().zB0().OA;
         StringBuilder var3;
         var3 = new StringBuilder();
         var3 = ig_0.u9(1865, var3, " ");
         String var7;
         if (var10000 > 0) {
            var7 = Byte.toString(var1);
         } else {
            var7 = "--";
         }

         var2.append(var3.append(var7).toString());
         var2.append("\n");
         byte var4;
         var10000 = var4 = var0.Qj().zB0().VC;
         StringBuilder var8;
         var8 = new StringBuilder();
         StringBuilder var9 = ig_0.u9(1866, var8, " ");
         String var5;
         if (var10000 > 0) {
            var5 = Byte.toString(var4);
         } else {
            var5 = "--";
         }

         var2.append(var9.append(var5).toString());
         return var2.toString();
      } else {
         return sm0_0.c0(7005);
      }
   }

   public static String Sp0(mc0_1 var0, boolean var1, boolean var2) {
      byte var3;
      if (tw0_0.kz0()) {
         var3 = 38;
      } else {
         var3 = 45;
      }

      String var11;
      if (N50.Aa(var0.PX)) {
         var11 = var0.Com4((byte)-1, var3).replace("|br|", "\n");
      } else {
         var11 = var0.Com4((byte)-1, var3);
      }

      if (var0.Yt0 == l5_0.YW && var0.wb0 > 0 && var0.Fv < 1) {
         ec0_2 var10000 = ec0_2.Sx();
         short var4 = var0.wb0;
         vk0_1 var13;
         if ((var13 = (vk0_1)var10000.f4.f5(var4)) != null) {
            Object var12 = null;
            Object var5 = null;
            byte var6;
            if (zb0_2.bigCJKFontSizes()) {
               var6 = 22;
            } else {
               var6 = 38;
            }

            var11 = JD(var13, (CE)var12, (mc0_1)var5, var6);
         }
      }

      StringBuilder var14;
      if (var2) {
         var14 = ln(var0);
      } else {
         var14 = Ue0(var0);
      }

      StringBuilder var10;
      var10 = new StringBuilder();
      if (var1) {
         var10.append(sm0_0.c0(var0.Nl));
         if (tw0_0.Eu(3)) {
            var10.append(" (").append(var0.Z8);
            if (var0.PX >= 0) {
               var10.append(" ");
               byte var18 = var0.PX;
               if (var0.PX == 10) {
                  var10.append("Custom");
               } else {
                  var10.append(N50.k10(var18));
               }
            }

            var10.append(")");
         }

         var10.append("\n");
      }

      if (var14.length() > 0) {
         if (var0.Yt0 != l5_0.Hj) {
            var10.append("--------\n");
         }

         var10.append(var14);
      }

      if (!var2) {
         String var15;
         if (!(var15 = Ix(var0)).isEmpty()) {
            var10.append("--------\n");
            var10.append(var15);
            var10.append("\n");
         }

         if (var0.X80()) {
            var10.append("--------\n");
            var10.append(nk(var0, true));
         }
      }

      if (var0.Bk0 > -1) {
         var10.append("--------\n");
         var14 = new StringBuilder();
         byte var19 = var0.Bk0;
         double var23;
         if (var0.Bk0 == 0) {
            var23 = 255.0;
         } else {
            label168: {
               label150: {
                  if (var19 != 1) {
                     if (var19 == 2) {
                        break label150;
                     }

                     if (var19 == 4) {
                        var23 = 0.75;
                        break label168;
                     }

                     if (var19 == 11) {
                        break label150;
                     }

                     if (var19 == 13) {
                        var23 = 1.25;
                        break label168;
                     }

                     if (var19 != 15) {
                        if (var19 != 23) {
                           var23 = 1.0;
                           break label168;
                        }
                        break label150;
                     }
                  }

                  var23 = 2.0;
                  break label168;
               }

               var23 = 1.5;
            }
         }

         double var8;
         switch (var19) {
            case 0:
               var8 = 255.0;
               break;
            case 1:
            case 10:
            case 15:
               var8 = 2.0;
               break;
            case 2:
            case 11:
            case 23:
               var8 = 1.5;
               break;
            case 3:
            default:
               var8 = 1.0;
               break;
            case 4:
               var8 = 3.0;
               break;
            case 5:
            case 6:
               var8 = 3.5;
               break;
            case 7:
            case 9:
            case 16:
            case 17:
            case 18:
            case 19:
            case 22:
            case 24:
               var8 = 4.0;
               break;
            case 8:
            case 12:
            case 21:
               var8 = 2.5;
               break;
            case 13:
               var8 = 1.25;
               break;
            case 14:
               var8 = 5.0;
               break;
            case 20:
               var8 = 8.0;
         }

         String var17;
         if (var23 == 0.0 && var8 == 0.0) {
            var17 = "";
         } else {
            if (var23 == var8) {
               if (var23 >= 255.0) {
                  var14.append(sm0_0.wa0(1440, sm0_0.c0(1444)));
               } else {
                  StringBuilder var20 = new StringBuilder();
      StringBuilder var10001 = var20;
                  var14.append(sm0_0.wa0(1440, var10001.append(var23).append("x").toString()));
               }
            } else {
               if (var23 == -2.0) {
                  var14.append(sm0_0.wa0(1441, sm0_0.c0(1443)));
               } else {
                  StringBuilder var21 = new StringBuilder();
      StringBuilder var25 = var21;
                  var14.append(sm0_0.wa0(1441, var25.append(var23).append("x").toString()));
               }

               var14.append("\n");
               if (var8 == -2.0) {
                  var14.append(sm0_0.wa0(1442, sm0_0.c0(1443)));
               } else {
                  StringBuilder var22 = new StringBuilder();
      StringBuilder var26 = var22;
                  var14.append(sm0_0.wa0(1442, var26.append(var8).append("x").toString()));
               }
            }

            var14.append("\n");
            var17 = var14.toString();
         }

         var10.append(var17);
      }

      if (var11.length() > 0 && var0.Yt0 != l5_0.Hj) {
         if (var10.length() > 0) {
            var10.append("--------\n");
         }

         var10.append(var11);
      }

      if (!var2 && var0.X80() && var0.Z8 != 1446) {
         var10.append("\n--------\n");
         var10.append(sm0_0.c0(100150)).append("\n");
      }

      return var10.toString().trim();
   }

   public static String nk(mc0_1 var0, boolean var1) {
      if (!var0.X80()) {
         return "";
      }

      if (var0.Z8 == 1446) {
         var1 = false;
      }

      StringBuilder var10;
      var10 = new StringBuilder();
      if (var1) {
         int[] var2 = var0.mK;
         boolean var3 = false;

         for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] >= 1) {
               if (var3) {
                  var10.append(", ");
               }

               var3 = true;
               int var5 = var4 * 2 + 100100;
               byte var6;
               if (var2[var4] > 9) {
                  var6 = 1;
               } else {
                  var6 = 0;
               }

               var10.append(sm0_0.c0(var5 + var6));
            }
         }

         var10.append("\n");
      }

      int var7 = var0.ZX / 60;
      float var11 = var0.sh / 60.0F;
      DecimalFormat var15 = new DecimalFormat();
      var15.setMaximumFractionDigits(2);
      String var12 = var15.format(var11);
      int var13 = 100120;
      var10.append(sm0_0.c0(var0.vp + var13));
      var10.append(" ");
      var10.append(sm0_0.wa0(100119, var7 + "")).append("\n");
      int var8 = 100125;
      var10.append(sm0_0.c0(var0.ia + var8)).append("\n");
      int var9 = 100130;
      var10.append(sm0_0.c0(var0.uL0 + var9));
      var10.append(" ");
      var10.append(sm0_0.wa0(100119, var12)).append("\n");
      return var10.toString();
   }

   public static StringBuilder Ue0(mc0_1 item) {
      int wrapWidth = zb0_2.bigCJKFontSizes() ? 22 : 45;
      StringBuilder result = new StringBuilder();
      tu_0 owner = item.jq0;
      if (owner != tu_0.M4) {
         if (result.length() > 0) result.append("\n");
         N3 ownerInfo;
         BR game = tw0_0.rl;
         synchronized (game.mG) {
            ownerInfo = (N3)game.mG.BM(owner.OE0);
         }
         if (ownerInfo != null && ownerInfo.Jm0 == ys_1.Pv) {
            int now = (int)(System.currentTimeMillis() / 1000L);
            result.append(sm0_0.wa0(1461, tx_1.i(ownerInfo.py0 - (now - ownerInfo.LPt5), true))).append("\n\n");
         } else {
            result.append(sm0_0.wa0(1449, owner.toString())).append("\n\n");
         }
      }
      StringBuilder seasonalDescription = cM0(item);
      if (seasonalDescription.length() > 0) result.append(seasonalDescription);
      for (od0_1 modifier : item.Wj0) result.append(hx_1.oO(g6_0.dG(modifier.Im0, modifier.kc0), wrapWidth, null, true, 0)).append("\n");
      l5_0 itemType = item.Yt0;
      if (itemType != l5_0.Jy) {
         if (item.TD != 0 && item.kr0) {
            result.append(sm0_0.wa0(1926, NumberFormat.getInstance().format(item.TD)));
            if (tw0_0.Eu(3)) result.append(" (Mart Item)");
            result.append("\n");
         }
         if (item.gQ() != 0) result.append(sm0_0.wa0(1930, NumberFormat.getInstance().format(item.gQ()))).append("\n");
      }
      if (!item.TL()) result.append(sm0_0.c0(1425)).append("\n");
      if (item.M80) result.append(sm0_0.c0(1447)).append("\n");
      if (!item.To0(false)) result.append(sm0_0.c0(1445)).append("\n");
      if (!item.ii0) result.append(sm0_0.c0(1436)).append("\n");
      if (item.QJ > -1) result.append(sm0_0.c0(1429)).append("\n");
      if (item.Mj0 != j30_0.Hi) result.append(sm0_0.c0(16777252)).append("\n");
      if (itemType == l5_0.Hj || itemType == l5_0.Jy) return result;
      if (item.Ye0 > 0) result.append(sm0_0.wa0(101421, NumberFormat.getInstance().format(item.Ye0))).append("\n");
      StringBuilder restrictions = ln(item);
      if (restrictions.length() > 0) result.append(restrictions);
      gc_2 stat = item.dp0;
      if (stat != null && item.nn != 0) result.append(sm0_0.Bx(1428, new String[]{stat.toString(), (item.nn > 0 ? "+" : "") + NumberFormat.getInstance().format(item.nn)})).append("\n");
      short itemId = X4.gA0(item.Z8);
      if (itemId >= 5548 && itemId <= 5564) result.append(sm0_0.wa0(1433, i40_0.b8(itemId).toString())).append("\n");
      if ((itemId >= 121 && itemId <= 132) || (itemId >= 5137 && itemId <= 5148) || (itemId >= 8137 && itemId <= 8148) || (itemId >= 9137 && itemId <= 9148)) result.append(sm0_0.c0(1434)).append("\n");
      short friendship = item.Yk0;
      if (friendship == 0) return result;
      result.append(sm0_0.c0(friendship > 0 ? (friendship < 10 ? 1453 : friendship < 20 ? 1454 : 1455) : (friendship > -10 ? 1456 : friendship > -20 ? 1457 : 1458))).append("\n");
      NL nature = item.sE0;
      if (nature != NL.g40) result.append(hx_1.LPt2(wrapWidth, sm0_0.wa0(1459, sm0_0.c0(nature.bB0())))).append("\n");
      return result;
   }
   public static StringBuilder cM0(mc0_1 var0) {
      StringBuilder var1;
      var1 = new StringBuilder();
      NA0 var2 = var0.wX;
      if (var0.Yt0 != l5_0.Hj) {
         switch (U1.dj0[var2.g20]) {
            case 1:
            case 2:
            case 3:
            case 4:
               var1.append(sm0_0.c0(19956)).append("\n");
               break;
            case 5:
               var1.append(sm0_0.c0(19953)).append("\n");
               break;
            case 6:
               var1.append(sm0_0.c0(19958)).append("\n");
               break;
            case 7:
            case 8:
               if (var0.jq0 == tu_0.M4) {
                  tu_0 var3 = var0.vJ0;
                  if (var0.vJ0 != null) {
                     var1.append(sm0_0.wa0(19964, var3.toString())).append("\n");
                  } else {
                     var1.append(sm0_0.c0(19954)).append("\n");
                  }
               }
         }
      }

      YearMonth var6 = var0.Ui0;
      if (var0.Ui0 != null && var6.getYear() >= 2010 && var0.jq0 == tu_0.M4) {
         if (var2 == NA0.ED || var2 == NA0.oO) {
            tu_0 var4 = var0.vJ0;
            if (var0.vJ0 != null) {
               String[] var10002 = new String[2];
               byte var7 = 0;
               var10002[var7] = var4.toString();
               var10002[1] = Integer.toString(var6.getYear());
               var1.append(sm0_0.Bx(19962, var10002)).append("\n");
            } else {
               var1.append("SEASONAL_EVENT_ERR");
            }
         } else if (var2 != NA0.oH && var2 != NA0.P5) {
            var1.append(sm0_0.Bx(19960, new String[]{var6.getMonth().getDisplayName(TextStyle.FULL, wi0_0.gm.Fu), Integer.toString(var6.getYear())}))
               .append("\n");
         } else {
            var1.append(sm0_0.Bx(19961, new String[]{var6.getMonth().getDisplayName(TextStyle.FULL, wi0_0.gm.Fu), Integer.toString(var6.getYear())}))
               .append("\n");
         }
      }

      Us0 var5;
      if (var2 == NA0.oO && (var5 = var0.Zl0) != null) {
         var1.append(sm0_0.wa0(19963, var5.toString())).append("\n");
      }

      return var1;
   }

   public static StringBuilder ln(mc0_1 var0) {
      StringBuilder var1;
      var1 = new StringBuilder();
      if (var0.tX > 0) {
         short var2 = 1426;
         var1.append(sm0_0.wa0((var0.CJ0 ? 1 : 0) + var2, NumberFormat.getInstance().format(var0.tX)));
         var1.append("\n");
      }

      if (var0.Zp == -1) {
         var1.append(sm0_0.c0(3523));
         var1.append("\n");
      }

      return var1;
   }

   public static String Ix(mc0_1 var0) {
      short var1 = X4.gA0(var0.Z8);
      if (var0.ol() && var1 != 1422 && var1 != 1446 && (var1 < 1447 || var1 > 1471)) {
         cq_0[] var6;
          cq_0[] var10000 = var6 = Arrays.stream(var0.xC).map(cq_0::Xt).distinct().sorted(Comparator.comparingInt(cq_0::Nm)).toArray(lb0_2::cOM2);
         StringBuilder var7;
          var7 = new StringBuilder();
          var7.append(sm0_0.c0(1446));
         if (var10000.length > 5) {
            byte var2;
            if (zb0_2.bigCJKFontSizes()) {
               var2 = 22;
            } else {
               var2 = 38;
            }

            StringBuilder var3;
            var3 = new StringBuilder();

            for (int var4 = 0; var4 < var6.length; var4++) {
               cq_0 var5 = var6[var4];
               if (var4 == 0) {
                  var3.append("• ");
               } else {
                  var3.append(", ");
               }

               var3.append(var5.Ay(false));
            }

            var7.append("\n").append(hx_1.LPt2(var2, var3.toString()));
         } else {
            for (cq_0 var10 : var6) {
               if (var7.length() > 0) {
                  var7.append("\n");
               }

               var7.append("• ").append(var10.Ay(false));
            }
         }

         return var7.toString();
      } else {
         return "";
      }
   }

   public static String ZV(cq_0 var0) {
      StringBuilder var1 = new StringBuilder("");
      StringBuilder var10001 = var1;
      var1.append(sm0_0.c0(var0.Lh(0) + 210000));
      var1.append("\n------\n");
      var10001.append(sm0_0.c0(var0.Lh(0) + 220000));
      if (var0.Lh(0) != var0.Lh(1) && var0.Lh(1) > 0) {
         var1.append("\n\n\n");
         var1.append(sm0_0.c0(var0.Lh(1) + 210000));
         var1.append("\n------\n");
         var1.append(sm0_0.c0(var0.Lh(1) + 220000));
      }

      return var1.toString();
   }

   public static String Xm(cq_0 var0) {
      return "" + sm0_0.c0(var0.Lh(2) + 210000) + "\n------\n" + sm0_0.c0(var0.Lh(2) + 220000);
   }

   public static final String pr(a10_0 var0, tb0_1 var1) {
      return vq(var0, var1, false);
   }

   public static String vq(a10_0 var0, tb0_1 var1, boolean var2) {
      if (var1 != null) {
         byte var3 = var1.uG0;
         if (var1.uG0 != 0) {
            boolean var23 = var3 == -2 || (var1.B3.Bn.YD0.Sa != 0L && var1.B3.hf0());

            String var4 = "";
            String var5 = "";
            StringBuilder var6;
            var6 = new StringBuilder("");
            if (!var1.gQ() && var1.Ua0.Td0() != con__6.pn0) {
               String var12 = sm0_0.c0(59);
               String var15;
               if (var23) {
                  var15 = sm0_0.c0(5211);
               } else {
                  var15 = "???%";
               }

               var6.append(var12).append(" ??? ??? - ").append(var15);
               return var6.toString();
            }

            se_0 var13 = var1.B3;
            PF var16 = null;
            if (!var2 && (var16 = var0.nd0(var13.Bn.YD0)) != null) {
               if (var16.Sk0 != -1) {
                  var4 = sm0_0.c0(var16.Ql() + 210000);
               }

               i40_0 var7 = i40_0.Gc;
               if (var16.gp != i40_0.Gc || var16.Qj != var7) {
                  if (var16.J50() == var16.fE()) {
                     var5 = sm0_0.wa0(7006, var16.J50().BT());
                  } else {
                     String[] var47;
                     String[] var63 = var47 = new String[2];
                     var47[0] = var16.J50().BT();
                     var63[1] = var16.fE().BT();
                     var5 = sm0_0.Bx(7007, var47);
                  }
               }
            }

                  int var54;
            if (var16 != null) {
               var54 = var16.Ya0();
            } else {
               var54 = var13.Bn.wj;
            }

            short var8;
            if (var16 != null) {
               var8 = var16.p10();
            } else {
               var8 = var13.Bn.Yb0;
            }

            String var55 = sm0_0.c0(59);
            String var60 = sm0_0.c0(var8 + 150000);
            String var9 = Integer.toString(var54);
            String var10;
            if (var23) {
               var10 = sm0_0.c0(5211);
            } else {
               var10 = tx_1.uF(var13.Bn.VD, var13.Sj) + "%";
            }

            var6.append(var55).append(" ").append(var9).append(" ").append(var60).append(" - ").append(var10);
            if (!var23) {
               if (!var13.hf0() && var13.Bn.H1 != 0) {
                  if ((var3 = var13.HP()) != -128) {
                     if (var3 != 16) {
                        if (var3 != 32) {
                           if (var3 != 64) {
                              if (var3 != 7) {
                                 if (var3 == 8) {
                                    var6.append("\n").append(sm0_0.c0(5221));
                                 }
                              } else {
                                 var6.append("\n").append(sm0_0.c0(5220));
                              }
                           } else {
                              var6.append("\n").append(sm0_0.c0(5224));
                           }
                        } else {
                           var6.append("\n").append(sm0_0.c0(5223));
                        }
                     } else {
                        var6.append("\n").append(sm0_0.c0(5222));
                     }
                  } else {
                     var6.append("\n").append(sm0_0.c0(5225));
                  }
               }

               if (var16 != null) {
                  if (!var4.isEmpty()) {
                     var6.append("\n");
                     var6.append(sm0_0.wa0(5057, var4));
                  }

                  if (!var5.isEmpty()) {
                     var6.append("\n");
                     var6.append(var5);
                  }

                  if (!var16.zi0.hf0()) {
                     byte[] var25 = var16.sL0;
                     int var31 = var16.sL0.length;

                     for (int var48 = 0; var48 < var31; var48++) {
                        if (var25[var48] != 0) {
                           var6.append('\n');
                           gc_2[] var26 = gc_2.mi;
                           int var32 = gc_2.mi.length;

                           for (int var49 = 0; var49 < var32; var49++) {
                              gc_2 var56 = var26[var49];
                              byte var61;
                              if ((var61 = var16.sL0[var56.v10]) != 0) {
                                 StringBuilder var57 = var6.append('\n').append(var56).append(": ");
                                 if (var61 > 0) {
                                    var9 = "+";
                                 } else {
                                    var9 = "";
                                 }

                                 var57.append(var9).append(var61);
                              }
                           }
                           break;
                        }
                     }
                  }

                  ek_0 var17 = var0.mn(var16.cD0).zI;
                  StringBuilder var27;
                  var27 = new StringBuilder();
                  if (var17.bB0 > 0) {
                     var27.append(sm0_0.Bx(7008, new String[]{sm0_0.c0(110366), String.valueOf(var17.bB0)}));
                  }

                  if (var17.tw > 0) {
                     var27.append(sm0_0.Bx(7008, new String[]{sm0_0.c0(110054), String.valueOf(var17.tw)}));
                  }

                  if (var17.Jy0 > 0) {
                     var27.append(sm0_0.Bx(7008, new String[]{sm0_0.c0(110219), String.valueOf(var17.Jy0)}));
                  }

                  if (var17.CT > 0) {
                     var27.append(sm0_0.Bx(7008, new String[]{sm0_0.c0(110381), String.valueOf(var17.CT)}));
                  }

                  byte var33 = var17.Wn0;
                  if (var17.Wn0 > 0 && var33 != 127) {
                     var27.append(sm0_0.Bx(7008, new String[]{sm0_0.c0(200561), String.valueOf(var17.Wn0)}));
                  }

                  byte var34 = var17.COm5;
                  if (var17.COm5 > 0 && var34 != 127) {
                     var27.append(sm0_0.Bx(7008, new String[]{sm0_0.c0(200563), String.valueOf(var17.COm5)}));
                  }

                  byte var35 = var17.cU;
                  if (var17.cU > 0 && var35 != 127) {
                     var27.append(sm0_0.Bx(7008, new String[]{sm0_0.c0(200562), String.valueOf(var17.cU)}));
                  }

                  if (var17.Rz0 > 0) {
                     if (var27.length() > 0) {
                        var27.append("\n");
                     }

                     ec0_2 var64 = ec0_2.Sx();
                     short var36 = var17.Rz0;
                     vk0_1 var37 = (vk0_1)var64.f4.f5(var36);
                     byte var50 = var17.rE0;
                     var54 = var17.vD0;
                     if (var17.rE0 > 0) {
                        var54 = var50 - var54;
                     }

                     short var51;
                     if (var50 > 0) {
                        if (var17.LPt4) {
                           var51 = 7010;
                        } else {
                           var51 = 7008;
                        }
                     } else if (var17.LPt4) {
                        var51 = 7011;
                     } else {
                        var51 = 7009;
                     }

                     var27.append(sm0_0.Bx(var51, new String[]{sm0_0.c0(var37.bt), String.valueOf(var54), String.valueOf(var17.wb0)}));
                  }

                  if (var17.fP > 0) {
                     if (var27.length() > 0) {
                        var27.append("\n");
                     }

                     ec0_2 var65 = ec0_2.Sx();
                     short var38 = var17.fP;
                     vk0_1 var39 = (vk0_1)var65.f4.f5(var38);
                     byte var52 = var17.aw0;
                     var54 = var17.id0;
                     if (var17.aw0 > 0) {
                        var54 = var52 - var54;
                     }

                     short var53;
                     if (var52 > 0) {
                        if (var17.Oa) {
                           var53 = 7010;
                        } else {
                           var53 = 7008;
                        }
                     } else if (var17.Oa) {
                        var53 = 7011;
                     } else {
                        var53 = 7009;
                     }

                     var27.append(sm0_0.Bx(var53, new String[]{sm0_0.c0(var39.bt), String.valueOf(var54), String.valueOf(var17.ei0)}));
                  }

                  String var18;
                  if (!(var18 = var27.toString()).isEmpty()) {
                     var6.append("\n\n");
                     var6.append(var18);
                  }

                  HashMap var66 = var0.l2;
                  StringBuilder var19;
                  var19 = new StringBuilder();

                   for (Object entryObject : var66.entrySet()) {
                      Entry var40 = (Entry)entryObject;
                     if (var19.length() > 0) {
                        var19.append("\n");
                     }

                     switch (U1.EJ[((gw0_0)var40.getKey()).f50]) {
                        case 1:
                           var19.append(sm0_0.Bx(7008, new String[]{sm0_0.c0(110356), fp0_0.uD(new StringBuilder(), ((bj0_2)var40.getValue()).Cw0, "")}));
                           break;
                        case 2:
                           var19.append(sm0_0.Bx(7008, new String[]{sm0_0.c0(110472), fp0_0.uD(new StringBuilder(), ((bj0_2)var40.getValue()).Cw0, "")}));
                           break;
                        case 3:
                           var19.append(sm0_0.Bx(7008, new String[]{sm0_0.c0(110433), fp0_0.uD(new StringBuilder(), ((bj0_2)var40.getValue()).Cw0, "")}));
                           break;
                        case 4:
                           var19.append(sm0_0.Bx(7008, new String[]{sm0_0.c0(110478), fp0_0.uD(new StringBuilder(), ((bj0_2)var40.getValue()).Cw0, "")}));
                           break;
                        case 5:
                           var19.append(sm0_0.c0(111063));
                           break;
                        case 6:
                           var19.append(sm0_0.c0(111064));
                     }
                  }

                  if (var0.O00 != d70_0.Do) {
                     if (var19.length() > 0) {
                        var19.append("\n");
                     }

                     String var29;
                     switch (U1.IB0[var0.O00.Mf]) {
                        case 1:
                           var29 = sm0_0.c0(200565);
                           break;
                        case 2:
                        case 3:
                           var29 = sm0_0.c0(200566);
                           break;
                        case 4:
                           var29 = sm0_0.c0(200567);
                           break;
                        case 5:
                           var29 = sm0_0.c0(200569);
                           break;
                        case 6:
                           var29 = sm0_0.c0(200568);
                           break;
                        case 7:
                           var29 = sm0_0.c0(200571);
                           break;
                        case 8:
                           var29 = sm0_0.c0(200570);
                           break;
                        default:
                           var29 = "";
                     }

                     var19.append(sm0_0.Bx(7009, new String[]{sm0_0.wa0(200564, var29), fp0_0.uD(new StringBuilder(), var0.Xe0, "")}));
                  }

                  String var20;
                  if (!(var20 = var19.toString()).isEmpty()) {
                     var6.append("\n\n");
                     var6.append(var20);
                  }
               }

               Oy0 var11;
               if ((var11 = var0.xy0) != null && var13.U.isEmpty() ^ true) {
                  Iterator var14 = Collections.unmodifiableSet(var13.U.entrySet()).iterator();

                  while (var14.hasNext()) {
                     Entry var21;
                     Entry var67 = var21 = (Entry)var14.next();
                     var6.append('\n');
                     short[] var30 = (short[])var67.getValue();
                     int var41;
                     if ((var41 = U1.mk[var11.qx0]) != 1) {
                        if (var41 != 2) {
                           if (var41 == 3) {
                              if (var30[0] == var30[1]) {
                                 String[] var42;
                                 String[] var68 = var42 = new String[2];
                                 var42[0] = ((gc_2)var21.getKey()).toString();
                                 var68[1] = Short.toString(var30[0]);
                                 var6.append(sm0_0.Bx(5242, var42));
                              } else {
                                 String[] var43;
                                 String[] var69 = var43 = new String[3];
                                 var43[0] = ((gc_2)var21.getKey()).toString();
                                 var43[1] = Short.toString(var30[0]);
                                 var69[2] = Short.toString(var30[1]);
                                 var6.append(sm0_0.Bx(5243, var43));
                              }
                           }
                        } else {
                           String[] var44;
                           String[] var70 = var44 = new String[2];
                           var44[0] = ((gc_2)var21.getKey()).toString();
                           var70[1] = Short.toString(var30[0]);
                           var6.append(sm0_0.Bx(5241, var44));
                        }
                     } else if (var30[0] == var30[1]) {
                        String[] var45;
                        String[] var71 = var45 = new String[2];
                        var45[0] = ((gc_2)var21.getKey()).toString();
                        var71[1] = Short.toString(var30[0]);
                        var6.append(sm0_0.Bx(5240, var45));
                     } else {
                        String[] var46;
                        String[] var72 = var46 = new String[3];
                        var46[0] = ((gc_2)var21.getKey()).toString();
                        var46[1] = Short.toString(var30[0]);
                        var72[2] = Short.toString(var30[1]);
                        var6.append(sm0_0.Bx(5244, var46));
                     }
                  }
               }
            }

            return var6.toString();
         }
      }

      return "";
   }

   public static String V80(yi0_1 var0) {
      StringBuilder var1;
      var1 = new StringBuilder();
      byte var2 = var0.Md;
      short var3 = var0.N0;
      if (var0.Md == 1) {
         var2 = var0.gR;
         byte var4 = var0.vF;
         String var5 = sm0_0.c0(5615);
         String[] var6;
         String[] var10004 = var6 = new String[2];
         var6[0] = var5;
         var10004[1] = sm0_0.c0(var3 + 150000);
         var1.append(sm0_0.Bx(5583, var6));
         var1.append("\n");
         var1.append(sm0_0.c0(5584));
         if (var0.Hw0) {
            var1.append("\n • ");
            var1.append(sm0_0.c0(5585));
         }

         if (var0.yB) {
            var1.append("\n • ");
            var1.append(sm0_0.c0(8100));
         }

         if (var0.b50 > 0) {
            var1.append("\n • ");
            var1.append(sm0_0.wa0(5686, Integer.toString(var0.b50)));
         }

         if (var2 > 0) {
            var1.append("\n • ");
            var1.append(sm0_0.wa0(9110, Integer.toString(var2)));
            if (var2 < 6) {
               var1.append(" + ");
               String[] var7;
               String[] var10001 = var7 = new String[2];
               var7[0] = Integer.toString(6 - var2);
               var10001[1] = Integer.toString(var4);
               var1.append(sm0_0.Bx(5587, var7));
            }
         } else {
            var1.append("\n • ");
            String[] var8;
            String[] var10 = var8 = new String[2];
            var8[0] = "6";
            var10[1] = Integer.toString(var4);
            var1.append(sm0_0.Bx(5587, var8));
         }
      } else if (var2 == 2) {
         var1.append(NumberFormat.getInstance().format(var0.TB0));
         var1.append(" ");
         var1.append(sm0_0.c0(121));
      }

      return var1.toString().trim();
   }

   public static String FI0(jr0_0 var0, short var1, int var2) {
      short var3 = var0.P50;
      boolean var4 = var0.Z40;
      boolean var5 = var0.LPt3;
      boolean var6 = var0.coM5;
      boolean var7 = var0.Dz0;
      byte var8 = var0.bL;
      byte var9 = var0.oH0;
      byte var10 = var0.Hf;
      int var11 = var0.ev0;
      int var12 = var0.re0;
      int var13 = var0.oM;
      short var14 = var0.nC0;
      short var15 = var0.NX;
      byte var16 = var0.u3;
      if (var0.P50 <= 0) {
         StringBuilder var18;
         var18 = new StringBuilder();
         if (var0.prn()) {
            var18.append(sm0_0.c0(5584));
            var18.append("\n");
         }

         if (var16 > 0 && var11 < 1 && var12 < 1) {
            var18.append(" • ");
            if (var16 == 1) {
               String[] var23;
               String[] var25 = var23 = new String[2];
               var25[0] = NumberFormat.getInstance().format(var2);
               var25[1] = NumberFormat.getInstance().format(var2 * var1);
               var18.append(sm0_0.Bx(5590, var23));
            } else if (var16 == 2) {
               String[] var24;
               String[] var26 = var24 = new String[2];
               var26[0] = NumberFormat.getInstance().format(var2);
               var26[1] = NumberFormat.getInstance().format(var2 * var1);
               var18.append(sm0_0.Bx(5591, var24));
            }
         }

         if (var11 > 0) {
            var18.append(" • $");
            var18.append(NumberFormat.getInstance().format(var11));
         }

         if (var13 > 0) {
            if (var18.length() > 0) {
               var18.append("\n");
            }

            var18.append(" • ");
            var18.append(NumberFormat.getInstance().format(var13));
            var18.append(" ");
            var18.append(sm0_0.c0(3002));
         }

         if (var12 > 0) {
            if (var18.length() > 0) {
               var18.append("\n");
            }

            var18.append(" • ");
            var18.append(NumberFormat.getInstance().format(var12));
            var18.append(" ");
            var18.append(sm0_0.c0(121));
         }

         if (var14 > 0) {
            if (var18.length() > 0) {
               var18.append("\n");
            }

            var18.append(" • ");
            var18.append(NumberFormat.getInstance().format(var15));
            var18.append("x ");
            var18.append(sm0_0.c0(gu0.l2.lPT6(var14).Nl));
         }

         return var18.toString();
      } else {
         StringBuilder var17;
         var17 = new StringBuilder();
         String var19 = "";
         if (var4 && var5) {
            var19 = sm0_0.c0(5621);
         } else if (var4) {
            var19 = sm0_0.c0(5614);
         } else if (var5) {
            var19 = sm0_0.c0(5615);
         }

         String[] var22;
         String[] var10002 = var22 = new String[2];
         var22[0] = var19;
         var10002[1] = sm0_0.c0(var3 + 150000);
         var17.append(sm0_0.Bx(5583, var22));
         if (var6 || var8 > 0 || var9 > 0) {
            var17.append("\n");
            var17.append(sm0_0.c0(5584));
            if (var6) {
               var17.append("\n • ");
               var17.append(sm0_0.c0(5585));
            }

            if (var7) {
               var17.append("\n • ");
               var17.append(sm0_0.c0(8100));
            }

            if (var8 > 0) {
               var17.append("\n • ");
               var17.append(sm0_0.wa0(5586, Integer.toString(var8)));
            }

            if (var9 > 0) {
               var17.append("\n • ");
               var17.append(sm0_0.wa0(9110, Integer.toString(var9)));
               if (var9 < 6) {
                  var17.append(" + ");
                  String[] var20;
                  String[] var10001 = var20 = new String[2];
                  var20[0] = Integer.toString(6 - var9);
                  var10001[1] = Integer.toString(var10);
                  var17.append(sm0_0.Bx(5587, var20));
               }
            } else {
               var17.append("\n • ");
               String[] var21;
               String[] var27 = var21 = new String[2];
               var21[0] = "6";
               var27[1] = Integer.toString(var10);
               var17.append(sm0_0.Bx(5587, var21));
            }
         }

         return var17.toString().trim();
      }
   }

   public static String jt(qr_1 var0) {
      StringBuilder var1;
      var1 = new StringBuilder();
      byte var2;
      byte var10000 = var2 = var0.Ee0;
      short var9 = var0.gl0;
      short var3 = var0.zn;
      short var4 = var0.MS;
      short var5 = var0.Hz0;
      GV var6 = var0.Hu0;
      N2 var7 = var0.Cx0;
      String var8 = "";
      if (var10000 != 0) {
         if (var2 != 1) {
            if (var2 == 2) {
               StringBuilder var14;
               var14 = new StringBuilder();
               var8 = g7_0.Zx(5637, var14, "\n\n");
            }
         } else {
            StringBuilder var15;
            var15 = new StringBuilder();
            var8 = g7_0.Zx(5632, var15, "\n\n");
         }
      } else {
         StringBuilder var16;
         var16 = new StringBuilder();
         var8 = g7_0.Zx(5631, var16, "\n\n");
      }

      cq_0 var10;
      if (var9 > 0 && (var10 = (cq_0)mp_1.vf0().k2.get(var9)) != null) {
         var1.append(var10.Ay(false));
      }

      vk0_1 var11;
      if (var3 > 0 && (var11 = (vk0_1)ec0_2.Sx().f4.f5(var3)) != null) {
         if (var1.length() > 0) {
            var1.append(" + ");
         }

         var1.append(sm0_0.c0(var11.bt));
      }

      if (var4 > 0) {
         int var12 = var4 + 210000;
         if (sm0_0.cU.l90(var12)) {
            if (var1.length() > 0) {
               var1.append(" + ");
            }

            var1.append(sm0_0.c0(var12));
         }
      }

      if (var5 > 0) {
         mc0_1 var13 = gu0.l2.lPT6(var5);
         if (var1.length() > 0) {
            var1.append(" + ");
         }

         var1.append(sm0_0.c0(var13.Nl));
      }

      if (var6 != null) {
         if (var1.length() > 0) {
            var1.append(" + ");
         }

         var1.append(sm0_0.c0(var6.pN));
      }

      if (var7 != null) {
         if (var1.length() > 0) {
            var1.append(" + ");
         }

         var1.append(sm0_0.c0(var7.R5));
      }

      var1.insert(0, var8);
      return var1.toString();
   }

   public static String GK0(rz_0 var0) {
      if (var0 == null) {
         return "";
      } else {
         return var0.j10 == null ? sm0_0.c0(1806) : "+10% " + var0.j10 + "\n-10% " + var0.Hv;
      }
   }

   public static String y5(gc_2[] var0) {
      if (var0.length < 1) {
         return "";
      } else {
         return var0.length == 1 ? var0[0].toString() : sm0_0.Bx(var0.length - -200456, Stream.of(var0).map(gc_2::toString).toArray(lb0_2::Ar0));
      }
   }

   public static String Fy0(QL var0) {
      int var1 = 920000;
      var1 = var0.D7 + var1;
      if (sm0_0.cU.l90(var1)) {
         return sm0_0.c0(var1);
      }

      String var10000 = "";
      for (Object entry : gu0.l2.Pd0.values()) {
         mc0_1 item = (mc0_1)entry;
         if (UU(var0, item)) {
            var10000 = ur(item);
            break;
         }
      }
      sm0_0.kE0(var1, var10000);
      return var10000;
   }

   public static String CU(QL var0, boolean var1) {
      StringBuilder var2;
      var2 = new StringBuilder();
      QL var3 = QL.N8;
      String var4 = sm0_0.c0(var0 == QL.N8 && var1 ? 11199 : var0.D7 + 11000);
      var2.append(var4);
      var2.append("\n\n");
      if (!(var4 = Fy0(var0)).isEmpty()) {
         var2.append(var4);
         var2.append("\n");
      }

      String var5 = sm0_0.c0(var0 == var3 && var1 ? 11399 : var0.D7 + 11200);
      var2.append(var5);
      return var2.toString();
   }

   public static boolean UU(QL var0, mc0_1 var1) {
      return var1.g0 == var0;
   }

   public static String ur(mc0_1 var0) {
      return cM0(var0).toString();
   }

   public static String[] Ar0(int var0) {
      return new String[var0];
   }

   public static cq_0[] cOM2(int var0) {
      return new cq_0[var0];
   }

   static {
      (mR = new DecimalFormat()).setMaximumFractionDigits(2);
   }

   public static String FP(VU var0) {
      return Ky(var0, false, false, false);
   }

   public static String JD(vk0_1 var0, CE var1, mc0_1 var2, int var3) {
      if (var0 == null) {
         return "";
      }

      StringBuilder var4;
      var4 = new StringBuilder();
      var4.append(hx_1.LPt2(var3, sm0_0.c0(var0.D8).replace("|br|", "\n")));
      var4.append("\n\n");
      var4.append(sm0_0.c0(1850)).append(" ");
      switch (var0.hC0) {
         case 363:
            var4.append("80 - 100");
            break;
         case 374:
            var4.append("10 - 130");
            break;
         case 484:
         case 535:
            var4.append("40 - 120");
            break;
         case 518:
         case 519:
         case 520:
            String var25;
            if (var0.X00 == 0) {
               var25 = "---";
            } else {
               var25 = fp0_0.uD(new StringBuilder(), var0.X00, " - 150");
            }

            var4.append(var25);
            break;
         default:
            short var5 = var0.X00;
            if (var0.X00 == 0) {
               var4.append("---");
            } else if (var5 == 1) {
               var4.append(sm0_0.c0(1867));
            } else {
               var4.append(var5);
            }
      }

      var4.append("\n");
      var4.append(sm0_0.c0(1851)).append(" ");
      short var26 = var0.mt0;
      String var27;
      if (var0.mt0 != 0 && var26 != 101) {
         var27 = Integer.toString(var26);
      } else {
         var27 = "---";
      }

      var4.append(var27);
      var4.append("\n");
      var4.append(sm0_0.c0(1852)).append(" ");
      Serializable var28;
      if (var0.hC0 == 165) {
         var28 = "∞";
      } else {
         var28 = var0.Gn(false);
      }

      var4.append(var28);
      var4.append("\n");
      var4.append(sm0_0.c0(1861)).append(" ");
      var26 = var0.Tp;
      if (var0.Tp == 0) {
         var4.append(sm0_0.c0(1862));
      } else {
         if (var26 > 0) {
            var4.append("+");
         }

         var4.append(var0.Tp);
      }

      var4.append("\n");
      var4.append(sm0_0.c0(3300)).append(" ");
      if (var0.g5 == 0 && !var0.Ro(2048)) {
         var4.append(sm0_0.c0(3349));
      } else {
         var4.append(sm0_0.c0(var0.g5 + 3350));
      }

      label227: {
         var4.append("\n");
         var26 = var0.hC0;
         String var46;
         int var10001;
         String var10002;
         boolean var10003;
         if (var0.hC0 != 518 && var26 != 519 && var26 != 520) {
            if (var1 == null) {
               break label227;
            }

            if (var2 != null) {
               if (var26 == 374) {
                  var26 = var2.pW;
                  if (var2.pW <= 0 && !var2.transient$) {
                     var4.append("\n");
                     var4.append(sm0_0.wa0(3517, sm0_0.c0(var2.Nl)));
                     var4.append("\n");
                  } else {
                     if (var26 < 1) {
                        var26 = 10;
                     }

                     var4.append("\n");
                     var4.append(sm0_0.wa0(3515, sm0_0.c0(var2.Nl)));
                     var4.append("\n▶ ");
                     var4.append(sm0_0.c0(1850));
                     var4.append(" ");
                     var4.append(Integer.toString(var26));
                     if (var2.transient$) {
                        var4.append("\n▶ ");
                        var4.append(sm0_0.wa0(3516, sm0_0.c0(var2.Nl)));
                     }

                     switch (X4.gA0(var2.Z8)) {
                        case 5214:
                           var4.append("\n▶ ");
                           var4.append(sm0_0.c0(3514));
                           break;
                        case 5219:
                           var4.append("\n▶ ");
                           var4.append(sm0_0.c0(3513));
                           break;
                        case 5221:
                        case 5327:
                           var4.append("\n▶ ");
                           var4.append(sm0_0.wa0(3500, "100"));
                           break;
                        case 5236:
                           var4.append("\n▶ ");
                           var4.append(sm0_0.wa0(3502, "100"));
                           break;
                        case 5245:
                           var4.append("\n▶ ");
                           var4.append(sm0_0.wa0(3504, "100"));
                           break;
                        case 5272:
                           var4.append("\n▶ ");
                           var4.append(sm0_0.wa0(3505, "100"));
                           break;
                        case 5273:
                           var4.append("\n▶ ");
                           var4.append(sm0_0.wa0(3501, "100"));
                     }

                     var4.append("\n");
                  }
               } else if (var26 == 363) {
                  if (var2.wa != i40_0.Gc && var2.PP > 0) {
                     var4.append("\n");
                     var4.append(sm0_0.wa0(3515, sm0_0.c0(var2.Nl)));
                     var4.append("\n▶ ");
                     var4.append(sm0_0.c0(1850));
                     var4.append(" ");
                     var4.append(Integer.toString(var2.PP));
                     var4.append("\n▶ ");
                     var4.append(sm0_0.wa0(3516, sm0_0.c0(var2.Nl)));
                     var4.append("\n▶ ");
                     var4.append(sm0_0.wa0(3518, var2.wa.BT()));
                  } else {
                     var4.append("\n");
                     var4.append(sm0_0.wa0(3517, sm0_0.c0(var2.Nl)));
                  }
               }
            }

            mp_1 var20 = mp_1.vf0();
            cq_0 var21 = (cq_0)var20.k2.get(var1.Yb0);
            mp_1 var47 = mp_1.vf0();
            var26 = (short)(var21.iv0 + var1.ZF0 - 1);
            cq_0 var33;
            if ((var33 = (cq_0)var47.k2.get(var26)) != null) {
               var21 = var33;
            }

            if (var0.X00 <= 0) {
               break label227;
            }

            i40_0 var13 = var0.oG(var1, null);
            byte var34;
            if (var21.OE0(var34 = var1.ZF0) != var13 && var21.F70(var34) != var13) {
               break label227;
            }

            var4.append("\n▶ ");
            var46 = sm0_0.c0(3511);
            var10001 = var3;
            var10002 = "\n   ";
            var10003 = true;
         } else {
            var4.append("\n▶ ");
            var4.append(hx_1.oO(sm0_0.c0(200432), var3, "\n   ", true, 0));
            switch (var0.hC0) {
               case 518:
                  StringBuilder var44 = new StringBuilder("\n  •");
                  StringBuilder var11;
                  var11 = new StringBuilder();
                  var4.append(var44.append(hx_1.LPt2(var3, ig_0.u9(110519, var11, ": ").append(sm0_0.c0(200435)).toString())).toString());
                  StringBuilder var45 = new StringBuilder("\n  •");
                  StringBuilder var12;
                  var12 = new StringBuilder();
                  var4.append(var45.append(hx_1.LPt2(var3, ig_0.u9(110520, var12, ": ").append(sm0_0.c0(200433)).toString())).toString());
                  break;
               case 519:
                  StringBuilder var42 = new StringBuilder("\n  •");
                  StringBuilder var9;
                  var9 = new StringBuilder();
                  var4.append(var42.append(hx_1.LPt2(var3, ig_0.u9(110518, var9, ": ").append(sm0_0.c0(200435)).toString())).toString());
                  StringBuilder var43 = new StringBuilder("\n  •");
                  StringBuilder var10;
                  var10 = new StringBuilder();
                  var4.append(var43.append(hx_1.LPt2(var3, ig_0.u9(110520, var10, ": ").append(sm0_0.c0(200434)).toString())).toString());
                  break;
               case 520:
                  StringBuilder var10000 = new StringBuilder("\n  •");
                  StringBuilder var7;
                  var7 = new StringBuilder();
                  var4.append(var10000.append(hx_1.LPt2(var3, ig_0.u9(110519, var7, ": ").append(sm0_0.c0(200434)).toString())).toString());
                  StringBuilder var41 = new StringBuilder("\n  •");
                  StringBuilder var8;
                  var8 = new StringBuilder();
                  var4.append(var41.append(hx_1.LPt2(var3, ig_0.u9(110518, var8, ": ").append(sm0_0.c0(200433)).toString())).toString());
            }

            var4.append("\n▶ ");
            var4.append(hx_1.oO(sm0_0.c0(3512), var3, "\n   ", true, 0));
            var4.append("\n▶ ");
            var46 = sm0_0.c0(3408);
            var10001 = var3;
            var10002 = "\n   ";
            var10003 = true;
         }

         var4.append(hx_1.oO(var46, var10001, var10002, var10003, 0));
      }

      byte var14 = var0.l10;
      if (var0.l10 > 0) {
         if (var14 >= 3) {
            var4.append("\n▶ ");
            var4.append(sm0_0.wa0(3520, "100"));
         } else {
            var4.append("\n▶ ");
            var4.append(sm0_0.wa0(3520, mR.format(nj_0.Xq[var14] / 100.0)));
            var4.append("\n▶ ");
            var4.append(sm0_0.wa0(3519, "+" + var14));
         }
      }

      byte var15 = var0.qh0;
      if (var0.qh0 > 0) {
         var4.append("\n▶ ");
         byte var22 = var0.zy0;
         String var48;
         int var56;
         Object var58;
         boolean var60;
         if (!var0.Gk && var0.g5 != 7) {
            if (var22 > 0) {
               var48 = sm0_0.Bx(3546, new String[]{Byte.toString(var15), y5(var0.WK), Byte.toString(var22)});
               var56 = var3;
               var58 = null;
               var60 = true;
            } else {
               var48 = sm0_0.Bx(3548, new String[]{Byte.toString(var15), y5(var0.WK), Byte.toString((byte)(var22 * -1))});
               var56 = var3;
               var58 = null;
               var60 = true;
            }
         } else if (var22 > 0) {
            var48 = sm0_0.Bx(3545, new String[]{Byte.toString(var15), y5(var0.WK), Byte.toString(var22)});
            var56 = var3;
            var58 = null;
            var60 = true;
         } else {
            var48 = sm0_0.Bx(3547, new String[]{Byte.toString(var15), y5(var0.WK), Byte.toString((byte)(var22 * -1))});
            var56 = var3;
            var58 = null;
            var60 = true;
         }

         var4.append(hx_1.oO(var48, var56, (String)var58, var60, 0));
         gc_2[] var23 = var0.tD0;
         if (var0.tD0.length > 0) {
            var4.append("\n▶ ");
            byte var35 = var0.yE;
            if (var0.g5 == 7) {
               if (var35 > 0) {
                  String[] var6;
                  String[] var49 = var6 = new String[3];
                  var6[0] = Byte.toString(var15);
                  var6[1] = y5(var23);
                  var49[2] = Byte.toString(var35);
                  var48 = sm0_0.Bx(3545, var6);
                  var56 = var3;
                  var58 = null;
                  var60 = true;
               } else {
                  String[] var37;
                  String[] var51 = var37 = new String[3];
                  var37[0] = Byte.toString(var15);
                  var37[1] = y5(var23);
                  var51[2] = Byte.toString((byte)(var35 * -1));
                  var48 = sm0_0.Bx(3547, var37);
                  var56 = var3;
                  var58 = null;
                  var60 = true;
               }
            } else if (var35 > 0) {
               String[] var38;
               String[] var52 = var38 = new String[3];
               var38[0] = Byte.toString(var15);
               var38[1] = y5(var23);
               var52[2] = Byte.toString(var35);
               var48 = sm0_0.Bx(3546, var38);
               var56 = var3;
               var58 = null;
               var60 = true;
            } else {
               String[] var39;
               String[] var53 = var39 = new String[3];
               var39[0] = Byte.toString(var15);
               var39[1] = y5(var23);
               var53[2] = Byte.toString((byte)(var35 * -1));
               var48 = sm0_0.Bx(3548, var39);
               var56 = var3;
               var58 = null;
               var60 = true;
            }

            var4.append(hx_1.oO(var48, var56, (String)var58, var60, 0));
         }
      }

      od0_1[] var16 = var0.V6;
      int var24 = var0.V6.length;

      for (int var36 = 0; var36 < var24; var36++) {
         od0_1 var40;
         od0_1 var54 = var40 = var16[var36];
         var4.append("\n▶ ");
         var4.append(hx_1.oO(g6_0.dG(var54.Im0, var40.kc0), var3, null, true, 0));
      }

      yt_1 var17 = tw0_0.e60;
      E90 var18;
      if (!tw0_0.kz0() && var17 != null && (var18 = var17.jB0) != null && var18.ba0.uS == 1) {
         if (tw0_0.LD0.he0 != null) {
            a10_0 var19 = tw0_0.PK0;
            if (tw0_0.PK0 == null || !var19.a40) {
               return var4.toString();
            }
         }

         var4.append("\n--------------------\n");
         var4.append(Sm(var0));
      }

      return var4.toString();
   }

   public static String OF(mc0_1 var0) {
      return Sp0(var0, false, false);
   }
}
