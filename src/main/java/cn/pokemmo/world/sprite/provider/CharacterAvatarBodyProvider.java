package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CharacterAvatarBodyProvider extends BaseSpriteFrameProvider {
   public final Wr extends$;
   public final Dn0 l;

   public CharacterAvatarBodyProvider(Wr var1, VE var2) {
      this.extends$ = var1;
      this.l = var2;
   }

   @Override
   public final i4_0 KN() {
      i4_0 var1 = this.extends$.Pa0.KN();
      i4_0 var2;
      i4_0 var10000 = var2 = new i4_0(this.l);
      var10000.Pa0(DF0.Ha0);

      for (int var5 = 0; var5 < var1.XF.mB0; var5++) {
         for (int var3 = 0; var3 < var1.XF.SH; var3++) {
            if ((var2.XF.iH0(var3, var5) & 0xFF) != 0) {
               byte var4 = 0;
               var1.XF.XS(var3, var5, var4);
            }
         }
      }

      var2.dispose();
      return var1;
   }
}
