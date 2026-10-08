package cn.pokemmo.ui.widget.menu;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.menu.BasePopupMenuWidget;

public class PokemonActionMenuWidget extends BasePopupMenuWidget {
   public final int hB;
   public int I4 = 0;

   public PokemonActionMenuWidget() {
      this.hB = 8;
   }

   @Override
   public final j1_0 Xf0(le0_2 var1) {
      j1_0 var3 = super.gg0.vx0(var1);
      int var2;
      int var10000 = var2 = this.I4 + 1;
      this.I4 = var2;
      if (var10000 >= this.hB) {
         this.I4 = 0;
         var3.Rr0.Rg();
      }

      return var3;
   }
}
