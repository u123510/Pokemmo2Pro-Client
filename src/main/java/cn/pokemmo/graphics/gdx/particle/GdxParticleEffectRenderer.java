package cn.pokemmo.graphics.gdx.particle;

import f.*;


import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class GdxParticleEffectRenderer {
   public x9_0 FO;
   public String wh0 = "class";
   public boolean Yv = true;
   public sg_1 tU;
   public final boolean Lm0 = true;
   public final nb_2 TG;
   public final nb_2 py0;
   public final nb_2 F5;
   public final nb_2 OW;
   public final nb_2 IG0;
   public final Object[] bo;
   public final Object[] Cu;

   public GdxParticleEffectRenderer() {
      this.TG = new nb_2();
      this.py0 = new nb_2();
      this.F5 = new nb_2();
      this.OW = new nb_2();
      this.IG0 = new nb_2();
      this.bo = new Object[]{null};
      this.Cu = new Object[]{null};
      this.tU = sg_1.u80;
   }

   public GdxParticleEffectRenderer(sg_1 var1) {
      nb_2 var2;
      var2 = new nb_2();
      this.TG = var2;
      nb_2 var3;
      var3 = new nb_2();
      this.py0 = var3;
      nb_2 var4;
      var4 = new nb_2();
      this.F5 = var4;
      nb_2 var5;
      var5 = new nb_2();
      this.OW = var5;
      nb_2 var6;
      var6 = new nb_2();
      this.IG0 = var6;
      Object[] var7;
      (var7 = new Object[1])[0] = null;
      this.bo = var7;
      Object[] var8;
      (var8 = new Object[1])[0] = null;
      this.Cu = var8;
      this.tU = var1;
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static Object LE(Class var0) {
      Exception var1;
      try {
         return var0.newInstance();
      } catch (Exception var5) {
         var1 = var5;
      }
      try {
         I40 var2 = rd_1.kl(var0);
         var2.cx.setAccessible(true);
         return var2.la();
      } catch (ua_0 var6) {
         throw new WC0("Error constructing instance of class: ".concat(var0.getName()), var6);
      } catch (RuntimeException var4) {
         if (Enum.class.isAssignableFrom(var0)) {
            Object[] var3 = var0.getEnumConstants();
            if (var3 == null) {
               var3 = var0.getSuperclass().getEnumConstants();
            }
            return var3[0];
         }
         if (var0.isArray()) {
            throw new WC0("Encountered JSON object when expected array of type: ".concat(var0.getName()), var1);
         }
         if (var0.isMemberClass() && !Modifier.isStatic(var0.getModifiers())) {
            throw new WC0("Class cannot be created (non-static member class): ".concat(var0.getName()), var1);
         }
         throw new WC0("Class cannot be created (missing no-arg constructor): ".concat(var0.getName()), var1);
      }
   }

   public final EI fE(Class var1) {
      EI var2;
      if ((var2 = (EI)this.TG.Wk0(var1)) != null) {
         return var2;
      }

      es_1 var11;
      var11 = new es_1();

      for (Class var3 = var1; var3 != Object.class; var3 = var3.getSuperclass()) {
         var11.Ue0(var3);
      }

      ArrayList var13;
      var13 = new ArrayList();

      for (int var4 = var11.KB - 1; var4 >= 0; var4--) {
         Field[] var5;
         Field[] var10000 = var5 = ((Class)var11.get(var4)).getDeclaredFields();
         yr0_0[] var6 = new yr0_0[var10000.length];
         int var7 = 0;

         for (int var8 = var10000.length; var7 < var8; var7++) {
            yr0_0 var9;
            var9 = new yr0_0(var5[var7]);
            var6[var7] = var9;
         }

         Collections.addAll(var13, var6);
      }

      var2 = new EI(var13.size());
      int var14 = 0;

      for (int var15 = var13.size(); var14 < var15; var14++) {
         yr0_0 var16;
         if (!Modifier.isTransient((var16 = (yr0_0)var13.get(var14)).cOm5.getModifiers())
            && !Modifier.isStatic(var16.cOm5.getModifiers())
            && !var16.cOm5.isSynthetic()) {
            if (!var16.cOm5.isAccessible()) {
               yr0_0 var18 = var16;
               boolean var17 = true;

               try {
                  var18.cOm5.setAccessible(var17);
               } catch (RuntimeException var10) {
                  continue;
               }
            }

            var2.WK0(var16.cOm5.getName(), new vh0_1(var16));
         }
      }

      this.TG.WK0(var1, var2);
      return var2;
   }

   public final String Lpt2(Object var1) {
      if (var1 instanceof Enum) {
         Enum var2 = (Enum)var1;
         return this.Lm0 ? var2.name() : var2.toString();
      } else {
         return var1 instanceof Class ? ((Class)var1).getName() : String.valueOf(var1);
      }
   }

   public final void GI0(sg_1 var1) {
      this.tU = var1;
   }

   public final void Zx(Writer var1) {
      if (!(var1 instanceof x9_0)) {
         x9_0 var2;
         var2 = new x9_0(var1);
         var1 = var2;
      }

      x9_0 var10000 = (x9_0)var1;
      x9_0 var3;
      x9_0 var10001 = var3 = (x9_0)var1;
      this.FO = var3;
      var10001.R6 = this.tU;
      var10000.p8 = false;
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void Pn(Object var1) {
      Class var2 = var1.getClass();
      EI var3 = this.fE(var2);
      Object[] var4 = null;
      if (this.Yv) {
         if (this.IG0.fl(var2)) {
            var4 = (Object[])this.IG0.Wk0(var2);
         } else {
            try {
               Object var5 = LE(var2);
               var4 = new Object[var3.Va0];
               this.IG0.WK0(var2, var4);
               for (int var6 = 0; var6 < var3.Ub.KB; var6++) {
                  yr0_0 var7 = ((vh0_1)var3.Wk0(var3.Ub.get(var6))).Dp0;
                  var4[var6] = var7.uB(var5);
               }
            } catch (Exception var8) {
               this.IG0.WK0(var2, null);
               var4 = null;
            }
         }
      }
      for (int var9 = 0; var9 < var3.Ub.KB; var9++) {
         vh0_1 var10 = (vh0_1)var3.Wk0(var3.Ub.get(var9));
         yr0_0 var11 = var10.Dp0;
         try {
            Object var12 = var11.uB(var1);
            Object var13 = var4 == null ? null : var4[var9];
            if (var4 != null && (var12 == var13 || var12 != null && var12.equals(var13) || var12 != null && var13 != null && var12.getClass().isArray() && var13.getClass().isArray() && Arrays.deepEquals(new Object[]{var12}, new Object[]{var13}))) {
               continue;
            }
            this.FO.kH0(var11.cOm5.getName());
            this.XH(var12, var11.cOm5.getType(), var10.dk0);
         } catch (WC0 var14) {
            var14.bw(var11 + " (" + var2.getName() + ")");
            throw var14;
         } catch (Exception var15) {
            WC0 var16 = new WC0(var15);
            var16.bw(var11 + " (" + var2.getName() + ")");
            throw var16;
         }
      }
   }

   public final void A2(String var1, Object var2, Class var3, Class var4) {
      GdxParticleEffectRenderer var10000;
      Object var10001;
      try {
         var10000 = this;
         var10001 = var2;
         this.FO.kH0(var1);
      } catch (Exception var5) {
         throw new WC0(var5);
      }

      var10000.XH(var10001, var3, var4);
   }

   public final void XH(Object param1, Class param2, Class param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w "Serialization of a Queue other than the known type is not supported.\nKnown type: "
      // 003: astore 4
      // 005: ldc_w "Serialization of an Array other than the known type is not supported.\nKnown type: "
      // 008: astore 5
      // 00a: aload 1
      // 00b: ifnonnull 01c
      // 00e: aload 0
      // 00f: getfield f/gp_1.FO Lf/x9_0;
      // 012: aconst_null
      // 013: invokevirtual f/x9_0.Yg0 (Ljava/lang/Object;)Lf/x9_0;
      // 016: pop
      // 017: return
      // 018: astore 0
      // 019: goto 6cd
      // 01c: aload 2
      // 01d: ifnull 027
      // 020: aload 2
      // 021: invokevirtual java/lang/Class.isPrimitive ()Z
      // 024: ifne 6c3
      // 027: ldc java/lang/String
      // 029: aload 2
      // 02a: swap
      // 02b: if_acmpeq 6c3
      // 02e: ldc_w java/lang/Integer
      // 031: aload 2
      // 032: swap
      // 033: if_acmpeq 6c3
      // 036: ldc_w java/lang/Boolean
      // 039: aload 2
      // 03a: swap
      // 03b: if_acmpeq 6c3
      // 03e: ldc_w java/lang/Float
      // 041: aload 2
      // 042: swap
      // 043: if_acmpeq 6c3
      // 046: ldc_w java/lang/Long
      // 049: aload 2
      // 04a: swap
      // 04b: if_acmpeq 6c3
      // 04e: ldc_w java/lang/Double
      // 051: aload 2
      // 052: swap
      // 053: if_acmpeq 6c3
      // 056: ldc_w java/lang/Short
      // 059: aload 2
      // 05a: swap
      // 05b: if_acmpeq 6c3
      // 05e: ldc_w java/lang/Byte
      // 061: aload 2
      // 062: swap
      // 063: if_acmpeq 6c3
      // 066: ldc_w java/lang/Character
      // 069: aload 2
      // 06a: swap
      // 06b: if_acmpne 071
      // 06e: goto 6c3
      // 071: aload 1
      // 072: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 075: dup
      // 076: astore 6
      // 078: invokevirtual java/lang/Class.isPrimitive ()Z
      // 07b: ifne 6ad
      // 07e: ldc java/lang/String
      // 080: aload 6
      // 082: swap
      // 083: if_acmpeq 6ad
      // 086: ldc_w java/lang/Integer
      // 089: aload 6
      // 08b: swap
      // 08c: if_acmpeq 6ad
      // 08f: ldc_w java/lang/Boolean
      // 092: aload 6
      // 094: swap
      // 095: if_acmpeq 6ad
      // 098: ldc_w java/lang/Float
      // 09b: aload 6
      // 09d: swap
      // 09e: if_acmpeq 6ad
      // 0a1: ldc_w java/lang/Long
      // 0a4: aload 6
      // 0a6: swap
      // 0a7: if_acmpeq 6ad
      // 0aa: ldc_w java/lang/Double
      // 0ad: aload 6
      // 0af: swap
      // 0b0: if_acmpeq 6ad
      // 0b3: ldc_w java/lang/Short
      // 0b6: aload 6
      // 0b8: swap
      // 0b9: if_acmpeq 6ad
      // 0bc: ldc_w java/lang/Byte
      // 0bf: aload 6
      // 0c1: swap
      // 0c2: if_acmpeq 6ad
      // 0c5: ldc_w java/lang/Character
      // 0c8: aload 6
      // 0ca: swap
      // 0cb: if_acmpne 0d1
      // 0ce: goto 6ad
      // 0d1: aload 1
      // 0d2: instanceof f/VD0
      // 0d5: ifeq 0ee
      // 0d8: aload 0
      // 0d9: aload 6
      // 0db: aload 2
      // 0dc: invokevirtual f/gp_1.bg (Ljava/lang/Class;Ljava/lang/Class;)V
      // 0df: aload 1
      // 0e0: checkcast f/VD0
      // 0e3: aload 0
      // 0e4: invokeinterface f/VD0.write (Lf/gp_1;)V 2
      // 0e9: aload 0
      // 0ea: invokevirtual f/gp_1.d10 ()V
      // 0ed: return
      // 0ee: aload 0
      // 0ef: getfield f/gp_1.OW Lf/nb_2;
      // 0f2: aload 6
      // 0f4: invokevirtual f/nb_2.Wk0 (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f7: checkcast f/com1__0
      // 0fa: ifnull 0fe
      // 0fd: return
      // 0fe: aload 1
      // 0ff: instanceof f/es_1
      // 102: ifeq 16b
      // 105: aload 2
      // 106: ifnull 13d
      // 109: aload 6
      // 10b: aload 2
      // 10c: if_acmpeq 13d
      // 10f: ldc f/es_1
      // 111: aload 6
      // 113: swap
      // 114: if_acmpne 11a
      // 117: goto 13d
      // 11a: new f/WC0
      // 11d: dup
      // 11e: new java/lang/StringBuilder
      // 121: dup
      // 122: aload 5
      // 124: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 127: aload 2
      // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 12b: ldc_w "\nActual type: "
      // 12e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 131: aload 6
      // 133: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 136: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 139: invokespecial f/WC0.<init> (Ljava/lang/String;)V
      // 13c: athrow
      // 13d: aload 0
      // 13e: invokevirtual f/gp_1.LV ()V
      // 141: aload 1
      // 142: checkcast f/es_1
      // 145: dup
      // 146: astore 1
      // 147: bipush 0
      // 148: istore 2
      // 149: getfield f/es_1.KB I
      // 14c: istore 4
      // 14e: iload 2
      // 14f: iload 4
      // 151: if_icmpge 166
      // 154: aload 1
      // 155: iload 2
      // 156: invokevirtual f/es_1.get (I)Ljava/lang/Object;
      // 159: aload 0
      // 15a: swap
      // 15b: aload 3
      // 15c: aconst_null
      // 15d: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 160: iinc 2 1
      // 163: goto 14e
      // 166: aload 0
      // 167: invokevirtual f/gp_1.xy ()V
      // 16a: return
      // 16b: aload 1
      // 16c: instanceof f/y60_0
      // 16f: ifeq 1d9
      // 172: aload 2
      // 173: ifnull 1ab
      // 176: aload 6
      // 178: aload 2
      // 179: if_acmpeq 1ab
      // 17c: ldc_w f/y60_0
      // 17f: aload 6
      // 181: swap
      // 182: if_acmpne 188
      // 185: goto 1ab
      // 188: new f/WC0
      // 18b: dup
      // 18c: new java/lang/StringBuilder
      // 18f: dup
      // 190: aload 4
      // 192: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 195: aload 2
      // 196: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 199: ldc_w "\nActual type: "
      // 19c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19f: aload 6
      // 1a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1a4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a7: invokespecial f/WC0.<init> (Ljava/lang/String;)V
      // 1aa: athrow
      // 1ab: aload 0
      // 1ac: invokevirtual f/gp_1.LV ()V
      // 1af: aload 1
      // 1b0: checkcast f/y60_0
      // 1b3: dup
      // 1b4: astore 1
      // 1b5: bipush 0
      // 1b6: istore 2
      // 1b7: getfield f/y60_0.IR I
      // 1ba: istore 4
      // 1bc: iload 2
      // 1bd: iload 4
      // 1bf: if_icmpge 1d4
      // 1c2: aload 1
      // 1c3: iload 2
      // 1c4: invokevirtual f/y60_0.get (I)Ljava/lang/Object;
      // 1c7: aload 0
      // 1c8: swap
      // 1c9: aload 3
      // 1ca: aconst_null
      // 1cb: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 1ce: iinc 2 1
      // 1d1: goto 1bc
      // 1d4: aload 0
      // 1d5: invokevirtual f/gp_1.xy ()V
      // 1d8: return
      // 1d9: aload 1
      // 1da: instanceof java/util/Collection
      // 1dd: ifeq 262
      // 1e0: aload 0
      // 1e1: getfield f/gp_1.wh0 Ljava/lang/String;
      // 1e4: ifnull 236
      // 1e7: ldc java/util/ArrayList
      // 1e9: aload 6
      // 1eb: swap
      // 1ec: if_acmpeq 236
      // 1ef: aload 2
      // 1f0: ifnull 1f9
      // 1f3: aload 2
      // 1f4: aload 6
      // 1f6: if_acmpeq 236
      // 1f9: aload 0
      // 1fa: aload 6
      // 1fc: aload 2
      // 1fd: invokevirtual f/gp_1.bg (Ljava/lang/Class;Ljava/lang/Class;)V
      // 200: ldc_w "items"
      // 203: aload 0
      // 204: swap
      // 205: invokevirtual f/gp_1.Sm0 (Ljava/lang/String;)V
      // 208: aload 1
      // 209: checkcast java/util/Collection
      // 20c: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 211: astore 1
      // 212: aload 1
      // 213: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 218: ifeq 22b
      // 21b: aload 1
      // 21c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 221: aload 0
      // 222: swap
      // 223: aload 3
      // 224: aconst_null
      // 225: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 228: goto 212
      // 22b: aload 0
      // 22c: invokevirtual f/gp_1.xy ()V
      // 22f: aload 0
      // 230: invokevirtual f/gp_1.d10 ()V
      // 233: goto 261
      // 236: aload 0
      // 237: invokevirtual f/gp_1.LV ()V
      // 23a: aload 1
      // 23b: checkcast java/util/Collection
      // 23e: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 243: astore 1
      // 244: aload 1
      // 245: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 24a: ifeq 25d
      // 24d: aload 1
      // 24e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 253: aload 0
      // 254: swap
      // 255: aload 3
      // 256: aconst_null
      // 257: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 25a: goto 244
      // 25d: aload 0
      // 25e: invokevirtual f/gp_1.xy ()V
      // 261: return
      // 262: aload 6
      // 264: invokevirtual java/lang/Class.isArray ()Z
      // 267: ifeq 29e
      // 26a: aload 3
      // 26b: ifnonnull 274
      // 26e: aload 6
      // 270: invokevirtual java/lang/Class.getComponentType ()Ljava/lang/Class;
      // 273: astore 3
      // 274: aload 1
      // 275: invokestatic java/lang/reflect/Array.getLength (Ljava/lang/Object;)I
      // 278: istore 2
      // 279: aload 0
      // 27a: invokevirtual f/gp_1.LV ()V
      // 27d: bipush 0
      // 27e: istore 4
      // 280: iload 4
      // 282: iload 2
      // 283: if_icmpge 299
      // 286: aload 1
      // 287: iload 4
      // 289: invokestatic java/lang/reflect/Array.get (Ljava/lang/Object;I)Ljava/lang/Object;
      // 28c: aload 0
      // 28d: swap
      // 28e: aload 3
      // 28f: aconst_null
      // 290: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 293: iinc 4 1
      // 296: goto 280
      // 299: aload 0
      // 29a: invokevirtual f/gp_1.xy ()V
      // 29d: return
      // 29e: aload 1
      // 29f: instanceof f/nb_2
      // 2a2: ifeq 2f4
      // 2a5: aload 2
      // 2a6: ifnonnull 2ac
      // 2a9: ldc f/nb_2
      // 2ab: astore 2
      // 2ac: aload 0
      // 2ad: aload 6
      // 2af: aload 2
      // 2b0: invokevirtual f/gp_1.bg (Ljava/lang/Class;Ljava/lang/Class;)V
      // 2b3: aload 1
      // 2b4: checkcast f/nb_2
      // 2b7: invokevirtual f/nb_2.lb0 ()Lf/a60_0;
      // 2ba: dup
      // 2bb: astore 1
      // 2bc: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2bf: pop
      // 2c0: aload 1
      // 2c1: invokevirtual f/a60_0.hasNext ()Z
      // 2c4: ifeq 2ef
      // 2c7: aload 1
      // 2c8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2cd: checkcast f/xn_1
      // 2d0: dup
      // 2d1: aload 0
      // 2d2: getfield f/gp_1.FO Lf/x9_0;
      // 2d5: swap
      // 2d6: getfield f/xn_1.I20 Ljava/lang/Object;
      // 2d9: aload 0
      // 2da: swap
      // 2db: invokevirtual f/gp_1.Lpt2 (Ljava/lang/Object;)Ljava/lang/String;
      // 2de: invokevirtual f/x9_0.kH0 (Ljava/lang/String;)Lf/x9_0;
      // 2e1: pop
      // 2e2: getfield f/xn_1.kM Ljava/lang/Object;
      // 2e5: aload 0
      // 2e6: swap
      // 2e7: aload 3
      // 2e8: aconst_null
      // 2e9: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 2ec: goto 2c0
      // 2ef: aload 0
      // 2f0: invokevirtual f/gp_1.d10 ()V
      // 2f3: return
      // 2f4: aload 1
      // 2f5: instanceof f/Xy0
      // 2f8: ifeq 350
      // 2fb: aload 2
      // 2fc: ifnonnull 303
      // 2ff: ldc_w f/Xy0
      // 302: astore 2
      // 303: aload 0
      // 304: aload 6
      // 306: aload 2
      // 307: invokevirtual f/gp_1.bg (Ljava/lang/Class;Ljava/lang/Class;)V
      // 30a: aload 1
      // 30b: checkcast f/Xy0
      // 30e: invokevirtual f/Xy0.HI0 ()Lf/hh0_2;
      // 311: dup
      // 312: astore 1
      // 313: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 316: pop
      // 317: aload 1
      // 318: invokevirtual f/hh0_2.hasNext ()Z
      // 31b: ifeq 34b
      // 31e: aload 1
      // 31f: invokevirtual f/hh0_2.next ()Ljava/lang/Object;
      // 322: checkcast f/RC0
      // 325: dup
      // 326: aload 0
      // 327: getfield f/gp_1.FO Lf/x9_0;
      // 32a: swap
      // 32b: getfield f/RC0.Rp0 Ljava/lang/Object;
      // 32e: aload 0
      // 32f: swap
      // 330: invokevirtual f/gp_1.Lpt2 (Ljava/lang/Object;)Ljava/lang/String;
      // 333: invokevirtual f/x9_0.kH0 (Ljava/lang/String;)Lf/x9_0;
      // 336: pop
      // 337: getfield f/RC0.Jy0 I
      // 33a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 33d: ldc_w java/lang/Integer
      // 340: astore 2
      // 341: aload 0
      // 342: swap
      // 343: aload 2
      // 344: aconst_null
      // 345: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 348: goto 317
      // 34b: aload 0
      // 34c: invokevirtual f/gp_1.d10 ()V
      // 34f: return
      // 350: aload 1
      // 351: instanceof f/IY
      // 354: ifeq 3ac
      // 357: aload 2
      // 358: ifnonnull 35f
      // 35b: ldc_w f/IY
      // 35e: astore 2
      // 35f: aload 0
      // 360: aload 6
      // 362: aload 2
      // 363: invokevirtual f/gp_1.bg (Ljava/lang/Class;Ljava/lang/Class;)V
      // 366: aload 1
      // 367: checkcast f/IY
      // 36a: invokevirtual f/IY.dR ()Lf/Gx0;
      // 36d: dup
      // 36e: astore 1
      // 36f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 372: pop
      // 373: aload 1
      // 374: invokevirtual f/Gx0.hasNext ()Z
      // 377: ifeq 3a7
      // 37a: aload 1
      // 37b: invokevirtual f/Gx0.next ()Ljava/lang/Object;
      // 37e: checkcast f/te0_2
      // 381: dup
      // 382: aload 0
      // 383: getfield f/gp_1.FO Lf/x9_0;
      // 386: swap
      // 387: getfield f/te0_2.ir Ljava/lang/Object;
      // 38a: aload 0
      // 38b: swap
      // 38c: invokevirtual f/gp_1.Lpt2 (Ljava/lang/Object;)Ljava/lang/String;
      // 38f: invokevirtual f/x9_0.kH0 (Ljava/lang/String;)Lf/x9_0;
      // 392: pop
      // 393: getfield f/te0_2.R60 F
      // 396: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 399: ldc_w java/lang/Float
      // 39c: astore 2
      // 39d: aload 0
      // 39e: swap
      // 39f: aload 2
      // 3a0: aconst_null
      // 3a1: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 3a4: goto 373
      // 3a7: aload 0
      // 3a8: invokevirtual f/gp_1.d10 ()V
      // 3ab: return
      // 3ac: aload 1
      // 3ad: instanceof f/af_1
      // 3b0: ifeq 3f7
      // 3b3: aload 2
      // 3b4: ifnonnull 3bb
      // 3b7: ldc_w f/af_1
      // 3ba: astore 2
      // 3bb: aload 0
      // 3bc: aload 6
      // 3be: aload 2
      // 3bf: invokevirtual f/gp_1.bg (Ljava/lang/Class;Ljava/lang/Class;)V
      // 3c2: aload 0
      // 3c3: getfield f/gp_1.FO Lf/x9_0;
      // 3c6: ldc_w "values"
      // 3c9: invokevirtual f/x9_0.kH0 (Ljava/lang/String;)Lf/x9_0;
      // 3cc: pop
      // 3cd: aload 0
      // 3ce: invokevirtual f/gp_1.LV ()V
      // 3d1: aload 1
      // 3d2: checkcast f/af_1
      // 3d5: invokevirtual f/af_1.xA0 ()Lf/YH;
      // 3d8: astore 1
      // 3d9: aload 1
      // 3da: invokevirtual f/YH.hasNext ()Z
      // 3dd: ifeq 3ee
      // 3e0: aload 1
      // 3e1: invokevirtual f/YH.next ()Ljava/lang/Object;
      // 3e4: aload 0
      // 3e5: swap
      // 3e6: aload 3
      // 3e7: aconst_null
      // 3e8: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 3eb: goto 3d9
      // 3ee: aload 0
      // 3ef: invokevirtual f/gp_1.xy ()V
      // 3f2: aload 0
      // 3f3: invokevirtual f/gp_1.d10 ()V
      // 3f6: return
      // 3f7: aload 1
      // 3f8: instanceof f/nl_1
      // 3fb: ifeq 44a
      // 3fe: aload 2
      // 3ff: ifnonnull 406
      // 402: ldc_w f/nl_1
      // 405: astore 2
      // 406: aload 0
      // 407: aload 6
      // 409: aload 2
      // 40a: invokevirtual f/gp_1.bg (Ljava/lang/Class;Ljava/lang/Class;)V
      // 40d: aload 1
      // 40e: checkcast f/nl_1
      // 411: invokevirtual f/nl_1.Cs ()Lf/ic_2;
      // 414: dup
      // 415: astore 1
      // 416: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 419: pop
      // 41a: aload 1
      // 41b: invokevirtual f/ic_2.hasNext ()Z
      // 41e: ifeq 445
      // 421: aload 1
      // 422: invokevirtual f/ic_2.next ()Ljava/lang/Object;
      // 425: checkcast f/hs_1
      // 428: dup
      // 429: aload 0
      // 42a: getfield f/gp_1.FO Lf/x9_0;
      // 42d: swap
      // 42e: getfield f/hs_1.ZR I
      // 431: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
      // 434: invokevirtual f/x9_0.kH0 (Ljava/lang/String;)Lf/x9_0;
      // 437: pop
      // 438: getfield f/hs_1.yJ0 Ljava/lang/Object;
      // 43b: aload 0
      // 43c: swap
      // 43d: aload 3
      // 43e: aconst_null
      // 43f: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 442: goto 41a
      // 445: aload 0
      // 446: invokevirtual f/gp_1.d10 ()V
      // 449: return
      // 44a: aload 1
      // 44b: instanceof f/J7
      // 44e: ifeq 49d
      // 451: aload 2
      // 452: ifnonnull 459
      // 455: ldc_w f/J7
      // 458: astore 2
      // 459: aload 0
      // 45a: aload 6
      // 45c: aload 2
      // 45d: invokevirtual f/gp_1.bg (Ljava/lang/Class;Ljava/lang/Class;)V
      // 460: aload 1
      // 461: checkcast f/J7
      // 464: invokevirtual f/J7.Lx0 ()Lf/ko_0;
      // 467: dup
      // 468: astore 1
      // 469: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 46c: pop
      // 46d: aload 1
      // 46e: invokevirtual f/ko_0.hasNext ()Z
      // 471: ifeq 498
      // 474: aload 1
      // 475: invokevirtual f/ko_0.next ()Ljava/lang/Object;
      // 478: checkcast f/W3
      // 47b: dup
      // 47c: aload 0
      // 47d: getfield f/gp_1.FO Lf/x9_0;
      // 480: swap
      // 481: getfield f/W3.JL0 J
      // 484: invokestatic java/lang/String.valueOf (J)Ljava/lang/String;
      // 487: invokevirtual f/x9_0.kH0 (Ljava/lang/String;)Lf/x9_0;
      // 48a: pop
      // 48b: getfield f/W3.uG0 Ljava/lang/Object;
      // 48e: aload 0
      // 48f: swap
      // 490: aload 3
      // 491: aconst_null
      // 492: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 495: goto 46d
      // 498: aload 0
      // 499: invokevirtual f/gp_1.d10 ()V
      // 49c: return
      // 49d: aload 1
      // 49e: instanceof f/z5
      // 4a1: ifeq 559
      // 4a4: aload 2
      // 4a5: ifnonnull 4ac
      // 4a8: ldc_w f/z5
      // 4ab: astore 2
      // 4ac: aload 0
      // 4ad: aload 6
      // 4af: aload 2
      // 4b0: invokevirtual f/gp_1.bg (Ljava/lang/Class;Ljava/lang/Class;)V
      // 4b3: aload 0
      // 4b4: getfield f/gp_1.FO Lf/x9_0;
      // 4b7: ldc_w "values"
      // 4ba: invokevirtual f/x9_0.kH0 (Ljava/lang/String;)Lf/x9_0;
      // 4bd: pop
      // 4be: aload 0
      // 4bf: invokevirtual f/gp_1.LV ()V
      // 4c2: aload 1
      // 4c3: checkcast f/z5
      // 4c6: invokevirtual f/z5.ME0 ()Lf/gq_0;
      // 4c9: astore 1
      // 4ca: aload 1
      // 4cb: getfield f/gq_0.p8 Z
      // 4ce: dup
      // 4cf: istore 2
      // 4d0: ifeq 550
      // 4d3: iload 2
      // 4d4: ifeq 548
      // 4d7: aload 1
      // 4d8: getfield f/gq_0.jF0 Z
      // 4db: ifeq 53d
      // 4de: aload 1
      // 4df: getfield f/gq_0.E7 I
      // 4e2: dup
      // 4e3: istore 2
      // 4e4: bipush -1
      // 4e5: if_icmpne 4ed
      // 4e8: bipush 0
      // 4e9: istore 2
      // 4ea: goto 4f7
      // 4ed: aload 1
      // 4ee: getfield f/gq_0.u9 Lf/z5;
      // 4f1: getfield f/z5.Ms [I
      // 4f4: iload 2
      // 4f5: iaload
      // 4f6: istore 2
      // 4f7: aload 1
      // 4f8: getfield f/gq_0.u9 Lf/z5;
      // 4fb: getfield f/z5.Ms [I
      // 4fe: dup
      // 4ff: astore 3
      // 500: arraylength
      // 501: istore 4
      // 503: aload 1
      // 504: getfield f/gq_0.E7 I
      // 507: bipush 1
      // 508: iadd
      // 509: dup
      // 50a: istore 5
      // 50c: iload 4
      // 50e: aload 1
      // 50f: iload 5
      // 511: putfield f/gq_0.E7 I
      // 514: if_icmpge 526
      // 517: aload 3
      // 518: iload 5
      // 51a: iaload
      // 51b: ifeq 503
      // 51e: aload 1
      // 51f: bipush 1
      // 520: putfield f/gq_0.p8 Z
      // 523: goto 52b
      // 526: aload 1
      // 527: bipush 0
      // 528: putfield f/gq_0.p8 Z
      // 52b: iload 2
      // 52c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 52f: ldc_w java/lang/Integer
      // 532: astore 2
      // 533: aload 0
      // 534: swap
      // 535: aload 2
      // 536: aconst_null
      // 537: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 53a: goto 4ca
      // 53d: new f/nf_1
      // 540: dup
      // 541: ldc_w "#iterator() cannot be used nested."
      // 544: invokespecial f/nf_1.<init> (Ljava/lang/String;)V
      // 547: athrow
      // 548: new java/util/NoSuchElementException
      // 54b: dup
      // 54c: invokespecial java/util/NoSuchElementException.<init> ()V
      // 54f: athrow
      // 550: aload 0
      // 551: invokevirtual f/gp_1.xy ()V
      // 554: aload 0
      // 555: invokevirtual f/gp_1.d10 ()V
      // 558: return
      // 559: aload 1
      // 55a: instanceof f/cf_2
      // 55d: ifeq 5ad
      // 560: aload 2
      // 561: ifnonnull 568
      // 564: ldc_w f/cf_2
      // 567: astore 2
      // 568: aload 0
      // 569: aload 6
      // 56b: aload 2
      // 56c: invokevirtual f/gp_1.bg (Ljava/lang/Class;Ljava/lang/Class;)V
      // 56f: aload 1
      // 570: checkcast f/cf_2
      // 573: dup
      // 574: astore 1
      // 575: bipush 0
      // 576: istore 2
      // 577: getfield f/cf_2.tb0 I
      // 57a: istore 4
      // 57c: iload 2
      // 57d: iload 4
      // 57f: if_icmpge 5a8
      // 582: aload 1
      // 583: aload 0
      // 584: getfield f/gp_1.FO Lf/x9_0;
      // 587: aload 1
      // 588: getfield f/cf_2.ev [Ljava/lang/Object;
      // 58b: iload 2
      // 58c: aaload
      // 58d: aload 0
      // 58e: swap
      // 58f: invokevirtual f/gp_1.Lpt2 (Ljava/lang/Object;)Ljava/lang/String;
      // 592: invokevirtual f/x9_0.kH0 (Ljava/lang/String;)Lf/x9_0;
      // 595: pop
      // 596: getfield f/cf_2.hv [Ljava/lang/Object;
      // 599: iload 2
      // 59a: aaload
      // 59b: aload 0
      // 59c: swap
      // 59d: aload 3
      // 59e: aconst_null
      // 59f: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 5a2: iinc 2 1
      // 5a5: goto 57c
      // 5a8: aload 0
      // 5a9: invokevirtual f/gp_1.d10 ()V
      // 5ac: return
      // 5ad: aload 1
      // 5ae: instanceof java/util/Map
      // 5b1: ifeq 60c
      // 5b4: aload 2
      // 5b5: ifnonnull 5bc
      // 5b8: ldc_w java/util/HashMap
      // 5bb: astore 2
      // 5bc: aload 0
      // 5bd: aload 6
      // 5bf: aload 2
      // 5c0: invokevirtual f/gp_1.bg (Ljava/lang/Class;Ljava/lang/Class;)V
      // 5c3: aload 1
      // 5c4: checkcast java/util/Map
      // 5c7: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 5cc: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 5d1: astore 1
      // 5d2: aload 1
      // 5d3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5d8: ifeq 607
      // 5db: aload 1
      // 5dc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5e1: checkcast java/util/Map$Entry
      // 5e4: dup
      // 5e5: aload 0
      // 5e6: getfield f/gp_1.FO Lf/x9_0;
      // 5e9: swap
      // 5ea: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 5ef: aload 0
      // 5f0: swap
      // 5f1: invokevirtual f/gp_1.Lpt2 (Ljava/lang/Object;)Ljava/lang/String;
      // 5f4: invokevirtual f/x9_0.kH0 (Ljava/lang/String;)Lf/x9_0;
      // 5f7: pop
      // 5f8: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 5fd: aload 0
      // 5fe: swap
      // 5ff: aload 3
      // 600: aconst_null
      // 601: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 604: goto 5d2
      // 607: aload 0
      // 608: invokevirtual f/gp_1.d10 ()V
      // 60b: return
      // 60c: ldc java/lang/Enum
      // 60e: aload 6
      // 610: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 613: ifeq 69c
      // 616: aload 6
      // 618: invokevirtual java/lang/Class.getEnumConstants ()[Ljava/lang/Object;
      // 61b: ifnonnull 625
      // 61e: aload 6
      // 620: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 623: astore 6
      // 625: aload 0
      // 626: getfield f/gp_1.wh0 Ljava/lang/String;
      // 629: ifnull 675
      // 62c: aload 2
      // 62d: ifnull 636
      // 630: aload 2
      // 631: aload 6
      // 633: if_acmpeq 675
      // 636: aload 0
      // 637: aload 6
      // 639: aconst_null
      // 63a: invokevirtual f/gp_1.bg (Ljava/lang/Class;Ljava/lang/Class;)V
      // 63d: aload 0
      // 63e: getfield f/gp_1.FO Lf/x9_0;
      // 641: ldc_w "value"
      // 644: invokevirtual f/x9_0.kH0 (Ljava/lang/String;)Lf/x9_0;
      // 647: pop
      // 648: aload 0
      // 649: getfield f/gp_1.FO Lf/x9_0;
      // 64c: astore 2
      // 64d: aload 1
      // 64e: checkcast java/lang/Enum
      // 651: astore 1
      // 652: aload 0
      // 653: getfield f/gp_1.Lm0 Z
      // 656: ifeq 661
      // 659: aload 1
      // 65a: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 65d: astore 1
      // 65e: goto 668
      // 661: aload 1
      // 662: invokevirtual java/lang/Enum.toString ()Ljava/lang/String;
      // 665: goto 65d
      // 668: aload 2
      // 669: aload 1
      // 66a: invokevirtual f/x9_0.Yg0 (Ljava/lang/Object;)Lf/x9_0;
      // 66d: pop
      // 66e: aload 0
      // 66f: invokevirtual f/gp_1.d10 ()V
      // 672: goto 69b
      // 675: aload 0
      // 676: getfield f/gp_1.FO Lf/x9_0;
      // 679: astore 2
      // 67a: aload 1
      // 67b: checkcast java/lang/Enum
      // 67e: astore 1
      // 67f: aload 0
      // 680: getfield f/gp_1.Lm0 Z
      // 683: ifeq 68e
      // 686: aload 1
      // 687: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 68a: astore 0
      // 68b: goto 695
      // 68e: aload 1
      // 68f: invokevirtual java/lang/Enum.toString ()Ljava/lang/String;
      // 692: goto 68a
      // 695: aload 2
      // 696: aload 0
      // 697: invokevirtual f/x9_0.Yg0 (Ljava/lang/Object;)Lf/x9_0;
      // 69a: pop
      // 69b: return
      // 69c: aload 0
      // 69d: aload 6
      // 69f: aload 2
      // 6a0: invokevirtual f/gp_1.bg (Ljava/lang/Class;Ljava/lang/Class;)V
      // 6a3: aload 0
      // 6a4: aload 1
      // 6a5: invokevirtual f/gp_1.Pn (Ljava/lang/Object;)V
      // 6a8: aload 0
      // 6a9: invokevirtual f/gp_1.d10 ()V
      // 6ac: return
      // 6ad: aload 0
      // 6ae: aload 6
      // 6b0: aconst_null
      // 6b1: invokevirtual f/gp_1.bg (Ljava/lang/Class;Ljava/lang/Class;)V
      // 6b4: ldc_w "value"
      // 6b7: astore 2
      // 6b8: aload 0
      // 6b9: aload 1
      // 6ba: aload 2
      // 6bb: invokevirtual f/gp_1.v80 (Ljava/lang/Object;Ljava/lang/String;)V
      // 6be: aload 0
      // 6bf: invokevirtual f/gp_1.d10 ()V
      // 6c2: return
      // 6c3: aload 0
      // 6c4: getfield f/gp_1.FO Lf/x9_0;
      // 6c7: aload 1
      // 6c8: invokevirtual f/x9_0.Yg0 (Ljava/lang/Object;)Lf/x9_0;
      // 6cb: pop
      // 6cc: return
      // 6cd: new f/WC0
      // 6d0: dup
      // 6d1: aload 0
      // 6d2: invokespecial f/WC0.<init> (Ljava/lang/Throwable;)V
      // 6d5: athrow
      // try (6 -> 10): 12 java/io/IOException
      // try (16 -> 18): 12 java/io/IOException
      // try (19 -> 20): 12 java/io/IOException
      // try (23 -> 24): 12 java/io/IOException
      // try (27 -> 28): 12 java/io/IOException
      // try (31 -> 32): 12 java/io/IOException
      // try (35 -> 36): 12 java/io/IOException
      // try (39 -> 40): 12 java/io/IOException
      // try (43 -> 44): 12 java/io/IOException
      // try (47 -> 48): 12 java/io/IOException
      // try (51 -> 52): 12 java/io/IOException
      // try (56 -> 58): 12 java/io/IOException
      // try (60 -> 61): 12 java/io/IOException
      // try (62 -> 63): 12 java/io/IOException
      // try (66 -> 67): 12 java/io/IOException
      // try (70 -> 71): 12 java/io/IOException
      // try (74 -> 75): 12 java/io/IOException
      // try (78 -> 79): 12 java/io/IOException
      // try (82 -> 83): 12 java/io/IOException
      // try (86 -> 87): 12 java/io/IOException
      // try (90 -> 91): 12 java/io/IOException
      // try (94 -> 95): 12 java/io/IOException
      // try (99 -> 101): 12 java/io/IOException
      // try (102 -> 112): 12 java/io/IOException
      // try (113 -> 118): 12 java/io/IOException
      // try (120 -> 122): 12 java/io/IOException
      // try (128 -> 129): 12 java/io/IOException
      // try (133 -> 152): 12 java/io/IOException
      // try (156 -> 157): 12 java/io/IOException
      // try (161 -> 169): 12 java/io/IOException
      // try (171 -> 173): 12 java/io/IOException
      // try (174 -> 176): 12 java/io/IOException
      // try (182 -> 183): 12 java/io/IOException
      // try (187 -> 206): 12 java/io/IOException
      // try (210 -> 211): 12 java/io/IOException
      // try (215 -> 223): 12 java/io/IOException
      // try (225 -> 227): 12 java/io/IOException
      // try (228 -> 230): 12 java/io/IOException
      // try (231 -> 233): 12 java/io/IOException
      // try (234 -> 235): 12 java/io/IOException
      // try (243 -> 254): 12 java/io/IOException
      // try (255 -> 257): 12 java/io/IOException
      // try (258 -> 276): 12 java/io/IOException
      // try (277 -> 279): 12 java/io/IOException
      // try (280 -> 290): 12 java/io/IOException
      // try (291 -> 293): 12 java/io/IOException
      // try (296 -> 298): 12 java/io/IOException
      // try (299 -> 301): 12 java/io/IOException
      // try (302 -> 304): 12 java/io/IOException
      // try (309 -> 317): 12 java/io/IOException
      // try (319 -> 321): 12 java/io/IOException
      // try (322 -> 324): 12 java/io/IOException
      // try (327 -> 328): 12 java/io/IOException
      // try (329 -> 336): 12 java/io/IOException
      // try (338 -> 339): 12 java/io/IOException
      // try (340 -> 342): 12 java/io/IOException
      // try (343 -> 346): 12 java/io/IOException
      // try (347 -> 355): 12 java/io/IOException
      // try (356 -> 365): 12 java/io/IOException
      // try (366 -> 368): 12 java/io/IOException
      // try (371 -> 372): 12 java/io/IOException
      // try (373 -> 380): 12 java/io/IOException
      // try (382 -> 383): 12 java/io/IOException
      // try (384 -> 386): 12 java/io/IOException
      // try (387 -> 390): 12 java/io/IOException
      // try (391 -> 399): 12 java/io/IOException
      // try (400 -> 403): 12 java/io/IOException
      // try (404 -> 412): 12 java/io/IOException
      // try (413 -> 415): 12 java/io/IOException
      // try (418 -> 419): 12 java/io/IOException
      // try (420 -> 427): 12 java/io/IOException
      // try (429 -> 430): 12 java/io/IOException
      // try (431 -> 433): 12 java/io/IOException
      // try (434 -> 437): 12 java/io/IOException
      // try (438 -> 446): 12 java/io/IOException
      // try (447 -> 450): 12 java/io/IOException
      // try (451 -> 459): 12 java/io/IOException
      // try (460 -> 462): 12 java/io/IOException
      // try (465 -> 466): 12 java/io/IOException
      // try (467 -> 475): 12 java/io/IOException
      // try (476 -> 481): 12 java/io/IOException
      // try (482 -> 484): 12 java/io/IOException
      // try (485 -> 497): 12 java/io/IOException
      // try (498 -> 500): 12 java/io/IOException
      // try (503 -> 504): 12 java/io/IOException
      // try (505 -> 512): 12 java/io/IOException
      // try (514 -> 515): 12 java/io/IOException
      // try (516 -> 518): 12 java/io/IOException
      // try (519 -> 522): 12 java/io/IOException
      // try (523 -> 529): 12 java/io/IOException
      // try (530 -> 539): 12 java/io/IOException
      // try (540 -> 542): 12 java/io/IOException
      // try (545 -> 546): 12 java/io/IOException
      // try (547 -> 554): 12 java/io/IOException
      // try (556 -> 557): 12 java/io/IOException
      // try (558 -> 560): 12 java/io/IOException
      // try (561 -> 564): 12 java/io/IOException
      // try (565 -> 571): 12 java/io/IOException
      // try (572 -> 581): 12 java/io/IOException
      // try (582 -> 584): 12 java/io/IOException
      // try (587 -> 588): 12 java/io/IOException
      // try (589 -> 597): 12 java/io/IOException
      // try (598 -> 603): 12 java/io/IOException
      // try (604 -> 606): 12 java/io/IOException
      // try (611 -> 613): 12 java/io/IOException
      // try (614 -> 616): 12 java/io/IOException
      // try (623 -> 628): 12 java/io/IOException
      // try (629 -> 632): 12 java/io/IOException
      // try (634 -> 635): 12 java/io/IOException
      // try (636 -> 638): 12 java/io/IOException
      // try (642 -> 646): 12 java/io/IOException
      // try (647 -> 650): 12 java/io/IOException
      // try (651 -> 661): 12 java/io/IOException
      // try (662 -> 681): 12 java/io/IOException
      // try (682 -> 684): 12 java/io/IOException
      // try (687 -> 688): 12 java/io/IOException
      // try (689 -> 695): 12 java/io/IOException
      // try (699 -> 700): 12 java/io/IOException
      // try (704 -> 715): 12 java/io/IOException
      // try (716 -> 724): 12 java/io/IOException
      // try (726 -> 728): 12 java/io/IOException
      // try (729 -> 731): 12 java/io/IOException
      // try (734 -> 735): 12 java/io/IOException
      // try (736 -> 744): 12 java/io/IOException
      // try (745 -> 747): 12 java/io/IOException
      // try (748 -> 751): 12 java/io/IOException
      // try (752 -> 760): 12 java/io/IOException
      // try (761 -> 770): 12 java/io/IOException
      // try (771 -> 774): 12 java/io/IOException
      // try (775 -> 777): 12 java/io/IOException
      // try (778 -> 780): 12 java/io/IOException
      // try (781 -> 783): 12 java/io/IOException
      // try (789 -> 797): 12 java/io/IOException
      // try (798 -> 800): 12 java/io/IOException
      // try (801 -> 803): 12 java/io/IOException
      // try (804 -> 806): 12 java/io/IOException
      // try (807 -> 809): 12 java/io/IOException
      // try (811 -> 817): 12 java/io/IOException
      // try (818 -> 823): 12 java/io/IOException
      // try (824 -> 826): 12 java/io/IOException
      // try (827 -> 829): 12 java/io/IOException
      // try (830 -> 832): 12 java/io/IOException
      // try (834 -> 840): 12 java/io/IOException
      // try (842 -> 851): 12 java/io/IOException
      // try (852 -> 857): 12 java/io/IOException
      // try (858 -> 864): 12 java/io/IOException
      // try (865 -> 869): 12 java/io/IOException
   }

   public final void Zc(String var1) {
      GdxParticleEffectRenderer var10000;
      try {
         var10000 = this;
         this.FO.kH0(var1);
      } catch (Exception var2) {
         throw new WC0(var2);
      }

      var10000.cQ();
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void cQ() {
      try {
         x9_0 var1 = this.FO;
         var1.T5();
         lE var2 = new lE(var1, false);
         var1.G20 = var2;
         var1.cOm4.Ue0(var2);
      } catch (Exception var3) {
         throw new WC0(var3);
      }
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void bg(Class var1, Class var2) {
      try {
         x9_0 var3 = this.FO;
         var3.T5();
         lE var4 = new lE(var3, false);
         var3.G20 = var4;
         var3.cOm4.Ue0(var4);
      } catch (Exception var5) {
         throw new WC0(var5);
      }

      if ((var2 == null || var2 != var1) && this.wh0 != null) {
         String var6 = (String)this.F5.Wk0(var1);
         if (var6 == null) {
            var6 = var1.getName();
         }

         try {
            this.FO.kH0(this.wh0).Yg0(var6);
         } catch (Exception var7) {
            throw new WC0(var7);
         }
      }
   }

   public final void d10() {
      try {
         this.FO.hK0();
      } catch (Exception var1) {
         throw new WC0(var1);
      }
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void Sm0(String var1) {
      try {
         this.FO.kH0(var1);
         x9_0 var2 = this.FO;
         var2.T5();
         lE var3 = new lE(var2, true);
         var2.G20 = var3;
         var2.cOm4.Ue0(var3);
      } catch (Exception var4) {
         throw new WC0(var4);
      }
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void LV() {
      try {
         x9_0 var1 = this.FO;
         var1.T5();
         lE var2 = new lE(var1, true);
         var1.G20 = var2;
         var1.cOm4.Ue0(var2);
      } catch (Exception var3) {
         throw new WC0(var3);
      }
   }

   public final void xy() {
      try {
         this.FO.hK0();
      } catch (Exception var1) {
         throw new WC0(var1);
      }
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void JD(Object var1, oe_0 var2) {
      Class var13;
      EI var3 = this.fE(var13 = var1.getClass());

      for (oe_0 var4 = var2.dz0; var4 != null; var4 = var4.Uu) {
         vh0_1 var5;
         if ((var5 = (vh0_1)var3.Wk0(var4.Z3.replace(" ", "_"))) == null) {
            if (!var4.Z3.equals(this.wh0) && !this.Cz(var4.Z3)) {
               WC0 var15 = new WC0("Field not found: " + var4.Z3 + " (" + var13.getName() + ")");
               var15.bw(var4.Dq());
               throw var15;
            }
         } else {
            yr0_0 var6;
            yr0_0 var16 = var6 = var5.Dp0;

            Object var10001;
            GdxParticleEffectRenderer var10002;
            vh0_1 var10003;
            Class var10004;
            try {
               var10001 = var1;
               var10002 = this;
               var10003 = var5;
               var10004 = var6.cOm5.getType();
            } catch (WC0 var11) {
               var11.bw(var6.cOm5.getName() + " (" + var13.getName() + ")");
               throw var11;
            } catch (RuntimeException var12) {
               WC0 var17 = new WC0(var12);
               var17.bw(var4.Dq());
               var17.bw(var6.cOm5.getName() + " (" + var13.getName() + ")");
               throw var17;
            }

            Class var14 = var10004;

            try {
               var16.lo(var10001, var10002.b20(var14, var10003.dk0, var4));
            } catch (WC0 var8) {
               var8.bw(var6.cOm5.getName() + " (" + var13.getName() + ")");
               throw var8;
            } catch (RuntimeException var9) {
               WC0 var18 = new WC0(var9);
               var18.bw(var4.Dq());
               var18.bw(var6.cOm5.getName() + " (" + var13.getName() + ")");
               throw var18;
            }
         }
      }
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public Object b20(Class var1, Class var2, oe_0 var3) {
      if (var3 == null) {
         return null;
      }

      if (var3.wH0 == lpt3__3.NR) {
         String var4 = this.wh0;
         if (this.wh0 == null) {
            var4 = null;
         } else {
            var4 = var3.L1(var4, null);
         }

         if (var4 != null && (var1 = (Class)this.py0.Wk0(var4)) == null) {
            Class var10000;
            try {
               var10000 = rd_1.oy0(var4);
            } catch (RuntimeException var11) {
               throw new WC0(var11);
            }

            var1 = var10000;
         }

         if (var1 == null) {
            return var3;
         }

         if (this.wh0 == null || !Collection.class.isAssignableFrom(var1)) {
            com1__0 var95;
            if ((var95 = (com1__0)this.OW.Wk0(var1)) != null) {
               return var95.Ot0((gp_1)this, var3);
            }

            if (var1 != String.class
               && var1 != Integer.class
               && var1 != Boolean.class
               && var1 != Float.class
               && var1 != Long.class
               && var1 != Double.class
               && var1 != Short.class
               && var1 != Byte.class
               && var1 != Character.class
               && !Enum.class.isAssignableFrom(var1)) {
               Object var59;
               if ((var59 = LE(var1)) instanceof VD0) {
                  ((VD0)var59).read((gp_1)this, var3);
                  return var59;
               }

               if (var59 instanceof nb_2) {
                  nb_2 var69 = (nb_2)var59;

                  for (oe_0 var89 = var3.dz0; var89 != null; var89 = var89.Uu) {
                     var69.WK0(var89.Z3, this.b20(var2, null, var89));
                  }

                  return var69;
               } else if (var59 instanceof Xy0) {
                  Xy0 var68 = (Xy0)var59;

                  for (oe_0 var76 = var3.dz0; var76 != null; var76 = var76.Uu) {
                     String var10002 = var76.Z3;
                     var68.hC0((Integer)this.b20(Integer.class, null, var76), var10002);
                  }

                  return var68;
               } else if (var59 instanceof IY) {
                  IY var67 = (IY)var59;

                  for (oe_0 var75 = var3.dz0; var75 != null; var75 = var75.Uu) {
                     String var87 = var75.Z3;
                     float var96 = (Float)this.b20(Float.class, null, var75);
                     int var100;
                     if ((var100 = var67.Fm0(var87)) >= 0) {
                        var67.lJ0[var100] = var96;
                     } else {
                        var100 = -(var100 + 1);
                        Object[] var104 = var67.Cu;
                        var67.Cu[var100] = var87;
                        var67.lJ0[var100] = var96;
                        if (++var67.xz >= var67.Ou) {
                           int var140 = var104.length << 1;
                           int var88 = var104.length;
                           var67.Ou = (int)(var140 * var67.tC0);
                           var67.nd0 = Long.numberOfLeadingZeros(var67.s3 = var140 - 1);
                           Object[] var97 = var67.Cu;
                           float[] var102 = var67.lJ0;
                           var67.Cu = new Object[var140];
                           var67.lJ0 = new float[var140];
                           if (var67.xz > 0) {
                              for (int var105 = 0; var105 < var88; var105++) {
                                 Object var107;
                                 if ((var107 = var97[var105]) != null) {
                                    float var108 = var102[var105];
                                    Object[] var9 = var67.Cu;
                                    int var10 = (int)(var107.hashCode() * -7046029254386353131L >>> var67.nd0);

                                    while (var9[var10] != null) {
                                       var10 = var10 + 1 & var67.s3;
                                    }

                                    var9[var10] = var107;
                                    var67.lJ0[var10] = var108;
                                 }
                              }
                           }
                        }
                     }
                  }

                  return var67;
               } else if (var59 instanceof af_1) {
                  af_1 var66 = (af_1)var59;
                  if ((var3 = var3.Is("values")) == null) {
                     var3 = null;
                  } else {
                     var3 = var3.dz0;
                  }

                  while (var3 != null) {
                     var66.MG0(this.b20(var2, null, var3));
                     var3 = var3.Uu;
                  }

                  return var66;
               } else if (var59 instanceof nl_1) {
                  nl_1 var65 = (nl_1)var59;

                  for (oe_0 var84 = var3.dz0; var84 != null; var84 = var84.Uu) {
                     var65.qx0(Integer.parseInt(var84.Z3), this.b20(var2, null, var84));
                  }

                  return var65;
               } else if (var59 instanceof J7) {
                  J7 var64 = (J7)var59;

                  for (oe_0 var83 = var3.dz0; var83 != null; var83 = var83.Uu) {
                     var64.cw(Long.parseLong(var83.Z3), this.b20(var2, null, var83));
                  }

                  return var64;
               } else if (var59 instanceof z5) {
                  z5 var53 = (z5)var59;
                  oe_0 var62;
                  if ((var62 = var3.Is("values")) == null) {
                     var62 = null;
                  } else {
                     var62 = var62.dz0;
                  }

                  while (var62 != null) {
                     var53.o40(var62.coM4());
                     var62 = var62.Uu;
                  }

                  return var53;
               } else if (!(var59 instanceof cf_2)) {
                  if (var59 instanceof Map) {
                     Map var61 = (Map)var59;

                     for (oe_0 var82 = var3.dz0; var82 != null; var82 = var82.Uu) {
                        if (!var82.Z3.equals(this.wh0)) {
                           var61.put(var82.Z3, this.b20(var2, null, var82));
                        }
                     }

                     return var61;
                  } else {
                     this.JD(var59, var3);
                     return var59;
                  }
               } else {
                  cf_2 var60 = (cf_2)var59;

                  for (oe_0 var81 = var3.dz0; var81 != null; var81 = var81.Uu) {
                     var60.n3(var81.Z3, this.b20(var2, null, var81));
                  }

                  return var60;
               }
            } else {
               oe_0 var74 = var3.Is("value");
               return this.b20(var1, null, var74);
            }
         }

         if ((var3 = var3.Is("items")) == null) {
            throw new WC0("Unable to convert object to collection: " + var3 + " (" + var1.getName() + ")");
         }
      }

      if (var1 != null) {
         com1__0 var91;
         if ((var91 = (com1__0)this.OW.Wk0(var1)) != null) {
            return var91.Ot0((gp_1)this, var3);
         }

         if (VD0.class.isAssignableFrom(var1)) {
            Object var139 = LE(var1);
            ((VD0)var139).read((gp_1)this, var3);
            return var139;
         }
      }

      if (var3.jY()) {
         if (var1 == null || var1 == Object.class) {
            var1 = es_1.class;
         }

         if (es_1.class.isAssignableFrom(var1)) {
            es_1 var58;
            if (var1 == es_1.class) {
               var58 = new es_1();
            } else {
               var58 = (es_1)LE(var1);
            }

            for (oe_0 var80 = var3.dz0; var80 != null; var80 = var80.Uu) {
               var58.Ue0(this.b20(var2, null, var80));
            }

            return var58;
         } else if (y60_0.class.isAssignableFrom(var1)) {
            y60_0 var57;
            if (var1 == y60_0.class) {
               var57 = new y60_0();
            } else {
               var57 = (y60_0)LE(var1);
            }

            for (oe_0 var79 = var3.dz0; var79 != null; var79 = var79.Uu) {
               Object var94 = this.b20(var2, null, var79);
               Object[] var99 = var57.GD;
               if (var57.IR == var99.length) {
                  var57.vp(var99.length << 1);
                  var99 = var57.GD;
               }

               int var103 = var57.VU;
               int var106;
               int var138 = var106 = var57.VU + 1;
               var57.VU = var106;
               var99[var103] = var94;
               if (var138 == var99.length) {
                  var57.VU = 0;
               }

               var57.IR++;
            }

            return var57;
         } else if (Collection.class.isAssignableFrom(var1)) {
            Collection var56;
            if (var1.isInterface()) {
               var56 = new ArrayList();
            } else {
               var56 = (Collection)LE(var1);
            }

            for (oe_0 var78 = var3.dz0; var78 != null; var78 = var78.Uu) {
               var56.add(this.b20(var2, null, var78));
            }

            return var56;
         } else {
            if (!var1.isArray()) {
               throw new WC0("Unable to convert value to required type: " + var3 + " (" + var1.getName() + ")");
            }

            var1 = var1.getComponentType();
            if (var2 == null) {
               var2 = var1;
            }

            Object var55 = Array.newInstance(var1, var3.lpt3);
            int var77 = 0;
            oe_0 var93 = var3.dz0;

            while (var93 != null) {
               int var98 = var77 + 1;
               Array.set(var55, var77, this.b20(var2, null, var93));
               var93 = var93.Uu;
               var77 = var98;
            }

            return var55;
         }
      } else {
         lpt3__3 var70 = var3.wH0;
         if (var3.wH0 == lpt3__3.I50 || var70 == lpt3__3.X20) {
            label697: {
               if (var1 != null) {
                  Class var109;
                  try {
                     var109 = float.class;
                  } catch (NumberFormatException var52) {
                     break label697;
                  }

                  if (var1 != var109) {
                     try {
                        var109 = Float.class;
                     } catch (NumberFormatException var51) {
                        break label697;
                     }

                     if (var1 != var109) {
                        try {
                           var109 = int.class;
                        } catch (NumberFormatException var50) {
                           break label697;
                        }

                        if (var1 != var109) {
                           try {
                              var109 = Integer.class;
                           } catch (NumberFormatException var49) {
                              break label697;
                           }

                           if (var1 != var109) {
                              try {
                                 var109 = long.class;
                              } catch (NumberFormatException var48) {
                                 break label697;
                              }

                              if (var1 != var109) {
                                 try {
                                    var109 = Long.class;
                                 } catch (NumberFormatException var47) {
                                    break label697;
                                 }

                                 if (var1 != var109) {
                                    try {
                                       var109 = double.class;
                                    } catch (NumberFormatException var46) {
                                       break label697;
                                    }

                                    if (var1 != var109) {
                                       try {
                                          var109 = Double.class;
                                       } catch (NumberFormatException var45) {
                                          break label697;
                                       }

                                       if (var1 != var109) {
                                          try {
                                             var109 = String.class;
                                          } catch (NumberFormatException var44) {
                                             break label697;
                                          }

                                          if (var1 == var109) {
                                             try {
                                                return var3.cd0();
                                             } catch (NumberFormatException var33) {
                                                break label697;
                                             }
                                          }

                                          try {
                                             var109 = short.class;
                                          } catch (NumberFormatException var43) {
                                             break label697;
                                          }

                                          if (var1 != var109) {
                                             try {
                                                var109 = Short.class;
                                             } catch (NumberFormatException var42) {
                                                break label697;
                                             }

                                             if (var1 != var109) {
                                                try {
                                                   var109 = byte.class;
                                                } catch (NumberFormatException var41) {
                                                   break label697;
                                                }

                                                if (var1 != var109) {
                                                   try {
                                                      var109 = Byte.class;
                                                   } catch (NumberFormatException var40) {
                                                      break label697;
                                                   }

                                                   if (var1 != var109) {
                                                      break label697;
                                                   }
                                                }

                                                try {
                                                   return var3.Oz();
                                                } catch (NumberFormatException var34) {
                                                   break label697;
                                                }
                                             }
                                          }

                                          try {
                                             return var3.lm0();
                                          } catch (NumberFormatException var35) {
                                             break label697;
                                          }
                                       }
                                    }

                                    try {
                                       return var3.j60();
                                    } catch (NumberFormatException var36) {
                                       break label697;
                                    }
                                 }
                              }

                              try {
                                 return var3.qh();
                              } catch (NumberFormatException var37) {
                                 break label697;
                              }
                           }
                        }

                        try {
                           return var3.coM4();
                        } catch (NumberFormatException var38) {
                           break label697;
                        }
                     }
                  }
               }

               try {
                  return var3.vZ();
               } catch (NumberFormatException var39) {
               }
            }

            oe_0 var71;
            var71 = new oe_0(var3.cd0());
            var3 = var71;
         }

         if (var3.wH0 == lpt3__3.hG) {
            label631: {
               if (var1 != null) {
                  Class var122;
                  try {
                     var122 = boolean.class;
                  } catch (NumberFormatException var32) {
                     break label631;
                  }

                  if (var1 != var122) {
                     try {
                        var122 = Boolean.class;
                     } catch (NumberFormatException var31) {
                        break label631;
                     }

                     if (var1 != var122) {
                        break label631;
                     }
                  }
               }

               try {
                  return var3.Xv0();
               } catch (NumberFormatException var30) {
               }
            }

            oe_0 var72;
            var72 = new oe_0(var3.cd0());
            var3 = var72;
         }

         if (var3.wH0 != lpt3__3.ND0) {
            return null;
         }

         String var73 = var3.cd0();
         if (var1 != null && var1 != String.class) {
            label734: {
               Class var124;
               try {
                  var124 = int.class;
               } catch (NumberFormatException var29) {
                  break label734;
               }

               if (var1 != var124) {
                  try {
                     var124 = Integer.class;
                  } catch (NumberFormatException var28) {
                     break label734;
                  }

                  if (var1 != var124) {
                     try {
                        var124 = float.class;
                     } catch (NumberFormatException var26) {
                        break label734;
                     }

                     if (var1 != var124) {
                        try {
                           var124 = Float.class;
                        } catch (NumberFormatException var25) {
                           break label734;
                        }

                        if (var1 != var124) {
                           try {
                              var124 = long.class;
                           } catch (NumberFormatException var23) {
                              break label734;
                           }

                           if (var1 != var124) {
                              try {
                                 var124 = Long.class;
                              } catch (NumberFormatException var22) {
                                 break label734;
                              }

                              if (var1 != var124) {
                                 try {
                                    var124 = double.class;
                                 } catch (NumberFormatException var20) {
                                    break label734;
                                 }

                                 if (var1 != var124) {
                                    try {
                                       var124 = Double.class;
                                    } catch (NumberFormatException var19) {
                                       break label734;
                                    }

                                    if (var1 != var124) {
                                       try {
                                          var124 = short.class;
                                       } catch (NumberFormatException var17) {
                                          break label734;
                                       }

                                       if (var1 != var124) {
                                          try {
                                             var124 = Short.class;
                                          } catch (NumberFormatException var16) {
                                             break label734;
                                          }

                                          if (var1 != var124) {
                                             try {
                                                var124 = byte.class;
                                             } catch (NumberFormatException var14) {
                                                break label734;
                                             }

                                             if (var1 != var124) {
                                                try {
                                                   var124 = Byte.class;
                                                } catch (NumberFormatException var13) {
                                                   break label734;
                                                }

                                                if (var1 != var124) {
                                                   break label734;
                                                }
                                             }

                                             try {
                                                return Byte.valueOf(var73);
                                             } catch (NumberFormatException var12) {
                                                break label734;
                                             }
                                          }
                                       }

                                       try {
                                          return Short.valueOf(var73);
                                       } catch (NumberFormatException var15) {
                                          break label734;
                                       }
                                    }
                                 }

                                 try {
                                    return Double.valueOf(var73);
                                 } catch (NumberFormatException var18) {
                                    break label734;
                                 }
                              }
                           }

                           try {
                              return Long.valueOf(var73);
                           } catch (NumberFormatException var21) {
                              break label734;
                           }
                        }
                     }

                     try {
                        return Float.valueOf(var73);
                     } catch (NumberFormatException var24) {
                        break label734;
                     }
                  }
               }

               try {
                  return Integer.valueOf(var73);
               } catch (NumberFormatException var27) {
               }
            }

            if (var1 == boolean.class || var1 == Boolean.class) {
               return Boolean.valueOf(var73);
            }

            if (var1 != char.class && var1 != Character.class) {
               if (Enum.class.isAssignableFrom(var1)) {
                  Enum[] var92;
                  Enum[] var136 = var92 = (Enum[])var1.getEnumConstants();
                  int var5 = 0;

                  for (int var6 = var136.length; var5 < var6; var5++) {
                     Enum var7 = var92[var5];
                     String var8;
                     if (this.Lm0) {
                        var8 = var7.name();
                     } else {
                        var8 = var7.toString();
                     }

                     if (var73.equals(var8)) {
                        return var7;
                     }
                  }
               }

               if (var1 == CharSequence.class) {
                  return var73;
               } else {
                  throw new WC0("Unable to convert value to required type: " + var3 + " (" + var1.getName() + ")");
               }
            } else {
               return var73.charAt(0);
            }
         } else {
            return var73;
         }
      }
   }

   public final void G6(Object var1, Object var2) {
      EI var8 = this.fE(var2.getClass());
      a60_0 var3 = this.fE(var1.getClass()).lb0();

      while (var3.hasNext()) {
         xn_1 var4;
         vh0_1 var5;
         vh0_1 var9 = var5 = (vh0_1)var8.Wk0((var4 = (xn_1)var3.next()).I20);
         yr0_0 var6 = ((vh0_1)var4.kM).Dp0;
         if (var9 == null) {
            throw new WC0("To object is missing field: " + (String)var4.I20);
         }

         try {
            var5.Dp0.lo(var2, var6.uB(var1));
         } catch (RuntimeException var7) {
            throw new WC0("Error copying field: " + var6.cOm5.getName(), var7);
         }
      }
   }

   public final void v80(Object var1, String var2) {
      Object var10000;
      try {
         var10000 = var1;
         this.FO.kH0(var2);
      } catch (Exception var3) {
         throw new WC0(var3);
      }

      if (var10000 == null) {
         this.XH(var1, null, null);
      } else {
         this.XH(var1, var1.getClass(), null);
      }
   }

   public final void sg(Class var1, Object var2, String var3) {
      GdxParticleEffectRenderer var10000;
      Object var10001;
      try {
         var10000 = this;
         var10001 = var2;
         this.FO.kH0(var3);
      } catch (Exception var4) {
         throw new WC0(var4);
      }

      var10000.XH(var10001, var1, null);
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final Object YC(Dn0 var1, Class var2) {
      try {
         Y1 var3 = new Y1();
         return this.b20(var2, null, var3.Zk0(var1));
      } catch (Exception var4) {
         throw new WC0("Error reading file: " + var1, var4);
      }
   }

   public final void vt0(ResourceData param1, Dn0 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnonnull 09
      // 04: aconst_null
      // 05: astore 3
      // 06: goto 0e
      // 09: aload 1
      // 0a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0d: astore 3
      // 0e: aload 2
      // 0f: ldc_w "Error writing file: "
      // 12: astore 4
      // 14: aconst_null
      // 15: astore 5
      // 17: ldc_w "UTF-8"
      // 1a: invokevirtual f/Dn0.Fm (Ljava/lang/String;)Ljava/io/OutputStreamWriter;
      // 1d: dup
      // 1e: astore 5
      // 20: aload 0
      // 21: dup
      // 22: dup
      // 23: aload 1
      // 24: aload 0
      // 25: aload 5
      // 27: aconst_null
      // 28: astore 1
      // 29: invokevirtual f/gp_1.Zx (Ljava/io/Writer;)V
      // 2c: aload 3
      // 2d: aload 1
      // 2e: invokevirtual f/gp_1.XH (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)V
      // 31: getfield f/gp_1.FO Lf/x9_0;
      // 34: invokestatic f/KT.E1 (Ljava/io/Closeable;)V
      // 37: aconst_null
      // 38: putfield f/gp_1.FO Lf/x9_0;
      // 3b: invokestatic f/KT.E1 (Ljava/io/Closeable;)V
      // 3e: return
      // 3f: aload 0
      // 40: dup
      // 41: getfield f/gp_1.FO Lf/x9_0;
      // 44: invokestatic f/KT.E1 (Ljava/io/Closeable;)V
      // 47: aconst_null
      // 48: putfield f/gp_1.FO Lf/x9_0;
      // 4b: athrow
      // 4c: astore 0
      // 4d: goto 6b
      // 50: astore 0
      // 51: new f/WC0
      // 54: dup
      // 55: new java/lang/StringBuilder
      // 58: dup
      // 59: aload 2
      // 5a: swap
      // 5b: aload 4
      // 5d: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 60: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 63: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 66: aload 0
      // 67: invokespecial f/WC0.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 6a: athrow
      // 6b: aload 0
      // 6c: aload 5
      // 6e: invokestatic f/KT.E1 (Ljava/io/Closeable;)V
      // 71: athrow
      // try (13 -> 15): 44 java/lang/Exception
      // try (13 -> 15): 42 null
      // try (25 -> 26): 44 java/lang/Exception
      // try (25 -> 26): 42 null
      // try (26 -> 29): 35 null
      // try (29 -> 33): 44 java/lang/Exception
      // try (29 -> 33): 42 null
      // try (35 -> 42): 44 java/lang/Exception
      // try (35 -> 42): 42 null
      // try (45 -> 48): 42 null
      // try (49 -> 58): 42 null
   }

   public boolean Cz(String var1) {
      return false;
   }

   public final String Z00(String var1) {
      Y1 var10000 = new Y1();
      char[] var10001 = var1.toCharArray();
      oe_0 var5 = var10000.Gu0(var10001, var10001.length);
      sg_1 var2 = this.tU;
      var5.getClass();
      hq_0 var4;
      hq_0 var6 = var4 = new hq_0();

      var6.Sn0 = var2;
      var6.Nz0 = 0;
      b3_0 var3;
      b3_0 var7 = var3 = new b3_0(512);

      oe_0.H9(var5, var7, 0, var4);
      return var3.toString();
   }
}
