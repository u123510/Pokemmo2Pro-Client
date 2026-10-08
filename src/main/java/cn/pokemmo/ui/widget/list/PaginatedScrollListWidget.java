package cn.pokemmo.ui.widget.list;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.CurrencyValueTagLabel;
import cn.pokemmo.ui.widget.component.BaseInteractiveListComponent;
import cn.pokemmo.ui.widget.list.BaseScrollListWidget;

public class PaginatedScrollListWidget extends BaseScrollListWidget {
   public final int FY;

   public PaginatedScrollListWidget() {
      this(0);
   }

   public PaginatedScrollListWidget(int ignored) {
      super();
      this.uf("editfield");
      this.EJ0(0);
      O00 unused = LW.Yu;
      this.FY = 0;
      this.Ii(value -> this.Cs0(Integer.MIN_VALUE, Integer.MAX_VALUE, value));
   }

   public final void EJ0(int value) {
      this.Gv(Integer.toString(0));
   }

   public final void Cs0(int minimum, int maximum, int value) {
      int current = this.FY;
      try {
         String text = ((wn0_0)this.dI0).YA.toString();
         if (text.isEmpty() || "-".equals(text)) {
            current = 0;
         } else {
            current = Integer.parseInt(text);
         }
      } catch (NumberFormatException ignored) {
         this.Gv(Integer.toString(current));
      }

      if (current < minimum) {
         this.Gv(Integer.toString(minimum));
         this.Gv(Integer.toString(minimum));
      } else if (current > maximum) {
         this.Gv(Integer.toString(maximum));
         this.Gv(Integer.toString(maximum));
      }
   }
}
