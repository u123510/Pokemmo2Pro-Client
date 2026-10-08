package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CharacterAvatarHeadProvider extends BaseSpriteFrameProvider {
   public final vh_1 H60;
   public final Rk0 ND;
   public final int xF0;

   public CharacterAvatarHeadProvider(int var1, Rk0 var2, FJ var3) {
      this.H60 = var3;
      this.ND = var2;
      this.xF0 = var1;
   }

   @Override
   public final i4_0 KN() {
      Tt0 var1;
      var1 = new Tt0(this.H60.EG(2));
      Gt0 var2;
      var2 = new Gt0(this.H60.EG(7), false);
      Bp0 var3;
      var3 = new Bp0();
      Bp0 var4;
      var4 = new Bp0();
      this.ND.DX(this.xF0, var3, var4);
      i4_0 var5;
      i4_0 var10000 = var5 = new i4_0((int)var3.x, (int)var3.y, ix0_0.Vw);
      this.ND.Q60(this.xF0, var2, var1, var5, var4, null);
      this.ND.Lpt8();
      return var10000;
   }
}
