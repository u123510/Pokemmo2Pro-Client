package ch.qos.logback.core.joran;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.AppenderModel;
import ch.qos.logback.core.model.AppenderRefModel;
import ch.qos.logback.core.model.DefineModel;
import ch.qos.logback.core.model.EventEvaluatorModel;
import ch.qos.logback.core.model.ImplicitModel;
import ch.qos.logback.core.model.ImportModel;
import ch.qos.logback.core.model.IncludeModel;
import ch.qos.logback.core.model.ParamModel;
import ch.qos.logback.core.model.PropertyModel;
import ch.qos.logback.core.model.SequenceNumberGeneratorModel;
import ch.qos.logback.core.model.SerializeModelModel;
import ch.qos.logback.core.model.ShutdownHookModel;
import ch.qos.logback.core.model.SiftModel;
import ch.qos.logback.core.model.StatusListenerModel;
import ch.qos.logback.core.model.TimestampModel;
import ch.qos.logback.core.model.conditional.ElseModel;
import ch.qos.logback.core.model.conditional.IfModel;
import ch.qos.logback.core.model.conditional.ThenModel;
import ch.qos.logback.core.model.processor.ChainedModelFilter;
import ch.qos.logback.core.model.processor.DefaultProcessor;
import ch.qos.logback.core.model.processor.DefineModelHandler;
import ch.qos.logback.core.model.processor.EventEvaluatorModelHandler;
import ch.qos.logback.core.model.processor.ImportModelHandler;
import ch.qos.logback.core.model.processor.IncludeModelHandler;
import ch.qos.logback.core.model.processor.ImplicitModelHandler;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.ModelHandlerFactoryMethod;
import ch.qos.logback.core.model.processor.PropertyModelHandler;
import ch.qos.logback.core.model.processor.SequenceNumberGeneratorModelHandler;
import ch.qos.logback.core.model.processor.SerializeModelModelHandler;
import ch.qos.logback.core.model.processor.ShutdownHookModelHandler;
import ch.qos.logback.core.model.processor.StatusListenerModelHandler;
import ch.qos.logback.core.model.processor.TimestampModelHandler;
import ch.qos.logback.core.model.processor.conditional.ElseModelHandler;
import ch.qos.logback.core.model.processor.conditional.IfModelHandler;
import ch.qos.logback.core.model.processor.conditional.ThenModelHandler;
import ch.qos.logback.core.sift.SiftModelHandler;

public class ModelClassToModelHandlerLinkerBase {
    protected Context context;

    public ModelClassToModelHandlerLinkerBase(Context context) {
        this.context = context;
    }

    public void link(DefaultProcessor processor) {
        processor.addHandler(ImportModel.class, ImportModelHandler::makeInstance);
        processor.addHandler(ShutdownHookModel.class, ShutdownHookModelHandler::makeInstance);
        processor.addHandler(SequenceNumberGeneratorModel.class, SequenceNumberGeneratorModelHandler::makeInstance);
        processor.addHandler(SerializeModelModel.class, SerializeModelModelHandler::makeInstance);
        processor.addHandler(EventEvaluatorModel.class, EventEvaluatorModelHandler::makeInstance);
        processor.addHandler(DefineModel.class, DefineModelHandler::makeInstance);
        processor.addHandler(IncludeModel.class, IncludeModelHandler::makeInstance);
        processor.addHandler(ParamModel.class, ParamModelHandler::makeInstance);
        processor.addHandler(PropertyModel.class, PropertyModelHandler::makeInstance);
        processor.addHandler(TimestampModel.class, TimestampModelHandler::makeInstance);
        processor.addHandler(StatusListenerModel.class, StatusListenerModelHandler::makeInstance);
        processor.addHandler(ImplicitModel.class, ImplicitModelHandler::makeInstance);
        processor.addHandler(IfModel.class, IfModelHandler::makeInstance);
        processor.addHandler(ThenModel.class, ThenModelHandler::makeInstance);
        processor.addHandler(ElseModel.class, ElseModelHandler::makeInstance);
        processor.addHandler(SiftModel.class, SiftModelHandler::makeInstance);
    }

    public void sealModelFilters(DefaultProcessor processor) {
        processor.getPhaseOneFilter().denyAll();
        processor.getPhaseTwoFilter().allowAll();
    }
}
