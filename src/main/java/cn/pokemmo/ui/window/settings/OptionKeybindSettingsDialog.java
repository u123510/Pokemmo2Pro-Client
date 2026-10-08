package cn.pokemmo.ui.window.settings;

import f.*;
import java.util.ArrayList;

public class OptionKeybindSettingsDialog extends G40 {
   public final MO[] B30;
   public final E90 Xf0;
   public boolean to0 = false;
   public boolean bD = false;
   public boolean Pn = false;
   public final byte pe0;
   public final zv_2[] QC0;
   public final byte[] UC0;
   public final byte[] CY;
   public final boolean R80;

   public OptionKeybindSettingsDialog(MO var1, E90 var2, boolean var3) {
      MO[] var10000 = this.B30 = tw0_0.e60.YC(var1);
      this.Xf0 = var2;
      this.QC0 = new zv_2[var10000.length];
      this.UC0 = new byte[var10000.length];
      this.CY = new byte[var10000.length];

      MO[] var4;
      for(int var5 = 0; var5 < (var4 = this.B30).length; ++var5) {
         this.QC0[var5] = var4[var5].g90().Xr();
         this.UC0[var5] = this.B30[var5].zA();
         this.CY[var5] = this.B30[var5].Fo().Q();
      }

      this.R80 = var3;
      this.Um();
      this.pe0 = tx_1.Zk(((bi0_1)var2).try$(), ((bi0_1)var2).WR(), this.B30[0].try$(), this.B30[0].WR());
      this.gb0();
   }

   public final boolean Ob0() {
      if (this.to0 || this.bD) {
         return true;
      }
      if (!this.R80) {
         tw0_0.e60.jB0.il0.qc0(this.pe0);
      }
      if (this.Pn) {
         for (int index = 0; index < this.B30.length; index++) {
            if (!this.B30[index].il0.D() || !this.B30[index].il0.BH0.isEmpty()) {
               return false;
            }
         }
         this.to0 = true;
      }
      return false;
   }

   public final void jA0(byte var1, CH0 var2) {
      boolean var3 = false;

      MO[] var5;
      for(int var4 = 0; var4 < (var5 = this.B30).length; ++var4) {
         if (var5[var4].pu.equals(var2)) {
            var3 = true;
         }
      }

      if (var3) {
         this.Pn = true;
         if (var1 != 1) {
            this.bD = true;
            tw0_0.RE0.Eh((byte)0, (short)0, true, false);

             MO[] var9 = this.B30;
             for(int var7 = 0; var7 < var9.length; ++var7) {
               var9[var7].il0.p6(this.QC0[var7]);
               MO var10001 = this.B30[var7];
               var10001.Nf0 = this.UC0[var7];
                var10001.py = System.currentTimeMillis() + 200L;
               this.B30[var7].gB0(this.CY[var7]);
            }
         }

         MO[] var8;
         if (var1 == 2) {
            for(int var6 = 0; var6 < (var8 = this.B30).length; ++var6) {
               tw0_0.e60.qu0(var8[var6].DN);
            }
         }

      }
   }

   public final byte tQ() {
      return this.pe0;
   }

