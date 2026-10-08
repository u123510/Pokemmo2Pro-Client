package cn.pokemmo.graphics.texture;

import f.*;

import java.util.HashMap;

public class CubemapTexture extends lq_2 {
   public static final HashMap b30 = new HashMap();
   public final jp0_0 e9;

   public CubemapTexture(jp0_0 var1) {
      super(34067);
      this.e9 = var1;
      this.oB0(var1);
      if (var1.wx()) {
         P1(lg_0.k, this);
      }

   }

   public CubemapTexture(Dn0 var1, Dn0 var2, Dn0 var3, Dn0 var4, Dn0 var5, Dn0 var6) {
      this(var1, var2, var3, var4, var5, var6, false);
   }

   public CubemapTexture(Dn0 var1, Dn0 var2, Dn0 var3, Dn0 var4, Dn0 var5, Dn0 var6, boolean var7) {
      this(cm_0.Zp0(var1, var7), cm_0.Zp0(var2, var7), cm_0.Zp0(var3, var7),
           cm_0.Zp0(var4, var7), cm_0.Zp0(var5, var7), cm_0.Zp0(var6, var7));
   }

   public CubemapTexture(i4_0 var1, i4_0 var2, i4_0 var3, i4_0 var4, i4_0 var5, i4_0 var6) {
      this(var1, var2, var3, var4, var5, var6, false);
   }

   public CubemapTexture(i4_0 var1, i4_0 var2, i4_0 var3, i4_0 var4, i4_0 var5, i4_0 var6, boolean var7) {
      this(var1 == null ? null : new S60(var1, (ix0_0)null, var7, false),
           var2 == null ? null : new S60(var2, (ix0_0)null, var7, false),
           var3 == null ? null : new S60(var3, (ix0_0)null, var7, false),
           var4 == null ? null : new S60(var4, (ix0_0)null, var7, false),
           var5 == null ? null : new S60(var5, (ix0_0)null, var7, false),
           var6 == null ? null : new S60(var6, (ix0_0)null, var7, false));
   }

   public CubemapTexture(int var1, int var2, int var3, ix0_0 var4) {
      this(new S60(new i4_0(var3, var2, var4), (ix0_0)null, false, true),
           new S60(new i4_0(var3, var2, var4), (ix0_0)null, false, true),
           new S60(new i4_0(var1, var3, var4), (ix0_0)null, false, true),
           new S60(new i4_0(var1, var3, var4), (ix0_0)null, false, true),
           new S60(new i4_0(var1, var2, var4), (ix0_0)null, false, true),
           new S60(new i4_0(var1, var2, var4), (ix0_0)null, false, true));
   }

   public CubemapTexture(E9 var1, E9 var2, E9 var3, E9 var4, E9 var5, E9 var6) {
      this(new en_1(var1, var2, var3, var4, var5, var6));
   }

   public static void P1(du_2 var0, CubemapTexture var1) {
      HashMap var2;
      es_1 var3;
      if ((var3 = (es_1)(var2 = b30).get(var0)) == null) {
         var3 = new es_1();
      }

      var3.Ue0(var1);
      var2.put(var0, var3);
   }

   public final void oB0(jp0_0 var1) {
      if (!var1.xZ()) {
         var1.Dx0();
      }

      jp0_0 var10000 = var1;
      ((lq_2)this).bind();
      eb0_1 var2 = super.minFilter;
      ((lq_2)this).unsafeSetFilter(var2, super.magFilter, true);
      a00_0 var3 = super.uWrap;
      ((lq_2)this).unsafeSetWrap(var3, super.vWrap, true);
      ((lq_2)this).unsafeSetAnisotropicFilter(super.anisotropicFilterLevel, true);
      var10000.Ww();
      lg_0.OH0.glBindTexture(super.glTarget, 0);
   }

   public final void dispose() {
      if (super.glHandle != 0) {
         ((lq_2)this).delete();
         HashMap var1;
         if (this.e9.wx() && (var1 = b30).get(lg_0.k) != null) {
            ((es_1)var1.get(lg_0.k)).sj0(this, true);
         }

      }
   }
}
