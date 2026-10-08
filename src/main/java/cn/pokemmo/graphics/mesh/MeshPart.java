package cn.pokemmo.graphics.mesh;

import f.*;

public class MeshPart {
   public static final ly0_0 zx = new ly0_0();
   public String Xj;
   public int bJ0;
   public int d30;
   public int I8;
   public ap0_0 m8;
   public final C8 T4;
   public final C8 Y7;
   public float ep0;

   public MeshPart() {
      C8 var1;
      var1 = new C8();
      this.T4 = var1;
      C8 var2;
      var2 = new C8();
      this.Y7 = var2;
      this.ep0 = -1.0F;
   }

   public MeshPart(String var1, ap0_0 var2, int var3, int var4, int var5) {
      C8 var6;
      var6 = new C8();
      this.T4 = var6;
      C8 var7;
      var7 = new C8();
      this.Y7 = var7;
      this.ep0 = -1.0F;
      this.COm4(var1, var2, var3, var4, var5);
   }

   public MeshPart(MeshPart var1) {
      C8 var2;
      var2 = new C8();
      this.T4 = var2;
      C8 var3;
      var3 = new C8();
      this.Y7 = var3;
      this.ep0 = -1.0F;
      this.l0(var1);
   }

   public final void l0(MeshPart var1) {
      this.Xj = var1.Xj;
      this.m8 = var1.m8;
      this.d30 = var1.d30;
      this.I8 = var1.I8;
      this.bJ0 = var1.bJ0;
      this.T4.np(var1.T4);
      this.Y7.np(var1.Y7);
      this.ep0 = var1.ep0;
   }

   public final void COm4(String var1, ap0_0 var2, int var3, int var4, int var5) {
      this.Xj = var1;
      this.m8 = var2;
      this.d30 = var3;
      this.I8 = var4;
      this.bJ0 = var5;
      C8 var10002 = this.T4;
      C8 var10003 = this.T4;
      float var6 = 0.0F;
      float var8 = 0.0F;
      float var10 = 0.0F;
      this.T4.x = var6;
      var10003.y = var8;
      var10002.z = var10;
      C8 var12 = this.Y7;
      float var7 = 0.0F;
      float var9 = 0.0F;
      float var11 = 0.0F;
      this.Y7.x = var7;
      var12.y = var9;
      var12.z = var11;
      this.ep0 = -1.0F;
   }

   public final void TI0() {
      ap0_0 var10004 = this.m8;
      ly0_0 var3 = zx;
      int var1 = this.d30;
      int var2 = this.I8;
      this.m8.getClass();
      var10004.Bn0(var3.br(), var1, var2, null);
      this.T4.np(var3.Xm0);
      this.Y7.np(var3.ec0).Fg0(0.5F);
      this.ep0 = this.Y7.Am0();
   }

   @Override
   public final boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      }

      if (var1 == this) {
         return true;
      }

      MeshPart var2;
      return !(var1 instanceof MeshPart)
         ? false
         : (var2 = (MeshPart)var1) == this || var2.m8 == this.m8 && var2.bJ0 == this.bJ0 && var2.d30 == this.d30 && var2.I8 == this.I8;
   }
}
