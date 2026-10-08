package ch.qos.logback.core.joran;

import ch.qos.logback.core.joran.action.AppenderAction;
import ch.qos.logback.core.joran.action.AppenderRefAction;
import ch.qos.logback.core.joran.action.ContextPropertyAction;
import ch.qos.logback.core.joran.action.ConversionRuleAction;
import ch.qos.logback.core.joran.action.DefinePropertyAction;
import ch.qos.logback.core.joran.action.EventEvaluatorAction;
import ch.qos.logback.core.joran.action.ImplicitModelAction;
import ch.qos.logback.core.joran.action.ImportAction;
import ch.qos.logback.core.joran.action.NewRuleAction;
import ch.qos.logback.core.joran.action.ParamAction;
import ch.qos.logback.core.joran.action.PropertyAction;
import ch.qos.logback.core.joran.action.SequenceNumberGeneratorAction;
import ch.qos.logback.core.joran.action.SerializeModelAction;
import ch.qos.logback.core.joran.action.ShutdownHookAction;
import ch.qos.logback.core.joran.action.SiftAction;
import ch.qos.logback.core.joran.action.StatusListenerAction;
import ch.qos.logback.core.joran.action.TimestampAction;
import ch.qos.logback.core.joran.conditional.ElseAction;
import ch.qos.logback.core.joran.conditional.IfAction;
import ch.qos.logback.core.joran.conditional.ThenAction;
import ch.qos.logback.core.joran.sanity.AppenderWithinAppenderSanityChecker;
import ch.qos.logback.core.joran.sanity.SanityChecker;
import ch.qos.logback.core.joran.spi.ElementSelector;
import ch.qos.logback.core.joran.spi.RuleStore;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.joran.spi.SaxEventInterpreter;
import ch.qos.logback.core.model.DefineModel;
import ch.qos.logback.core.model.EventEvaluatorModel;
import ch.qos.logback.core.model.ImplicitModel;
import ch.qos.logback.core.model.ImportModel;
import ch.qos.logback.core.model.IncludeModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.ParamModel;
import ch.qos.logback.core.model.PropertyModel;
import ch.qos.logback.core.model.SequenceNumberGeneratorModel;
import ch.qos.logback.core.model.ShutdownHookModel;
import ch.qos.logback.core.model.SiftModel;
import ch.qos.logback.core.model.StatusListenerModel;
import ch.qos.logback.core.model.TimestampModel;
import ch.qos.logback.core.model.conditional.ElseModel;
import ch.qos.logback.core.model.conditional.IfModel;
import ch.qos.logback.core.model.conditional.ThenModel;
import ch.qos.logback.core.model.processor.DefaultProcessor;
import ch.qos.logback.core.model.processor.DefineModelHandler;
import ch.qos.logback.core.model.processor.EventEvaluatorModelHandler;
import ch.qos.logback.core.model.processor.ImplicitModelHandler;
import ch.qos.logback.core.model.processor.ImportModelHandler;
import ch.qos.logback.core.model.processor.IncludeModelHandler;
import ch.qos.logback.core.model.processor.PropertyModelHandler;
import ch.qos.logback.core.model.processor.SequenceNumberGeneratorModelHandler;
import ch.qos.logback.core.model.processor.ShutdownHookModelHandler;
import ch.qos.logback.core.model.processor.StatusListenerModelHandler;
import ch.qos.logback.core.model.processor.TimestampModelHandler;
import ch.qos.logback.core.model.processor.conditional.ElseModelHandler;
import ch.qos.logback.core.model.processor.conditional.IfModelHandler;
import ch.qos.logback.core.model.processor.conditional.ThenModelHandler;
import ch.qos.logback.core.sift.SiftModelHandler;
import ch.qos.logback.core.spi.ContextAware;
import f.BK0;
import java.util.function.Supplier;

