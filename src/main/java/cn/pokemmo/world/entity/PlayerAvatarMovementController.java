package cn.pokemmo.world.entity;

import f.*;

import java.util.ArrayList;

public class PlayerAvatarMovementController extends bi0_1 {
   public static final nk_0[] wK0 = new nk_0[]{nk_0.t20, nk_0.cOM9, nk_0.pM, nk_0.lpT8};
   public byte ok;
   public short Z4;
   public final byte Wx0;
   public final dd_1 yj;
   public dd_1 F7;
   public final byte Mc;
   public final byte Rj0;
   public final byte cb0;
   public final byte ss;
   public final short DN;
   public final byte ct0;
   public byte Nf0;
   public final boolean wC;
   public final boolean DT;
   public boolean hq0;
   public ht_0 ho0;
   public int iy = 0;
   public long d40 = -1L;
   public long py = 0L;
   public final zv_2 wb;
   public boolean O90 = false;
   public boolean Jz0 = false;
   public cd0_2 transient$;
   public short f8 = -1;
   public byte xq;
   public boolean I80;
   public float coM6 = 1.0F;
   public ec0_1 cs0;
   public short x10 = 0;
   public byte ph = 0;

   public PlayerAvatarMovementController(
      CH0 var1,
      byte var2,
      short var3,
      byte var4,
      byte var5,
      byte var6,
      byte var7,
      byte var8,
      byte var9,
      zv_2 var10,
      short var11,
      byte var12,
      boolean var13,
      boolean var14,
      cd0_2 var15,
      short var16
   ) {
      super(var1, var10, (byte)0);
      this.ok = var2;
      this.Z4 = var3;
      this.ho0 = QI.KH0().t00(var2, var3);
      if (var2 == 1) {
         if (var3 == 59 || var3 == 82 || var3 == 97 || var3 == 114 || var3 == 228 || var3 == 86 || var3 == 87) {
            var5 = 0;
         }

         if (var3 >= 142 && var3 <= 188) {
            var5 = 0;
         }
      }

      this.Wx0 = var4;
      dd_1 var17 = up_1.vC0().vE0(var10.Qa0(), var5, var4);
      this.F7 = var17;
      this.yj = var17;
      this.Mc = var6;
      this.Rj0 = var7;
      this.cb0 = var8;
      this.ss = var9;
      this.DN = var11;
      this.ct0 = var12;
      this.Nf0 = var12;
      this.wC = var13;
      this.DT = var14;
      this.transient$ = var15;
      this.f8 = var16;
      this.wb = var10.Xr();
      this.uR().ej0();
      this.nU();
   }

