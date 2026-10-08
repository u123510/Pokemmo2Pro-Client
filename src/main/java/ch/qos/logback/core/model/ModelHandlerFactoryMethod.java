package ch.qos.logback.core.model;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
@FunctionalInterface
public interface ModelHandlerFactoryMethod { ModelHandlerBase make(Context context, ModelInterpretationContext interpretationContext); }
