package ch.qos.logback.classic.joran.sanity;

import ch.qos.logback.classic.model.LoggerModel;
import ch.qos.logback.classic.model.RootLoggerModel;
import ch.qos.logback.core.joran.sanity.Pair;
import ch.qos.logback.core.joran.sanity.SanityChecker;
import ch.qos.logback.core.model.AppenderModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.conditional.IfModel;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IfNestedWithinSecondPhaseElementSC extends ContextAwareBase implements SanityChecker {
   public static final String NESTED_IF_WARNING_URL = "http://logback.qos.ch/codes.html#nested_if_element";

   public void check(Model var1) {
      if (var1 != null) {
         ArrayList var2;
         var2 = new ArrayList();
         this.deepFindAllModelsOfType(AppenderModel.class, var2, var1);
         this.deepFindAllModelsOfType(LoggerModel.class, var2, var1);
         this.deepFindAllModelsOfType(RootLoggerModel.class, var2, var1);
         List var5;
         if (!(var5 = this.deepFindNestedSubModelsOfType(IfModel.class, var2)).isEmpty()) {
            ((ContextAwareBase)this).addWarn("<if> elements cannot be nested within an <appender>, <logger> or <root> element");
            ((ContextAwareBase)this).addWarn("See also http://logback.qos.ch/codes.html#nested_if_element");
            Iterator var6 = var5.iterator();

            while(var6.hasNext()) {
               Pair var7;
               Model var10001 = (Model)(var7 = (Pair)var6.next()).first;
               Pair var10002 = var7;
               int var8 = var10001.getLineNumber();
               Model var3;
               int var4 = (var3 = (Model)var10002.second).getLineNumber();
               String var9 = var10001.getTag();
               ((ContextAwareBase)this).addWarn("Element <" + var9 + "> at line " + var8 + " contains a nested <" + var3.getTag() + "> element at line " + var4);
            }

         }
      }
   }

   public String toString() {
      return "IfNestedWithinSecondPhaseElementSC";
   }
}
