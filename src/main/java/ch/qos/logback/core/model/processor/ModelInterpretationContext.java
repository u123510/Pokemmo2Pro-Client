package ch.qos.logback.core.model.processor;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.joran.util.beans.BeanDescriptionCache;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.util.VariableSubstitutionsHelper;
import ch.qos.logback.core.spi.ContextAwarePropertyContainer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import java.util.function.Supplier;

public class ModelInterpretationContext extends ch.qos.logback.core.spi.ContextAwareBase implements ContextAwarePropertyContainer {
    Stack objectStack;
    Stack modelStack;
    Supplier configuratorSupplier;
    Map objectMap;
    protected VariableSubstitutionsHelper variableSubstitutionsHelper;
    protected Map importMap;
    private final BeanDescriptionCache beanDescriptionCache;
    final DefaultNestedComponentRegistry defaultNestedComponentRegistry;
    List dependencyDefinitionList;
    final List startedDependees;
    Object configuratorHint;
    Model topModel;

    protected ModelInterpretationContext() {
        this(new ch.qos.logback.core.ContextBase());
    }

    public ModelInterpretationContext(Context context) {
        this(context, null);
    }

    public ModelInterpretationContext(Context context, Object configuratorHint) {
        this.defaultNestedComponentRegistry = new DefaultNestedComponentRegistry();
        this.dependencyDefinitionList = new ArrayList();
        this.startedDependees = new ArrayList();
        this.context = context;
        this.configuratorHint = configuratorHint;
        this.objectStack = new Stack();
        this.modelStack = new Stack();
        this.beanDescriptionCache = new BeanDescriptionCache(context);
        this.objectMap = new HashMap(5);
        this.variableSubstitutionsHelper = new VariableSubstitutionsHelper(context);
        this.importMap = new HashMap(5);
    }

    public ModelInterpretationContext(ModelInterpretationContext context) {
        this(context.context, context.configuratorHint);
        this.importMap = new HashMap(context.importMap);
        this.variableSubstitutionsHelper = new VariableSubstitutionsHelper(context.context, context.getCopyOfPropertyMap());
        this.defaultNestedComponentRegistry.duplicate(context.getDefaultNestedComponentRegistry());
        createAppenderBags();
    }

    public Map getObjectMap() { return this.objectMap; }

    public void createAppenderBags() {
        this.objectMap.put("APPENDER_BAG", new HashMap());
        this.objectMap.put("APPENDER_REF_BAG", new HashMap());
    }

    public Model getTopModel() { return this.topModel; }
    public void setTopModel(Model model) { this.topModel = model; }
    public void pushModel(Model model) { this.modelStack.push(model); }
    public Model peekModel() { return (Model) this.modelStack.peek(); }
    public boolean isModelStackEmpty() { return this.modelStack.isEmpty(); }
    public Model popModel() { return (Model) this.modelStack.pop(); }
    public Stack getObjectStack() { return this.objectStack; }
    public boolean isObjectStackEmpty() { return this.objectStack.isEmpty(); }
    public Object peekObject() { return this.objectStack.peek(); }
    public void pushObject(Object object) { this.objectStack.push(object); }
    public Object popObject() { return this.objectStack.pop(); }
    public Object getObject(int index) { return this.objectStack.get(index); }
    public Object getConfiguratorHint() { return this.configuratorHint; }
    public void setConfiguratorHint(Object hint) { this.configuratorHint = hint; }
    public BeanDescriptionCache getBeanDescriptionCache() { return this.beanDescriptionCache; }
    public String subst(String value) { return this.variableSubstitutionsHelper.subst(value); }
    public DefaultNestedComponentRegistry getDefaultNestedComponentRegistry() { return this.defaultNestedComponentRegistry; }
    public void addDependencyDefinition(DependencyDefinition definition) { this.dependencyDefinitionList.add(definition); }
    public List getDependencyDefinitions() { return Collections.unmodifiableList(this.dependencyDefinitionList); }

    public List getDependeeNamesForModel(Model model) {
        ArrayList result = new ArrayList();
        for (Object value : this.dependencyDefinitionList) {
            DependencyDefinition definition = (DependencyDefinition) value;
            if (definition.getDepender() == model) {
                result.add(definition.getDependee());
            }
        }
        return result;
    }

    public boolean hasDependers(String dependeeName) {
        if (dependeeName == null || dependeeName.trim().length() == 0) {
            throw new IllegalArgumentException("Empty dependeeName name not allowed here");
        }
        for (Object value : this.dependencyDefinitionList) {
            if (((DependencyDefinition) value).dependee.equals(dependeeName)) {
                return true;
            }
        }
        return false;
    }

    public void markStartOfNamedDependee(String name) { this.startedDependees.add(name); }
    public boolean isNamedDependeeStarted(String name) { return this.startedDependees.contains(name); }
    public void addSubstitutionProperty(String key, String value) { this.variableSubstitutionsHelper.addSubstitutionProperty(key, value); }
    public String getProperty(String key) { return this.variableSubstitutionsHelper.getProperty(key); }
    public Map getCopyOfPropertyMap() { return this.variableSubstitutionsHelper.getCopyOfPropertyMap(); }
    public void addImport(String simpleName, String className) { this.importMap.put(simpleName, className); }
    public Map getImportMapCopy() { return new HashMap(this.importMap); }
    public String getImport(String simpleName) {
        if (simpleName == null) return null;
        String imported = (String) this.importMap.get(simpleName);
        return imported == null ? simpleName : imported;
    }
    public Supplier getConfiguratorSupplier() { return this.configuratorSupplier; }
    public void setConfiguratorSupplier(Supplier supplier) { this.configuratorSupplier = supplier; }
}
