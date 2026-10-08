package ch.qos.logback.core.model.processor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.util.beans.BeanDescriptionCache;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.ModelHandlerFactoryMethod;
import ch.qos.logback.core.model.NamedComponentModel;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterReply;

public class DefaultProcessor extends ContextAwareBase {
    static final int DENIED = -1;
    protected final ModelInterpretationContext mic;
    final HashMap<Class<?>, ModelHandlerFactoryMethod> modelClassToHandlerMap = new HashMap<>();
    final HashMap<Class<?>, Supplier<ModelHandlerBase>> modelClassToDependencyAnalyserMap = new HashMap<>();
    ChainedModelFilter phaseOneFilter = new ChainedModelFilter();
    ChainedModelFilter phaseTwoFilter = new ChainedModelFilter();

    @FunctionalInterface
    private interface TraverseMethod {
        int traverse(Model model, ModelFilter filter);
    }

    protected DefaultProcessor() {
        this.mic = null;
    }

    public DefaultProcessor(Context context, ModelInterpretationContext mic) {
        super();
        setContext(context);
        this.mic = mic;
    }

    private ProcessingPhase determineProcessingPhase(Class<?> modelClass) {
        PhaseIndicator indicator = modelClass.getAnnotation(PhaseIndicator.class);
        return indicator == null ? ProcessingPhase.FIRST : indicator.phase();
    }

    private void traversalLoop(TraverseMethod method, Model model, ModelFilter filter, String phaseName) {
        int max = 3;
        int count = 0;
        while (count < max && method.traverse(model, filter) != 0) count++;
    }

    private void finalObjectPop() {
        mic.popObject();
    }

    private void initialObjectPush() {
        mic.pushObject(context);
    }

    private void callAnalyserPostHandleOnModel(Model model, ModelHandlerBase analyser) {
        try {
            analyser.postHandle(mic, model);
        } catch (ModelHandlerException ex) {
            addError("Failed to invoke postHandle on model " + model.getTag(), ex);
        }
    }

    private void callAnalyserHandleOnModel(Model model, ModelHandlerBase analyser) {
        try {
            analyser.handle(mic, model);
        } catch (ModelHandlerException ex) {
            addError("Failed to traverse model " + model.getTag(), ex);
        }
    }

    private ModelHandlerBase createHandler(Model model) {
        ModelHandlerFactoryMethod factory = modelClassToHandlerMap.get(model.getClass());
        if (factory == null) {
            addError("Can't handle model of type " + model.getClass() + " with tag: " + model.getTag() + " at line " + model.getLineNumber());
            return null;
        }
        ModelHandlerBase handler = factory.make(context, mic);
        if (handler == null) return null;
        if (!handler.isSupportedModelType(model)) {
            addWarn("Handler [" + handler.getClass() + "] does not support " + model.idString());
            return null;
        }
        return handler;
    }

    private boolean dependencyIsADirectSubmodel(Model model) {
        List<String> names = mic.getDependeeNamesForModel(model);
        if (names == null || names.isEmpty()) return false;
        for (Model sub : model.getSubModels()) {
            if (sub instanceof NamedComponentModel && names.contains(((NamedComponentModel) sub).getName())) return true;
        }
        return false;
    }

    private boolean allDependenciesStarted(Model model) {
        List<String> names = mic.getDependeeNamesForModel(model);
        if (names == null || names.isEmpty()) return true;
        for (String name : names) {
            if (!mic.isNamedDependeeStarted(name)) return false;
        }
        return true;
    }

    private Constructor<?> getWithContextConstructor(Class<?> type) {
        try {
            return type.getConstructor(Context.class);
        } catch (NoSuchMethodException ex) {
            return null;
        }
    }

    private Constructor<?> getWithContextAndBDCConstructor(Class<?> type) {
        try {
            return type.getConstructor(Context.class, BeanDescriptionCache.class);
        } catch (NoSuchMethodException ex) {
            return null;
        }
    }

