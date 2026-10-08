package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class NpcDirectionalFrameProvider extends BaseSpriteFrameProvider {
   public final Rk0 zi;
   public final Gt0 Uu;
   public final zd_0 for$;

   public NpcDirectionalFrameProvider(Rk0 var1, Gt0 var2, Tt0 var3) {
      this.zi = var1;
      this.Uu = var2;
      this.for$ = var3;
   }

   public final i4_0 KN() {
      Gt0 var3 = this.Uu;
      zd_0 var1 = this.for$;
      byte var4 = 16;
      byte var2 = 16;
      return this.zi.oQ(var3, var1, 7, var4, var2, 0);
   }
}
