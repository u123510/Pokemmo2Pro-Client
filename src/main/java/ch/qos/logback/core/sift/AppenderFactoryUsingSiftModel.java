package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.ParamModelHandler;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.model.AppenderModel;
import ch.qos.logback.core.model.ImplicitModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.ParamModel;
import ch.qos.logback.core.model.PropertyModel;
import ch.qos.logback.core.model.SiftModel;
import ch.qos.logback.core.model.processor.AppenderModelHandler;
import ch.qos.logback.core.model.processor.DefaultProcessor;
import ch.qos.logback.core.model.processor.ImplicitModelHandler;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
import ch.qos.logback.core.model.processor.PropertyModelHandler;
import java.util.Collection;
import java.util.Map;

public class AppenderFactoryUsingSiftModel
implements AppenderFactory {
    Context context;
    final Model siftModel;
    protected String discriminatingKey;
    protected ModelInterpretationContext parentMic;
    protected DefaultNestedComponentRegistry registry;

    public AppenderFactoryUsingSiftModel(ModelInterpretationContext parentMic, Model model, String discriminatingKey) {
        this.siftModel = Model.duplicate(model);
        this.discriminatingKey = discriminatingKey;
        this.parentMic = parentMic;
        this.context = parentMic.getContext();
    }

    public SiftProcessor getSiftingModelProcessor(String key) {
        ModelInterpretationContext mic = new ModelInterpretationContext(this.parentMic) {
            @Override
            public boolean hasDependers(String key) {
                return true;
            }
        };
        SiftProcessor processor = new SiftProcessor(this.context, mic);
        processor.addHandler(ParamModel.class, ParamModelHandler::makeInstance);
        processor.addHandler(PropertyModel.class, PropertyModelHandler::makeInstance);
        processor.addHandler(ImplicitModel.class, ImplicitModelHandler::makeInstance);
        processor.addHandler(AppenderModel.class, AppenderModelHandler::makeInstance);
        processor.addHandler(SiftModel.class, NOPSiftModelHandler::makeInstance);
        return processor;
    }

    @Override
    public Appender buildAppender(Context context, String key) {
        SiftProcessor siftProcessor = this.getSiftingModelProcessor(key);
        ModelInterpretationContext mic = siftProcessor.getModelInterpretationContext();
        siftProcessor.setContext(context);
        Model model = Model.duplicate(this.siftModel);
        mic.addSubstitutionProperty(this.discriminatingKey, key);
        siftProcessor.process(model);
        Map<String, Appender> bag = (Map<String, Appender>) mic.getObjectMap().get("APPENDER_BAG");
        Collection<Appender> appenders = bag.values();
        if (appenders.size() == 0) {
            return null;
        }
        return appenders.iterator().next();
    }

    public Model getSiftModel() {
        return this.siftModel;
    }
}