    public void addHandler(Class<?> modelClass, ModelHandlerFactoryMethod factory) {
        modelClassToHandlerMap.put(modelClass, factory);
        ProcessingPhase phase = determineProcessingPhase(modelClass);
        if (phase == ProcessingPhase.FIRST) {
            phaseOneFilter.allow(modelClass);
        } else if (phase == ProcessingPhase.SECOND) {
            phaseTwoFilter.allow(modelClass);
        } else {
            throw new IllegalArgumentException("unexpected value " + phase + " for model class " + modelClass.getName());
        }
    }

    public void addAnalyser(Class<?> modelClass, Supplier<ModelHandlerBase> supplier) {
        modelClassToDependencyAnalyserMap.put(modelClass, supplier);
    }

    public void process(Model model) {
        if (model == null) {
            addError("Expecting non null model to process");
            return;
        }
        initialObjectPush();
        mainTraverse(model, phaseOneFilter);
        analyseDependencies(model);
        traversalLoop(this::secondPhaseTraverse, model, phaseTwoFilter, "phase 2");
        addInfo("End of configuration.");
        finalObjectPop();
    }

    public ChainedModelFilter getPhaseOneFilter() {
        return phaseOneFilter;
    }

    public ChainedModelFilter getPhaseTwoFilter() {
        return phaseTwoFilter;
    }

    public void analyseDependencies(Model model) {
        Supplier<ModelHandlerBase> supplier = modelClassToDependencyAnalyserMap.get(model.getClass());
        ModelHandlerBase analyser = supplier == null ? null : supplier.get();
        if (analyser != null && !model.isSkipped()) callAnalyserHandleOnModel(model, analyser);
        for (Model sub : model.getSubModels()) analyseDependencies(sub);
        if (analyser != null && !model.isSkipped()) callAnalyserPostHandleOnModel(model, analyser);
    }

    public int mainTraverse(Model model, ModelFilter filter) {
        if (filter.decide(model) == FilterReply.DENY) return -1;
        int count = 0;
        ModelHandlerBase handler = null;
        try {
            if (model.isUnhandled()) {
                handler = createHandler(model);
                if (handler != null) {
                    handler.handle(mic, model);
                    model.markAsHandled();
                    count = 1;
                }
            }
            if (!model.isSkipped()) {
                for (Model sub : model.getSubModels()) count += mainTraverse(sub, filter);
            }
            if (handler != null) handler.postHandle(mic, model);
        } catch (ModelHandlerException ex) {
            addError("Failed to traverse model " + model.getTag(), ex);
        }
        return count;
    }

    public int secondPhaseTraverse(Model model, ModelFilter filter) {
        if (filter.decide(model) == FilterReply.DENY) return 0;
        int count = 0;
        boolean dependenciesStarted = allDependenciesStarted(model);
        ModelHandlerBase handler = null;
        try {
            if (model.isUnhandled() && dependenciesStarted) {
                handler = createHandler(model);
                if (handler != null) {
                    handler.handle(mic, model);
                    model.markAsHandled();
                    count = 1;
                }
            }
            if (!dependenciesStarted && !dependencyIsADirectSubmodel(model)) return count;
            if (!model.isSkipped()) {
                for (Model sub : model.getSubModels()) count += secondPhaseTraverse(sub, filter);
            }
            if (handler != null) handler.postHandle(mic, model);
        } catch (ModelHandlerException ex) {
            addError("Failed to traverse model " + model.getTag(), ex);
        }
        return count;
    }

    public ModelHandlerBase instantiateHandler(Class<?> type) {
        try {
            Constructor<?> constructor = getWithContextConstructor(type);
            if (constructor != null) return (ModelHandlerBase) constructor.newInstance(context);
            constructor = getWithContextAndBDCConstructor(type);
            if (constructor != null) return (ModelHandlerBase) constructor.newInstance(context, mic.getBeanDescriptionCache());
            addError("Failed to find suitable constructor for class [" + type + "]");
            return null;
        } catch (InstantiationException | IllegalAccessException | SecurityException | IllegalArgumentException | InvocationTargetException ex) {
            addError("Failed to instantiate " + type, ex);
            return null;
        }
    }
}
