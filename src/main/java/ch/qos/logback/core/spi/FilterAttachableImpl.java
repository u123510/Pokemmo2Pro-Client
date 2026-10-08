package ch.qos.logback.core.spi;

import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.util.COWArrayList;
import java.util.ArrayList;
import java.util.List;

public final class FilterAttachableImpl implements FilterAttachable {
   COWArrayList filterList = new COWArrayList(new Filter[0]);

   public void addFilter(Filter var1) {
      this.filterList.add(var1);
   }

   public void clearAllFilters() {
      this.filterList.clear();
   }

   public FilterReply getFilterChainDecision(Object var1) {
      Filter[] var5;
      int var2 = (var5 = (Filter[])this.filterList.asTypedArray()).length;

      for(int var3 = 0; var3 < var2; ++var3) {
         FilterReply var4;
         if ((var4 = var5[var3].decide(var1)) == FilterReply.DENY || var4 == FilterReply.ACCEPT) {
            return var4;
         }
      }

      return FilterReply.NEUTRAL;
   }

   public List getCopyOfAttachedFiltersList() {
      return new ArrayList(this.filterList);
   }
}
