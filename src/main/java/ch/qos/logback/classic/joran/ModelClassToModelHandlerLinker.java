package ch.qos.logback.classic.joran;

import ch.qos.logback.classic.model.*;
import ch.qos.logback.classic.model.processor.*;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.*;
import ch.qos.logback.core.model.processor.*;

public class ModelClassToModelHandlerLinker extends ch.qos.logback.core.joran.ModelClassToModelHandlerLinkerBase {
    private ModelHandlerFactoryMethod configurationModelHandlerFactoryMethod;

    public ModelClassToModelHandlerLinker(Context context) {
        super(context);
    }

    @Override
    public void link(DefaultProcessor processor) {
        super.link(processor);
        processor.addHandler(ConfigurationModel.class, getConfigurationModelHandlerFactoryMethod());
        processor.addHandler(ContextNameModel.class, ContextNameModelHandler::makeInstance);
        processor.addHandler(LoggerContextListenerModel.class, LoggerContextListenerModelHandler::makeInstance);
        processor.addHandler(InsertFromJNDIModel.class, InsertFromJNDIModelHandler::makeInstance);
        processor.addHandler(AppenderModel.class, AppenderModelHandler::makeInstance);
        processor.addHandler(AppenderRefModel.class, AppenderRefModelHandler::makeInstance);
        processor.addHandler(RootLoggerModel.class, RootLoggerModelHandler::makeInstance);
        processor.addHandler(LoggerModel.class, LoggerModelHandler::makeInstance);
        processor.addHandler(LevelModel.class, LevelModelHandler::makeInstance);
        processor.addAnalyser(LoggerModel.class, () -> new RefContainerDependencyAnalyser(context, LoggerModel.class));
        processor.addAnalyser(RootLoggerModel.class, () -> new RefContainerDependencyAnalyser(context, RootLoggerModel.class));
        processor.addAnalyser(AppenderModel.class, () -> new RefContainerDependencyAnalyser(context, AppenderModel.class));
        processor.addAnalyser(AppenderRefModel.class, () -> new AppenderRefDependencyAnalyser(context));
        processor.getPhaseOneFilter().denyAll();
        processor.getPhaseTwoFilter().allowAll();
    }

    public ModelHandlerFactoryMethod getConfigurationModelHandlerFactoryMethod() {
        if (configurationModelHandlerFactoryMethod == null) {
            return ConfigurationModelHandler::makeInstance;
        }
        return configurationModelHandlerFactoryMethod;
    }

    public void setConfigurationModelHandlerFactoryMethod(ModelHandlerFactoryMethod method) {
        configurationModelHandlerFactoryMethod = method;
    }
}
