package cn.pokemmo.audio;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffect;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoader;
import f.*;

/**
 * 现代化重构类 - 原始类: f.hd0_2
 */
public class AudioPlaybackDspEngine implements fy0_0 {

   public final nb_2 fi0;
   public final nb_2 LJ0;
   public final nb_2 GE;
   public final af_1 wn;
   public final nb_2 U20;
   public final es_1 i;
   public final rv_0 vz0;
   public final es_1 aS;
   public final Ls0 LPt4;

   public AudioPlaybackDspEngine() {
      this(new lpt1__2());
   }

   public AudioPlaybackDspEngine(gq_1 var1) {
      this(var1, true);
   }

   public AudioPlaybackDspEngine(gq_1 var1, boolean var2) {
      nb_2 var5;
      var5 = new nb_2();
      this.fi0 = var5;
      nb_2 var6;
      var6 = new nb_2();
      this.LJ0 = var6;
      nb_2 var7;
      var7 = new nb_2();
      this.GE = var7;
      af_1 var8;
      var8 = new af_1();
      this.wn = var8;
      nb_2 var9;
      var9 = new nb_2();
      this.U20 = var9;
      es_1 var10;
      var10 = new es_1();
      this.i = var10;
      es_1 var11;
      var11 = new es_1();
      this.aS = var11;
      Ls0 var12;
      var12 = new Ls0("AssetManager", 0);
      this.LPt4 = var12;
      if (var2) {
         uv0_0 var13;
         var13 = new uv0_0(var1);
         this.ok(sc_0.class, var13);
         ed0_2 var14;
         var14 = new ed0_2(var1);
         this.ok(gg0_0.class, var14);
         PF0 var15;
         var15 = new PF0(var1);
         this.ok(i4_0.class, var15);
         zt_0 var16;
         var16 = new zt_0(var1);
         this.ok(AC0.class, var16);
         hz_0 var17;
         var17 = new hz_0(var1);
         this.ok(D30.class, var17);
         rh0_2 var18;
         var18 = new rh0_2(var1);
         this.ok(Texture.class, var18);
         FV var19;
         var19 = new FV(var1);
         this.ok(A3.class, var19);
         v90_0 var20;
         var20 = new v90_0(var1);
         this.ok(xw_0.class, var20);
         ParticleEffectLoader var21;
         var21 = new ParticleEffectLoader(var1);
         this.ok(ParticleEffect.class, var21);
         Gw0 var22;
         var22 = new Gw0(var1);
         this.ok(vh_0.class, var22);
         hk_1 var23;
         var23 = new hk_1(var1);
         this.ok(vj_1.class, var23);
         Y1 var3 = new Y1();
         cs_1 var24 = new cs_1(var3, var1);

         this.zK(ut_0.class, ".g3dj", var24);
         bc_0 var29 = new bc_0();
         cs_1 var25 = new cs_1(var29, var1);

         this.zK(ut_0.class, ".g3db", var25);
         vn_1 var26;
         var26 = new vn_1(var1);
         this.zK(ut_0.class, ".obj", var26);
         uo_0 var27;
         var27 = new uo_0(var1);
         this.ok(lt_1.class, var27);
         tg_1 var28;
         var28 = new tg_1(var1);
         this.ok(AH0.class, var28);
      }

      rv_0 var4;
      var4 = new rv_0(1, "AssetManager");
      this.vz0 = var4;
   }

   public final synchronized void hs0(String var1, cr_2 var2) {
      es_1 var3;
      if ((var3 = (es_1)this.GE.Wk0(var1)) == null) {
         var3 = new es_1();
         this.GE.WK0(var1, var3);
      }

      var3.Ue0(var2.RH0);
      if (this.u70(var2.RH0)) {
         this.LPt4.QR("Dependency already loaded: " + var2);
         Class var4 = (Class)this.LJ0.Wk0(var2.RH0);
         ((vs_1)((nb_2)this.fi0.Wk0(var4)).Wk0(var2.RH0)).k50++;
         this.ZB(var2.RH0);
      } else {
         this.LPt4.Lj("Loading dependency: " + var2);
         Class var6 = var2.wj;
         u6_0 var7;
         if ((var7 = this.Cv0(var6, var2.RH0)) == null) {
            throw new nf_1("No loader for type: ".concat(var2.wj.getSimpleName()));
         }

         rv_0 var5 = this.vz0;
         this.aS.Ue0(new sn_1((hd0_2) this, var2, var7, var5));
      }
   }

