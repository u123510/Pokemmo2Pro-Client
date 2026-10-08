package ch.qos.logback.core.sift;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.AppenderModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.SiftModel;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
import ch.qos.logback.core.spi.ContextAwareBase;

public class SiftModelHandler extends ModelHandlerBase {
   static final String ONE_AND_ONLY_ONE_URL = "http://logback.qos.ch/codes.html#1andOnly1";

   public SiftModelHandler(Context var1) {
      super(var1);
   }

   public static SiftModelHandler makeInstance(Context var0, ModelInterpretationContext var1) {
      return new SiftModelHandler(var0);
   }

   private long computeAppenderModelCount(SiftModel var1) {
      return ((Model)var1).getSubModels().stream().filter((var0) -> var0 instanceof AppenderModel).count();
   }

   public Class getSupportedModelClass() {
      return SiftModel.class;
   }

   public void handle(ModelInterpretationContext var1, Model var2) {
      SiftModel var10001 = (SiftModel)var2;
      SiftModel var6;
      (var6 = (SiftModel)var2).markAsSkipped();
      long var3;
      if ((var3 = this.computeAppenderModelCount(var10001)) == 0L) {
         ((ContextAwareBase)this).addError("No nested appenders found within the <sift> element in SiftingAppender.");
      } else if (var3 > 1L) {
         ((ContextAwareBase)this).addError("Only and only one appender can be nested the <sift> element in SiftingAppender. See also http://logback.qos.ch/codes.html#1andOnly1");
      } else {
         Object var7;
         if ((var7 = var1.peekObject()) instanceof SiftingAppenderBase) {
            SiftingAppenderBase var10000 = (SiftingAppenderBase)var7;
            String var5 = ((SiftingAppenderBase)var7).getDiscriminatorKey();
            AppenderFactoryUsingSiftModel var8;
            var8 = new AppenderFactoryUsingSiftModel(var1, var6, var5);
            var10000.setAppenderFactory(var8);
         } else {
            ((ContextAwareBase)this).addError("Unexpected object " + String.valueOf(var7));
         }

      }
   }
}
