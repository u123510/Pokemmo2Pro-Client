package cn.pokemmo.graphics.material.attribute;

import f.*;
import java.util.*;


import com.badlogic.gdx.graphics.Color;

public class ColorAttribute extends BaseMaterialAttribute {
   public static final long Ly;
   public static final long zz;
   public static final long gp0;
   public static final long sI;
   public static final long Ar;
   public static final long xE;
   public static final long YI0;
   public static final long pI0;
   public static final int Er0 = 0;
   public final Color v50;

   public static final boolean sp(long var0) {
      return (var0 & pI0) != 0L;
   }

   public ColorAttribute(long var1) {
      super(var1);
      this.v50 = new Color();
      if (!sp(var1)) {
         throw new nf_1("Invalid type specified");
      }
   }

   public ColorAttribute(long var1, Color var3) {
      this(var1);
      if (var3 != null) {
         this.v50.set(var3);
      }

   }

   public ColorAttribute(long var1, float var3, float var4, float var5, float var6) {
      this(var1);
      this.v50.set(var3, var4, var5, var6);
   }

   public ColorAttribute(ColorAttribute var1) {
      this(var1.yO, var1.v50);
   }

   static {
      long var0;
      Ly = var0 = hf_1.T20("diffuseColor");
      long var2;
      zz = var2 = hf_1.T20("specularColor");
      long var4;
      long var10000 = var4 = hf_1.T20("ambientColor");
      long var10001 = var0;
      gp0 = var4;
      sI = var0 = hf_1.T20("emissiveColor");
      Ar = var4 = hf_1.T20("reflectionColor");
      long var6;
      xE = var6 = hf_1.T20("ambientLightColor");
      long var8;
      YI0 = var8 = hf_1.T20("fogColor");
      pI0 = var10000 | var10001 | var2 | var0 | var4 | var6 | var8;
   }

   public hf_1 pD0() {
      return new f.PRN_(this);
   }

   public final int hashCode() {
      ColorAttribute var10000 = this;
      int var1 = super.YF * 7137017;
      return var10000.v50.toIntBits() + var1;
   }

   public final int compareTo(Object var1) {
      hf_1 var6 = (hf_1)var1;
      long var2;
      long var4;
      return (var2 = super.yO) != (var4 = var6.yO) ? (int)(var2 - var4) : ((ColorAttribute)var6).v50.toIntBits() - this.v50.toIntBits();
   }
}

