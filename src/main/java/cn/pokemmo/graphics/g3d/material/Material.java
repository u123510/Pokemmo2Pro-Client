package cn.pokemmo.graphics.g3d.material;

import f.*;
import java.util.Iterator;

import java.util.Iterator;

public class Material extends wh_0 {
   public static int UI0;
   public String mi;

   public Material() {
      this("mtl" + ++UI0);
   }

   public Material(String var1) {
      this.mi = var1;
   }

   public Material(hf_1... var1) {
      this();
      ((wh_0)this).uk(var1);
   }

   public Material(String var1, hf_1... var2) {
      this(var1);
      ((wh_0)this).uk(var2);
   }

   public Material(es_1 var1) {
      this();
      ((wh_0)this).zc(var1);
   }

   public Material(String var1, es_1 var2) {
      this(var1);
      ((wh_0)this).zc(var2);
   }

   public Material(Material var1) {
      this(var1.mi, var1);
   }

   public Material(String var1, Material var2) {
      this(var1);
      Iterator var3 = ((wh_0)var2).iterator();
      I2 var4 = (I2)var3;

      while(var4.hasNext()) {
         ((wh_0)this).LPT8(((hf_1)var4.next()).pD0());
      }

   }

   public Material Ll() {
      return new Material(this);
   }

   public final int hashCode() {
      Material var10000 = this;
      int var1 = super.hashCode();
      return var10000.mi.hashCode() * 3 + var1;
   }

   public final boolean equals(Object var1) {
      return var1 instanceof Material && (var1 == this || ((Material)var1).mi.equals(this.mi) && super.equals(var1));
   }
}