   public final void nU() {
      short var1 = this.ok;
      if (this.ok == 10) {
         this.x10 = 0;
         this.ph = 0;
      } else {
         if (var1 == 4) {
            UY var3 = tw0_0.Ll0.t1;
            if (tw0_0.Ll0.t1 != null) {
               var1 = this.Z4;
               if ((var1 = var3.Gt.f5(var1)) > 296) {
                  this.x10 = rg0_0.TF((short)(var1 - -3799));
                  this.ph = 0;
                  return;
               }
            }
         }

         var1 = this.Z4;
         if (this.Z4 >= 4095 && var1 <= 8094) {
            this.x10 = rg0_0.TF(var1);
            byte var7 = 0;
            short var2 = this.Z4;
            if (this.Z4 >= 6095 && var2 <= 7094) {
               var7 = (byte)64;
            }

            if (var2 >= 7095 && var2 <= 8094) {
               var7 = (byte)(var7 | -128);
            }

            while (var2 > 5094) {
               var2 = (short)(var2 - 1000);
            }

            short var34;
            label241: {
               label158:
               if (var2 >= 4095 && (var2 = (short)(var2 - 4095)) >= 3) {
                  short var10001;
                  if (var2 <= 4) {
                     var34 = var2;
                     var10001 = 3;
                  } else {
                     if (--var2 < 25) {
                        break label158;
                     }

                     if (var2 <= 26) {
                        var34 = var2;
                        var10001 = 25;
                     } else {
                        if (--var2 < 154) {
                           break label158;
                        }

                        if (var2 <= 155) {
                           var34 = var2;
                           var10001 = 154;
                        } else {
                           if (--var2 < 172) {
                              break label158;
                           }

                           if (var2 <= 173) {
                              var34 = var2;
                              var10001 = 172;
                           } else {
                              if (--var2 < 201) {
                                 break label158;
                              }

                              if (var2 <= 228) {
                                 var34 = var2;
                                 var10001 = 201;
                              } else if ((var2 = (short)(var2 - 27)) <= 203) {
                                 var34 = var2;
                                 var10001 = 202;
                              } else {
                                 if (--var2 < 208) {
                                    break label158;
                                 }

                                 if (var2 <= 209) {
                                    var34 = var2;
                                    var10001 = 208;
                                 } else {
                                    if (--var2 < 214) {
                                       break label158;
                                    }

                                    if (var2 <= 215) {
                                       var34 = var2;
                                       var10001 = 214;
                                    } else {
                                       if (--var2 < 386) {
                                          break label158;
                                       }

                                       if (var2 <= 388) {
                                          var34 = var2;
                                          var10001 = 386;
                                       } else {
                                          if ((var2 = (short)(var2 - 3)) < 412) {
                                             break label158;
                                          }

                                          if (var2 <= 414) {
                                             var34 = var2;
                                             var10001 = 412;
                                          } else if ((var2 = (short)(var2 - 2)) <= 415) {
                                             var34 = var2;
                                             var10001 = 413;
                                          } else {
                                             if ((var2 = (short)(var2 - 2)) < 415) {
                                                break label158;
                                             }

                                             if (var2 <= 416) {
                                                var34 = var2;
                                                var10001 = 415;
                                             } else {
                                                if (--var2 < 422) {
                                                   break label158;
                                                }

                                                if (var2 <= 423) {
                                                   var34 = var2;
                                                   var10001 = 422;
                                                } else if (--var2 <= 424) {
                                                   var34 = var2;
                                                   var10001 = 423;
                                                } else {
                                                   if (--var2 < 443) {
                                                      break label158;
                                                   }

                                                   if (var2 <= 444) {
                                                      var34 = var2;
                                                      var10001 = 443;
                                                   } else if (--var2 != 444 && var2 != 445) {
                                                      if (--var2 != 445 && var2 != 446) {
                                                         if (--var2 < 449) {
                                                            break label158;
                                                         }

                                                         if (var2 != 449 && var2 != 450) {
                                                            if (--var2 != 450 && var2 != 451) {
                                                               if (--var2 < 479) {
                                                                  break label158;
                                                               }

                                                               if (var2 <= 484) {
                                                                  var34 = var2;
                                                                  var10001 = 479;
                                                               } else {
                                                                  if ((var2 = (short)(var2 - 5)) < 487) {
                                                                     break label158;
                                                                  }

                                                                  if (var2 != 487 && var2 != 488) {
                                                                     if (--var2 < 492) {
                                                                        break label158;
                                                                     }

                                                                     if (var2 != 492 && var2 != 493) {
                                                                        if (--var2 <= 511) {
                                                                           var34 = var2;
                                                                           var10001 = 493;
                                                                        } else {
                                                                           if ((var2 = (short)(var2 - 18)) > 649 && rg0_0.Prn(0, var2) < 1 || var2 > 588) {
                                                                              break label158;
                                                                           }

                                                                           var34 = var2;
                                                                           var10001 = 585;
                                                                        }
                                                                     } else {
                                                                        var34 = var2;
                                                                        var10001 = 492;
                                                                     }
                                                                  } else {
                                                                     var34 = var2;
                                                                     var10001 = 487;
                                                                  }
                                                               }
                                                            } else {
                                                               var34 = var2;
                                                               var10001 = 450;
                                                            }
                                                         } else {
                                                            var34 = var2;
                                                            var10001 = 449;
                                                         }
                                                      } else {
                                                         var34 = var2;
                                                         var10001 = 445;
                                                      }
                                                   } else {
                                                      var34 = var2;
                                                      var10001 = 444;
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  var34 = (byte)(var34 - var10001);
                  break label241;
               }

               var34 = 0;
            }

            byte var32 = (byte)var34;
            if (var32 >= 0) {
               var7 |= var32;
            }

            this.ph = var7;
         } else {
            this.x10 = 0;
            this.ph = 0;
         }
      }
   }

   public mg_0 at() {
      return new z2_0(this);
   }

   public final String na0() {
      return "Npc" + super.pu;
   }

   public byte KJ0() {
      if (this.O90 && this.ho0.Dc0 != 0) {
         return 0;
      } else {
         byte var1 = this.cb0;
         if (this.cb0 >= 0) {
            return var1;
         } else {
            return this.ok == 2 ? tw0_0.Ll0.Qz0.AF(this.Z4).U0 : this.ho0.or;
         }
      }
   }

   public byte zK() {
      if (this.O90 && this.ho0.Dc0 != 0) {
         return 0;
      } else {
         byte var1 = this.ss;
         if (this.ss >= 0) {
            return var1;
         } else {
            return this.ok == 2 ? tw0_0.Ll0.Qz0.AF(this.Z4).uw : this.ho0.oP;
         }
      }
   }

   public final byte QU() {
      return this.ok;
   }

   public final short ki0() {
      return this.Z4;
   }

   public final short mI0() {
      return this.x10;
   }

   public final byte QL() {
      return this.ph;
   }

   public final dd_1 Fo() {
      return this.F7;
   }

   public final void gB0(byte var1) {
      byte var2 = super.ba0.uS;
      byte var3 = this.Wx0;
      this.F7 = up_1.Ak.vE0(var2, var1, var3);
      this.iy = 0;
      this.d40 = System.currentTimeMillis() + this.F7.oH0();
      super.ba0.Y30 = this.Wx0;
   }

   public final boolean CI0() {
      return true;
   }

   public final byte zA() {
      return this.Nf0;
   }

   public final void Vl(boolean var1) {
      super.Vl((boolean)var1);
      if (!var1 || this.F7.G9()) {
         if (super.hj.EH) {
            if (super.il0.D() && this.d40 <= System.currentTimeMillis()) {
               if (N50.Aa(super.ba0.uS)) {
                  short modelId = this.Z4;
                  if (modelId >= 92 && modelId <= 108) {
                     return;
                  }
               }

               nk_0 var8;
               if ((var8 = this.F7.Gs(this.iy, this.Mc, this.Rj0)) != null) {
                  short var2 = var8.Cb0;
                  if (var8.Cb0 > 0) {
                     short var3 = super.ba0.Lq0;
                     short var4 = super.ba0.B5;
                     byte var5 = var8.ml0;
                     if (var8.ml0 == 1 || var5 == 0) {
                        if (var5 == 1) {
                           var4 = (short)(var4 - var2);
                        } else {
                           var4 = (short)(var4 + var2);
                        }
                     }

                     if (var5 == 2 || var5 == 3) {
                        if (var5 == 2) {
                           var3 = (short)(var3 - var2);
                        } else {
                           var3 = (short)(var3 + var2);
                        }
                     }

                     var2 = this.wb.Lq0;
                     var3 = this.wb.B5;
                     var5 = this.Mc;
                     byte var6 = this.Rj0;
                     if (!this.F7.KR(var3, var4, var2, var3, var5, var6)) {
                        return;
                     }
                  }

                  long var10 = System.currentTimeMillis() + this.F7.oH0();
                  this.d40 = var10;
                  if (super.il0.fY(var8, false)) {
                     this.iy++;
                  }
               } else {
                  long var11 = System.currentTimeMillis() + this.F7.oH0();
                  this.d40 = var11;
                  this.iy++;
               }
            }
         }
      }
   }

   public final float E7() {
      return this.O90 ? super.ba0.Com6() - 2.0F : super.ba0.Com6();
   }

   public final boolean Gw0() {
      return this.Jz0;
   }

   public final void ql(short var1, byte var2, boolean var3) {
      if (super.rd == null) {
         KF var4 = new KF(this, KF.oZ(this), var1, var2);
         super.rd = var4;
         var4.Pm0 = var3;
      } else {
         super.ql(var1, var2, var3);
      }
   }

   public final ec0_1 Gi() {
      return this.cs0;
   }

   public final boolean Aw(E90 var1, byte var2, ArrayList var3) {
      yt_1 var4 = tw0_0.e60;
      byte var10 = super.ba0.uS;
      byte var5 = super.ba0.o0;
      int var6 = super.ba0.ID0;
      _else var11;
      if ((var11 = (_else)var4.E6.get(J4.iA0(var10, var5, (byte)var6))) == null) {
         return false;
      }

      LT var9;
      if ((var9 = var1.ba0.LPt1()) == null) {
         return false;
      }

      LT var12;
      if ((var12 = super.ba0.LPt1()) == null) {
         return false;
      }

      var6 = 0;

      while (var6 < this.Nf0) {
         LT var7;
         if ((var7 = var11.gv(var12, var2, 1)) == null || !super.il0.qm(var12, var7, super.ba0.Y30, false, false, false)) {
            return false;
         }

         if (var12.Es() != var7.Es() && var12.Es() != -1 && var7.Es() != -1) {
            return false;
         }

         if (var7.gr0() == var9.gr0() && var7.Tz() == var9.Tz() && var7.HR() == var9.HR() && var7.Es() == var9.Es()) {
            zv_2 var8;
            if (var2 != (var8 = super.ba0).Y30) {
               var8.Y30 = var2;
            }

            return true;
         }

         if (var3 != null) {
            var3.add(wK0[var2]);
         }

         var6++;
         var12 = var7;
      }

      return false;
   }
}