   public final void gb0() {
      byte var1 = tw0_0.e60.Com4;
      gn_2 var3;
      if ((var3 = wn_1.pn.vi(var1, this.B30[0].DN)) != null) {
         short var10000;
         label147: {
            label146: {
               label145: {
                  label144: {
                     label143: {
                        label142: {
                           label141: {
                              label140: {
                                 label139: {
                                    gn_2 var10001 = var3;
                                    short var4 = (short)var3.VK0();
                                    short var2 = var10001.A5();
                                    label136:
                                    switch (var1) {
                                       case 0:
                                          switch (var4) {
                                             case 57:
                                             case 58:
                                             case 60:
                                             case 61:
                                             case 65:
                                             case 66:
                                             case 68:
                                             case 69:
                                             case 70:
                                             case 71:
                                             case 72:
                                             case 75:
                                             case 76:
                                             case 77:
                                             case 78:
                                             case 79:
                                             case 80:
                                             case 86:
                                             case 88:
                                             case 93:
                                             case 95:
                                             case 96:
                                             case 99:
                                             case 102:
                                             case 104:
                                                var10000 = 285;
                                                break label147;
                                             case 59:
                                             case 62:
                                             case 73:
                                             case 74:
                                             case 92:
                                             case 94:
                                             case 100:
                                             case 101:
                                             case 103:
                                             case 105:
                                             case 106:
                                                var10000 = 284;
                                                break label147;
                                             case 63:
                                             case 64:
                                             case 67:
                                             case 82:
                                             case 85:
                                             case 91:
                                                var10000 = 283;
                                                break label147;
                                             case 81:
                                             case 89:
                                                var10000 = 315;
                                                break label147;
                                             case 83:
                                             case 84:
                                             case 87:
                                             case 90:
                                             case 97:
                                             case 98:
                                             default:
                                                var10000 = 282;
                                                break label147;
                                          }
                                       case 1:
                                          label84: {
                                             switch (var4) {
                                                case 2:
                                                case 16:
                                                case 25:
                                                case 39:
                                                   var10000 = 451;
                                                   break label147;
                                                case 3:
                                                case 9:
                                                case 11:
                                                case 49:
                                                case 53:
                                                   var10000 = 441;
                                                   break label147;
                                                case 4:
                                                   if (var2 != 32) {
                                                      break label84;
                                                   }
                                                   break;
                                                case 5:
                                                case 6:
                                                case 48:
                                                case 52:
                                                   var10000 = 417;
                                                   break label147;
                                                case 7:
                                                case 14:
                                                case 23:
                                                case 28:
                                                case 42:
                                                   var10000 = 423;
                                                   break label147;
                                                case 8:
                                                case 45:
                                                case 57:
                                                   var10000 = 385;
                                                   break label147;
                                                case 10:
                                                case 12:
                                                case 24:
                                                case 29:
                                                case 41:
                                                case 43:
                                                case 56:
                                                   var10000 = 416;
                                                   break label147;
                                                case 13:
                                                   var10000 = 419;
                                                   break label147;
                                                case 17:
                                                   var10000 = 453;
                                                   break label147;
                                                case 18:
                                                case 19:
                                                case 27:
                                                case 55:
                                                   break;
                                                case 22:
                                                case 30:
                                                   var10000 = 397;
                                                   break label147;
                                                case 26:
                                                case 32:
                                                case 35:
                                                case 37:
                                                case 47:
                                                case 50:
                                                case 51:
                                                default:
                                                   break label84;
                                                case 31:
                                                   var10000 = 450;
                                                   break label147;
                                                case 33:
                                                   if (var2 != 49) {
                                                      break label84;
                                                   }
                                                   break;
                                                case 34:
                                                case 36:
                                                case 46:
                                                   var10000 = 449;
                                                   break label147;
                                                case 38:
                                                   var10000 = 454;
                                                   break label147;
                                                case 40:
                                                   if (var2 == 58 || var2 == 60) {
                                                      break label84;
                                                   }
                                                case 15:
                                                case 20:
                                                case 21:
                                                case 44:
                                                case 54:
                                                   var10000 = 407;
                                                   break label147;
                                             }

                                             var10000 = 379;
                                             break label147;
                                          }

                                          var10000 = 380;
                                          break label147;
                                       case 2:
                                          switch (var4) {
                                             case 3:
                                             case 5:
                                             case 42:
                                                break label142;
                                             case 4:
                                             case 10:
                                             case 11:
                                             case 12:
                                             case 17:
                                             case 19:
                                             case 20:
                                             case 21:
                                             case 22:
                                             case 23:
                                             case 37:
                                             case 38:
                                             case 40:
                                             case 41:
                                             case 47:
                                             case 54:
                                             case 55:
                                             case 56:
                                             case 78:
                                             case 79:
                                             case 80:
                                             case 81:
                                             case 82:
                                             case 88:
                                             case 89:
                                             default:
                                                break label144;
                                             case 6:
                                             case 7:
                                             case 27:
                                             case 28:
                                             case 29:
                                             case 45:
                                             case 53:
                                             case 73:
                                             case 74:
                                                var10000 = 1124;
                                                break label147;
                                             case 8:
                                             case 9:
                                             case 26:
                                             case 34:
                                             case 43:
                                             case 44:
                                             case 58:
                                             case 61:
                                             case 62:
                                             case 66:
                                             case 67:
                                             case 83:
                                             case 86:
                                                var10000 = 1125;
                                                break label147;
                                             case 13:
                                             case 18:
                                             case 48:
                                             case 65:
                                             case 85:
                                                var10000 = 1119;
                                                break label147;
                                             case 14:
                                             case 15:
                                             case 16:
                                                var10000 = 1116;
                                                break label147;
                                             case 24:
                                             case 25:
                                             case 49:
                                             case 50:
                                             case 70:
                                             case 71:
                                                var10000 = 1117;
                                                break label147;
                                             case 30:
                                             case 32:
                                             case 59:
                                             case 60:
                                             case 68:
                                             case 69:
                                                var10000 = 1123;
                                                break label147;
                                             case 31:
                                             case 57:
                                             case 63:
                                                var10000 = 1118;
                                                break label147;
                                             case 33:
                                             case 75:
                                             case 76:
                                             case 87:
                                                var10000 = 1126;
                                                break label147;
                                             case 35:
                                             case 36:
                                             case 51:
                                             case 64:
                                             case 72:
                                                var10000 = 1121;
                                                break label147;
                                             case 39:
                                             case 77:
                                                var10000 = 1127;
                                                break label147;
                                             case 46:
                                             case 52:
                                                var10000 = 1122;
                                                break label147;
                                             case 84:
                                             case 90:
                                             case 91:
                                                var10000 = 1120;
                                                break label147;
                                          }
                                       case 3:
                                          switch (var4) {
                                             case 2:
                                             case 4:
                                             case 6:
                                             case 16:
                                             case 60:
                                                var10000 = 1100;
                                                break label147;
                                             case 3:
                                             case 5:
                                             case 61:
                                             case 85:
                                                break label141;
                                             case 7:
                                             case 17:
                                             case 36:
                                             case 43:
                                             case 62:
                                             case 63:
                                             case 64:
                                             case 74:
                                             case 75:
                                             case 76:
                                             case 77:
                                             case 78:
                                             case 79:
                                             case 80:
                                             case 86:
                                             case 90:
                                             case 91:
                                             case 92:
                                             case 93:
                                             case 94:
                                             case 95:
                                             case 96:
                                             case 97:
                                             default:
                                                var10000 = 1104;
                                                break label147;
                                             case 8:
                                             case 22:
                                             case 28:
                                             case 44:
                                             case 45:
                                                var10000 = 1101;
                                                break label147;
                                             case 9:
                                             case 18:
                                             case 48:
                                             case 70:
                                             case 71:
                                                var10000 = 1105;
                                                break label147;
                                             case 10:
                                             case 14:
                                             case 38:
                                             case 49:
                                             case 50:
                                             case 52:
                                             case 57:
                                                var10000 = 1102;
                                                break label147;
                                             case 11:
                                             case 46:
                                                break label145;
                                             case 12:
                                             case 13:
                                             case 19:
                                             case 30:
                                             case 42:
                                             case 47:
                                             case 55:
                                             case 56:
                                                break label139;
                                             case 15:
                                             case 20:
                                             case 21:
                                             case 23:
                                             case 26:
                                             case 58:
                                             case 59:
                                             case 81:
                                             case 82:
                                             case 83:
                                             case 84:
                                             case 98:
                                                break label143;
                                             case 24:
                                             case 25:
                                             case 27:
                                             case 29:
                                             case 31:
                                             case 39:
                                             case 40:
                                             case 53:
                                             case 54:
                                                break label140;
                                             case 32:
                                             case 33:
                                             case 34:
                                             case 35:
                                             case 51:
                                                var10000 = 1106;
                                                break label147;
                                             case 37:
                                             case 41:
                                                break label146;
                                             case 65:
                                             case 66:
                                             case 67:
                                             case 68:
                                                break label136;
                                             case 69:
                                                break label144;
                                             case 72:
                                             case 73:
                                             case 87:
                                             case 88:
                                             case 89:
                                                var10000 = 1103;
                                                break label147;
                                          }
                                       case 4:
                                          switch (var4) {
                                             case 3:
                                             case 5:
                                             case 8:
                                                break label136;
                                             case 9:
                                             case 11:
                                             case 14:
                                             case 20:
                                             case 24:
                                             case 34:
                                             case 42:
                                             case 46:
                                             case 52:
                                             case 64:
                                             case 65:
                                             case 115:
                                                break label142;
                                             case 21:
                                             case 25:
                                             case 36:
                                             case 43:
                                             case 56:
                                             case 77:
                                             case 122:
                                                break label145;
                                             case 31:
                                             case 63:
                                             case 68:
                                             case 78:
                                                break label140;
                                             case 38:
                                             case 121:
                                                break label144;
                                             case 47:
                                                break label139;
                                             case 55:
                                             case 62:
                                             case 113:
                                             case 114:
                                             case 116:
                                             case 117:
                                             case 118:
                                                break label143;
                                             case 79:
                                             case 82:
                                                break label141;
                                             default:
                                                break label146;
                                          }
                                       default:
                                          var10000 = 0;
                                          break label147;
                                    }

                                    var10000 = 1113;
                                    break label147;
                                 }

                                 var10000 = 1111;
                                 break label147;
                              }

                              var10000 = 1109;
                              break label147;
                           }

                           var10000 = 1110;
                           break label147;
                        }

                        var10000 = 1115;
                        break label147;
                     }

                     var10000 = 1112;
                     break label147;
                  }

                  var10000 = 1114;
                  break label147;
               }

               var10000 = 1107;
               break label147;
            }

            var10000 = 1108;
         }

         short var5 = var10000;
         tw0_0.RE0.Eh(var1, var5, true, false);
      }

   }

