package cn.pokemmo.world.render.blend;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.world.render.blend.BaseTerrainTileBlender;

import com.badlogic.gdx.graphics.Texture;

public class StaticGroundDecalBlender extends BaseTerrainTileBlender {
   public final long return$ = hk0_1.lQ();

   @Override
   public final void x8(hl0_1 var1, int var2, int var3, int var4) {
      if (var2 == 0) {
         byte var9 = 0;
         long var5 = hk0_1.KG - this.return$;
         if (200L <= var5) {
            if (var5 > 200L) {
               if ((var5 = var5 - 200L) >= 200L && var5 < 400L) {
                  var9 = 1;
               }

               Texture var7 = QI.Py.kN((byte)1, 281, false).li0(var9).H8();
               float var8 = var3;
               float var10 = var4;
               var1.CH0(var7, var8, var10);
            }
         }
      }
   }

   @Override
   public final boolean qR() {
      return hk0_1.KG - this.return$ > 800L;
   }
}
