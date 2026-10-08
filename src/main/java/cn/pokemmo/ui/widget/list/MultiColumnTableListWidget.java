package cn.pokemmo.ui.widget.list;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.CurrencyValueTagLabel;
import cn.pokemmo.ui.widget.component.BaseInteractiveListComponent;
import cn.pokemmo.ui.widget.list.BaseScrollListWidget;

public class MultiColumnTableListWidget extends BaseScrollListWidget {
   public final Kq0 DW;

   public MultiColumnTableListWidget(Kq0 var1, KG0 var2) {
      super(var2);
      this.DW = var1;
   }

   @Override
   public final void Bt() {
      super.Bt();
      this.yG();
   }

   public final void yG() {
      lg_0.k.lPT5(this::is);
   }

   public final void is() {
      this.DW.Md0();
   }
}
