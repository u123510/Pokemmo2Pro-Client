package cn.pokemmo.assets.loader;

import f.*;
import java.util.*;
import com.badlogic.gdx.graphics.*;


public class SoundAssetLoader extends BaseAssetLoader {
   public i4_0 ds0;

   public SoundAssetLoader(gq_1 var1) {
      super(var1);
   }

   public final Object loadSync(hd0_2 var1, String var2, Dn0 var3, in_0 var4) {
      n_0 var10001 = (n_0)var4;
      i4_0 var10000 = this.ds0;
      this.ds0 = null;
      return var10000;
   }

   public final void loadAsync(hd0_2 var1, String var2, Dn0 var3, in_0 var4) {
      SoundAssetLoader var10000 = this;
      n_0 var10002 = (n_0)var4;
      this.ds0 = null;
      i4_0 var5;
      var5 = new i4_0(var3);
      var10000.ds0 = var5;
   }

   public final es_1 getDependencies(String var1, Dn0 var2, in_0 var3) {
      n_0 ignored = (n_0)var3;
      return null;
   }
}

