package ch.qos.logback.classic.model.util;

import ch.qos.logback.classic.model.processor.LogbackClassicDefaultNestedComponentRules;
import ch.qos.logback.core.joran.util.ParentTag_Tag_Class_Tuple;
import ch.qos.logback.core.model.ComponentModel;
import ch.qos.logback.core.model.ImplicitModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.util.TagUtil;
import java.util.Iterator;
import java.util.List;

public class DefaultClassNameHelper {
   List tupleList;

   public DefaultClassNameHelper() {
      this.tupleList = LogbackClassicDefaultNestedComponentRules.TUPLES_LIST;
   }

   private void applyInjectionRules(Model var1, Model var2) {
      if (var2 != null) {
         String var7 = TagUtil.unifiedTag(var2);
         String var3 = TagUtil.unifiedTag(var1);
         String var4;
         ImplicitModel var6;
         if (var1 instanceof ImplicitModel && ((var4 = (var6 = (ImplicitModel)var1).getClassName()) == null || var4.isEmpty())) {
            Iterator var5 = this.tupleList.iterator();

            while(var5.hasNext()) {
               ParentTag_Tag_Class_Tuple var8;
               if ((var8 = (ParentTag_Tag_Class_Tuple)var5.next()).parentTag.equals(var7) && var8.tag.equals(var3)) {
                  ((ComponentModel)var6).setClassName(var8.className);
                  break;
               }
            }
         }

      }
   }

   public void injectDefaultComponentClasses(Model var1, Model var2) {
      this.applyInjectionRules(var1, var2);
      Iterator var3 = var1.getSubModels().iterator();

      while(var3.hasNext()) {
         this.injectDefaultComponentClasses((Model)var3.next(), var1);
      }

   }
}