   public final void aj0() {
      cr_2 var1;
      if (this.u70((var1 = (cr_2)this.i.Tx0(0)).RH0)) {
         this.LPt4.QR("Already loaded: " + var1);
         Class var2 = (Class)this.LJ0.Wk0(var1.RH0);
         ((vs_1)((nb_2)this.fi0.Wk0(var2)).Wk0(var1.RH0)).k50++;
         this.ZB(var1.RH0);
         in_0 var5 = var1.coM1;
         zq_1 var6;
         if (var1.coM1 != null && (var6 = var5.loadedCallback) != null) {
            String var3 = var1.RH0;
            this.v9(((ty_1)var6).vj, var3);
         }
      } else {
         this.LPt4.Lj("Loading: " + var1);
         Class var7 = var1.wj;
         u6_0 var8;
         if ((var8 = this.Cv0(var7, var1.RH0)) == null) {
            throw new nf_1("No loader for type: ".concat(var1.wj.getSimpleName()));
         }

         rv_0 var4 = this.vz0;
         this.aS.Ue0(new sn_1((hd0_2) this, var1, var8, var4));
      }
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final boolean oI0() {
      sn_1 var1 = (sn_1)this.aS.GH0();
      boolean var15;
      try {
         var15 = var1.XJ;
      } catch (RuntimeException var7) {
         var1.XJ = true;
         throw var7;
      }

      if (!var15) {
         boolean var16;
         try {
            var16 = var1.Uf0();
         } catch (RuntimeException var6) {
            var1.XJ = true;
            throw var6;
         }

         if (!var16) {
            return false;
         }
      }

      this.aS.rq0();
      if (var1.XJ) {
         return true;
      }

      String var2 = var1.t0.RH0;
      Class var3 = var1.t0.wj;
      Object var4 = var1.ry;
      this.LJ0.WK0(var2, var3);
      nb_2 var5;
      if ((var5 = (nb_2)this.fi0.Wk0(var3)) == null) {
         var5 = new nb_2();
         this.fi0.WK0(var3, var5);
      }

      vs_1 var9;
      vs_1 var10003 = var9 = new vs_1();

      var10003.w60 = var4;
      var5.WK0(var2, var9);
      cr_2 var10 = var1.t0;
      in_0 var13 = var1.t0.coM1;
      zq_1 var14;
      if (var1.t0.coM1 != null && (var14 = var13.loadedCallback) != null) {
         var2 = var10.RH0;
         this.v9(((ty_1)var14).vj, var2);
      }

      long var12 = System.nanoTime();
      Ls0 var17 = this.LPt4;
      StringBuilder var8;
      StringBuilder var10001 = var8 = new StringBuilder("Loaded: ");

      var17.QR(var10001.append((float)(var12 - var1.F10) / 1000000.0F).append("ms ").append(var1.t0).toString());
      return true;
   }

   public final void ZB(String var1) {
      es_1 var4;
      if ((var4 = (es_1)this.GE.Wk0(var1)) != null) {
         I2 var5 = var4.ZD();

         while (var5.hasNext()) {
            String var2;
            String var10001 = var2 = (String)var5.next();
            Class var3 = (Class)this.LJ0.Wk0(var2);
            ((vs_1)((nb_2)this.fi0.Wk0(var3)).Wk0(var2)).k50++;
            this.ZB(var10001);
         }
      }
   }

   public final synchronized Object hi(String var1) {
      return this.cOM5(var1);
   }

   public final synchronized boolean AA0(String var1) {
      es_1 var2 = this.aS;
      if (this.aS.KB > 0 && ((sn_1)var2.KI()).t0.RH0.equals(var1)) {
         return true;
      }

      int var4 = 0;

      while (true) {
         es_1 var3 = this.i;
         if (var4 >= this.i.KB) {
            return this.u70(var1);
         }

         if (((cr_2)var3.get(var4)).RH0.equals(var1)) {
            return true;
         }

         var4++;
      }
   }

   public final synchronized void Mj(String var1) {
      es_1 var2 = this.aS;
      sn_1 var13;
      if (this.aS.KB > 0 && (var13 = (sn_1)var2.KI()).t0.RH0.equals(var1)) {
         this.LPt4.Lj("Unload (from tasks): " + var1);
         var13.XJ = true;
         u6_0 var7 = var13.n;
         if (var13.n instanceof N00) {
            N00 var11 = (N00)var7;
            hd0_2 var19 = var13.ko;
            cr_2 var22 = var13.t0;
            String var23 = var13.t0.RH0;
            if (var13.t0.Ju == null) {
               var22.Ju = var7.resolve(var23);
            }

            Dn0 var8 = var22.Ju;
            in_0 var12 = var13.t0.coM1;
            var11.unloadAsync(var19, var23, var8, var12);
         }
      } else {
         Class var14 = (Class)this.LJ0.Wk0(var1);
         int var3 = -1;
         int var4 = 0;

         while (true) {
            es_1 var5 = this.i;
            if (var4 >= this.i.KB) {
               break;
            }

            if (((cr_2)var5.get(var4)).RH0.equals(var1)) {
               var3 = var4;
               break;
            }

            var4++;
         }

         if (var3 != -1) {
            cr_2 var17 = (cr_2)this.i.Tx0(var3);
            this.LPt4.Lj("Unload (from queue): " + var1);
            if (var14 != null) {
               in_0 var9 = var17.coM1;
               zq_1 var10;
               if (var17.coM1 != null && (var10 = var9.loadedCallback) != null) {
                  String var6 = var17.RH0;
                  this.v9(((ty_1)var10).vj, var6);
               }
            }
         } else if (var14 != null) {
            vs_1 var18 = (vs_1)((nb_2)this.fi0.Wk0(var14)).Wk0(var1);
            if ((var18.k50 = var18.k50 - 1) <= 0) {
               this.LPt4.Lj("Unload (dispose): " + var1);
               Object var20 = var18.w60;
               if (var18.w60 instanceof fy0_0) {
                  ((fy0_0)var20).dispose();
               }

               this.LJ0.ns0(var1);
               ((nb_2)this.fi0.Wk0(var14)).ns0(var1);
            } else {
               this.LPt4.Lj("Unload (decrement): " + var1);
            }

            if ((var2 = (es_1)this.GE.Wk0(var1)) != null) {
               I2 var16 = var2.ZD();

               while (var16.hasNext()) {
                  String var21;
                  if (this.u70(var21 = (String)var16.next())) {
                     this.Mj(var21);
                  }
               }
            }

            if (var18.k50 <= 0) {
               this.GE.ns0(var1);
            }
         } else {
            throw new nf_1(jj0_0.hw0("Asset not loaded: ", var1));
         }
      }
   }

   public final synchronized boolean u70(String var1) {
      return var1 == null ? false : this.LJ0.fl(var1);
   }

   public final u6_0 Cv0(Class var1, String var2) {
      nb_2 var5;
      if ((var5 = (nb_2)this.U20.Wk0(var1)) != null && var5.Va0 >= 1) {
         if (var2 == null) {
            return (u6_0)var5.Wk0("");
         }

         u6_0 var6 = null;
         int var7 = -1;
         a60_0 var3;
         (var3 = var5.lb0()).getClass();

         while (var3.hasNext()) {
            xn_1 var4;
            if (((String)(var4 = (xn_1)var3.next()).I20).length() > var7 && var2.endsWith((String)var4.I20)) {
               var6 = (u6_0)var4.kM;
               var7 = ((String)var4.I20).length();
            }
         }

         return var6;
      } else {
         return null;
      }
   }

   public final synchronized void im(String var1, Class var2, in_0 var3) {
      if (this.Cv0(var2, var1) != null) {
         int var4 = 0;

         while (true) {
            es_1 var5 = this.i;
            if (var4 >= this.i.KB) {
               var4 = 0;

               while (true) {
                  var5 = this.aS;
                  if (var4 >= this.aS.KB) {
                     Class var8;
                     if ((var8 = (Class)this.LJ0.Wk0(var1)) != null && !var8.equals(var2)) {
                        throw new nf_1(
                           "Asset with name '"
                              + var1
                              + "' already loaded, but has different type (expected: "
                              + var2.getSimpleName()
                              + ", found: "
                              + var8.getSimpleName()
                              + ")"
                        );
                     }

                     cr_2 var6;
                     var6 = new cr_2(var1, var2, var3);
                     this.i.Ue0(var6);
                     this.LPt4.QR("Queued: " + var6);
                     return;
                  }

                  cr_2 var11;
                  if ((var11 = ((sn_1)var5.get(var4)).t0).RH0.equals(var1) && !var11.wj.equals(var2)) {
                     throw new nf_1(
                        "Asset with name '"
                           + var1
                           + "' already in task list, but has different type (expected: "
                           + var2.getSimpleName()
                           + ", found: "
                           + var11.wj.getSimpleName()
                           + ")"
                     );
                  }

                  var4++;
               }
            }

            cr_2 var9;
            if ((var9 = (cr_2)var5.get(var4)).RH0.equals(var1) && !var9.wj.equals(var2)) {
               throw new nf_1(
                  "Asset with name '"
                     + var1
                     + "' already in preload queue, but has different type (expected: "
                     + var2.getSimpleName()
                     + ", found: "
                     + var9.wj.getSimpleName()
                     + ")"
               );
            }

            var4++;
         }
      } else {
         throw new nf_1("No loader for type: ".concat(var2.getSimpleName()));
      }
   }

   public final synchronized boolean r00() {
      try {
         if (this.aS.KB == 0) {
            while (this.i.KB != 0 && this.aS.KB == 0) {
               this.aj0();
            }

            if (this.aS.KB == 0) {
               return true;
            }
         }

         return this.oI0() && this.i.KB == 0 && this.aS.KB == 0;
      } catch (Throwable var1) {
         this.LPt4.Lj("Error loading asset: " + var1);
         if (!this.aS.isEmpty()) {
            sn_1 var2 = (sn_1)this.aS.rq0();
            if (var2.cJ0 && var2.q4 != null) {
               I2 var3 = var2.q4.ZD();

               while (var3.hasNext()) {
                  this.Mj(((cr_2)var3.next()).RH0);
               }
            }

            this.aS.clear();
         }

         throw new nf_1(var1);
      }

      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:361)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:504)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1058)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.insertSemaphore(FinallyProcessor.java:351)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:98)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:185)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield f/hd0_2.aS Lf/es_1;
      // 04: getfield f/es_1.KB I
      // 07: ifne 35
      // 0a: aload 0
      // 0b: getfield f/hd0_2.i Lf/es_1;
      // 0e: getfield f/es_1.KB I
      // 11: ifeq 29
      // 14: aload 0
      // 15: getfield f/hd0_2.aS Lf/es_1;
      // 18: getfield f/es_1.KB I
      // 1b: ifne 29
      // 1e: aload 0
      // 1f: invokevirtual f/hd0_2.aj0 ()V
      // 22: goto 0a
      // 25: astore 1
      // 26: goto 56
      // 29: aload 0
      // 2a: getfield f/hd0_2.aS Lf/es_1;
      // 2d: getfield f/es_1.KB I
      // 30: ifne 35
      // 33: bipush 1
      // 34: ireturn
      // 35: aload 0
      // 36: invokevirtual f/hd0_2.oI0 ()Z
      // 39: ifeq 54
      // 3c: aload 0
      // 3d: getfield f/hd0_2.i Lf/es_1;
      // 40: getfield f/es_1.KB I
      // 43: ifne 54
      // 46: aload 0
      // 47: getfield f/hd0_2.aS Lf/es_1;
      // 4a: getfield f/es_1.KB I
      // 4d: ifne 54
      // 50: bipush 1
      // 51: goto 55
      // 54: bipush 0
      // 55: ireturn
      // 56: aload 0
      // 57: getfield f/hd0_2.LPt4 Lf/Ls0;
      // 5a: dup
      // 5b: astore 2
      // 5c: getfield f/Ls0.Em0 I
      // 5f: bipush 1
      // 60: if_icmplt 9f
      // 63: aload 2
      // 64: getstatic f/lg_0.k Lf/Dt0;
      // 67: astore 2
      // 68: getfield f/Ls0.Km0 Ljava/lang/String;
      // 6b: astore 3
      // 6c: aload 2
      // 6d: getfield f/Dt0.ai I
      // 70: bipush 1
      // 71: if_icmplt 9f
      // 74: aload 1
      // 75: aload 2
      // 76: getfield f/Dt0.eA Lf/GC0;
      // 79: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 7c: pop
      // 7d: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 80: dup
      // 81: new java/lang/StringBuilder
      // 84: dup
      // 85: aload 3
      // 86: swap
      // 87: ldc_w "["
      // 8a: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 8d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 90: ldc_w "] Error loading asset."
      // 93: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 96: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 99: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 9c: invokevirtual java/lang/Throwable.printStackTrace (Ljava/io/PrintStream;)V
      // 9f: aload 0
      // a0: getfield f/hd0_2.aS Lf/es_1;
      // a3: invokevirtual f/es_1.isEmpty ()Z
      // a6: ifne f7
      // a9: aload 0
      // aa: getfield f/hd0_2.aS Lf/es_1;
      // ad: invokevirtual f/es_1.rq0 ()Ljava/lang/Object;
      // b0: checkcast f/sn_1
      // b3: dup
      // b4: dup
      // b5: astore 2
      // b6: getfield f/sn_1.t0 Lf/cr_2;
      // b9: pop
      // ba: getfield f/sn_1.cJ0 Z
      // bd: ifeq e7
      // c0: aload 2
      // c1: getfield f/sn_1.q4 Lf/es_1;
      // c4: ifnull e7
      // c7: aload 2
      // c8: getfield f/sn_1.q4 Lf/es_1;
      // cb: invokevirtual f/es_1.ZD ()Lf/I2;
      // ce: astore 2
      // cf: aload 2
      // d0: invokevirtual f/I2.hasNext ()Z
      // d3: ifeq e7
      // d6: aload 0
      // d7: aload 2
      // d8: invokevirtual f/I2.next ()Ljava/lang/Object;
      // db: checkcast f/cr_2
      // de: getfield f/cr_2.RH0 Ljava/lang/String;
      // e1: invokevirtual f/hd0_2.Mj (Ljava/lang/String;)V
      // e4: goto cf
      // e7: aload 0
      // e8: getfield f/hd0_2.aS Lf/es_1;
      // eb: invokevirtual f/es_1.clear ()V
      // ee: new f/nf_1
      // f1: dup
      // f2: aload 1
      // f3: invokespecial f/nf_1.<init> (Ljava/lang/Throwable;)V
      // f6: athrow
      // f7: new f/nf_1
      // fa: dup
      // fb: aload 1
      // fc: invokespecial f/nf_1.<init> (Ljava/lang/Throwable;)V
      // ff: athrow
      // try (0 -> 3): 15 null
      // try (4 -> 7): 15 null
      // try (8 -> 11): 15 null
      // try (12 -> 15): 15 null
      // try (17 -> 20): 15 null
      // try (23 -> 25): 15 null
      // try (26 -> 29): 15 null
      // try (30 -> 33): 15 null
   }

   public final void Q4() {
      this.LPt4.QR("Waiting for loading to complete...");

      while (!this.r00()) {
         Thread.yield();
      }

      this.LPt4.QR("Loading complete.");
   }

   public final synchronized void ok(Class var1, u6_0 var2) {
      this.zK(var1, null, var2);
   }

   public final synchronized void zK(Class var1, String var2, u6_0 var3) {
      this.LPt4.QR("Loader set: " + var1.getSimpleName() + " -> " + var3.getClass().getSimpleName());
      nb_2 var4;
      if ((var4 = (nb_2)this.U20.Wk0(var1)) == null) {
         nb_2 var10000 = this.U20;
         var4 = new nb_2();
         var10000.WK0(var1, var4);
      }

      if (var2 == null) {
         var2 = "";
      }

      var4.WK0(var2, var3);
   }

   @Override
   public final void dispose() {
      this.LPt4.QR("Disposing.");
      this.Wd0();
      this.vz0.dispose();
   }

   public final void Wd0() {
      synchronized (this) {
         this.i.clear();
      }

      this.Q4();
      synchronized (this) {
         while (this.LJ0.Va0 > 0) {
            java.util.HashMap<String, Integer> var1 = new java.util.HashMap<>();
            es_1 var2 = this.LJ0.mC0().Com2();
            I2 var3 = var2.ZD();

            while (var3.hasNext()) {
               es_1 var4 = (es_1)this.GE.Wk0((String)var3.next());
               if (var4 != null) {
                  I2 var5 = var4.ZD();

                  while (var5.hasNext()) {
                     String var6 = (String)var5.next();
                     var1.put(var6, var1.getOrDefault(var6, 0) + 1);
                  }
               }
            }

            I2 var7 = var2.ZD();
            while (var7.hasNext()) {
               String var8 = (String)var7.next();
               if (var1.getOrDefault(var8, 0) == 0) {
                  this.Mj(var8);
               }
            }
         }

         this.fi0.b20();
         this.LJ0.b20();
         this.GE.b20();
         this.i.clear();
         this.aS.clear();
      }

      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:361)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:504)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1058)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:573)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:185)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: dup
      // 003: dup2
      // 004: monitorenter
      // 005: getfield f/hd0_2.i Lf/es_1;
      // 008: invokevirtual f/es_1.clear ()V
      // 00b: monitorexit
      // 00c: invokevirtual f/hd0_2.Q4 ()V
      // 00f: monitorenter
      // 010: new f/Xy0
      // 013: dup
      // 014: astore 1
      // 015: invokespecial f/Xy0.<init> ()V
      // 018: aload 0
      // 019: getfield f/hd0_2.LJ0 Lf/nb_2;
      // 01c: getfield f/nb_2.Va0 I
      // 01f: ifle 12c
      // 022: aload 1
      // 023: bipush 51
      // 025: aload 1
      // 026: getfield f/Xy0.lPt3 F
      // 029: invokestatic f/af_1.NK (IF)I
      // 02c: istore 2
      // 02d: getfield f/Xy0.z00 [Ljava/lang/Object;
      // 030: dup
      // 031: astore 3
      // 032: arraylength
      // 033: iload 2
      // 034: if_icmpgt 04e
      // 037: aload 1
      // 038: getfield f/Xy0.xF I
      // 03b: ifne 041
      // 03e: goto 058
      // 041: aload 3
      // 042: aload 1
      // 043: bipush 0
      // 044: putfield f/Xy0.xF I
      // 047: aconst_null
      // 048: invokestatic java/util/Arrays.fill ([Ljava/lang/Object;Ljava/lang/Object;)V
      // 04b: goto 058
      // 04e: aload 1
      // 04f: dup
      // 050: bipush 0
      // 051: putfield f/Xy0.xF I
      // 054: iload 2
      // 055: invokevirtual f/Xy0.S50 (I)V
      // 058: aload 0
      // 059: getfield f/hd0_2.LJ0 Lf/nb_2;
      // 05c: invokevirtual f/nb_2.mC0 ()Lf/us0_0;
      // 05f: invokevirtual f/us0_0.Com2 ()Lf/es_1;
      // 062: dup
      // 063: astore 2
      // 064: invokevirtual f/es_1.ZD ()Lf/I2;
      // 067: astore 3
      // 068: aload 3
      // 069: invokevirtual f/I2.hasNext ()Z
      // 06c: ifeq 107
      // 06f: aload 0
      // 070: aload 3
      // 071: invokevirtual f/I2.next ()Ljava/lang/Object;
      // 074: checkcast java/lang/String
      // 077: astore 4
      // 079: getfield f/hd0_2.GE Lf/nb_2;
      // 07c: aload 4
      // 07e: invokevirtual f/nb_2.Wk0 (Ljava/lang/Object;)Ljava/lang/Object;
      // 081: checkcast f/es_1
      // 084: dup
      // 085: astore 4
      // 087: ifnonnull 08d
      // 08a: goto 068
      // 08d: aload 4
      // 08f: invokevirtual f/es_1.ZD ()Lf/I2;
      // 092: astore 4
      // 094: aload 4
      // 096: invokevirtual f/I2.hasNext ()Z
      // 099: ifeq 068
      // 09c: aload 1
      // 09d: aload 4
      // 09f: invokevirtual f/I2.next ()Ljava/lang/Object;
      // 0a2: checkcast java/lang/String
      // 0a5: dup
      // 0a6: astore 5
      // 0a8: bipush 1
      // 0a9: istore 6
      // 0ab: invokevirtual f/Xy0.P5 (Ljava/lang/Object;)I
      // 0ae: dup
      // 0af: istore 7
      // 0b1: iflt 0c6
      // 0b4: aload 1
      // 0b5: getfield f/Xy0.V5 [I
      // 0b8: dup
      // 0b9: iload 7
      // 0bb: swap
      // 0bc: iload 7
      // 0be: iaload
      // 0bf: iload 6
      // 0c1: iadd
      // 0c2: iastore
      // 0c3: goto 094
      // 0c6: aload 1
      // 0c7: dup
      // 0c8: dup
      // 0c9: iload 7
      // 0cb: bipush 1
      // 0cc: iadd
      // 0cd: ineg
      // 0ce: istore 6
      // 0d0: getfield f/Xy0.z00 [Ljava/lang/Object;
      // 0d3: dup
      // 0d4: astore 7
      // 0d6: iload 6
      // 0d8: aload 5
      // 0da: aastore
      // 0db: getfield f/Xy0.V5 [I
      // 0de: iload 6
      // 0e0: bipush 1
      // 0e1: iastore
      // 0e2: getfield f/Xy0.xF I
      // 0e5: bipush 1
      // 0e6: iadd
      // 0e7: dup
      // 0e8: istore 5
      // 0ea: aload 1
      // 0eb: dup
      // 0ec: iload 5
      // 0ee: putfield f/Xy0.xF I
      // 0f1: getfield f/Xy0.ij0 I
      // 0f4: if_icmplt 094
      // 0f7: aload 1
      // 0f8: aload 7
      // 0fa: arraylength
      // 0fb: bipush 1
      // 0fc: ishl
      // 0fd: invokevirtual f/Xy0.S50 (I)V
      // 100: goto 094
      // 103: astore 1
      // 104: goto 1b8
      // 107: aload 2
      // 108: invokevirtual f/es_1.ZD ()Lf/I2;
      // 10b: astore 2
      // 10c: aload 2
      // 10d: invokevirtual f/I2.hasNext ()Z
      // 110: ifeq 018
      // 113: aload 1
      // 114: aload 2
      // 115: invokevirtual f/I2.next ()Ljava/lang/Object;
      // 118: checkcast java/lang/String
      // 11b: astore 3
      // 11c: bipush 0
      // 11d: aload 3
      // 11e: invokevirtual f/Xy0.Rl0 (ILjava/lang/Object;)I
      // 121: ifne 10c
      // 124: aload 0
      // 125: aload 3
      // 126: invokevirtual f/hd0_2.Mj (Ljava/lang/String;)V
      // 129: goto 10c
      // 12c: aload 0
      // 12d: getfield f/hd0_2.fi0 Lf/nb_2;
      // 130: dup
      // 131: astore 1
      // 132: bipush 51
      // 134: aload 1
      // 135: getfield f/nb_2.cB0 F
      // 138: invokestatic f/af_1.NK (IF)I
      // 13b: istore 2
      // 13c: getfield f/nb_2.z40 [Ljava/lang/Object;
      // 13f: arraylength
      // 140: iload 2
      // 141: if_icmpgt 14b
      // 144: aload 1
      // 145: invokevirtual f/nb_2.b20 ()V
      // 148: goto 155
      // 14b: aload 1
      // 14c: dup
      // 14d: bipush 0
      // 14e: putfield f/nb_2.Va0 I
      // 151: iload 2
      // 152: invokevirtual f/nb_2.p70 (I)V
      // 155: aload 0
      // 156: getfield f/hd0_2.LJ0 Lf/nb_2;
      // 159: dup
      // 15a: astore 1
      // 15b: bipush 51
      // 15d: aload 1
      // 15e: getfield f/nb_2.cB0 F
      // 161: invokestatic f/af_1.NK (IF)I
      // 164: istore 2
      // 165: getfield f/nb_2.z40 [Ljava/lang/Object;
      // 168: arraylength
      // 169: iload 2
      // 16a: if_icmpgt 174
      // 16d: aload 1
      // 16e: invokevirtual f/nb_2.b20 ()V
      // 171: goto 17e
      // 174: aload 1
      // 175: dup
      // 176: bipush 0
      // 177: putfield f/nb_2.Va0 I
      // 17a: iload 2
      // 17b: invokevirtual f/nb_2.p70 (I)V
      // 17e: aload 0
      // 17f: getfield f/hd0_2.GE Lf/nb_2;
      // 182: dup
      // 183: astore 1
      // 184: bipush 51
      // 186: aload 1
      // 187: getfield f/nb_2.cB0 F
      // 18a: invokestatic f/af_1.NK (IF)I
      // 18d: istore 2
      // 18e: getfield f/nb_2.z40 [Ljava/lang/Object;
      // 191: arraylength
      // 192: iload 2
      // 193: if_icmpgt 19d
      // 196: aload 1
      // 197: invokevirtual f/nb_2.b20 ()V
      // 19a: goto 1a7
      // 19d: aload 1
      // 19e: dup
      // 19f: bipush 0
      // 1a0: putfield f/nb_2.Va0 I
      // 1a3: iload 2
      // 1a4: invokevirtual f/nb_2.p70 (I)V
      // 1a7: aload 0
      // 1a8: dup
      // 1a9: dup
      // 1aa: getfield f/hd0_2.i Lf/es_1;
      // 1ad: invokevirtual f/es_1.clear ()V
      // 1b0: getfield f/hd0_2.aS Lf/es_1;
      // 1b3: invokevirtual f/es_1.clear ()V
      // 1b6: monitorexit
      // 1b7: return
      // 1b8: aload 1
      // 1b9: aload 0
      // 1ba: monitorexit
      // 1bb: athrow
      // 1bc: aload 0
      // 1bd: monitorexit
      // 1be: athrow
      // try (5 -> 8): 236 null
      // try (10 -> 11): 136 null
      // try (13 -> 17): 136 null
      // try (20 -> 23): 136 null
      // try (24 -> 25): 136 null
      // try (27 -> 28): 136 null
      // try (30 -> 32): 136 null
      // try (34 -> 51): 136 null
      // try (53 -> 54): 136 null
      // try (55 -> 57): 136 null
      // try (58 -> 62): 136 null
      // try (63 -> 67): 136 null
      // try (71 -> 73): 136 null
      // try (74 -> 76): 136 null
      // try (77 -> 81): 136 null
      // try (85 -> 86): 136 null
      // try (89 -> 91): 136 null
      // try (92 -> 96): 136 null
      // try (98 -> 100): 136 null
      // try (108 -> 109): 136 null
      // try (111 -> 119): 136 null
      // try (123 -> 128): 136 null
      // try (129 -> 132): 136 null
      // try (134 -> 136): 136 null
      // try (138 -> 140): 136 null
      // try (141 -> 143): 136 null
      // try (144 -> 148): 136 null
      // try (149 -> 152): 136 null
      // try (153 -> 159): 136 null
      // try (162 -> 165): 136 null
      // try (166 -> 168): 136 null
      // try (170 -> 181): 136 null
      // try (184 -> 187): 136 null
      // try (188 -> 190): 136 null
      // try (192 -> 203): 136 null
      // try (206 -> 209): 136 null
      // try (210 -> 212): 136 null
      // try (214 -> 231): 136 null
      // try (232 -> 235): 136 null
      // try (236 -> 238): 236 null
   }

   public final synchronized int R80(String var1) {
      Class var2;
      if ((var2 = (Class)this.LJ0.Wk0(var1)) != null) {
         return ((vs_1)((nb_2)this.fi0.Wk0(var2)).Wk0(var1)).k50;
      } else {
         throw new nf_1(jj0_0.hw0("Asset not loaded: ", var1));
      }
   }

   public final synchronized es_1 FG() {
      return this.LJ0.mC0().Com2();
   }

   public final synchronized Object nc(Class var1, String var2) {
      return this.Og0(var1, var2);
   }

   public final synchronized void v9(int var1, String var2) {
      Class var3;
      if ((var3 = (Class)this.LJ0.Wk0(var2)) != null) {
         ((vs_1)((nb_2)this.fi0.Wk0(var3)).Wk0(var2)).k50 = var1;
      } else {
         throw new nf_1(jj0_0.hw0("Asset not loaded: ", var2));
      }
   }

   public final synchronized Object cOM5(String var1) {
      Class var2;
      nb_2 var3;
      vs_1 var4;
      if ((var2 = (Class)this.LJ0.Wk0(var1)) != null && (var3 = (nb_2)this.fi0.Wk0(var2)) != null && (var4 = (vs_1)var3.Wk0(var1)) != null) {
         return var4.w60;
      } else {
         throw new nf_1(jj0_0.hw0("Asset not loaded: ", var1));
      }
   }

   public final synchronized String RV(fy0_0 var1) {
      us0_0 var2;
      (var2 = this.fi0.mC0()).getClass();

      while (var2.hasNext()) {
         Class var3 = (Class)var2.next();
         a60_0 var6 = ((nb_2)this.fi0.Wk0(var3)).u9();

         while (var6.hasNext()) {
            xn_1 var4;
            Object var5;
            if ((var5 = ((vs_1)(var4 = (xn_1)var6.next()).kM).w60) == var1 || var1.equals(var5)) {
               return (String)var4.I20;
            }
         }
      }

      return null;
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public final void DA(String var1) {
      this.LPt4.QR("Waiting for asset to be loaded: " + var1);

      while (true) {
         synchronized (this) {
            Class var2 = (Class)this.LJ0.Wk0(var1);
            if (var2 != null) {
               nb_2 var3 = (nb_2)this.fi0.Wk0(var2);
               if (var3 != null && (vs_1)var3.Wk0(var1) != null) {
                  this.LPt4.QR("Asset loaded: " + var1);
                  return;
               }
            }

            this.r00();
         }

         Thread.yield();
      }

      /* VineFlower emitted an invalid monitor/finally graph below. The executable
       * implementation above follows the original bytecode's synchronized loop.
      this.LPt4.QR("Waiting for asset to be loaded: " + var1);

      while (true) {
         hd0_2 var10000 = this;
         synchronized (this){} // $VF: monitorenter 

         label319: {
            try {
               var61 = (Class)var10000.LJ0.Wk0(var1);
            } catch (Throwable var58) {
               var60 = var58;
               break label319;
            }

            Class var2 = var61;
            if (var61 != null) {
               try {
                  var62 = (nb_2)this.fi0.Wk0(var2);
               } catch (Throwable var57) {
                  var60 = var57;
                  break label319;
               }

               nb_2 var59 = var62;
               if (var62 != null) {
                  try {
                     var63 = (vs_1)var59.Wk0(var1);
                  } catch (Throwable var56) {
                     var60 = var56;
                     break label319;
                  }

                  if (var63 != null) {
                     try {
                        this.LPt4.QR("Asset loaded: " + var1);
                        // $VF: monitorexit
                        return;
                     } catch (Throwable var53) {
                        var60 = var53;
                        break label319;
                     }
                  }
               }
            }

            try {
               var10000 = this;
               this.r00();
            } catch (Throwable var55) {
               var60 = var55;
               break label319;
            }

            try {
               // $VF: monitorexit
            } catch (Throwable var54) {
               var60 = var54;
               break label319;
            }

            Thread.yield();
            continue;
         }

         while (true) {
            try {
               // $VF: monitorexit
               throw var60;
            } catch (Throwable var52) {
               var60 = var52;
               continue;
            }
         }
       }
      */
    }

    public final synchronized Object Og0(Class var1, String var2) {
      nb_2 var3;
      vs_1 var4;
      if ((var3 = (nb_2)this.fi0.Wk0(var1)) != null && (var4 = (vs_1)var3.Wk0(var2)) != null) {
         return var4.w60;
      } else {
         throw new nf_1(jj0_0.hw0("Asset not loaded: ", var2));
      }
   }

   public final synchronized void qh0(String var1) {
      this.im(var1, Texture.class, null);
   }
}