public abstract class JoranConfiguratorBase extends GenericXMLConfigurator {
   public void addElementSelectorAndActionAssociations(RuleStore var1) {
      ElementSelector var3;
      var3 = new ElementSelector("*/variable");
      Supplier var2 = PropertyAction::new;
      ElementSelector var10000 = BK0.Jl(var1, var3, var2, "*/property");
      Supplier var4 = PropertyAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "*/substitutionProperty");
      var4 = PropertyAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "configuration/import");
      var4 = ImportAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "configuration/timestamp");
      var4 = TimestampAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "configuration/shutdownHook");
      var4 = ShutdownHookAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "configuration/sequenceNumberGenerator");
      var4 = SequenceNumberGeneratorAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "configuration/serializeModel");
      var4 = SerializeModelAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "configuration/define");
      var4 = DefinePropertyAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "configuration/evaluator");
      var4 = EventEvaluatorAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "configuration/contextProperty");
      var4 = ContextPropertyAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "configuration/conversionRule");
      var4 = ConversionRuleAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "configuration/statusListener");
      var4 = StatusListenerAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "*/appender");
      var4 = AppenderAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "configuration/appender/appender-ref");
      var4 = AppenderRefAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "configuration/newRule");
      var4 = NewRuleAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "*/param");
      var4 = ParamAction::new;
      var10000 = BK0.Jl(var1, var10000, var4, "*/if");
      var4 = IfAction::new;
      var1.addRule(var10000, var4);
      var1.addTransparentPathPart("if");
      ElementSelector var21;
      var21 = new ElementSelector("*/if/then");
      var2 = ThenAction::new;
      var1.addRule(var21, var2);
      var1.addTransparentPathPart("then");
      var21 = new ElementSelector("*/if/else");
      var2 = ElseAction::new;
      var1.addRule(var21, var2);
      var1.addTransparentPathPart("else");
      var21 = new ElementSelector("*/appender/sift");
      var2 = SiftAction::new;
      var1.addRule(var21, var2);
      var1.addTransparentPathPart("sift");
   }

   public void sanityCheck(Model var1) {
      JoranConfiguratorBase var10000 = this;
      AppenderWithinAppenderSanityChecker var2;
      var2 = new AppenderWithinAppenderSanityChecker();
      var10000.performCheck(var2, var1);
   }

   public void performCheck(SanityChecker var1, Model var2) {
      if (var1 instanceof ContextAware) {
         ((ContextAware)var1).setContext(super.context);
      }

      var1.check(var2);
   }

   public void setImplicitRuleSupplier(SaxEventInterpreter var1) {
      var1.setImplicitActionSupplier(ImplicitModelAction::new);
   }

   public void buildModelInterpretationContext() {
      super.buildModelInterpretationContext();
      super.modelInterpretationContext.createAppenderBags();
   }

   public SaxEventInterpretationContext getInterpretationContext() {
      return super.saxEventInterpreter.getSaxEventInterpretationContext();
   }

   public void addModelHandlerAssociations(DefaultProcessor var1) {
      var1.addHandler(ImportModel.class, ImportModelHandler::makeInstance);
      var1.addHandler(ShutdownHookModel.class, ShutdownHookModelHandler::makeInstance);
      var1.addHandler(SequenceNumberGeneratorModel.class, SequenceNumberGeneratorModelHandler::makeInstance);
      var1.addHandler(EventEvaluatorModel.class, EventEvaluatorModelHandler::makeInstance);
      var1.addHandler(DefineModel.class, DefineModelHandler::makeInstance);
      var1.addHandler(IncludeModel.class, IncludeModelHandler::makeInstance);
      var1.addHandler(ParamModel.class, ParamModelHandler::makeInstance);
      var1.addHandler(PropertyModel.class, PropertyModelHandler::makeInstance);
      var1.addHandler(TimestampModel.class, TimestampModelHandler::makeInstance);
      var1.addHandler(StatusListenerModel.class, StatusListenerModelHandler::makeInstance);
      var1.addHandler(ImplicitModel.class, ImplicitModelHandler::makeInstance);
      var1.addHandler(IfModel.class, IfModelHandler::makeInstance);
      var1.addHandler(ThenModel.class, ThenModelHandler::makeInstance);
      var1.addHandler(ElseModel.class, ElseModelHandler::makeInstance);
      var1.addHandler(SiftModel.class, SiftModelHandler::makeInstance);
   }
}
