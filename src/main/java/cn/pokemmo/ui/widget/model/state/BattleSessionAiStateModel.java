package cn.pokemmo.ui.widget.model.state;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import cn.pokemmo.ui.widget.model.state.BaseObservableStateModel;

public class BattleSessionAiStateModel extends BaseObservableStateModel implements V {
   public final int wH0;
   public int Cw0;
   public int cx0;

   public BattleSessionAiStateModel(int var1, int var2, int var3) {
      if (var2 >= var1) {
         this.wH0 = var1;
         this.Cw0 = var2;
         this.cx0 = var3;
      } else {
         throw new IllegalArgumentException("maxValue < minValue");
      }
   }

   public final int OD() {
      return this.Cw0;
   }

   public final int vu0() {
      return this.wH0;
   }

   public final int getValue() {
      return this.cx0;
   }

   public final void X90(int var1) {
      if (this.cx0 != var1) {
         this.cx0 = var1;
         a7_0.bH(super.RD0);
      }

   }
}
