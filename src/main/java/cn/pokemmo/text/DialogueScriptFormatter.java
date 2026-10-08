package cn.pokemmo.text;

import f.*;
import cn.pokemmo.rom.nds.text.DpptTextBank;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class DialogueScriptFormatter extends xm_0 {
   public static final dl_1 FZ = Cq0.E1(c2_0.class);
   public final char[] Ae;

   public DialogueScriptFormatter(l50_0 var1, lpt6__2 var2, Ae var3) {
      super(var1, var2, var3);
      if ("zh".equals(var1.pG0())) {
         this.Ae = NE0.Fc;
      } else {
         this.Ae = NE0.lj0;
      }
   }

   public final synchronized void VJ0(int var1) {
      if (super.ul0[var1] == null) {
         ByteBuffer var2;
         short var3;
         int var10001 = var3 = (var2 = super.Kr0.GJ(var1).MH(false)).getShort();
         int var4 = var2.getShort() * 765 & 65535;
         short[] var5 = new short[4];
         int[] var6 = new int[var10001];
         int[] var7 = new int[var10001];
         super.ul0[var1] = new String[1][var3];
         int var8 = 0;

         while (var8 < var3) {
            var10001 = var8;
            int var10004 = var8;
            int var10006 = var4 * ++var8 & 65535;
            int var9 = var10006 | var10006 << 16;
            var6[var10004] = var2.getInt() ^ var9;
            var7[var10001] = var2.getInt() ^ var9;
         }

         StringBuilder var19;
         var19 = new StringBuilder();
         var8 = 0;

         while (var8 < var3) {
            int var21;
            int var10 = (var21 = var8 + 1) * 596947 & 65535;
            int var11;
            if (var2.limit() >= (var11 = var6[var8]) && var11 >= 0) {
               ((Buffer)var2).position(var11);
               var19.setLength(0);
               boolean var28 = false;

               label188:
               for (int var12 = 0; var12 < var7[var8]; var12++) {
                  if (var2.remaining() >= 2) {
                     short var13;
                     int var10000 = var13 = (short)(var2.getShort() ^ var10);
                     var10 = var10 + 18749 & 65535;
                     if (var10000 == -1) {
                        break;
                     }

                     switch (var13) {
                        case -8192:
                           if (var19.length() < 2 || var19.charAt(var19.length() - 2) != '\n' || var19.charAt(var19.length() - 1) != '\n') {
                              var19.append("\n");
                           }
                           break;
                        case -3840:
                           var28 = true;
                           break;
                        case -2:
                           var5[0] = 0;
                           var5[1] = 0;
                           var5[2] = 0;
                           var5[3] = 0;
                           short var23 = (short)(var2.getShort() & 65535 ^ var10);
                            var13 = (short)(var10 + 18749 & 65535);
                           var5[0] = var23;
                           byte var35;
                           if (super.D40) {
                              var35 = 3;
                           } else {
                              var35 = 4;
                           }

                           label155: {
                              if (var23 != -256 && var23 != -255) {
                                 switch (var23) {
                                    case 512:
                                    case 513:
                                    case 514:
                                    case 515:
                                    case 516:
                                       break;
                                    case 517:
                                    case 518:
                                       var35 = 1;
                                    default:
                                       break label155;
                                 }
                              }

                              var35 = 3;
                           }

                           var10 = 1;

                           while (var10 < var35) {
                              short var31 = (short)(var2.getShort() & 65535 ^ var13);
                              int var37 = var13 + 18749 & 65535;
                              var5[var10] = var31;
                              var10++;
                              var13 = (short)var37;
                           }

                           short var25;
                           label134:
                           if ((var25 = var5[0]) != -256 && var25 != -255) {
                              switch (var25) {
                                 case 512:
                                 case 514:
                                 case 515:
                                    break label134;
                                 case 513:
                                    StringBuilder var49 = new StringBuilder("{DELAY_");
                                    Object[] var27;
                                    (var27 = new Object[1])[0] = var5[2];
                                    var19.append(var49.append(String.format("%1$02X", var27)).append("}").toString());
                                    break label134;
                              }

                              if (var25 >= 256 && var25 < 512 || var25 >= 1536 && var25 < 1552) {
                                 var25 = var5[2];
                                 StringBuilder var48 = new StringBuilder("{");
                                 Object[] var36;
                                 (var36 = new Object[1])[0] = var25;
                                 var19.append(var48.append(String.format("%1$02X", var36)).append("}").toString());
                              }
                           }

                           var10 = var13;
                           break;
                        case 9660:
                        case 9661:
                           var19.append("\n\n");
                           break;
                        default:
                           if (var28) {
                              int var14 = 0;
                              int var15 = 0;

                              while (true) {
                                 while (var14 < 15) {
                                    int var16;
                                    var10000 = (var16 = var13 & 65535) >> var14;
                                    int var17 = var10000 & 511;
                                    if ((var10000 & 0xFF) == 255) {
                                       continue label188;
                                    }

                                    if (var17 != 0 && var17 != 1) {
                                       char[] var18 = this.Ae;
                                       if (var17 < this.Ae.length) {
                                          if (var17 != 480) {
                                             if (var17 != 481) {
                                                var19.append(var18[var17]);
                                             } else {
                                                var19.append("MN");
                                             }
                                          } else {
                                             var19.append("PK");
                                          }
                                       } else {
                                          dl_1 var43 = FZ;
                                          Object[] var40;
                                          (var40 = new Object[1])[0] = Short.valueOf((short)var13);
                                          String.format("%1$02X", var40);
                                          var43.getClass();
                                       }
                                    }

                                    if ((var13 = (short)(var14 + 9)) < 15) {
                                       var15 = var16 >> var13 & 511;
                                       var13 = (short)(var14 + 18);
                                    }

                                    if (var2.remaining() < 2) {
                                       continue label188;
                                    }

                                    short var22 = (short)(var2.getShort() ^ var10);
                                    var14 = var10 + 18749 & 65535;
                                    var12++;
                                    var10 = var14;
                                    var14 = var13;
                                    var13 = var22;
                                 }

                                 if ((var14 += -15) > 0) {
                                    int var38;
                                    if (((var38 = var15 | (var13 & 65535) << 9 - var14 & 511) & 0xFF) == 255) {
                                       break;
                                    }

                                    if (var38 != 0 && var38 != 1) {
                                       char[] var41 = this.Ae;
                                       if (var38 < this.Ae.length) {
                                          if (var38 != 480) {
                                             if (var38 != 481) {
                                                var19.append(var41[var38]);
                                             } else {
                                                var19.append("MN");
                                             }
                                          } else {
                                             var19.append("PK");
                                          }
                                       } else {
                                          dl_1 var46 = FZ;
                                          Object[] var39;
                                          (var39 = new Object[1])[0] = Short.valueOf((short)var13);
                                          String.format("%1$02X", var39);
                                          var46.getClass();
                                       }
                                    }
                                 }
                              }
                           } else if (var13 != 0 && var13 != 1) {
                              if (var13 >= 0) {
                                 char[] var33 = this.Ae;
                                 if (var13 < this.Ae.length) {
                                    if (var13 != 480) {
                                       if (var13 != 481) {
                                          var19.append(var33[var13]);
                                       } else {
                                          var19.append("MN");
                                       }
                                    } else {
                                       var19.append("PK");
                                    }
                                    continue;
                                 }
                              }

                              dl_1 var47 = FZ;
                              this.E1(var1);
                              Object[] var34;
                              (var34 = new Object[1])[0] = Short.valueOf((short)var13);
                              String.format("%1$02X", var34);
                              kc_1.fu((short)var13, true);
                              var47.getClass();
                           }
                     }
                  }
               }

               super.ul0[var1][0][var8] = var19.toString();
            }

            var8 = var21;
         }
      }
   }

   public final int E1(int var1) {
      if (!super.D40 && !super.MV) {
         return var1;
      }

      if (super.Sb.Tz() == 3) {
         if (var1 <= 12) {
            return var1;
         }

         if (var1 <= 386) {
            return var1 - 1;
         }

         if (var1 <= 392) {
            return var1 - 2;
         }

         if (var1 == 393) {
            return 390;
         }

         if (var1 <= 412) {
            return var1 - 4;
         }

         if (var1 == 413) {
            return 408;
         }

         if (super.MV) {
            if (var1 <= 610) {
               return var1 - 5;
            }

            if (var1 <= 619) {
               return var1 - 6;
            }

            if (var1 <= 626) {
               return var1 - 7;
            }

            if (var1 <= 628) {
               return var1 - 8;
            }

            if (var1 <= 630) {
               return var1 - 9;
            }

            if (var1 <= 647 || var1 > 662) {
               return var1 - 10;
            }

            return var1 - 11;
         }

         if (var1 == 414) {
            return -1;
         }

         if (var1 <= 610) {
            return var1 - 6;
         }

         if (var1 <= 619) {
            return var1 - 7;
         }

         if (var1 <= 626) {
            return var1 - 8;
         }

         if (var1 <= 628) {
            return var1 - 9;
         }

         if (var1 <= 630) {
            return var1 - 10;
         }

         if (var1 <= 647) {
            return var1 - 11;
         }
      } else {
         if (super.Sb.Tz() != 4) {
            return var1;
         }

         if (var1 <= 15) {
            return var1;
         }

         if (super.MV) {
            if (var1 <= 216) {
               return var1 - 1;
            }

            if (var1 <= 219) {
               return var1 - 2;
            }

            if (var1 == 220 || var1 == 221) {
               return 219;
            }

            if (var1 <= 224) {
               return 220;
            }

            if (var1 <= 237) {
               return var1 - 4;
            }

            if (var1 <= 720) {
               return var1 - 5;
            }

            if (var1 <= 730) {
               return var1 - 6;
            }

            if (var1 <= 750 || var1 > 772) {
               return var1 - 7;
            }

            return var1 - 8;
         }

         if (var1 <= 38) {
            return var1 - 1;
         }

         if (var1 <= 216) {
            return var1 - 2;
         }

         if (var1 <= 219) {
            return var1 - 3;
         }

         if (var1 == 220 || var1 == 221) {
            return 218;
         }

         if (var1 <= 224) {
            return 219;
         }

         if (var1 <= 237) {
            return var1 - 5;
         }

         if (var1 == 239) {
            return -1;
         }

         if (var1 <= 510) {
            return var1 - 7;
         }

         if (var1 == 511) {
            return -1;
         }

         if (var1 <= 602) {
            return var1 - 8;
         }

         if (var1 == 603) {
            return -1;
         }

         if (var1 <= 720) {
            return var1 - 9;
         }

         if (var1 <= 730) {
            return var1 - 10;
         }

         if (var1 <= 750) {
            return var1 - 11;
         }

         if (var1 > 810) {
            if (var1 == 811) {
               return -1;
            }

            return var1 - 13;
         }
      }

      return var1 - 12;
   }
}