   public final void Um() {
      ArrayList<nk_0> var1;
      var1 = new ArrayList<>();

      for(byte var2 = 0; var2 <= 3; ++var2) {
         var1.clear();
         var1.add(nk_0.Te0);
         if (this.B30[0].Aw(this.Xf0, var2, var1)) {
            break;
         }
      }

      MO[] var3;
      for(int var8 = 0; var8 < (var3 = this.B30).length; ++var8) {
         MO var9;
         MO var10000 = var9 = var3[var8];
         var10000.Nf0 = -1;
         if (var10000.F7.rh0) {
            E90 var4;
            if ((var4 = tw0_0.e60.jB0) != null) {
               short var5;
               zv_2 var6;
               short var7;
               zv_2 var11;
               if ((var5 = (var11 = var4.ba0).Lq0) > (var7 = (var6 = var9.ba0).Lq0)) {
                  var9.gB0((byte)9);
               } else if (var5 < var7) {
                  var9.gB0((byte)10);
               } else {
                  short var12;
                  if ((var12 = var11.B5) < (var5 = var6.B5)) {
                     var9.gB0((byte)7);
                  } else if (var12 > var5) {
                     var9.gB0((byte)8);
                  }
               }
            } else {
               var9.gB0((byte)0);
            }
         }

         for(nk_0 var13 : var1) {
            this.B30[var8].il0.LE(new nk_0[]{var13});
         }
      }

   }
}
